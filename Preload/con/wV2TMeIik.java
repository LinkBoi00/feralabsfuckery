package con;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class wV2TMeIik extends qMH5oW7Wq implements MenuItem {
    public Method dIocxURUo;
    public final DIMlfTSGa tGV7Q6urW;

    public wV2TMeIik(Context context, DIMlfTSGa dIMlfTSGa) {
        super(context);
        if (dIMlfTSGa != null) {
            this.tGV7Q6urW = dIMlfTSGa;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.tGV7Q6urW.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.tGV7Q6urW.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        iMp2wcpT4 J4Ux7ym32 = this.tGV7Q6urW.J4Ux7ym32();
        if (J4Ux7ym32 instanceof iMp2wcpT4) {
            return J4Ux7ym32.J4Ux7ym32;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.tGV7Q6urW.getActionView();
        return actionView instanceof r79LvRzS8 ? (View) ((r79LvRzS8) actionView).CBQ5d1kRq : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.tGV7Q6urW.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.tGV7Q6urW.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.tGV7Q6urW.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.tGV7Q6urW.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.tGV7Q6urW.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.tGV7Q6urW.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.tGV7Q6urW.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.tGV7Q6urW.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.tGV7Q6urW.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.tGV7Q6urW.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.tGV7Q6urW.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.tGV7Q6urW.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.tGV7Q6urW.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.tGV7Q6urW.getSubMenu();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.tGV7Q6urW.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.tGV7Q6urW.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.tGV7Q6urW.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.tGV7Q6urW.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.tGV7Q6urW.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.tGV7Q6urW.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.tGV7Q6urW.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.tGV7Q6urW.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.tGV7Q6urW.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        xQXEZbdwm xqxezbdwm = new xQXEZbdwm(this, this.q3BipwRCk, actionProvider);
        DIMlfTSGa dIMlfTSGa = this.tGV7Q6urW;
        if (actionProvider == null) {
            xqxezbdwm = null;
        }
        dIMlfTSGa.q3BipwRCk(xqxezbdwm);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.tGV7Q6urW.setActionView(i);
        View actionView = this.tGV7Q6urW.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.tGV7Q6urW.setActionView(new r79LvRzS8(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new r79LvRzS8(view);
        }
        this.tGV7Q6urW.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.tGV7Q6urW.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.tGV7Q6urW.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.tGV7Q6urW.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.tGV7Q6urW.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.tGV7Q6urW.mo4setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.tGV7Q6urW.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.tGV7Q6urW.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.tGV7Q6urW.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.tGV7Q6urW.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.tGV7Q6urW.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.tGV7Q6urW.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.tGV7Q6urW.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.tGV7Q6urW.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.tGV7Q6urW.setOnActionExpandListener(onActionExpandListener != null ? new BnwIKKv61(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.tGV7Q6urW.setOnMenuItemClickListener(onMenuItemClickListener != null ? new aqHqeV5rz(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.tGV7Q6urW.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.tGV7Q6urW.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.tGV7Q6urW.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.tGV7Q6urW.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.tGV7Q6urW.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.tGV7Q6urW.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.tGV7Q6urW.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.tGV7Q6urW.mo5setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.tGV7Q6urW.setVisible(z);
    }
}
