package con;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.ExtractedText;
import android.widget.TextView;
import com.feravolt.preload.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class D3DEikrvb {
    public static final TextDirectionHeuristic Bhmn1KIah(int i) {
        if (i == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i != 2) {
            if (i == 3) {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            if (i == 4) {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            if (i == 5) {
                return TextDirectionHeuristics.LOCALE;
            }
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static int CBQ5d1kRq(View view, int i) {
        return KYuHUB7GA.kCA6Zs9sL(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static final int Eeka1udhb(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static void GPLPRo6go(InputStream inputStream) {
        while (inputStream.available() != 0) {
            try {
                inputStream.skip((long) inputStream.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    public static final long J4Ux7ym32(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        uEb6wTQlg ueb6wtqlg = elk9YiMBN.J4Ux7ym32;
        return floatToIntBits2;
    }

    public static final boolean MzoOEjc4X(oQkvjGXIr oqkvjgxir) {
        bu5cjmae6 dIocxURUo = oqkvjgxir.dIocxURUo();
        int i = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) dIocxURUo.get(y5p19vMdC.CBQ5d1kRq);
        if (jEWwjBE8f == null) {
            return true;
        }
        return jEWwjBE8f.J4Ux7ym32();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r7 != 2) goto L_0x002b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r5 != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static con.alvSTFvn7 PSTqBLTET(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            con.alvSTFvn7 r0 = new con.alvSTFvn7
            android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
            r0.<init>(r7)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = r7.getBreakStrategy()
            int r4 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L_0x002e
        L_0x002b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0075
        L_0x002e:
            r5 = 0
            r6 = 1
            if (r0 < r1) goto L_0x0057
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x0057
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
            java.lang.String[] r7 = r7.getDigitStrings()
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L_0x006d
            r0 = 2
            if (r7 != r0) goto L_0x002b
            goto L_0x006d
        L_0x0057:
            int r0 = r7.getLayoutDirection()
            if (r0 != r6) goto L_0x005e
            r5 = r6
        L_0x005e:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L_0x0070;
                case 3: goto L_0x002b;
                case 4: goto L_0x006d;
                case 5: goto L_0x006a;
                case 6: goto L_0x0073;
                case 7: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            if (r5 == 0) goto L_0x0073
        L_0x0067:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0075
        L_0x006a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0075
        L_0x006d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0075
        L_0x0070:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0075
        L_0x0073:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0075:
            con.alvSTFvn7 r0 = new con.alvSTFvn7
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.D3DEikrvb.PSTqBLTET(android.widget.TextView):con.alvSTFvn7");
    }

    public static final void Puu3Rhg4F(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                dnBSj5uJN.dIocxURUo(th, th2);
            }
        }
    }

    public static void RG6kpfv3v(TextView textView, int i) {
        iiGwOFFnr(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static final ExtractedText WaUP0CF08(eTxfvEx3L etxfvex3l) {
        ExtractedText extractedText = new ExtractedText();
        String str = etxfvex3l.q3BipwRCk.CBQ5d1kRq;
        extractedText.text = str;
        int i = 0;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = czCYotiRn.GPLPRo6go(etxfvex3l.J4Ux7ym32);
        extractedText.selectionEnd = czCYotiRn.iiGwOFFnr(etxfvex3l.J4Ux7ym32);
        i = 1;
        if (r6NbD4wnj.QNqj6nIzv(etxfvex3l.q3BipwRCk.CBQ5d1kRq, '\n', 0, false, 2) >= 0) {
        }
        extractedText.flags = i ^ 1;
        return extractedText;
    }

    public static final long dIocxURUo(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static void dXrmkklc8(TextView textView, int i) {
        iiGwOFFnr(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final double dfpT1j18n(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    public static final long i8XZMQc6Z(long j) {
        return gThLCaTO1.J4Ux7ym32((float) YWiUMZOtw.tGV7Q6urW(j), (float) YWiUMZOtw.J4Ux7ym32(j));
    }

    public static ActionMode.Callback iMyQMM6Qj(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof w1O3kCmGZ) || callback == null) ? callback : new w1O3kCmGZ(callback, textView);
    }

    public static int iiGwOFFnr(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static int ilHKhw3Yw(int i, int i2, float f) {
        return R33DQrZIb.J4Ux7ym32(R33DQrZIb.kCA6Zs9sL(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static void ixWaw2akD(TextView textView, int i) {
        iiGwOFFnr(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public static void kCA6Zs9sL(oQkvjGXIr oqkvjgxir, CancellationException cancellationException, int i) {
        bu5cjmae6 dIocxURUo = oqkvjgxir.dIocxURUo();
        int i2 = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) dIocxURUo.get(y5p19vMdC.CBQ5d1kRq);
        if (jEWwjBE8f != null) {
            ((Zgh96z4e6) jEWwjBE8f).oon79WMrY(null);
            return;
        }
        throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Scope cannot be cancelled because it does not have a job: ", oqkvjgxir).toString());
    }

    public static final int kmSgne1rO(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static LiMUeynem oon79WMrY(View view) {
        LiMUeynem liMUeynem = (LiMUeynem) view.getTag(R.id.view_tree_view_model_store_owner);
        if (liMUeynem != null) {
            return liMUeynem;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (liMUeynem != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            liMUeynem = (LiMUeynem) view.getTag(R.id.view_tree_view_model_store_owner);
        }
        return liMUeynem;
    }

    public static final oQkvjGXIr q3BipwRCk(bu5cjmae6 bu5cjmae6) {
        int i = JEWwjBE8f.GPLPRo6go;
        if (bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq) == null) {
            bu5cjmae6 = bu5cjmae6.plus(new jo9VS7iNb(null));
        }
        return new mHydPHYO9(bu5cjmae6);
    }

    public static boolean qVUwofr5s() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }

    public static final SpannableString sk5s77z6Q(joIJ4ANvK joij4anvk, AU29aHa4X aU29aHa4X, C2cgp32t9 c2cgp32t9) {
        int i;
        TypefaceSpan typefaceSpan;
        int i2;
        int i3;
        SpannableString spannableString = new SpannableString(joij4anvk.CBQ5d1kRq);
        FeKFMR1ai feKFMR1ai = new FeKFMR1ai(null, c2cgp32t9, 1);
        List list = joij4anvk.kmSgne1rO;
        int size = list.size() - 1;
        int i4 = 0;
        if (size >= 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) list.get(i5);
                dBWPON5YR dbwpon5yr = (dBWPON5YR) lzuuvzcu0.q3BipwRCk;
                int i7 = lzuuvzcu0.J4Ux7ym32;
                int i8 = lzuuvzcu0.tGV7Q6urW;
                pA5wCkne4.i8XZMQc6Z(spannableString, dbwpon5yr.q3BipwRCk, i7, i8);
                pA5wCkne4.dfpT1j18n(spannableString, dbwpon5yr.J4Ux7ym32, aU29aHa4X, i7, i8);
                m0AevvDOv m0aevvdov = dbwpon5yr.tGV7Q6urW;
                if (m0aevvdov == null && dbwpon5yr.dIocxURUo == null) {
                    i = i8;
                } else {
                    if (m0aevvdov == null) {
                        JhpbRXxsg jhpbRXxsg = m0AevvDOv.kmSgne1rO;
                        m0aevvdov = m0AevvDOv.qVUwofr5s;
                    }
                    JI2JIz7iN jI2JIz7iN = dbwpon5yr.dIocxURUo;
                    if (jI2JIz7iN == null) {
                        i3 = 0;
                    } else {
                        i3 = jI2JIz7iN.q3BipwRCk;
                    }
                    StyleSpan styleSpan = new StyleSpan(FeKFMR1ai.J4Ux7ym32.tGV7Q6urW(m0aevvdov, i3));
                    i = i8;
                    spannableString.setSpan(styleSpan, i7, i, 33);
                }
                Vyo35YgKP vyo35YgKP = dbwpon5yr.iiGwOFFnr;
                if (vyo35YgKP != null) {
                    if (vyo35YgKP instanceof RxEtsNHUB) {
                        typefaceSpan = new TypefaceSpan(((RxEtsNHUB) dbwpon5yr.iiGwOFFnr).dIocxURUo);
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        Z7oCchjRS z7oCchjRS = dbwpon5yr.kCA6Zs9sL;
                        if (z7oCchjRS == null) {
                            oWhsE8IPp owhse8ipp = Z7oCchjRS.J4Ux7ym32;
                            oWhsE8IPp owhse8ipp2 = Z7oCchjRS.J4Ux7ym32;
                            i2 = 1;
                        } else {
                            i2 = z7oCchjRS.q3BipwRCk;
                        }
                        JhpbRXxsg jhpbRXxsg2 = FeKFMR1ai.J4Ux7ym32;
                        JhpbRXxsg jhpbRXxsg3 = m0AevvDOv.kmSgne1rO;
                        typefaceSpan = VHWuRfVTa.q3BipwRCk.q3BipwRCk(feKFMR1ai.q3BipwRCk(vyo35YgKP, m0AevvDOv.qVUwofr5s, 0, i2));
                    }
                    spannableString.setSpan(typefaceSpan, i7, i, 33);
                }
                hrmqyyOPt hrmqyyopt = dbwpon5yr.kmSgne1rO;
                if (hrmqyyopt != null) {
                    int i9 = hrmqyyopt.q3BipwRCk;
                    if ((i9 | 1) == i9) {
                        spannableString.setSpan(new UnderlineSpan(), i7, i, 33);
                    }
                    int i10 = dbwpon5yr.kmSgne1rO.q3BipwRCk;
                    if ((i10 | 2) == i10) {
                        spannableString.setSpan(new StrikethroughSpan(), i7, i, 33);
                    }
                }
                if (dbwpon5yr.oon79WMrY != null) {
                    spannableString.setSpan(new ScaleXSpan(dbwpon5yr.oon79WMrY.q3BipwRCk), i7, i, 33);
                }
                Z6wpHNDNp z6wpHNDNp = dbwpon5yr.vPSbyrYWX;
                if (z6wpHNDNp != null) {
                    spannableString.setSpan(YodQoXZXm.q3BipwRCk.q3BipwRCk(z6wpHNDNp), i7, i, 33);
                }
                pA5wCkne4.WaUP0CF08(spannableString, dbwpon5yr.CBQ5d1kRq, i7, i);
                if (i6 > size) {
                    break;
                }
                i5 = i6;
            }
        }
        int length = joij4anvk.length();
        List list2 = joij4anvk.PSTqBLTET;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size() - 1;
        if (size2 >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object obj = list2.get(i11);
                lzuuVzcu0 lzuuvzcu02 = (lzuuVzcu0) obj;
                if ((lzuuvzcu02.q3BipwRCk instanceof i401nUmnm) && SXpWpmH9A.tGV7Q6urW(0, length, lzuuvzcu02.J4Ux7ym32, lzuuvzcu02.tGV7Q6urW)) {
                    arrayList.add(obj);
                }
                if (i12 > size2) {
                    break;
                }
                i11 = i12;
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i13 = i4 + 1;
                lzuuVzcu0 lzuuvzcu03 = (lzuuVzcu0) arrayList.get(i4);
                i401nUmnm i401numnm = (i401nUmnm) lzuuvzcu03.q3BipwRCk;
                int i14 = lzuuvzcu03.J4Ux7ym32;
                int i15 = lzuuvzcu03.tGV7Q6urW;
                if (i401numnm instanceof tFUPpAQff) {
                    spannableString.setSpan(new TtsSpan.VerbatimBuilder(((tFUPpAQff) i401numnm).q3BipwRCk).build(), i14, i15, 33);
                    if (i13 > size3) {
                        break;
                    }
                    i4 = i13;
                } else {
                    throw new dnCerKhAM();
                }
            }
        }
        return spannableString;
    }

    public static final long tGV7Q6urW(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        Q4TFMtvSV q4TFMtvSV = y8Q3RJgNN.q3BipwRCk;
        return floatToIntBits2;
    }

    public static int vPSbyrYWX(Context context, int i, int i2) {
        TypedValue tGV7Q6urW = KYuHUB7GA.tGV7Q6urW(context, i);
        return tGV7Q6urW != null ? tGV7Q6urW.data : i2;
    }

    public static final Object yWvV4ePLl(kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        UuvLiXwHL uuvLiXwHL = new UuvLiXwHL(way959ade.kCA6Zs9sL(), way959ade);
        return cOutqbkMD.CBQ5d1kRq(uuvLiXwHL, uuvLiXwHL, kkcqgcx5g);
    }
}
