package con;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class dnBSj5uJN {
    public static final Object Bhmn1KIah(long j, Way959ade way959ade) {
        if (j <= 0) {
            return qih4lW99W.q3BipwRCk;
        }
        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(way959ade), 1);
        tmgchdfqu.Eeka1udhb();
        if (j < Long.MAX_VALUE) {
            MzoOEjc4X(tmgchdfqu.MzoOEjc4X).dIocxURUo(j, tmgchdfqu);
        }
        Object qVUwofr5s = tmgchdfqu.qVUwofr5s();
        return qVUwofr5s == kBKJSqCSL.COROUTINE_SUSPENDED ? qVUwofr5s : qih4lW99W.q3BipwRCk;
    }

    public static qdam7I1O8 CBQ5d1kRq(int i) {
        if (i == 0) {
            return new d6ChEZHmJ();
        }
        if (i != 1) {
            return new d6ChEZHmJ();
        }
        return new VU05rwNLK();
    }

    public static Intent Eeka1udhb(Context context, ComponentName componentName) {
        String dXrmkklc8 = dXrmkklc8(context, componentName);
        if (dXrmkklc8 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), dXrmkklc8);
        return dXrmkklc8(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x02db, code lost:
        if (r3[r17].iiGwOFFnr.dIocxURUo == r9) goto L_0x02df;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
        if (r4[r2].iiGwOFFnr.dIocxURUo == r5) goto L_0x0146;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x049c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0508 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0712 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0753 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0770 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void GPLPRo6go(con.S5aezmTgi r37, con.WLlBJNJ2W r38, java.util.ArrayList r39, int r40) {
        /*
        // Method dump skipped, instructions count: 1919
        */
        throw new UnsupportedOperationException("Method not decompiled: con.dnBSj5uJN.GPLPRo6go(con.S5aezmTgi, con.WLlBJNJ2W, java.util.ArrayList, int):void");
    }

    public static final long IytU16YUK(long j, long j2) {
        int GPLPRo6go = czCYotiRn.GPLPRo6go(j);
        int iiGwOFFnr = czCYotiRn.iiGwOFFnr(j);
        boolean z = true;
        if (czCYotiRn.GPLPRo6go(j2) < czCYotiRn.iiGwOFFnr(j) && czCYotiRn.GPLPRo6go(j) < czCYotiRn.iiGwOFFnr(j2)) {
            if (czCYotiRn.q3BipwRCk(j2, j)) {
                GPLPRo6go = czCYotiRn.GPLPRo6go(j2);
                iiGwOFFnr = GPLPRo6go;
            } else {
                if (!czCYotiRn.q3BipwRCk(j, j2)) {
                    int GPLPRo6go2 = czCYotiRn.GPLPRo6go(j2);
                    if (GPLPRo6go >= czCYotiRn.iiGwOFFnr(j2) || GPLPRo6go2 > GPLPRo6go) {
                        z = false;
                    }
                    if (z) {
                        GPLPRo6go = czCYotiRn.GPLPRo6go(j2);
                    } else {
                        iiGwOFFnr = czCYotiRn.GPLPRo6go(j2);
                    }
                }
                iiGwOFFnr -= czCYotiRn.kCA6Zs9sL(j2);
            }
        } else if (iiGwOFFnr > czCYotiRn.GPLPRo6go(j2)) {
            GPLPRo6go -= czCYotiRn.kCA6Zs9sL(j2);
            iiGwOFFnr -= czCYotiRn.kCA6Zs9sL(j2);
        }
        return ODug2UCW1.iiGwOFFnr(GPLPRo6go, iiGwOFFnr);
    }

    public static /* synthetic */ long J4Ux7ym32(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return q3BipwRCk(i, i2, i3, i4);
    }

    public static final XUDDOHuAx MzoOEjc4X(bu5cjmae6 bu5cjmae6) {
        int i = V2LokvvBN.dIocxURUo;
        zG81huwZq zg81huwzq = bu5cjmae6.get(wrCZc9nGY.CBQ5d1kRq);
        XUDDOHuAx xUDDOHuAx = zg81huwzq instanceof XUDDOHuAx ? (XUDDOHuAx) zg81huwzq : null;
        return xUDDOHuAx == null ? JfPi3Rw8a.q3BipwRCk : xUDDOHuAx;
    }

    public static Typeface PSTqBLTET(WQpIMzWun wQpIMzWun, Integer num, Integer num2, int i) {
        int i2 = i & 2;
        Typeface typeface = null;
        if (i2 != 0) {
            num2 = null;
        }
        if (num2 == null) {
            throw new IllegalArgumentException("font: You must specify a resource ID or literal value");
        } else if (num2 != null) {
            TypedArray obtainStyledAttributes = wQpIMzWun.WaUP0CF08.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    typeface = K95C08eIr.q3BipwRCk(wQpIMzWun.WaUP0CF08, resourceId);
                }
                return typeface;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final int Puu3Rhg4F(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final joIJ4ANvK RG6kpfv3v(eTxfvEx3L etxfvex3l) {
        joIJ4ANvK joij4anvk = etxfvex3l.q3BipwRCk;
        long j = etxfvex3l.J4Ux7ym32;
        Objects.requireNonNull(joij4anvk);
        return joij4anvk.subSequence(czCYotiRn.GPLPRo6go(j), czCYotiRn.iiGwOFFnr(j));
    }

    public static final boolean WaUP0CF08(dBWPON5YR dbwpon5yr) {
        return (dbwpon5yr.iiGwOFFnr == null && dbwpon5yr.dIocxURUo == null && dbwpon5yr.tGV7Q6urW == null) ? false : true;
    }

    public static void cAwN510t2(View view, dOSsQaJVg dossqajvg) {
        Zgs44gQcc zgs44gQcc = dossqajvg.CBQ5d1kRq.J4Ux7ym32;
        if (zgs44gQcc != null && zgs44gQcc.q3BipwRCk) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                f += mJLaJepZo.yWvV4ePLl((View) parent);
            }
            rbhQaQiIi rbhqaqiii = dossqajvg.CBQ5d1kRq;
            if (rbhqaqiii.Bhmn1KIah != f) {
                rbhqaqiii.Bhmn1KIah = f;
                dossqajvg.sk5s77z6Q();
            }
        }
    }

    public static final void dIocxURUo(Throwable th, Throwable th2) {
        if (th != th2) {
            pjo68E62a.q3BipwRCk.q3BipwRCk(th, th2);
        }
    }

    public static String dXrmkklc8(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final long dfpT1j18n(long j, int i, int i2) {
        int vPSbyrYWX = K5PjwoFCN.vPSbyrYWX(j) + i;
        int i3 = 0;
        if (vPSbyrYWX < 0) {
            vPSbyrYWX = 0;
        }
        int yWvV4ePLl = K5PjwoFCN.yWvV4ePLl(j);
        if (yWvV4ePLl != Integer.MAX_VALUE && (yWvV4ePLl = yWvV4ePLl + i) < 0) {
            yWvV4ePLl = 0;
        }
        int oon79WMrY = K5PjwoFCN.oon79WMrY(j) + i2;
        if (oon79WMrY < 0) {
            oon79WMrY = 0;
        }
        i3 = K5PjwoFCN.Puu3Rhg4F(j);
        if (i3 == Integer.MAX_VALUE || (i3 = i3 + i2) >= 0) {
        }
        return q3BipwRCk(vPSbyrYWX, yWvV4ePLl, oon79WMrY, i3);
    }

    public static ObjectAnimator i8XZMQc6Z(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }

    public static final void iMyQMM6Qj(View view, PmanMZxiM pmanMZxiM) {
        view.addOnAttachStateChangeListener(new Sme6YJlaf(view, pmanMZxiM));
    }

    public static final q9dGs9SI6 ilHKhw3Yw(BgHiMFrEI bgHiMFrEI) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        N0a4Shkkl n0a4Shkkl = ((ComponentActivity) bgHiMFrEI).PSTqBLTET;
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) n0a4Shkkl.q3BipwRCk.get();
            if (lifecycleCoroutineScopeImpl == null) {
                s4WYBMesc s4wybmesc = new s4WYBMesc(null);
                xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
                VWNUggT0w vWNUggT0w = (VWNUggT0w) ZezE4t3SB.q3BipwRCk;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(n0a4Shkkl, idpM54xlp.dfpT1j18n(s4wybmesc, vWNUggT0w.MzoOEjc4X));
                if (n0a4Shkkl.q3BipwRCk.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    idpM54xlp.RG6kpfv3v(lifecycleCoroutineScopeImpl, vWNUggT0w.MzoOEjc4X, 0, new i9gAjCQHS(lifecycleCoroutineScopeImpl, null), 2, null);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final joIJ4ANvK ixWaw2akD(eTxfvEx3L etxfvex3l, int i) {
        return etxfvex3l.q3BipwRCk.subSequence(czCYotiRn.iiGwOFFnr(etxfvex3l.J4Ux7ym32), Math.min(czCYotiRn.iiGwOFFnr(etxfvex3l.J4Ux7ym32) + i, etxfvex3l.q3BipwRCk.CBQ5d1kRq.length()));
    }

    public static final Animator kCA6Zs9sL(int i, int i2, long j, PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new cnCOeRyMp(j, pmanMZxiM, gdemqfwpt));
        ofInt.addListener(new Vq90F9M5C(j, pmanMZxiM, gdemqfwpt));
        return ofInt;
    }

    public static oWhsE8IPp kmSgne1rO() {
        return new oWhsE8IPp(0);
    }

    public static final int oon79WMrY(long j, int i) {
        return cT9gik1zL.kCA6Zs9sL(i, K5PjwoFCN.oon79WMrY(j), K5PjwoFCN.Puu3Rhg4F(j));
    }

    public static final long q3BipwRCk(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i < 0 || i3 < 0) {
                    z = false;
                }
                if (z) {
                    return K5PjwoFCN.J4Ux7ym32.tGV7Q6urW(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    public static Intent qVUwofr5s(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String dXrmkklc8 = dXrmkklc8(activity, activity.getComponentName());
            if (dXrmkklc8 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, dXrmkklc8);
            try {
                return dXrmkklc8(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + dXrmkklc8 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final joIJ4ANvK sk5s77z6Q(eTxfvEx3L etxfvex3l, int i) {
        return etxfvex3l.q3BipwRCk.subSequence(Math.max(0, czCYotiRn.GPLPRo6go(etxfvex3l.J4Ux7ym32) - i), czCYotiRn.GPLPRo6go(etxfvex3l.J4Ux7ym32));
    }

    public static final long tGV7Q6urW(int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
        return j;
    }

    public static final int vPSbyrYWX(long j, int i) {
        return cT9gik1zL.kCA6Zs9sL(i, K5PjwoFCN.vPSbyrYWX(j), K5PjwoFCN.yWvV4ePLl(j));
    }

    public static final long yWvV4ePLl(long j, long j2) {
        return D3DEikrvb.dIocxURUo(cT9gik1zL.kCA6Zs9sL(YWiUMZOtw.tGV7Q6urW(j2), K5PjwoFCN.vPSbyrYWX(j), K5PjwoFCN.yWvV4ePLl(j)), cT9gik1zL.kCA6Zs9sL(YWiUMZOtw.J4Ux7ym32(j2), K5PjwoFCN.oon79WMrY(j), K5PjwoFCN.Puu3Rhg4F(j)));
    }
}
