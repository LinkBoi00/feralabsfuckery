package con;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Objects;
/* loaded from: classes.dex */
public class CoGXo2yJl extends Drawable implements Animatable {
    public Resources Bhmn1KIah;
    public final fWAISGlrC CBQ5d1kRq;
    public float MzoOEjc4X;
    public Animator PSTqBLTET;
    public boolean ilHKhw3Yw;
    public float kmSgne1rO;
    public static final Interpolator qVUwofr5s = new LinearInterpolator();
    public static final Interpolator Eeka1udhb = new zeITBw1Y3();
    public static final int[] dXrmkklc8 = {-16777216};

    public CoGXo2yJl(Context context) {
        Objects.requireNonNull(context);
        this.Bhmn1KIah = context.getResources();
        fWAISGlrC fwaisglrc = new fWAISGlrC();
        this.CBQ5d1kRq = fwaisglrc;
        fwaisglrc.yWvV4ePLl = dXrmkklc8;
        fwaisglrc.q3BipwRCk(0);
        fwaisglrc.Puu3Rhg4F = 2.5f;
        fwaisglrc.J4Ux7ym32.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new mgdljYZ6z(this, fwaisglrc));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(qVUwofr5s);
        ofFloat.addListener(new D7nmUbn3p(this, fwaisglrc));
        this.PSTqBLTET = ofFloat;
    }

    public final void J4Ux7ym32(float f, float f2, float f3, float f4) {
        fWAISGlrC fwaisglrc = this.CBQ5d1kRq;
        float f5 = this.Bhmn1KIah.getDisplayMetrics().density;
        float f6 = f2 * f5;
        fwaisglrc.Puu3Rhg4F = f6;
        fwaisglrc.J4Ux7ym32.setStrokeWidth(f6);
        fwaisglrc.ilHKhw3Yw = f * f5;
        fwaisglrc.q3BipwRCk(0);
        fwaisglrc.qVUwofr5s = (int) (f3 * f5);
        fwaisglrc.Eeka1udhb = (int) (f4 * f5);
    }

    public void dIocxURUo(float f, fWAISGlrC fwaisglrc) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = fwaisglrc.yWvV4ePLl;
            int i2 = fwaisglrc.oon79WMrY;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) (((float) (((i4 >> 24) & 255) - i5)) * f2))) << 24) | ((i6 + ((int) (((float) (((i4 >> 16) & 255) - i6)) * f2))) << 16) | ((i7 + ((int) (((float) (((i4 >> 8) & 255) - i7)) * f2))) << 8) | (i8 + ((int) (f2 * ((float) ((i4 & 255) - i8)))));
        } else {
            i = fwaisglrc.yWvV4ePLl[fwaisglrc.oon79WMrY];
        }
        fwaisglrc.RG6kpfv3v = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.kmSgne1rO, bounds.exactCenterX(), bounds.exactCenterY());
        fWAISGlrC fwaisglrc = this.CBQ5d1kRq;
        RectF rectF = fwaisglrc.q3BipwRCk;
        float f = fwaisglrc.ilHKhw3Yw;
        float f2 = (fwaisglrc.Puu3Rhg4F / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) fwaisglrc.qVUwofr5s) * fwaisglrc.MzoOEjc4X) / 2.0f, fwaisglrc.Puu3Rhg4F / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = fwaisglrc.kCA6Zs9sL;
        float f4 = fwaisglrc.GPLPRo6go;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((fwaisglrc.iiGwOFFnr + f4) * 360.0f) - f5;
        fwaisglrc.J4Ux7ym32.setColor(fwaisglrc.RG6kpfv3v);
        fwaisglrc.J4Ux7ym32.setAlpha(fwaisglrc.dXrmkklc8);
        float f7 = fwaisglrc.Puu3Rhg4F / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, fwaisglrc.dIocxURUo);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, fwaisglrc.J4Ux7ym32);
        if (fwaisglrc.Bhmn1KIah) {
            Path path = fwaisglrc.PSTqBLTET;
            if (path == null) {
                Path path2 = new Path();
                fwaisglrc.PSTqBLTET = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            fwaisglrc.PSTqBLTET.moveTo(0.0f, 0.0f);
            fwaisglrc.PSTqBLTET.lineTo(((float) fwaisglrc.qVUwofr5s) * fwaisglrc.MzoOEjc4X, 0.0f);
            Path path3 = fwaisglrc.PSTqBLTET;
            float f9 = fwaisglrc.MzoOEjc4X;
            path3.lineTo((((float) fwaisglrc.qVUwofr5s) * f9) / 2.0f, ((float) fwaisglrc.Eeka1udhb) * f9);
            fwaisglrc.PSTqBLTET.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) fwaisglrc.qVUwofr5s) * fwaisglrc.MzoOEjc4X) / 2.0f), (fwaisglrc.Puu3Rhg4F / 2.0f) + rectF.centerY());
            fwaisglrc.PSTqBLTET.close();
            fwaisglrc.tGV7Q6urW.setColor(fwaisglrc.RG6kpfv3v);
            fwaisglrc.tGV7Q6urW.setAlpha(fwaisglrc.dXrmkklc8);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(fwaisglrc.PSTqBLTET, fwaisglrc.tGV7Q6urW);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.CBQ5d1kRq.dXrmkklc8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.PSTqBLTET.isRunning();
    }

    public void q3BipwRCk(float f, fWAISGlrC fwaisglrc, boolean z) {
        float f2;
        float f3;
        if (this.ilHKhw3Yw) {
            dIocxURUo(f, fwaisglrc);
            float floor = (float) (Math.floor((double) (fwaisglrc.kmSgne1rO / 0.8f)) + 1.0d);
            float f4 = fwaisglrc.vPSbyrYWX;
            float f5 = fwaisglrc.CBQ5d1kRq;
            fwaisglrc.kCA6Zs9sL = (((f5 - 0.01f) - f4) * f) + f4;
            fwaisglrc.iiGwOFFnr = f5;
            float f6 = fwaisglrc.kmSgne1rO;
            fwaisglrc.GPLPRo6go = tEHkY2u2i.q3BipwRCk(floor, f6, f, f6);
        } else if (f != 1.0f || z) {
            float f7 = fwaisglrc.kmSgne1rO;
            if (f < 0.5f) {
                f2 = fwaisglrc.vPSbyrYWX;
                f3 = (((YV6wSuw98) Eeka1udhb).getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float f8 = fwaisglrc.vPSbyrYWX + 0.79f;
                f2 = f8 - (((1.0f - ((YV6wSuw98) Eeka1udhb).getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            fwaisglrc.kCA6Zs9sL = f2;
            fwaisglrc.iiGwOFFnr = f3;
            fwaisglrc.GPLPRo6go = (0.20999998f * f) + f7;
            this.kmSgne1rO = (f + this.MzoOEjc4X) * 216.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.CBQ5d1kRq.dXrmkklc8 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.CBQ5d1kRq.J4Ux7ym32.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        long j;
        Animator animator;
        this.PSTqBLTET.cancel();
        fWAISGlrC fwaisglrc = this.CBQ5d1kRq;
        float f = fwaisglrc.kCA6Zs9sL;
        fwaisglrc.vPSbyrYWX = f;
        float f2 = fwaisglrc.iiGwOFFnr;
        fwaisglrc.CBQ5d1kRq = f2;
        fwaisglrc.kmSgne1rO = fwaisglrc.GPLPRo6go;
        if (f2 != f) {
            this.ilHKhw3Yw = true;
            animator = this.PSTqBLTET;
            j = 666;
        } else {
            fwaisglrc.q3BipwRCk(0);
            fWAISGlrC fwaisglrc2 = this.CBQ5d1kRq;
            fwaisglrc2.vPSbyrYWX = 0.0f;
            fwaisglrc2.CBQ5d1kRq = 0.0f;
            fwaisglrc2.kmSgne1rO = 0.0f;
            fwaisglrc2.kCA6Zs9sL = 0.0f;
            fwaisglrc2.iiGwOFFnr = 0.0f;
            fwaisglrc2.GPLPRo6go = 0.0f;
            animator = this.PSTqBLTET;
            j = 1332;
        }
        animator.setDuration(j);
        this.PSTqBLTET.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.PSTqBLTET.cancel();
        this.kmSgne1rO = 0.0f;
        this.CBQ5d1kRq.J4Ux7ym32(false);
        this.CBQ5d1kRq.q3BipwRCk(0);
        fWAISGlrC fwaisglrc = this.CBQ5d1kRq;
        fwaisglrc.vPSbyrYWX = 0.0f;
        fwaisglrc.CBQ5d1kRq = 0.0f;
        fwaisglrc.kmSgne1rO = 0.0f;
        fwaisglrc.kCA6Zs9sL = 0.0f;
        fwaisglrc.iiGwOFFnr = 0.0f;
        fwaisglrc.GPLPRo6go = 0.0f;
        invalidateSelf();
    }

    public void tGV7Q6urW(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        J4Ux7ym32(f, f4, f3, f2);
        invalidateSelf();
    }
}
