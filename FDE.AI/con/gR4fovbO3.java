package con;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.RG2GI7LDp;
/* loaded from: classes.dex */
public abstract class gR4fovbO3 implements JU5oYK2sJ, HelDswbLq, AdapterView.OnItemClickListener {
    public Rect CBQ5d1kRq;

    public static boolean RG6kpfv3v(RG2GI7LDp rG2GI7LDp) {
        int size = rG2GI7LDp.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = rG2GI7LDp.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static int kmSgne1rO(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        GWe5nrmvt gWe5nrmvt = (GWe5nrmvt) listAdapter;
        int count = gWe5nrmvt.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = gWe5nrmvt.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = gWe5nrmvt.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void Bhmn1KIah(View view);

    public abstract void Eeka1udhb(boolean z);

    public abstract void MzoOEjc4X(int i);

    public abstract void PSTqBLTET(boolean z);

    @Override // con.HelDswbLq
    public void dIocxURUo(Context context, RG2GI7LDp rG2GI7LDp) {
    }

    public abstract void dXrmkklc8(int i);

    @Override // con.HelDswbLq
    public boolean iiGwOFFnr(RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        return false;
    }

    public abstract void ilHKhw3Yw(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (GWe5nrmvt) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (GWe5nrmvt) listAdapter).CBQ5d1kRq.qVUwofr5s((MenuItem) listAdapter.getItem(i), this, (this instanceof XSh7SAV24) ^ true ? 0 : 4);
    }

    public abstract void qVUwofr5s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void vPSbyrYWX(RG2GI7LDp rG2GI7LDp);

    @Override // con.HelDswbLq
    public boolean yWvV4ePLl(RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        return false;
    }
}
