package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {279, 283, 287}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UbUzWfT3B extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ gdEmqfwpT Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ kkcQgCx5G RG6kpfv3v;
    public final /* synthetic */ gdEmqfwpT dXrmkklc8;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ PmanMZxiM qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UbUzWfT3B(PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = pmanMZxiM;
        this.Eeka1udhb = gdemqfwpt;
        this.dXrmkklc8 = gdemqfwpt2;
        this.RG6kpfv3v = kkcqgcx5g;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        UbUzWfT3B ubUzWfT3B = new UbUzWfT3B(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        ubUzWfT3B.ilHKhw3Yw = (xOpkxuRlw) obj;
        return ubUzWfT3B.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        UbUzWfT3B ubUzWfT3B = new UbUzWfT3B(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        ubUzWfT3B.ilHKhw3Yw = obj;
        return ubUzWfT3B;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: CancellationException -> 0x0083, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0083, blocks: (B:7:0x0010, B:11:0x0020, B:18:0x004a, B:21:0x0055, B:23:0x005a), top: B:31:0x0008 }] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r12) {
        /*
            r11 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r11.MzoOEjc4X
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r5) goto L_0x0024
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            con.anXlDk6fV.IytU16YUK(r12)     // Catch: CancellationException -> 0x0083
            goto L_0x0080
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            java.lang.Object r1 = r11.ilHKhw3Yw
            con.xOpkxuRlw r1 = (con.xOpkxuRlw) r1
            con.anXlDk6fV.IytU16YUK(r12)     // Catch: CancellationException -> 0x0083
            goto L_0x0055
        L_0x0024:
            java.lang.Object r1 = r11.ilHKhw3Yw
            con.xOpkxuRlw r1 = (con.xOpkxuRlw) r1
            con.anXlDk6fV.IytU16YUK(r12)
            goto L_0x0048
        L_0x002c:
            con.anXlDk6fV.IytU16YUK(r12)
            java.lang.Object r12 = r11.ilHKhw3Yw
            con.xOpkxuRlw r12 = (con.xOpkxuRlw) r12
            con.XNyqBtql6 r1 = new con.XNyqBtql6
            r1.<init>(r2)
            r11.ilHKhw3Yw = r12
            r11.MzoOEjc4X = r5
            con.ztvmwA530 r12 = (con.ztvmwA530) r12
            java.lang.Object r1 = r12.cAwN510t2(r1, r11)
            if (r1 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x0048:
            con.cKAQplqZy r12 = (con.cKAQplqZy) r12
            r11.ilHKhw3Yw = r1     // Catch: CancellationException -> 0x0083
            r11.MzoOEjc4X = r4     // Catch: CancellationException -> 0x0083
            java.lang.Object r12 = con.ZEpQDovLv.q3BipwRCk(r1, r12, r11)     // Catch: CancellationException -> 0x0083
            if (r12 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r5 = r12
            con.cKAQplqZy r5 = (con.cKAQplqZy) r5     // Catch: CancellationException -> 0x0083
            if (r5 == 0) goto L_0x0080
            con.PmanMZxiM r12 = r11.qVUwofr5s     // Catch: CancellationException -> 0x0083
            long r6 = r5.tGV7Q6urW     // Catch: CancellationException -> 0x0083
            con.bRgfgYIQX r4 = new con.bRgfgYIQX     // Catch: CancellationException -> 0x0083
            r4.<init>(r6)     // Catch: CancellationException -> 0x0083
            r12.IytU16YUK(r4)     // Catch: CancellationException -> 0x0083
            con.Lt3zjAIOI r12 = new con.Lt3zjAIOI     // Catch: CancellationException -> 0x0083
            con.gdEmqfwpT r6 = r11.dXrmkklc8     // Catch: CancellationException -> 0x0083
            con.gdEmqfwpT r7 = r11.Eeka1udhb     // Catch: CancellationException -> 0x0083
            con.kkcQgCx5G r8 = r11.RG6kpfv3v     // Catch: CancellationException -> 0x0083
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: CancellationException -> 0x0083
            r11.ilHKhw3Yw = r2     // Catch: CancellationException -> 0x0083
            r11.MzoOEjc4X = r3     // Catch: CancellationException -> 0x0083
            con.ztvmwA530 r1 = (con.ztvmwA530) r1     // Catch: CancellationException -> 0x0083
            java.lang.Object r12 = r1.cAwN510t2(r12, r11)     // Catch: CancellationException -> 0x0083
            if (r12 != r0) goto L_0x0080
            return r0
        L_0x0080:
            con.qih4lW99W r12 = con.qih4lW99W.q3BipwRCk
            return r12
        L_0x0083:
            r12 = move-exception
            con.gdEmqfwpT r0 = r11.Eeka1udhb
            r0.GPLPRo6go()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: con.UbUzWfT3B.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
