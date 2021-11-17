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
public class IZ3p17SRG extends pOLFExxoD implements RG2GI7LDp.AbstractC0001RG2GI7LDp {
    public Context Bhmn1KIah;
    public RG2GI7LDp Eeka1udhb;
    public uj7tg96A8 MzoOEjc4X;
    public ActionBarContextView PSTqBLTET;
    public WeakReference ilHKhw3Yw;
    public boolean qVUwofr5s;

    public IZ3p17SRG(Context context, ActionBarContextView actionBarContextView, uj7tg96A8 uj7tg96a8, boolean z) {
        this.Bhmn1KIah = context;
        this.PSTqBLTET = actionBarContextView;
        this.MzoOEjc4X = uj7tg96a8;
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(actionBarContextView.getContext());
        rG2GI7LDp.CBQ5d1kRq = 1;
        this.Eeka1udhb = rG2GI7LDp;
        rG2GI7LDp.kCA6Zs9sL = this;
    }

    @Override // con.pOLFExxoD
    public void Bhmn1KIah(int i) {
        this.PSTqBLTET.setTitle(this.Bhmn1KIah.getString(i));
    }

    @Override // con.pOLFExxoD
    public void CBQ5d1kRq(int i) {
        this.PSTqBLTET.setSubtitle(this.Bhmn1KIah.getString(i));
    }

    @Override // con.pOLFExxoD
    public CharSequence GPLPRo6go() {
        return this.PSTqBLTET.getSubtitle();
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
    public void J4Ux7ym32(RG2GI7LDp rG2GI7LDp) {
        yWvV4ePLl();
        TeoeEf1aF teoeEf1aF = this.PSTqBLTET.PSTqBLTET;
        if (teoeEf1aF != null) {
            teoeEf1aF.Bhmn1KIah();
        }
    }

    @Override // con.pOLFExxoD
    public void MzoOEjc4X(boolean z) {
        this.kmSgne1rO = z;
        this.PSTqBLTET.setTitleOptional(z);
    }

    @Override // con.pOLFExxoD
    public void PSTqBLTET(CharSequence charSequence) {
        this.PSTqBLTET.setTitle(charSequence);
    }

    @Override // con.pOLFExxoD
    public CharSequence Puu3Rhg4F() {
        return this.PSTqBLTET.getTitle();
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
        return new tNtRtnI5N(this.PSTqBLTET.getContext());
    }

    @Override // con.pOLFExxoD
    public Menu kCA6Zs9sL() {
        return this.Eeka1udhb;
    }

    @Override // con.pOLFExxoD
    public void kmSgne1rO(CharSequence charSequence) {
        this.PSTqBLTET.setSubtitle(charSequence);
    }

    @Override // con.pOLFExxoD
    public boolean oon79WMrY() {
        return this.PSTqBLTET.CpG0imbht;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
    public boolean q3BipwRCk(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        return this.MzoOEjc4X.tGV7Q6urW(this, menuItem);
    }

    @Override // con.pOLFExxoD
    public void tGV7Q6urW() {
        if (!this.qVUwofr5s) {
            this.qVUwofr5s = true;
            this.PSTqBLTET.sendAccessibilityEvent(32);
            this.MzoOEjc4X.J4Ux7ym32(this);
        }
    }

    @Override // con.pOLFExxoD
    public void vPSbyrYWX(View view) {
        this.PSTqBLTET.setCustomView(view);
        this.ilHKhw3Yw = view != null ? new WeakReference(view) : null;
    }

    @Override // con.pOLFExxoD
    public void yWvV4ePLl() {
        this.MzoOEjc4X.kCA6Zs9sL(this, this.Eeka1udhb);
    }
}
