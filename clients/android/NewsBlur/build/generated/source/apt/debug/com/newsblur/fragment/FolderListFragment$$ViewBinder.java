// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FolderListFragment$$ViewBinder<T extends com.newsblur.fragment.FolderListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165246, "field 'list'");
    target.list = finder.castView(view, 2131165246, "field 'list'");
  }

  @Override public void unbind(T target) {
    target.list = null;
  }
}
