package con;
@jHNqfwCVd(c = "androidx.compose.material3.DefaultButtonElevation$animateElevation$3", f = "Button.kt", l = {919}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LFMiUx1B9 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ float Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ F7nWKUx7R dXrmkklc8;
    public final /* synthetic */ IxbokG044 ilHKhw3Yw;
    public final /* synthetic */ qC152syJB qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LFMiUx1B9(IxbokG044 ixbokG044, qC152syJB qc152syjb, float f, F7nWKUx7R f7nWKUx7R, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = ixbokG044;
        this.qVUwofr5s = qc152syjb;
        this.Eeka1udhb = f;
        this.dXrmkklc8 = f7nWKUx7R;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new LFMiUx1B9(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new LFMiUx1B9(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        if ((r12 instanceof con.jWApO2ugs) != false) goto L_0x0092;
     */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r12) {
        /*
            r11 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r11.MzoOEjc4X
            r2 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r2) goto L_0x000e
            con.anXlDk6fV.IytU16YUK(r12)
            goto L_0x00ba
        L_0x000e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0016:
            con.anXlDk6fV.IytU16YUK(r12)
            con.IxbokG044 r12 = r11.ilHKhw3Yw
            java.lang.Object r12 = r12.kCA6Zs9sL()
            con.lRwPpHNL9 r12 = (con.lRwPpHNL9) r12
            float r12 = r12.CBQ5d1kRq
            con.qC152syJB r1 = r11.qVUwofr5s
            float r1 = r1.J4Ux7ym32
            boolean r1 = con.lRwPpHNL9.q3BipwRCk(r12, r1)
            r3 = 0
            if (r1 == 0) goto L_0x0038
            con.UkUxUO2B6 r12 = new con.UkUxUO2B6
            con.JhpbRXxsg r1 = con.bRgfgYIQX.J4Ux7ym32
            long r4 = con.bRgfgYIQX.tGV7Q6urW
            r12.<init>(r4, r3)
            goto L_0x0059
        L_0x0038:
            con.qC152syJB r1 = r11.qVUwofr5s
            float r1 = r1.dIocxURUo
            boolean r1 = con.lRwPpHNL9.q3BipwRCk(r12, r1)
            if (r1 == 0) goto L_0x0048
            con.jIU70mpSo r12 = new con.jIU70mpSo
            r12.<init>()
            goto L_0x0059
        L_0x0048:
            con.qC152syJB r1 = r11.qVUwofr5s
            float r1 = r1.tGV7Q6urW
            boolean r12 = con.lRwPpHNL9.q3BipwRCk(r12, r1)
            if (r12 == 0) goto L_0x0058
            con.jWApO2ugs r12 = new con.jWApO2ugs
            r12.<init>()
            goto L_0x0059
        L_0x0058:
            r12 = r3
        L_0x0059:
            con.IxbokG044 r4 = r11.ilHKhw3Yw
            float r1 = r11.Eeka1udhb
            con.F7nWKUx7R r5 = r11.dXrmkklc8
            r11.MzoOEjc4X = r2
            con.VGh7XGpXv r2 = con.RApgEtg3Y.q3BipwRCk
            if (r5 == 0) goto L_0x007b
            boolean r12 = r5 instanceof con.UkUxUO2B6
            if (r12 == 0) goto L_0x006a
            goto L_0x0078
        L_0x006a:
            boolean r12 = r5 instanceof con.WrfOxY8G8
            if (r12 == 0) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            boolean r12 = r5 instanceof con.jIU70mpSo
            if (r12 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            boolean r12 = r5 instanceof con.jWApO2ugs
            if (r12 == 0) goto L_0x0095
        L_0x0078:
            con.VGh7XGpXv r3 = con.RApgEtg3Y.q3BipwRCk
            goto L_0x0095
        L_0x007b:
            if (r12 == 0) goto L_0x0095
            boolean r2 = r12 instanceof con.UkUxUO2B6
            if (r2 == 0) goto L_0x0082
            goto L_0x0092
        L_0x0082:
            boolean r2 = r12 instanceof con.WrfOxY8G8
            if (r2 == 0) goto L_0x0087
            goto L_0x0092
        L_0x0087:
            boolean r2 = r12 instanceof con.jIU70mpSo
            if (r2 == 0) goto L_0x008e
            con.VGh7XGpXv r12 = con.RApgEtg3Y.tGV7Q6urW
            goto L_0x0094
        L_0x008e:
            boolean r12 = r12 instanceof con.jWApO2ugs
            if (r12 == 0) goto L_0x0095
        L_0x0092:
            con.VGh7XGpXv r12 = con.RApgEtg3Y.J4Ux7ym32
        L_0x0094:
            r3 = r12
        L_0x0095:
            r6 = r3
            if (r6 == 0) goto L_0x00a9
            con.lRwPpHNL9 r5 = new con.lRwPpHNL9
            r5.<init>(r1)
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r12 = con.IxbokG044.tGV7Q6urW(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L_0x00b5
            goto L_0x00b7
        L_0x00a9:
            con.lRwPpHNL9 r12 = new con.lRwPpHNL9
            r12.<init>(r1)
            java.lang.Object r12 = r4.GPLPRo6go(r12, r11)
            if (r12 != r0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            con.qih4lW99W r12 = con.qih4lW99W.q3BipwRCk
        L_0x00b7:
            if (r12 != r0) goto L_0x00ba
            return r0
        L_0x00ba:
            con.qih4lW99W r12 = con.qih4lW99W.q3BipwRCk
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: con.LFMiUx1B9.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
