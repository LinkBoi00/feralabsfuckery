package con;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
/* loaded from: classes.dex */
public class m4pplfiJF {
    public char Bhmn1KIah;
    public CharSequence CBQ5d1kRq;
    public boolean Eeka1udhb;
    public char MzoOEjc4X;
    public int PSTqBLTET;
    public boolean Puu3Rhg4F;
    public boolean RG6kpfv3v;
    public String WaUP0CF08;
    public CharSequence cAwN510t2;
    public boolean dXrmkklc8;
    public iMp2wcpT4 dfpT1j18n;
    public String i8XZMQc6Z;
    public CharSequence iMyQMM6Qj;
    public int ilHKhw3Yw;
    public int ixWaw2akD;
    public int kmSgne1rO;
    public int oon79WMrY;
    public Menu q3BipwRCk;
    public final /* synthetic */ tNtRtnI5N qFBXIgpia;
    public int qVUwofr5s;
    public int sk5s77z6Q;
    public CharSequence vPSbyrYWX;
    public int yWvV4ePLl;
    public ColorStateList IytU16YUK = null;
    public PorterDuff.Mode CpG0imbht = null;
    public int J4Ux7ym32 = 0;
    public int tGV7Q6urW = 0;
    public int dIocxURUo = 0;
    public int kCA6Zs9sL = 0;
    public boolean iiGwOFFnr = true;
    public boolean GPLPRo6go = true;

    public m4pplfiJF(tNtRtnI5N tntrtni5n, Menu menu) {
        this.qFBXIgpia = tntrtni5n;
        this.q3BipwRCk = menu;
    }

    public final Object J4Ux7ym32(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.qFBXIgpia.tGV7Q6urW.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public SubMenu q3BipwRCk() {
        this.Puu3Rhg4F = true;
        SubMenu addSubMenu = this.q3BipwRCk.addSubMenu(this.J4Ux7ym32, this.yWvV4ePLl, this.oon79WMrY, this.vPSbyrYWX);
        tGV7Q6urW(addSubMenu.getItem());
        return addSubMenu;
    }

    public final void tGV7Q6urW(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.Eeka1udhb).setVisible(this.dXrmkklc8).setEnabled(this.RG6kpfv3v).setCheckable(this.qVUwofr5s >= 1).setTitleCondensed(this.CBQ5d1kRq).setIcon(this.kmSgne1rO);
        int i = this.ixWaw2akD;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.i8XZMQc6Z != null) {
            if (!this.qFBXIgpia.tGV7Q6urW.isRestricted()) {
                tNtRtnI5N tntrtni5n = this.qFBXIgpia;
                if (tntrtni5n.dIocxURUo == null) {
                    tntrtni5n.dIocxURUo = tntrtni5n.q3BipwRCk(tntrtni5n.tGV7Q6urW);
                }
                menuItem.setOnMenuItemClickListener(new Lfj62JTip(tntrtni5n.dIocxURUo, this.i8XZMQc6Z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.qVUwofr5s >= 2) {
            if (menuItem instanceof tDC1iJlG1) {
                tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) menuItem;
                tdc1ijlg1.WaUP0CF08 = (tdc1ijlg1.WaUP0CF08 & -5) | 4;
            } else if (menuItem instanceof wV2TMeIik) {
                wV2TMeIik wv2tmeiik = (wV2TMeIik) menuItem;
                try {
                    if (wv2tmeiik.dIocxURUo == null) {
                        wv2tmeiik.dIocxURUo = wv2tmeiik.tGV7Q6urW.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wv2tmeiik.dIocxURUo.invoke(wv2tmeiik.tGV7Q6urW, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.WaUP0CF08;
        if (str != null) {
            menuItem.setActionView((View) J4Ux7ym32(str, tNtRtnI5N.kCA6Zs9sL, this.qFBXIgpia.q3BipwRCk));
            z = true;
        }
        int i2 = this.sk5s77z6Q;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        iMp2wcpT4 imp2wcpt4 = this.dfpT1j18n;
        if (imp2wcpt4 != null) {
            if (menuItem instanceof DIMlfTSGa) {
                ((DIMlfTSGa) menuItem).q3BipwRCk(imp2wcpt4);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.iMyQMM6Qj;
        boolean z2 = menuItem instanceof DIMlfTSGa;
        if (z2) {
            ((DIMlfTSGa) menuItem).mo4setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.cAwN510t2;
        if (z2) {
            ((DIMlfTSGa) menuItem).mo5setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.Bhmn1KIah;
        int i3 = this.PSTqBLTET;
        if (z2) {
            ((DIMlfTSGa) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.MzoOEjc4X;
        int i4 = this.ilHKhw3Yw;
        if (z2) {
            ((DIMlfTSGa) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.CpG0imbht;
        if (mode != null) {
            if (z2) {
                ((DIMlfTSGa) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.IytU16YUK;
        if (colorStateList == null) {
            return;
        }
        if (z2) {
            ((DIMlfTSGa) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
