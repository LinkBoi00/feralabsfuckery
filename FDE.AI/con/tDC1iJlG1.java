package con;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.RG2GI7LDp;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tDC1iJlG1 implements DIMlfTSGa {
    public RG2GI7LDp Bhmn1KIah;
    public Drawable CBQ5d1kRq;
    public ContextMenu.ContextMenuInfo CpG0imbht;
    public Intent GPLPRo6go;
    public final int J4Ux7ym32;
    public MenuItem.OnMenuItemClickListener MzoOEjc4X;
    public anclinfG8 PSTqBLTET;
    public char Puu3Rhg4F;
    public MenuItem.OnActionExpandListener cAwN510t2;
    public final int dIocxURUo;
    public View dfpT1j18n;
    public int i8XZMQc6Z;
    public iMp2wcpT4 iMyQMM6Qj;
    public CharSequence iiGwOFFnr;
    public CharSequence ilHKhw3Yw;
    public CharSequence kCA6Zs9sL;
    public char oon79WMrY;
    public final int q3BipwRCk;
    public CharSequence qVUwofr5s;
    public final int tGV7Q6urW;
    public int yWvV4ePLl = 4096;
    public int vPSbyrYWX = 4096;
    public int kmSgne1rO = 0;
    public ColorStateList Eeka1udhb = null;
    public PorterDuff.Mode dXrmkklc8 = null;
    public boolean RG6kpfv3v = false;
    public boolean ixWaw2akD = false;
    public boolean sk5s77z6Q = false;
    public int WaUP0CF08 = 16;
    public boolean IytU16YUK = false;

    public tDC1iJlG1(RG2GI7LDp rG2GI7LDp, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.i8XZMQc6Z = 0;
        this.Bhmn1KIah = rG2GI7LDp;
        this.q3BipwRCk = i2;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i3;
        this.dIocxURUo = i4;
        this.kCA6Zs9sL = charSequence;
        this.i8XZMQc6Z = i5;
    }

    public static void tGV7Q6urW(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public boolean CBQ5d1kRq(boolean z) {
        int i = this.WaUP0CF08;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.WaUP0CF08 = i2;
        return i != i2;
    }

    public boolean GPLPRo6go() {
        return (this.WaUP0CF08 & 32) == 32;
    }

    @Override // con.DIMlfTSGa
    public iMp2wcpT4 J4Ux7ym32() {
        return this.iMyQMM6Qj;
    }

    public boolean Puu3Rhg4F() {
        return (this.WaUP0CF08 & 4) != 0;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.i8XZMQc6Z & 8) == 0) {
            return false;
        }
        if (this.dfpT1j18n == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.cAwN510t2;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.Bhmn1KIah.dIocxURUo(this);
        }
        return false;
    }

    public final Drawable dIocxURUo(Drawable drawable) {
        if (drawable != null && this.sk5s77z6Q && (this.RG6kpfv3v || this.ixWaw2akD)) {
            drawable = drawable.mutate();
            if (this.RG6kpfv3v) {
                drawable.setTintList(this.Eeka1udhb);
            }
            if (this.ixWaw2akD) {
                drawable.setTintMode(this.dXrmkklc8);
            }
            this.sk5s77z6Q = false;
        }
        return drawable;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public boolean expandActionView() {
        if (!iiGwOFFnr()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.cAwN510t2;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.Bhmn1KIah.iiGwOFFnr(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public View getActionView() {
        View view = this.dfpT1j18n;
        if (view != null) {
            return view;
        }
        iMp2wcpT4 imp2wcpt4 = this.iMyQMM6Qj;
        if (imp2wcpt4 == null) {
            return null;
        }
        View J4Ux7ym32 = imp2wcpt4.J4Ux7ym32(this);
        this.dfpT1j18n = J4Ux7ym32;
        return J4Ux7ym32;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.vPSbyrYWX;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.oon79WMrY;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.ilHKhw3Yw;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.J4Ux7ym32;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.CBQ5d1kRq;
        if (drawable != null) {
            return dIocxURUo(drawable);
        }
        int i = this.kmSgne1rO;
        if (i == 0) {
            return null;
        }
        Drawable q3BipwRCk = C8A1BseZU.q3BipwRCk(this.Bhmn1KIah.q3BipwRCk, i);
        this.kmSgne1rO = 0;
        this.CBQ5d1kRq = q3BipwRCk;
        return dIocxURUo(q3BipwRCk);
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.Eeka1udhb;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.dXrmkklc8;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.GPLPRo6go;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.q3BipwRCk;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.CpG0imbht;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public int getNumericModifiers() {
        return this.yWvV4ePLl;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.Puu3Rhg4F;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.tGV7Q6urW;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.PSTqBLTET;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.kCA6Zs9sL;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.iiGwOFFnr;
        return charSequence != null ? charSequence : this.kCA6Zs9sL;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.qVUwofr5s;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.PSTqBLTET != null;
    }

    public boolean iiGwOFFnr() {
        iMp2wcpT4 imp2wcpt4;
        if ((this.i8XZMQc6Z & 8) == 0) {
            return false;
        }
        if (this.dfpT1j18n == null && (imp2wcpt4 = this.iMyQMM6Qj) != null) {
            this.dfpT1j18n = imp2wcpt4.J4Ux7ym32(this);
        }
        return this.dfpT1j18n != null;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.IytU16YUK;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.WaUP0CF08 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.WaUP0CF08 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.WaUP0CF08 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        iMp2wcpT4 imp2wcpt4 = this.iMyQMM6Qj;
        return (imp2wcpt4 == null || !imp2wcpt4.tGV7Q6urW()) ? (this.WaUP0CF08 & 8) == 0 : (this.WaUP0CF08 & 8) == 0 && this.iMyQMM6Qj.q3BipwRCk();
    }

    public char kCA6Zs9sL() {
        return this.Bhmn1KIah.Bhmn1KIah() ? this.oon79WMrY : this.Puu3Rhg4F;
    }

    public boolean kmSgne1rO() {
        return this.Bhmn1KIah.PSTqBLTET() && kCA6Zs9sL() != 0;
    }

    public void oon79WMrY(boolean z) {
        int i = this.WaUP0CF08;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.WaUP0CF08 = i2;
        if (i != i2) {
            this.Bhmn1KIah.MzoOEjc4X(false);
        }
    }

    @Override // con.DIMlfTSGa
    public DIMlfTSGa q3BipwRCk(iMp2wcpT4 imp2wcpt4) {
        iMp2wcpT4 imp2wcpt42 = this.iMyQMM6Qj;
        if (imp2wcpt42 != null) {
            imp2wcpt42.q3BipwRCk = null;
        }
        this.dfpT1j18n = null;
        this.iMyQMM6Qj = imp2wcpt4;
        this.Bhmn1KIah.MzoOEjc4X(true);
        iMp2wcpT4 imp2wcpt43 = this.iMyQMM6Qj;
        if (imp2wcpt43 != null) {
            imp2wcpt43.dIocxURUo(new iFKnyAZAM(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.Bhmn1KIah.q3BipwRCk;
        yWvV4ePLl(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        yWvV4ePLl(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.oon79WMrY == c) {
            return this;
        }
        this.oon79WMrY = Character.toLowerCase(c);
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.oon79WMrY == c && this.vPSbyrYWX == i) {
            return this;
        }
        this.oon79WMrY = Character.toLowerCase(c);
        this.vPSbyrYWX = KeyEvent.normalizeMetaState(i);
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.WaUP0CF08;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.WaUP0CF08 = i2;
        if (i != i2) {
            this.Bhmn1KIah.MzoOEjc4X(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.WaUP0CF08 & 4) != 0) {
            RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah;
            Objects.requireNonNull(rG2GI7LDp);
            int groupId = getGroupId();
            int size = rG2GI7LDp.iiGwOFFnr.size();
            rG2GI7LDp.i8XZMQc6Z();
            for (int i = 0; i < size; i++) {
                tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) rG2GI7LDp.iiGwOFFnr.get(i);
                if (tdc1ijlg1.J4Ux7ym32 == groupId && tdc1ijlg1.Puu3Rhg4F() && tdc1ijlg1.isCheckable()) {
                    tdc1ijlg1.oon79WMrY(tdc1ijlg1 == this);
                }
            }
            rG2GI7LDp.WaUP0CF08();
        } else {
            oon79WMrY(z);
        }
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setContentDescription */
    public MenuItem mo4setContentDescription(CharSequence charSequence) {
        this.ilHKhw3Yw = charSequence;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setContentDescription */
    public DIMlfTSGa mo4setContentDescription(CharSequence charSequence) {
        this.ilHKhw3Yw = charSequence;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.WaUP0CF08 = z ? this.WaUP0CF08 | 16 : this.WaUP0CF08 & -17;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.CBQ5d1kRq = null;
        this.kmSgne1rO = i;
        this.sk5s77z6Q = true;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.kmSgne1rO = 0;
        this.CBQ5d1kRq = drawable;
        this.sk5s77z6Q = true;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.Eeka1udhb = colorStateList;
        this.RG6kpfv3v = true;
        this.sk5s77z6Q = true;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.dXrmkklc8 = mode;
        this.ixWaw2akD = true;
        this.sk5s77z6Q = true;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.GPLPRo6go = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.Puu3Rhg4F == c) {
            return this;
        }
        this.Puu3Rhg4F = c;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.Puu3Rhg4F == c && this.yWvV4ePLl == i) {
            return this;
        }
        this.Puu3Rhg4F = c;
        this.yWvV4ePLl = KeyEvent.normalizeMetaState(i);
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.cAwN510t2 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.MzoOEjc4X = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.Puu3Rhg4F = c;
        this.oon79WMrY = Character.toLowerCase(c2);
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.Puu3Rhg4F = c;
        this.yWvV4ePLl = KeyEvent.normalizeMetaState(i);
        this.oon79WMrY = Character.toLowerCase(c2);
        this.vPSbyrYWX = KeyEvent.normalizeMetaState(i2);
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.i8XZMQc6Z = i;
            RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah;
            rG2GI7LDp.vPSbyrYWX = true;
            rG2GI7LDp.MzoOEjc4X(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.Bhmn1KIah.q3BipwRCk.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.kCA6Zs9sL = charSequence;
        this.Bhmn1KIah.MzoOEjc4X(false);
        anclinfG8 anclinfg8 = this.PSTqBLTET;
        if (anclinfg8 != null) {
            anclinfg8.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.iiGwOFFnr = charSequence;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setTooltipText */
    public MenuItem mo5setTooltipText(CharSequence charSequence) {
        this.qVUwofr5s = charSequence;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // con.DIMlfTSGa, android.view.MenuItem
    /* renamed from: setTooltipText */
    public DIMlfTSGa mo5setTooltipText(CharSequence charSequence) {
        this.qVUwofr5s = charSequence;
        this.Bhmn1KIah.MzoOEjc4X(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (CBQ5d1kRq(z)) {
            RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah;
            rG2GI7LDp.Puu3Rhg4F = true;
            rG2GI7LDp.MzoOEjc4X(true);
        }
        return this;
    }

    @Override // java.lang.Object
    public String toString() {
        CharSequence charSequence = this.kCA6Zs9sL;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void vPSbyrYWX(boolean z) {
        this.WaUP0CF08 = z ? this.WaUP0CF08 | 32 : this.WaUP0CF08 & -33;
    }

    public DIMlfTSGa yWvV4ePLl(View view) {
        int i;
        this.dfpT1j18n = view;
        this.iMyQMM6Qj = null;
        if (view != null && view.getId() == -1 && (i = this.q3BipwRCk) > 0) {
            view.setId(i);
        }
        RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah;
        rG2GI7LDp.vPSbyrYWX = true;
        rG2GI7LDp.MzoOEjc4X(true);
        return this;
    }
}
