package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import con.FXBYEZrfX;
import con.R33DQrZIb;
import con.XquAaIjWL;
import con.Yg5AJdYv8;
import con.Zgs44gQcc;
import con.anXlDk6fV;
import con.avTFec6Zj;
import con.dOSsQaJVg;
import con.dyQHhJCgE;
import con.m84IdhKaW;
import con.xT3tobMV0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes.dex */
public class RG2GI7LDp extends dOSsQaJVg implements Drawable.Callback, dyQHhJCgE {
    public static final int[] DEe4ujgEA = {16842910};
    public static final ShapeDrawable PGC7L87Ev = new ShapeDrawable(new OvalShape());
    public CharSequence BL4OzhZBd;
    public boolean BqpzfZavo;
    public ColorFilter CMnfe2r2N;
    public int D91ZKn9BG;
    public float Dr7UqlxEV;
    public boolean DuuXfa7LE;
    public ColorStateList EBQXiIPmm;
    public TextUtils.TruncateAt GpWTsCbvo;
    public float IG30YE5GU;
    public Yg5AJdYv8 INnK5Rew6;
    public Drawable IzM1cD9ly;
    public int JxIJId84K;
    public ColorStateList KBYw84i3W;
    public float KlYagMRWx;
    public float L4EwGfXiQ;
    public int[] LFW0KvNFt;
    public float M66hQ219i;
    public float OpLJtmvFM;
    public PorterDuffColorFilter OuoYhTxyj;
    public ColorStateList QNqj6nIzv;
    public ColorStateList QSbMsHU5X;
    public float R2hkbNqWf;
    public Yg5AJdYv8 SuKhTJIQc;
    public boolean XGA7b0zuB;
    public boolean XYT7vJqNO;
    public ColorStateList Xeg1rC5FI;
    public final XquAaIjWL a8N8UmDyD;
    public int aS2AFthYA;
    public float buPcffgdD;
    public int hKeU0pt2N;
    public ColorStateList i0Zug1mVk;
    public float igRQEZxnW;
    public Drawable j22ftfeNI;
    public boolean juJ6pnCpu;
    public Drawable kktL0P5MG;
    public int koMoKnP1S;
    public float ln3nf7LH3;
    public float lqFHPHdW3;
    public ColorStateList n4UIOvAko;
    public float o4LF8RkoQ;
    public final Context oesmsHQJU;
    public boolean pwwzaxl9D;
    public int suAKJqyYV;
    public int tFD7BDQ71;
    public ColorStateList tTcQQNK5P;
    public int vIbyhVf1d;
    public ColorStateList vNtjxmzUM;
    public Drawable wIZEdYHUn;
    public boolean zHl31GGXU;
    public boolean ziwPzaoF3;
    public float V9LQMKGJe = -1.0f;
    public final Paint YmNRDyka4 = new Paint(1);
    public final Paint.FontMetrics ShSN9wbzk = new Paint.FontMetrics();
    public final RectF Ihm5o4uLx = new RectF();
    public final PointF Ta2zrwkcM = new PointF();
    public final Path uSBmk4hFZ = new Path();
    public int ifDs8fRNm = 255;
    public PorterDuff.Mode oRfL5Lv1q = PorterDuff.Mode.SRC_IN;
    public WeakReference eUlgH2VO7 = new WeakReference(null);
    public CharSequence TyB1UUd72 = "";
    public boolean eylCJcWC7 = true;

