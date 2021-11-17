package con;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class jgvfJ83pS extends pOLFExxoD implements RG2GI7LDp.AbstractC0001RG2GI7LDp {
    public final Context Bhmn1KIah;
    public uj7tg96A8 MzoOEjc4X;
    public final RG2GI7LDp PSTqBLTET;
    public WeakReference ilHKhw3Yw;
    public final /* synthetic */ qTSiJXW5w qVUwofr5s;

    public jgvfJ83pS(qTSiJXW5w qtsijxw5w, Context context, uj7tg96A8 uj7tg96a8) {
        this.qVUwofr5s = qtsijxw5w;
        this.Bhmn1KIah = context;
        this.MzoOEjc4X = uj7tg96a8;
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(context);
        rG2GI7LDp.CBQ5d1kRq = 1;
        this.PSTqBLTET = rG2GI7LDp;
        rG2GI7LDp.kCA6Zs9sL = this;
    }

    @Override // con.pOLFExxoD
    public void Bhmn1KIah(int i) {
        this.qVUwofr5s.iiGwOFFnr.setTitle(this.qVUwofr5s.q3BipwRCk.getResources().getString(i));
    }

    @Override // con.pOLFExxoD
    public void CBQ5d1kRq(int i) {
        this.qVUwofr5s.iiGwOFFnr.setSubtitle(this.qVUwofr5s.q3BipwRCk.getResources().getString(i));
    }

    @Override // con.pOLFExxoD
    public CharSequence GPLPRo6go() {
        return this.qVUwofr5s.iiGwOFFnr.getSubtitle();
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
    public void J4Ux7ym32(RG2GI7LDp rG2GI7LDp) {
        if (this.MzoOEjc4X != null) {
            yWvV4ePLl();
            TeoeEf1aF teoeEf1aF = this.qVUwofr5s.iiGwOFFnr.PSTqBLTET;
            if (teoeEf1aF != null) {
                teoeEf1aF.Bhmn1KIah();
            }
        }
    }

    @Override // con.pOLFExxoD
    public void MzoOEjc4X(boolean z) {
        this.kmSgne1rO = z;
        this.qVUwofr5s.iiGwOFFnr.setTitleOptional(z);
    }

    @Override // con.pOLFExxoD
    public void PSTqBLTET(CharSequence charSequence) {
        this.qVUwofr5s.iiGwOFFnr.setTitle(charSequence);
    }

    @Override // con.pOLFExxoD
    public CharSequence Puu3Rhg4F() {
        return this.qVUwofr5s.iiGwOFFnr.getTitle();
    }

    @Override // con.pOLFExxoD
    public View dIocxURUo() {
        WeakReference weakReference = this.ilHKhw3Yw;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // con.pOLFExxoD
    public MenuInflater iiGwOFFnr() {
        return new tNtRtnI5N(this.Bhmn1KIah);
    }

    @Override // con.pOLFExxoD
    public Menu kCA6Zs9sL() {
        return this.PSTqBLTET;
    }

    @Override // con.pOLFExxoD
    public void kmSgne1rO(CharSequence charSequence) {
        this.qVUwofr5s.iiGwOFFnr.setSubtitle(charSequence);
    }

    @Override // con.pOLFExxoD
    public boolean oon79WMrY() {
        return this.qVUwofr5s.iiGwOFFnr.CpG0imbht;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
    public boolean q3BipwRCk(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        uj7tg96A8 uj7tg96a8 = this.MzoOEjc4X;
        if (uj7tg96a8 != null) {
            return uj7tg96a8.tGV7Q6urW(this, menuItem);
        }
        return false;
    }

    @Override // con.pOLFExxoD
    public void tGV7Q6urW() {
        qTSiJXW5w qtsijxw5w = this.qVUwofr5s;
        if (qtsijxw5w.yWvV4ePLl == this) {
            if (!(!qtsijxw5w.ilHKhw3Yw)) {
                qtsijxw5w.oon79WMrY = this;
                qtsijxw5w.vPSbyrYWX = this.MzoOEjc4X;
            } else {
                this.MzoOEjc4X.J4Ux7ym32(this);
            }
            this.MzoOEjc4X = null;
            this.qVUwofr5s.kCA6Zs9sL(false);
            ActionBarContextView actionBarContextView = this.qVUwofr5s.iiGwOFFnr;
            if (actionBarContextView.ixWaw2akD == null) {
                actionBarContextView.Puu3Rhg4F();
            }
            ((qya5U7BN8) this.qVUwofr5s.kCA6Zs9sL).q3BipwRCk.sendAccessibilityEvent(32);
            qTSiJXW5w qtsijxw5w2 = this.qVUwofr5s;
            qtsijxw5w2.tGV7Q6urW.setHideOnContentScrollEnabled(qtsijxw5w2.ixWaw2akD);
            this.qVUwofr5s.yWvV4ePLl = null;
        }
    }

    @Override // con.pOLFExxoD
    public void vPSbyrYWX(View view) {
        this.qVUwofr5s.iiGwOFFnr.setCustomView(view);
        this.ilHKhw3Yw = new WeakReference(view);
    }

    @Override // con.pOLFExxoD
    public void yWvV4ePLl() {
        if (this.qVUwofr5s.yWvV4ePLl == this) {
            this.PSTqBLTET.i8XZMQc6Z();
            try {
                this.MzoOEjc4X.kCA6Zs9sL(this, this.PSTqBLTET);
            } finally {
                this.PSTqBLTET.WaUP0CF08();
            }
        }
    }
}
