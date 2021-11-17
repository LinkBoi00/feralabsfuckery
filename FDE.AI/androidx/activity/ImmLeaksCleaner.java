package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.WGohiwKSS;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements WGohiwKSS {
    public static Field Bhmn1KIah;
    public static Field MzoOEjc4X;
    public static Field PSTqBLTET;
    public static int kmSgne1rO;
    public Activity CBQ5d1kRq;

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_DESTROY) {
            if (kmSgne1rO == 0) {
                try {
                    kmSgne1rO = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    PSTqBLTET = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    MzoOEjc4X = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    Bhmn1KIah = declaredField3;
                    declaredField3.setAccessible(true);
                    kmSgne1rO = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (kmSgne1rO == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.CBQ5d1kRq.getSystemService("input_method");
                try {
                    Object obj = Bhmn1KIah.get(inputMethodManager);
                    if (obj != null) {
                        try {
                            synchronized (obj) {
                                try {
                                    View view = (View) PSTqBLTET.get(inputMethodManager);
                                    if (view != null) {
                                        if (!view.isAttachedToWindow()) {
                                            try {
                                                MzoOEjc4X.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            } catch (IllegalAccessException unused2) {
                                            }
                                        }
                                    }
                                } catch (ClassCastException unused3) {
                                } catch (IllegalAccessException unused4) {
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
