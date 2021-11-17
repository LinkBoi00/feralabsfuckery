package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class QhlOYpxBK {
    public jOCYbBWA4 J4Ux7ym32;
    public jOCYbBWA4 dIocxURUo;
    public final J5dcoU99l q3BipwRCk;
    public jOCYbBWA4 tGV7Q6urW;

    public QhlOYpxBK(J5dcoU99l j5dcoU99l) {
        this.q3BipwRCk = j5dcoU99l;
        Objects.requireNonNull(j5dcoU99l);
    }

    public jOCYbBWA4 q3BipwRCk(long j, jOCYbBWA4 jocybbwa4, jOCYbBWA4 jocybbwa42) {
        if (this.tGV7Q6urW == null) {
            this.tGV7Q6urW = jocybbwa4.tGV7Q6urW();
        }
        int i = 0;
        jOCYbBWA4 jocybbwa43 = this.tGV7Q6urW;
        if (jocybbwa43 == null) {
            jocybbwa43 = null;
        }
        int J4Ux7ym32 = jocybbwa43.J4Ux7ym32();
        if (J4Ux7ym32 > 0) {
            while (true) {
                int i2 = i + 1;
                jOCYbBWA4 jocybbwa44 = this.tGV7Q6urW;
                if (jocybbwa44 == null) {
                    jocybbwa44 = null;
                }
                J5dcoU99l j5dcoU99l = this.q3BipwRCk;
                jocybbwa4.q3BipwRCk(i);
                float q3BipwRCk = jocybbwa42.q3BipwRCk(i);
                RU8VNjMiI rU8VNjMiI = (RU8VNjMiI) j5dcoU99l;
                Objects.requireNonNull(rU8VNjMiI);
                long j2 = j / 1000000;
                Ai1mFpeWT q3BipwRCk2 = rU8VNjMiI.q3BipwRCk.q3BipwRCk(q3BipwRCk);
                long j3 = q3BipwRCk2.tGV7Q6urW;
                jocybbwa44.kCA6Zs9sL(i, (((Math.signum(q3BipwRCk2.q3BipwRCk) * sqIi67jLT.q3BipwRCk.q3BipwRCk(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).J4Ux7ym32) * q3BipwRCk2.J4Ux7ym32) / ((float) q3BipwRCk2.tGV7Q6urW)) * 1000.0f);
                if (i2 >= J4Ux7ym32) {
                    break;
                }
                i = i2;
            }
        }
        jOCYbBWA4 jocybbwa45 = this.tGV7Q6urW;
        if (jocybbwa45 == null) {
            return null;
        }
        return jocybbwa45;
    }
}
