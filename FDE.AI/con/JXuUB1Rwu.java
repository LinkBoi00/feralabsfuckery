package con;
@jHNqfwCVd(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {368}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JXuUB1Rwu extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ DpXbxvzXm Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ UBY2Inzw8 RG6kpfv3v;
    public final /* synthetic */ IxbokG044 dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 ixWaw2akD;
    public /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JXuUB1Rwu(DpXbxvzXm dpXbxvzXm, IxbokG044 ixbokG044, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = dpXbxvzXm;
        this.dXrmkklc8 = ixbokG044;
        this.RG6kpfv3v = uBY2Inzw8;
        this.ixWaw2akD = uBY2Inzw82;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        JXuUB1Rwu jXuUB1Rwu = new JXuUB1Rwu(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, (Way959ade) obj2);
        jXuUB1Rwu.qVUwofr5s = (oQkvjGXIr) obj;
        return jXuUB1Rwu.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        JXuUB1Rwu jXuUB1Rwu = new JXuUB1Rwu(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
        jXuUB1Rwu.qVUwofr5s = obj;
        return jXuUB1Rwu;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            con.kBKJSqCSL r1 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r2 = r0.ilHKhw3Yw
            r3 = 1
            if (r2 == 0) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            java.lang.Object r2 = r0.MzoOEjc4X
            con.PMYI4lLJM r2 = (con.PMYI4lLJM) r2
            java.lang.Object r4 = r0.qVUwofr5s
            con.oQkvjGXIr r4 = (con.oQkvjGXIr) r4
            con.anXlDk6fV.IytU16YUK(r16)
            r6 = r16
            r5 = r0
            goto L_0x0044
        L_0x0019:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0021:
            con.anXlDk6fV.IytU16YUK(r16)
            java.lang.Object r2 = r0.qVUwofr5s
            con.oQkvjGXIr r2 = (con.oQkvjGXIr) r2
            con.DpXbxvzXm r4 = r0.Eeka1udhb
            con.DrTf1eLw4 r4 = (con.DrTf1eLw4) r4
            java.util.Objects.requireNonNull(r4)
            con.PMYI4lLJM r5 = new con.PMYI4lLJM
            r5.<init>(r4)
            r4 = r2
            r2 = r5
            r5 = r0
        L_0x0037:
            r5.qVUwofr5s = r4
            r5.MzoOEjc4X = r2
            r5.ilHKhw3Yw = r3
            java.lang.Object r6 = r2.q3BipwRCk(r5)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0079
            java.lang.Object r6 = r2.tGV7Q6urW()
            con.DpXbxvzXm r7 = r5.Eeka1udhb
            con.DrTf1eLw4 r7 = (con.DrTf1eLw4) r7
            java.lang.Object r7 = r7.ilHKhw3Yw()
            java.lang.Object r7 = con.nNBfGFMkt.q3BipwRCk(r7)
            if (r7 != 0) goto L_0x0060
            r9 = r6
            goto L_0x0061
        L_0x0060:
            r9 = r7
        L_0x0061:
            r6 = 0
            con.BFpiGHRD8 r14 = new con.BFpiGHRD8
            con.IxbokG044 r10 = r5.dXrmkklc8
            con.UBY2Inzw8 r11 = r5.RG6kpfv3v
            con.UBY2Inzw8 r12 = r5.ixWaw2akD
            r13 = 0
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r9 = 0
            r7 = r4
            r8 = r6
            r10 = r14
            con.idpM54xlp.RG6kpfv3v(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0079:
            con.qih4lW99W r1 = con.qih4lW99W.q3BipwRCk
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: con.JXuUB1Rwu.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
