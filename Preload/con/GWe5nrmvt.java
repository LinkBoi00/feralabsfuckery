package con;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.view.menu.mhl5lIdbQ;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class GWe5nrmvt extends BaseAdapter {
    public boolean Bhmn1KIah;
    public RG2GI7LDp CBQ5d1kRq;
    public final LayoutInflater MzoOEjc4X;
    public final boolean PSTqBLTET;
    public final int ilHKhw3Yw;
    public int kmSgne1rO = -1;

    public GWe5nrmvt(RG2GI7LDp rG2GI7LDp, LayoutInflater layoutInflater, boolean z, int i) {
        this.PSTqBLTET = z;
        this.MzoOEjc4X = layoutInflater;
        this.CBQ5d1kRq = rG2GI7LDp;
        this.ilHKhw3Yw = i;
        q3BipwRCk();
    }

    /* renamed from: J4Ux7ym32 */
    public tDC1iJlG1 getItem(int i) {
        ArrayList arrayList;
        if (this.PSTqBLTET) {
            RG2GI7LDp rG2GI7LDp = this.CBQ5d1kRq;
            rG2GI7LDp.yWvV4ePLl();
            arrayList = rG2GI7LDp.oon79WMrY;
        } else {
            arrayList = this.CBQ5d1kRq.CBQ5d1kRq();
        }
        int i2 = this.kmSgne1rO;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (tDC1iJlG1) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList;
        if (this.PSTqBLTET) {
            RG2GI7LDp rG2GI7LDp = this.CBQ5d1kRq;
            rG2GI7LDp.yWvV4ePLl();
            arrayList = rG2GI7LDp.oon79WMrY;
        } else {
            arrayList = this.CBQ5d1kRq.CBQ5d1kRq();
        }
        int i = this.kmSgne1rO;
        int size = arrayList.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.MzoOEjc4X.inflate(this.ilHKhw3Yw, viewGroup, false);
        }
        int i2 = getItem(i).J4Ux7ym32;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.CBQ5d1kRq.kmSgne1rO() && i2 != (i3 >= 0 ? getItem(i3).J4Ux7ym32 : i2));
        mhl5lIdbQ.RG2GI7LDp rG2GI7LDp = (mhl5lIdbQ.RG2GI7LDp) view;
        if (this.Bhmn1KIah) {
            listMenuItemView.setForceShowIcon(true);
        }
        rG2GI7LDp.tGV7Q6urW(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        q3BipwRCk();
        super.notifyDataSetChanged();
    }

    public void q3BipwRCk() {
        RG2GI7LDp rG2GI7LDp = this.CBQ5d1kRq;
        tDC1iJlG1 tdc1ijlg1 = rG2GI7LDp.ixWaw2akD;
        if (tdc1ijlg1 != null) {
            rG2GI7LDp.yWvV4ePLl();
            ArrayList arrayList = rG2GI7LDp.oon79WMrY;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((tDC1iJlG1) arrayList.get(i)) == tdc1ijlg1) {
                    this.kmSgne1rO = i;
                    return;
                }
            }
        }
        this.kmSgne1rO = -1;
    }
}
