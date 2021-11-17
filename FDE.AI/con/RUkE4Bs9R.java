package con;

import con.jK3ds2GCn;
import con.k007RzV1x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class RUkE4Bs9R implements jK3ds2GCn.RG2GI7LDp {
    public AU29aHa4X kCA6Zs9sL;
    public final S5aezmTgi q3BipwRCk;
    public final Map J4Ux7ym32 = new LinkedHashMap();
    public final Map tGV7Q6urW = new LinkedHashMap();
    public final Map dIocxURUo = new LinkedHashMap();
    public final llWJsfBCK iiGwOFFnr = anXlDk6fV.RG6kpfv3v(3, new nwvyEZJPU(this));
    public final int[] GPLPRo6go = new int[2];
    public final int[] Puu3Rhg4F = new int[2];

    public RUkE4Bs9R() {
        S5aezmTgi s5aezmTgi = new S5aezmTgi(0, 0);
        s5aezmTgi.a8N8UmDyD = this;
        s5aezmTgi.Ta2zrwkcM.iiGwOFFnr = this;
        this.q3BipwRCk = s5aezmTgi;
        new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    @Override // con.jK3ds2GCn.RG2GI7LDp
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32(con.k007RzV1x r18, con.sArOew9FC r19) {
        /*
        // Method dump skipped, instructions count: 570
        */
        throw new UnsupportedOperationException("Method not decompiled: con.RUkE4Bs9R.J4Ux7ym32(con.k007RzV1x, con.sArOew9FC):void");
    }

    public final boolean dIocxURUo(k007RzV1x.RG2GI7LDp rG2GI7LDp, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int ordinal = rG2GI7LDp.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                iArr[0] = 0;
                iArr[1] = i4;
            } else if (ordinal == 2) {
                boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
                iArr[0] = z3 ? i : 0;
                if (!z3) {
                    i = i4;
                }
                iArr[1] = i;
                if (z3) {
                    return false;
                }
            } else if (ordinal == 3) {
                iArr[0] = i4;
                iArr[1] = i4;
                return false;
            } else {
                throw new IllegalStateException((rG2GI7LDp + " is not supported").toString());
            }
            return true;
        }
        iArr[0] = i;
        iArr[1] = i;
        return false;
    }

    @Override // con.jK3ds2GCn.RG2GI7LDp
    public void q3BipwRCk() {
    }

    public final A2fLYD2UL tGV7Q6urW() {
        return (A2fLYD2UL) this.iiGwOFFnr.getValue();
    }
}
