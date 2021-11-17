package con;

import java.io.IOException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class NWj29W5je {
    public xheEapSkC J4Ux7ym32(String... strArr) {
        try {
            xheEapSkC xheeapskc = new xheEapSkC(20, tGV7Q6urW(8), strArr);
            synchronized (PVDPmuuqs.class) {
                if (PVDPmuuqs.q3BipwRCk) {
                    PVDPmuuqs.J4Ux7ym32 = xheeapskc;
                }
            }
            return xheeapskc;
        } catch (IOException e) {
            Charset charset = BPyGi2K5m.q3BipwRCk;
            throw new CUby0PNcw("Unable to create a shell!", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4.CBQ5d1kRq != 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public con.xheEapSkC q3BipwRCk() {
        /*
            r6 = this;
            r0 = 1
            boolean r1 = r6.tGV7Q6urW(r0)
            java.lang.String r2 = "su"
            r3 = 0
            if (r1 != 0) goto L_0x001f
            r1 = 2
            boolean r4 = r6.tGV7Q6urW(r1)
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "--mount-master"
            java.lang.String[] r4 = new java.lang.String[]{r2, r4}     // Catch: CUby0PNcw -> 0x001f
            con.xheEapSkC r4 = r6.J4Ux7ym32(r4)     // Catch: CUby0PNcw -> 0x001f
            int r5 = r4.CBQ5d1kRq     // Catch: CUby0PNcw -> 0x0020
            if (r5 == r1) goto L_0x0020
        L_0x001f:
            r4 = r3
        L_0x0020:
            if (r4 != 0) goto L_0x0037
            boolean r1 = r6.tGV7Q6urW(r0)
            if (r1 != 0) goto L_0x0037
            java.lang.String[] r1 = new java.lang.String[]{r2}     // Catch: CUby0PNcw -> 0x0037
            con.xheEapSkC r4 = r6.J4Ux7ym32(r1)     // Catch: CUby0PNcw -> 0x0037
            int r1 = r4.CBQ5d1kRq     // Catch: CUby0PNcw -> 0x0037
            if (r1 == r0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            r4 = r3
        L_0x0037:
            if (r4 != 0) goto L_0x0043
            java.lang.String r0 = "sh"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            con.xheEapSkC r4 = r6.J4Ux7ym32(r0)
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: con.NWj29W5je.q3BipwRCk():con.xheEapSkC");
    }

    public boolean tGV7Q6urW(int i) {
        return (0 & i) == i;
    }
}
