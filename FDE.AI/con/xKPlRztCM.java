package con;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* loaded from: classes.dex */
public class xKPlRztCM extends SBj41z1W0 {
    public static final String[] vNtjxmzUM = {"android:visibility:visibility", "android:visibility:parent"};
    public int NyWTwPF6V;

    public xKPlRztCM() {
        this.NyWTwPF6V = 3;
    }

    @Override // con.SBj41z1W0
    public void GPLPRo6go(kw8QXWz47 kw8qxwz47) {
        mUqPm6GBh(kw8qxwz47);
        kw8qxwz47.q3BipwRCk.put("android:fade:transitionAlpha", Float.valueOf(lSxPlj8FZ.q3BipwRCk(kw8qxwz47.J4Ux7ym32)));
    }

    @Override // con.SBj41z1W0
    public String[] MzoOEjc4X() {
        return vNtjxmzUM;
    }

    public final Animator NyWTwPF6V(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        lSxPlj8FZ.q3BipwRCk.GPLPRo6go(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, lSxPlj8FZ.J4Ux7ym32, f2);
        ofFloat.addListener(new ghmRemUn3(view));
        q3BipwRCk(new Ui7MxKF7n(this, view));
        return ofFloat;
    }

    @Override // con.SBj41z1W0
    public void dIocxURUo(kw8QXWz47 kw8qxwz47) {
        mUqPm6GBh(kw8qxwz47);
    }

    public Animator i0Zug1mVk(View view, kw8QXWz47 kw8qxwz47) {
        lSxPlj8FZ.q3BipwRCk.kCA6Zs9sL(view);
        Float f = (Float) kw8qxwz47.q3BipwRCk.get("android:fade:transitionAlpha");
        return NyWTwPF6V(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    public final void mUqPm6GBh(kw8QXWz47 kw8qxwz47) {
        kw8qxwz47.q3BipwRCk.put("android:visibility:visibility", Integer.valueOf(kw8qxwz47.J4Ux7ym32.getVisibility()));
        kw8qxwz47.q3BipwRCk.put("android:visibility:parent", kw8qxwz47.J4Ux7ym32.getParent());
        int[] iArr = new int[2];
        kw8qxwz47.J4Ux7ym32.getLocationOnScreen(iArr);
        kw8qxwz47.q3BipwRCk.put("android:visibility:screenLocation", iArr);
    }

    @Override // con.SBj41z1W0
    public boolean qVUwofr5s(kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        if (kw8qxwz47 == null && kw8qxwz472 == null) {
            return false;
        }
        if (kw8qxwz47 != null && kw8qxwz472 != null && kw8qxwz472.q3BipwRCk.containsKey("android:visibility:visibility") != kw8qxwz47.q3BipwRCk.containsKey("android:visibility:visibility")) {
            return false;
        }
        xSevBfQGg vNtjxmzUM2 = vNtjxmzUM(kw8qxwz47, kw8qxwz472);
        if (vNtjxmzUM2.q3BipwRCk) {
            return vNtjxmzUM2.tGV7Q6urW == 0 || vNtjxmzUM2.dIocxURUo == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r0.kCA6Zs9sL == null) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r0.tGV7Q6urW == 0) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final con.xSevBfQGg vNtjxmzUM(con.kw8QXWz47 r8, con.kw8QXWz47 r9) {
        /*
            r7 = this;
            con.xSevBfQGg r0 = new con.xSevBfQGg
            r0.<init>()
            r1 = 0
            r0.q3BipwRCk = r1
            r0.J4Ux7ym32 = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map r6 = r8.q3BipwRCk
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map r6 = r8.q3BipwRCk
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.tGV7Q6urW = r6
            java.util.Map r6 = r8.q3BipwRCk
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.kCA6Zs9sL = r6
            goto L_0x0037
        L_0x0033:
            r0.tGV7Q6urW = r4
            r0.kCA6Zs9sL = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map r6 = r9.q3BipwRCk
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map r3 = r9.q3BipwRCk
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.dIocxURUo = r3
            java.util.Map r3 = r9.q3BipwRCk
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.iiGwOFFnr = r2
            goto L_0x005e
        L_0x005a:
            r0.dIocxURUo = r4
            r0.iiGwOFFnr = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.tGV7Q6urW
            int r9 = r0.dIocxURUo
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.kCA6Zs9sL
            android.view.ViewGroup r4 = r0.iiGwOFFnr
            if (r3 != r4) goto L_0x0070
            goto L_0x0095
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            if (r9 != 0) goto L_0x0095
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.iiGwOFFnr
            if (r8 != 0) goto L_0x007d
            goto L_0x0091
        L_0x007d:
            android.view.ViewGroup r8 = r0.kCA6Zs9sL
            if (r8 != 0) goto L_0x0095
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008b
            int r8 = r0.dIocxURUo
            if (r8 != 0) goto L_0x008b
        L_0x0088:
            r0.J4Ux7ym32 = r2
            goto L_0x0093
        L_0x008b:
            if (r9 != 0) goto L_0x0095
            int r8 = r0.tGV7Q6urW
            if (r8 != 0) goto L_0x0095
        L_0x0091:
            r0.J4Ux7ym32 = r1
        L_0x0093:
            r0.q3BipwRCk = r2
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xKPlRztCM.vNtjxmzUM(con.kw8QXWz47, con.kw8QXWz47):con.xSevBfQGg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (vNtjxmzUM(Bhmn1KIah(r1, false), ilHKhw3Yw(r1, false)).q3BipwRCk != false) goto L_0x0066;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e3  */
    @Override // con.SBj41z1W0
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.animation.Animator vPSbyrYWX(android.view.ViewGroup r21, con.kw8QXWz47 r22, con.kw8QXWz47 r23) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xKPlRztCM.vPSbyrYWX(android.view.ViewGroup, con.kw8QXWz47, con.kw8QXWz47):android.animation.Animator");
    }

    public xKPlRztCM(int i) {
        this.NyWTwPF6V = 3;
        if ((i & -4) == 0) {
            this.NyWTwPF6V = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
