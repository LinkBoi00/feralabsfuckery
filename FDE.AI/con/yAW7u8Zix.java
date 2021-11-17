package con;

import java.util.List;
/* loaded from: classes.dex */
public final class yAW7u8Zix extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ m9rQR66pK Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yAW7u8Zix(m9rQR66pK m9rqr66pk, int i) {
        super(0);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = m9rqr66pk;
            return;
        }
        this.Bhmn1KIah = m9rqr66pk;
        super(0);
    }

    @Override // con.gdEmqfwpT
    public /* bridge */ /* synthetic */ Object GPLPRo6go() {
        switch (this.kmSgne1rO) {
            case 0:
                return q3BipwRCk();
            default:
                return q3BipwRCk();
        }
    }

    public final Float q3BipwRCk() {
        int i = 1;
        float f = 0.0f;
        Object obj = null;
        switch (this.kmSgne1rO) {
            case 0:
                List list = this.Bhmn1KIah.kCA6Zs9sL;
                if (!list.isEmpty()) {
                    obj = list.get(0);
                    float J4Ux7ym32 = ((FNRS7AIqa) obj).q3BipwRCk.J4Ux7ym32();
                    int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(list);
                    if (1 <= CBQ5d1kRq) {
                        while (true) {
                            int i2 = i + 1;
                            Object obj2 = list.get(i);
                            float J4Ux7ym322 = ((FNRS7AIqa) obj2).q3BipwRCk.J4Ux7ym32();
                            if (Float.compare(J4Ux7ym32, J4Ux7ym322) < 0) {
                                obj = obj2;
                                J4Ux7ym32 = J4Ux7ym322;
                            }
                            if (i != CBQ5d1kRq) {
                                i = i2;
                            }
                        }
                    }
                }
                FNRS7AIqa fNRS7AIqa = (FNRS7AIqa) obj;
                if (fNRS7AIqa != null) {
                    f = fNRS7AIqa.q3BipwRCk.J4Ux7ym32();
                }
                return Float.valueOf(f);
            default:
                List list2 = this.Bhmn1KIah.kCA6Zs9sL;
                if (!list2.isEmpty()) {
                    obj = list2.get(0);
                    float q3BipwRCk = ((FNRS7AIqa) obj).q3BipwRCk.q3BipwRCk();
                    int CBQ5d1kRq2 = idpM54xlp.CBQ5d1kRq(list2);
                    if (1 <= CBQ5d1kRq2) {
                        while (true) {
                            int i3 = i + 1;
                            Object obj3 = list2.get(i);
                            float q3BipwRCk2 = ((FNRS7AIqa) obj3).q3BipwRCk.q3BipwRCk();
                            if (Float.compare(q3BipwRCk, q3BipwRCk2) < 0) {
                                obj = obj3;
                                q3BipwRCk = q3BipwRCk2;
                            }
                            if (i != CBQ5d1kRq2) {
                                i = i3;
                            }
                        }
                    }
                }
                FNRS7AIqa fNRS7AIqa2 = (FNRS7AIqa) obj;
                if (fNRS7AIqa2 != null) {
                    f = fNRS7AIqa2.q3BipwRCk.q3BipwRCk();
                }
                return Float.valueOf(f);
        }
    }
}
