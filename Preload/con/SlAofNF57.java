package con;

import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public class SlAofNF57 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ VnuSHN10J CBQ5d1kRq;

    public SlAofNF57(VnuSHN10J vnuSHN10J) {
        this.CBQ5d1kRq = vnuSHN10J;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        VnuSHN10J vnuSHN10J = this.CBQ5d1kRq;
        if (i < 0) {
            uBkGbmfhd ubkgbmfhd = vnuSHN10J.PSTqBLTET;
            obj = !ubkgbmfhd.J4Ux7ym32() ? null : ubkgbmfhd.Bhmn1KIah.getSelectedItem();
        } else {
            obj = vnuSHN10J.getAdapter().getItem(i);
        }
        VnuSHN10J.q3BipwRCk(this.CBQ5d1kRq, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.CBQ5d1kRq.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                uBkGbmfhd ubkgbmfhd2 = this.CBQ5d1kRq.PSTqBLTET;
                view = !ubkgbmfhd2.J4Ux7ym32() ? null : ubkgbmfhd2.Bhmn1KIah.getSelectedView();
                uBkGbmfhd ubkgbmfhd3 = this.CBQ5d1kRq.PSTqBLTET;
                i = !ubkgbmfhd3.J4Ux7ym32() ? -1 : ubkgbmfhd3.Bhmn1KIah.getSelectedItemPosition();
                uBkGbmfhd ubkgbmfhd4 = this.CBQ5d1kRq.PSTqBLTET;
                j = !ubkgbmfhd4.J4Ux7ym32() ? Long.MIN_VALUE : ubkgbmfhd4.Bhmn1KIah.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.CBQ5d1kRq.PSTqBLTET.Bhmn1KIah, view, i, j);
        }
        this.CBQ5d1kRq.PSTqBLTET.dismiss();
    }
}
