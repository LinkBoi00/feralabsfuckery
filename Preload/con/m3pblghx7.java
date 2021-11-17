package con;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.mhl5lIdbQ;
/* loaded from: classes.dex */
public class m3pblghx7 extends rdt5woj2A {
    public final /* synthetic */ K3JGdRcke this$0;

    public m3pblghx7(K3JGdRcke k3JGdRcke) {
        this.this$0 = k3JGdRcke;
    }

    @Override // con.rdt5woj2A, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = B0ROL5sm5.kmSgne1rO;
            ((B0ROL5sm5) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).CBQ5d1kRq = this.this$0.Eeka1udhb;
        }
    }

    @Override // con.rdt5woj2A, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        K3JGdRcke k3JGdRcke = this.this$0;
        int i = k3JGdRcke.kmSgne1rO - 1;
        k3JGdRcke.kmSgne1rO = i;
        if (i == 0) {
            k3JGdRcke.MzoOEjc4X.postDelayed(k3JGdRcke.qVUwofr5s, 700);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new borJjlimz(this));
    }

    @Override // con.rdt5woj2A, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        K3JGdRcke k3JGdRcke = this.this$0;
        int i = k3JGdRcke.CBQ5d1kRq - 1;
        k3JGdRcke.CBQ5d1kRq = i;
        if (i == 0 && k3JGdRcke.Bhmn1KIah) {
            k3JGdRcke.ilHKhw3Yw.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
            k3JGdRcke.PSTqBLTET = true;
        }
    }
}
