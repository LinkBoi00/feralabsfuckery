package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.mhl5lIdbQ;
import con.CZQIVCjFd;
import con.K3JGdRcke;
import con.UgMB5z3WN;
import con.m3pblghx7;
import con.tICmxKetD;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements UgMB5z3WN {
    @Override // con.UgMB5z3WN
    public Object J4Ux7ym32(Context context) {
        if (!tICmxKetD.q3BipwRCk.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new CZQIVCjFd());
        }
        K3JGdRcke k3JGdRcke = K3JGdRcke.dXrmkklc8;
        Objects.requireNonNull(k3JGdRcke);
        k3JGdRcke.MzoOEjc4X = new Handler();
        k3JGdRcke.ilHKhw3Yw.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new m3pblghx7(k3JGdRcke));
        return k3JGdRcke;
    }

    @Override // con.UgMB5z3WN
    public List q3BipwRCk() {
        return Collections.emptyList();
    }
}
