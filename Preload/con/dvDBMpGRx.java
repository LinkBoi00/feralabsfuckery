package con;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class dvDBMpGRx implements DIMlfTSGa {
    public CharSequence J4Ux7ym32;
    public Drawable Puu3Rhg4F;
    public char dIocxURUo;
    public char iiGwOFFnr;
    public CharSequence oon79WMrY;
    public CharSequence q3BipwRCk;
    public Intent tGV7Q6urW;
    public CharSequence vPSbyrYWX;
    public Context yWvV4ePLl;
    public int kCA6Zs9sL = 4096;
    public int GPLPRo6go = 4096;
    public ColorStateList CBQ5d1kRq = null;
    public PorterDuff.Mode kmSgne1rO = null;
    public boolean Bhmn1KIah = false;
    public boolean PSTqBLTET = false;
    public int MzoOEjc4X = 16;

    public dvDBMpGRx(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.yWvV4ePLl = context;
        this.q3BipwRCk = charSequence;
    }

    @Override // con.DIMlfTSGa
    public iMp2wcpT4 J4Ux7ym32() {
        return null;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.GPLPRo6go;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.iiGwOFFnr;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.oon79WMrY;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.Puu3Rhg4F;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.CBQ5d1kRq;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.kmSgne1rO;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.tGV7Q6urW;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public int getNumericModifiers() {
        return this.kCA6Zs9sL;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.dIocxURUo;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.q3BipwRCk;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.J4Ux7ym32;
        return charSequence != null ? charSequence : this.q3BipwRCk;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.vPSbyrYWX;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.MzoOEjc4X & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.MzoOEjc4X & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.MzoOEjc4X & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.MzoOEjc4X & 8) == 0;
    }

    @Override // con.DIMlfTSGa
    public DIMlfTSGa q3BipwRCk(iMp2wcpT4 imp2wcpt4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.iiGwOFFnr = Character.toLowerCase(c);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.iiGwOFFnr = Character.toLowerCase(c);
        this.GPLPRo6go = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.MzoOEjc4X = (z ? 1 : 0) | (this.MzoOEjc4X & -2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.MzoOEjc4X = (z ? 2 : 0) | (this.MzoOEjc4X & -3);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setContentDescription */
    public MenuItem mo4setContentDescription(CharSequence charSequence) {
        this.oon79WMrY = charSequence;
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public DIMlfTSGa mo4setContentDescription(CharSequence charSequence) {
        this.oon79WMrY = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.MzoOEjc4X = (z ? 16 : 0) | (this.MzoOEjc4X & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        Context context = this.yWvV4ePLl;
        Object obj = D856HTNqd.q3BipwRCk;
        this.Puu3Rhg4F = jsNC7SjP9.J4Ux7ym32(context, i);
        tGV7Q6urW();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.Puu3Rhg4F = drawable;
        tGV7Q6urW();
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.CBQ5d1kRq = colorStateList;
        this.Bhmn1KIah = true;
        tGV7Q6urW();
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.kmSgne1rO = mode;
        this.PSTqBLTET = true;
        tGV7Q6urW();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.tGV7Q6urW = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.dIocxURUo = c;
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.dIocxURUo = c;
        this.kCA6Zs9sL = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.dIocxURUo = c;
        this.iiGwOFFnr = Character.toLowerCase(c2);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.dIocxURUo = c;
        this.kCA6Zs9sL = KeyEvent.normalizeMetaState(i);
        this.iiGwOFFnr = Character.toLowerCase(c2);
        this.GPLPRo6go = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.q3BipwRCk = this.yWvV4ePLl.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.q3BipwRCk = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.J4Ux7ym32 = charSequence;
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setTooltipText */
    public MenuItem mo5setTooltipText(CharSequence charSequence) {
        this.vPSbyrYWX = charSequence;
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public DIMlfTSGa mo5setTooltipText(CharSequence charSequence) {
        this.vPSbyrYWX = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.MzoOEjc4X & 8;
        if (z) {
            i = 0;
        }
        this.MzoOEjc4X = i2 | i;
        return this;
    }

    public final void tGV7Q6urW() {
        Drawable drawable = this.Puu3Rhg4F;
        if (drawable == null) {
            return;
        }
        if (this.Bhmn1KIah || this.PSTqBLTET) {
            this.Puu3Rhg4F = drawable;
            Drawable mutate = drawable.mutate();
            this.Puu3Rhg4F = mutate;
            if (this.Bhmn1KIah) {
                mutate.setTintList(this.CBQ5d1kRq);
            }
            if (this.PSTqBLTET) {
                this.Puu3Rhg4F.setTintMode(this.kmSgne1rO);
            }
        }
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
