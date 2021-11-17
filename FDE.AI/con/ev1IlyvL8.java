package con;
/* loaded from: classes.dex */
public abstract class ev1IlyvL8 extends xaeEKvU2c {
    public static final /* synthetic */ int MzoOEjc4X;
    public boolean Bhmn1KIah;
    public ETdSLSXRx PSTqBLTET;
    public long kmSgne1rO;

    public final void Bhmn1KIah(boolean z) {
        this.kmSgne1rO = vPSbyrYWX(z) + this.kmSgne1rO;
        if (!z) {
            this.Bhmn1KIah = true;
        }
    }

    public final void CBQ5d1kRq(cVJORDUgo cvjordugo) {
        ETdSLSXRx eTdSLSXRx = this.PSTqBLTET;
        if (eTdSLSXRx == null) {
            eTdSLSXRx = new ETdSLSXRx();
            this.PSTqBLTET = eTdSLSXRx;
        }
        Object[] objArr = eTdSLSXRx.q3BipwRCk;
        int i = eTdSLSXRx.tGV7Q6urW;
        objArr[i] = cvjordugo;
        int length = (objArr.length - 1) & (i + 1);
        eTdSLSXRx.tGV7Q6urW = length;
        int i2 = eTdSLSXRx.J4Ux7ym32;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            Jefa2ExbR.AqaWJg0b4(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = eTdSLSXRx.q3BipwRCk;
            int length3 = objArr3.length;
            int i3 = eTdSLSXRx.J4Ux7ym32;
            Jefa2ExbR.AqaWJg0b4(objArr3, objArr2, length3 - i3, 0, i3, 4);
            eTdSLSXRx.q3BipwRCk = objArr2;
            eTdSLSXRx.J4Ux7ym32 = 0;
            eTdSLSXRx.tGV7Q6urW = length2;
        }
    }

    public abstract long MzoOEjc4X();

    public final boolean PSTqBLTET() {
        return this.kmSgne1rO >= vPSbyrYWX(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean ilHKhw3Yw() {
        /*
            r7 = this;
            con.ETdSLSXRx r0 = r7.PSTqBLTET
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            int r2 = r0.J4Ux7ym32
            int r3 = r0.tGV7Q6urW
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            goto L_0x0022
        L_0x000f:
            java.lang.Object[] r3 = r0.q3BipwRCk
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.J4Ux7ym32 = r2
            java.lang.String r0 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            java.util.Objects.requireNonNull(r6, r0)
            r4 = r6
        L_0x0022:
            con.cVJORDUgo r4 = (con.cVJORDUgo) r4
            if (r4 != 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            r4.run()
            r1 = r5
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: con.ev1IlyvL8.ilHKhw3Yw():boolean");
    }

    public abstract Thread kmSgne1rO();

    public final void oon79WMrY(boolean z) {
        long vPSbyrYWX = this.kmSgne1rO - vPSbyrYWX(z);
        this.kmSgne1rO = vPSbyrYWX;
        if (vPSbyrYWX <= 0 && this.Bhmn1KIah) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final long vPSbyrYWX(boolean z) {
        return z ? 4294967296L : 1;
    }
}
