// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ItemSetFragment$$ViewBinder<T extends com.newsblur.fragment.ItemSetFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165269, "field 'itemGrid'");
    target.itemGrid = finder.castView(view, 2131165269, "field 'itemGrid'");
    view = finder.findRequiredView(source, 2131165525, "field 'topProgressView'");
    target.topProgressView = finder.castView(view, 2131165525, "field 'topProgressView'");
    view = finder.findRequiredView(source, 2131165230, "field 'emptyView'");
    target.emptyView = view;
    view = finder.findRequiredView(source, 2131165233, "field 'emptyViewText'");
    target.emptyViewText = finder.castView(view, 2131165233, "field 'emptyViewText'");
    view = finder.findRequiredView(source, 2131165231, "field 'emptyViewImage'");
    target.emptyViewImage = finder.castView(view, 2131165231, "field 'emptyViewImage'");
  }

  @Override public void unbind(T target) {
    target.itemGrid = null;
    target.topProgressView = null;
    target.emptyView = null;
    target.emptyViewText = null;
    target.emptyViewImage = null;
  }
}
