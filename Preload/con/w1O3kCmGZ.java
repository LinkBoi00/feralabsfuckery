package con;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class w1O3kCmGZ implements ActionMode.Callback {
    public final TextView J4Ux7ym32;
    public Method dIocxURUo;
    public boolean iiGwOFFnr = false;
    public boolean kCA6Zs9sL;
    public final ActionMode.Callback q3BipwRCk;
    public Class tGV7Q6urW;

    public w1O3kCmGZ(ActionMode.Callback callback, TextView textView) {
        this.q3BipwRCk = callback;
        this.J4Ux7ym32 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.q3BipwRCk.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.q3BipwRCk.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.q3BipwRCk.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        boolean z;
        String str;
        Context context = this.J4Ux7ym32.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.iiGwOFFnr) {
            this.iiGwOFFnr = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.tGV7Q6urW = cls;
                this.dIocxURUo = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.kCA6Zs9sL = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.tGV7Q6urW = null;
                this.dIocxURUo = null;
                this.kCA6Zs9sL = false;
            }
        }
        try {
            Method declaredMethod = (!this.kCA6Zs9sL || !this.tGV7Q6urW.isInstance(menu)) ? menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE) : this.dIocxURUo;
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (!activityInfo.exported || !((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            z = false;
                            if (!z) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.J4Ux7ym32;
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.q3BipwRCk.onPrepareActionMode(actionMode, menu);
    }
}
