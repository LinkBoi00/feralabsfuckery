package con;
@jHNqfwCVd(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {100, 102, 103}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f74vhiLE6 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RqP4RtdHY Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ RNEcgN6dQ dXrmkklc8;
    public int ilHKhw3Yw;
    public /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f74vhiLE6(RqP4RtdHY rqP4RtdHY, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = rqP4RtdHY;
        this.dXrmkklc8 = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        f74vhiLE6 f74vhile6 = new f74vhiLE6(this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2);
        f74vhile6.qVUwofr5s = (xOpkxuRlw) obj;
        return f74vhile6.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        f74vhiLE6 f74vhile6 = new f74vhiLE6(this.Eeka1udhb, this.dXrmkklc8, way959ade);
        f74vhile6.qVUwofr5s = obj;
        return f74vhile6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r10) {
        /*
            r9 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r9.ilHKhw3Yw
            r2 = 1
            r3 = 2
            r4 = 3
            if (r1 == 0) goto L_0x0034
            if (r1 == r2) goto L_0x0024
            if (r1 == r3) goto L_0x0018
            if (r1 != r4) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0018:
            java.lang.Object r1 = r9.MzoOEjc4X
            con.bu5cjmae6 r1 = (con.bu5cjmae6) r1
            java.lang.Object r5 = r9.qVUwofr5s
            con.xOpkxuRlw r5 = (con.xOpkxuRlw) r5
            con.anXlDk6fV.IytU16YUK(r10)
            goto L_0x003e
        L_0x0024:
            java.lang.Object r1 = r9.MzoOEjc4X
            con.bu5cjmae6 r1 = (con.bu5cjmae6) r1
            java.lang.Object r5 = r9.qVUwofr5s
            con.xOpkxuRlw r5 = (con.xOpkxuRlw) r5
            con.anXlDk6fV.IytU16YUK(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x0060
        L_0x0034:
            con.anXlDk6fV.IytU16YUK(r10)
            java.lang.Object r10 = r9.qVUwofr5s
            r5 = r10
            con.xOpkxuRlw r5 = (con.xOpkxuRlw) r5
            con.bu5cjmae6 r1 = r9.Bhmn1KIah
        L_0x003e:
            r10 = r9
        L_0x003f:
            boolean r6 = con.anXlDk6fV.qVUwofr5s(r1)
            if (r6 == 0) goto L_0x009d
            con.F9gk6VRdh r6 = new con.F9gk6VRdh
            r7 = 0
            r6.<init>(r7)
            r10.qVUwofr5s = r5
            r10.MzoOEjc4X = r1
            r10.ilHKhw3Yw = r2
            con.ztvmwA530 r5 = (con.ztvmwA530) r5
            java.lang.Object r6 = r5.cAwN510t2(r6, r10)
            if (r6 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L_0x0060:
            con.v7oWlY5Vu r10 = (con.v7oWlY5Vu) r10
            int r10 = r10.dIocxURUo
            con.ksLrMHgEz r7 = con.b5RwVV7V3.q3BipwRCk
            con.ksLrMHgEz r7 = con.b5RwVV7V3.q3BipwRCk
            r7 = 4
            boolean r7 = con.b5RwVV7V3.q3BipwRCk(r10, r7)
            if (r7 == 0) goto L_0x0080
            con.RqP4RtdHY r10 = r0.Eeka1udhb
            con.RNEcgN6dQ r7 = r0.dXrmkklc8
            r0.qVUwofr5s = r6
            r0.MzoOEjc4X = r5
            r0.ilHKhw3Yw = r3
            java.lang.Object r10 = con.wnsMyABxC.q3BipwRCk(r10, r7, r0)
            if (r10 != r1) goto L_0x0098
            return r1
        L_0x0080:
            r7 = 5
            boolean r10 = con.b5RwVV7V3.q3BipwRCk(r10, r7)
            if (r10 == 0) goto L_0x0098
            con.RNEcgN6dQ r10 = r0.dXrmkklc8
            con.RqP4RtdHY r7 = r0.Eeka1udhb
            r0.qVUwofr5s = r6
            r0.MzoOEjc4X = r5
            r0.ilHKhw3Yw = r4
            java.lang.Object r10 = con.wnsMyABxC.J4Ux7ym32(r10, r7, r0)
            if (r10 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r10 = r0
            r0 = r1
            r1 = r5
            r5 = r6
            goto L_0x003f
        L_0x009d:
            con.qih4lW99W r10 = con.qih4lW99W.q3BipwRCk
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: con.f74vhiLE6.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
