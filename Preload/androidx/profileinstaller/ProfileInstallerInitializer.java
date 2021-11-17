package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import con.NS7vjtAxy;
import con.UgMB5z3WN;
import con.YIbr4kVj6;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements UgMB5z3WN {

    /* loaded from: classes.dex */
    public static class RG2GI7LDp {
        public static void q3BipwRCk(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new YIbr4kVj6(runnable));
        }
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr {
    }

    /* loaded from: classes.dex */
    public static class mhl5lIdbQ {
        public static Handler q3BipwRCk(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @Override // con.UgMB5z3WN
    public Object J4Ux7ym32(Context context) {
        RG2GI7LDp.q3BipwRCk(new NS7vjtAxy(this, context.getApplicationContext()));
        return new aXI58Y1kr();
    }

    @Override // con.UgMB5z3WN
    public List q3BipwRCk() {
        return Collections.emptyList();
    }
}
