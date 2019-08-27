package com.example.qzy;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.v7.preference.PreferenceFragmentCompat;

public class MySettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferencescreen);
    }
}
