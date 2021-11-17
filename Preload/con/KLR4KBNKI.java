package con;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
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
    public void onActivityPaused(Activity activity) {
        if (this.kCA6Zs9sL && !this.iiGwOFFnr && !this.dIocxURUo) {
            Object obj = this.q3BipwRCk;
            int i = this.tGV7Q6urW;
            boolean z = false;
            try {
                Object obj2 = QvXlJJNbM.tGV7Q6urW.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    QvXlJJNbM.GPLPRo6go.postAtFrontOfQueue(new DJbXkgfuR(QvXlJJNbM.J4Ux7ym32.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
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
