// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReadFilterDialogFragment$$ViewBinder<T extends com.newsblur.fragment.ReadFilterDialogFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230921, "field 'allButton' and method 'selectAll'");
    target.allButton = finder.castView(view, 2131230921, "field 'allButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectAll();
        }
      });
    view = finder.findRequiredView(source, 2131230931, "field 'unreadButton' and method 'selectUnread'");
    target.unreadButton = finder.castView(view, 2131230931, "field 'unreadButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectUnread();
        }
      });
  }

  @Override public void unbind(T target) {
    target.allButton = null;
    target.unreadButton = null;
  }
}
