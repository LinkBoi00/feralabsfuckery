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
    public xheEapSkC q3BipwRCk() {
        xheEapSkC xheeapskc;
        xheEapSkC xheeapskc2 = null;
        if (!tGV7Q6urW(1) && tGV7Q6urW(2)) {
            try {
                xheeapskc = J4Ux7ym32("su", "--mount-master");
            } catch (CUby0PNcw unused) {
            }
        }
        xheeapskc = null;
        if (xheeapskc == null && !tGV7Q6urW(1)) {
            try {
                xheeapskc = J4Ux7ym32("su");
                if (xheeapskc.CBQ5d1kRq == 1) {
                    xheeapskc2 = xheeapskc;
                }
                xheeapskc = xheeapskc2;
            } catch (CUby0PNcw unused2) {
            }
        }
        return xheeapskc == null ? J4Ux7ym32("sh") : xheeapskc;
    }

    public boolean tGV7Q6urW(int i) {
        return (0 & i) == i;
    }
}
