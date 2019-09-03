// Generated by CoffeeScript 1.8.0
(function() {
  var DB_PATH, DEV, app, busboy, fs, mkdirp, path, server, splitFeedId;

  app = require('express')();

  server = require('http').Server(app);

  path = require('path');

  busboy = require('connect-busboy');

  fs = require('fs');

  mkdirp = require('mkdirp');

  DEV = process.env.NODE_ENV === 'development';

  DB_PATH = DEV ? 'originals' : '/srv/originals';

  server.listen(3060);

  app.use(busboy());

  app.get(/^\/original_page\/(\d+)\/?/, (function(_this) {
    return function(req, res) {
      var etag, feedId, feedIdDir, filePath, lastModified;
      feedId = parseInt(req.params[0], 10);
      etag = req.header('If-None-Match');
      lastModified = req.header('If-Modified-Since');
      feedIdDir = splitFeedId(feedId);
      filePath = "" + DB_PATH + "/" + feedIdDir + ".zhtml";
      return fs.exists(filePath, function(exists, err) {
        console.log((" ---> Loading: " + feedId + " (" + filePath + "). ") + ("" + (exists ? "" : "NOT FOUND")));
        if (!exists) {
          return res.send(404);
        }
        return fs.stat(filePath, function(err, stats) {
          if (!err && etag && stats.mtime === etag) {
            return res.send(304);
          }
          if (!err && lastModified && stats.mtime === lastModified) {
            return res.send(304);
          }
          return fs.readFile(filePath, function(err, content) {
            res.header('Etag', Date.parse(stats.mtime));
            return res.send(content);
          });
        });
      });
    };
  })(this));

  app.post(/^\/original_page\/(\d+)\/?/, (function(_this) {
    return function(req, res) {
      var feedId, feedIdDir;
      feedId = parseInt(req.params[0], 10);
      feedIdDir = splitFeedId(feedId);
      req.pipe(req.busboy);
      return req.busboy.on('file', function(fieldname, file, filename) {
        var filePath, filePathDir;
        filePath = "" + DB_PATH + "/" + feedIdDir + ".zhtml";
        filePathDir = path.dirname(filePath);
        return mkdirp(filePathDir, function(err) {
          var fstream;
          if (err) {
            console.log(err);
          }
          fstream = fs.createWriteStream(filePath);
          file.pipe(fstream);
          return fstream.on('close', function() {
            return fs.stat(filePath, function(err, stats) {
              if (err) {
                console.log(err);
              }
              console.log(" ---> Saving: " + feedId + " (" + filePath + ") " + stats.size + " bytes");
              return res.send("OK");
            });
          });
        });
      });
    };
  })(this));

  splitFeedId = function(feedId) {
    var rgx;
    feedId += '';
    rgx = /(\d+)(\d{3})/;
    while (rgx.test(feedId)) {
      feedId = feedId.replace(rgx, '$1' + '/' + '$2');
    }
    return feedId;
  };

  console.log(" ---> Starting Original Page server " + (DEV ? "on DEV" : "in production"));

}).call(this);
