package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class xGT7Yc8ED extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ int Bhmn1KIah;
    public final /* synthetic */ float PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xGT7Yc8ED(int i, float f, int i2) {
        super(1);
        this.kmSgne1rO = i2;
        if (i2 != 1) {
            this.Bhmn1KIah = i;
            this.PSTqBLTET = f;
            return;
        }
        this.Bhmn1KIah = i;
        this.PSTqBLTET = f;
        super(1);
    }

    @Override // con.PmanMZxiM
    public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk((A2fLYD2UL) obj);
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk((A2fLYD2UL) obj);
                return qih4lW99W.q3BipwRCk;
        }
    }

    public final void q3BipwRCk(A2fLYD2UL a2fLYD2UL) {
        switch (this.kmSgne1rO) {
            case 0:
                auO4JQva1 tGV7Q6urW = a2fLYD2UL.tGV7Q6urW(Integer.valueOf(this.Bhmn1KIah), 1);
                float f = this.PSTqBLTET;
                BFRsKhrQv bFRsKhrQv = a2fLYD2UL.Puu3Rhg4F;
                Objects.requireNonNull(bFRsKhrQv);
                if (bFRsKhrQv == BFRsKhrQv.Ltr) {
                    tGV7Q6urW.kCA6Zs9sL(f);
                    return;
                } else {
                    tGV7Q6urW.kCA6Zs9sL(1.0f - f);
                    return;
                }
            default:
                a2fLYD2UL.tGV7Q6urW(Integer.valueOf(this.Bhmn1KIah), 0).kCA6Zs9sL(this.PSTqBLTET);
                return;
        }
    }
}
