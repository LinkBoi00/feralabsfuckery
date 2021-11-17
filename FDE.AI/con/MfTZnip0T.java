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
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = con.bqV8ECpZf.tGV7Q6urW(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            con.MfTZnip0T.q3BipwRCk = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.MfTZnip0T.<clinit>():void");
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
