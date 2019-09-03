// Generated code from Butter Knife. Do not modify!
package com.newsblur.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Reading$$ViewBinder<T extends com.newsblur.activity.Reading> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 16908290, "field 'contentView'");
    target.contentView = view;
    view = finder.findRequiredView(source, 2131165410, "field 'overlayLeft'");
    target.overlayLeft = finder.castView(view, 2131165410, "field 'overlayLeft'");
    view = finder.findRequiredView(source, 2131165414, "field 'overlayRight'");
    target.overlayRight = finder.castView(view, 2131165414, "field 'overlayRight'");
    view = finder.findRequiredView(source, 2131165411, "field 'overlayProgress'");
    target.overlayProgress = finder.castView(view, 2131165411, "field 'overlayProgress'");
    view = finder.findRequiredView(source, 2131165413, "field 'overlayProgressRight'");
    target.overlayProgressRight = finder.castView(view, 2131165413, "field 'overlayProgressRight'");
    view = finder.findRequiredView(source, 2131165412, "field 'overlayProgressLeft'");
    target.overlayProgressLeft = finder.castView(view, 2131165412, "field 'overlayProgressLeft'");
    view = finder.findRequiredView(source, 2131165416, "field 'overlayText'");
    target.overlayText = finder.castView(view, 2131165416, "field 'overlayText'");
    view = finder.findRequiredView(source, 2131165415, "field 'overlaySend'");
    target.overlaySend = finder.castView(view, 2131165415, "field 'overlaySend'");
    view = finder.findRequiredView(source, 2131165397, "field 'emptyViewText'");
    target.emptyViewText = view;
    view = finder.findRequiredView(source, 2131165425, "field 'overlayStatusText'");
    target.overlayStatusText = finder.castView(view, 2131165425, "field 'overlayStatusText'");
  }

  @Override public void unbind(T target) {
    target.contentView = null;
    target.overlayLeft = null;
    target.overlayRight = null;
    target.overlayProgress = null;
    target.overlayProgressRight = null;
    target.overlayProgressLeft = null;
    target.overlayText = null;
    target.overlaySend = null;
    target.emptyViewText = null;
    target.overlayStatusText = null;
  }
}
