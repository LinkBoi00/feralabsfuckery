package con;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.RG2GI7LDp;
/* loaded from: classes.dex */
public class EuUQW1ODZ extends qMH5oW7Wq implements Menu {
    public final sn3fLZljc tGV7Q6urW;

    public EuUQW1ODZ(Context context, sn3fLZljc sn3flzljc) {
        super(context);
        if (sn3flzljc != null) {
            this.tGV7Q6urW = sn3flzljc;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return tGV7Q6urW(((RG2GI7LDp) this.tGV7Q6urW).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return tGV7Q6urW(((RG2GI7LDp) this.tGV7Q6urW).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return tGV7Q6urW(((RG2GI7LDp) this.tGV7Q6urW).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return tGV7Q6urW(((RG2GI7LDp) this.tGV7Q6urW).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((RG2GI7LDp) this.tGV7Q6urW).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = tGV7Q6urW(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return ((RG2GI7LDp) this.tGV7Q6urW).addSubMenu(i);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((RG2GI7LDp) this.tGV7Q6urW).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return ((RG2GI7LDp) this.tGV7Q6urW).addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return ((RG2GI7LDp) this.tGV7Q6urW).addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        ZmYjNS8wW zmYjNS8wW = this.J4Ux7ym32;
        if (zmYjNS8wW != null) {
            zmYjNS8wW.clear();
        }
        ((RG2GI7LDp) this.tGV7Q6urW).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((RG2GI7LDp) this.tGV7Q6urW).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return tGV7Q6urW(((RG2GI7LDp) this.tGV7Q6urW).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return tGV7Q6urW((MenuItem) ((RG2GI7LDp) this.tGV7Q6urW).iiGwOFFnr.get(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((RG2GI7LDp) this.tGV7Q6urW).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((RG2GI7LDp) this.tGV7Q6urW).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((RG2GI7LDp) this.tGV7Q6urW).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((RG2GI7LDp) this.tGV7Q6urW).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.J4Ux7ym32 != null) {
            int i2 = 0;
            while (true) {
                ZmYjNS8wW zmYjNS8wW = this.J4Ux7ym32;
                if (i2 >= zmYjNS8wW.Bhmn1KIah) {
                    break;
                }
                if (((DIMlfTSGa) zmYjNS8wW.Puu3Rhg4F(i2)).getGroupId() == i) {
                    this.J4Ux7ym32.yWvV4ePLl(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((RG2GI7LDp) this.tGV7Q6urW).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.J4Ux7ym32 != null) {
            int i2 = 0;
            while (true) {
                ZmYjNS8wW zmYjNS8wW = this.J4Ux7ym32;
                if (i2 >= zmYjNS8wW.Bhmn1KIah) {
                    break;
                } else if (((DIMlfTSGa) zmYjNS8wW.Puu3Rhg4F(i2)).getItemId() == i) {
                    this.J4Ux7ym32.yWvV4ePLl(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        ((RG2GI7LDp) this.tGV7Q6urW).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((RG2GI7LDp) this.tGV7Q6urW).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((RG2GI7LDp) this.tGV7Q6urW).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((RG2GI7LDp) this.tGV7Q6urW).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.tGV7Q6urW.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((RG2GI7LDp) this.tGV7Q6urW).size();
    }
}
