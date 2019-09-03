// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryIntelTrainerFragment$$ViewBinder<T extends com.newsblur.fragment.StoryIntelTrainerFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165260, "field 'headerTags'");
    target.headerTags = finder.castView(view, 2131165260, "field 'headerTags'");
    view = finder.findRequiredView(source, 2131165254, "field 'headerAuthor'");
    target.headerAuthor = finder.castView(view, 2131165254, "field 'headerAuthor'");
    view = finder.findRequiredView(source, 2131165265, "field 'titleSelection'");
    target.titleSelection = finder.castView(view, 2131165265, "field 'titleSelection'");
    view = finder.findRequiredView(source, 2131165264, "field 'titleLikeButton'");
    target.titleLikeButton = finder.castView(view, 2131165264, "field 'titleLikeButton'");
    view = finder.findRequiredView(source, 2131165262, "field 'titleDislikeButton'");
    target.titleDislikeButton = finder.castView(view, 2131165262, "field 'titleDislikeButton'");
    view = finder.findRequiredView(source, 2131165261, "field 'titleClearButton'");
    target.titleClearButton = finder.castView(view, 2131165261, "field 'titleClearButton'");
    view = finder.findRequiredView(source, 2131165238, "field 'titleRowsContainer'");
    target.titleRowsContainer = finder.castView(view, 2131165238, "field 'titleRowsContainer'");
    view = finder.findRequiredView(source, 2131165237, "field 'tagRowsContainer'");
    target.tagRowsContainer = finder.castView(view, 2131165237, "field 'tagRowsContainer'");
    view = finder.findRequiredView(source, 2131165235, "field 'authorRowsContainer'");
    target.authorRowsContainer = finder.castView(view, 2131165235, "field 'authorRowsContainer'");
    view = finder.findRequiredView(source, 2131165236, "field 'feedRowsContainer'");
    target.feedRowsContainer = finder.castView(view, 2131165236, "field 'feedRowsContainer'");
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