    /* renamed from: com.google.android.material.chip.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public interface AbstractC0009RG2GI7LDp {
    }

    public RG2GI7LDp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(xT3tobMV0.J4Ux7ym32(context, attributeSet, i, i2).q3BipwRCk());
        this.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(context);
        sk5s77z6Q();
        this.oesmsHQJU = context;
        XquAaIjWL xquAaIjWL = new XquAaIjWL(this);
        this.a8N8UmDyD = xquAaIjWL;
        xquAaIjWL.q3BipwRCk.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = DEe4ujgEA;
        setState(iArr);
        XYT7vJqNO(iArr);
        int[] iArr2 = FXBYEZrfX.q3BipwRCk;
        PGC7L87Ev.setTint(-1);
    }

    public static boolean AqaWJg0b4(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean mUqPm6GBh(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public void BL4OzhZBd(float f) {
        if (this.OpLJtmvFM != f) {
            this.OpLJtmvFM = f;
            invalidateSelf();
            if (oesmsHQJU()) {
                NyWTwPF6V();
            }
        }
    }

    public float CpG0imbht() {
        return this.pwwzaxl9D ? CBQ5d1kRq() : this.V9LQMKGJe;
    }

    public void Dr7UqlxEV(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.TyB1UUd72, charSequence)) {
            this.TyB1UUd72 = charSequence;
            this.a8N8UmDyD.dIocxURUo = true;
            invalidateSelf();
            NyWTwPF6V();
        }
    }

    public void DuuXfa7LE(float f) {
        if (this.buPcffgdD != f) {
            this.buPcffgdD = f;
            invalidateSelf();
            if (oesmsHQJU()) {
                NyWTwPF6V();
            }
        }
    }

    @Deprecated
    public void EBQXiIPmm(float f) {
        if (this.V9LQMKGJe != f) {
            this.V9LQMKGJe = f;
            this.CBQ5d1kRq.q3BipwRCk = this.CBQ5d1kRq.q3BipwRCk.kCA6Zs9sL(f);
            invalidateSelf();
        }
    }

    public void IG30YE5GU(float f) {
        if (this.R2hkbNqWf != f) {
            this.R2hkbNqWf = f;
            invalidateSelf();
            NyWTwPF6V();
        }
    }

    public void INnK5Rew6(float f) {
        if (this.M66hQ219i != f) {
            float dfpT1j18n = dfpT1j18n();
            this.M66hQ219i = f;
            float dfpT1j18n2 = dfpT1j18n();
            invalidateSelf();
            if (dfpT1j18n != dfpT1j18n2) {
                NyWTwPF6V();
            }
        }
    }

    public float IytU16YUK() {
        if (oesmsHQJU()) {
            return this.buPcffgdD + this.OpLJtmvFM + this.KlYagMRWx;
        }
        return 0.0f;
    }

    public void IzM1cD9ly(float f) {
        if (this.igRQEZxnW != f) {
            this.igRQEZxnW = f;
            this.YmNRDyka4.setStrokeWidth(f);
            if (this.pwwzaxl9D) {
                this.CBQ5d1kRq.CBQ5d1kRq = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void KBYw84i3W(boolean z) {
        if (this.ziwPzaoF3 != z) {
            boolean oesmsHQJU = oesmsHQJU();
            this.ziwPzaoF3 = z;
            boolean oesmsHQJU2 = oesmsHQJU();
            if (oesmsHQJU != oesmsHQJU2) {
                if (oesmsHQJU2) {
                    WaUP0CF08(this.wIZEdYHUn);
                } else {
                    YmNRDyka4(this.wIZEdYHUn);
                }
                invalidateSelf();
                NyWTwPF6V();
            }
        }
    }

    public final boolean KlYagMRWx() {
        return this.XYT7vJqNO && this.kktL0P5MG != null && this.BqpzfZavo;
    }

    public void L4EwGfXiQ(boolean z) {
        if (this.juJ6pnCpu != z) {
            boolean lqFHPHdW3 = lqFHPHdW3();
            this.juJ6pnCpu = z;
            boolean lqFHPHdW32 = lqFHPHdW3();
            if (lqFHPHdW3 != lqFHPHdW32) {
                if (lqFHPHdW32) {
                    WaUP0CF08(this.j22ftfeNI);
                } else {
                    YmNRDyka4(this.j22ftfeNI);
                }
                invalidateSelf();
                NyWTwPF6V();
            }
        }
    }

    public void M66hQ219i(avTFec6Zj avtfec6zj) {
        XquAaIjWL xquAaIjWL = this.a8N8UmDyD;
        Context context = this.oesmsHQJU;
        if (xquAaIjWL.iiGwOFFnr != avtfec6zj) {
            xquAaIjWL.iiGwOFFnr = avtfec6zj;
            if (avtfec6zj != null) {
                avtfec6zj.iiGwOFFnr(context, xquAaIjWL.q3BipwRCk, xquAaIjWL.J4Ux7ym32);
                dyQHhJCgE dyqhhjcge = (dyQHhJCgE) xquAaIjWL.kCA6Zs9sL.get();
                if (dyqhhjcge != null) {
                    xquAaIjWL.q3BipwRCk.drawableState = dyqhhjcge.getState();
                }
                avtfec6zj.kCA6Zs9sL(context, xquAaIjWL.q3BipwRCk, xquAaIjWL.J4Ux7ym32);
                xquAaIjWL.dIocxURUo = true;
            }
            dyQHhJCgE dyqhhjcge2 = (dyQHhJCgE) xquAaIjWL.kCA6Zs9sL.get();
            if (dyqhhjcge2 != null) {
                RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) dyqhhjcge2;
                rG2GI7LDp.NyWTwPF6V();
                rG2GI7LDp.invalidateSelf();
                rG2GI7LDp.onStateChange(dyqhhjcge2.getState());
            }
        }
    }

    public void NyWTwPF6V() {
        AbstractC0009RG2GI7LDp rG2GI7LDp = (AbstractC0009RG2GI7LDp) this.eUlgH2VO7.get();
        if (rG2GI7LDp != null) {
            Chip chip = (Chip) rG2GI7LDp;
            chip.tGV7Q6urW(chip.dfpT1j18n);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public void OpLJtmvFM(float f) {
        if (this.KlYagMRWx != f) {
            this.KlYagMRWx = f;
            invalidateSelf();
            if (oesmsHQJU()) {
                NyWTwPF6V();
            }
        }
    }

    public void QNqj6nIzv(boolean z) {
        if (this.XYT7vJqNO != z) {
            boolean KlYagMRWx = KlYagMRWx();
            this.XYT7vJqNO = z;
            boolean KlYagMRWx2 = KlYagMRWx();
            if (KlYagMRWx != KlYagMRWx2) {
                if (KlYagMRWx2) {
                    WaUP0CF08(this.kktL0P5MG);
                } else {
                    YmNRDyka4(this.kktL0P5MG);
                }
                invalidateSelf();
                NyWTwPF6V();
            }
        }
    }

    public void QSbMsHU5X(ColorStateList colorStateList) {
        this.zHl31GGXU = true;
        if (this.QSbMsHU5X != colorStateList) {
            this.QSbMsHU5X = colorStateList;
            if (lqFHPHdW3()) {
                this.j22ftfeNI.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void R2hkbNqWf(float f) {
        if (this.IG30YE5GU != f) {
            this.IG30YE5GU = f;
            invalidateSelf();
            NyWTwPF6V();
        }
    }

    public void SuKhTJIQc(float f) {
        if (this.Dr7UqlxEV != f) {
            float dfpT1j18n = dfpT1j18n();
            this.Dr7UqlxEV = f;
            float dfpT1j18n2 = dfpT1j18n();
            invalidateSelf();
            if (dfpT1j18n != dfpT1j18n2) {
                NyWTwPF6V();
            }
        }
    }

    public void TyB1UUd72(float f) {
        if (this.lqFHPHdW3 != f) {
            this.lqFHPHdW3 = f;
            invalidateSelf();
            NyWTwPF6V();
        }
    }

    public void V9LQMKGJe(ColorStateList colorStateList) {
        if (this.KBYw84i3W != colorStateList) {
            this.KBYw84i3W = colorStateList;
            if (this.XYT7vJqNO && this.kktL0P5MG != null && this.DuuXfa7LE) {
                this.kktL0P5MG.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void WaUP0CF08(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.wIZEdYHUn) {
                if (drawable.isStateful()) {
                    drawable.setState(this.LFW0KvNFt);
                }
                drawable.setTintList(this.n4UIOvAko);
                return;
            }
            Drawable drawable2 = this.j22ftfeNI;
            if (drawable == drawable2 && this.zHl31GGXU) {
                drawable2.setTintList(this.QSbMsHU5X);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public boolean XYT7vJqNO(int[] iArr) {
        if (Arrays.equals(this.LFW0KvNFt, iArr)) {
            return false;
        }
        this.LFW0KvNFt = iArr;
        if (oesmsHQJU()) {
            return vNtjxmzUM(getState(), iArr);
        }
        return false;
    }

    public final void YmNRDyka4(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void buPcffgdD(boolean z) {
        if (this.XGA7b0zuB != z) {
            this.XGA7b0zuB = z;
            this.Xeg1rC5FI = z ? FXBYEZrfX.q3BipwRCk(this.EBQXiIPmm) : null;
            onStateChange(getState());
        }
    }

    public final void cAwN510t2(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (oesmsHQJU()) {
            float f = this.lqFHPHdW3 + this.KlYagMRWx + this.OpLJtmvFM + this.buPcffgdD + this.IG30YE5GU;
            if (getLayoutDirection() == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public float dfpT1j18n() {
        if (!lqFHPHdW3() && !KlYagMRWx()) {
            return 0.0f;
        }
        return nlGCs0NZs() + this.Dr7UqlxEV + this.M66hQ219i;
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.ifDs8fRNm) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            if (!this.pwwzaxl9D) {
                this.YmNRDyka4.setColor(this.vIbyhVf1d);
                this.YmNRDyka4.setStyle(Paint.Style.FILL);
                this.Ihm5o4uLx.set(bounds);
                canvas.drawRoundRect(this.Ihm5o4uLx, CpG0imbht(), CpG0imbht(), this.YmNRDyka4);
            }
            if (!this.pwwzaxl9D) {
                this.YmNRDyka4.setColor(this.JxIJId84K);
                this.YmNRDyka4.setStyle(Paint.Style.FILL);
                Paint paint = this.YmNRDyka4;
                ColorFilter colorFilter = this.CMnfe2r2N;
                if (colorFilter == null) {
                    colorFilter = this.OuoYhTxyj;
                }
                paint.setColorFilter(colorFilter);
                this.Ihm5o4uLx.set(bounds);
                canvas.drawRoundRect(this.Ihm5o4uLx, CpG0imbht(), CpG0imbht(), this.YmNRDyka4);
            }
            if (this.pwwzaxl9D) {
                super.draw(canvas);
            }
            if (this.igRQEZxnW > 0.0f && !this.pwwzaxl9D) {
                this.YmNRDyka4.setColor(this.hKeU0pt2N);
                this.YmNRDyka4.setStyle(Paint.Style.STROKE);
                if (!this.pwwzaxl9D) {
                    Paint paint2 = this.YmNRDyka4;
                    ColorFilter colorFilter2 = this.CMnfe2r2N;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.OuoYhTxyj;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.Ihm5o4uLx;
                float f2 = this.igRQEZxnW / 2.0f;
                rectF.set(((float) bounds.left) + f2, ((float) bounds.top) + f2, ((float) bounds.right) - f2, ((float) bounds.bottom) - f2);
                float f3 = this.V9LQMKGJe - (this.igRQEZxnW / 2.0f);
                canvas.drawRoundRect(this.Ihm5o4uLx, f3, f3, this.YmNRDyka4);
            }
            this.YmNRDyka4.setColor(this.aS2AFthYA);
            this.YmNRDyka4.setStyle(Paint.Style.FILL);
            this.Ihm5o4uLx.set(bounds);
            if (!this.pwwzaxl9D) {
                canvas.drawRoundRect(this.Ihm5o4uLx, CpG0imbht(), CpG0imbht(), this.YmNRDyka4);
            } else {
                J4Ux7ym32(new RectF(bounds), this.uSBmk4hFZ);
                iiGwOFFnr(canvas, this.YmNRDyka4, this.uSBmk4hFZ, this.CBQ5d1kRq.q3BipwRCk, Puu3Rhg4F());
            }
            if (lqFHPHdW3()) {
                i8XZMQc6Z(bounds, this.Ihm5o4uLx);
                RectF rectF2 = this.Ihm5o4uLx;
                float f4 = rectF2.left;
                float f5 = rectF2.top;
                canvas.translate(f4, f5);
                this.j22ftfeNI.setBounds(0, 0, (int) this.Ihm5o4uLx.width(), (int) this.Ihm5o4uLx.height());
                this.j22ftfeNI.draw(canvas);
                canvas.translate(-f4, -f5);
            }
            if (KlYagMRWx()) {
                i8XZMQc6Z(bounds, this.Ihm5o4uLx);
                RectF rectF3 = this.Ihm5o4uLx;
                float f6 = rectF3.left;
                float f7 = rectF3.top;
                canvas.translate(f6, f7);
                this.kktL0P5MG.setBounds(0, 0, (int) this.Ihm5o4uLx.width(), (int) this.Ihm5o4uLx.height());
                this.kktL0P5MG.draw(canvas);
                canvas.translate(-f6, -f7);
            }
            if (!this.eylCJcWC7 || this.TyB1UUd72 == null) {
                i2 = saveLayerAlpha;
                i3 = 0;
                i4 = 255;
            } else {
                PointF pointF = this.Ta2zrwkcM;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.TyB1UUd72 != null) {
                    float dfpT1j18n = dfpT1j18n() + this.ln3nf7LH3 + this.R2hkbNqWf;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + dfpT1j18n;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - dfpT1j18n;
                        align = Paint.Align.RIGHT;
                    }
                    this.a8N8UmDyD.q3BipwRCk.getFontMetrics(this.ShSN9wbzk);
                    Paint.FontMetrics fontMetrics = this.ShSN9wbzk;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.Ihm5o4uLx;
                rectF4.setEmpty();
                if (this.TyB1UUd72 != null) {
                    float dfpT1j18n2 = dfpT1j18n() + this.ln3nf7LH3 + this.R2hkbNqWf;
                    float IytU16YUK = IytU16YUK() + this.lqFHPHdW3 + this.IG30YE5GU;
                    if (getLayoutDirection() == 0) {
                        rectF4.left = ((float) bounds.left) + dfpT1j18n2;
                        f = ((float) bounds.right) - IytU16YUK;
                    } else {
                        rectF4.left = ((float) bounds.left) + IytU16YUK;
                        f = ((float) bounds.right) - dfpT1j18n2;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                XquAaIjWL xquAaIjWL = this.a8N8UmDyD;
                if (xquAaIjWL.iiGwOFFnr != null) {
                    xquAaIjWL.q3BipwRCk.drawableState = getState();
                    XquAaIjWL xquAaIjWL2 = this.a8N8UmDyD;
                    xquAaIjWL2.iiGwOFFnr.kCA6Zs9sL(this.oesmsHQJU, xquAaIjWL2.q3BipwRCk, xquAaIjWL2.J4Ux7ym32);
                }
                this.a8N8UmDyD.q3BipwRCk.setTextAlign(align);
                boolean z = Math.round(this.a8N8UmDyD.q3BipwRCk(this.TyB1UUd72.toString())) > Math.round(this.Ihm5o4uLx.width());
                if (z) {
                    i5 = canvas.save();
                    canvas.clipRect(this.Ihm5o4uLx);
                } else {
                    i5 = 0;
                }
                CharSequence charSequence = this.TyB1UUd72;
                if (z && this.GpWTsCbvo != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.a8N8UmDyD.q3BipwRCk, this.Ihm5o4uLx.width(), this.GpWTsCbvo);
                }
                int length = charSequence.length();
                PointF pointF2 = this.Ta2zrwkcM;
                i2 = saveLayerAlpha;
                i3 = 0;
                i4 = 255;
                canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.a8N8UmDyD.q3BipwRCk);
                if (z) {
                    canvas.restoreToCount(i5);
                }
            }
            if (oesmsHQJU()) {
                iMyQMM6Qj(bounds, this.Ihm5o4uLx);
                RectF rectF5 = this.Ihm5o4uLx;
                float f8 = rectF5.left;
                float f9 = rectF5.top;
                canvas.translate(f8, f9);
                this.wIZEdYHUn.setBounds(i3, i3, (int) this.Ihm5o4uLx.width(), (int) this.Ihm5o4uLx.height());
                int[] iArr = FXBYEZrfX.q3BipwRCk;
                this.IzM1cD9ly.setBounds(this.wIZEdYHUn.getBounds());
                this.IzM1cD9ly.jumpToCurrentState();
                this.IzM1cD9ly.draw(canvas);
                canvas.translate(-f8, -f9);
            }
            if (this.ifDs8fRNm < i4) {
                canvas.restoreToCount(i2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ifDs8fRNm;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.CMnfe2r2N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.o4LF8RkoQ;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(IytU16YUK() + this.a8N8UmDyD.q3BipwRCk(this.TyB1UUd72.toString()) + dfpT1j18n() + this.ln3nf7LH3 + this.R2hkbNqWf + this.IG30YE5GU + this.lqFHPHdW3), this.D91ZKn9BG);
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.pwwzaxl9D) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.V9LQMKGJe);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.o4LF8RkoQ, this.V9LQMKGJe);
        }
        outline.setAlpha(((float) this.ifDs8fRNm) / 255.0f);
    }

    public void i0Zug1mVk(boolean z) {
        if (this.DuuXfa7LE != z) {
            this.DuuXfa7LE = z;
            float dfpT1j18n = dfpT1j18n();
            if (!z && this.BqpzfZavo) {
                this.BqpzfZavo = false;
            }
            float dfpT1j18n2 = dfpT1j18n();
            invalidateSelf();
            if (dfpT1j18n != dfpT1j18n2) {
                NyWTwPF6V();
            }
        }
    }

    public final void i8XZMQc6Z(Rect rect, RectF rectF) {
        float f;
        rectF.setEmpty();
        if (lqFHPHdW3() || KlYagMRWx()) {
            float f2 = this.ln3nf7LH3 + this.Dr7UqlxEV;
            float nlGCs0NZs = nlGCs0NZs();
            if (getLayoutDirection() == 0) {
                float f3 = ((float) rect.left) + f2;
                rectF.left = f3;
                rectF.right = f3 + nlGCs0NZs;
            } else {
                float f4 = ((float) rect.right) - f2;
                rectF.right = f4;
                rectF.left = f4 - nlGCs0NZs;
            }
            Drawable drawable = this.BqpzfZavo ? this.kktL0P5MG : this.j22ftfeNI;
            float f5 = this.L4EwGfXiQ;
            if (f5 <= 0.0f && drawable != null) {
                f5 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.oesmsHQJU.getResources().getDisplayMetrics()));
                if (((float) drawable.getIntrinsicHeight()) <= f5) {
                    f = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f5;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    public final void iMyQMM6Qj(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (oesmsHQJU()) {
            float f = this.lqFHPHdW3 + this.KlYagMRWx;
            if (getLayoutDirection() == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.OpLJtmvFM;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.OpLJtmvFM;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.OpLJtmvFM;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public void igRQEZxnW(ColorStateList colorStateList) {
        if (this.i0Zug1mVk != colorStateList) {
            this.i0Zug1mVk = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!AqaWJg0b4(this.vNtjxmzUM) && !AqaWJg0b4(this.i0Zug1mVk) && !AqaWJg0b4(this.QNqj6nIzv) && (!this.XGA7b0zuB || !AqaWJg0b4(this.Xeg1rC5FI))) {
            avTFec6Zj avtfec6zj = this.a8N8UmDyD.iiGwOFFnr;
            if (!((avtfec6zj == null || (colorStateList = avtfec6zj.oon79WMrY) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.XYT7vJqNO && this.kktL0P5MG != null && this.DuuXfa7LE) && !mUqPm6GBh(this.j22ftfeNI) && !mUqPm6GBh(this.kktL0P5MG) && !AqaWJg0b4(this.tTcQQNK5P)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void j22ftfeNI(float f) {
        if (this.L4EwGfXiQ != f) {
            float dfpT1j18n = dfpT1j18n();
            this.L4EwGfXiQ = f;
            float dfpT1j18n2 = dfpT1j18n();
            invalidateSelf();
            if (dfpT1j18n != dfpT1j18n2) {
                NyWTwPF6V();
            }
        }
    }

    public void juJ6pnCpu(Drawable drawable) {
        Drawable drawable2 = this.j22ftfeNI;
        Drawable drawable3 = null;
        Drawable q3BipwRCk = drawable2 != null ? m84IdhKaW.q3BipwRCk(drawable2) : null;
        if (q3BipwRCk != drawable) {
            float dfpT1j18n = dfpT1j18n();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.j22ftfeNI = drawable3;
            float dfpT1j18n2 = dfpT1j18n();
            YmNRDyka4(q3BipwRCk);
            if (lqFHPHdW3()) {
                WaUP0CF08(this.j22ftfeNI);
            }
            invalidateSelf();
            if (dfpT1j18n != dfpT1j18n2) {
                NyWTwPF6V();
            }
        }
    }

    public void kktL0P5MG(ColorStateList colorStateList) {
        if (this.n4UIOvAko != colorStateList) {
            this.n4UIOvAko = colorStateList;
            if (oesmsHQJU()) {
                this.wIZEdYHUn.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void ln3nf7LH3(ColorStateList colorStateList) {
        if (this.EBQXiIPmm != colorStateList) {
            this.EBQXiIPmm = colorStateList;
            this.Xeg1rC5FI = this.XGA7b0zuB ? FXBYEZrfX.q3BipwRCk(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean lqFHPHdW3() {
        return this.juJ6pnCpu && this.j22ftfeNI != null;
    }

    public void n4UIOvAko(Drawable drawable) {
        Drawable qFBXIgpia = qFBXIgpia();
        if (qFBXIgpia != drawable) {
            float IytU16YUK = IytU16YUK();
            this.wIZEdYHUn = drawable != null ? drawable.mutate() : null;
            int[] iArr = FXBYEZrfX.q3BipwRCk;
            this.IzM1cD9ly = new RippleDrawable(FXBYEZrfX.q3BipwRCk(this.EBQXiIPmm), this.wIZEdYHUn, PGC7L87Ev);
            float IytU16YUK2 = IytU16YUK();
            YmNRDyka4(qFBXIgpia);
            if (oesmsHQJU()) {
                WaUP0CF08(this.wIZEdYHUn);
            }
            invalidateSelf();
            if (IytU16YUK != IytU16YUK2) {
                NyWTwPF6V();
            }
        }
    }

    public final float nlGCs0NZs() {
        Drawable drawable = this.BqpzfZavo ? this.kktL0P5MG : this.j22ftfeNI;
        float f = this.L4EwGfXiQ;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    public void o4LF8RkoQ(Drawable drawable) {
        if (this.kktL0P5MG != drawable) {
            float dfpT1j18n = dfpT1j18n();
            this.kktL0P5MG = drawable;
            float dfpT1j18n2 = dfpT1j18n();
            YmNRDyka4(this.kktL0P5MG);
            WaUP0CF08(this.kktL0P5MG);
            invalidateSelf();
            if (dfpT1j18n != dfpT1j18n2) {
                NyWTwPF6V();
            }
        }
    }

    public final boolean oesmsHQJU() {
        return this.ziwPzaoF3 && this.wIZEdYHUn != null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (lqFHPHdW3()) {
            onLayoutDirectionChanged |= this.j22ftfeNI.setLayoutDirection(i);
        }
        if (KlYagMRWx()) {
            onLayoutDirectionChanged |= this.kktL0P5MG.setLayoutDirection(i);
        }
        if (oesmsHQJU()) {
            onLayoutDirectionChanged |= this.wIZEdYHUn.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (lqFHPHdW3()) {
            onLevelChange |= this.j22ftfeNI.setLevel(i);
        }
        if (KlYagMRWx()) {
            onLevelChange |= this.kktL0P5MG.setLevel(i);
        }
        if (oesmsHQJU()) {
            onLevelChange |= this.wIZEdYHUn.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.pwwzaxl9D) {
            super.onStateChange(iArr);
        }
        return vNtjxmzUM(iArr, this.LFW0KvNFt);
    }

    public Drawable qFBXIgpia() {
        Drawable drawable = this.wIZEdYHUn;
        if (drawable != null) {
            return m84IdhKaW.q3BipwRCk(drawable);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.ifDs8fRNm != i) {
            this.ifDs8fRNm = i;
            invalidateSelf();
        }
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.CMnfe2r2N != colorFilter) {
            this.CMnfe2r2N = colorFilter;
            invalidateSelf();
        }
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.tTcQQNK5P != colorStateList) {
            this.tTcQQNK5P = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.oRfL5Lv1q != mode) {
            this.oRfL5Lv1q = mode;
            this.OuoYhTxyj = anXlDk6fV.CpG0imbht(this, this.tTcQQNK5P, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (lqFHPHdW3()) {
            visible |= this.j22ftfeNI.setVisible(z, z2);
        }
        if (KlYagMRWx()) {
            visible |= this.kktL0P5MG.setVisible(z, z2);
        }
        if (oesmsHQJU()) {
            visible |= this.wIZEdYHUn.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean vNtjxmzUM(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.vNtjxmzUM;
        int dIocxURUo = dIocxURUo(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.vIbyhVf1d) : 0);
        boolean z3 = true;
        if (this.vIbyhVf1d != dIocxURUo) {
            this.vIbyhVf1d = dIocxURUo;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.i0Zug1mVk;
        int dIocxURUo2 = dIocxURUo(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.JxIJId84K) : 0);
        if (this.JxIJId84K != dIocxURUo2) {
            this.JxIJId84K = dIocxURUo2;
            onStateChange = true;
        }
        int J4Ux7ym32 = R33DQrZIb.J4Ux7ym32(dIocxURUo2, dIocxURUo);
        if ((this.suAKJqyYV != J4Ux7ym32) || (this.CBQ5d1kRq.dIocxURUo == null)) {
            this.suAKJqyYV = J4Ux7ym32;
            MzoOEjc4X(ColorStateList.valueOf(J4Ux7ym32));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.QNqj6nIzv;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.hKeU0pt2N) : 0;
        if (this.hKeU0pt2N != colorForState) {
            this.hKeU0pt2N = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.Xeg1rC5FI == null || !FXBYEZrfX.J4Ux7ym32(iArr)) ? 0 : this.Xeg1rC5FI.getColorForState(iArr, this.aS2AFthYA);
        if (this.aS2AFthYA != colorForState2) {
            this.aS2AFthYA = colorForState2;
            if (this.XGA7b0zuB) {
                onStateChange = true;
            }
        }
        avTFec6Zj avtfec6zj = this.a8N8UmDyD.iiGwOFFnr;
        int colorForState3 = (avtfec6zj == null || (colorStateList = avtfec6zj.oon79WMrY) == null) ? 0 : colorStateList.getColorForState(iArr, this.tFD7BDQ71);
        if (this.tFD7BDQ71 != colorForState3) {
            this.tFD7BDQ71 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i : state) {
                if (i == 16842912) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z4 = z && this.DuuXfa7LE;
        if (this.BqpzfZavo == z4 || this.kktL0P5MG == null) {
            z2 = false;
        } else {
            float dfpT1j18n = dfpT1j18n();
            this.BqpzfZavo = z4;
            if (dfpT1j18n != dfpT1j18n()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.tTcQQNK5P;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.koMoKnP1S) : 0;
        if (this.koMoKnP1S != colorForState4) {
            this.koMoKnP1S = colorForState4;
            this.OuoYhTxyj = anXlDk6fV.CpG0imbht(this, this.tTcQQNK5P, this.oRfL5Lv1q);
        } else {
            z3 = onStateChange;
        }
        if (mUqPm6GBh(this.j22ftfeNI)) {
            z3 |= this.j22ftfeNI.setState(iArr);
        }
        if (mUqPm6GBh(this.kktL0P5MG)) {
            z3 |= this.kktL0P5MG.setState(iArr);
        }
        if (mUqPm6GBh(this.wIZEdYHUn)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.wIZEdYHUn.setState(iArr3);
        }
        int[] iArr4 = FXBYEZrfX.q3BipwRCk;
        if (mUqPm6GBh(this.IzM1cD9ly)) {
            z3 |= this.IzM1cD9ly.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            NyWTwPF6V();
        }
        return z3;
    }

    public void wIZEdYHUn(ColorStateList colorStateList) {
        if (this.QNqj6nIzv != colorStateList) {
            this.QNqj6nIzv = colorStateList;
            if (this.pwwzaxl9D) {
                dXrmkklc8(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void zHl31GGXU(float f) {
        if (this.o4LF8RkoQ != f) {
            this.o4LF8RkoQ = f;
            invalidateSelf();
            NyWTwPF6V();
        }
    }

    public void ziwPzaoF3(float f) {
        if (this.ln3nf7LH3 != f) {
            this.ln3nf7LH3 = f;
            invalidateSelf();
            NyWTwPF6V();
        }
    }
}
