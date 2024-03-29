# encoding: utf-8
import datetime
from south.db import db
from south.v2 import SchemaMigration
from django.db import models

class Migration(SchemaMigration):

    def forwards(self, orm):
        
        # Removing unique constraint on 'Story', fields ['story_feed', 'story_guid_hash']
        db.delete_unique('stories', ['story_feed_id', 'story_guid_hash'])

        # Deleting model 'Story'
        db.delete_table('stories')

        # Deleting model 'FeedFetchHistory'
        db.delete_table('rss_feeds_feedfetchhistory')

        # Deleting model 'PageFetchHistory'
        db.delete_table('rss_feeds_pagefetchhistory')

        # Changing field 'FeedData.feed'
        db.alter_column('rss_feeds_feeddata', 'feed_id', self.gf('utils.fields.AutoOneToOneField')(unique=True, to=orm['rss_feeds.Feed']))


    def backwards(self, orm):
        
        # Adding model 'Story'
        db.create_table('stories', (
            ('story_original_content', self.gf('utils.compressed_textfield.StoryField')(null=True, blank=True)),
            ('story_date', self.gf('django.db.models.fields.DateTimeField')()),
            ('story_guid_hash', self.gf('django.db.models.fields.CharField')(max_length=40)),
            ('story_feed', self.gf('django.db.models.fields.related.ForeignKey')(related_name='stories', to=orm['rss_feeds.Feed'])),
            ('story_title', self.gf('django.db.models.fields.CharField')(max_length=255)),
            ('story_permalink', self.gf('django.db.models.fields.CharField')(max_length=1000)),
            ('story_guid', self.gf('django.db.models.fields.CharField')(max_length=1000)),
            ('id', self.gf('django.db.models.fields.AutoField')(primary_key=True)),
            ('story_author', self.gf('django.db.models.fields.related.ForeignKey')(to=orm['rss_feeds.StoryAuthor'])),
            ('story_author_name', self.gf('django.db.models.fields.CharField')(max_length=500, null=True, blank=True)),
            ('story_past_trim_date', self.gf('django.db.models.fields.BooleanField')(default=False)),
            ('story_content_type', self.gf('django.db.models.fields.CharField')(max_length=255, null=True, blank=True)),
            ('story_tags', self.gf('django.db.models.fields.CharField')(max_length=2000, null=True, blank=True)),
            ('story_content', self.gf('utils.compressed_textfield.StoryField')(null=True, blank=True)),
        ))
        db.send_create_signal('rss_feeds', ['Story'])

        # Adding unique constraint on 'Story', fields ['story_feed', 'story_guid_hash']
        db.create_unique('stories', ['story_feed_id', 'story_guid_hash'])

        # Adding model 'FeedFetchHistory'
        db.create_table('rss_feeds_feedfetchhistory', (
            ('feed', self.gf('django.db.models.fields.related.ForeignKey')(related_name='feed_fetch_history', to=orm['rss_feeds.Feed'])),
            ('exception', self.gf('django.db.models.fields.TextField')(null=True, blank=True)),
            ('status_code', self.gf('django.db.models.fields.CharField')(max_length=10, null=True, blank=True)),
            ('fetch_date', self.gf('django.db.models.fields.DateTimeField')(auto_now=True, blank=True)),
            ('message', self.gf('django.db.models.fields.CharField')(max_length=255, null=True, blank=True)),
            ('id', self.gf('django.db.models.fields.AutoField')(primary_key=True)),
        ))
        db.send_create_signal('rss_feeds', ['FeedFetchHistory'])

        # Adding model 'PageFetchHistory'
        db.create_table('rss_feeds_pagefetchhistory', (
            ('feed', self.gf('django.db.models.fields.related.ForeignKey')(related_name='page_fetch_history', to=orm['rss_feeds.Feed'])),
            ('exception', self.gf('django.db.models.fields.TextField')(null=True, blank=True)),
            ('status_code', self.gf('django.db.models.fields.CharField')(max_length=10, null=True, blank=True)),
            ('fetch_date', self.gf('django.db.models.fields.DateTimeField')(auto_now=True, blank=True)),
            ('message', self.gf('django.db.models.fields.CharField')(max_length=255, null=True, blank=True)),
            ('id', self.gf('django.db.models.fields.AutoField')(primary_key=True)),
        ))
        db.send_create_signal('rss_feeds', ['PageFetchHistory'])

        # Changing field 'FeedData.feed'
        db.alter_column('rss_feeds_feeddata', 'feed_id', self.gf('django.db.models.fields.related.OneToOneField')(unique=True, to=orm['rss_feeds.Feed']))


    models = {
        'rss_feeds.duplicatefeed': {
            'Meta': {'object_name': 'DuplicateFeed'},
            'duplicate_address': ('django.db.models.fields.CharField', [], {'unique': 'True', 'max_length': '255'}),
            'duplicate_feed_id': ('django.db.models.fields.CharField', [], {'max_length': '255', 'null': 'True'}),
            'feed': ('django.db.models.fields.related.ForeignKey', [], {'related_name': "'duplicate_addresses'", 'to': "orm['rss_feeds.Feed']"}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'})
        },
        'rss_feeds.feed': {
            'Meta': {'ordering': "['feed_title']", 'object_name': 'Feed', 'db_table': "'feeds'"},
            'active': ('django.db.models.fields.BooleanField', [], {'default': 'True', 'db_index': 'True'}),
            'active_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1', 'db_index': 'True'}),
            'average_stories_per_month': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'creation': ('django.db.models.fields.DateField', [], {'auto_now_add': 'True', 'blank': 'True'}),
            'days_to_trim': ('django.db.models.fields.IntegerField', [], {'default': '90'}),
            'etag': ('django.db.models.fields.CharField', [], {'max_length': '255', 'null': 'True', 'blank': 'True'}),
            'exception_code': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'feed_address': ('django.db.models.fields.URLField', [], {'unique': 'True', 'max_length': '255'}),
            'feed_link': ('django.db.models.fields.URLField', [], {'default': "''", 'max_length': '1000', 'null': 'True', 'blank': 'True'}),
            'feed_title': ('django.db.models.fields.CharField', [], {'default': "''", 'max_length': '255', 'null': 'True', 'blank': 'True'}),
            'fetched_once': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'has_feed_exception': ('django.db.models.fields.BooleanField', [], {'default': 'False', 'db_index': 'True'}),
            'has_page_exception': ('django.db.models.fields.BooleanField', [], {'default': 'False', 'db_index': 'True'}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'last_load_time': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'last_modified': ('django.db.models.fields.DateTimeField', [], {'null': 'True', 'blank': 'True'}),
            'last_update': ('django.db.models.fields.DateTimeField', [], {'db_index': 'True'}),
            'min_to_decay': ('django.db.models.fields.IntegerField', [], {'default': '0'}),
            'next_scheduled_update': ('django.db.models.fields.DateTimeField', [], {'db_index': 'True'}),
            'num_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1'}),
            'premium_subscribers': ('django.db.models.fields.IntegerField', [], {'default': '-1'}),
            'queued_date': ('django.db.models.fields.DateTimeField', [], {'db_index': 'True'}),
            'stories_last_month': ('django.db.models.fields.IntegerField', [], {'default': '0'})
        },
        'rss_feeds.feeddata': {
            'Meta': {'object_name': 'FeedData'},
            'feed': ('utils.fields.AutoOneToOneField', [], {'related_name': "'data'", 'unique': 'True', 'to': "orm['rss_feeds.Feed']"}),
            'feed_tagline': ('django.db.models.fields.CharField', [], {'max_length': '1024', 'null': 'True', 'blank': 'True'}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'popular_authors': ('django.db.models.fields.CharField', [], {'max_length': '2048', 'null': 'True', 'blank': 'True'}),
            'popular_tags': ('django.db.models.fields.CharField', [], {'max_length': '1024', 'null': 'True', 'blank': 'True'}),
            'story_count_history': ('django.db.models.fields.TextField', [], {'null': 'True', 'blank': 'True'})
        },
        'rss_feeds.feedloadtime': {
            'Meta': {'object_name': 'FeedLoadtime'},
            'date_accessed': ('django.db.models.fields.DateTimeField', [], {'auto_now': 'True', 'blank': 'True'}),
            'feed': ('django.db.models.fields.related.ForeignKey', [], {'to': "orm['rss_feeds.Feed']"}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'loadtime': ('django.db.models.fields.FloatField', [], {})
        },
        'rss_feeds.feedpage': {
            'Meta': {'object_name': 'FeedPage'},
            'feed': ('django.db.models.fields.related.OneToOneField', [], {'related_name': "'feed_page'", 'unique': 'True', 'to': "orm['rss_feeds.Feed']"}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'page_data': ('utils.compressed_textfield.StoryField', [], {'null': 'True', 'blank': 'True'})
        },
        'rss_feeds.feedupdatehistory': {
            'Meta': {'object_name': 'FeedUpdateHistory'},
            'average_per_feed': ('django.db.models.fields.DecimalField', [], {'max_digits': '4', 'decimal_places': '1'}),
            'fetch_date': ('django.db.models.fields.DateTimeField', [], {'auto_now': 'True', 'blank': 'True'}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'number_of_feeds': ('django.db.models.fields.IntegerField', [], {}),
            'seconds_taken': ('django.db.models.fields.IntegerField', [], {})
        },
        'rss_feeds.feedxml': {
            'Meta': {'object_name': 'FeedXML'},
            'feed': ('django.db.models.fields.related.OneToOneField', [], {'related_name': "'feed_xml'", 'unique': 'True', 'to': "orm['rss_feeds.Feed']"}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'rss_xml': ('utils.compressed_textfield.StoryField', [], {'null': 'True', 'blank': 'True'})
        },
        'rss_feeds.storyauthor': {
            'Meta': {'object_name': 'StoryAuthor'},
            'author_name': ('django.db.models.fields.CharField', [], {'max_length': '255', 'null': 'True', 'blank': 'True'}),
            'feed': ('django.db.models.fields.related.ForeignKey', [], {'to': "orm['rss_feeds.Feed']"}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'})
        },
        'rss_feeds.tag': {
            'Meta': {'object_name': 'Tag'},
            'feed': ('django.db.models.fields.related.ForeignKey', [], {'to': "orm['rss_feeds.Feed']"}),
            'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'name': ('django.db.models.fields.CharField', [], {'max_length': '255'})
        }
    }

    complete_apps = ['rss_feeds']
