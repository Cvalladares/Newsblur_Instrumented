// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class InfrequentCutoffDialogFragment$$ViewBinder<T extends com.newsblur.fragment.InfrequentCutoffDialogFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230918, "field 'button5' and method 'select5'");
    target.button5 = finder.castView(view, 2131230918, "field 'button5'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.select5();
        }
      });
    view = finder.findRequiredView(source, 2131230916, "field 'button15' and method 'select15'");
    target.button15 = finder.castView(view, 2131230916, "field 'button15'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.select15();
        }
      });
    view = finder.findRequiredView(source, 2131230917, "field 'button30' and method 'select30'");
    target.button30 = finder.castView(view, 2131230917, "field 'button30'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.select30();
        }
      });
    view = finder.findRequiredView(source, 2131230919, "field 'button60' and method 'select60'");
    target.button60 = finder.castView(view, 2131230919, "field 'button60'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.select60();
        }
      });
    view = finder.findRequiredView(source, 2131230920, "field 'button90' and method 'select90'");
    target.button90 = finder.castView(view, 2131230920, "field 'button90'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.select90();
        }
      });
  }

  @Override public void unbind(T target) {
    target.button5 = null;
    target.button15 = null;
    target.button30 = null;
    target.button60 = null;
    target.button90 = null;
  }
}
