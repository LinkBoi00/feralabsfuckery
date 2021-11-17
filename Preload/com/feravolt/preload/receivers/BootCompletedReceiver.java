package com.feravolt.preload.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.feravolt.preload.services.PreloadService;
import con.anXlDk6fV;
import con.bSc306J1d;
import con.tzR8IMGfw;
/* loaded from: classes.dex */
public final class BootCompletedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SharedPreferences defaultSharedPreferences;
        String string;
        SharedPreferences defaultSharedPreferences2;
        if (anXlDk6fV.tGV7Q6urW(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            boolean z = false;
            if (!(context == null || (defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(context)) == null)) {
                SharedPreferences.Editor edit = defaultSharedPreferences2.edit();
                edit.putBoolean("preloaded", false);
                edit.putStringSet("preloaded_apps", bSc306J1d.CBQ5d1kRq);
                edit.apply();
            }
            String str = null;
            if (!(context == null || (defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)) == null || (string = defaultSharedPreferences.getString("autopreload", "")) == null)) {
                str = tzR8IMGfw.q3BipwRCk.kmSgne1rO(string);
            }
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                }
                if (z) {
                    Intent intent2 = new Intent(context, PreloadService.class);
                    intent2.putExtra("packageid", str);
                    context.startForegroundService(intent2);
                }
            }
        }
    }
}
