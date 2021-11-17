package con;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.view.menu.mhl5lIdbQ;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public class mMP42If7n extends BaseAdapter {
    public int CBQ5d1kRq = -1;
    public final /* synthetic */ vAM8bdoEe kmSgne1rO;

    public mMP42If7n(vAM8bdoEe vam8bdoee) {
        this.kmSgne1rO = vam8bdoee;
        q3BipwRCk();
    }

    /* renamed from: J4Ux7ym32 */
    public tDC1iJlG1 getItem(int i) {
        RG2GI7LDp rG2GI7LDp = this.kmSgne1rO.Bhmn1KIah;
        rG2GI7LDp.yWvV4ePLl();
        ArrayList arrayList = rG2GI7LDp.oon79WMrY;
        Objects.requireNonNull(this.kmSgne1rO);
        int i2 = i + 0;
        int i3 = this.CBQ5d1kRq;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (tDC1iJlG1) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        RG2GI7LDp rG2GI7LDp = this.kmSgne1rO.Bhmn1KIah;
        rG2GI7LDp.yWvV4ePLl();
        int size = rG2GI7LDp.oon79WMrY.size();
        Objects.requireNonNull(this.kmSgne1rO);
        int i = size + 0;
        return this.CBQ5d1kRq < 0 ? i : i - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.kmSgne1rO.kmSgne1rO.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((mhl5lIdbQ.RG2GI7LDp) view).tGV7Q6urW(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        q3BipwRCk();
        super.notifyDataSetChanged();
    }

    public void q3BipwRCk() {
        RG2GI7LDp rG2GI7LDp = this.kmSgne1rO.Bhmn1KIah;
        tDC1iJlG1 tdc1ijlg1 = rG2GI7LDp.ixWaw2akD;
        if (tdc1ijlg1 != null) {
            rG2GI7LDp.yWvV4ePLl();
            ArrayList arrayList = rG2GI7LDp.oon79WMrY;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((tDC1iJlG1) arrayList.get(i)) == tdc1ijlg1) {
                    this.CBQ5d1kRq = i;
                    return;
                }
            }
        }
        this.CBQ5d1kRq = -1;
    }
}
