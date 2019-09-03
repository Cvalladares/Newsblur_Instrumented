// Generated code from Butter Knife. Do not modify!
package com.newsblur.database;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class StoryViewAdapter$StoryRowViewHolder$$ViewBinder<T extends com.newsblur.database.StoryViewAdapter.StoryRowViewHolder> extends com.newsblur.database.StoryViewAdapter$StoryViewHolder$$ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    super.bind(finder, target, source);

    View view;
    view = finder.findRequiredView(source, 2131165489, "field 'storyAuthor'");
    target.storyAuthor = finder.castView(view, 2131165489, "field 'storyAuthor'");
    view = finder.findRequiredView(source, 2131165490, "field 'storySnippet'");
    target.storySnippet = finder.castView(view, 2131165490, "field 'storySnippet'");
  }

  @Override public void unbind(T target) {
    super.unbind(target);

    target.storyAuthor = null;
    target.storySnippet = null;
  }
}
