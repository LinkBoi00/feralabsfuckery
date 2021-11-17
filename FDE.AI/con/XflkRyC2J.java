package con;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class XflkRyC2J {
    public static final View.AccessibilityDelegate tGV7Q6urW = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate J4Ux7ym32;
    public final View.AccessibilityDelegate q3BipwRCk;

    public XflkRyC2J() {
        this.q3BipwRCk = tGV7Q6urW;
        this.J4Ux7ym32 = new e52oviLyM(this);
    }

    public XflkRyC2J(View.AccessibilityDelegate accessibilityDelegate) {
        this.q3BipwRCk = accessibilityDelegate;
        this.J4Ux7ym32 = new e52oviLyM(this);
    }

    public boolean GPLPRo6go(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            IqwHQ6O2l.RG2GI7LDp rG2GI7LDp = (IqwHQ6O2l.RG2GI7LDp) list.get(i2);
            if (rG2GI7LDp.q3BipwRCk() != i) {
                i2++;
            } else if (rG2GI7LDp.dIocxURUo != null) {
                Class cls = rG2GI7LDp.tGV7Q6urW;
                if (cls != null) {
                    try {
                        K6PL0z3I0.q3BipwRCk(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (Exception e) {
                        Class cls2 = rG2GI7LDp.tGV7Q6urW;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                }
                z = rG2GI7LDp.dIocxURUo.q3BipwRCk(view, null);
            }
        }
        z = false;
        if (!z) {
            z = this.q3BipwRCk.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] dIocxURUo = IqwHQ6O2l.dIocxURUo(view.createAccessibilityNodeInfo().getText());
                int i4 = 0;
                while (dIocxURUo != null && i4 < dIocxURUo.length) {
                    if (clickableSpan.equals(dIocxURUo[i4])) {
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                z3 = true;
            }
        }
        return z3;
    }

    public DGdyNqLvN J4Ux7ym32(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.q3BipwRCk.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new DGdyNqLvN(accessibilityNodeProvider, 3);
        }
        return null;
    }

    public void Puu3Rhg4F(View view, int i) {
        this.q3BipwRCk.sendAccessibilityEvent(view, i);
    }

    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
    }

    public boolean iiGwOFFnr(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.q3BipwRCk.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void kCA6Zs9sL(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean q3BipwRCk(View view, AccessibilityEvent accessibilityEvent) {
        return this.q3BipwRCk.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void tGV7Q6urW(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void yWvV4ePLl(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
