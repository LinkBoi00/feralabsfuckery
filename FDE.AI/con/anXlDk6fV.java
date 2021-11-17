package con;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class anXlDk6fV {
    public static ColorStateList Bhmn1KIah(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static final void CBQ5d1kRq(JEWwjBE8f jEWwjBE8f) {
        if (!jEWwjBE8f.J4Ux7ym32()) {
            throw ((Zgh96z4e6) jEWwjBE8f).Eeka1udhb();
        }
    }

    public static PorterDuffColorFilter CpG0imbht(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static boolean Eeka1udhb(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final xwkpuMyKi GPLPRo6go(PmanMZxiM pmanMZxiM, Object obj, xwkpuMyKi xwkpumyki) {
        try {
            pmanMZxiM.IytU16YUK(obj);
        } catch (Throwable th) {
            if (xwkpumyki == null || xwkpumyki.getCause() == th) {
                return new xwkpuMyKi(iMyQMM6Qj("Exception in undelivered element handler for ", obj), th);
            }
            dnBSj5uJN.dIocxURUo(xwkpumyki, th);
        }
        return xwkpumyki;
    }

    public static final void IytU16YUK(Object obj) {
        if (obj instanceof qlt0VySXJ) {
            throw ((qlt0VySXJ) obj).CBQ5d1kRq;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object J4Ux7ym32(con.f106ugAzx r4, java.lang.Object r5, con.Way959ade r6) {
        /*
            boolean r0 = r6 instanceof con.UmUyNGJm4
            if (r0 == 0) goto L_0x0013
            r0 = r6
            con.UmUyNGJm4 r0 = (con.UmUyNGJm4) r0
            int r1 = r0.ilHKhw3Yw
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.ilHKhw3Yw = r1
            goto L_0x0018
        L_0x0013:
            con.UmUyNGJm4 r0 = new con.UmUyNGJm4
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.MzoOEjc4X
            con.kBKJSqCSL r1 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r2 = r0.ilHKhw3Yw
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            java.lang.Object r4 = r0.PSTqBLTET
            con.f106ugAzx r4 = (con.f106ugAzx) r4
            IytU16YUK(r6)
            goto L_0x0041
        L_0x0033:
            IytU16YUK(r6)
            r0.PSTqBLTET = r4
            r0.ilHKhw3Yw = r3
            java.lang.Object r5 = r4.q3BipwRCk(r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            con.RG2GI7LDp r5 = new con.RG2GI7LDp
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: con.anXlDk6fV.J4Ux7ym32(con.f106ugAzx, java.lang.Object, con.Way959ade):java.lang.Object");
    }

    public static Drawable MzoOEjc4X(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable q3BipwRCk;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q3BipwRCk = C8A1BseZU.q3BipwRCk(context, resourceId)) == null) ? typedArray.getDrawable(i) : q3BipwRCk;
    }

    public static ColorStateList PSTqBLTET(Context context, j6XJY7rz4 j6xjy7rz4, int i) {
        int resourceId;
        if (((TypedArray) j6xjy7rz4.Bhmn1KIah).hasValue(i) && (resourceId = ((TypedArray) j6xjy7rz4.Bhmn1KIah).getResourceId(i, 0)) != 0) {
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return j6xjy7rz4.Bhmn1KIah(i);
    }

    public static void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, CancellationException cancellationException, int i, Object obj) {
        int i2 = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
        if (jEWwjBE8f != null) {
            ((Zgh96z4e6) jEWwjBE8f).oon79WMrY(null);
        }
    }

    public static final llWJsfBCK RG6kpfv3v(int i, gdEmqfwpT gdemqfwpt) {
        int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(i);
        if (tGV7Q6urW == 0) {
            return new Ka0YY9gOW(gdemqfwpt, null, 2);
        }
        if (tGV7Q6urW == 1) {
            return new tGBv7y54S(gdemqfwpt);
        }
        if (tGV7Q6urW == 2) {
            return new T3CB429PD(gdemqfwpt);
        }
        throw new dnCerKhAM();
    }

    public static final int WaUP0CF08(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void cAwN510t2() {
        fD7ZaSwxm fd7zaswxm = new fD7ZaSwxm();
        dfpT1j18n(fd7zaswxm, anXlDk6fV.class.getName());
        throw fd7zaswxm;
    }

    public static final W39e6bnPN dIocxURUo(String str, W39e6bnPN[] w39e6bnPNArr, PmanMZxiM pmanMZxiM) {
        if (!r6NbD4wnj.EBQXiIPmm(str)) {
            oGM5mmQi7 ogm5mmqi7 = new oGM5mmQi7(str);
            pmanMZxiM.IytU16YUK(ogm5mmqi7);
            return new AcpiZ60A3(str, CpWDdyWVi.q3BipwRCk, ogm5mmqi7.J4Ux7ym32.size(), Jefa2ExbR.i0Zug1mVk(w39e6bnPNArr), ogm5mmqi7);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static boolean dXrmkklc8(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static Throwable dfpT1j18n(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    public static void i8XZMQc6Z(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static String iMyQMM6Qj(String str, Object obj) {
        return str + obj;
    }

    public static TextView ilHKhw3Yw(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static final llWJsfBCK ixWaw2akD(gdEmqfwpT gdemqfwpt) {
        return new Ka0YY9gOW(gdemqfwpt, null, 2);
    }

    public static final W39e6bnPN kCA6Zs9sL(String str, EMeKvJHwJ eMeKvJHwJ, W39e6bnPN[] w39e6bnPNArr, PmanMZxiM pmanMZxiM) {
        if (!(!r6NbD4wnj.EBQXiIPmm(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!tGV7Q6urW(eMeKvJHwJ, CpWDdyWVi.q3BipwRCk)) {
            oGM5mmQi7 ogm5mmqi7 = new oGM5mmQi7(str);
            pmanMZxiM.IytU16YUK(ogm5mmqi7);
            return new AcpiZ60A3(str, eMeKvJHwJ, ogm5mmqi7.J4Ux7ym32.size(), Jefa2ExbR.i0Zug1mVk(w39e6bnPNArr), ogm5mmqi7);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    public static final WwFGbLVWX kmSgne1rO(W39e6bnPN w39e6bnPN) {
        if (w39e6bnPN instanceof uMtjyfLKf) {
            return ((uMtjyfLKf) w39e6bnPN).J4Ux7ym32;
        }
        if (w39e6bnPN instanceof DkNOfaaAZ) {
            return kmSgne1rO(((DkNOfaaAZ) w39e6bnPN).q3BipwRCk);
        }
        return null;
    }

    public static int oon79WMrY(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final CancellationException q3BipwRCk(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final Object qFBXIgpia(long j, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        Object obj;
        Object nlGCs0NZs;
        if (j > 0) {
            hwv0S9AvT hwv0s9avt = new hwv0S9AvT(j, way959ade);
            boolean z = false;
            hwv0s9avt.IytU16YUK(false, true, new fhbzjKAaJ(dnBSj5uJN.MzoOEjc4X(hwv0s9avt.Bhmn1KIah.kCA6Zs9sL()).tGV7Q6urW(hwv0s9avt.PSTqBLTET, hwv0s9avt, hwv0s9avt.kmSgne1rO)));
            try {
                cOutqbkMD.J4Ux7ym32(kkcqgcx5g, 2);
                obj = ((lQz1YhN4l) kkcqgcx5g).WaUP0CF08(hwv0s9avt, hwv0s9avt);
            } catch (Throwable th) {
                obj = new zo6RfsWe2(th, false, 2);
            }
            kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
            if (obj == kbkjsqcsl || (nlGCs0NZs = hwv0s9avt.nlGCs0NZs(obj)) == AB5ApHoQM.J4Ux7ym32) {
                return kbkjsqcsl;
            }
            if (nlGCs0NZs instanceof zo6RfsWe2) {
                Throwable th2 = ((zo6RfsWe2) nlGCs0NZs).q3BipwRCk;
                if (!(th2 instanceof S4tszCdo2) || ((S4tszCdo2) th2).CBQ5d1kRq != hwv0s9avt) {
                    z = true;
                }
                if (z) {
                    throw th2;
                } else if (obj instanceof zo6RfsWe2) {
                    throw ((zo6RfsWe2) obj).q3BipwRCk;
                }
            } else {
                obj = AB5ApHoQM.q3BipwRCk(nlGCs0NZs);
            }
            return obj;
        }
        throw new S4tszCdo2("Timed out immediately");
    }

    public static final boolean qVUwofr5s(bu5cjmae6 bu5cjmae6) {
        int i = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
        return jEWwjBE8f != null && jEWwjBE8f.J4Ux7ym32();
    }

    public static final void sk5s77z6Q(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    public static boolean tGV7Q6urW(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void vPSbyrYWX(bu5cjmae6 bu5cjmae6) {
        int i = JEWwjBE8f.GPLPRo6go;
        JEWwjBE8f jEWwjBE8f = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
        if (jEWwjBE8f != null) {
            CBQ5d1kRq(jEWwjBE8f);
        }
    }

    public static final void yWvV4ePLl(pBc2IYUp5 pbc2iyup5, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = q3BipwRCk("Channel was consumed, consumer had failed", th);
            }
        }
        DrTf1eLw4 drTf1eLw4 = (DrTf1eLw4) pbc2iyup5;
        if (!drTf1eLw4.CBQ5d1kRq()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(iMyQMM6Qj(drTf1eLw4.getClass().getSimpleName(), " was cancelled"));
            }
            drTf1eLw4.kmSgne1rO(drTf1eLw4.q3BipwRCk(cancellationException));
        }
    }
}
