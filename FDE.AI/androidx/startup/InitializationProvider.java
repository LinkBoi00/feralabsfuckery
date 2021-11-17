package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.feravolt.preload.R;
import con.OnIfqvynM;
import con.UgMB5z3WN;
import con.cWAoh0O7N;
import java.util.HashSet;
import java.util.Objects;
/* loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (OnIfqvynM.dIocxURUo == null) {
                synchronized (OnIfqvynM.kCA6Zs9sL) {
                    if (OnIfqvynM.dIocxURUo == null) {
                        OnIfqvynM.dIocxURUo = new OnIfqvynM(context);
                    }
                }
            }
            try {
                OnIfqvynM onIfqvynM = OnIfqvynM.dIocxURUo;
                Objects.requireNonNull(onIfqvynM);
                try {
                    Trace.beginSection("Startup");
                    Bundle bundle = onIfqvynM.tGV7Q6urW.getPackageManager().getProviderInfo(new ComponentName(onIfqvynM.tGV7Q6urW.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                    String string = onIfqvynM.tGV7Q6urW.getString(R.string.androidx_startup);
                    if (bundle != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls = Class.forName(str);
                                if (UgMB5z3WN.class.isAssignableFrom(cls)) {
                                    onIfqvynM.J4Ux7ym32.add(cls);
                                    onIfqvynM.q3BipwRCk(cls, hashSet);
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    return true;
                } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                    throw new cWAoh0O7N(e);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            throw new cWAoh0O7N("Context cannot be null");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
