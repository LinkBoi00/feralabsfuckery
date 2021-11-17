package androidx.core.app;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import con.LSrfLcuPd;
import con.ZYfyy7xWN;
import con.vaMyoIs7w;
import java.util.Objects;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(LSrfLcuPd lSrfLcuPd) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ZYfyy7xWN zYfyy7xWN = remoteActionCompat.q3BipwRCk;
        if (lSrfLcuPd.Puu3Rhg4F(1)) {
            zYfyy7xWN = lSrfLcuPd.vPSbyrYWX();
        }
        remoteActionCompat.q3BipwRCk = (IconCompat) zYfyy7xWN;
        remoteActionCompat.J4Ux7ym32 = lSrfLcuPd.GPLPRo6go(remoteActionCompat.J4Ux7ym32, 2);
        remoteActionCompat.tGV7Q6urW = lSrfLcuPd.GPLPRo6go(remoteActionCompat.tGV7Q6urW, 3);
        remoteActionCompat.dIocxURUo = (PendingIntent) lSrfLcuPd.oon79WMrY(remoteActionCompat.dIocxURUo, 4);
        remoteActionCompat.kCA6Zs9sL = lSrfLcuPd.iiGwOFFnr(remoteActionCompat.kCA6Zs9sL, 5);
        remoteActionCompat.iiGwOFFnr = lSrfLcuPd.iiGwOFFnr(remoteActionCompat.iiGwOFFnr, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, LSrfLcuPd lSrfLcuPd) {
        Objects.requireNonNull(lSrfLcuPd);
        IconCompat iconCompat = remoteActionCompat.q3BipwRCk;
        lSrfLcuPd.CBQ5d1kRq(1);
        lSrfLcuPd.PSTqBLTET(iconCompat);
        CharSequence charSequence = remoteActionCompat.J4Ux7ym32;
        lSrfLcuPd.CBQ5d1kRq(2);
        vaMyoIs7w vamyois7w = (vaMyoIs7w) lSrfLcuPd;
        TextUtils.writeToParcel(charSequence, vamyois7w.kCA6Zs9sL, 0);
        CharSequence charSequence2 = remoteActionCompat.tGV7Q6urW;
        lSrfLcuPd.CBQ5d1kRq(3);
        TextUtils.writeToParcel(charSequence2, vamyois7w.kCA6Zs9sL, 0);
        lSrfLcuPd.Bhmn1KIah(remoteActionCompat.dIocxURUo, 4);
        boolean z = remoteActionCompat.kCA6Zs9sL;
        lSrfLcuPd.CBQ5d1kRq(5);
        vamyois7w.kCA6Zs9sL.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.iiGwOFFnr;
        lSrfLcuPd.CBQ5d1kRq(6);
        vamyois7w.kCA6Zs9sL.writeInt(z2 ? 1 : 0);
    }
}
