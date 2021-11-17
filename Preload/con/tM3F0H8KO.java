package con;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class tM3F0H8KO implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public final /* synthetic */ Object kmSgne1rO;

    public tM3F0H8KO(V8gQUs5xA v8gQUs5xA, AlertController alertController) {
        this.Bhmn1KIah = v8gQUs5xA;
        this.kmSgne1rO = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.CBQ5d1kRq) {
            case 0:
                ((V8gQUs5xA) this.Bhmn1KIah).PSTqBLTET.onClick(((AlertController) this.kmSgne1rO).J4Ux7ym32, i);
                if (!((V8gQUs5xA) this.Bhmn1KIah).MzoOEjc4X) {
                    ((AlertController) this.kmSgne1rO).J4Ux7ym32.dismiss();
                    return;
                }
                return;
            default:
                ((iSPvE3YGn) this.Bhmn1KIah).TyB1UUd72.setSelection(i);
                if (((iSPvE3YGn) this.Bhmn1KIah).TyB1UUd72.getOnItemClickListener() != null) {
                    iSPvE3YGn ispve3ygn = (iSPvE3YGn) this.Bhmn1KIah;
                    ispve3ygn.TyB1UUd72.performItemClick(view, i, ispve3ygn.QNqj6nIzv.getItemId(i));
                }
                ((iSPvE3YGn) this.Bhmn1KIah).dismiss();
                return;
        }
    }

    public tM3F0H8KO(iSPvE3YGn ispve3ygn, JMfjgYvcq jMfjgYvcq) {
        this.Bhmn1KIah = ispve3ygn;
        this.kmSgne1rO = jMfjgYvcq;
    }
}
