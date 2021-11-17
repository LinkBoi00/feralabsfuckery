package con;

import java.util.List;
/* loaded from: classes.dex */
public final class ezCLJU3uo extends Wk9bO57s4 implements kkcQgCx5G {
    public final /* synthetic */ joIJ4ANvK Bhmn1KIah;
    public final /* synthetic */ int MzoOEjc4X;
    public final /* synthetic */ List PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezCLJU3uo(joIJ4ANvK joij4anvk, List list, int i, int i2) {
        super(2);
        this.kmSgne1rO = i2;
        if (i2 != 1) {
            this.Bhmn1KIah = joij4anvk;
            this.PSTqBLTET = list;
            this.MzoOEjc4X = i;
            return;
        }
        this.Bhmn1KIah = joij4anvk;
        this.PSTqBLTET = list;
        this.MzoOEjc4X = i;
        super(2);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        switch (this.kmSgne1rO) {
            case 0:
                rJ0s9PfCL rj0s9pfcl = (rJ0s9PfCL) obj;
                int intValue = ((Number) obj2).intValue();
                Object obj3 = G7WvUK4mQ.q3BipwRCk;
                if (((intValue & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j.i8XZMQc6Z()) {
                        wpxpbwg1j.igRQEZxnW();
                        return qih4lW99W.q3BipwRCk;
                    }
                }
                xL84NgKtE.q3BipwRCk(this.Bhmn1KIah, this.PSTqBLTET, rj0s9pfcl, (this.MzoOEjc4X & 14) | 64);
                return qih4lW99W.q3BipwRCk;
            default:
                ((Number) obj2).intValue();
                xL84NgKtE.q3BipwRCk(this.Bhmn1KIah, this.PSTqBLTET, (rJ0s9PfCL) obj, this.MzoOEjc4X | 1);
                return qih4lW99W.q3BipwRCk;
        }
    }
}
