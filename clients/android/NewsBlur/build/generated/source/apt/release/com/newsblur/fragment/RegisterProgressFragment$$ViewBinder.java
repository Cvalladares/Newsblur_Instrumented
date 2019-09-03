// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegisterProgressFragment$$ViewBinder<T extends com.newsblur.fragment.RegisterProgressFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230965, "field 'switcher'");
    target.switcher = finder.castView(view, 2131230965, "field 'switcher'");
    view = finder.findRequiredView(source, 2131230966, "field 'next' and method 'next'");
    target.next = finder.castView(view, 2131230966, "field 'next'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.next();
        }
      });
    view = finder.findRequiredView(source, 2131230967, "field 'registerProgressLogo'");
    target.registerProgressLogo = finder.castView(view, 2131230967, "field 'registerProgressLogo'");
  }

  @Override public void unbind(T target) {
    target.switcher = null;
    target.next = null;
    target.registerProgressLogo = null;
  }
}
