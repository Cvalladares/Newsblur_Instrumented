// Generated code from Butter Knife. Do not modify!
package com.newsblur.database;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryViewAdapter$FooterViewHolder$$ViewBinder<T extends com.newsblur.database.StoryViewAdapter.FooterViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165247, "field 'innerView'");
    target.innerView = finder.castView(view, 2131165247, "field 'innerView'");
  }

  @Override public void unbind(T target) {
    target.innerView = null;
  }
}
