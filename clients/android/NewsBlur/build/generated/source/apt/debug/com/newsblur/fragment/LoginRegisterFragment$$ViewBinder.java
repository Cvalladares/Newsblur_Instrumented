// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginRegisterFragment$$ViewBinder<T extends com.newsblur.fragment.LoginRegisterFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165293, "field 'username'");
    target.username = finder.castView(view, 2131165293, "field 'username'");
    view = finder.findRequiredView(source, 2131165289, "field 'password'");
    target.password = finder.castView(view, 2131165289, "field 'password'");
    view = finder.findRequiredView(source, 2131165436, "field 'register_username'");
    target.register_username = finder.castView(view, 2131165436, "field 'register_username'");
    view = finder.findRequiredView(source, 2131165435, "field 'register_password'");
    target.register_password = finder.castView(view, 2131165435, "field 'register_password'");
    view = finder.findRequiredView(source, 2131165434, "field 'register_email'");
    target.register_email = finder.castView(view, 2131165434, "field 'register_email'");
    view = finder.findRequiredView(source, 2131165294, "field 'viewSwitcher'");
    target.viewSwitcher = finder.castView(view, 2131165294, "field 'viewSwitcher'");
    view = finder.findRequiredView(source, 2131165282, "field 'customServer' and method 'showCustomServer'");
    target.customServer = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showCustomServer();
        }
      });
    view = finder.findRequiredView(source, 2131165283, "field 'customServerValue'");
    target.customServerValue = finder.castView(view, 2131165283, "field 'customServerValue'");
    view = finder.findRequiredView(source, 2131165278, "method 'logIn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.logIn();
        }
      });
    view = finder.findRequiredView(source, 2131165432, "method 'signUp'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.signUp();
        }
      });
    view = finder.findRequiredView(source, 2131165279, "method 'showLogin'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showLogin();
        }
      });
    view = finder.findRequiredView(source, 2131165280, "method 'showRegister'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showRegister();
        }
      });
    view = finder.findRequiredView(source, 2131165286, "method 'launchForgotPasswordPage'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.launchForgotPasswordPage();
        }
      });
  }

  @Override public void unbind(T target) {
    target.username = null;
    target.password = null;
    target.register_username = null;
    target.register_password = null;
    target.register_email = null;
    target.viewSwitcher = null;
    target.customServer = null;
    target.customServerValue = null;
  }
}
