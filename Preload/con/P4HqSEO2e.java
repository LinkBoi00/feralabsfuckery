package con;

import com.feravolt.preload.MainActivity;
import java.util.List;
/* loaded from: classes.dex */
public final class P4HqSEO2e extends Wk9bO57s4 implements IonfNvcm2 {
    public final /* synthetic */ MainActivity Bhmn1KIah;
    public final /* synthetic */ PmYqqGuHi PSTqBLTET;
    public final /* synthetic */ List kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P4HqSEO2e(List list, MainActivity mainActivity, PmYqqGuHi pmYqqGuHi) {
        super(4);
        this.kmSgne1rO = list;
        this.Bhmn1KIah = mainActivity;
        this.PSTqBLTET = pmYqqGuHi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r10.i8XZMQc6Z() == false) goto L_0x004b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r10.i8XZMQc6Z() == false) goto L_0x0079;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        r10.igRQEZxnW();
     */
    @Override // con.IonfNvcm2
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object dXrmkklc8(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wpXpbWG1J wpxpbwg1j;
        nju3iOSRs nju3iosrs = (nju3iOSRs) obj;
        int intValue = ((Number) obj2).intValue();
        rJ0s9PfCL rj0s9pfcl = (rJ0s9PfCL) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = G7WvUK4mQ.q3BipwRCk;
        if ((intValue2 & 14) == 0) {
            i = (((wpXpbWG1J) rj0s9pfcl).iiGwOFFnr(nju3iosrs) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        int i2 = 32;
        if ((intValue2 & 112) == 0) {
            i |= ((wpXpbWG1J) rj0s9pfcl).dIocxURUo(intValue) ? 32 : 16;
        }
        if (((i & 731) ^ 146) == 0) {
            wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        }
        int i3 = i & 14;
        attbzuWdD attbzuwdd = (attbzuWdD) this.kmSgne1rO.get(intValue);
        if ((i3 & 112) == 0) {
            if (!((wpXpbWG1J) rj0s9pfcl).iiGwOFFnr(attbzuwdd)) {
                i2 = 16;
            }
            i3 |= i2;
        }
        if (((i3 & 721) ^ 144) == 0) {
            wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        }
        MainActivity mainActivity = this.Bhmn1KIah;
        int i4 = BgIsSUB3d.Puu3Rhg4F;
        MainActivity.ilHKhw3Yw(mainActivity, attbzuwdd, BEG6ENxHu.Puu3Rhg4F(PV8WgmiL7.J4Ux7ym32, (float) 8, 0.0f, 2), this.PSTqBLTET, rj0s9pfcl, ((i3 >> 3) & 14) | 4664, 0);
        return qih4lW99W.q3BipwRCk;
    }
}
