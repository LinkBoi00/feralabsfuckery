package con;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import com.feravolt.preload.R;
import con.HelDswbLq;
/* loaded from: classes.dex */
public class vAM8bdoEe implements HelDswbLq, AdapterView.OnItemClickListener {
    public RG2GI7LDp Bhmn1KIah;
    public Context CBQ5d1kRq;
    public HelDswbLq.RG2GI7LDp MzoOEjc4X;
    public ExpandedMenuView PSTqBLTET;
    public mMP42If7n ilHKhw3Yw;
    public LayoutInflater kmSgne1rO;

    public vAM8bdoEe(Context context, int i) {
        this.CBQ5d1kRq = context;
        this.kmSgne1rO = LayoutInflater.from(context);
    }

    public ListAdapter J4Ux7ym32() {
        if (this.ilHKhw3Yw == null) {
            this.ilHKhw3Yw = new mMP42If7n(this);
        }
        return this.ilHKhw3Yw;
    }

    @Override // con.HelDswbLq
    public void Puu3Rhg4F(HelDswbLq.RG2GI7LDp rG2GI7LDp) {
        this.MzoOEjc4X = rG2GI7LDp;
    }

    @Override // con.HelDswbLq
    public void dIocxURUo(Context context, RG2GI7LDp rG2GI7LDp) {
        if (this.CBQ5d1kRq != null) {
            this.CBQ5d1kRq = context;
            if (this.kmSgne1rO == null) {
                this.kmSgne1rO = LayoutInflater.from(context);
            }
        }
        this.Bhmn1KIah = rG2GI7LDp;
        mMP42If7n mmp42if7n = this.ilHKhw3Yw;
        if (mmp42if7n != null) {
            mmp42if7n.notifyDataSetChanged();
        }
    }

    @Override // con.HelDswbLq
    public boolean iiGwOFFnr(RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        return false;
    }

    @Override // con.HelDswbLq
    public boolean kCA6Zs9sL(anclinfG8 anclinfg8) {
        if (!anclinfg8.hasVisibleItems()) {
            return false;
        }
        dnrdHR9MV dnrdhr9mv = new dnrdHR9MV(anclinfg8);
        Context context = anclinfg8.q3BipwRCk;
        I6sO15l0X i6sO15l0X = new I6sO15l0X(context, dF3gF5M3i.tGV7Q6urW(context, 0));
        vAM8bdoEe vam8bdoee = new vAM8bdoEe(i6sO15l0X.tGV7Q6urW(), R.layout.abc_list_menu_item_layout);
        dnrdhr9mv.Bhmn1KIah = vam8bdoee;
        vam8bdoee.MzoOEjc4X = dnrdhr9mv;
        RG2GI7LDp rG2GI7LDp = dnrdhr9mv.CBQ5d1kRq;
        rG2GI7LDp.J4Ux7ym32(vam8bdoee, rG2GI7LDp.q3BipwRCk);
        ListAdapter J4Ux7ym32 = dnrdhr9mv.Bhmn1KIah.J4Ux7ym32();
        V8gQUs5xA v8gQUs5xA = (V8gQUs5xA) i6sO15l0X.q3BipwRCk;
        v8gQUs5xA.Bhmn1KIah = J4Ux7ym32;
        v8gQUs5xA.PSTqBLTET = dnrdhr9mv;
        View view = anclinfg8.PSTqBLTET;
        if (view != null) {
            v8gQUs5xA.iiGwOFFnr = view;
        } else {
            v8gQUs5xA.dIocxURUo = anclinfg8.Bhmn1KIah;
            i6sO15l0X.Puu3Rhg4F(anclinfg8.kmSgne1rO);
        }
        ((V8gQUs5xA) i6sO15l0X.q3BipwRCk).kmSgne1rO = dnrdhr9mv;
        dF3gF5M3i q3BipwRCk = i6sO15l0X.q3BipwRCk();
        dnrdhr9mv.kmSgne1rO = q3BipwRCk;
        q3BipwRCk.setOnDismissListener(dnrdhr9mv);
        WindowManager.LayoutParams attributes = dnrdhr9mv.kmSgne1rO.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dnrdhr9mv.kmSgne1rO.show();
        HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.MzoOEjc4X;
        if (rG2GI7LDp2 == null) {
            return true;
        }
        rG2GI7LDp2.Bhmn1KIah(anclinfg8);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.Bhmn1KIah.qVUwofr5s(this.ilHKhw3Yw.getItem(i), this, 0);
    }

    @Override // con.HelDswbLq
    public void oon79WMrY(boolean z) {
        mMP42If7n mmp42if7n = this.ilHKhw3Yw;
        if (mmp42if7n != null) {
            mmp42if7n.notifyDataSetChanged();
        }
    }

    @Override // con.HelDswbLq
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp, boolean z) {
        HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.MzoOEjc4X;
        if (rG2GI7LDp2 != null) {
            rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, z);
        }
    }

    @Override // con.HelDswbLq
    public boolean tGV7Q6urW() {
        return false;
    }

    @Override // con.HelDswbLq
    public boolean yWvV4ePLl(RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        return false;
    }
}
