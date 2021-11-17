package con;

import android.app.AppOpsManager;
import android.content.Context;
/* loaded from: classes.dex */
public abstract class A7WYoUKXR {
    public static String J4Ux7ym32(Context context) {
        return context.getOpPackageName();
    }

    public static int q3BipwRCk(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AppOpsManager tGV7Q6urW(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
