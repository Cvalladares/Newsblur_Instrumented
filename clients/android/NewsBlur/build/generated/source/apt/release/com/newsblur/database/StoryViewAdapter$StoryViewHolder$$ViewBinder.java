// Generated code from Butter Knife. Do not modify!
package com.newsblur.database;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryViewAdapter$StoryViewHolder$$ViewBinder<T extends com.newsblur.database.StoryViewAdapter.StoryViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231028, "field 'leftBarOne'");
    target.leftBarOne = view;
    view = finder.findRequiredView(source, 2131231029, "field 'leftBarTwo'");
    target.leftBarTwo = view;
    view = finder.findRequiredView(source, 2131231032, "field 'intelDot'");
    target.intelDot = finder.castView(view, 2131231032, "field 'intelDot'");
    view = finder.findRequiredView(source, 2131231036, "field 'thumbView'");
    target.thumbView = finder.castView(view, 2131231036, "field 'thumbView'");
    view = finder.findRequiredView(source, 2131231030, "field 'feedIconView'");
    target.feedIconView = finder.castView(view, 2131231030, "field 'feedIconView'");
    view = finder.findRequiredView(source, 2131231031, "field 'feedTitleView'");
    target.feedTitleView = finder.castView(view, 2131231031, "field 'feedTitleView'");
    view = finder.findRequiredView(source, 2131231037, "field 'storyTitleView'");
    target.storyTitleView = finder.castView(view, 2131231037, "field 'storyTitleView'");
    view = finder.findRequiredView(source, 2131231027, "field 'storyDate'");
    target.storyDate = finder.castView(view, 2131231027, "field 'storyDate'");
    view = finder.findRequiredView(source, 2131231034, "field 'savedView'");
    target.savedView = view;
    view = finder.findRequiredView(source, 2131231035, "field 'sharedView'");
    target.sharedView = view;
  }

  @Override public void unbind(T target) {
    target.leftBarOne = null;
    target.leftBarTwo = null;
    target.intelDot = null;
    target.thumbView = null;
    target.feedIconView = null;
    target.feedTitleView = null;
    target.storyTitleView = null;
    target.storyDate = null;
    target.savedView = null;
    target.sharedView = null;
  }
}
