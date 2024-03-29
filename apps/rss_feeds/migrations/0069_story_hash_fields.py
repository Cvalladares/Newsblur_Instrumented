# -*- coding: utf-8 -*-
from south.v2 import DataMigration
from django.contrib.auth.models import User
from django.conf import settings
import pymongo

class Migration(DataMigration):

    def forwards(self, orm):
        from apps.rss_feeds.models import MStarredStory
        from apps.social.models import MSharedStory
        db = settings.MONGODB

        starred_count = MStarredStory.objects.count()
        print " ---> Saving %s starred stories..." % starred_count
        shared_count = MSharedStory.objects.count()
        print " ---> Saving %s shared stories..." % shared_count

        start = 0
        user_count = User.objects.latest('pk').pk
        for user_id in xrange(start, user_count):
            if user_id % 1000 == 0:
                print " ---> %s/%s" % (user_id, user_count)

            stories = MStarredStory.objects(user_id=user_id, story_hash__exists=False)\
                                .only('id', 'story_feed_id', 'story_guid')\
                                .read_preference(
                                    pymongo.ReadPreference.SECONDARY
                                )
            for i, story in enumerate(stories):
                
                db.newsblur.starred_stories.update({"_id": story.id}, {"$set": {
                    "story_hash": story.feed_guid_hash
                }})
            stories = MSharedStory.objects(user_id=user_id, story_hash__exists=False)\
                                .only('id', 'user_id', 'story_feed_id', 'story_guid')\
                                .read_preference(
                                    pymongo.ReadPreference.SECONDARY
                                )
            for i, story in enumerate(stories):
                db.newsblur.shared_stories.update({"_id": story.id}, {"$set": {
                    "story_hash": story.feed_guid_hash
                }})
        

    def backwards(self, orm):
        "Write your backwards methods here."

    models = {
        u'rss_feeds.duplicatefeed': {
            'Meta': {'object_name': 'DuplicateFeed'},
            'duplicate_address': ('django.db.models.fields.CharField', [], {'max_length': '764', 'db_index': 'True'}),
            'duplicate_feed_id': ('django.db.models.fields.CharField', [], {'max_length': '255', 'null': 'True', 'db_index': 'True'}),
            'duplicate_link': ('django.db.models.fields.CharField', [], {'max_length': '764', 'null': 'True', 'db_index': 'True'}),
            'feed': ('django.db.models.fields.related.ForeignKey', [], {'related_name': "'duplicate_addresses'", 'to': u"orm['rss_feeds.Feed']"}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'})
        },
        u'rss_feeds.feed': {
            'Meta': {'ordering': "['feed_title']", 'object_name': 'Feed', 'db_table': "'feeds'"},
            'active': ('django.db.models.fields.BooleanField', [], {'default': 'True', 'db_index': 'True'}),
            'active_premium_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1'}),
            'active_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1', 'db_index': 'True'}),
            'average_stories_per_month': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'branch_from_feed': ('django.db.models.fields.related.ForeignKey', [], {'to': u"orm['rss_feeds.Feed']", 'null': 'True', 'blank': 'True'}),
            'creation': ('django.db.models.fields.DateField', [], {'auto_now_add': 'True', 'blank': 'True'}),
            'days_to_trim': ('django.db.models.fields.IntegerField', [], {'default': '90'}),
            'errors_since_good': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'etag': ('django.db.models.fields.CharField', [], {'max_length': '255', 'null': 'True', 'blank': 'True'}),
            'exception_code': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'favicon_color': ('django.db.models.fields.CharField', [], {'max_length': '6', 'null': 'True', 'blank': 'True'}),
            'favicon_not_found': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'feed_address': ('django.db.models.fields.URLField', [], {'max_length': '764', 'db_index': 'True'}),
            'feed_address_locked': ('django.db.models.fields.NullBooleanField', [], {'default': 'False', 'null': 'True', 'blank': 'True'}),
            'feed_link': ('django.db.models.fields.URLField', [], {'default': "''", 'max_length': '1000', 'null': 'True', 'blank': 'True'}),
            'feed_link_locked': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'feed_title': ('django.db.models.fields.CharField', [], {'default': "'[Untitled]'", 'max_length': '255', 'null': 'True', 'blank': 'True'}),
            'fetched_once': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'has_feed_exception': ('django.db.models.fields.BooleanField', [], {'default': 'False', 'db_index': 'True'}),
            'has_page': ('django.db.models.fields.BooleanField', [], {'default': 'True'}),
            'has_page_exception': ('django.db.models.fields.BooleanField', [], {'default': 'False', 'db_index': 'True'}),
            'hash_address_and_link': ('django.db.models.fields.CharField', [], {'unique': 'True', 'max_length': '64'}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'is_push': ('django.db.models.fields.NullBooleanField', [], {'default': 'False', 'null': 'True', 'blank': 'True'}),
            'known_good': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'last_load_time': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'last_modified': ('django.db.models.fields.DateTimeField', [], {'null': 'True', 'blank': 'True'}),
            'last_story_date': ('django.db.models.fields.DateTimeField', [], {'null': 'True', 'blank': 'True'}),
            'last_update': ('django.db.models.fields.DateTimeField', [], {'db_index': 'True'}),
            'min_to_decay': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'next_scheduled_update': ('django.db.models.fields.DateTimeField', [], {}),
            'num_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1'}),
            'premium_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1'}),
            's3_icon': ('django.db.models.fields.NullBooleanField', [], {'default': 'False', 'null': 'True', 'blank': 'True'}),
            's3_page': ('django.db.models.fields.NullBooleanField', [], {'default': 'False', 'null': 'True', 'blank': 'True'}),
            'stories_last_month': ('django.db.models.fields.IntegerField', [], {'default': '0'})
        },
        u'rss_feeds.feeddata': {
            'Meta': {'object_name': 'FeedData'},
            'feed': ('utils.fields.AutoOneToOneField', [], {'related_name': "'data'", 'unique': 'True', 'to': u"orm['rss_feeds.Feed']"}),
            'feed_classifier_counts': ('django.db.models.fields.TextField', [], {'null': 'True', 'blank': 'True'}),
            'feed_tagline': ('django.db.models.fields.CharField', [], {'max_length': '1024', 'null': 'True', 'blank': 'True'}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'popular_authors': ('django.db.models.fields.CharField', [], {'max_length': '2048', 'null': 'True', 'blank': 'True'}),
            'popular_tags': ('django.db.models.fields.CharField', [], {'max_length': '1024', 'null': 'True', 'blank': 'True'}),
            'story_count_history': ('django.db.models.fields.TextField', [], {'null': 'True', 'blank': 'True'})
        }
    }

    complete_apps = ['rss_feeds']
    symmetrical = True
