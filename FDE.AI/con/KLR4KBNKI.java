package con;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class KLR4KBNKI implements Application.ActivityLifecycleCallbacks {
    public Activity J4Ux7ym32;
    public Object q3BipwRCk;
    public final int tGV7Q6urW;
    public boolean dIocxURUo = false;
    public boolean kCA6Zs9sL = false;
    public boolean iiGwOFFnr = false;

    public KLR4KBNKI(Activity activity) {
        this.J4Ux7ym32 = activity;
        this.tGV7Q6urW = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.J4Ux7ym32 == activity) {
            this.J4Ux7ym32 = null;
            this.kCA6Zs9sL = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5.iiGwOFFnr = true;
        r5.q3BipwRCk = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        return;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onActivityPaused(android.app.Activity r6) {
        /*
            r5 = this;
            boolean r0 = r5.kCA6Zs9sL
            if (r0 == 0) goto L_0x0042
            boolean r0 = r5.iiGwOFFnr
            if (r0 != 0) goto L_0x0042
            boolean r0 = r5.dIocxURUo
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r5.q3BipwRCk
            int r1 = r5.tGV7Q6urW
            r2 = 0
            r3 = 1
            java.lang.reflect.Field r4 = con.QvXlJJNbM.tGV7Q6urW     // Catch: all -> 0x0033
            java.lang.Object r4 = r4.get(r6)     // Catch: all -> 0x0033
            if (r4 != r0) goto L_0x003b
            int r0 = r6.hashCode()     // Catch: all -> 0x0033
            if (r0 == r1) goto L_0x0021
            goto L_0x003b
        L_0x0021:
            java.lang.reflect.Field r0 = con.QvXlJJNbM.J4Ux7ym32     // Catch: all -> 0x0033
            java.lang.Object r6 = r0.get(r6)     // Catch: all -> 0x0033
            android.os.Handler r0 = con.QvXlJJNbM.GPLPRo6go     // Catch: all -> 0x0033
            con.DJbXkgfuR r1 = new con.DJbXkgfuR     // Catch: all -> 0x0033
            r1.<init>(r6, r4)     // Catch: all -> 0x0033
            r0.postAtFrontOfQueue(r1)     // Catch: all -> 0x0033
            r2 = r3
            goto L_0x003b
        L_0x0033:
            r6 = move-exception
            java.lang.String r0 = "ActivityRecreator"
            java.lang.String r1 = "Exception while fetching field values"
            android.util.Log.e(r0, r1, r6)
        L_0x003b:
            if (r2 == 0) goto L_0x0042
            r5.iiGwOFFnr = r3
            r6 = 0
            r5.q3BipwRCk = r6
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.KLR4KBNKI.onActivityPaused(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.J4Ux7ym32 == activity) {
            this.dIocxURUo = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
