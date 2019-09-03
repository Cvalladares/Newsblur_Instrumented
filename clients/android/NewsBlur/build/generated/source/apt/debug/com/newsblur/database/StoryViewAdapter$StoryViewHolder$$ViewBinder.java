// Generated code from Butter Knife. Do not modify!
package com.newsblur.database;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryViewAdapter$StoryViewHolder$$ViewBinder<T extends com.newsblur.database.StoryViewAdapter.StoryViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165492, "field 'leftBarOne'");
    target.leftBarOne = view;
    view = finder.findRequiredView(source, 2131165493, "field 'leftBarTwo'");
    target.leftBarTwo = view;
    view = finder.findRequiredView(source, 2131165496, "field 'intelDot'");
    target.intelDot = finder.castView(view, 2131165496, "field 'intelDot'");
    view = finder.findRequiredView(source, 2131165500, "field 'thumbView'");
    target.thumbView = finder.castView(view, 2131165500, "field 'thumbView'");
    view = finder.findRequiredView(source, 2131165494, "field 'feedIconView'");
    target.feedIconView = finder.castView(view, 2131165494, "field 'feedIconView'");
    view = finder.findRequiredView(source, 2131165495, "field 'feedTitleView'");
    target.feedTitleView = finder.castView(view, 2131165495, "field 'feedTitleView'");
    view = finder.findRequiredView(source, 2131165501, "field 'storyTitleView'");
    target.storyTitleView = finder.castView(view, 2131165501, "field 'storyTitleView'");
    view = finder.findRequiredView(source, 2131165491, "field 'storyDate'");
    target.storyDate = finder.castView(view, 2131165491, "field 'storyDate'");
    view = finder.findRequiredView(source, 2131165498, "field 'savedView'");
    target.savedView = view;
    view = finder.findRequiredView(source, 2131165499, "field 'sharedView'");
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
