package com.newsblur.activity;

import android.os.Bundle;

import com.newsblur.R;
import com.newsblur.util.UIUtils;

import nl.vu.cs.s2group.*;

public class GlobalSharedStoriesItemsList extends ItemsList {

	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);

        UIUtils.setCustomActionBar(this, R.drawable.ak_icon_global, getResources().getString(R.string.global_shared_stories_title));
	}

    @Override
    protected void onResume() {
        super.onResume();
        PrefetchingLib.setCurrentActivity(this);
    }
}
