package con;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class qXUxYxCuO {
    public static Method J4Ux7ym32 = null;
    public static Field dIocxURUo = null;
    public static boolean q3BipwRCk = false;
    public static boolean tGV7Q6urW = false;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static boolean J4Ux7ym32(PXqoNfOJ8 pXqoNfOJ8, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (pXqoNfOJ8 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return pXqoNfOJ8.tGV7Q6urW(keyEvent);
        }
        KeyEvent.DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                Object actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!q3BipwRCk) {
                        try {
                            J4Ux7ym32 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        q3BipwRCk = true;
                    }
                    Method method = J4Ux7ym32;
                    if (method != null) {
                        try {
                            z = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (IuQbWntsc.dIocxURUo(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        } else if (!(callback instanceof Dialog)) {
            return (view != null && IuQbWntsc.dIocxURUo(view, keyEvent)) || pXqoNfOJ8.tGV7Q6urW(keyEvent);
        } else {
            Dialog dialog = (Dialog) callback;
            if (!tGV7Q6urW) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    dIocxURUo = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                tGV7Q6urW = true;
            }
            Field field = dIocxURUo;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                }
                if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window.getDecorView();
                if (IuQbWntsc.dIocxURUo(decorView2, keyEvent)) {
                    return true;
                }
                if (decorView2 != null) {
                    dispatcherState = decorView2.getKeyDispatcherState();
                }
                return keyEvent.dispatch(dialog, dispatcherState, dialog);
            }
            onKeyListener = null;
            if (onKeyListener == null) {
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
            }
        }
    }

    public static boolean q3BipwRCk(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = rlVtIza8D.dIocxURUo;
            rlVtIza8D rlvtiza8d = (rlVtIza8D) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (rlvtiza8d == null) {
                rlvtiza8d = new rlVtIza8D();
                view.setTag(R.id.tag_unhandled_key_event_manager, rlvtiza8d);
            }
            WeakReference weakReference = rlvtiza8d.tGV7Q6urW;
            if (weakReference == null || weakReference.get() != keyEvent) {
                rlvtiza8d.tGV7Q6urW = new WeakReference(keyEvent);
                WeakReference weakReference2 = null;
                if (rlvtiza8d.J4Ux7ym32 == null) {
                    rlvtiza8d.J4Ux7ym32 = new SparseArray();
                }
                SparseArray sparseArray = rlvtiza8d.J4Ux7ym32;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = (View) weakReference2.get();
                    if (view2 == null || !mN6fklC4R.J4Ux7ym32(view2)) {
                        return true;
                    }
                    rlvtiza8d.J4Ux7ym32(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }
}
