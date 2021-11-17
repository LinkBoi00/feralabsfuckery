package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import con.D856HTNqd;
import con.HelDswbLq;
import con.anclinfG8;
import con.jsNC7SjP9;
import con.sn3fLZljc;
import con.tDC1iJlG1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class RG2GI7LDp implements sn3fLZljc {
    public static final int[] i8XZMQc6Z = {1, 4, 5, 3, 2, 0};
    public Drawable Bhmn1KIah;
    public final Resources J4Ux7ym32;
    public View PSTqBLTET;
    public boolean WaUP0CF08;
    public boolean dIocxURUo;
    public tDC1iJlG1 ixWaw2akD;
    public AbstractC0001RG2GI7LDp kCA6Zs9sL;
    public CharSequence kmSgne1rO;
    public final Context q3BipwRCk;
    public boolean tGV7Q6urW;
    public int CBQ5d1kRq = 0;
    public boolean MzoOEjc4X = false;
    public boolean ilHKhw3Yw = false;
    public boolean qVUwofr5s = false;
    public boolean Eeka1udhb = false;
    public ArrayList dXrmkklc8 = new ArrayList();
    public CopyOnWriteArrayList RG6kpfv3v = new CopyOnWriteArrayList();
    public boolean sk5s77z6Q = false;
    public ArrayList iiGwOFFnr = new ArrayList();
    public ArrayList GPLPRo6go = new ArrayList();
    public boolean Puu3Rhg4F = true;
    public ArrayList yWvV4ePLl = new ArrayList();
    public ArrayList oon79WMrY = new ArrayList();
    public boolean vPSbyrYWX = true;

    /* renamed from: androidx.appcompat.view.menu.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public interface AbstractC0001RG2GI7LDp {
        void J4Ux7ym32(RG2GI7LDp rG2GI7LDp);

        boolean q3BipwRCk(RG2GI7LDp rG2GI7LDp, MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface mhl5lIdbQ {
        boolean J4Ux7ym32(tDC1iJlG1 tdc1ijlg1);
    }

    public RG2GI7LDp(Context context) {
        boolean z;
        boolean z2 = false;
        this.q3BipwRCk = context;
        Resources resources = context.getResources();
        this.J4Ux7ym32 = resources;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.dIocxURUo = z2;
    }

    public boolean Bhmn1KIah() {
        return this.tGV7Q6urW;
    }

    public ArrayList CBQ5d1kRq() {
        if (!this.Puu3Rhg4F) {
            return this.GPLPRo6go;
        }
        this.GPLPRo6go.clear();
        int size = this.iiGwOFFnr.size();
        for (int i = 0; i < size; i++) {
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) this.iiGwOFFnr.get(i);
            if (tdc1ijlg1.isVisible()) {
                this.GPLPRo6go.add(tdc1ijlg1);
            }
        }
        this.Puu3Rhg4F = false;
        this.vPSbyrYWX = true;
        return this.GPLPRo6go;
    }

    public final void Eeka1udhb(int i, boolean z) {
        if (i >= 0 && i < this.iiGwOFFnr.size()) {
            this.iiGwOFFnr.remove(i);
            if (z) {
                MzoOEjc4X(true);
            }
        }
    }

    public tDC1iJlG1 GPLPRo6go(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.dXrmkklc8;
        arrayList.clear();
        Puu3Rhg4F(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (tDC1iJlG1) arrayList.get(0);
        }
        boolean Bhmn1KIah = Bhmn1KIah();
        for (int i2 = 0; i2 < size; i2++) {
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) arrayList.get(i2);
            if (Bhmn1KIah) {
                c = tdc1ijlg1.oon79WMrY;
            } else {
                c = tdc1ijlg1.Puu3Rhg4F;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (Bhmn1KIah && c == '\b' && i == 67))) {
                return tdc1ijlg1;
            }
        }
        return null;
    }

    public void J4Ux7ym32(HelDswbLq helDswbLq, Context context) {
        this.RG6kpfv3v.add(new WeakReference(helDswbLq));
        helDswbLq.dIocxURUo(context, this);
        this.vPSbyrYWX = true;
    }

    public void MzoOEjc4X(boolean z) {
        if (!this.MzoOEjc4X) {
            if (z) {
                this.Puu3Rhg4F = true;
                this.vPSbyrYWX = true;
            }
            if (!this.RG6kpfv3v.isEmpty()) {
                i8XZMQc6Z();
                Iterator it = this.RG6kpfv3v.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    HelDswbLq helDswbLq = (HelDswbLq) weakReference.get();
                    if (helDswbLq == null) {
                        this.RG6kpfv3v.remove(weakReference);
                    } else {
                        helDswbLq.oon79WMrY(z);
                    }
                }
                WaUP0CF08();
                return;
            }
            return;
        }
        this.ilHKhw3Yw = true;
        if (z) {
            this.qVUwofr5s = true;
        }
    }

    public boolean PSTqBLTET() {
        return this.dIocxURUo;
    }

    public void Puu3Rhg4F(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean Bhmn1KIah = Bhmn1KIah();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.iiGwOFFnr.size();
            for (int i3 = 0; i3 < size; i3++) {
                tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) this.iiGwOFFnr.get(i3);
                if (tdc1ijlg1.hasSubMenu()) {
                    tdc1ijlg1.PSTqBLTET.Puu3Rhg4F(list, i, keyEvent);
                }
                if (Bhmn1KIah) {
                    c = tdc1ijlg1.oon79WMrY;
                } else {
                    c = tdc1ijlg1.Puu3Rhg4F;
                }
                if (Bhmn1KIah) {
                    i2 = tdc1ijlg1.vPSbyrYWX;
                } else {
                    i2 = tdc1ijlg1.yWvV4ePLl;
                }
                if (((modifiers & 69647) == (i2 & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (Bhmn1KIah && c == '\b' && i == 67)) && tdc1ijlg1.isEnabled()) {
                        list.add(tdc1ijlg1);
                    }
                }
            }
        }
    }

    public void RG6kpfv3v(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(oon79WMrY());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((anclinfG8) item.getSubMenu()).RG6kpfv3v(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void WaUP0CF08() {
        this.MzoOEjc4X = false;
        if (this.ilHKhw3Yw) {
            this.ilHKhw3Yw = false;
            MzoOEjc4X(this.qVUwofr5s);
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return q3BipwRCk(0, 0, 0, this.J4Ux7ym32.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return q3BipwRCk(i, i2, i3, this.J4Ux7ym32.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return q3BipwRCk(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return q3BipwRCk(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.q3BipwRCk.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) q3BipwRCk(i, i2, i3, resolveInfo.loadLabel(packageManager));
            tdc1ijlg1.setIcon(resolveInfo.loadIcon(packageManager));
            tdc1ijlg1.setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = tdc1ijlg1;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.J4Ux7ym32.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.J4Ux7ym32.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) q3BipwRCk(i, i2, i3, charSequence);
        anclinfG8 anclinfg8 = new anclinfG8(this.q3BipwRCk, this, tdc1ijlg1);
        tdc1ijlg1.PSTqBLTET = anclinfg8;
        anclinfg8.setHeaderTitle(tdc1ijlg1.kCA6Zs9sL);
        return anclinfg8;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        tDC1iJlG1 tdc1ijlg1 = this.ixWaw2akD;
        if (tdc1ijlg1 != null) {
            dIocxURUo(tdc1ijlg1);
        }
        this.iiGwOFFnr.clear();
        MzoOEjc4X(true);
    }

    public void clearHeader() {
        this.Bhmn1KIah = null;
        this.kmSgne1rO = null;
        this.PSTqBLTET = null;
        MzoOEjc4X(false);
    }

    @Override // android.view.Menu
    public void close() {
        tGV7Q6urW(true);
    }

    public boolean dIocxURUo(tDC1iJlG1 tdc1ijlg1) {
        boolean z = false;
        if (!this.RG6kpfv3v.isEmpty() && this.ixWaw2akD == tdc1ijlg1) {
            i8XZMQc6Z();
            Iterator it = this.RG6kpfv3v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                HelDswbLq helDswbLq = (HelDswbLq) weakReference.get();
                if (helDswbLq == null) {
                    this.RG6kpfv3v.remove(weakReference);
                } else {
                    z = helDswbLq.yWvV4ePLl(this, tdc1ijlg1);
                    if (z) {
                        break;
                    }
                }
            }
            WaUP0CF08();
            if (z) {
                this.ixWaw2akD = null;
            }
        }
        return z;
    }

    public void dXrmkklc8(HelDswbLq helDswbLq) {
        Iterator it = this.RG6kpfv3v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            HelDswbLq helDswbLq2 = (HelDswbLq) weakReference.get();
            if (helDswbLq2 == null || helDswbLq2 == helDswbLq) {
                this.RG6kpfv3v.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) this.iiGwOFFnr.get(i2);
            if (tdc1ijlg1.q3BipwRCk == i) {
                return tdc1ijlg1;
            }
            if (tdc1ijlg1.hasSubMenu() && (findItem = tdc1ijlg1.PSTqBLTET.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.iiGwOFFnr.get(i);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.WaUP0CF08) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((tDC1iJlG1) this.iiGwOFFnr.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i8XZMQc6Z() {
        if (!this.MzoOEjc4X) {
            this.MzoOEjc4X = true;
            this.ilHKhw3Yw = false;
            this.qVUwofr5s = false;
        }
    }

    public boolean iiGwOFFnr(tDC1iJlG1 tdc1ijlg1) {
        boolean z = false;
        if (this.RG6kpfv3v.isEmpty()) {
            return false;
        }
        i8XZMQc6Z();
        Iterator it = this.RG6kpfv3v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            HelDswbLq helDswbLq = (HelDswbLq) weakReference.get();
            if (helDswbLq == null) {
                this.RG6kpfv3v.remove(weakReference);
            } else {
                z = helDswbLq.iiGwOFFnr(this, tdc1ijlg1);
                if (z) {
                    break;
                }
            }
        }
        WaUP0CF08();
        if (z) {
            this.ixWaw2akD = tdc1ijlg1;
        }
        return z;
    }

    public boolean ilHKhw3Yw(MenuItem menuItem, int i) {
        return qVUwofr5s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return GPLPRo6go(i, keyEvent) != null;
    }

    public void ixWaw2akD(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((anclinfG8) item.getSubMenu()).ixWaw2akD(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(oon79WMrY(), sparseArray);
        }
    }

    public boolean kCA6Zs9sL(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        AbstractC0001RG2GI7LDp rG2GI7LDp2 = this.kCA6Zs9sL;
        return rG2GI7LDp2 != null && rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, menuItem);
    }

    public boolean kmSgne1rO() {
        return this.sk5s77z6Q;
    }

    public String oon79WMrY() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ilHKhw3Yw(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        tDC1iJlG1 GPLPRo6go = GPLPRo6go(i, keyEvent);
        boolean qVUwofr5s = GPLPRo6go != null ? qVUwofr5s(GPLPRo6go, null, i2) : false;
        if ((i2 & 2) != 0) {
            tGV7Q6urW(true);
        }
        return qVUwofr5s;
    }

    public MenuItem q3BipwRCk(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = i8XZMQc6Z;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                tDC1iJlG1 tdc1ijlg1 = new tDC1iJlG1(this, i, i2, i3, i6, charSequence, this.CBQ5d1kRq);
                ArrayList arrayList = this.iiGwOFFnr;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((tDC1iJlG1) arrayList.get(size)).dIocxURUo <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, tdc1ijlg1);
                MzoOEjc4X(true);
                return tdc1ijlg1;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (r1 != false) goto L_0x00d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
        if ((r9 & 1) == 0) goto L_0x00d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
        if (r1 == false) goto L_0x00d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        tGV7Q6urW(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean qVUwofr5s(android.view.MenuItem r7, con.HelDswbLq r8, int r9) {
        /*
            r6 = this;
            con.tDC1iJlG1 r7 = (con.tDC1iJlG1) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d7
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.MzoOEjc4X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0042
        L_0x0019:
            androidx.appcompat.view.menu.RG2GI7LDp r1 = r7.Bhmn1KIah
            boolean r1 = r1.kCA6Zs9sL(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0042
        L_0x0022:
            android.content.Intent r1 = r7.GPLPRo6go
            if (r1 == 0) goto L_0x0036
            androidx.appcompat.view.menu.RG2GI7LDp r3 = r7.Bhmn1KIah     // Catch: ActivityNotFoundException -> 0x002e
            android.content.Context r3 = r3.q3BipwRCk     // Catch: ActivityNotFoundException -> 0x002e
            r3.startActivity(r1)     // Catch: ActivityNotFoundException -> 0x002e
            goto L_0x0042
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            con.iMp2wcpT4 r1 = r7.iMyQMM6Qj
            if (r1 == 0) goto L_0x0044
            android.view.ActionProvider r1 = r1.J4Ux7ym32
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0044
        L_0x0042:
            r1 = r2
            goto L_0x0045
        L_0x0044:
            r1 = r0
        L_0x0045:
            con.iMp2wcpT4 r3 = r7.iMyQMM6Qj
            if (r3 == 0) goto L_0x0053
            android.view.ActionProvider r4 = r3.J4Ux7ym32
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0053
            r4 = r2
            goto L_0x0054
        L_0x0053:
            r4 = r0
        L_0x0054:
            boolean r5 = r7.iiGwOFFnr()
            if (r5 == 0) goto L_0x0063
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d6
            goto L_0x00d3
        L_0x0063:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0071
            if (r4 == 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d6
            goto L_0x00d3
        L_0x0071:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0078
            r6.tGV7Q6urW(r0)
        L_0x0078:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x008c
            con.anclinfG8 r9 = new con.anclinfG8
            android.content.Context r5 = r6.q3BipwRCk
            r9.<init>(r5, r6, r7)
            r7.PSTqBLTET = r9
            java.lang.CharSequence r5 = r7.kCA6Zs9sL
            r9.setHeaderTitle(r5)
        L_0x008c:
            con.anclinfG8 r7 = r7.PSTqBLTET
            if (r4 == 0) goto L_0x009a
            android.view.ActionProvider r9 = r3.J4Ux7ym32
            con.wV2TMeIik r3 = r3.tGV7Q6urW
            java.util.Objects.requireNonNull(r3)
            r9.onPrepareSubMenu(r7)
        L_0x009a:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.RG6kpfv3v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00a3
            goto L_0x00d0
        L_0x00a3:
            if (r8 == 0) goto L_0x00a9
            boolean r0 = r8.kCA6Zs9sL(r7)
        L_0x00a9:
            java.util.concurrent.CopyOnWriteArrayList r8 = r6.RG6kpfv3v
            java.util.Iterator r8 = r8.iterator()
        L_0x00af:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d0
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            con.HelDswbLq r3 = (con.HelDswbLq) r3
            if (r3 != 0) goto L_0x00c9
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.RG6kpfv3v
            r3.remove(r9)
            goto L_0x00af
        L_0x00c9:
            if (r0 != 0) goto L_0x00af
            boolean r0 = r3.kCA6Zs9sL(r7)
            goto L_0x00af
        L_0x00d0:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d6
        L_0x00d3:
            r6.tGV7Q6urW(r2)
        L_0x00d6:
            return r1
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.RG2GI7LDp.qVUwofr5s(android.view.MenuItem, con.HelDswbLq, int):boolean");
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((tDC1iJlG1) this.iiGwOFFnr.get(i2)).J4Ux7ym32 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.iiGwOFFnr.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((tDC1iJlG1) this.iiGwOFFnr.get(i2)).J4Ux7ym32 != i) {
                    break;
                }
                Eeka1udhb(i2, false);
                i3 = i4;
            }
            MzoOEjc4X(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((tDC1iJlG1) this.iiGwOFFnr.get(i2)).q3BipwRCk == i) {
                break;
            } else {
                i2++;
            }
        }
        Eeka1udhb(i2, true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.iiGwOFFnr.size();
        for (int i2 = 0; i2 < size; i2++) {
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) this.iiGwOFFnr.get(i2);
            if (tdc1ijlg1.J4Ux7ym32 == i) {
                tdc1ijlg1.WaUP0CF08 = (tdc1ijlg1.WaUP0CF08 & -5) | (z2 ? 4 : 0);
                tdc1ijlg1.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.sk5s77z6Q = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.iiGwOFFnr.size();
        for (int i2 = 0; i2 < size; i2++) {
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) this.iiGwOFFnr.get(i2);
            if (tdc1ijlg1.J4Ux7ym32 == i) {
                tdc1ijlg1.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.iiGwOFFnr.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) this.iiGwOFFnr.get(i2);
            if (tdc1ijlg1.J4Ux7ym32 == i && tdc1ijlg1.CBQ5d1kRq(z)) {
                z2 = true;
            }
        }
        if (z2) {
            MzoOEjc4X(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.tGV7Q6urW = z;
        MzoOEjc4X(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.iiGwOFFnr.size();
    }

    public final void sk5s77z6Q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.J4Ux7ym32;
        if (view != null) {
            this.PSTqBLTET = view;
            this.kmSgne1rO = null;
            this.Bhmn1KIah = null;
        } else {
            if (i > 0) {
                this.kmSgne1rO = resources.getText(i);
            } else if (charSequence != null) {
                this.kmSgne1rO = charSequence;
            }
            if (i2 > 0) {
                Context context = this.q3BipwRCk;
                Object obj = D856HTNqd.q3BipwRCk;
                this.Bhmn1KIah = jsNC7SjP9.J4Ux7ym32(context, i2);
            } else if (drawable != null) {
                this.Bhmn1KIah = drawable;
            }
            this.PSTqBLTET = null;
        }
        MzoOEjc4X(false);
    }

    public final void tGV7Q6urW(boolean z) {
        if (!this.Eeka1udhb) {
            this.Eeka1udhb = true;
            Iterator it = this.RG6kpfv3v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                HelDswbLq helDswbLq = (HelDswbLq) weakReference.get();
                if (helDswbLq == null) {
                    this.RG6kpfv3v.remove(weakReference);
                } else {
                    helDswbLq.q3BipwRCk(this, z);
                }
            }
            this.Eeka1udhb = false;
        }
    }

    public RG2GI7LDp vPSbyrYWX() {
        return this;
    }

    public void yWvV4ePLl() {
        ArrayList CBQ5d1kRq = CBQ5d1kRq();
        if (this.vPSbyrYWX) {
            Iterator it = this.RG6kpfv3v.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                HelDswbLq helDswbLq = (HelDswbLq) weakReference.get();
                if (helDswbLq == null) {
                    this.RG6kpfv3v.remove(weakReference);
                } else {
                    z |= helDswbLq.tGV7Q6urW();
                }
            }
            if (z) {
                this.yWvV4ePLl.clear();
                this.oon79WMrY.clear();
                int size = CBQ5d1kRq.size();
                for (int i = 0; i < size; i++) {
                    tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) CBQ5d1kRq.get(i);
                    (tdc1ijlg1.GPLPRo6go() ? this.yWvV4ePLl : this.oon79WMrY).add(tdc1ijlg1);
                }
            } else {
                this.yWvV4ePLl.clear();
                this.oon79WMrY.clear();
                this.oon79WMrY.addAll(CBQ5d1kRq());
            }
            this.vPSbyrYWX = false;
        }
    }
}
