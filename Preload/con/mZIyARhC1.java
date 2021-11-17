package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class mZIyARhC1 {
    public Typeface CBQ5d1kRq;
    public lNNWSSNDS GPLPRo6go;
    public lNNWSSNDS J4Ux7ym32;
    public lNNWSSNDS Puu3Rhg4F;
    public lNNWSSNDS dIocxURUo;
    public lNNWSSNDS iiGwOFFnr;
    public lNNWSSNDS kCA6Zs9sL;
    public boolean kmSgne1rO;
    public final TextView q3BipwRCk;
    public lNNWSSNDS tGV7Q6urW;
    public final jtlc94oK7 yWvV4ePLl;
    public int oon79WMrY = 0;
    public int vPSbyrYWX = -1;

    public mZIyARhC1(TextView textView) {
        this.q3BipwRCk = textView;
        this.yWvV4ePLl = new jtlc94oK7(textView);
    }

    public static lNNWSSNDS tGV7Q6urW(Context context, srLS6zLvm srls6zlvm, int i) {
        ColorStateList dIocxURUo = srls6zlvm.dIocxURUo(context, i);
        if (dIocxURUo == null) {
            return null;
        }
        lNNWSSNDS lnnwssnds = new lNNWSSNDS();
        lnnwssnds.dIocxURUo = true;
        lnnwssnds.q3BipwRCk = dIocxURUo;
        return lnnwssnds;
    }

    public final void CBQ5d1kRq(Context context, j6XJY7rz4 j6xjy7rz4) {
        String cAwN510t2;
        Typeface typeface;
        Typeface typeface2;
        this.oon79WMrY = j6xjy7rz4.i8XZMQc6Z(2, this.oon79WMrY);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int i8XZMQc6Z = j6xjy7rz4.i8XZMQc6Z(11, -1);
            this.vPSbyrYWX = i8XZMQc6Z;
            if (i8XZMQc6Z != -1) {
                this.oon79WMrY = (this.oon79WMrY & 2) | 0;
            }
        }
        int i2 = 10;
        if (j6xjy7rz4.CpG0imbht(10) || j6xjy7rz4.CpG0imbht(12)) {
            this.CBQ5d1kRq = null;
            if (j6xjy7rz4.CpG0imbht(12)) {
                i2 = 12;
            }
            int i3 = this.vPSbyrYWX;
            int i4 = this.oon79WMrY;
            if (!context.isRestricted()) {
                try {
                    Typeface ixWaw2akD = j6xjy7rz4.ixWaw2akD(i2, this.oon79WMrY, new V5vZdt0Bu(this, i3, i4, new WeakReference(this.q3BipwRCk)));
                    if (ixWaw2akD != null) {
                        if (i >= 28 && this.vPSbyrYWX != -1) {
                            ixWaw2akD = Typeface.create(Typeface.create(ixWaw2akD, 0), this.vPSbyrYWX, (this.oon79WMrY & 2) != 0);
                        }
                        this.CBQ5d1kRq = ixWaw2akD;
                    }
                    this.kmSgne1rO = this.CBQ5d1kRq == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.CBQ5d1kRq == null && (cAwN510t2 = j6xjy7rz4.cAwN510t2(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.vPSbyrYWX == -1) {
                    typeface = Typeface.create(cAwN510t2, this.oon79WMrY);
                } else {
                    Typeface create = Typeface.create(cAwN510t2, 0);
                    int i5 = this.vPSbyrYWX;
                    if ((this.oon79WMrY & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i5, z);
                }
                this.CBQ5d1kRq = typeface;
            }
        } else if (j6xjy7rz4.CpG0imbht(1)) {
            this.kmSgne1rO = false;
            int i8XZMQc6Z2 = j6xjy7rz4.i8XZMQc6Z(1, 1);
            if (i8XZMQc6Z2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (i8XZMQc6Z2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (i8XZMQc6Z2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.CBQ5d1kRq = typeface2;
        }
    }

    public void GPLPRo6go(int i, int i2, int i3, int i4) {
        jtlc94oK7 jtlc94ok7 = this.yWvV4ePLl;
        if (jtlc94ok7.yWvV4ePLl()) {
            DisplayMetrics displayMetrics = jtlc94ok7.oon79WMrY.getResources().getDisplayMetrics();
            jtlc94ok7.oon79WMrY(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (jtlc94ok7.GPLPRo6go()) {
                jtlc94ok7.q3BipwRCk();
            }
        }
    }

    public void J4Ux7ym32() {
        if (!(this.J4Ux7ym32 == null && this.tGV7Q6urW == null && this.dIocxURUo == null && this.kCA6Zs9sL == null)) {
            Drawable[] compoundDrawables = this.q3BipwRCk.getCompoundDrawables();
            q3BipwRCk(compoundDrawables[0], this.J4Ux7ym32);
            q3BipwRCk(compoundDrawables[1], this.tGV7Q6urW);
            q3BipwRCk(compoundDrawables[2], this.dIocxURUo);
            q3BipwRCk(compoundDrawables[3], this.kCA6Zs9sL);
        }
        if (this.iiGwOFFnr != null || this.GPLPRo6go != null) {
            Drawable[] compoundDrawablesRelative = this.q3BipwRCk.getCompoundDrawablesRelative();
            q3BipwRCk(compoundDrawablesRelative[0], this.iiGwOFFnr);
            q3BipwRCk(compoundDrawablesRelative[2], this.GPLPRo6go);
        }
    }

    public void Puu3Rhg4F(int[] iArr, int i) {
        jtlc94oK7 jtlc94ok7 = this.yWvV4ePLl;
        if (jtlc94ok7.yWvV4ePLl()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = jtlc94ok7.oon79WMrY.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                jtlc94ok7.iiGwOFFnr = jtlc94ok7.J4Ux7ym32(iArr2);
                if (!jtlc94ok7.Puu3Rhg4F()) {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("None of the preset sizes is valid: ");
                    q3BipwRCk.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(q3BipwRCk.toString());
                }
            } else {
                jtlc94ok7.GPLPRo6go = false;
            }
            if (jtlc94ok7.GPLPRo6go()) {
                jtlc94ok7.q3BipwRCk();
            }
        }
    }

    public boolean dIocxURUo() {
        jtlc94oK7 jtlc94ok7 = this.yWvV4ePLl;
        return jtlc94ok7.yWvV4ePLl() && jtlc94ok7.q3BipwRCk != 0;
    }

    public void iiGwOFFnr(Context context, int i) {
        String cAwN510t2;
        j6XJY7rz4 j6xjy7rz4 = new j6XJY7rz4(context, context.obtainStyledAttributes(i, ZolH67hOx.sk5s77z6Q));
        if (j6xjy7rz4.CpG0imbht(14)) {
            this.q3BipwRCk.setAllCaps(j6xjy7rz4.vPSbyrYWX(14, false));
        }
        if (j6xjy7rz4.CpG0imbht(0) && j6xjy7rz4.Eeka1udhb(0, -1) == 0) {
            this.q3BipwRCk.setTextSize(0, 0.0f);
        }
        CBQ5d1kRq(context, j6xjy7rz4);
        if (j6xjy7rz4.CpG0imbht(13) && (cAwN510t2 = j6xjy7rz4.cAwN510t2(13)) != null) {
            this.q3BipwRCk.setFontVariationSettings(cAwN510t2);
        }
        j6xjy7rz4.NyWTwPF6V();
        Typeface typeface = this.CBQ5d1kRq;
        if (typeface != null) {
            this.q3BipwRCk.setTypeface(typeface, this.oon79WMrY);
        }
    }

    @SuppressLint({"NewApi"})
    public void kCA6Zs9sL(AttributeSet attributeSet, int i) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        Drawable drawable;
        int i2;
        int i3;
        int i4;
        int resourceId;
        int i5;
        Context context = this.q3BipwRCk.getContext();
        srLS6zLvm q3BipwRCk = srLS6zLvm.q3BipwRCk();
        int[] iArr = ZolH67hOx.Puu3Rhg4F;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(context, attributeSet, iArr, i, 0);
        TextView textView = this.q3BipwRCk;
        IuQbWntsc.PSTqBLTET(textView, textView.getContext(), iArr, attributeSet, (TypedArray) mUqPm6GBh.Bhmn1KIah, i, 0);
        int iMyQMM6Qj = mUqPm6GBh.iMyQMM6Qj(0, -1);
        if (mUqPm6GBh.CpG0imbht(3)) {
            this.J4Ux7ym32 = tGV7Q6urW(context, q3BipwRCk, mUqPm6GBh.iMyQMM6Qj(3, 0));
        }
        if (mUqPm6GBh.CpG0imbht(1)) {
            this.tGV7Q6urW = tGV7Q6urW(context, q3BipwRCk, mUqPm6GBh.iMyQMM6Qj(1, 0));
        }
        if (mUqPm6GBh.CpG0imbht(4)) {
            this.dIocxURUo = tGV7Q6urW(context, q3BipwRCk, mUqPm6GBh.iMyQMM6Qj(4, 0));
        }
        if (mUqPm6GBh.CpG0imbht(2)) {
            this.kCA6Zs9sL = tGV7Q6urW(context, q3BipwRCk, mUqPm6GBh.iMyQMM6Qj(2, 0));
        }
        int i6 = Build.VERSION.SDK_INT;
        if (mUqPm6GBh.CpG0imbht(5)) {
            this.iiGwOFFnr = tGV7Q6urW(context, q3BipwRCk, mUqPm6GBh.iMyQMM6Qj(5, 0));
        }
        if (mUqPm6GBh.CpG0imbht(6)) {
            this.GPLPRo6go = tGV7Q6urW(context, q3BipwRCk, mUqPm6GBh.iMyQMM6Qj(6, 0));
        }
        mUqPm6GBh.NyWTwPF6V();
        boolean z3 = this.q3BipwRCk.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iMyQMM6Qj != -1) {
            j6XJY7rz4 j6xjy7rz4 = new j6XJY7rz4(context, context.obtainStyledAttributes(iMyQMM6Qj, ZolH67hOx.sk5s77z6Q));
            if (z3 || !j6xjy7rz4.CpG0imbht(14)) {
                z2 = false;
                z = false;
            } else {
                z2 = j6xjy7rz4.vPSbyrYWX(14, false);
                z = true;
            }
            CBQ5d1kRq(context, j6xjy7rz4);
            if (j6xjy7rz4.CpG0imbht(15)) {
                str2 = j6xjy7rz4.cAwN510t2(15);
                i5 = 13;
            } else {
                i5 = 13;
                str2 = null;
            }
            str = j6xjy7rz4.CpG0imbht(i5) ? j6xjy7rz4.cAwN510t2(i5) : null;
            j6xjy7rz4.NyWTwPF6V();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        j6XJY7rz4 j6xjy7rz42 = new j6XJY7rz4(context, context.obtainStyledAttributes(attributeSet, ZolH67hOx.sk5s77z6Q, i, 0));
        if (!z3 && j6xjy7rz42.CpG0imbht(14)) {
            z2 = j6xjy7rz42.vPSbyrYWX(14, false);
            z = true;
        }
        if (j6xjy7rz42.CpG0imbht(15)) {
            str2 = j6xjy7rz42.cAwN510t2(15);
        }
        if (j6xjy7rz42.CpG0imbht(13)) {
            str = j6xjy7rz42.cAwN510t2(13);
        }
        if (i6 >= 28 && j6xjy7rz42.CpG0imbht(0) && j6xjy7rz42.Eeka1udhb(0, -1) == 0) {
            this.q3BipwRCk.setTextSize(0, 0.0f);
        }
        CBQ5d1kRq(context, j6xjy7rz42);
        j6xjy7rz42.NyWTwPF6V();
        if (!z3 && z) {
            this.q3BipwRCk.setAllCaps(z2);
        }
        Typeface typeface = this.CBQ5d1kRq;
        if (typeface != null) {
            if (this.vPSbyrYWX == -1) {
                this.q3BipwRCk.setTypeface(typeface, this.oon79WMrY);
            } else {
                this.q3BipwRCk.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.q3BipwRCk.setFontVariationSettings(str);
        }
        if (str2 != null) {
            this.q3BipwRCk.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        jtlc94oK7 jtlc94ok7 = this.yWvV4ePLl;
        Context context2 = jtlc94ok7.oon79WMrY;
        int[] iArr2 = ZolH67hOx.yWvV4ePLl;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = jtlc94ok7.yWvV4ePLl;
        IuQbWntsc.PSTqBLTET(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            jtlc94ok7.q3BipwRCk = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr3[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                jtlc94ok7.iiGwOFFnr = jtlc94ok7.J4Ux7ym32(iArr3);
                jtlc94ok7.Puu3Rhg4F();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!jtlc94ok7.yWvV4ePLl()) {
            jtlc94ok7.q3BipwRCk = 0;
        } else if (jtlc94ok7.q3BipwRCk == 1) {
            if (!jtlc94ok7.GPLPRo6go) {
                DisplayMetrics displayMetrics = jtlc94ok7.oon79WMrY.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                jtlc94ok7.oon79WMrY(dimension2, dimension3, dimension);
            }
            jtlc94ok7.GPLPRo6go();
        }
        if (c3lBLBWYj.q3BipwRCk) {
            jtlc94oK7 jtlc94ok72 = this.yWvV4ePLl;
            if (jtlc94ok72.q3BipwRCk != 0) {
                int[] iArr4 = jtlc94ok72.iiGwOFFnr;
                if (iArr4.length > 0) {
                    if (((float) this.q3BipwRCk.getAutoSizeStepGranularity()) != -1.0f) {
                        this.q3BipwRCk.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.yWvV4ePLl.dIocxURUo), Math.round(this.yWvV4ePLl.kCA6Zs9sL), Math.round(this.yWvV4ePLl.tGV7Q6urW), 0);
                    } else {
                        this.q3BipwRCk.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                    }
                }
            }
        }
        j6XJY7rz4 j6xjy7rz43 = new j6XJY7rz4(context, context.obtainStyledAttributes(attributeSet, ZolH67hOx.yWvV4ePLl));
        int iMyQMM6Qj2 = j6xjy7rz43.iMyQMM6Qj(8, -1);
        if (iMyQMM6Qj2 != -1) {
            drawable = q3BipwRCk.J4Ux7ym32(context, iMyQMM6Qj2);
            i2 = 13;
        } else {
            i2 = 13;
            drawable = null;
        }
        int iMyQMM6Qj3 = j6xjy7rz43.iMyQMM6Qj(i2, -1);
        Drawable J4Ux7ym32 = iMyQMM6Qj3 != -1 ? q3BipwRCk.J4Ux7ym32(context, iMyQMM6Qj3) : null;
        int iMyQMM6Qj4 = j6xjy7rz43.iMyQMM6Qj(9, -1);
        Drawable J4Ux7ym322 = iMyQMM6Qj4 != -1 ? q3BipwRCk.J4Ux7ym32(context, iMyQMM6Qj4) : null;
        int iMyQMM6Qj5 = j6xjy7rz43.iMyQMM6Qj(6, -1);
        Drawable J4Ux7ym323 = iMyQMM6Qj5 != -1 ? q3BipwRCk.J4Ux7ym32(context, iMyQMM6Qj5) : null;
        int iMyQMM6Qj6 = j6xjy7rz43.iMyQMM6Qj(10, -1);
        Drawable J4Ux7ym324 = iMyQMM6Qj6 != -1 ? q3BipwRCk.J4Ux7ym32(context, iMyQMM6Qj6) : null;
        int iMyQMM6Qj7 = j6xjy7rz43.iMyQMM6Qj(7, -1);
        Drawable J4Ux7ym325 = iMyQMM6Qj7 != -1 ? q3BipwRCk.J4Ux7ym32(context, iMyQMM6Qj7) : null;
        if (J4Ux7ym324 != null || J4Ux7ym325 != null) {
            Drawable[] compoundDrawablesRelative = this.q3BipwRCk.getCompoundDrawablesRelative();
            TextView textView3 = this.q3BipwRCk;
            if (J4Ux7ym324 == null) {
                J4Ux7ym324 = compoundDrawablesRelative[0];
            }
            if (J4Ux7ym32 == null) {
                J4Ux7ym32 = compoundDrawablesRelative[1];
            }
            if (J4Ux7ym325 == null) {
                J4Ux7ym325 = compoundDrawablesRelative[2];
            }
            if (J4Ux7ym323 == null) {
                J4Ux7ym323 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(J4Ux7ym324, J4Ux7ym32, J4Ux7ym325, J4Ux7ym323);
        } else if (!(drawable == null && J4Ux7ym32 == null && J4Ux7ym322 == null && J4Ux7ym323 == null)) {
            Drawable[] compoundDrawablesRelative2 = this.q3BipwRCk.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.q3BipwRCk.getCompoundDrawables();
                TextView textView4 = this.q3BipwRCk;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (J4Ux7ym32 == null) {
                    J4Ux7ym32 = compoundDrawables[1];
                }
                if (J4Ux7ym322 == null) {
                    J4Ux7ym322 = compoundDrawables[2];
                }
                if (J4Ux7ym323 == null) {
                    J4Ux7ym323 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawable, J4Ux7ym32, J4Ux7ym322, J4Ux7ym323);
            } else {
                TextView textView5 = this.q3BipwRCk;
                Drawable drawable2 = compoundDrawablesRelative2[0];
                if (J4Ux7ym32 == null) {
                    J4Ux7ym32 = compoundDrawablesRelative2[1];
                }
                Drawable drawable3 = compoundDrawablesRelative2[2];
                if (J4Ux7ym323 == null) {
                    J4Ux7ym323 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, J4Ux7ym32, drawable3, J4Ux7ym323);
            }
        }
        if (j6xjy7rz43.CpG0imbht(11)) {
            ColorStateList Bhmn1KIah = j6xjy7rz43.Bhmn1KIah(11);
            TextView textView6 = this.q3BipwRCk;
            Objects.requireNonNull(textView6);
            textView6.setCompoundDrawableTintList(Bhmn1KIah);
        }
        if (j6xjy7rz43.CpG0imbht(12)) {
            i3 = -1;
            PorterDuff.Mode tGV7Q6urW = Y4wRqkFOh.tGV7Q6urW(j6xjy7rz43.i8XZMQc6Z(12, -1), null);
            TextView textView7 = this.q3BipwRCk;
            Objects.requireNonNull(textView7);
            textView7.setCompoundDrawableTintMode(tGV7Q6urW);
        } else {
            i3 = -1;
        }
        int Eeka1udhb = j6xjy7rz43.Eeka1udhb(14, i3);
        int Eeka1udhb2 = j6xjy7rz43.Eeka1udhb(17, i3);
        int Eeka1udhb3 = j6xjy7rz43.Eeka1udhb(18, i3);
        j6xjy7rz43.NyWTwPF6V();
        if (Eeka1udhb != i3) {
            D3DEikrvb.dXrmkklc8(this.q3BipwRCk, Eeka1udhb);
        }
        if (Eeka1udhb2 != i3) {
            D3DEikrvb.RG6kpfv3v(this.q3BipwRCk, Eeka1udhb2);
        }
        if (Eeka1udhb3 != i3) {
            D3DEikrvb.ixWaw2akD(this.q3BipwRCk, Eeka1udhb3);
        }
    }

    public void oon79WMrY(ColorStateList colorStateList) {
        if (this.Puu3Rhg4F == null) {
            this.Puu3Rhg4F = new lNNWSSNDS();
        }
        lNNWSSNDS lnnwssnds = this.Puu3Rhg4F;
        lnnwssnds.q3BipwRCk = colorStateList;
        lnnwssnds.dIocxURUo = colorStateList != null;
        this.J4Ux7ym32 = lnnwssnds;
        this.tGV7Q6urW = lnnwssnds;
        this.dIocxURUo = lnnwssnds;
        this.kCA6Zs9sL = lnnwssnds;
        this.iiGwOFFnr = lnnwssnds;
        this.GPLPRo6go = lnnwssnds;
    }

    public final void q3BipwRCk(Drawable drawable, lNNWSSNDS lnnwssnds) {
        if (drawable != null && lnnwssnds != null) {
            srLS6zLvm.iiGwOFFnr(drawable, lnnwssnds, this.q3BipwRCk.getDrawableState());
        }
    }

    public void vPSbyrYWX(PorterDuff.Mode mode) {
        if (this.Puu3Rhg4F == null) {
            this.Puu3Rhg4F = new lNNWSSNDS();
        }
        lNNWSSNDS lnnwssnds = this.Puu3Rhg4F;
        lnnwssnds.J4Ux7ym32 = mode;
        lnnwssnds.tGV7Q6urW = mode != null;
        this.J4Ux7ym32 = lnnwssnds;
        this.tGV7Q6urW = lnnwssnds;
        this.dIocxURUo = lnnwssnds;
        this.kCA6Zs9sL = lnnwssnds;
        this.iiGwOFFnr = lnnwssnds;
        this.GPLPRo6go = lnnwssnds;
    }

    public void yWvV4ePLl(int i) {
        jtlc94oK7 jtlc94ok7 = this.yWvV4ePLl;
        if (!jtlc94ok7.yWvV4ePLl()) {
            return;
        }
        if (i == 0) {
            jtlc94ok7.q3BipwRCk = 0;
            jtlc94ok7.dIocxURUo = -1.0f;
            jtlc94ok7.kCA6Zs9sL = -1.0f;
            jtlc94ok7.tGV7Q6urW = -1.0f;
            jtlc94ok7.iiGwOFFnr = new int[0];
            jtlc94ok7.J4Ux7ym32 = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = jtlc94ok7.oon79WMrY.getResources().getDisplayMetrics();
            jtlc94ok7.oon79WMrY(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (jtlc94ok7.GPLPRo6go()) {
                jtlc94ok7.q3BipwRCk();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }
}
