package com.feravolt.preload.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import com.feravolt.preload.R;
import con.Lz8kBd3Ja;
import con.M5g57XBLr;
import con.PVDPmuuqs;
import con.PmanMZxiM;
import con.Way959ade;
import con.Wk9bO57s4;
import con.anXlDk6fV;
import con.axHKWsBUm;
import con.bu5cjmae6;
import con.d7XzTBPej;
import con.dnd1L2J2K;
import con.gdEmqfwpT;
import con.ggzIMzEKO;
import con.idpM54xlp;
import con.jHNqfwCVd;
import con.llWJsfBCK;
import con.oQkvjGXIr;
import con.pGQQwiF67;
import con.qih4lW99W;
import con.r6NbD4wnj;
import con.tQmFGxsat;
import con.xheEapSkC;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class PreloadService extends Service implements oQkvjGXIr {
    public String CBQ5d1kRq = "";
    public String kmSgne1rO = "";
    public final llWJsfBCK Bhmn1KIah = anXlDk6fV.ixWaw2akD(new RG2GI7LDp());

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements gdEmqfwpT {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp() {
            super(0);
            PreloadService.this = r1;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            List<ApplicationInfo> installedApplications;
            PackageManager packageManager = PreloadService.this.getPackageManager();
            if (packageManager == null || (installedApplications = packageManager.getInstalledApplications(128)) == null) {
                return null;
            }
            return new axHKWsBUm(installedApplications);
        }
    }

    @jHNqfwCVd(c = "com.feravolt.preload.services.PreloadService$onCreate$1", f = "PreloadService.kt", l = {74, 90, 94, 107, 109, 112, 114}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends dnd1L2J2K implements PmanMZxiM {
        public int Eeka1udhb;
        public Object MzoOEjc4X;
        public final /* synthetic */ int RG6kpfv3v;
        public Object ilHKhw3Yw;
        public final /* synthetic */ Lz8kBd3Ja ixWaw2akD;
        public int qVUwofr5s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ(int i, Lz8kBd3Ja lz8kBd3Ja, Way959ade way959ade) {
            super(1, way959ade);
            PreloadService.this = r1;
            this.RG6kpfv3v = i;
            this.ixWaw2akD = lz8kBd3Ja;
        }

        @Override // con.PmanMZxiM
        public Object IytU16YUK(Object obj) {
            return new mhl5lIdbQ(this.RG6kpfv3v, this.ixWaw2akD, (Way959ade) obj).yWvV4ePLl(qih4lW99W.q3BipwRCk);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x02f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0312 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x02aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02b6  */
        @Override // con.LxklW3zxE
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final java.lang.Object yWvV4ePLl(java.lang.Object r17) {
            /*
            // Method dump skipped, instructions count: 906
            */
            throw new UnsupportedOperationException("Method not decompiled: com.feravolt.preload.services.PreloadService.mhl5lIdbQ.yWvV4ePLl(java.lang.Object):java.lang.Object");
        }
    }

    public PreloadService() {
        ExecutorService executorService = xheEapSkC.Eeka1udhb;
        PVDPmuuqs.J4Ux7ym32();
    }

    @Override // con.oQkvjGXIr
    public bu5cjmae6 dIocxURUo() {
        return tQmFGxsat.tGV7Q6urW;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Bundle extras = intent.getExtras();
        String str = null;
        String obj = r6NbD4wnj.BL4OzhZBd(String.valueOf(extras == null ? null : extras.getString("packageid"))).toString();
        this.CBQ5d1kRq = obj;
        if (obj.length() == 0) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                str = extras2.getString("unpreload");
            }
            this.kmSgne1rO = r6NbD4wnj.BL4OzhZBd(String.valueOf(str)).toString();
        }
        throw new UnsupportedOperationException("n/a");
    }

    @Override // android.app.Service
    public void onCreate() {
        int currentTimeMillis = (int) (System.currentTimeMillis() % ((long) 10000));
        NotificationChannel notificationChannel = new NotificationChannel("preload", "Preload", 3);
        Object systemService = getSystemService("notification");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        Lz8kBd3Ja lz8kBd3Ja = new Lz8kBd3Ja(this, "preload");
        lz8kBd3Ja.iiGwOFFnr = 0;
        lz8kBd3Ja.Puu3Rhg4F = "service";
        String q3BipwRCk = M5g57XBLr.q3BipwRCk(getString(R.string.preloading), this.CBQ5d1kRq, "…");
        CharSequence charSequence = q3BipwRCk;
        if (q3BipwRCk != null) {
            int length = q3BipwRCk.length();
            charSequence = q3BipwRCk;
            if (length > 5120) {
                charSequence = q3BipwRCk.subSequence(0, 5120);
            }
        }
        lz8kBd3Ja.kCA6Zs9sL = charSequence;
        lz8kBd3Ja.q3BipwRCk(16, true);
        lz8kBd3Ja.q3BipwRCk(2, true);
        idpM54xlp.dXrmkklc8(d7XzTBPej.CBQ5d1kRq, ggzIMzEKO.q3BipwRCk, 1, new pGQQwiF67(new mhl5lIdbQ(currentTimeMillis, lz8kBd3Ja, null), null));
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras = intent.getExtras();
        String str = null;
        String obj = r6NbD4wnj.BL4OzhZBd(String.valueOf(extras == null ? null : extras.getString("packageid"))).toString();
        this.CBQ5d1kRq = obj;
        if (obj.length() == 0) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                str = extras2.getString("unpreload");
            }
            this.kmSgne1rO = r6NbD4wnj.BL4OzhZBd(String.valueOf(str)).toString();
        }
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
