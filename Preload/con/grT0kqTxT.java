package con;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.feravolt.preload.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class grT0kqTxT extends XticXNngr implements zmOE3WTfy {
    public yYWQSxv2D i8XZMQc6Z;

    public grT0kqTxT() {
        this.MzoOEjc4X.J4Ux7ym32.J4Ux7ym32("androidx:appcompat", new ATZ6xBjCr(this));
        yWvV4ePLl(new Tb5aRBrPI(this));
    }

    private void vPSbyrYWX() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public zhWsuDChl Bhmn1KIah() {
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        jg0aTLb6g.qFBXIgpia();
        return jg0aTLb6g.Eeka1udhb;
    }

    @Override // con.zmOE3WTfy
    public void J4Ux7ym32(pOLFExxoD polfexxod) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        vPSbyrYWX();
        kmSgne1rO().tGV7Q6urW(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void attachBaseContext(Context context) {
        Configuration configuration;
        boolean z;
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        jg0aTLb6g.j22ftfeNI = true;
        int i = jg0aTLb6g.ziwPzaoF3;
        if (i == -100) {
            i = -100;
        }
        int AqaWJg0b4 = jg0aTLb6g.AqaWJg0b4(context, i);
        if (Jg0aTLb6g.IG30YE5GU && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(jg0aTLb6g.RG6kpfv3v(context, AqaWJg0b4, null));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof fnUv4KsJz) {
            try {
                ((fnUv4KsJz) context).q3BipwRCk(jg0aTLb6g.RG6kpfv3v(context, AqaWJg0b4, null));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (Jg0aTLb6g.R2hkbNqWf) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration RG6kpfv3v = jg0aTLb6g.RG6kpfv3v(context, AqaWJg0b4, configuration);
            fnUv4KsJz fnuv4ksjz = new fnUv4KsJz(context, 2131821090);
            fnuv4ksjz.q3BipwRCk(RG6kpfv3v);
            if (context.getTheme() != null) {
                z = true;
                if (z) {
                    Resources.Theme theme = fnuv4ksjz.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        theme.rebase();
                    } else {
                        synchronized (HSNIk390d.q3BipwRCk) {
                            if (!HSNIk390d.tGV7Q6urW) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    HSNIk390d.J4Ux7ym32 = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                HSNIk390d.tGV7Q6urW = true;
                            }
                            Method method = HSNIk390d.J4Ux7ym32;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    HSNIk390d.J4Ux7ym32 = null;
                                }
                            }
                        }
                    }
                }
                context = fnuv4ksjz;
            }
            z = false;
            if (z) {
            }
            context = fnuv4ksjz;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        Bhmn1KIah();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // con.zmOE3WTfy
    public void dIocxURUo(pOLFExxoD polfexxod) {
    }

    @Override // con.pc1YcJups, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        Bhmn1KIah();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        jg0aTLb6g.i8XZMQc6Z();
        return jg0aTLb6g.MzoOEjc4X.findViewById(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        if (jg0aTLb6g.dXrmkklc8 == null) {
            jg0aTLb6g.qFBXIgpia();
            zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
            jg0aTLb6g.dXrmkklc8 = new tNtRtnI5N(zhwsudchl != null ? zhwsudchl.J4Ux7ym32() : jg0aTLb6g.PSTqBLTET);
        }
        return jg0aTLb6g.dXrmkklc8;
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public Resources getResources() {
        int i = BJDnPwIjV.q3BipwRCk;
        return super.getResources();
    }

    @Override // con.zmOE3WTfy
    public pOLFExxoD iiGwOFFnr(uj7tg96A8 uj7tg96a8) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        kmSgne1rO().kCA6Zs9sL();
    }

    public yYWQSxv2D kmSgne1rO() {
        if (this.i8XZMQc6Z == null) {
            qIxSZWcre qixszwcre = yYWQSxv2D.CBQ5d1kRq;
            this.i8XZMQc6Z = new Jg0aTLb6g(this, null, this, this);
        }
        return this.i8XZMQc6Z;
    }

    @Override // con.XticXNngr, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        if (jg0aTLb6g.vNtjxmzUM && jg0aTLb6g.CpG0imbht) {
            jg0aTLb6g.qFBXIgpia();
            zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
            if (zhwsudchl != null) {
                qTSiJXW5w qtsijxw5w = (qTSiJXW5w) zhwsudchl;
                qtsijxw5w.GPLPRo6go(qtsijxw5w.q3BipwRCk.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        srLS6zLvm q3BipwRCk = srLS6zLvm.q3BipwRCk();
        Context context = jg0aTLb6g.PSTqBLTET;
        synchronized (q3BipwRCk) {
            b3J1OyZhd b3j1oyzhd = q3BipwRCk.q3BipwRCk;
            synchronized (b3j1oyzhd) {
                NRnsbVC1Y nRnsbVC1Y = (NRnsbVC1Y) b3j1oyzhd.dIocxURUo.get(context);
                if (nRnsbVC1Y != null) {
                    nRnsbVC1Y.q3BipwRCk();
                }
            }
        }
        jg0aTLb6g.MzoOEjc4X(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // con.XticXNngr, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kmSgne1rO().GPLPRo6go();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // con.XticXNngr, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent qVUwofr5s;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        zhWsuDChl Bhmn1KIah = Bhmn1KIah();
        if (!(menuItem.getItemId() != 16908332 || Bhmn1KIah == null || (((qya5U7BN8) ((qTSiJXW5w) Bhmn1KIah).kCA6Zs9sL).J4Ux7ym32 & 4) == 0 || (qVUwofr5s = dnBSj5uJN.qVUwofr5s(this)) == null)) {
            if (shouldUpRecreateTask(qVUwofr5s)) {
                ArrayList arrayList = new ArrayList();
                Intent qVUwofr5s2 = dnBSj5uJN.qVUwofr5s(this);
                if (qVUwofr5s2 == null) {
                    qVUwofr5s2 = dnBSj5uJN.qVUwofr5s(this);
                }
                if (qVUwofr5s2 != null) {
                    ComponentName component = qVUwofr5s2.getComponent();
                    if (component == null) {
                        component = qVUwofr5s2.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            Intent Eeka1udhb = dnBSj5uJN.Eeka1udhb(this, component);
                            if (Eeka1udhb == null) {
                                break;
                            }
                            arrayList.add(size, Eeka1udhb);
                            component = Eeka1udhb.getComponent();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException(e);
                        }
                    }
                    arrayList.add(qVUwofr5s2);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    Object obj = D856HTNqd.q3BipwRCk;
                    edDLFcoR9.q3BipwRCk(this, intentArr, null);
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
            } else {
                navigateUpTo(qVUwofr5s);
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // con.XticXNngr, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((Jg0aTLb6g) kmSgne1rO()).i8XZMQc6Z();
    }

    @Override // con.XticXNngr, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        jg0aTLb6g.qFBXIgpia();
        zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
        if (zhwsudchl != null) {
            ((qTSiJXW5w) zhwsudchl).RG6kpfv3v = true;
        }
    }

    @Override // con.XticXNngr, android.app.Activity
    public void onStart() {
        super.onStart();
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) kmSgne1rO();
        jg0aTLb6g.L4EwGfXiQ = true;
        jg0aTLb6g.PSTqBLTET();
    }

    @Override // con.XticXNngr, android.app.Activity
    public void onStop() {
        super.onStop();
        kmSgne1rO().Puu3Rhg4F();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        kmSgne1rO().Bhmn1KIah(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        Bhmn1KIah();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        vPSbyrYWX();
        kmSgne1rO().vPSbyrYWX(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        vPSbyrYWX();
        kmSgne1rO().CBQ5d1kRq(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        vPSbyrYWX();
        kmSgne1rO().kmSgne1rO(view, layoutParams);
    }

    @Override // android.app.Activity, android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void setTheme(int i) {
        super.setTheme(i);
        ((Jg0aTLb6g) kmSgne1rO()).wIZEdYHUn = i;
    }
}
