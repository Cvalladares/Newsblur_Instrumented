// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryIntelTrainerFragment$$ViewBinder<T extends com.newsblur.fragment.StoryIntelTrainerFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230796, "field 'headerTags'");
    target.headerTags = finder.castView(view, 2131230796, "field 'headerTags'");
    view = finder.findRequiredView(source, 2131230790, "field 'headerAuthor'");
    target.headerAuthor = finder.castView(view, 2131230790, "field 'headerAuthor'");
    view = finder.findRequiredView(source, 2131230801, "field 'titleSelection'");
    target.titleSelection = finder.castView(view, 2131230801, "field 'titleSelection'");
    view = finder.findRequiredView(source, 2131230800, "field 'titleLikeButton'");
    target.titleLikeButton = finder.castView(view, 2131230800, "field 'titleLikeButton'");
    view = finder.findRequiredView(source, 2131230798, "field 'titleDislikeButton'");
    target.titleDislikeButton = finder.castView(view, 2131230798, "field 'titleDislikeButton'");
    view = finder.findRequiredView(source, 2131230797, "field 'titleClearButton'");
    target.titleClearButton = finder.castView(view, 2131230797, "field 'titleClearButton'");
    view = finder.findRequiredView(source, 2131230774, "field 'titleRowsContainer'");
    target.titleRowsContainer = finder.castView(view, 2131230774, "field 'titleRowsContainer'");
    view = finder.findRequiredView(source, 2131230773, "field 'tagRowsContainer'");
    target.tagRowsContainer = finder.castView(view, 2131230773, "field 'tagRowsContainer'");
    view = finder.findRequiredView(source, 2131230771, "field 'authorRowsContainer'");
    target.authorRowsContainer = finder.castView(view, 2131230771, "field 'authorRowsContainer'");
    view = finder.findRequiredView(source, 2131230772, "field 'feedRowsContainer'");
    target.feedRowsContainer = finder.castView(view, 2131230772, "field 'feedRowsContainer'");
  }

  @Override public void unbind(T target) {
    target.headerTags = null;
    target.headerAuthor = null;
    target.titleSelection = null;
    target.titleLikeButton = null;
    target.titleDislikeButton = null;
    target.titleClearButton = null;
    target.titleRowsContainer = null;
    target.tagRowsContainer = null;
    target.authorRowsContainer = null;
    target.feedRowsContainer = null;
  }
}
