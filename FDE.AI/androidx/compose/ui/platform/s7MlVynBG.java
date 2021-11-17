package androidx.compose.ui.platform;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class s7MlVynBG {
    public static final ViewGroup.LayoutParams q3BipwRCk = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.v0l3RHDWl q3BipwRCk(android.view.ViewGroup r11, con.z3ICU5k15 r12, con.kkcQgCx5G r13) {
        /*
            con.GPJ4QWO2h r0 = con.GPJ4QWO2h.q3BipwRCk
            java.util.concurrent.atomic.AtomicBoolean r0 = con.GPJ4QWO2h.J4Ux7ym32
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L_0x0048
            r0 = -1
            r4 = 6
            con.DpXbxvzXm r0 = con.rTcohQ78k.q3BipwRCk(r0, r3, r3, r4)
            con.ksLrMHgEz r4 = con.J7YsuEuPq.sk5s77z6Q
            con.llWJsfBCK r4 = con.J7YsuEuPq.WaUP0CF08
            con.Ka0YY9gOW r4 = (con.Ka0YY9gOW) r4
            java.lang.Object r4 = r4.getValue()
            con.bu5cjmae6 r4 = (con.bu5cjmae6) r4
            con.oQkvjGXIr r5 = con.D3DEikrvb.q3BipwRCk(r4)
            r6 = 0
            con.G93AcjBI3 r8 = new con.G93AcjBI3
            r8.<init>(r0, r3)
            r9 = 3
            r10 = 0
            r7 = 0
            con.idpM54xlp.RG6kpfv3v(r5, r6, r7, r8, r9, r10)
            con.nVhenZUxZ r4 = new con.nVhenZUxZ
            r4.<init>(r0)
            java.lang.Object r0 = con.UvOuyIFuT.J4Ux7ym32
            monitor-enter(r0)
            java.util.List r5 = con.UvOuyIFuT.iiGwOFFnr     // Catch: all -> 0x0045
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: all -> 0x0045
            r5.add(r4)     // Catch: all -> 0x0045
            monitor-exit(r0)
            con.DlhjQ2PrY r0 = con.DlhjQ2PrY.IytU16YUK
            con.UvOuyIFuT.iiGwOFFnr(r0)
            goto L_0x0048
        L_0x0045:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L_0x0048:
            int r0 = r11.getChildCount()
            if (r0 <= 0) goto L_0x0059
            android.view.View r0 = r11.getChildAt(r1)
            boolean r4 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r4 == 0) goto L_0x005c
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L_0x005d
        L_0x0059:
            r11.removeAllViews()
        L_0x005c:
            r0 = r3
        L_0x005d:
            if (r0 != 0) goto L_0x0071
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r4 = r11.getContext()
            r0.<init>(r4)
            android.view.View r4 = r0.getView()
            android.view.ViewGroup$LayoutParams r5 = androidx.compose.ui.platform.s7MlVynBG.q3BipwRCk
            r11.addView(r4, r5)
        L_0x0071:
            int r11 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r11 < r4) goto L_0x0085
            con.hDwK7ZkhL r11 = con.hDwK7ZkhL.q3BipwRCk
            java.util.Map r11 = r11.q3BipwRCk(r0)
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x0085
            r1 = r2
        L_0x0085:
            if (r1 == 0) goto L_0x00ac
            r11 = 2131296480(0x7f0900e0, float:1.8210878E38)
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.setTag(r11, r1)
            java.lang.Class<con.Rjnc3TWC6> r11 = con.Rjnc3TWC6.class
            java.lang.String r1 = "q3BipwRCk"
            java.lang.reflect.Field r11 = r11.getDeclaredField(r1)     // Catch: Exception -> 0x00a5
            r11.setAccessible(r2)     // Catch: Exception -> 0x00a5
            r11.setBoolean(r3, r2)     // Catch: Exception -> 0x00a5
            goto L_0x00ac
        L_0x00a5:
            java.lang.String r11 = "Wrapper"
            java.lang.String r1 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r11, r1)
        L_0x00ac:
            con.aPSn62JU5 r11 = new con.aPSn62JU5
            con.pLYbCSTk0 r1 = r0.getRoot()
            r11.<init>(r1)
            con.v0l3RHDWl r11 = con.MLnKY8xDo.q3BipwRCk(r11, r12)
            android.view.View r12 = r0.getView()
            r1 = 2131296774(0x7f090206, float:1.8211474E38)
            java.lang.Object r12 = r12.getTag(r1)
            boolean r2 = r12 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r2 == 0) goto L_0x00cb
            r3 = r12
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        L_0x00cb:
            if (r3 != 0) goto L_0x00d9
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r11)
            android.view.View r11 = r0.getView()
            r11.setTag(r1, r3)
        L_0x00d9:
            androidx.compose.ui.platform.AndroidComposeView r11 = r3.CBQ5d1kRq
            androidx.compose.ui.platform.WrappedComposition$RG2GI7LDp r12 = new androidx.compose.ui.platform.WrappedComposition$RG2GI7LDp
            r12.<init>(r13)
            r11.setOnViewTreeOwnersAvailable(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s7MlVynBG.q3BipwRCk(android.view.ViewGroup, con.z3ICU5k15, con.kkcQgCx5G):con.v0l3RHDWl");
    }
}
