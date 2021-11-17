package con;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.RG2GI7LDp;
/* loaded from: classes.dex */
public class anclinfG8 extends RG2GI7LDp implements SubMenu {
    public RG2GI7LDp dfpT1j18n;
    public tDC1iJlG1 iMyQMM6Qj;

    public anclinfG8(Context context, RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        super(context);
        this.dfpT1j18n = rG2GI7LDp;
        this.iMyQMM6Qj = tdc1ijlg1;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public boolean Bhmn1KIah() {
        return this.dfpT1j18n.Bhmn1KIah();
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public boolean PSTqBLTET() {
        return this.dfpT1j18n.PSTqBLTET();
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public boolean dIocxURUo(tDC1iJlG1 tdc1ijlg1) {
        return this.dfpT1j18n.dIocxURUo(tdc1ijlg1);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.iMyQMM6Qj;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public boolean iiGwOFFnr(tDC1iJlG1 tdc1ijlg1) {
        return this.dfpT1j18n.iiGwOFFnr(tdc1ijlg1);
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public boolean kCA6Zs9sL(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        return super.kCA6Zs9sL(rG2GI7LDp, menuItem) || this.dfpT1j18n.kCA6Zs9sL(rG2GI7LDp, menuItem);
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public boolean kmSgne1rO() {
        return this.dfpT1j18n.kmSgne1rO();
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public String oon79WMrY() {
        tDC1iJlG1 tdc1ijlg1 = this.iMyQMM6Qj;
        int i = tdc1ijlg1 != null ? tdc1ijlg1.q3BipwRCk : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.dfpT1j18n.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        sk5s77z6Q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        sk5s77z6Q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        sk5s77z6Q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.iMyQMM6Qj.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.iMyQMM6Qj.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.dfpT1j18n.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp
    public RG2GI7LDp vPSbyrYWX() {
        return this.dfpT1j18n.vPSbyrYWX();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        sk5s77z6Q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        sk5s77z6Q(0, charSequence, 0, null, null);
        return this;
    }
}
