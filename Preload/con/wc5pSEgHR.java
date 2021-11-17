package con;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class wc5pSEgHR extends SQ4Lz5bqj {
    public final iFKnyAZAM J4Ux7ym32;
    public final Typeface q3BipwRCk;
    public boolean tGV7Q6urW;

    public wc5pSEgHR(iFKnyAZAM ifknyazam, Typeface typeface) {
        super(2);
        this.q3BipwRCk = typeface;
        this.J4Ux7ym32 = ifknyazam;
    }

    @Override // con.SQ4Lz5bqj
    public void J4Ux7ym32(Typeface typeface, boolean z) {
        dIocxURUo(typeface);
    }

    public final void dIocxURUo(Typeface typeface) {
        if (!this.tGV7Q6urW) {
            N9VbYkh38 n9VbYkh38 = (N9VbYkh38) this.J4Ux7ym32.kmSgne1rO;
            wc5pSEgHR wc5pseghr = n9VbYkh38.sk5s77z6Q;
            boolean z = true;
            if (wc5pseghr != null) {
                wc5pseghr.tGV7Q6urW = true;
            }
            if (n9VbYkh38.dXrmkklc8 != typeface) {
                n9VbYkh38.dXrmkklc8 = typeface;
            } else {
                z = false;
            }
            if (z) {
                n9VbYkh38.oon79WMrY();
            }
        }
    }

    @Override // con.SQ4Lz5bqj
    public void q3BipwRCk(int i) {
        dIocxURUo(this.q3BipwRCk);
    }
}
