// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ItemSetFragment$$ViewBinder<T extends com.newsblur.fragment.ItemSetFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230805, "field 'itemGrid'");
    target.itemGrid = finder.castView(view, 2131230805, "field 'itemGrid'");
    view = finder.findRequiredView(source, 2131231059, "field 'topProgressView'");
    target.topProgressView = finder.castView(view, 2131231059, "field 'topProgressView'");
    view = finder.findRequiredView(source, 2131230766, "field 'emptyView'");
    target.emptyView = view;
    view = finder.findRequiredView(source, 2131230769, "field 'emptyViewText'");
    target.emptyViewText = finder.castView(view, 2131230769, "field 'emptyViewText'");
    view = finder.findRequiredView(source, 2131230767, "field 'emptyViewImage'");
    target.emptyViewImage = finder.castView(view, 2131230767, "field 'emptyViewImage'");
  }

  @Override public void unbind(T target) {
    target.itemGrid = null;
    target.topProgressView = null;
    target.emptyView = null;
    target.emptyViewText = null;
    target.emptyViewImage = null;
  }
}
