package con;
@jHNqfwCVd(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class G93AcjBI3 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ DpXbxvzXm Eeka1udhb;
    public Object MzoOEjc4X;
    public Object ilHKhw3Yw;
    public int qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G93AcjBI3(DpXbxvzXm dpXbxvzXm, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = dpXbxvzXm;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new G93AcjBI3(this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new G93AcjBI3(this.Eeka1udhb, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0086, TryCatch #4 {all -> 0x0086, blocks: (B:18:0x0049, B:20:0x0051, B:21:0x0059, B:29:0x0070, B:31:0x0073, B:33:0x0080, B:22:0x005a, B:25:0x0068), top: B:46:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #4 {all -> 0x0086, blocks: (B:18:0x0049, B:20:0x0051, B:21:0x0059, B:29:0x0070, B:31:0x0073, B:33:0x0080, B:22:0x005a, B:25:0x0068), top: B:46:0x0049 }] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r9) {
        /*
            r8 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r8.qVUwofr5s
            r2 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r1 = r8.ilHKhw3Yw
            con.PMYI4lLJM r1 = (con.PMYI4lLJM) r1
            java.lang.Object r3 = r8.MzoOEjc4X
            con.pBc2IYUp5 r3 = (con.pBc2IYUp5) r3
            con.anXlDk6fV.IytU16YUK(r9)     // Catch: all -> 0x0019
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L_0x0048
        L_0x0019:
            r9 = move-exception
            goto L_0x0088
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0024:
            con.anXlDk6fV.IytU16YUK(r9)
            con.DpXbxvzXm r3 = r8.Eeka1udhb
            r9 = r3
            con.DrTf1eLw4 r9 = (con.DrTf1eLw4) r9     // Catch: all -> 0x0019
            java.util.Objects.requireNonNull(r9)     // Catch: all -> 0x0019
            con.PMYI4lLJM r1 = new con.PMYI4lLJM     // Catch: all -> 0x0019
            r1.<init>(r9)     // Catch: all -> 0x0019
            r9 = r8
        L_0x0035:
            r9.MzoOEjc4X = r3     // Catch: all -> 0x0019
            r9.ilHKhw3Yw = r1     // Catch: all -> 0x0019
            r9.qVUwofr5s = r2     // Catch: all -> 0x0019
            java.lang.Object r4 = r1.q3BipwRCk(r9)     // Catch: all -> 0x0019
            if (r4 != r0) goto L_0x0042
            return r0
        L_0x0042:
            r7 = r0
            r0 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r7
        L_0x0048:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: all -> 0x0086
            boolean r9 = r9.booleanValue()     // Catch: all -> 0x0086
            if (r9 == 0) goto L_0x0080
            java.lang.Object r9 = r3.tGV7Q6urW()     // Catch: all -> 0x0086
            con.qih4lW99W r9 = (con.qih4lW99W) r9     // Catch: all -> 0x0086
            java.lang.Object r9 = con.UvOuyIFuT.J4Ux7ym32     // Catch: all -> 0x0086
            monitor-enter(r9)     // Catch: all -> 0x0086
            java.util.concurrent.atomic.AtomicReference r5 = con.UvOuyIFuT.GPLPRo6go     // Catch: all -> 0x007d
            java.lang.Object r5 = r5.get()     // Catch: all -> 0x007d
            con.SNDUZfhJq r5 = (con.SNDUZfhJq) r5     // Catch: all -> 0x007d
            java.util.Set r5 = r5.iiGwOFFnr     // Catch: all -> 0x007d
            r6 = 0
            if (r5 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            boolean r5 = r5.isEmpty()     // Catch: all -> 0x007d
            r5 = r5 ^ r2
            if (r5 != r2) goto L_0x0070
            r6 = r2
        L_0x0070:
            monitor-exit(r9)     // Catch: all -> 0x0086
            if (r6 == 0) goto L_0x0078
            con.DlhjQ2PrY r9 = con.DlhjQ2PrY.IytU16YUK     // Catch: all -> 0x0086
            con.UvOuyIFuT.iiGwOFFnr(r9)     // Catch: all -> 0x0086
        L_0x0078:
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0035
        L_0x007d:
            r0 = move-exception
            monitor-exit(r9)     // Catch: all -> 0x0086
            throw r0     // Catch: all -> 0x0086
        L_0x0080:
            con.qih4lW99W r9 = con.qih4lW99W.q3BipwRCk     // Catch: all -> 0x0086
            con.anXlDk6fV.yWvV4ePLl(r4, r5)
            return r9
        L_0x0086:
            r9 = move-exception
            r3 = r4
        L_0x0088:
            throw r9     // Catch: all -> 0x0089
        L_0x0089:
            r0 = move-exception
            con.anXlDk6fV.yWvV4ePLl(r3, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.G93AcjBI3.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
