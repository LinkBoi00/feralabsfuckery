package con;

import con.k007RzV1x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class jK3ds2GCn {
    public S5aezmTgi tGV7Q6urW;
    public final ArrayList q3BipwRCk = new ArrayList();
    public sArOew9FC J4Ux7ym32 = new sArOew9FC();

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
        void J4Ux7ym32(k007RzV1x k007rzv1x, sArOew9FC saroew9fc);

        void q3BipwRCk();
    }

    public jK3ds2GCn(S5aezmTgi s5aezmTgi) {
        this.tGV7Q6urW = s5aezmTgi;
    }

    public final void J4Ux7ym32(S5aezmTgi s5aezmTgi, int i, int i2, int i3) {
        int i4 = s5aezmTgi.kktL0P5MG;
        int i5 = s5aezmTgi.KBYw84i3W;
        s5aezmTgi.EBQXiIPmm(0);
        s5aezmTgi.igRQEZxnW(0);
        s5aezmTgi.wIZEdYHUn = i2;
        int i6 = s5aezmTgi.kktL0P5MG;
        if (i2 < i6) {
            s5aezmTgi.wIZEdYHUn = i6;
        }
        s5aezmTgi.IzM1cD9ly = i3;
        int i7 = s5aezmTgi.KBYw84i3W;
        if (i3 < i7) {
            s5aezmTgi.IzM1cD9ly = i7;
        }
        s5aezmTgi.EBQXiIPmm(i4);
        s5aezmTgi.igRQEZxnW(i5);
        S5aezmTgi s5aezmTgi2 = this.tGV7Q6urW;
        s5aezmTgi2.uSBmk4hFZ = i;
        s5aezmTgi2.zHl31GGXU();
    }

    public final boolean q3BipwRCk(RG2GI7LDp rG2GI7LDp, k007RzV1x k007rzv1x, int i) {
        k007RzV1x.RG2GI7LDp rG2GI7LDp2 = k007RzV1x.RG2GI7LDp.FIXED;
        this.J4Ux7ym32.q3BipwRCk = k007rzv1x.kmSgne1rO();
        this.J4Ux7ym32.J4Ux7ym32 = k007rzv1x.Eeka1udhb();
        this.J4Ux7ym32.tGV7Q6urW = k007rzv1x.dXrmkklc8();
        this.J4Ux7ym32.dIocxURUo = k007rzv1x.CBQ5d1kRq();
        sArOew9FC saroew9fc = this.J4Ux7ym32;
        saroew9fc.yWvV4ePLl = false;
        saroew9fc.oon79WMrY = i;
        k007RzV1x.RG2GI7LDp rG2GI7LDp3 = saroew9fc.q3BipwRCk;
        k007RzV1x.RG2GI7LDp rG2GI7LDp4 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        boolean z = rG2GI7LDp3 == rG2GI7LDp4;
        boolean z2 = saroew9fc.J4Ux7ym32 == rG2GI7LDp4;
        boolean z3 = z && k007rzv1x.n4UIOvAko > 0.0f;
        boolean z4 = z2 && k007rzv1x.n4UIOvAko > 0.0f;
        if (z3 && k007rzv1x.ixWaw2akD[0] == 4) {
            saroew9fc.q3BipwRCk = rG2GI7LDp2;
        }
        if (z4 && k007rzv1x.ixWaw2akD[1] == 4) {
            saroew9fc.J4Ux7ym32 = rG2GI7LDp2;
        }
        rG2GI7LDp.J4Ux7ym32(k007rzv1x, saroew9fc);
        k007rzv1x.j22ftfeNI(this.J4Ux7ym32.kCA6Zs9sL);
        k007rzv1x.o4LF8RkoQ(this.J4Ux7ym32.iiGwOFFnr);
        sArOew9FC saroew9fc2 = this.J4Ux7ym32;
        k007rzv1x.AqaWJg0b4 = saroew9fc2.Puu3Rhg4F;
        k007rzv1x.mUqPm6GBh(saroew9fc2.GPLPRo6go);
        sArOew9FC saroew9fc3 = this.J4Ux7ym32;
        saroew9fc3.oon79WMrY = 0;
        return saroew9fc3.yWvV4ePLl;
    }

    public void tGV7Q6urW(S5aezmTgi s5aezmTgi) {
        this.q3BipwRCk.clear();
        int size = s5aezmTgi.ShSN9wbzk.size();
        for (int i = 0; i < size; i++) {
            k007RzV1x k007rzv1x = (k007RzV1x) s5aezmTgi.ShSN9wbzk.get(i);
            k007RzV1x.RG2GI7LDp kmSgne1rO = k007rzv1x.kmSgne1rO();
            k007RzV1x.RG2GI7LDp rG2GI7LDp = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
            if (kmSgne1rO == rG2GI7LDp || k007rzv1x.Eeka1udhb() == rG2GI7LDp) {
                this.q3BipwRCk.add(k007rzv1x);
            }
        }
        s5aezmTgi.XYT7vJqNO();
    }
}
