package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
/* loaded from: classes.dex */
public final class R30OeZHHv extends View {
    public static final int[] ilHKhw3Yw = {16842919, 16842910};
    public static final int[] qVUwofr5s = new int[0];
    public Long Bhmn1KIah;
    public lKCpVfxs7 CBQ5d1kRq;
    public gdEmqfwpT MzoOEjc4X;
    public Runnable PSTqBLTET;
    public Boolean kmSgne1rO;

    public R30OeZHHv(Context context) {
        super(context);
    }

    public static /* synthetic */ void q3BipwRCk(R30OeZHHv r30OeZHHv) {
        m0setRippleState$lambda2(r30OeZHHv);
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.PSTqBLTET;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.Bhmn1KIah;
        long longValue = currentAnimationTimeMillis - (l == null ? 0 : l.longValue());
        if (z || longValue >= 5) {
            int[] iArr = z ? ilHKhw3Yw : qVUwofr5s;
            lKCpVfxs7 lkcpvfxs7 = this.CBQ5d1kRq;
            if (lkcpvfxs7 != null) {
                lkcpvfxs7.setState(iArr);
            }
        } else {
            UoUKJhr5d uoUKJhr5d = new UoUKJhr5d(this);
            this.PSTqBLTET = uoUKJhr5d;
            postDelayed(uoUKJhr5d, 50);
        }
        this.Bhmn1KIah = Long.valueOf(currentAnimationTimeMillis);
    }

    /* renamed from: setRippleState$lambda-2 */
    public static final void m0setRippleState$lambda2(R30OeZHHv r30OeZHHv) {
        lKCpVfxs7 lkcpvfxs7 = r30OeZHHv.CBQ5d1kRq;
        if (lkcpvfxs7 != null) {
            lkcpvfxs7.setState(qVUwofr5s);
        }
        r30OeZHHv.PSTqBLTET = null;
    }

    public final void J4Ux7ym32(UkUxUO2B6 ukUxUO2B6, boolean z, long j, int i, long j2, float f, gdEmqfwpT gdemqfwpt) {
        float f2;
        float f3;
        if (this.CBQ5d1kRq == null || !anXlDk6fV.tGV7Q6urW(Boolean.valueOf(z), this.kmSgne1rO)) {
            lKCpVfxs7 lkcpvfxs7 = new lKCpVfxs7(z);
            setBackground(lkcpvfxs7);
            this.CBQ5d1kRq = lkcpvfxs7;
            this.kmSgne1rO = Boolean.valueOf(z);
        }
        lKCpVfxs7 lkcpvfxs72 = this.CBQ5d1kRq;
        this.MzoOEjc4X = gdemqfwpt;
        kCA6Zs9sL(j, i, j2, f);
        if (z) {
            f3 = bRgfgYIQX.tGV7Q6urW(ukUxUO2B6.q3BipwRCk);
            f2 = bRgfgYIQX.dIocxURUo(ukUxUO2B6.q3BipwRCk);
        } else {
            f3 = (float) lkcpvfxs72.getBounds().centerX();
            f2 = (float) lkcpvfxs72.getBounds().centerY();
        }
        lkcpvfxs72.setHotspot(f3, f2);
        setRippleState(true);
    }

    public final void dIocxURUo() {
        setRippleState(false);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        gdEmqfwpT gdemqfwpt = this.MzoOEjc4X;
        if (gdemqfwpt != null) {
            gdemqfwpt.GPLPRo6go();
        }
    }

    public final void kCA6Zs9sL(long j, int i, long j2, float f) {
        boolean z;
        lKCpVfxs7 lkcpvfxs7 = this.CBQ5d1kRq;
        if (lkcpvfxs7 != null) {
            Integer num = lkcpvfxs7.Bhmn1KIah;
            if (num == null || num.intValue() != i) {
                lkcpvfxs7.Bhmn1KIah = Integer.valueOf(i);
                sMtBeodIy.q3BipwRCk.q3BipwRCk(lkcpvfxs7, i);
            }
            if (Build.VERSION.SDK_INT < 28) {
                f *= (float) 2;
            }
            long J4Ux7ym32 = bO2dbmrf7.J4Ux7ym32(j2, cT9gik1zL.q3BipwRCk(f, 1.0f), 0.0f, 0.0f, 0.0f, 14);
            bO2dbmrf7 bo2dbmrf7 = lkcpvfxs7.kmSgne1rO;
            if (bo2dbmrf7 == null) {
                z = false;
            } else {
                z = bO2dbmrf7.tGV7Q6urW(bo2dbmrf7.q3BipwRCk, J4Ux7ym32);
            }
            if (!z) {
                lkcpvfxs7.kmSgne1rO = new bO2dbmrf7(J4Ux7ym32);
                lkcpvfxs7.setColor(ColorStateList.valueOf(xpuSUT7Gh.R2hkbNqWf(J4Ux7ym32)));
            }
            Rect o4LF8RkoQ = p62TZmTyO.o4LF8RkoQ(gThLCaTO1.dfpT1j18n(j));
            setLeft(o4LF8RkoQ.left);
            setTop(o4LF8RkoQ.top);
            setRight(o4LF8RkoQ.right);
            setBottom(o4LF8RkoQ.bottom);
            lkcpvfxs7.setBounds(o4LF8RkoQ);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public final void tGV7Q6urW() {
        this.MzoOEjc4X = null;
        Runnable runnable = this.PSTqBLTET;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.PSTqBLTET.run();
        } else {
            lKCpVfxs7 lkcpvfxs7 = this.CBQ5d1kRq;
            if (lkcpvfxs7 != null) {
                lkcpvfxs7.setState(qVUwofr5s);
            }
        }
        lKCpVfxs7 lkcpvfxs72 = this.CBQ5d1kRq;
        if (lkcpvfxs72 != null) {
            lkcpvfxs72.setVisible(false, false);
            unscheduleDrawable(lkcpvfxs72);
        }
    }
}
