package con;
/* loaded from: classes.dex */
public abstract class MfTZnip0T {
    public static final boolean q3BipwRCk;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r0.equals("") != false) goto L_0x0053;
     */
    static {
        boolean z;
        String tGV7Q6urW = bqV8ECpZf.tGV7Q6urW("kotlinx.coroutines.scheduler");
        if (tGV7Q6urW != null) {
            int hashCode = tGV7Q6urW.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935 && tGV7Q6urW.equals("off")) {
                        z = false;
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.scheduler' has unrecognized value '" + ((Object) tGV7Q6urW) + '\'').toString());
            }
            q3BipwRCk = z;
        }
        z = true;
        q3BipwRCk = z;
    }

    public static final oDbW63V52 J4Ux7ym32(Way959ade way959ade, bu5cjmae6 bu5cjmae6, Object obj) {
        oDbW63V52 odbw63v52 = null;
        if (!(way959ade instanceof gXw4WGPur)) {
            return null;
        }
        if (!(bu5cjmae6.get(mdGuoJbpp.CBQ5d1kRq) != null)) {
            return null;
        }
        gXw4WGPur gxw4wgpur = (gXw4WGPur) way959ade;
        while (true) {
            if (!(gxw4wgpur instanceof dAVzucgqj) && (gxw4wgpur = gxw4wgpur.tGV7Q6urW()) != null) {
                if (gxw4wgpur instanceof oDbW63V52) {
                    odbw63v52 = (oDbW63V52) gxw4wgpur;
                    break;
                }
            } else {
                break;
            }
        }
        if (odbw63v52 != null) {
            odbw63v52.PSTqBLTET = bu5cjmae6;
            odbw63v52.MzoOEjc4X = obj;
        }
        return odbw63v52;
    }

    public static final bu5cjmae6 q3BipwRCk(oQkvjGXIr oqkvjgxir, bu5cjmae6 bu5cjmae6) {
        bu5cjmae6 plus = oqkvjgxir.dIocxURUo().plus(bu5cjmae6);
        xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
        if (plus == xaeekvu2c) {
            return plus;
        }
        int i = V2LokvvBN.dIocxURUo;
        return plus.get(wrCZc9nGY.CBQ5d1kRq) == null ? plus.plus(xaeekvu2c) : plus;
    }
}
