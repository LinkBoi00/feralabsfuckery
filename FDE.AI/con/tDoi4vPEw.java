package con;

import android.text.TextPaint;
/* loaded from: classes.dex */
public final class tDoi4vPEw extends TextPaint {
    public hrmqyyOPt q3BipwRCk = hrmqyyOPt.J4Ux7ym32;
    public lDSGv8N6A J4Ux7ym32 = lDSGv8N6A.kCA6Zs9sL;

    public tDoi4vPEw(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        ksLrMHgEz kslrmhgez = lDSGv8N6A.dIocxURUo;
    }

    public final void J4Ux7ym32(lDSGv8N6A ldsgv8n6a) {
        if (ldsgv8n6a == null) {
            ksLrMHgEz kslrmhgez = lDSGv8N6A.dIocxURUo;
            ldsgv8n6a = lDSGv8N6A.kCA6Zs9sL;
        }
        if (!anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, ldsgv8n6a)) {
            this.J4Ux7ym32 = ldsgv8n6a;
            ksLrMHgEz kslrmhgez2 = lDSGv8N6A.dIocxURUo;
            if (anXlDk6fV.tGV7Q6urW(ldsgv8n6a, lDSGv8N6A.kCA6Zs9sL)) {
                clearShadowLayer();
                return;
            }
            lDSGv8N6A ldsgv8n6a2 = this.J4Ux7ym32;
            setShadowLayer(ldsgv8n6a2.tGV7Q6urW, bRgfgYIQX.tGV7Q6urW(ldsgv8n6a2.J4Ux7ym32), bRgfgYIQX.dIocxURUo(this.J4Ux7ym32.J4Ux7ym32), xpuSUT7Gh.R2hkbNqWf(this.J4Ux7ym32.q3BipwRCk));
        }
    }

    public final void q3BipwRCk(long j) {
        int R2hkbNqWf;
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        if ((j != bO2dbmrf7.Puu3Rhg4F) && getColor() != (R2hkbNqWf = xpuSUT7Gh.R2hkbNqWf(j))) {
            setColor(R2hkbNqWf);
        }
    }

    public final void tGV7Q6urW(hrmqyyOPt hrmqyyopt) {
        if (hrmqyyopt == null) {
            hrmqyyopt = hrmqyyOPt.J4Ux7ym32;
        }
        if (!anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, hrmqyyopt)) {
            this.q3BipwRCk = hrmqyyopt;
            int i = hrmqyyopt.q3BipwRCk;
            boolean z = true;
            setUnderlineText((1 | i) == i);
            int i2 = this.q3BipwRCk.q3BipwRCk;
            if ((2 | i2) != i2) {
                z = false;
            }
            setStrikeThruText(z);
        }
    }
}
