// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StoryOrderDialogFragment$$ViewBinder<T extends com.newsblur.fragment.StoryOrderDialogFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165390, "field 'newestButton' and method 'selectNewest'");
    target.newestButton = finder.castView(view, 2131165390, "field 'newestButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectNewest();
        }
      });
    view = finder.findRequiredView(source, 2131165393, "field 'oldestButton' and method 'selectOldest'");
    target.oldestButton = finder.castView(view, 2131165393, "field 'oldestButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectOldest();
        }
      });
  }

  @Override public void unbind(T target) {
    target.newestButton = null;
    target.oldestButton = null;
  }
}
