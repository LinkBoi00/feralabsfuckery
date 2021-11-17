package con;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class e52oviLyM extends View.AccessibilityDelegate {
    public final XflkRyC2J q3BipwRCk;

    public e52oviLyM(XflkRyC2J xflkRyC2J) {
        this.q3BipwRCk = xflkRyC2J;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.q3BipwRCk.q3BipwRCk(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        DGdyNqLvN J4Ux7ym32 = this.q3BipwRCk.J4Ux7ym32(view);
        if (J4Ux7ym32 != null) {
            return (AccessibilityNodeProvider) J4Ux7ym32.J4Ux7ym32;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.tGV7Q6urW(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        Boolean bool;
        IqwHQ6O2l iqwHQ6O2l = new IqwHQ6O2l(accessibilityNodeInfo);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        CharSequence charSequence = null;
        if (i >= 28) {
            obj = Boolean.valueOf(YcxaXUHw9.dIocxURUo(view));
        } else {
            obj = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool2 = (Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            iqwHQ6O2l.kmSgne1rO(1, z2);
        }
        if (i >= 28) {
            bool = Boolean.valueOf(YcxaXUHw9.tGV7Q6urW(view));
        } else {
            Object tag = view.getTag(R.id.tag_accessibility_heading);
            bool = Boolean.class.isInstance(tag) ? tag : null;
        }
        Boolean bool3 = bool;
        boolean z3 = bool3 != null && bool3.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            iqwHQ6O2l.kmSgne1rO(2, z3);
        }
        iqwHQ6O2l.MzoOEjc4X(IuQbWntsc.GPLPRo6go(view));
        if (i < 30) {
            z = false;
        }
        if (z) {
            charSequence = jpxew3kdF.q3BipwRCk(view);
        } else {
            Object tag2 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag2)) {
                charSequence = tag2;
            }
        }
        iqwHQ6O2l.ilHKhw3Yw(charSequence);
        this.q3BipwRCk.dIocxURUo(view, iqwHQ6O2l);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            iqwHQ6O2l.q3BipwRCk((IqwHQ6O2l.RG2GI7LDp) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.kCA6Zs9sL(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.q3BipwRCk.iiGwOFFnr(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.q3BipwRCk.GPLPRo6go(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View view, int i) {
        this.q3BipwRCk.Puu3Rhg4F(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.yWvV4ePLl(view, accessibilityEvent);
    }
}
