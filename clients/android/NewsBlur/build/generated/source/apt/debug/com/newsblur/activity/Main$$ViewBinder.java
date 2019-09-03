// Generated code from Butter Knife. Do not modify!
package com.newsblur.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Main$$ViewBinder<T extends com.newsblur.activity.Main> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165298, "field 'overlayStatusText'");
    target.overlayStatusText = finder.castView(view, 2131165298, "field 'overlayStatusText'");
    view = finder.findRequiredView(source, 2131165231, "field 'emptyViewImage'");
    target.emptyViewImage = finder.castView(view, 2131165231, "field 'emptyViewImage'");
    view = finder.findRequiredView(source, 2131165233, "field 'emptyViewText'");
    target.emptyViewText = finder.castView(view, 2131165233, "field 'emptyViewText'");
    view = finder.findRequiredView(source, 2131165296, "field 'menuButton' and method 'onClickMenuButton'");
    target.menuButton = finder.castView(view, 2131165296, "field 'menuButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickMenuButton();
        }
      });
    view = finder.findRequiredView(source, 2131165304, "field 'userImage' and method 'onClickUserButton'");
    target.userImage = finder.castView(view, 2131165304, "field 'userImage'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickUserButton();
        }
      });
    view = finder.findRequiredView(source, 2131165305, "field 'userName'");
    target.userName = finder.castView(view, 2131165305, "field 'userName'");
    view = finder.findRequiredView(source, 2131165301, "field 'unreadCountNeutText'");
    target.unreadCountNeutText = finder.castView(view, 2131165301, "field 'unreadCountNeutText'");
    view = finder.findRequiredView(source, 2131165303, "field 'unreadCountPosiText'");
    target.unreadCountPosiText = finder.castView(view, 2131165303, "field 'unreadCountPosiText'");
    view = finder.findRequiredView(source, 2131165241, "field 'searchQueryInput'");
    target.searchQueryInput = finder.castView(view, 2131165241, "field 'searchQueryInput'");
    view = finder.findRequiredView(source, 2131165295, "method 'onClickAddButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickAddButton();
        }
      });
    view = finder.findRequiredView(source, 2131165297, "method 'onClickProfileButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickProfileButton();
        }
      });
  }

  @Override public void unbind(T target) {
    target.overlayStatusText = null;
    target.emptyViewImage = null;
    target.emptyViewText = null;
    target.menuButton = null;
    target.userImage = null;
    target.userName = null;
    target.unreadCountNeutText = null;
    target.unreadCountPosiText = null;
    target.searchQueryInput = null;
  }
}
