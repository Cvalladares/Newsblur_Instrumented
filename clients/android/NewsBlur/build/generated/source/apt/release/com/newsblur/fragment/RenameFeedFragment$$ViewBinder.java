// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RenameFeedFragment$$ViewBinder<T extends com.newsblur.fragment.RenameFeedFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230775, "field 'feedNameView'");
    target.feedNameView = finder.castView(view, 2131230775, "field 'feedNameView'");
  }

  @Override public void unbind(T target) {
    target.feedNameView = null;
  }
}
