package con;
@jHNqfwCVd(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", f = "Focusable.kt", l = {102, 106, 108}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aCZv1ArEL extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RqP4RtdHY Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ nHAI4XIti dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ RNEcgN6dQ qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aCZv1ArEL(RNEcgN6dQ rNEcgN6dQ, RqP4RtdHY rqP4RtdHY, nHAI4XIti nhai4xiti, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = rNEcgN6dQ;
        this.Eeka1udhb = rqP4RtdHY;
        this.dXrmkklc8 = nhai4xiti;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new aCZv1ArEL(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new aCZv1ArEL(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[RETURN] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r9) {
        /*
            r8 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r8.ilHKhw3Yw
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0086
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001d:
            java.lang.Object r1 = r8.MzoOEjc4X
            con.jWApO2ugs r1 = (con.jWApO2ugs) r1
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0070
        L_0x0025:
            java.lang.Object r1 = r8.MzoOEjc4X
            con.RNEcgN6dQ r1 = (con.RNEcgN6dQ) r1
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0055
        L_0x002d:
            con.anXlDk6fV.IytU16YUK(r9)
            con.RNEcgN6dQ r9 = r8.qVUwofr5s
            con.prCJwNx2x r9 = (con.prCJwNx2x) r9
            java.lang.Object r9 = r9.getValue()
            con.jWApO2ugs r9 = (con.jWApO2ugs) r9
            if (r9 != 0) goto L_0x003d
            goto L_0x005b
        L_0x003d:
            con.RqP4RtdHY r1 = r8.Eeka1udhb
            con.RNEcgN6dQ r6 = r8.qVUwofr5s
            con.fLraXaWgb r7 = new con.fLraXaWgb
            r7.<init>(r9)
            if (r1 != 0) goto L_0x0049
            goto L_0x0056
        L_0x0049:
            r8.MzoOEjc4X = r6
            r8.ilHKhw3Yw = r4
            java.lang.Object r9 = r1.q3BipwRCk(r7, r8)
            if (r9 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r1 = r6
        L_0x0055:
            r6 = r1
        L_0x0056:
            con.prCJwNx2x r6 = (con.prCJwNx2x) r6
            r6.CBQ5d1kRq(r5)
        L_0x005b:
            con.jWApO2ugs r1 = new con.jWApO2ugs
            r1.<init>()
            con.RqP4RtdHY r9 = r8.Eeka1udhb
            if (r9 != 0) goto L_0x0065
            goto L_0x0070
        L_0x0065:
            r8.MzoOEjc4X = r1
            r8.ilHKhw3Yw = r3
            java.lang.Object r9 = r9.q3BipwRCk(r1, r8)
            if (r9 != r0) goto L_0x0070
            return r0
        L_0x0070:
            con.RNEcgN6dQ r9 = r8.qVUwofr5s
            con.prCJwNx2x r9 = (con.prCJwNx2x) r9
            r9.CBQ5d1kRq(r1)
            con.nHAI4XIti r9 = r8.dXrmkklc8
            r8.MzoOEjc4X = r5
            r8.ilHKhw3Yw = r2
            con.VyqlGpAAE r9 = (con.VyqlGpAAE) r9
            java.lang.Object r9 = r9.q3BipwRCk(r5, r8)
            if (r9 != r0) goto L_0x0086
            return r0
        L_0x0086:
            con.qih4lW99W r9 = con.qih4lW99W.q3BipwRCk
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: con.aCZv1ArEL.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
