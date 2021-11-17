package con;
/* loaded from: classes.dex */
public final class VyqlGpAAE implements nHAI4XIti {
    public final pnuAOe8oh q3BipwRCk = new pnuAOe8oh(new dyRLRaL1h[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r13 < r2) goto L_0x004b;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.Object q3BipwRCk(con.bzmJZsHMu r13, con.Way959ade r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof con.s0SiaT1EL
            if (r0 == 0) goto L_0x0013
            r0 = r14
            con.s0SiaT1EL r0 = (con.s0SiaT1EL) r0
            int r1 = r0.RG6kpfv3v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.RG6kpfv3v = r1
            goto L_0x0018
        L_0x0013:
            con.s0SiaT1EL r0 = new con.s0SiaT1EL
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.Eeka1udhb
            con.kBKJSqCSL r1 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r2 = r0.RG6kpfv3v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            int r13 = r0.qVUwofr5s
            int r2 = r0.ilHKhw3Yw
            java.lang.Object r5 = r0.MzoOEjc4X
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r6 = r0.PSTqBLTET
            con.bzmJZsHMu r6 = (con.bzmJZsHMu) r6
            con.anXlDk6fV.IytU16YUK(r14)
            goto L_0x00b0
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003d:
            con.anXlDk6fV.IytU16YUK(r14)
            con.pnuAOe8oh r14 = r12.q3BipwRCk
            int r2 = r14.Bhmn1KIah
            if (r2 <= 0) goto L_0x00b4
            java.lang.Object[] r14 = r14.CBQ5d1kRq
            r5 = r14
            r14 = r13
            r13 = r3
        L_0x004b:
            r6 = r5[r13]
            con.dyRLRaL1h r6 = (con.dyRLRaL1h) r6
            con.mnTaxtMa7 r7 = r6.tGV7Q6urW
            if (r7 == 0) goto L_0x00b1
            r8 = r7
            con.qhaZGYFO8 r8 = (con.qhaZGYFO8) r8
            boolean r9 = r8.oesmsHQJU()
            if (r9 != 0) goto L_0x005d
            goto L_0x00b1
        L_0x005d:
            if (r14 != 0) goto L_0x006a
            long r8 = r8.Bhmn1KIah
            long r8 = con.D3DEikrvb.i8XZMQc6Z(r8)
            con.bzmJZsHMu r8 = con.gThLCaTO1.dfpT1j18n(r8)
            goto L_0x006b
        L_0x006a:
            r8 = r14
        L_0x006b:
            con.GfYKj7jWp r9 = r6.J4Ux7ym32
            con.bzmJZsHMu r7 = r9.tGV7Q6urW(r8, r7)
            con.GfYKj7jWp r8 = r6.J4Ux7ym32
            con.ihHXPsZgG r9 = con.GfYKj7jWp.J4Ux7ym32
            java.util.Objects.requireNonNull(r9)
            con.GfYKj7jWp r9 = con.ihHXPsZgG.tGV7Q6urW
            boolean r8 = con.anXlDk6fV.tGV7Q6urW(r8, r9)
            if (r8 == 0) goto L_0x009c
            con.G9VdDqs1M r6 = r6.q3BipwRCk
            android.view.View r6 = r6.q3BipwRCk
            if (r6 != 0) goto L_0x0087
            goto L_0x00b1
        L_0x0087:
            android.graphics.Rect r8 = new android.graphics.Rect
            float r9 = r7.q3BipwRCk
            int r9 = (int) r9
            float r10 = r7.J4Ux7ym32
            int r10 = (int) r10
            float r11 = r7.tGV7Q6urW
            int r11 = (int) r11
            float r7 = r7.dIocxURUo
            int r7 = (int) r7
            r8.<init>(r9, r10, r11, r7)
            r6.requestRectangleOnScreen(r8, r3)
            goto L_0x00b1
        L_0x009c:
            con.GfYKj7jWp r6 = r6.J4Ux7ym32
            r0.PSTqBLTET = r14
            r0.MzoOEjc4X = r5
            r0.ilHKhw3Yw = r2
            r0.qVUwofr5s = r13
            r0.RG6kpfv3v = r4
            java.lang.Object r6 = r6.q3BipwRCk(r7, r0)
            if (r6 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r6 = r14
        L_0x00b0:
            r14 = r6
        L_0x00b1:
            int r13 = r13 + r4
            if (r13 < r2) goto L_0x004b
        L_0x00b4:
            con.qih4lW99W r13 = con.qih4lW99W.q3BipwRCk
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: con.VyqlGpAAE.q3BipwRCk(con.bzmJZsHMu, con.Way959ade):java.lang.Object");
    }
}
