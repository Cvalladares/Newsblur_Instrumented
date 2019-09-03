// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReadingItemFragment$$ViewBinder<T extends com.newsblur.fragment.ReadingItemFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165428, "field 'web'");
    target.web = finder.castView(view, 2131165428, "field 'web'");
    view = finder.findRequiredView(source, 2131165229, "field 'webviewCustomViewLayout'");
    target.webviewCustomViewLayout = finder.castView(view, 2131165229, "field 'webviewCustomViewLayout'");
    view = finder.findRequiredView(source, 2131165421, "field 'fragmentScrollview'");
    target.fragmentScrollview = finder.castView(view, 2131165421, "field 'fragmentScrollview'");
    view = finder.findRequiredView(source, 2131165409, "field 'itemTitle'");
    target.itemTitle = finder.castView(view, 2131165409, "field 'itemTitle'");
    view = finder.findRequiredView(source, 2131165406, "field 'itemAuthors'");
    target.itemAuthors = finder.castView(view, 2131165406, "field 'itemAuthors'");
    view = finder.findRequiredView(source, 2131165399, "field 'itemFeed'");
    target.itemFeed = finder.castView(view, 2131165399, "field 'itemFeed'");
    view = finder.findRequiredView(source, 2131165408, "field 'tagContainer'");
    target.tagContainer = finder.castView(view, 2131165408, "field 'tagContainer'");
    view = finder.findRequiredView(source, 2131165426, "field 'textViewLoadingMsg'");
    target.textViewLoadingMsg = finder.castView(view, 2131165426, "field 'textViewLoadingMsg'");
    view = finder.findRequiredView(source, 2131165427, "field 'textViewLoadingFailedMsg'");
    target.textViewLoadingFailedMsg = finder.castView(view, 2131165427, "field 'textViewLoadingFailedMsg'");
    view = finder.findRequiredView(source, 2131165483, "field 'saveButton' and method 'clickSave'");
    target.saveButton = finder.castView(view, 2131165483, "field 'saveButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickSave();
        }
      });
    view = finder.findRequiredView(source, 2131165485, "field 'shareButton' and method 'clickShare'");
    target.shareButton = finder.castView(view, 2131165485, "field 'shareButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickShare();
        }
      });
    view = finder.findRequiredView(source, 2131165488, "field 'menuButton' and method 'onClickMenuButton'");
    target.menuButton = finder.castView(view, 2131165488, "field 'menuButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickMenuButton();
        }
      });
  }

  @Override public void unbind(T target) {
    target.web = null;
    target.webviewCustomViewLayout = null;
    target.fragmentScrollview = null;
    target.itemTitle = null;
    target.itemAuthors = null;
    target.itemFeed = null;
    target.tagContainer = null;
    target.textViewLoadingMsg = null;
    target.textViewLoadingFailedMsg = null;
    target.saveButton = null;
    target.shareButton = null;
    target.menuButton = null;
  }
}
