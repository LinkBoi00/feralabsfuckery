package com.feravolt.preload.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.feravolt.preload.services.PreloadService;
import con.abGBwSu8x;
import con.anXlDk6fV;
import con.r6NbD4wnj;
import con.tzR8IMGfw;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class PreloadIntentReciever extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = null;
        if (anXlDk6fV.tGV7Q6urW(intent == null ? null : intent.getAction(), "android.intent.action.SEND") && anXlDk6fV.tGV7Q6urW(intent.getType(), "text/plain")) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("{");
                for (String str2 : extras.keySet()) {
                    Object obj = extras.get(str2);
                    q3BipwRCk.append(str2);
                    q3BipwRCk.append(":");
                    q3BipwRCk.append(obj);
                }
                q3BipwRCk.append("}");
                str = tzR8IMGfw.q3BipwRCk.kmSgne1rO(q3BipwRCk.toString());
            }
            String valueOf = String.valueOf(str);
            if (r6NbD4wnj.mUqPm6GBh(valueOf, "dopreload", false, 2)) {
                int igRQEZxnW = r6NbD4wnj.igRQEZxnW(valueOf, ":", 0, false, 6);
                if (igRQEZxnW != -1) {
                    valueOf = r6NbD4wnj.zHl31GGXU(valueOf, 0, igRQEZxnW, "").toString();
                }
                int juJ6pnCpu = r6NbD4wnj.juJ6pnCpu(valueOf, ":", 0, false, 6);
                if (juJ6pnCpu != -1) {
                    valueOf = r6NbD4wnj.zHl31GGXU(valueOf, juJ6pnCpu + 1, valueOf.length(), "").toString();
                }
                String obj2 = r6NbD4wnj.BL4OzhZBd(Pattern.compile(":").matcher(valueOf).replaceAll("")).toString();
                Intent intent2 = new Intent(context, PreloadService.class);
                intent2.putExtra("packageid", obj2);
                if (context != null) {
                    context.startForegroundService(intent2);
                }
            } else if (r6NbD4wnj.mUqPm6GBh(valueOf, "unpreload", false, 2)) {
                Intent intent3 = new Intent(context, PreloadService.class);
                intent3.putExtra("unpreload", "true");
                if (context != null) {
                    context.startForegroundService(intent3);
                }
            }
        }
    }
}
