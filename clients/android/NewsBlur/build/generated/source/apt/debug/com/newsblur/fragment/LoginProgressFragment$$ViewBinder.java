// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginProgressFragment$$ViewBinder<T extends com.newsblur.fragment.LoginProgressFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165287, "field 'updateStatus'");
    target.updateStatus = finder.castView(view, 2131165287, "field 'updateStatus'");
    view = finder.findRequiredView(source, 2131165292, "field 'retrievingFeeds'");
    target.retrievingFeeds = finder.castView(view, 2131165292, "field 'retrievingFeeds'");
    view = finder.findRequiredView(source, 2131165290, "field 'loginProfilePicture'");
    target.loginProfilePicture = finder.castView(view, 2131165290, "field 'loginProfilePicture'");
    view = finder.findRequiredView(source, 2131165284, "field 'feedProgress'");
    target.feedProgress = finder.castView(view, 2131165284, "field 'feedProgress'");
    view = finder.findRequiredView(source, 2131165288, "field 'loggingInProgress'");
    target.loggingInProgress = finder.castView(view, 2131165288, "field 'loggingInProgress'");
  }

  @Override public void unbind(T target) {
    target.updateStatus = null;
    target.retrievingFeeds = null;
    target.loginProfilePicture = null;
    target.feedProgress = null;
    target.loggingInProgress = null;
  }
}
