package com.st.fn.activites;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.st.fn.R;

public class PrefsActivity extends PreferenceActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource( R.xml.prefs);
	}
	
	

}
