package con;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class N9VbYkh38 {
    public final TextPaint AqaWJg0b4;
    public float Bhmn1KIah;
    public ColorStateList CBQ5d1kRq;
    public int[] CpG0imbht;
    public float EBQXiIPmm;
    public float Eeka1udhb;
    public float IytU16YUK;
    public boolean J4Ux7ym32;
    public float MzoOEjc4X;
    public TimeInterpolator NyWTwPF6V;
    public float PSTqBLTET;
    public float QNqj6nIzv;
    public Typeface RG6kpfv3v;
    public float TyB1UUd72;
    public ColorStateList V9LQMKGJe;
    public CharSequence WaUP0CF08;
    public float cAwN510t2;
    public Typeface dXrmkklc8;
    public boolean dfpT1j18n;
    public float i0Zug1mVk;
    public CharSequence i8XZMQc6Z;
    public Bitmap iMyQMM6Qj;
    public StaticLayout igRQEZxnW;
    public float ilHKhw3Yw;
    public Typeface ixWaw2akD;
    public CharSequence j22ftfeNI;
    public float juJ6pnCpu;
    public ColorStateList kmSgne1rO;
    public TimeInterpolator mUqPm6GBh;
    public final TextPaint nlGCs0NZs;
    public float o4LF8RkoQ;
    public final View q3BipwRCk;
    public boolean qFBXIgpia;
    public float qVUwofr5s;
    public wc5pSEgHR sk5s77z6Q;
    public float tGV7Q6urW;
    public float vNtjxmzUM;
    public int Puu3Rhg4F = 16;
    public int yWvV4ePLl = 16;
    public float oon79WMrY = 15.0f;
    public float vPSbyrYWX = 15.0f;
    public final Rect iiGwOFFnr = new Rect();
    public final Rect kCA6Zs9sL = new Rect();
    public final RectF GPLPRo6go = new RectF();
    public float dIocxURUo = 0.5f;

    public N9VbYkh38(View view) {
        this.q3BipwRCk = view;
        TextPaint textPaint = new TextPaint(129);
        this.nlGCs0NZs = textPaint;
        this.AqaWJg0b4 = new TextPaint(textPaint);
    }

    public static float Puu3Rhg4F(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return vZAFqpduB.q3BipwRCk(f, f2, f3);
    }

    public static int q3BipwRCk(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    public static boolean vPSbyrYWX(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public void Bhmn1KIah(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.tGV7Q6urW) {
            this.tGV7Q6urW = f;
            tGV7Q6urW(f);
        }
    }

    public void CBQ5d1kRq(ColorStateList colorStateList) {
        if (this.kmSgne1rO != colorStateList) {
            this.kmSgne1rO = colorStateList;
            oon79WMrY();
        }
    }

    public final int GPLPRo6go(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.CpG0imbht;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final boolean J4Ux7ym32(CharSequence charSequence) {
        View view = this.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean z = true;
        if (RBJDIwG1D.dIocxURUo(view) != 1) {
            z = false;
        }
        return (z ? PkFf5koay.dIocxURUo : PkFf5koay.tGV7Q6urW).J4Ux7ym32(charSequence, 0, charSequence.length());
    }

    public void MzoOEjc4X(Typeface typeface) {
        boolean z;
        wc5pSEgHR wc5pseghr = this.sk5s77z6Q;
        boolean z2 = true;
        if (wc5pseghr != null) {
            wc5pseghr.tGV7Q6urW = true;
        }
        if (this.dXrmkklc8 != typeface) {
            this.dXrmkklc8 = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.RG6kpfv3v != typeface) {
            this.RG6kpfv3v = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            oon79WMrY();
        }
    }

    public final void PSTqBLTET(float f) {
        dIocxURUo(f, false);
        View view = this.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.vPSbyrYWX(view);
    }

    public final void dIocxURUo(float f, boolean z) {
        float f2;
        boolean z2;
        StaticLayout staticLayout;
        if (this.WaUP0CF08 != null) {
            float width = (float) this.iiGwOFFnr.width();
            float width2 = (float) this.kCA6Zs9sL.width();
            if (Math.abs(f - this.vPSbyrYWX) < 0.001f) {
                f2 = this.vPSbyrYWX;
                this.cAwN510t2 = 1.0f;
                Typeface typeface = this.ixWaw2akD;
                Typeface typeface2 = this.dXrmkklc8;
                if (typeface != typeface2) {
                    this.ixWaw2akD = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.oon79WMrY;
                Typeface typeface3 = this.ixWaw2akD;
                Typeface typeface4 = this.RG6kpfv3v;
                if (typeface3 != typeface4) {
                    this.ixWaw2akD = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f - f3) < 0.001f) {
                    this.cAwN510t2 = 1.0f;
                } else {
                    this.cAwN510t2 = f / this.oon79WMrY;
                }
                float f4 = this.vPSbyrYWX / this.oon79WMrY;
                width = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
                f2 = f3;
            }
            if (width > 0.0f) {
                z2 = this.IytU16YUK != f2 || this.qFBXIgpia || z2;
                this.IytU16YUK = f2;
                this.qFBXIgpia = false;
            }
            if (this.i8XZMQc6Z == null || z2) {
                this.nlGCs0NZs.setTextSize(this.IytU16YUK);
                this.nlGCs0NZs.setTypeface(this.ixWaw2akD);
                this.nlGCs0NZs.setLinearText(this.cAwN510t2 != 1.0f);
                boolean J4Ux7ym32 = J4Ux7ym32(this.WaUP0CF08);
                this.dfpT1j18n = J4Ux7ym32;
                try {
                    CharSequence charSequence = this.WaUP0CF08;
                    TextPaint textPaint = this.nlGCs0NZs;
                    int length = charSequence.length();
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    int max = Math.max(0, (int) width);
                    CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, (float) max, truncateAt);
                    int min = Math.min(ellipsize.length(), length);
                    if (J4Ux7ym32) {
                        alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
                    obtain.setAlignment(alignment2);
                    obtain.setIncludePad(false);
                    obtain.setTextDirection(J4Ux7ym32 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                    if (truncateAt != null) {
                        obtain.setEllipsize(truncateAt);
                    }
                    obtain.setMaxLines(1);
                    staticLayout = obtain.build();
                } catch (t7uvaXfwA e) {
                    Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                    staticLayout = null;
                }
                Objects.requireNonNull(staticLayout);
                this.igRQEZxnW = staticLayout;
                this.i8XZMQc6Z = staticLayout.getText();
            }
        }
    }

    public int iiGwOFFnr() {
        return GPLPRo6go(this.kmSgne1rO);
    }

    public float kCA6Zs9sL() {
        TextPaint textPaint = this.AqaWJg0b4;
        textPaint.setTextSize(this.vPSbyrYWX);
        textPaint.setTypeface(this.dXrmkklc8);
        textPaint.setLetterSpacing(this.QNqj6nIzv);
        return -this.AqaWJg0b4.ascent();
    }

    public void kmSgne1rO(int i) {
        if (this.yWvV4ePLl != i) {
            this.yWvV4ePLl = i;
            oon79WMrY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void oon79WMrY() {
        float f;
        StaticLayout staticLayout;
        CharSequence charSequence;
        StaticLayout staticLayout2;
        int i;
        int i2;
        float f2;
        Bitmap bitmap;
        float f3;
        float f4;
        float f5;
        float f6;
        StaticLayout staticLayout3;
        if (this.q3BipwRCk.getHeight() > 0 && this.q3BipwRCk.getWidth() > 0) {
            float f7 = this.IytU16YUK;
            dIocxURUo(this.vPSbyrYWX, false);
            CharSequence charSequence2 = this.i8XZMQc6Z;
            if (!(charSequence2 == null || (staticLayout3 = this.igRQEZxnW) == null)) {
                this.j22ftfeNI = TextUtils.ellipsize(charSequence2, this.nlGCs0NZs, (float) staticLayout3.getWidth(), TextUtils.TruncateAt.END);
            }
            float f8 = 0.0f;
            if (this.j22ftfeNI != null) {
                TextPaint textPaint = new TextPaint(this.nlGCs0NZs);
                textPaint.setLetterSpacing(this.QNqj6nIzv);
                CharSequence charSequence3 = this.j22ftfeNI;
                this.EBQXiIPmm = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.EBQXiIPmm = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.yWvV4ePLl, this.dfpT1j18n ? 1 : 0);
            int i3 = absoluteGravity & 112;
            if (i3 != 48) {
                this.PSTqBLTET = i3 != 80 ? ((float) this.iiGwOFFnr.centerY()) - ((this.nlGCs0NZs.descent() - this.nlGCs0NZs.ascent()) / 2.0f) : this.nlGCs0NZs.ascent() + ((float) this.iiGwOFFnr.bottom);
            } else {
                this.PSTqBLTET = (float) this.iiGwOFFnr.top;
            }
            int i4 = absoluteGravity & 8388615;
            if (i4 == 1) {
                f6 = (float) this.iiGwOFFnr.centerX();
                f5 = this.EBQXiIPmm / 2.0f;
            } else if (i4 != 5) {
                f = (float) this.iiGwOFFnr.left;
                this.ilHKhw3Yw = f;
                dIocxURUo(this.oon79WMrY, false);
                StaticLayout staticLayout4 = this.igRQEZxnW;
                float height = staticLayout4 == null ? (float) staticLayout4.getHeight() : 0.0f;
                staticLayout = this.igRQEZxnW;
                if (staticLayout != null) {
                    staticLayout.getLineCount();
                }
                charSequence = this.i8XZMQc6Z;
                if (charSequence != null) {
                    f8 = this.nlGCs0NZs.measureText(charSequence, 0, charSequence.length());
                }
                staticLayout2 = this.igRQEZxnW;
                if (staticLayout2 != null) {
                    staticLayout2.getLineLeft(0);
                }
                int absoluteGravity2 = Gravity.getAbsoluteGravity(this.Puu3Rhg4F, this.dfpT1j18n ? 1 : 0);
                i = absoluteGravity2 & 112;
                if (i != 48) {
                    f4 = (float) this.kCA6Zs9sL.top;
                } else if (i != 80) {
                    this.Bhmn1KIah = ((float) this.kCA6Zs9sL.centerY()) - (height / 2.0f);
                    i2 = absoluteGravity2 & 8388615;
                    if (i2 == 1) {
                        f3 = (float) this.kCA6Zs9sL.centerX();
                        f8 /= 2.0f;
                    } else if (i2 != 5) {
                        f2 = (float) this.kCA6Zs9sL.left;
                        this.MzoOEjc4X = f2;
                        bitmap = this.iMyQMM6Qj;
                        if (bitmap != null) {
                            bitmap.recycle();
                            this.iMyQMM6Qj = null;
                        }
                        PSTqBLTET(f7);
                        tGV7Q6urW(this.tGV7Q6urW);
                    } else {
                        f3 = (float) this.kCA6Zs9sL.right;
                    }
                    f2 = f3 - f8;
                    this.MzoOEjc4X = f2;
                    bitmap = this.iMyQMM6Qj;
                    if (bitmap != null) {
                    }
                    PSTqBLTET(f7);
                    tGV7Q6urW(this.tGV7Q6urW);
                } else {
                    f4 = this.nlGCs0NZs.descent() + (((float) this.kCA6Zs9sL.bottom) - height);
                }
                this.Bhmn1KIah = f4;
                i2 = absoluteGravity2 & 8388615;
                if (i2 == 1) {
                }
                f2 = f3 - f8;
                this.MzoOEjc4X = f2;
                bitmap = this.iMyQMM6Qj;
                if (bitmap != null) {
                }
                PSTqBLTET(f7);
                tGV7Q6urW(this.tGV7Q6urW);
            } else {
                f6 = (float) this.iiGwOFFnr.right;
                f5 = this.EBQXiIPmm;
            }
            f = f6 - f5;
            this.ilHKhw3Yw = f;
            dIocxURUo(this.oon79WMrY, false);
            StaticLayout staticLayout42 = this.igRQEZxnW;
            if (staticLayout42 == null) {
            }
            staticLayout = this.igRQEZxnW;
            if (staticLayout != null) {
            }
            charSequence = this.i8XZMQc6Z;
            if (charSequence != null) {
            }
            staticLayout2 = this.igRQEZxnW;
            if (staticLayout2 != null) {
            }
            int absoluteGravity22 = Gravity.getAbsoluteGravity(this.Puu3Rhg4F, this.dfpT1j18n ? 1 : 0);
            i = absoluteGravity22 & 112;
            if (i != 48) {
            }
            this.Bhmn1KIah = f4;
            i2 = absoluteGravity22 & 8388615;
            if (i2 == 1) {
            }
            f2 = f3 - f8;
            this.MzoOEjc4X = f2;
            bitmap = this.iMyQMM6Qj;
            if (bitmap != null) {
            }
            PSTqBLTET(f7);
            tGV7Q6urW(this.tGV7Q6urW);
        }
    }

    public final void tGV7Q6urW(float f) {
        int i;
        TextPaint textPaint;
        TextPaint textPaint2;
        this.GPLPRo6go.left = Puu3Rhg4F((float) this.kCA6Zs9sL.left, (float) this.iiGwOFFnr.left, f, this.mUqPm6GBh);
        this.GPLPRo6go.top = Puu3Rhg4F(this.Bhmn1KIah, this.PSTqBLTET, f, this.mUqPm6GBh);
        this.GPLPRo6go.right = Puu3Rhg4F((float) this.kCA6Zs9sL.right, (float) this.iiGwOFFnr.right, f, this.mUqPm6GBh);
        this.GPLPRo6go.bottom = Puu3Rhg4F((float) this.kCA6Zs9sL.bottom, (float) this.iiGwOFFnr.bottom, f, this.mUqPm6GBh);
        this.qVUwofr5s = Puu3Rhg4F(this.MzoOEjc4X, this.ilHKhw3Yw, f, this.mUqPm6GBh);
        this.Eeka1udhb = Puu3Rhg4F(this.Bhmn1KIah, this.PSTqBLTET, f, this.mUqPm6GBh);
        PSTqBLTET(Puu3Rhg4F(this.oon79WMrY, this.vPSbyrYWX, f, this.NyWTwPF6V));
        TimeInterpolator timeInterpolator = vZAFqpduB.J4Ux7ym32;
        this.TyB1UUd72 = 1.0f - Puu3Rhg4F(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        View view = this.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.vPSbyrYWX(view);
        this.juJ6pnCpu = Puu3Rhg4F(1.0f, 0.0f, f, timeInterpolator);
        VCCyeOu6I.vPSbyrYWX(this.q3BipwRCk);
        ColorStateList colorStateList = this.kmSgne1rO;
        ColorStateList colorStateList2 = this.CBQ5d1kRq;
        if (colorStateList != colorStateList2) {
            textPaint = this.nlGCs0NZs;
            i = q3BipwRCk(GPLPRo6go(colorStateList2), iiGwOFFnr(), f);
        } else {
            textPaint = this.nlGCs0NZs;
            i = iiGwOFFnr();
        }
        textPaint.setColor(i);
        float f2 = this.QNqj6nIzv;
        if (f2 != 0.0f) {
            textPaint2 = this.nlGCs0NZs;
            f2 = Puu3Rhg4F(0.0f, f2, f, timeInterpolator);
        } else {
            textPaint2 = this.nlGCs0NZs;
        }
        textPaint2.setLetterSpacing(f2);
        this.nlGCs0NZs.setShadowLayer(Puu3Rhg4F(0.0f, this.vNtjxmzUM, f, null), Puu3Rhg4F(0.0f, this.i0Zug1mVk, f, null), Puu3Rhg4F(0.0f, this.o4LF8RkoQ, f, null), q3BipwRCk(GPLPRo6go(null), GPLPRo6go(this.V9LQMKGJe), f));
        VCCyeOu6I.vPSbyrYWX(this.q3BipwRCk);
    }

    public void yWvV4ePLl() {
        this.J4Ux7ym32 = this.iiGwOFFnr.width() > 0 && this.iiGwOFFnr.height() > 0 && this.kCA6Zs9sL.width() > 0 && this.kCA6Zs9sL.height() > 0;
    }
}
