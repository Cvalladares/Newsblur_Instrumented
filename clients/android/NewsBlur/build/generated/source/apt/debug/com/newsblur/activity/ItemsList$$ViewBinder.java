// Generated code from Butter Knife. Do not modify!
package com.newsblur.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ItemsList$$ViewBinder<T extends com.newsblur.activity.ItemsList> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165272, "field 'overlayStatusText'");
    target.overlayStatusText = finder.castView(view, 2131165272, "field 'overlayStatusText'");
    view = finder.findRequiredView(source, 2131165271, "field 'searchQueryInput'");
    target.searchQueryInput = finder.castView(view, 2131165271, "field 'searchQueryInput'");
  }

  @Override public void unbind(T target) {
    target.overlayStatusText = null;
    target.searchQueryInput = null;
  }
}
