// Generated code from Butter Knife. Do not modify!
package com.newsblur.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddFeedExternal$$ViewBinder<T extends com.newsblur.activity.AddFeedExternal> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230812, "field 'progressView'");
    target.progressView = finder.castView(view, 2131230812, "field 'progressView'");
    view = finder.findRequiredView(source, 2131230915, "field 'progressText'");
    target.progressText = finder.castView(view, 2131230915, "field 'progressText'");
  }

  @Override public void unbind(T target) {
    target.progressView = null;
    target.progressText = null;
  }
}
