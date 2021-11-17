package con;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {211, 217}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Jq0ha9rVu extends xBFrXAfL4 implements kkcQgCx5G {
    public int Bhmn1KIah;
    public final /* synthetic */ PmanMZxiM Eeka1udhb;
    public final /* synthetic */ NzvP5Rex8 MzoOEjc4X;
    public /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ oQkvjGXIr ilHKhw3Yw;
    public final /* synthetic */ eP3ZpMpES qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jq0ha9rVu(NzvP5Rex8 nzvP5Rex8, oQkvjGXIr oqkvjgxir, eP3ZpMpES ep3zpmpes, PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = nzvP5Rex8;
        this.ilHKhw3Yw = oqkvjgxir;
        this.qVUwofr5s = ep3zpmpes;
        this.Eeka1udhb = pmanMZxiM;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        Jq0ha9rVu jq0ha9rVu = new Jq0ha9rVu(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        jq0ha9rVu.PSTqBLTET = (k0ugT26MT) obj;
        return jq0ha9rVu.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        Jq0ha9rVu jq0ha9rVu = new Jq0ha9rVu(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
        jq0ha9rVu.PSTqBLTET = obj;
        return jq0ha9rVu;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r13) {
        /*
            r12 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r12.Bhmn1KIah
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            con.anXlDk6fV.IytU16YUK(r13)
            goto L_0x005b
        L_0x0010:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0018:
            java.lang.Object r1 = r12.PSTqBLTET
            con.k0ugT26MT r1 = (con.k0ugT26MT) r1
            con.anXlDk6fV.IytU16YUK(r13)
            goto L_0x0034
        L_0x0020:
            con.anXlDk6fV.IytU16YUK(r13)
            java.lang.Object r13 = r12.PSTqBLTET
            r1 = r13
            con.k0ugT26MT r1 = (con.k0ugT26MT) r1
            r13 = 0
            r12.PSTqBLTET = r1
            r12.Bhmn1KIah = r3
            java.lang.Object r13 = con.fpplAiKys.tGV7Q6urW(r1, r13, r12, r3)
            if (r13 != r0) goto L_0x0034
            return r0
        L_0x0034:
            con.cKAQplqZy r13 = (con.cKAQplqZy) r13
            con.ODug2UCW1.Bhmn1KIah(r13)
            con.NzvP5Rex8 r3 = r12.MzoOEjc4X
            con.NzvP5Rex8 r4 = con.fpplAiKys.q3BipwRCk
            r5 = 0
            if (r3 == r4) goto L_0x0050
            con.oQkvjGXIr r6 = r12.ilHKhw3Yw
            r7 = 0
            con.Ixy1MDmHH r9 = new con.Ixy1MDmHH
            con.eP3ZpMpES r4 = r12.qVUwofr5s
            r9.<init>(r3, r4, r13, r5)
            r10 = 3
            r11 = 0
            r8 = 0
            con.idpM54xlp.RG6kpfv3v(r6, r7, r8, r9, r10, r11)
        L_0x0050:
            r12.PSTqBLTET = r5
            r12.Bhmn1KIah = r2
            java.lang.Object r13 = con.fpplAiKys.iiGwOFFnr(r1, r12)
            if (r13 != r0) goto L_0x005b
            return r0
        L_0x005b:
            con.cKAQplqZy r13 = (con.cKAQplqZy) r13
            if (r13 != 0) goto L_0x0065
            con.eP3ZpMpES r13 = r12.qVUwofr5s
            r13.J4Ux7ym32()
            goto L_0x007c
        L_0x0065:
            con.ODug2UCW1.Bhmn1KIah(r13)
            con.eP3ZpMpES r0 = r12.qVUwofr5s
            r0.dIocxURUo()
            con.PmanMZxiM r0 = r12.Eeka1udhb
            if (r0 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            long r1 = r13.tGV7Q6urW
            con.bRgfgYIQX r13 = new con.bRgfgYIQX
            r13.<init>(r1)
            r0.IytU16YUK(r13)
        L_0x007c:
            con.qih4lW99W r13 = con.qih4lW99W.q3BipwRCk
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Jq0ha9rVu.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
