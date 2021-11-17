package com.feravolt.preload.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.feravolt.preload.R;
import con.CAc9d5Vtv;
import con.D3DEikrvb;
import con.GDa4nFTKO;
import con.K6PL0z3I0;
import con.KYuHUB7GA;
import con.Lz8kBd3Ja;
import con.M5g57XBLr;
import con.PVDPmuuqs;
import con.PmYqqGuHi;
import con.PmanMZxiM;
import con.SacA58h0y;
import con.UexvVay3o;
import con.UxhEwcONu;
import con.Way959ade;
import con.Wk9bO57s4;
import con.YuSxiExwK;
import con.ZezE4t3SB;
import con.anXlDk6fV;
import con.axHKWsBUm;
import con.bu5cjmae6;
import con.bvGs7Xnwh;
import con.d7XzTBPej;
import con.dnd1L2J2K;
import con.eYalu8N7X;
import con.gdEmqfwpT;
import con.ggzIMzEKO;
import con.idpM54xlp;
import con.jHNqfwCVd;
import con.kBKJSqCSL;
import con.klMjnHCuk;
import con.l1DBlUus5;
import con.llWJsfBCK;
import con.oQkvjGXIr;
import con.pGQQwiF67;
import con.qih4lW99W;
import con.r6NbD4wnj;
import con.tQmFGxsat;
import con.tzR8IMGfw;
import con.vtMy2KPve;
import con.xaeEKvU2c;
import con.xheEapSkC;
import con.zkUmn2JpE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
        public final Object yWvV4ePLl(Object obj) {
            zkUmn2JpE zkumn2jpe;
            bvGs7Xnwh bvgs7xnwh;
            zkUmn2JpE zkumn2jpe2;
            CAc9d5Vtv cAc9d5Vtv;
            SharedPreferences sharedPreferences;
            List list;
            Object obj2;
            int i;
            boolean z;
            Object obj3;
            SharedPreferences sharedPreferences2;
            List list2;
            kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
            switch (this.Eeka1udhb) {
                case 0:
                    anXlDk6fV.IytU16YUK(obj);
                    PreloadService preloadService = PreloadService.this;
                    int i2 = this.RG6kpfv3v;
                    Lz8kBd3Ja lz8kBd3Ja = this.ixWaw2akD;
                    Objects.requireNonNull(lz8kBd3Ja);
                    new ArrayList();
                    Bundle bundle = new Bundle();
                    int i3 = Build.VERSION.SDK_INT;
                    Notification.Builder builder = new Notification.Builder(lz8kBd3Ja.q3BipwRCk, lz8kBd3Ja.oon79WMrY);
                    Notification notification = lz8kBd3Ja.CBQ5d1kRq;
                    builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(null).setContentText(lz8kBd3Ja.kCA6Zs9sL).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
                    builder.setSubText(null).setUsesChronometer(false).setPriority(lz8kBd3Ja.iiGwOFFnr);
                    Iterator it = lz8kBd3Ja.J4Ux7ym32.iterator();
                    if (!it.hasNext()) {
                        Bundle bundle2 = lz8kBd3Ja.yWvV4ePLl;
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        builder.setShowWhen(lz8kBd3Ja.GPLPRo6go);
                        builder.setLocalOnly(false).setGroup(null).setGroupSummary(false).setSortKey(null);
                        builder.setCategory(lz8kBd3Ja.Puu3Rhg4F).setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
                        List<String> q3BipwRCk = i3 < 28 ? klMjnHCuk.q3BipwRCk(klMjnHCuk.J4Ux7ym32(lz8kBd3Ja.tGV7Q6urW), lz8kBd3Ja.kmSgne1rO) : lz8kBd3Ja.kmSgne1rO;
                        if (q3BipwRCk != null && !q3BipwRCk.isEmpty()) {
                            for (String str : q3BipwRCk) {
                                builder.addPerson(str);
                            }
                        }
                        if (lz8kBd3Ja.dIocxURUo.size() > 0) {
                            if (lz8kBd3Ja.yWvV4ePLl == null) {
                                lz8kBd3Ja.yWvV4ePLl = new Bundle();
                            }
                            Bundle bundle3 = lz8kBd3Ja.yWvV4ePLl.getBundle("android.car.EXTENSIONS");
                            if (bundle3 == null) {
                                bundle3 = new Bundle();
                            }
                            Bundle bundle4 = new Bundle(bundle3);
                            Bundle bundle5 = new Bundle();
                            if (lz8kBd3Ja.dIocxURUo.size() <= 0) {
                                bundle3.putBundle("invisible_actions", bundle5);
                                bundle4.putBundle("invisible_actions", bundle5);
                                if (lz8kBd3Ja.yWvV4ePLl == null) {
                                    lz8kBd3Ja.yWvV4ePLl = new Bundle();
                                }
                                lz8kBd3Ja.yWvV4ePLl.putBundle("android.car.EXTENSIONS", bundle3);
                                bundle.putBundle("android.car.EXTENSIONS", bundle4);
                            } else {
                                Integer.toString(0);
                                K6PL0z3I0.q3BipwRCk(lz8kBd3Ja.dIocxURUo.get(0));
                                Object obj4 = UxhEwcONu.q3BipwRCk;
                                new Bundle();
                                throw null;
                            }
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        builder.setExtras(lz8kBd3Ja.yWvV4ePLl).setRemoteInputHistory(null);
                        builder.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0).setGroupAlertBehavior(0);
                        if (!TextUtils.isEmpty(lz8kBd3Ja.oon79WMrY)) {
                            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                        }
                        if (i4 >= 28) {
                            Iterator it2 = lz8kBd3Ja.tGV7Q6urW.iterator();
                            if (it2.hasNext()) {
                                K6PL0z3I0.q3BipwRCk(it2.next());
                                throw null;
                            }
                        }
                        if (i4 >= 29) {
                            builder.setAllowSystemGeneratedContextualActions(lz8kBd3Ja.vPSbyrYWX);
                            builder.setBubbleMetadata(null);
                        }
                        SacA58h0y.q3BipwRCk();
                        preloadService.startForeground(i2, builder.build());
                        sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(PreloadService.this);
                        if (!(PreloadService.this.CBQ5d1kRq.length() > 0) || !tzR8IMGfw.q3BipwRCk.GPLPRo6go(PreloadService.this)) {
                            if (!r6NbD4wnj.AqaWJg0b4(PreloadService.this.kmSgne1rO, "true", true) || !tzR8IMGfw.q3BipwRCk.GPLPRo6go(PreloadService.this)) {
                                xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
                                zkUmn2JpE zkumn2jpe3 = ZezE4t3SB.q3BipwRCk;
                                l1DBlUus5 l1dbluus5 = new l1DBlUus5(PreloadService.this, null);
                                this.Eeka1udhb = 7;
                                if (idpM54xlp.qFBXIgpia(zkumn2jpe3, l1dbluus5, this) == kbkjsqcsl) {
                                    return kbkjsqcsl;
                                }
                            } else {
                                PreloadService preloadService2 = PreloadService.this;
                                this.Eeka1udhb = 6;
                                if (D3DEikrvb.yWvV4ePLl(new vtMy2KPve(preloadService2, null), this) == kbkjsqcsl) {
                                    return kbkjsqcsl;
                                }
                            }
                            PreloadService.this.stopForeground(this.RG6kpfv3v);
                            PreloadService.this.stopForeground(true);
                            PreloadService.this.stopSelf();
                            return qih4lW99W.q3BipwRCk;
                        }
                        PmYqqGuHi<ApplicationInfo> pmYqqGuHi = (PmYqqGuHi) PreloadService.this.Bhmn1KIah.getValue();
                        if (pmYqqGuHi == null) {
                            r8 = null;
                        } else {
                            PreloadService preloadService3 = PreloadService.this;
                            for (ApplicationInfo applicationInfo : pmYqqGuHi) {
                                if (r6NbD4wnj.mUqPm6GBh(applicationInfo.sourceDir, preloadService3.CBQ5d1kRq, false, 2)) {
                                }
                            }
                            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                        }
                        xaeEKvU2c xaeekvu2c2 = tQmFGxsat.tGV7Q6urW;
                        GDa4nFTKO gDa4nFTKO = new GDa4nFTKO(applicationInfo, PreloadService.this, null);
                        this.MzoOEjc4X = sharedPreferences2;
                        z = true;
                        this.Eeka1udhb = 1;
                        obj3 = idpM54xlp.qFBXIgpia(xaeekvu2c2, gDa4nFTKO, this);
                        if (obj3 == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        list2 = (List) obj3;
                        if (list2 != null && (list2.isEmpty() ^ z)) {
                            int i5 = sharedPreferences2.getInt("sizeofpreload", 0);
                            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                            this.MzoOEjc4X = sharedPreferences2;
                            this.ilHKhw3Yw = list2;
                            this.qVUwofr5s = i5;
                            this.Eeka1udhb = 2;
                            obj2 = yuSxiExwK.q3BipwRCk(this);
                            if (obj2 != kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            sharedPreferences = sharedPreferences2;
                            i = i5;
                            list = list2;
                            if (i < ((Number) obj2).intValue()) {
                                ApplicationInfo applicationInfo2 = PreloadService.this.getApplicationInfo();
                                String q3BipwRCk2 = UexvVay3o.q3BipwRCk(applicationInfo2 == null ? null : applicationInfo2.nativeLibraryDir, KYuHUB7GA.q3BipwRCk("L2xpYnZtdG91Y2guc28="));
                                xaeEKvU2c xaeekvu2c3 = tQmFGxsat.tGV7Q6urW;
                                eYalu8N7X eyalu8n7x = new eYalu8N7X(q3BipwRCk2, list, PreloadService.this, sharedPreferences, null);
                                this.MzoOEjc4X = null;
                                this.ilHKhw3Yw = null;
                                this.Eeka1udhb = 3;
                                if (idpM54xlp.qFBXIgpia(xaeekvu2c3, eyalu8n7x, this) == kbkjsqcsl) {
                                    return kbkjsqcsl;
                                }
                                xaeEKvU2c xaeekvu2c4 = tQmFGxsat.q3BipwRCk;
                                zkumn2jpe2 = ZezE4t3SB.q3BipwRCk;
                                cAc9d5Vtv = new CAc9d5Vtv(PreloadService.this, null);
                                this.Eeka1udhb = 4;
                                if (idpM54xlp.qFBXIgpia(zkumn2jpe2, cAc9d5Vtv, this) == kbkjsqcsl) {
                                    return kbkjsqcsl;
                                }
                                PreloadService.this.stopForeground(this.RG6kpfv3v);
                                PreloadService.this.stopForeground(true);
                                PreloadService.this.stopSelf();
                                return qih4lW99W.q3BipwRCk;
                            }
                        }
                        xaeEKvU2c xaeekvu2c5 = tQmFGxsat.q3BipwRCk;
                        zkumn2jpe = ZezE4t3SB.q3BipwRCk;
                        bvgs7xnwh = new bvGs7Xnwh(PreloadService.this, null);
                        this.MzoOEjc4X = null;
                        this.ilHKhw3Yw = null;
                        this.Eeka1udhb = 5;
                        if (idpM54xlp.qFBXIgpia(zkumn2jpe, bvgs7xnwh, this) == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        PreloadService.this.stopForeground(this.RG6kpfv3v);
                        PreloadService.this.stopForeground(true);
                        PreloadService.this.stopSelf();
                        return qih4lW99W.q3BipwRCk;
                    }
                    K6PL0z3I0.q3BipwRCk(it.next());
                    throw null;
                case 1:
                    sharedPreferences2 = (SharedPreferences) this.MzoOEjc4X;
                    anXlDk6fV.IytU16YUK(obj);
                    z = true;
                    obj3 = obj;
                    list2 = (List) obj3;
                    if (list2 != null) {
                        int i52 = sharedPreferences2.getInt("sizeofpreload", 0);
                        YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
                        this.MzoOEjc4X = sharedPreferences2;
                        this.ilHKhw3Yw = list2;
                        this.qVUwofr5s = i52;
                        this.Eeka1udhb = 2;
                        obj2 = yuSxiExwK2.q3BipwRCk(this);
                        if (obj2 != kbkjsqcsl) {
                        }
                        break;
                    }
                    xaeEKvU2c xaeekvu2c52 = tQmFGxsat.q3BipwRCk;
                    zkumn2jpe = ZezE4t3SB.q3BipwRCk;
                    bvgs7xnwh = new bvGs7Xnwh(PreloadService.this, null);
                    this.MzoOEjc4X = null;
                    this.ilHKhw3Yw = null;
                    this.Eeka1udhb = 5;
                    if (idpM54xlp.qFBXIgpia(zkumn2jpe, bvgs7xnwh, this) == kbkjsqcsl) {
                    }
                    PreloadService.this.stopForeground(this.RG6kpfv3v);
                    PreloadService.this.stopForeground(true);
                    PreloadService.this.stopSelf();
                    return qih4lW99W.q3BipwRCk;
                case 2:
                    i = this.qVUwofr5s;
                    list = (List) this.ilHKhw3Yw;
                    sharedPreferences = (SharedPreferences) this.MzoOEjc4X;
                    anXlDk6fV.IytU16YUK(obj);
                    obj2 = obj;
                    if (i < ((Number) obj2).intValue()) {
                    }
                    xaeEKvU2c xaeekvu2c522 = tQmFGxsat.q3BipwRCk;
                    zkumn2jpe = ZezE4t3SB.q3BipwRCk;
                    bvgs7xnwh = new bvGs7Xnwh(PreloadService.this, null);
                    this.MzoOEjc4X = null;
                    this.ilHKhw3Yw = null;
                    this.Eeka1udhb = 5;
                    if (idpM54xlp.qFBXIgpia(zkumn2jpe, bvgs7xnwh, this) == kbkjsqcsl) {
                    }
                    PreloadService.this.stopForeground(this.RG6kpfv3v);
                    PreloadService.this.stopForeground(true);
                    PreloadService.this.stopSelf();
                    return qih4lW99W.q3BipwRCk;
                case 3:
                    anXlDk6fV.IytU16YUK(obj);
                    xaeEKvU2c xaeekvu2c42 = tQmFGxsat.q3BipwRCk;
                    zkumn2jpe2 = ZezE4t3SB.q3BipwRCk;
                    cAc9d5Vtv = new CAc9d5Vtv(PreloadService.this, null);
                    this.Eeka1udhb = 4;
                    if (idpM54xlp.qFBXIgpia(zkumn2jpe2, cAc9d5Vtv, this) == kbkjsqcsl) {
                    }
                    PreloadService.this.stopForeground(this.RG6kpfv3v);
                    PreloadService.this.stopForeground(true);
                    PreloadService.this.stopSelf();
                    return qih4lW99W.q3BipwRCk;
                case 4:
                case 5:
                case 6:
                case 7:
                    anXlDk6fV.IytU16YUK(obj);
                    PreloadService.this.stopForeground(this.RG6kpfv3v);
                    PreloadService.this.stopForeground(true);
                    PreloadService.this.stopSelf();
                    return qih4lW99W.q3BipwRCk;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
