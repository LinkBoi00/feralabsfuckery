package con;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class JLwTA7lmU extends XflkRyC2J {
    public final m1SEohb1F dIocxURUo;
    public Map kCA6Zs9sL = new WeakHashMap();

    public JLwTA7lmU(m1SEohb1F m1seohb1f) {
        this.dIocxURUo = m1seohb1f;
    }

    @Override // con.XflkRyC2J
    public boolean GPLPRo6go(View view, int i, Bundle bundle) {
        if (this.dIocxURUo.oon79WMrY() || this.dIocxURUo.dIocxURUo.getLayoutManager() == null) {
            return super.GPLPRo6go(view, i, bundle);
        }
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        if (xflkRyC2J != null) {
            if (xflkRyC2J.GPLPRo6go(view, i, bundle)) {
                return true;
            }
        } else if (super.GPLPRo6go(view, i, bundle)) {
            return true;
        }
        RecyclerView.V1xq9aVRv v1xq9aVRv = this.dIocxURUo.dIocxURUo.getLayoutManager().J4Ux7ym32.kmSgne1rO;
        return false;
    }

    @Override // con.XflkRyC2J
    public DGdyNqLvN J4Ux7ym32(View view) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        return xflkRyC2J != null ? xflkRyC2J.J4Ux7ym32(view) : super.J4Ux7ym32(view);
    }

    @Override // con.XflkRyC2J
    public void Puu3Rhg4F(View view, int i) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        if (xflkRyC2J != null) {
            xflkRyC2J.Puu3Rhg4F(view, i);
        } else {
            this.q3BipwRCk.sendAccessibilityEvent(view, i);
        }
    }

    @Override // con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        if (!this.dIocxURUo.oon79WMrY() && this.dIocxURUo.dIocxURUo.getLayoutManager() != null) {
            this.dIocxURUo.dIocxURUo.getLayoutManager().XYT7vJqNO(view, iqwHQ6O2l);
            XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
            if (xflkRyC2J != null) {
                xflkRyC2J.dIocxURUo(view, iqwHQ6O2l);
                return;
            }
        }
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
    }

    @Override // con.XflkRyC2J
    public boolean iiGwOFFnr(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(viewGroup);
        return xflkRyC2J != null ? xflkRyC2J.iiGwOFFnr(viewGroup, view, accessibilityEvent) : this.q3BipwRCk.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // con.XflkRyC2J
    public void kCA6Zs9sL(View view, AccessibilityEvent accessibilityEvent) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        if (xflkRyC2J != null) {
            xflkRyC2J.kCA6Zs9sL(view, accessibilityEvent);
        } else {
            this.q3BipwRCk.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // con.XflkRyC2J
    public boolean q3BipwRCk(View view, AccessibilityEvent accessibilityEvent) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        return xflkRyC2J != null ? xflkRyC2J.q3BipwRCk(view, accessibilityEvent) : this.q3BipwRCk.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // con.XflkRyC2J
    public void tGV7Q6urW(View view, AccessibilityEvent accessibilityEvent) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        if (xflkRyC2J != null) {
            xflkRyC2J.tGV7Q6urW(view, accessibilityEvent);
        } else {
            this.q3BipwRCk.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // con.XflkRyC2J
    public void yWvV4ePLl(View view, AccessibilityEvent accessibilityEvent) {
        XflkRyC2J xflkRyC2J = (XflkRyC2J) this.kCA6Zs9sL.get(view);
        if (xflkRyC2J != null) {
            xflkRyC2J.yWvV4ePLl(view, accessibilityEvent);
        } else {
            this.q3BipwRCk.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
