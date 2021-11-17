package con;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
/* loaded from: classes.dex */
public class eyRLEBtHJ extends ActionMode {
    public final pOLFExxoD J4Ux7ym32;
    public final Context q3BipwRCk;

    public eyRLEBtHJ(Context context, pOLFExxoD polfexxod) {
        this.q3BipwRCk = context;
        this.J4Ux7ym32 = polfexxod;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.J4Ux7ym32.tGV7Q6urW();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.J4Ux7ym32.dIocxURUo();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new EuUQW1ODZ(this.q3BipwRCk, (sn3fLZljc) this.J4Ux7ym32.kCA6Zs9sL());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.J4Ux7ym32.iiGwOFFnr();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.J4Ux7ym32.GPLPRo6go();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.J4Ux7ym32.CBQ5d1kRq;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.J4Ux7ym32.Puu3Rhg4F();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.J4Ux7ym32.kmSgne1rO;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.J4Ux7ym32.yWvV4ePLl();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.J4Ux7ym32.oon79WMrY();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.J4Ux7ym32.vPSbyrYWX(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.J4Ux7ym32.CBQ5d1kRq(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.J4Ux7ym32.kmSgne1rO(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.J4Ux7ym32.CBQ5d1kRq = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.J4Ux7ym32.Bhmn1KIah(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.J4Ux7ym32.PSTqBLTET(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.J4Ux7ym32.MzoOEjc4X(z);
    }
}
