package con;
/* loaded from: classes.dex */
public abstract class syekKyXqd {
    public static final Object Bhmn1KIah(eP3ZpMpES ep3zpmpes, long j, RqP4RtdHY rqP4RtdHY, RNEcgN6dQ rNEcgN6dQ, UBY2Inzw8 uBY2Inzw8, Way959ade way959ade) {
        Object yWvV4ePLl = D3DEikrvb.yWvV4ePLl(new Qg3exwSrr(ep3zpmpes, j, rqP4RtdHY, rNEcgN6dQ, uBY2Inzw8, null), way959ade);
        return yWvV4ePLl == kBKJSqCSL.COROUTINE_SUSPENDED ? yWvV4ePLl : qih4lW99W.q3BipwRCk;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(2:4|(4:6|8|47|(1:(1:(1:(2:13|14)(2:15|49))(5:16|17|31|22|(3:45|24|(1:26)(6:27|28|(1:30)|31|22|(2:43|44)(0)))(0)))(7:18|19|28|(0)|31|22|(0)(0)))(3:21|22|(0)(0))))|7|8|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
        r7 = r0;
        r0 = r8;
        r8 = r2;
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, con.xOpkxuRlw] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v13, types: [con.bu5cjmae6] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object CBQ5d1kRq(con.xOpkxuRlw r8, con.kkcQgCx5G r9, con.Way959ade r10) {
        /*
            boolean r0 = r10 instanceof con.AXc2OCJCC
            if (r0 == 0) goto L_0x0013
            r0 = r10
            con.AXc2OCJCC r0 = (con.AXc2OCJCC) r0
            int r1 = r0.Eeka1udhb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Eeka1udhb = r1
            goto L_0x0018
        L_0x0013:
            con.AXc2OCJCC r0 = new con.AXc2OCJCC
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.qVUwofr5s
            con.kBKJSqCSL r1 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r2 = r0.Eeka1udhb
            r3 = 1
            r4 = 2
            r5 = 3
            if (r2 == 0) goto L_0x005c
            if (r2 == r3) goto L_0x004a
            if (r2 == r4) goto L_0x003a
            if (r2 == r5) goto L_0x0031
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            java.lang.Object r8 = r0.PSTqBLTET
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8
            con.anXlDk6fV.IytU16YUK(r10)
            goto L_0x00ab
        L_0x003a:
            java.lang.Object r8 = r0.ilHKhw3Yw
            con.bu5cjmae6 r8 = (con.bu5cjmae6) r8
            java.lang.Object r9 = r0.MzoOEjc4X
            con.kkcQgCx5G r9 = (con.kkcQgCx5G) r9
            java.lang.Object r2 = r0.PSTqBLTET
            con.xOpkxuRlw r2 = (con.xOpkxuRlw) r2
            con.anXlDk6fV.IytU16YUK(r10)     // Catch: CancellationException -> 0x005a
            goto L_0x0087
        L_0x004a:
            java.lang.Object r8 = r0.ilHKhw3Yw
            con.bu5cjmae6 r8 = (con.bu5cjmae6) r8
            java.lang.Object r9 = r0.MzoOEjc4X
            con.kkcQgCx5G r9 = (con.kkcQgCx5G) r9
            java.lang.Object r2 = r0.PSTqBLTET
            con.xOpkxuRlw r2 = (con.xOpkxuRlw) r2
            con.anXlDk6fV.IytU16YUK(r10)     // Catch: CancellationException -> 0x005a
            goto L_0x0078
        L_0x005a:
            r10 = move-exception
            goto L_0x008a
        L_0x005c:
            con.anXlDk6fV.IytU16YUK(r10)
            con.bu5cjmae6 r10 = r0.Bhmn1KIah
        L_0x0061:
            boolean r2 = con.anXlDk6fV.qVUwofr5s(r10)
            if (r2 == 0) goto L_0x00b0
            r0.PSTqBLTET = r8     // Catch: CancellationException -> 0x008e
            r0.MzoOEjc4X = r9     // Catch: CancellationException -> 0x008e
            r0.ilHKhw3Yw = r10     // Catch: CancellationException -> 0x008e
            r0.Eeka1udhb = r3     // Catch: CancellationException -> 0x008e
            java.lang.Object r2 = r9.WaUP0CF08(r8, r0)     // Catch: CancellationException -> 0x008e
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r8
            r8 = r10
        L_0x0078:
            r0.PSTqBLTET = r2     // Catch: CancellationException -> 0x005a
            r0.MzoOEjc4X = r9     // Catch: CancellationException -> 0x005a
            r0.ilHKhw3Yw = r8     // Catch: CancellationException -> 0x005a
            r0.Eeka1udhb = r4     // Catch: CancellationException -> 0x005a
            java.lang.Object r10 = tGV7Q6urW(r2, r0)     // Catch: CancellationException -> 0x005a
            if (r10 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r10 = r8
            r8 = r2
            goto L_0x0061
        L_0x008a:
            r7 = r0
            r0 = r8
            r8 = r2
            goto L_0x0092
        L_0x008e:
            r2 = move-exception
            r7 = r0
            r0 = r10
            r10 = r2
        L_0x0092:
            r2 = r1
            r1 = r7
            boolean r6 = con.anXlDk6fV.qVUwofr5s(r0)
            if (r6 == 0) goto L_0x00ac
            r1.PSTqBLTET = r10
            r9 = 0
            r1.MzoOEjc4X = r9
            r1.ilHKhw3Yw = r9
            r1.Eeka1udhb = r5
            java.lang.Object r8 = tGV7Q6urW(r8, r1)
            if (r8 != r2) goto L_0x00aa
            return r2
        L_0x00aa:
            r8 = r10
        L_0x00ab:
            throw r8
        L_0x00ac:
            r10 = r0
            r0 = r1
            r1 = r2
            goto L_0x0061
        L_0x00b0:
            con.qih4lW99W r8 = con.qih4lW99W.q3BipwRCk
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: con.syekKyXqd.CBQ5d1kRq(con.xOpkxuRlw, con.kkcQgCx5G, con.Way959ade):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r8 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.kdbvrtBH1.RG2GI7LDp GPLPRo6go(con.kdbvrtBH1 r3, con.aVKpYNINy r4, java.lang.String r5, con.rJ0s9PfCL r6, int r7, int r8) {
        /*
            con.wpXpbWG1J r6 = (con.wpXpbWG1J) r6
            r7 = -44505534(0xfffffffffd58e642, float:-1.8019301E37)
            r6.zHl31GGXU(r7)
            java.lang.Object r7 = con.G7WvUK4mQ.q3BipwRCk
            r7 = r8 & 2
            if (r7 == 0) goto L_0x0010
            java.lang.String r5 = "DeferredAnimation"
        L_0x0010:
            r7 = -3686930(0xffffffffffc7bdee, float:NaN)
            r6.zHl31GGXU(r7)
            boolean r7 = r6.iiGwOFFnr(r3)
            java.lang.Object r8 = r6.dfpT1j18n()
            if (r7 != 0) goto L_0x0026
            int r7 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r7 = con.P7Re99G8L.J4Ux7ym32
            if (r8 != r7) goto L_0x002e
        L_0x0026:
            con.kdbvrtBH1$RG2GI7LDp r8 = new con.kdbvrtBH1$RG2GI7LDp
            r8.<init>(r4, r5)
            r6.INnK5Rew6(r8)
        L_0x002e:
            r4 = 0
            r6.ilHKhw3Yw(r4)
            con.kdbvrtBH1$RG2GI7LDp r8 = (con.kdbvrtBH1.RG2GI7LDp) r8
            con.BMKn6k4cx r5 = new con.BMKn6k4cx
            r5.<init>(r3, r8)
            con.gLDxq5bwv.q3BipwRCk(r8, r5, r6)
            boolean r3 = r3.GPLPRo6go()
            if (r3 == 0) goto L_0x0072
            con.kdbvrtBH1$RG2GI7LDp$RG2GI7LDp r3 = r8.tGV7Q6urW
            if (r3 != 0) goto L_0x0047
            goto L_0x0072
        L_0x0047:
            con.kdbvrtBH1 r5 = con.kdbvrtBH1.this
            con.kdbvrtBH1$mhl5lIdbQ r7 = r3.CBQ5d1kRq
            con.PmanMZxiM r0 = r3.Bhmn1KIah
            con.Vtytzr3yG r1 = r5.dIocxURUo()
            java.lang.Object r1 = r1.q3BipwRCk
            java.lang.Object r0 = r0.IytU16YUK(r1)
            con.PmanMZxiM r1 = r3.Bhmn1KIah
            con.Vtytzr3yG r2 = r5.dIocxURUo()
            java.lang.Object r2 = r2.J4Ux7ym32
            java.lang.Object r1 = r1.IytU16YUK(r2)
            con.PmanMZxiM r3 = r3.kmSgne1rO
            con.Vtytzr3yG r5 = r5.dIocxURUo()
            java.lang.Object r3 = r3.IytU16YUK(r5)
            con.B82vleiqp r3 = (con.B82vleiqp) r3
            r7.GPLPRo6go(r0, r1, r3)
        L_0x0072:
            r6.ilHKhw3Yw(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: con.syekKyXqd.GPLPRo6go(con.kdbvrtBH1, con.aVKpYNINy, java.lang.String, con.rJ0s9PfCL, int, int):con.kdbvrtBH1$RG2GI7LDp");
    }

    public static final long J4Ux7ym32(KqzoSSpJV kqzoSSpJV, long j) {
        return cT9gik1zL.iiGwOFFnr(j - ((long) 0), 0, (long) ((xHCS6bK6v) kqzoSSpJV).J4Ux7ym32);
    }

    public static BgIsSUB3d MzoOEjc4X(D3PUCzPxK d3PUCzPxK, BgIsSUB3d bgIsSUB3d, float f, boolean z, int i, Object obj) {
        int i2 = i & 2;
        boolean z2 = true;
        if (i2 != 0) {
            z = true;
        }
        if (((double) f) <= 0.0d) {
            z2 = false;
        }
        if (z2) {
            boolean z3 = Rjnc3TWC6.q3BipwRCk;
            return bgIsSUB3d.WaUP0CF08(new XvE91pIJo(f, z, f7B6YCXHx.kmSgne1rO));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    public static final kdbvrtBH1 PSTqBLTET(Object obj, String str, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(1641299376);
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 2) != 0) {
            str = null;
        }
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i3 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            dfpT1j18n = new kdbvrtBH1(new hObCm0yul(obj), str);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        kdbvrtBH1 kdbvrtbh1 = (kdbvrtBH1) dfpT1j18n;
        kdbvrtbh1.q3BipwRCk(obj, wpxpbwg1j, (i & 14) | (i & 8) | 48);
        gLDxq5bwv.q3BipwRCk(kdbvrtbh1, new OO5EOV5Xw(kdbvrtbh1, 1), wpxpbwg1j);
        wpxpbwg1j.ilHKhw3Yw(false);
        return kdbvrtbh1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.UBY2Inzw8 Puu3Rhg4F(con.kdbvrtBH1 r7, java.lang.Object r8, java.lang.Object r9, con.B82vleiqp r10, con.aVKpYNINy r11, java.lang.String r12, con.rJ0s9PfCL r13, int r14) {
        /*
            con.wpXpbWG1J r13 = (con.wpXpbWG1J) r13
            r14 = 460682138(0x1b75739a, float:2.0303278E-22)
            r13.zHl31GGXU(r14)
            java.lang.Object r14 = con.G7WvUK4mQ.q3BipwRCk
            r14 = -3686930(0xffffffffffc7bdee, float:NaN)
            r13.zHl31GGXU(r14)
            boolean r14 = r13.iiGwOFFnr(r7)
            java.lang.Object r0 = r13.dfpT1j18n()
            if (r14 != 0) goto L_0x0020
            int r14 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r14 = con.P7Re99G8L.J4Ux7ym32
            if (r0 != r14) goto L_0x0031
        L_0x0020:
            con.kdbvrtBH1$mhl5lIdbQ r0 = new con.kdbvrtBH1$mhl5lIdbQ
            con.jOCYbBWA4 r4 = con.iM0DCUL8r.dIocxURUo(r11, r9)
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r3, r4, r5, r6)
            r13.INnK5Rew6(r0)
        L_0x0031:
            r11 = 0
            r13.ilHKhw3Yw(r11)
            con.kdbvrtBH1$mhl5lIdbQ r0 = (con.kdbvrtBH1.mhl5lIdbQ) r0
            boolean r12 = r7.GPLPRo6go()
            if (r12 == 0) goto L_0x0041
            r0.GPLPRo6go(r8, r9, r10)
            goto L_0x0044
        L_0x0041:
            r0.Puu3Rhg4F(r9, r10)
        L_0x0044:
            con.BMKn6k4cx r8 = new con.BMKn6k4cx
            r8.<init>(r7, r0)
            con.gLDxq5bwv.q3BipwRCk(r0, r8, r13)
            r13.ilHKhw3Yw(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.syekKyXqd.Puu3Rhg4F(con.kdbvrtBH1, java.lang.Object, java.lang.Object, con.B82vleiqp, con.aVKpYNINy, java.lang.String, con.rJ0s9PfCL, int):con.UBY2Inzw8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if ((!r8) == false) goto L_0x005d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r0.PSTqBLTET = r7;
        r0.ilHKhw3Yw = 1;
        r8 = r7.J4Ux7ym32(3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r8 != r1) goto L_0x0069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r8 == false) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        return con.qih4lW99W.q3BipwRCk;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object dIocxURUo(con.k0ugT26MT r7, con.Way959ade r8) {
        /*
            boolean r0 = r8 instanceof con.JxahHKdGu
            if (r0 == 0) goto L_0x0013
            r0 = r8
            con.JxahHKdGu r0 = (con.JxahHKdGu) r0
            int r1 = r0.ilHKhw3Yw
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.ilHKhw3Yw = r1
            goto L_0x0018
        L_0x0013:
            con.JxahHKdGu r0 = new con.JxahHKdGu
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.MzoOEjc4X
            con.kBKJSqCSL r1 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r2 = r0.ilHKhw3Yw
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r7 = r0.PSTqBLTET
            con.k0ugT26MT r7 = (con.k0ugT26MT) r7
            con.anXlDk6fV.IytU16YUK(r8)
            goto L_0x0069
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            con.anXlDk6fV.IytU16YUK(r8)
            con.ztvmwA530 r8 = r7.MzoOEjc4X
            con.v7oWlY5Vu r8 = r8.PSTqBLTET
            java.util.List r8 = r8.q3BipwRCk
            int r2 = r8.size()
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0059
            r5 = r3
        L_0x0046:
            int r6 = r5 + 1
            java.lang.Object r5 = r8.get(r5)
            con.cKAQplqZy r5 = (con.cKAQplqZy) r5
            boolean r5 = r5.dIocxURUo
            if (r5 == 0) goto L_0x0054
            r8 = r4
            goto L_0x005a
        L_0x0054:
            if (r6 <= r2) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r5 = r6
            goto L_0x0046
        L_0x0059:
            r8 = r3
        L_0x005a:
            r8 = r8 ^ r4
            if (r8 != 0) goto L_0x008c
        L_0x005d:
            r8 = 3
            r0.PSTqBLTET = r7
            r0.ilHKhw3Yw = r4
            java.lang.Object r8 = r7.J4Ux7ym32(r8, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            con.v7oWlY5Vu r8 = (con.v7oWlY5Vu) r8
            java.util.List r8 = r8.q3BipwRCk
            int r2 = r8.size()
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0089
            r5 = r3
        L_0x0076:
            int r6 = r5 + 1
            java.lang.Object r5 = r8.get(r5)
            con.cKAQplqZy r5 = (con.cKAQplqZy) r5
            boolean r5 = r5.dIocxURUo
            if (r5 == 0) goto L_0x0084
            r8 = r4
            goto L_0x008a
        L_0x0084:
            if (r6 <= r2) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r5 = r6
            goto L_0x0076
        L_0x0089:
            r8 = r3
        L_0x008a:
            if (r8 != 0) goto L_0x005d
        L_0x008c:
            con.qih4lW99W r7 = con.qih4lW99W.q3BipwRCk
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: con.syekKyXqd.dIocxURUo(con.k0ugT26MT, con.Way959ade):java.lang.Object");
    }

    public static final jOCYbBWA4 iiGwOFFnr(jOCYbBWA4 jocybbwa4) {
        jOCYbBWA4 tGV7Q6urW = jocybbwa4.tGV7Q6urW();
        int i = 0;
        int J4Ux7ym32 = tGV7Q6urW.J4Ux7ym32();
        if (J4Ux7ym32 > 0) {
            while (true) {
                int i2 = i + 1;
                tGV7Q6urW.kCA6Zs9sL(i, jocybbwa4.q3BipwRCk(i));
                if (i2 >= J4Ux7ym32) {
                    break;
                }
                i = i2;
            }
        }
        return tGV7Q6urW;
    }

    public static final BgIsSUB3d kCA6Zs9sL(BgIsSUB3d bgIsSUB3d, RqP4RtdHY rqP4RtdHY, D9Yt6oHyO d9Yt6oHyO, boolean z, String str, qDffvYFss qdffvyfss, gdEmqfwpT gdemqfwpt) {
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        return gThLCaTO1.vPSbyrYWX(bgIsSUB3d, f7B6YCXHx.kmSgne1rO, new sW2p9XRN8(gdemqfwpt, z, rqP4RtdHY, d9Yt6oHyO, str, qdffvyfss));
    }

    public static final BgIsSUB3d kmSgne1rO(BgIsSUB3d bgIsSUB3d, BgIsSUB3d bgIsSUB3d2, RqP4RtdHY rqP4RtdHY, D9Yt6oHyO d9Yt6oHyO, boolean z, String str, qDffvYFss qdffvyfss, String str2, gdEmqfwpT gdemqfwpt, gdEmqfwpT gdemqfwpt2) {
        BgIsSUB3d ixWaw2akD = pA5wCkne4.ixWaw2akD(bgIsSUB3d, true, new IHBpRofnm(qdffvyfss, str, gdemqfwpt, str2, z, gdemqfwpt2));
        Rw4XnMufa rw4XnMufa = new Rw4XnMufa(z, gdemqfwpt2);
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        f7B6YCXHx f7b6ycxhx = f7B6YCXHx.kmSgne1rO;
        int i = BgIsSUB3d.Puu3Rhg4F;
        BgIsSUB3d q3BipwRCk = Rjnc3TWC6.q3BipwRCk(ixWaw2akD, f7b6ycxhx, new Awlb99mXV(rw4XnMufa, null));
        hOY2Rgtej hoy2rgtej = Da6U4hKvb.q3BipwRCk;
        return gThLCaTO1.vPSbyrYWX(gThLCaTO1.vPSbyrYWX(gThLCaTO1.vPSbyrYWX(q3BipwRCk, f7b6ycxhx, new ghqvDXzkf(d9Yt6oHyO, rqP4RtdHY)), f7b6ycxhx, new wnsMyABxC(rqP4RtdHY, z, 2)), f7b6ycxhx, new wnsMyABxC(z, rqP4RtdHY)).WaUP0CF08(bgIsSUB3d2);
    }

    public static final Object oon79WMrY(xOpkxuRlw xopkxurlw, NUBOYYpO5 nUBOYYpO5, Way959ade way959ade) {
        ZIZEAqpMZ zIZEAqpMZ = new ZIZEAqpMZ(nUBOYYpO5, 1);
        FSaHDwAVT fSaHDwAVT = new FSaHDwAVT(nUBOYYpO5, 2);
        FSaHDwAVT fSaHDwAVT2 = new FSaHDwAVT(nUBOYYpO5, 3);
        VTjO0eiEZ vTjO0eiEZ = new VTjO0eiEZ(nUBOYYpO5, 1);
        float f = ZEpQDovLv.q3BipwRCk;
        Object CBQ5d1kRq = CBQ5d1kRq(xopkxurlw, new lysLFLqUJ(zIZEAqpMZ, vTjO0eiEZ, fSaHDwAVT2, fSaHDwAVT, null), way959ade);
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        if (CBQ5d1kRq != kbkjsqcsl) {
            CBQ5d1kRq = qih4lW99W.q3BipwRCk;
        }
        if (CBQ5d1kRq == kbkjsqcsl) {
            return CBQ5d1kRq;
        }
        return qih4lW99W.q3BipwRCk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r2 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0063;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(con.RqP4RtdHY r4, con.RNEcgN6dQ r5, con.rJ0s9PfCL r6, int r7) {
        /*
            con.wpXpbWG1J r6 = (con.wpXpbWG1J) r6
            r0 = 1115975634(0x42846fd2, float:66.2184)
            r6.ziwPzaoF3(r0)
            java.lang.Object r0 = con.G7WvUK4mQ.q3BipwRCk
            r0 = r7 & 14
            if (r0 != 0) goto L_0x001c
            r0 = r6
            con.wpXpbWG1J r0 = (con.wpXpbWG1J) r0
            boolean r0 = r0.iiGwOFFnr(r4)
            if (r0 == 0) goto L_0x0019
            r0 = 4
            goto L_0x001a
        L_0x0019:
            r0 = 2
        L_0x001a:
            r0 = r0 | r7
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r1 = r7 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0030
            r1 = r6
            con.wpXpbWG1J r1 = (con.wpXpbWG1J) r1
            boolean r1 = r1.iiGwOFFnr(r5)
            if (r1 == 0) goto L_0x002d
            r1 = 32
            goto L_0x002f
        L_0x002d:
            r1 = 16
        L_0x002f:
            r0 = r0 | r1
        L_0x0030:
            r0 = r0 & 91
            r0 = r0 ^ 18
            if (r0 != 0) goto L_0x0044
            r0 = r6
            con.wpXpbWG1J r0 = (con.wpXpbWG1J) r0
            boolean r1 = r0.i8XZMQc6Z()
            if (r1 != 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            r0.igRQEZxnW()
            goto L_0x0073
        L_0x0044:
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r1 = r6
            con.wpXpbWG1J r1 = (con.wpXpbWG1J) r1
            r1.zHl31GGXU(r0)
            boolean r0 = r1.iiGwOFFnr(r5)
            boolean r2 = r1.iiGwOFFnr(r4)
            r0 = r0 | r2
            java.lang.Object r2 = r1.dfpT1j18n()
            r3 = 0
            if (r0 != 0) goto L_0x0063
            int r0 = con.rJ0s9PfCL.q3BipwRCk
            java.lang.Object r0 = con.P7Re99G8L.J4Ux7ym32
            if (r2 != r0) goto L_0x006b
        L_0x0063:
            con.dE9Gm2VH2 r2 = new con.dE9Gm2VH2
            r2.<init>(r5, r4, r3)
            r1.INnK5Rew6(r2)
        L_0x006b:
            r1.ilHKhw3Yw(r3)
            con.PmanMZxiM r2 = (con.PmanMZxiM) r2
            con.gLDxq5bwv.q3BipwRCk(r4, r2, r6)
        L_0x0073:
            con.wpXpbWG1J r6 = (con.wpXpbWG1J) r6
            con.rESgwfV20 r6 = r6.Eeka1udhb()
            if (r6 != 0) goto L_0x007c
            goto L_0x0083
        L_0x007c:
            con.oJ0LPfEQB r0 = new con.oJ0LPfEQB
            r0.<init>(r4, r5, r7)
            r6.dIocxURUo = r0
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.syekKyXqd.q3BipwRCk(con.RqP4RtdHY, con.RNEcgN6dQ, con.rJ0s9PfCL, int):void");
    }

    public static final Object tGV7Q6urW(xOpkxuRlw xopkxurlw, Way959ade way959ade) {
        Object cAwN510t2 = ((ztvmwA530) xopkxurlw).cAwN510t2(new VyJHLfVWj(null), way959ade);
        return cAwN510t2 == kBKJSqCSL.COROUTINE_SUSPENDED ? cAwN510t2 : qih4lW99W.q3BipwRCk;
    }

    public static final long vPSbyrYWX(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return ODug2UCW1.iiGwOFFnr(i, i);
        }
        if (i == 0) {
            return z ? ODug2UCW1.iiGwOFFnr(1, 0) : ODug2UCW1.iiGwOFFnr(0, 1);
        }
        if (i == i2) {
            int i3 = i2 - 1;
            return z ? ODug2UCW1.iiGwOFFnr(i3, i2) : ODug2UCW1.iiGwOFFnr(i2, i3);
        } else if (z) {
            return ODug2UCW1.iiGwOFFnr(!z2 ? i - 1 : i + 1, i);
        } else {
            return ODug2UCW1.iiGwOFFnr(i, !z2 ? i + 1 : i - 1);
        }
    }

    public static final Object yWvV4ePLl(xOpkxuRlw xopkxurlw, NUBOYYpO5 nUBOYYpO5, Way959ade way959ade) {
        ZIZEAqpMZ zIZEAqpMZ = new ZIZEAqpMZ(nUBOYYpO5, 0);
        FSaHDwAVT fSaHDwAVT = new FSaHDwAVT(nUBOYYpO5, 0);
        FSaHDwAVT fSaHDwAVT2 = new FSaHDwAVT(nUBOYYpO5, 1);
        VTjO0eiEZ vTjO0eiEZ = new VTjO0eiEZ(nUBOYYpO5, 0);
        float f = ZEpQDovLv.q3BipwRCk;
        Object CBQ5d1kRq = CBQ5d1kRq(xopkxurlw, new UbUzWfT3B(zIZEAqpMZ, fSaHDwAVT2, fSaHDwAVT, vTjO0eiEZ, null), way959ade);
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        if (CBQ5d1kRq != kbkjsqcsl) {
            CBQ5d1kRq = qih4lW99W.q3BipwRCk;
        }
        if (CBQ5d1kRq == kbkjsqcsl) {
            return CBQ5d1kRq;
        }
        return qih4lW99W.q3BipwRCk;
    }
}
