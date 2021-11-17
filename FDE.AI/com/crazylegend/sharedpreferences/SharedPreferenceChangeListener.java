package com.crazylegend.sharedpreferences;

import android.content.SharedPreferences;
import androidx.lifecycle.mhl5lIdbQ;
import con.cqLjMdkAC;
import con.kkcQgCx5G;
import con.mScwA0bsb;
/* loaded from: classes.dex */
public final class SharedPreferenceChangeListener implements SharedPreferences.OnSharedPreferenceChangeListener, mScwA0bsb {
    public final SharedPreferences CBQ5d1kRq;
    public final kkcQgCx5G kmSgne1rO;

    public SharedPreferenceChangeListener(SharedPreferences sharedPreferences, kkcQgCx5G kkcqgcx5g) {
        this.CBQ5d1kRq = sharedPreferences;
        this.kmSgne1rO = kkcqgcx5g;
    }

    @cqLjMdkAC(mhl5lIdbQ.RG2GI7LDp.ON_CREATE)
    public final void onCreate() {
        this.CBQ5d1kRq.registerOnSharedPreferenceChangeListener(this);
    }

    @cqLjMdkAC(mhl5lIdbQ.RG2GI7LDp.ON_DESTROY)
    public final void onDestroy() {
        this.CBQ5d1kRq.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.kmSgne1rO.WaUP0CF08(sharedPreferences, str);
    }
}
