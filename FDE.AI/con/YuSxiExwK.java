package con;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import com.feravolt.preload.R;
import java.util.Objects;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class YuSxiExwK {
    public YuSxiExwK(dnBSj5uJN dnbsj5ujn) {
    }

    public final Object Bhmn1KIah(String str, Way959ade way959ade) {
        return D3DEikrvb.yWvV4ePLl(new OIsThY5ey(str, null), way959ade);
    }

    public final void CBQ5d1kRq(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            anXlDk6fV.sk5s77z6Q(context, context.getString(R.string.error));
        }
    }

    public final boolean GPLPRo6go(Context context) {
        boolean z;
        JKe64ATmr jKe64ATmr = new JKe64ATmr();
        String obj = r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("WTI5dExtWmxjbUYyYjJ4MExuQnlaV3h2WVdRdWNISnY="))).toString();
        boolean z2 = false;
        try {
            context.getPackageManager().getApplicationInfo(obj, 0);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            int i = Build.VERSION.SDK_INT;
            PackageManager packageManager = context.getPackageManager();
            String installingPackageName = i >= 30 ? packageManager.getInstallSourceInfo(obj).getInstallingPackageName() : packageManager.getInstallerPackageName(obj);
            if (installingPackageName != null && r6NbD4wnj.mUqPm6GBh(installingPackageName, "com.android.vending", false, 2)) {
                z2 = true;
            }
        }
        jKe64ATmr.CBQ5d1kRq = z2;
        if (vPSbyrYWX()) {
            idpM54xlp.dXrmkklc8(d7XzTBPej.CBQ5d1kRq, ggzIMzEKO.J4Ux7ym32, 1, new df9i0PWMP(new VMBWBaMiJ(jKe64ATmr, null), null));
        }
        return jKe64ATmr.CBQ5d1kRq;
    }

    public final Object J4Ux7ym32(String str, boolean z, String str2, String str3, Way959ade way959ade) {
        Object qFBXIgpia = idpM54xlp.qFBXIgpia(tQmFGxsat.q3BipwRCk, new ucGLQ3Xan(z, str, str2, str3, null), way959ade);
        return qFBXIgpia == kBKJSqCSL.COROUTINE_SUSPENDED ? qFBXIgpia : qih4lW99W.q3BipwRCk;
    }

    public final Object Puu3Rhg4F(Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new FV1rg7G6m(null), way959ade);
    }

    public final Object dIocxURUo(String str, Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new BBwUvAoEC(str, null), way959ade);
    }

    public final Object iiGwOFFnr(String str, Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new txxY3u4NP(str, null), way959ade);
    }

    @SuppressLint({"SdCardPath"})
    public final Object kCA6Zs9sL(Context context, String str, String str2, String str3, String str4, Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new lsq9Kronn(str2, str, str3, str4, context, null), way959ade);
    }

    public final String kmSgne1rO(String str) {
        return r6NbD4wnj.BL4OzhZBd(Pattern.compile("[\\p{InCombiningDiacriticalMarks}]").matcher(str).replaceAll("")).toString();
    }

    public final boolean oon79WMrY(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final Object q3BipwRCk(Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new qicoJOgT7(null), way959ade);
    }

    public final Object tGV7Q6urW(String str, Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new WXh0iR1hD(str, null), way959ade);
    }

    public final boolean vPSbyrYWX() {
        return ((Boolean) ((Ka0YY9gOW) tzR8IMGfw.J4Ux7ym32).getValue()).booleanValue();
    }

    public final Object yWvV4ePLl(String str, Way959ade way959ade) {
        return idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new fZ6l2uQ7D(str, null), way959ade);
    }
}
