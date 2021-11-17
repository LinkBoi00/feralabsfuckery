package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class RCJ57erkK extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ boolean Bhmn1KIah;
    public final /* synthetic */ TB2AsrPRd MzoOEjc4X;
    public final /* synthetic */ eTxfvEx3L PSTqBLTET;
    public final /* synthetic */ PmanMZxiM ilHKhw3Yw;
    public final /* synthetic */ TI4Z69BNb kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCJ57erkK(TI4Z69BNb tI4Z69BNb, boolean z, eTxfvEx3L etxfvex3l, TB2AsrPRd tB2AsrPRd, PmanMZxiM pmanMZxiM) {
        super(3);
        this.kmSgne1rO = tI4Z69BNb;
        this.Bhmn1KIah = z;
        this.PSTqBLTET = etxfvex3l;
        this.MzoOEjc4X = tB2AsrPRd;
        this.ilHKhw3Yw = pmanMZxiM;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
            Objects.requireNonNull((zmrz5MjK1) this.kmSgne1rO);
        }
        if (!booleanValue) {
            Objects.requireNonNull((zmrz5MjK1) this.kmSgne1rO);
        }
        boolean z = false;
        if (this.Bhmn1KIah && !(intValue == czCYotiRn.yWvV4ePLl(this.PSTqBLTET.J4Ux7ym32) && intValue2 == czCYotiRn.dIocxURUo(this.PSTqBLTET.J4Ux7ym32))) {
            if ((intValue > intValue2 ? intValue2 : intValue) >= 0) {
                if ((intValue < intValue2 ? intValue2 : intValue) <= this.PSTqBLTET.q3BipwRCk.length()) {
                    if (booleanValue || intValue == intValue2) {
                        this.MzoOEjc4X.GPLPRo6go();
                    } else {
                        this.MzoOEjc4X.iiGwOFFnr();
                    }
                    this.ilHKhw3Yw.IytU16YUK(new eTxfvEx3L(this.PSTqBLTET.q3BipwRCk, ODug2UCW1.iiGwOFFnr(intValue, intValue2), (czCYotiRn) null, 4));
                    z = true;
                }
            }
            this.MzoOEjc4X.GPLPRo6go();
        }
        return Boolean.valueOf(z);
    }
}
