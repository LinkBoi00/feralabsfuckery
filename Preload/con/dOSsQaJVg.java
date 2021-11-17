package con;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import con.xT3tobMV0;
import java.util.BitSet;
import java.util.Objects;
/* loaded from: classes.dex */
public class dOSsQaJVg extends Drawable implements rUYFcNk3O {
    public static final Paint NyWTwPF6V;
    public static final String mUqPm6GBh = dOSsQaJVg.class.getSimpleName();
    public boolean AqaWJg0b4;
    public final KxvfgyCbJ[] Bhmn1KIah;
    public rbhQaQiIi CBQ5d1kRq;
    public PorterDuffColorFilter CpG0imbht;
    public final Path Eeka1udhb;
    public final B8aS2gOjd IytU16YUK;
    public boolean MzoOEjc4X;
    public final BitSet PSTqBLTET;
    public final RectF RG6kpfv3v;
    public xT3tobMV0 WaUP0CF08;
    public final iFKnyAZAM cAwN510t2;
    public final RectF dXrmkklc8;
    public final Paint dfpT1j18n;
    public final Paint i8XZMQc6Z;
    public final abYU3brjj iMyQMM6Qj;
    public final Matrix ilHKhw3Yw;
    public final Region ixWaw2akD;
    public final KxvfgyCbJ[] kmSgne1rO;
    public final RectF nlGCs0NZs;
    public PorterDuffColorFilter qFBXIgpia;
    public final Path qVUwofr5s;
    public final Region sk5s77z6Q;

    static {
        Paint paint = new Paint(1);
        NyWTwPF6V = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public dOSsQaJVg() {
        this(new xT3tobMV0());
    }

    public dOSsQaJVg(Context context, AttributeSet attributeSet, int i, int i2) {
        this(xT3tobMV0.J4Ux7ym32(context, null, i, i2).q3BipwRCk());
    }

    public dOSsQaJVg(rbhQaQiIi rbhqaqiii) {
        B8aS2gOjd b8aS2gOjd;
        this.kmSgne1rO = new KxvfgyCbJ[4];
        this.Bhmn1KIah = new KxvfgyCbJ[4];
        this.PSTqBLTET = new BitSet(8);
        this.ilHKhw3Yw = new Matrix();
        this.qVUwofr5s = new Path();
        this.Eeka1udhb = new Path();
        this.dXrmkklc8 = new RectF();
        this.RG6kpfv3v = new RectF();
        this.ixWaw2akD = new Region();
        this.sk5s77z6Q = new Region();
        Paint paint = new Paint(1);
        this.i8XZMQc6Z = paint;
        Paint paint2 = new Paint(1);
        this.dfpT1j18n = paint2;
        this.iMyQMM6Qj = new abYU3brjj();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            b8aS2gOjd = dCP4nU7AO.q3BipwRCk;
        } else {
            b8aS2gOjd = new B8aS2gOjd();
        }
        this.IytU16YUK = b8aS2gOjd;
        this.nlGCs0NZs = new RectF();
        this.AqaWJg0b4 = true;
        this.CBQ5d1kRq = rbhqaqiii;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        ixWaw2akD();
        RG6kpfv3v(getState());
        this.cAwN510t2 = new iFKnyAZAM(this);
    }

    public dOSsQaJVg(xT3tobMV0 xt3tobmv0) {
        this(new rbhQaQiIi(xt3tobmv0, null));
    }

    public void Bhmn1KIah(Context context) {
        this.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(context);
        sk5s77z6Q();
    }

    public float CBQ5d1kRq() {
        return this.CBQ5d1kRq.q3BipwRCk.kCA6Zs9sL.q3BipwRCk(Puu3Rhg4F());
    }

    public void Eeka1udhb(float f, ColorStateList colorStateList) {
        this.CBQ5d1kRq.CBQ5d1kRq = f;
        invalidateSelf();
        dXrmkklc8(colorStateList);
    }

