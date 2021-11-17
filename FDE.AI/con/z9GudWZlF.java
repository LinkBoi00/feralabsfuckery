package con;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.RG2GI7LDp;
/* loaded from: classes.dex */
public class z9GudWZlF extends wRt60CcGM {
    public MenuItem cAwN510t2;
    public final int dfpT1j18n;
    public final int i8XZMQc6Z;
    public MNbAFuzGl iMyQMM6Qj;

    public z9GudWZlF(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.i8XZMQc6Z = 21;
            this.dfpT1j18n = 22;
            return;
        }
        this.i8XZMQc6Z = 22;
        this.dfpT1j18n = 21;
    }

    @Override // con.wRt60CcGM, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        int pointToPosition;
        int i2;
        if (this.iMyQMM6Qj != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
            }
            GWe5nrmvt gWe5nrmvt = (GWe5nrmvt) adapter;
            tDC1iJlG1 tdc1ijlg1 = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gWe5nrmvt.getCount()) {
                tdc1ijlg1 = gWe5nrmvt.getItem(i2);
            }
            MenuItem menuItem = this.cAwN510t2;
            if (menuItem != tdc1ijlg1) {
                RG2GI7LDp rG2GI7LDp = gWe5nrmvt.CBQ5d1kRq;
                if (menuItem != null) {
                    this.iMyQMM6Qj.yWvV4ePLl(rG2GI7LDp, menuItem);
                }
                this.cAwN510t2 = tdc1ijlg1;
                if (tdc1ijlg1 != null) {
                    this.iMyQMM6Qj.iiGwOFFnr(rG2GI7LDp, tdc1ijlg1);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.i8XZMQc6Z) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.dfpT1j18n) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((GWe5nrmvt) adapter).CBQ5d1kRq.tGV7Q6urW(false);
            return true;
        }
    }

    public void setHoverListener(MNbAFuzGl mNbAFuzGl) {
        this.iMyQMM6Qj = mNbAFuzGl;
    }

    @Override // con.wRt60CcGM, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
