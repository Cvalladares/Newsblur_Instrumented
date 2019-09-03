// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReadingPagerFragment$$ViewBinder<T extends com.newsblur.fragment.ReadingPagerFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165417, "field 'pager'");
    target.pager = finder.castView(view, 2131165417, "field 'pager'");
  }

  @Override public void unbind(T target) {
    target.pager = null;
  }
}
