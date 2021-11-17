package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class AmtOCvNhs {
    public final boolean J4Ux7ym32;
    public final long q3BipwRCk;
    public final MHv2Ig8xA tGV7Q6urW;

    public AmtOCvNhs(long j, boolean z, MHv2Ig8xA mHv2Ig8xA, int i) {
        MHv2Ig8xA mHv2Ig8xA2;
        j = (i & 1) != 0 ? xpuSUT7Gh.dIocxURUo(4284900966L) : j;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            float f = (float) 0;
            mHv2Ig8xA2 = new MHv2Ig8xA(f, f, f, f, null);
        } else {
            mHv2Ig8xA2 = null;
        }
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = z;
        this.tGV7Q6urW = mHv2Ig8xA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!anXlDk6fV.tGV7Q6urW(AmtOCvNhs.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
        AmtOCvNhs amtOCvNhs = (AmtOCvNhs) obj;
        return bO2dbmrf7.tGV7Q6urW(this.q3BipwRCk, amtOCvNhs.q3BipwRCk) && this.J4Ux7ym32 == amtOCvNhs.J4Ux7ym32 && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, amtOCvNhs.tGV7Q6urW);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.J4Ux7ym32);
        return this.tGV7Q6urW.hashCode() + ((hashCode + (bO2dbmrf7.yWvV4ePLl(this.q3BipwRCk) * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("OverScrollConfiguration(glowColor=");
        q3BipwRCk.append((Object) bO2dbmrf7.oon79WMrY(this.q3BipwRCk));
        q3BipwRCk.append(", forceShowAlways=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", drawPadding=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