    public void GPLPRo6go(Canvas canvas) {
        Paint paint = this.dfpT1j18n;
        Path path = this.Eeka1udhb;
        xT3tobMV0 xt3tobmv0 = this.WaUP0CF08;
        this.RG6kpfv3v.set(Puu3Rhg4F());
        float vPSbyrYWX = vPSbyrYWX();
        this.RG6kpfv3v.inset(vPSbyrYWX, vPSbyrYWX);
        iiGwOFFnr(canvas, paint, path, xt3tobmv0, this.RG6kpfv3v);
    }

    public final void J4Ux7ym32(RectF rectF, Path path) {
        B8aS2gOjd b8aS2gOjd = this.IytU16YUK;
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        b8aS2gOjd.q3BipwRCk(rbhqaqiii.q3BipwRCk, rbhqaqiii.vPSbyrYWX, rectF, this.cAwN510t2, path);
    }

    public void MzoOEjc4X(ColorStateList colorStateList) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.dIocxURUo != colorStateList) {
            rbhqaqiii.dIocxURUo = colorStateList;
            onStateChange(getState());
        }
    }

    public void PSTqBLTET(float f) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.PSTqBLTET != f) {
            rbhqaqiii.PSTqBLTET = f;
            sk5s77z6Q();
        }
    }

    public RectF Puu3Rhg4F() {
        this.dXrmkklc8.set(getBounds());
        return this.dXrmkklc8;
    }

    public final boolean RG6kpfv3v(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.CBQ5d1kRq.dIocxURUo == null || color2 == (colorForState2 = this.CBQ5d1kRq.dIocxURUo.getColorForState(iArr, (color2 = this.i8XZMQc6Z.getColor())))) {
            z = false;
        } else {
            this.i8XZMQc6Z.setColor(colorForState2);
            z = true;
        }
        if (this.CBQ5d1kRq.kCA6Zs9sL == null || color == (colorForState = this.CBQ5d1kRq.kCA6Zs9sL.getColorForState(iArr, (color = this.dfpT1j18n.getColor())))) {
            return z;
        }
        this.dfpT1j18n.setColor(colorForState);
        return true;
    }

    public int dIocxURUo(int i) {
        int i2;
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        float f = rbhqaqiii.PSTqBLTET + rbhqaqiii.MzoOEjc4X + rbhqaqiii.Bhmn1KIah;
        Zgs44gQcc zgs44gQcc = rbhqaqiii.J4Ux7ym32;
        if (zgs44gQcc == null || !zgs44gQcc.q3BipwRCk) {
            return i;
        }
        if (!(R33DQrZIb.kCA6Zs9sL(i, 255) == zgs44gQcc.dIocxURUo)) {
            return i;
        }
        float f2 = zgs44gQcc.kCA6Zs9sL;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int ilHKhw3Yw = D3DEikrvb.ilHKhw3Yw(R33DQrZIb.kCA6Zs9sL(i, 255), zgs44gQcc.J4Ux7ym32, min);
        if (min > 0.0f && (i2 = zgs44gQcc.tGV7Q6urW) != 0) {
            ilHKhw3Yw = R33DQrZIb.J4Ux7ym32(R33DQrZIb.kCA6Zs9sL(i2, Zgs44gQcc.iiGwOFFnr), ilHKhw3Yw);
        }
        return R33DQrZIb.kCA6Zs9sL(ilHKhw3Yw, alpha);
    }

    public void dXrmkklc8(ColorStateList colorStateList) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.kCA6Zs9sL != colorStateList) {
            rbhqaqiii.kCA6Zs9sL = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
        if ((!r2.q3BipwRCk.dIocxURUo(Puu3Rhg4F()) && !r12.qVUwofr5s.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00f1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void draw(Canvas canvas) {
        boolean z;
        Paint.Style style;
        this.i8XZMQc6Z.setColorFilter(this.CpG0imbht);
        int alpha = this.i8XZMQc6Z.getAlpha();
        Paint paint = this.i8XZMQc6Z;
        int i = this.CBQ5d1kRq.kmSgne1rO;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.dfpT1j18n.setColorFilter(this.qFBXIgpia);
        this.dfpT1j18n.setStrokeWidth(this.CBQ5d1kRq.CBQ5d1kRq);
        int alpha2 = this.dfpT1j18n.getAlpha();
        Paint paint2 = this.dfpT1j18n;
        int i2 = this.CBQ5d1kRq.kmSgne1rO;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = false;
        if (this.MzoOEjc4X) {
            float f = -vPSbyrYWX();
            xT3tobMV0 xt3tobmv0 = this.CBQ5d1kRq.q3BipwRCk;
            Objects.requireNonNull(xt3tobmv0);
            xT3tobMV0.RG2GI7LDp rG2GI7LDp = new xT3tobMV0.RG2GI7LDp(xt3tobmv0);
            BR8wFu8f7 bR8wFu8f7 = xt3tobmv0.kCA6Zs9sL;
            if (!(bR8wFu8f7 instanceof Oytaca5rU)) {
                bR8wFu8f7 = new bMFoB3O55(f, bR8wFu8f7);
            }
            rG2GI7LDp.kCA6Zs9sL = bR8wFu8f7;
            BR8wFu8f7 bR8wFu8f72 = xt3tobmv0.iiGwOFFnr;
            if (!(bR8wFu8f72 instanceof Oytaca5rU)) {
                bR8wFu8f72 = new bMFoB3O55(f, bR8wFu8f72);
            }
            rG2GI7LDp.iiGwOFFnr = bR8wFu8f72;
            BR8wFu8f7 bR8wFu8f73 = xt3tobmv0.Puu3Rhg4F;
            if (!(bR8wFu8f73 instanceof Oytaca5rU)) {
                bR8wFu8f73 = new bMFoB3O55(f, bR8wFu8f73);
            }
            rG2GI7LDp.Puu3Rhg4F = bR8wFu8f73;
            BR8wFu8f7 bR8wFu8f74 = xt3tobmv0.GPLPRo6go;
            if (!(bR8wFu8f74 instanceof Oytaca5rU)) {
                bR8wFu8f74 = new bMFoB3O55(f, bR8wFu8f74);
            }
            rG2GI7LDp.GPLPRo6go = bR8wFu8f74;
            xT3tobMV0 q3BipwRCk = rG2GI7LDp.q3BipwRCk();
            this.WaUP0CF08 = q3BipwRCk;
            B8aS2gOjd b8aS2gOjd = this.IytU16YUK;
            float f2 = this.CBQ5d1kRq.vPSbyrYWX;
            this.RG6kpfv3v.set(Puu3Rhg4F());
            float vPSbyrYWX = vPSbyrYWX();
            this.RG6kpfv3v.inset(vPSbyrYWX, vPSbyrYWX);
            b8aS2gOjd.q3BipwRCk(q3BipwRCk, f2, this.RG6kpfv3v, null, this.Eeka1udhb);
            q3BipwRCk(Puu3Rhg4F(), this.qVUwofr5s);
            this.MzoOEjc4X = false;
        }
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        int i3 = rbhqaqiii.ilHKhw3Yw;
        if (i3 != 1 && rbhqaqiii.qVUwofr5s > 0) {
            if (i3 != 2) {
            }
            z = true;
            if (z) {
                canvas.save();
                canvas.translate((float) yWvV4ePLl(), (float) oon79WMrY());
                if (!this.AqaWJg0b4) {
                    kCA6Zs9sL(canvas);
                } else {
                    int width = (int) (this.nlGCs0NZs.width() - ((float) getBounds().width()));
                    int height = (int) (this.nlGCs0NZs.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.CBQ5d1kRq.qVUwofr5s * 2) + ((int) this.nlGCs0NZs.width()) + width, (this.CBQ5d1kRq.qVUwofr5s * 2) + ((int) this.nlGCs0NZs.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (float) ((getBounds().left - this.CBQ5d1kRq.qVUwofr5s) - width);
                    float f4 = (float) ((getBounds().top - this.CBQ5d1kRq.qVUwofr5s) - height);
                    canvas2.translate(-f3, -f4);
                    kCA6Zs9sL(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                }
                canvas.restore();
            }
            rbhQaQiIi rbhqaqiii2 = this.CBQ5d1kRq;
            style = rbhqaqiii2.ixWaw2akD;
            if (style != Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
                z2 = true;
            }
            if (z2) {
                iiGwOFFnr(canvas, this.i8XZMQc6Z, this.qVUwofr5s, rbhqaqiii2.q3BipwRCk, Puu3Rhg4F());
            }
            if (kmSgne1rO()) {
                GPLPRo6go(canvas);
            }
            this.i8XZMQc6Z.setAlpha(alpha);
            this.dfpT1j18n.setAlpha(alpha2);
        }
        z = false;
        if (z) {
        }
        rbhQaQiIi rbhqaqiii22 = this.CBQ5d1kRq;
        style = rbhqaqiii22.ixWaw2akD;
        if (style != Paint.Style.FILL_AND_STROKE) {
        }
        z2 = true;
        if (z2) {
        }
        if (kmSgne1rO()) {
        }
        this.i8XZMQc6Z.setAlpha(alpha);
        this.dfpT1j18n.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.CBQ5d1kRq;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.ilHKhw3Yw != 2) {
            if (rbhqaqiii.q3BipwRCk.dIocxURUo(Puu3Rhg4F())) {
                outline.setRoundRect(getBounds(), CBQ5d1kRq() * this.CBQ5d1kRq.vPSbyrYWX);
                return;
            }
            q3BipwRCk(Puu3Rhg4F(), this.qVUwofr5s);
            if (this.qVUwofr5s.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.qVUwofr5s);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.CBQ5d1kRq.yWvV4ePLl;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.ixWaw2akD.set(getBounds());
        q3BipwRCk(Puu3Rhg4F(), this.qVUwofr5s);
        this.sk5s77z6Q.setPath(this.qVUwofr5s, this.ixWaw2akD);
        this.ixWaw2akD.op(this.sk5s77z6Q, Region.Op.DIFFERENCE);
        return this.ixWaw2akD;
    }

    public final void iiGwOFFnr(Canvas canvas, Paint paint, Path path, xT3tobMV0 xt3tobmv0, RectF rectF) {
        if (xt3tobmv0.dIocxURUo(rectF)) {
            float q3BipwRCk = xt3tobmv0.iiGwOFFnr.q3BipwRCk(rectF) * this.CBQ5d1kRq.vPSbyrYWX;
            canvas.drawRoundRect(rectF, q3BipwRCk, q3BipwRCk, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void ilHKhw3Yw(float f) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.vPSbyrYWX != f) {
            rbhqaqiii.vPSbyrYWX = f;
            this.MzoOEjc4X = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.MzoOEjc4X = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.CBQ5d1kRq.GPLPRo6go) != null && colorStateList.isStateful()) || (((colorStateList2 = this.CBQ5d1kRq.iiGwOFFnr) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.CBQ5d1kRq.kCA6Zs9sL) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.CBQ5d1kRq.dIocxURUo) != null && colorStateList4.isStateful())));
    }

    public final boolean ixWaw2akD() {
        PorterDuffColorFilter porterDuffColorFilter = this.CpG0imbht;
        PorterDuffColorFilter porterDuffColorFilter2 = this.qFBXIgpia;
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        this.CpG0imbht = tGV7Q6urW(rbhqaqiii.GPLPRo6go, rbhqaqiii.Puu3Rhg4F, this.i8XZMQc6Z, true);
        rbhQaQiIi rbhqaqiii2 = this.CBQ5d1kRq;
        this.qFBXIgpia = tGV7Q6urW(rbhqaqiii2.iiGwOFFnr, rbhqaqiii2.Puu3Rhg4F, this.dfpT1j18n, false);
        rbhQaQiIi rbhqaqiii3 = this.CBQ5d1kRq;
        if (rbhqaqiii3.RG6kpfv3v) {
            this.iMyQMM6Qj.q3BipwRCk(rbhqaqiii3.GPLPRo6go.getColorForState(getState(), 0));
        }
        return !Objects.equals(porterDuffColorFilter, this.CpG0imbht) || !Objects.equals(porterDuffColorFilter2, this.qFBXIgpia);
    }

    public final void kCA6Zs9sL(Canvas canvas) {
        if (this.PSTqBLTET.cardinality() > 0) {
            Log.w(mUqPm6GBh, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.CBQ5d1kRq.Eeka1udhb != 0) {
            canvas.drawPath(this.qVUwofr5s, this.iMyQMM6Qj.q3BipwRCk);
        }
        for (int i = 0; i < 4; i++) {
            KxvfgyCbJ kxvfgyCbJ = this.kmSgne1rO[i];
            abYU3brjj abyu3brjj = this.iMyQMM6Qj;
            int i2 = this.CBQ5d1kRq.qVUwofr5s;
            Matrix matrix = KxvfgyCbJ.q3BipwRCk;
            kxvfgyCbJ.q3BipwRCk(matrix, abyu3brjj, i2, canvas);
            this.Bhmn1KIah[i].q3BipwRCk(matrix, this.iMyQMM6Qj, this.CBQ5d1kRq.qVUwofr5s, canvas);
        }
        if (this.AqaWJg0b4) {
            int yWvV4ePLl = yWvV4ePLl();
            int oon79WMrY = oon79WMrY();
            canvas.translate((float) (-yWvV4ePLl), (float) (-oon79WMrY));
            canvas.drawPath(this.qVUwofr5s, NyWTwPF6V);
            canvas.translate((float) yWvV4ePLl, (float) oon79WMrY);
        }
    }

    public final boolean kmSgne1rO() {
        Paint.Style style = this.CBQ5d1kRq.ixWaw2akD;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.dfpT1j18n.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.CBQ5d1kRq = new rbhQaQiIi(this.CBQ5d1kRq);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.MzoOEjc4X = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = RG6kpfv3v(iArr) || ixWaw2akD();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public int oon79WMrY() {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        return (int) (Math.cos(Math.toRadians((double) rbhqaqiii.dXrmkklc8)) * ((double) rbhqaqiii.Eeka1udhb));
    }

    public final void q3BipwRCk(RectF rectF, Path path) {
        J4Ux7ym32(rectF, path);
        if (this.CBQ5d1kRq.oon79WMrY != 1.0f) {
            this.ilHKhw3Yw.reset();
            Matrix matrix = this.ilHKhw3Yw;
            float f = this.CBQ5d1kRq.oon79WMrY;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.ilHKhw3Yw);
        }
        path.computeBounds(this.nlGCs0NZs, true);
    }

    public void qVUwofr5s(float f, int i) {
        this.CBQ5d1kRq.CBQ5d1kRq = f;
        invalidateSelf();
        dXrmkklc8(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.kmSgne1rO != i) {
            rbhqaqiii.kmSgne1rO = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.CBQ5d1kRq.tGV7Q6urW = colorFilter;
        super.invalidateSelf();
    }

    @Override // con.rUYFcNk3O
    public void setShapeAppearanceModel(xT3tobMV0 xt3tobmv0) {
        this.CBQ5d1kRq.q3BipwRCk = xt3tobmv0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.CBQ5d1kRq.GPLPRo6go = colorStateList;
        ixWaw2akD();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        if (rbhqaqiii.Puu3Rhg4F != mode) {
            rbhqaqiii.Puu3Rhg4F = mode;
            ixWaw2akD();
            super.invalidateSelf();
        }
    }

    public final void sk5s77z6Q() {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        float f = rbhqaqiii.PSTqBLTET + rbhqaqiii.MzoOEjc4X;
        rbhqaqiii.qVUwofr5s = (int) Math.ceil((double) (0.75f * f));
        this.CBQ5d1kRq.Eeka1udhb = (int) Math.ceil((double) (f * 0.25f));
        ixWaw2akD();
        super.invalidateSelf();
    }

    public final PorterDuffColorFilter tGV7Q6urW(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int dIocxURUo;
        if (colorStateList == null || mode == null) {
            return (!z || (dIocxURUo = dIocxURUo((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(dIocxURUo, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = dIocxURUo(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final float vPSbyrYWX() {
        if (kmSgne1rO()) {
            return this.dfpT1j18n.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public int yWvV4ePLl() {
        rbhQaQiIi rbhqaqiii = this.CBQ5d1kRq;
        return (int) (Math.sin(Math.toRadians((double) rbhqaqiii.dXrmkklc8)) * ((double) rbhqaqiii.Eeka1udhb));
    }
}
