package con;

import java.util.Objects;
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
        ETdSLSXRx eTdSLSXRx = this.PSTqBLTET;
        if (eTdSLSXRx == null) {
            return false;
        }
        int i = eTdSLSXRx.J4Ux7ym32;
        cVJORDUgo cvjordugo = null;
        if (i != eTdSLSXRx.tGV7Q6urW) {
            ?? r3 = eTdSLSXRx.q3BipwRCk;
            ?? r6 = r3[i];
            r3[i] = 0;
            eTdSLSXRx.J4Ux7ym32 = (i + 1) & (r3.length - 1);
            Objects.requireNonNull(r6, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            cvjordugo = r6;
        }
        cVJORDUgo cvjordugo2 = cvjordugo;
        if (cvjordugo2 == null) {
            return false;
        }
        cvjordugo2.run();
        return true;
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
