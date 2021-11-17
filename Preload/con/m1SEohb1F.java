package con;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import con.IqwHQ6O2l;
/* loaded from: classes.dex */
public class m1SEohb1F extends XflkRyC2J {
    public final RecyclerView dIocxURUo;
    public final JLwTA7lmU kCA6Zs9sL;

    public m1SEohb1F(RecyclerView recyclerView) {
        this.dIocxURUo = recyclerView;
        JLwTA7lmU jLwTA7lmU = this.kCA6Zs9sL;
        this.kCA6Zs9sL = jLwTA7lmU == null ? new JLwTA7lmU(this) : jLwTA7lmU;
    }

    @Override // con.XflkRyC2J
    public boolean GPLPRo6go(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (super.GPLPRo6go(view, i, bundle)) {
            return true;
        }
        if (oon79WMrY() || this.dIocxURUo.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.LULQkQlc9 layoutManager = this.dIocxURUo.getLayoutManager();
        RecyclerView recyclerView = layoutManager.J4Ux7ym32;
        RecyclerView.V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
        if (i == 4096) {
            i4 = recyclerView.canScrollVertically(1) ? (layoutManager.PSTqBLTET - layoutManager.EBQXiIPmm()) - layoutManager.V9LQMKGJe() : 0;
            if (layoutManager.J4Ux7ym32.canScrollHorizontally(1)) {
                i5 = (layoutManager.Bhmn1KIah - layoutManager.QNqj6nIzv()) - layoutManager.igRQEZxnW();
                i3 = i5;
            }
            i3 = 0;
        } else if (i != 8192) {
            i3 = 0;
            i2 = 0;
            if (i2 != 0 && i3 == 0) {
                return false;
            }
            layoutManager.J4Ux7ym32.Dr7UqlxEV(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        } else {
            i4 = recyclerView.canScrollVertically(-1) ? -((layoutManager.PSTqBLTET - layoutManager.EBQXiIPmm()) - layoutManager.V9LQMKGJe()) : 0;
            if (layoutManager.J4Ux7ym32.canScrollHorizontally(-1)) {
                i5 = -((layoutManager.Bhmn1KIah - layoutManager.QNqj6nIzv()) - layoutManager.igRQEZxnW());
                i3 = i5;
            }
            i3 = 0;
        }
        i2 = i4;
        if (i2 != 0) {
        }
        layoutManager.J4Ux7ym32.Dr7UqlxEV(i3, i2, null, Integer.MIN_VALUE, true);
        return true;
    }

    @Override // con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
        if (!oon79WMrY() && this.dIocxURUo.getLayoutManager() != null) {
            RecyclerView.LULQkQlc9 layoutManager = this.dIocxURUo.getLayoutManager();
            RecyclerView recyclerView = layoutManager.J4Ux7ym32;
            RecyclerView.V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
            RecyclerView.kvFwRYSUX kvfwrysux = recyclerView.KlYagMRWx;
            if (recyclerView.canScrollVertically(-1) || layoutManager.J4Ux7ym32.canScrollHorizontally(-1)) {
                iqwHQ6O2l.q3BipwRCk.addAction(8192);
                iqwHQ6O2l.q3BipwRCk.setScrollable(true);
            }
            if (layoutManager.J4Ux7ym32.canScrollVertically(1) || layoutManager.J4Ux7ym32.canScrollHorizontally(1)) {
                iqwHQ6O2l.q3BipwRCk.addAction(4096);
                iqwHQ6O2l.q3BipwRCk.setScrollable(true);
            }
            iqwHQ6O2l.Bhmn1KIah(IqwHQ6O2l.mhl5lIdbQ.q3BipwRCk(layoutManager.j22ftfeNI(v1xq9aVRv, kvfwrysux), layoutManager.dfpT1j18n(v1xq9aVRv, kvfwrysux), false, 0));
        }
    }

    public boolean oon79WMrY() {
        return this.dIocxURUo.igRQEZxnW();
    }

    @Override // con.XflkRyC2J
    public void tGV7Q6urW(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !oon79WMrY()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().DuuXfa7LE(accessibilityEvent);
            }
        }
    }
}
