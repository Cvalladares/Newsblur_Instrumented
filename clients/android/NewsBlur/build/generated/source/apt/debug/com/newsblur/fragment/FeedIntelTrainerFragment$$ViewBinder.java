// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FeedIntelTrainerFragment$$ViewBinder<T extends com.newsblur.fragment.FeedIntelTrainerFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165263, "field 'headerTitles'");
    target.headerTitles = finder.castView(view, 2131165263, "field 'headerTitles'");
    view = finder.findRequiredView(source, 2131165260, "field 'headerTags'");
    target.headerTags = finder.castView(view, 2131165260, "field 'headerTags'");
    view = finder.findRequiredView(source, 2131165254, "field 'headerAuthor'");
    target.headerAuthor = finder.castView(view, 2131165254, "field 'headerAuthor'");
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
    target.headerTitles = null;
    target.headerTags = null;
    target.headerAuthor = null;
    target.titleRowsContainer = null;
    target.tagRowsContainer = null;
    target.authorRowsContainer = null;
    target.feedRowsContainer = null;
  }
}
