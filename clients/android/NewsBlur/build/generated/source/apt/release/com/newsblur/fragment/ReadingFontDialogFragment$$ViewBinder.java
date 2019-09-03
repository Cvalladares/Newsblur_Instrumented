// Generated code from Butter Knife. Do not modify!
package com.newsblur.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReadingFontDialogFragment$$ViewBinder<T extends com.newsblur.fragment.ReadingFontDialogFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230922, "field 'anonymousButton' and method 'selectAnonymousPro'");
    target.anonymousButton = finder.castView(view, 2131230922, "field 'anonymousButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectAnonymousPro();
        }
      });
    view = finder.findRequiredView(source, 2131230923, "field 'chronicleButton' and method 'selectChronicle'");
    target.chronicleButton = finder.castView(view, 2131230923, "field 'chronicleButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectChronicle();
        }
      });
    view = finder.findRequiredView(source, 2131230924, "field 'defaultButton' and method 'selectDefault'");
    target.defaultButton = finder.castView(view, 2131230924, "field 'defaultButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectDefault();
        }
      });
    view = finder.findRequiredView(source, 2131230925, "field 'gothamButton' and method 'selectGotham'");
    target.gothamButton = finder.castView(view, 2131230925, "field 'gothamButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectGotham();
        }
      });
    view = finder.findRequiredView(source, 2131230927, "field 'notoSansButton' and method 'selectNotoSans'");
    target.notoSansButton = finder.castView(view, 2131230927, "field 'notoSansButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectNotoSans();
        }
      });
    view = finder.findRequiredView(source, 2131230928, "field 'notoSerifButton' and method 'selectNotoSerif'");
    target.notoSerifButton = finder.castView(view, 2131230928, "field 'notoSerifButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectNotoSerif();
        }
      });
    view = finder.findRequiredView(source, 2131230930, "field 'openSansCondensedButton' and method 'selectOpenSansCondensed'");
    target.openSansCondensedButton = finder.castView(view, 2131230930, "field 'openSansCondensedButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectOpenSansCondensed();
        }
      });
    view = finder.findRequiredView(source, 2131230932, "field 'whitneyButton' and method 'selectWhitney'");
    target.whitneyButton = finder.castView(view, 2131230932, "field 'whitneyButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectWhitney();
        }
      });
  }

  @Override public void unbind(T target) {
    target.anonymousButton = null;
    target.chronicleButton = null;
    target.defaultButton = null;
    target.gothamButton = null;
    target.notoSansButton = null;
    target.notoSerifButton = null;
    target.openSansCondensedButton = null;
    target.whitneyButton = null;
  }
}
