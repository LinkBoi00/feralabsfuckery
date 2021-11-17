package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class ieVIpzqcX {
    public static final sRvcTfY85 J4Ux7ym32;
    public static final LVtOVALR4 q3BipwRCk;

    static {
        int i = Build.VERSION.SDK_INT;
        q3BipwRCk = i >= 29 ? new QhIpuFtVf() : i >= 28 ? new LVuWXK3V0() : new dV9j1WF3U();
        J4Ux7ym32 = new sRvcTfY85(16);
    }

    public static Typeface J4Ux7ym32(Context context, Resources resources, int i, String str, int i2) {
        Typeface tGV7Q6urW = q3BipwRCk.tGV7Q6urW(context, resources, i, str, i2);
        if (tGV7Q6urW != null) {
            J4Ux7ym32.J4Ux7ym32(tGV7Q6urW(resources, i, i2), tGV7Q6urW);
        }
        return tGV7Q6urW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r4.equals(r6) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static android.graphics.Typeface q3BipwRCk(android.content.Context r14, con.GezE1KLaf r15, android.content.res.Resources r16, int r17, int r18, con.DfseMYa7G r19, android.os.Handler r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: con.ieVIpzqcX.q3BipwRCk(android.content.Context, con.GezE1KLaf, android.content.res.Resources, int, int, con.DfseMYa7G, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static String tGV7Q6urW(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
