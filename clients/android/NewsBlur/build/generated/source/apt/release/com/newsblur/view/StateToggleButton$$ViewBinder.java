// Generated code from Butter Knife. Do not modify!
package com.newsblur.view;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StateToggleButton$$ViewBinder<T extends com.newsblur.view.StateToggleButton> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231046, "field 'allButton' and method 'onClickToggle'");
    target.allButton = finder.castView(view, 2131231046, "field 'allButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickToggle(p0);
        }
      });
    view = finder.findRequiredView(source, 2131231047, "field 'allButtonIcon'");
    target.allButtonIcon = view;
    view = finder.findRequiredView(source, 2131231048, "field 'allButtonText'");
    target.allButtonText = view;
    view = finder.findRequiredView(source, 2131231055, "field 'someButton' and method 'onClickToggle'");
    target.someButton = finder.castView(view, 2131231055, "field 'someButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickToggle(p0);
        }
      });
    view = finder.findRequiredView(source, 2131231056, "field 'someButtonIcon'");
    target.someButtonIcon = view;
    view = finder.findRequiredView(source, 2131231057, "field 'someButtonText'");
    target.someButtonText = view;
    view = finder.findRequiredView(source, 2131231049, "field 'focusButton' and method 'onClickToggle'");
    target.focusButton = finder.castView(view, 2131231049, "field 'focusButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickToggle(p0);
        }
      });
    view = finder.findRequiredView(source, 2131231050, "field 'focusButtonIcon'");
    target.focusButtonIcon = view;
    view = finder.findRequiredView(source, 2131231051, "field 'focusButtonText'");
    target.focusButtonText = view;
    view = finder.findRequiredView(source, 2131231052, "field 'savedButton' and method 'onClickToggle'");
    target.savedButton = finder.castView(view, 2131231052, "field 'savedButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickToggle(p0);
        }
      });
    view = finder.findRequiredView(source, 2131231053, "field 'savedButtonIcon'");
    target.savedButtonIcon = view;
    view = finder.findRequiredView(source, 2131231054, "field 'savedButtonText'");
    target.savedButtonText = view;
  }

  @Override public void unbind(T target) {
    target.allButton = null;
    target.allButtonIcon = null;
    target.allButtonText = null;
    target.someButton = null;
    target.someButtonIcon = null;
    target.someButtonText = null;
    target.focusButton = null;
    target.focusButtonIcon = null;
    target.focusButtonText = null;
    target.savedButton = null;
    target.savedButtonIcon = null;
    target.savedButtonText = null;
  }
}
