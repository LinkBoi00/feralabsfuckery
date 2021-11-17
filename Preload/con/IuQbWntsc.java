package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public abstract class IuQbWntsc {
    public static Field J4Ux7ym32;
    public static WeakHashMap q3BipwRCk = null;
    public static boolean tGV7Q6urW = false;
    public static final int[] dIocxURUo = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final YJr8dt1YN kCA6Zs9sL = hTJXOTTZd.CBQ5d1kRq;

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static void Bhmn1KIah(View view, IqwHQ6O2l.RG2GI7LDp rG2GI7LDp, CharSequence charSequence, Sq43ZrsXU sq43ZrsXU) {
        q3BipwRCk(view, new IqwHQ6O2l.RG2GI7LDp(null, rG2GI7LDp.J4Ux7ym32, null, sq43ZrsXU, rG2GI7LDp.tGV7Q6urW));
    }

    public static rZsVaMPDT CBQ5d1kRq(View view, rZsVaMPDT rzsvampdt) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + rzsvampdt + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ufuofxMju.J4Ux7ym32(view, rzsvampdt);
        }
        NwQnhQfAW nwQnhQfAW = (NwQnhQfAW) view.getTag(R.id.tag_on_receive_content_listener);
        if (nwQnhQfAW != null) {
            rZsVaMPDT q3BipwRCk2 = ((R6XB2icpf) nwQnhQfAW).q3BipwRCk(view, rzsvampdt);
            if (q3BipwRCk2 == null) {
                return null;
            }
            return (view instanceof YJr8dt1YN ? (YJr8dt1YN) view : kCA6Zs9sL).q3BipwRCk(q3BipwRCk2);
        }
        return (view instanceof YJr8dt1YN ? (YJr8dt1YN) view : kCA6Zs9sL).q3BipwRCk(rzsvampdt);
    }

    public static CharSequence GPLPRo6go(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = YcxaXUHw9.J4Ux7ym32(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static Roohga8FY J4Ux7ym32(View view) {
        if (q3BipwRCk == null) {
            q3BipwRCk = new WeakHashMap();
        }
        Roohga8FY roohga8FY = (Roohga8FY) q3BipwRCk.get(view);
        if (roohga8FY != null) {
            return roohga8FY;
        }
        Roohga8FY roohga8FY2 = new Roohga8FY(view);
        q3BipwRCk.put(view, roohga8FY2);
        return roohga8FY2;
    }

    public static void MzoOEjc4X(View view, XflkRyC2J xflkRyC2J) {
        if (xflkRyC2J == null && (iiGwOFFnr(view) instanceof e52oviLyM)) {
            xflkRyC2J = new XflkRyC2J();
        }
        view.setAccessibilityDelegate(xflkRyC2J == null ? null : xflkRyC2J.J4Ux7ym32);
    }

    public static void PSTqBLTET(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            MVnl53wL9.tGV7Q6urW(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static List Puu3Rhg4F(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static boolean dIocxURUo(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = rlVtIza8D.dIocxURUo;
        rlVtIza8D rlvtiza8d = (rlVtIza8D) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (rlvtiza8d == null) {
            rlvtiza8d = new rlVtIza8D();
            view.setTag(R.id.tag_unhandled_key_event_manager, rlvtiza8d);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = rlvtiza8d.q3BipwRCk;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = rlVtIza8D.dIocxURUo;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (rlvtiza8d.q3BipwRCk == null) {
                        rlvtiza8d.q3BipwRCk = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = rlVtIza8D.dIocxURUo;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            rlvtiza8d.q3BipwRCk.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                rlvtiza8d.q3BipwRCk.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View q3BipwRCk2 = rlvtiza8d.q3BipwRCk(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (q3BipwRCk2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (rlvtiza8d.J4Ux7ym32 == null) {
                    rlvtiza8d.J4Ux7ym32 = new SparseArray();
                }
                rlvtiza8d.J4Ux7ym32.put(keyCode, new WeakReference(q3BipwRCk2));
            }
        }
        if (q3BipwRCk2 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate iiGwOFFnr(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return MVnl53wL9.q3BipwRCk(view);
        }
        if (tGV7Q6urW) {
            return null;
        }
        if (J4Ux7ym32 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                J4Ux7ym32 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                tGV7Q6urW = true;
                return null;
            }
        }
        Object obj = J4Ux7ym32.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static XflkRyC2J kCA6Zs9sL(View view) {
        View.AccessibilityDelegate iiGwOFFnr = iiGwOFFnr(view);
        if (iiGwOFFnr == null) {
            return null;
        }
        return iiGwOFFnr instanceof e52oviLyM ? ((e52oviLyM) iiGwOFFnr).q3BipwRCk : new XflkRyC2J(iiGwOFFnr);
    }

    public static void kmSgne1rO(int i, View view) {
        List Puu3Rhg4F = Puu3Rhg4F(view);
        for (int i2 = 0; i2 < Puu3Rhg4F.size(); i2++) {
            if (((IqwHQ6O2l.RG2GI7LDp) Puu3Rhg4F.get(i2)).q3BipwRCk() == i) {
                Puu3Rhg4F.remove(i2);
                return;
            }
        }
    }

    public static void oon79WMrY(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = GPLPRo6go(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (mN6fklC4R.q3BipwRCk(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                mN6fklC4R.GPLPRo6go(obtain, i);
                if (z) {
                    obtain.getText().add(GPLPRo6go(view));
                    if (VCCyeOu6I.tGV7Q6urW(view) == 0) {
                        VCCyeOu6I.Eeka1udhb(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (VCCyeOu6I.tGV7Q6urW((View) parent) == 4) {
                            VCCyeOu6I.Eeka1udhb(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                mN6fklC4R.GPLPRo6go(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(GPLPRo6go(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    mN6fklC4R.kCA6Zs9sL(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void q3BipwRCk(View view, IqwHQ6O2l.RG2GI7LDp rG2GI7LDp) {
        XflkRyC2J kCA6Zs9sL2 = kCA6Zs9sL(view);
        if (kCA6Zs9sL2 == null) {
            kCA6Zs9sL2 = new XflkRyC2J();
        }
        MzoOEjc4X(view, kCA6Zs9sL2);
        kmSgne1rO(rG2GI7LDp.q3BipwRCk(), view);
        Puu3Rhg4F(view).add(rG2GI7LDp);
        oon79WMrY(view, 0);
    }

    public static o8nscdGif tGV7Q6urW(View view, o8nscdGif o8nscdgif) {
        WindowInsets GPLPRo6go = o8nscdgif.GPLPRo6go();
        if (GPLPRo6go != null) {
            WindowInsets q3BipwRCk2 = cyVJjwbRF.q3BipwRCk(view, GPLPRo6go);
            if (!q3BipwRCk2.equals(GPLPRo6go)) {
                return o8nscdGif.yWvV4ePLl(q3BipwRCk2, view);
            }
        }
        return o8nscdgif;
    }

    public static o8nscdGif vPSbyrYWX(View view, o8nscdGif o8nscdgif) {
        WindowInsets GPLPRo6go = o8nscdgif.GPLPRo6go();
        if (GPLPRo6go != null) {
            WindowInsets J4Ux7ym322 = cyVJjwbRF.J4Ux7ym32(view, GPLPRo6go);
            if (!J4Ux7ym322.equals(GPLPRo6go)) {
                return o8nscdGif.yWvV4ePLl(J4Ux7ym322, view);
            }
        }
        return o8nscdgif;
    }

    public static String[] yWvV4ePLl(View view) {
        return Build.VERSION.SDK_INT >= 31 ? ufuofxMju.q3BipwRCk(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }
}
