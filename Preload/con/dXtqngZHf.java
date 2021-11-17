package con;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.feravolt.preload.MainActivity;
import java.security.MessageDigest;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$checkSecurity$2", f = "MainActivity.kt", l = {1214, 1217, 1220, 1223, 1227}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class dXtqngZHf extends dnd1L2J2K implements kkcQgCx5G {
    public Object MzoOEjc4X;
    public int ilHKhw3Yw;
    public final /* synthetic */ MainActivity qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dXtqngZHf(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new dXtqngZHf(this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new dXtqngZHf(this.qVUwofr5s, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Object obj2;
        String str;
        String str2;
        String str3;
        String str4;
        Signature signature;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            MainActivity mainActivity = this.qVUwofr5s;
            String packageName = mainActivity.getPackageName();
            try {
                int i2 = Build.VERSION.SDK_INT;
                PackageInfo packageInfo = i2 >= 28 ? mainActivity.getPackageManager().getPackageInfo(packageName, 134217728) : mainActivity.getPackageManager().getPackageInfo(packageName, 64);
                Signature[] signingCertificateHistory = i2 >= 28 ? packageInfo.signingInfo.getSigningCertificateHistory() : packageInfo.signatures;
                signature = signingCertificateHistory.length == 0 ? null : signingCertificateHistory[0];
            } catch (Exception unused) {
            }
            if (signature == null) {
                str4 = null;
                if (str4 != null) {
                    str3 = null;
                } else {
                    str3 = r6NbD4wnj.BL4OzhZBd(str4).toString();
                }
                if ((this.qVUwofr5s.getApplicationContext().getApplicationInfo().flags & 2) == 0) {
                    MainActivity mainActivity2 = this.qVUwofr5s;
                    this.MzoOEjc4X = str3;
                    this.ilHKhw3Yw = 1;
                    if (MainActivity.V9LQMKGJe(mainActivity2, "0x1", this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                }
            } else {
                MessageDigest instance = MessageDigest.getInstance("SHA1");
                instance.update(signature.toByteArray());
                str4 = new String(Base64.encode(instance.digest(), 0), vey4CQMCh.q3BipwRCk);
                if (str4 != null) {
                }
                if ((this.qVUwofr5s.getApplicationContext().getApplicationInfo().flags & 2) == 0) {
                }
            }
        } else if (i == 1) {
            str3 = (String) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            str2 = (String) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            str = str2;
            if (str != null && !r6NbD4wnj.mUqPm6GBh(str, r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk("Y2d2VDUyV1NHOXVrZ2VVcWk2V2o5WG1tTktJPQ==")).toString(), false, 2)) {
                MainActivity mainActivity3 = this.qVUwofr5s;
                this.MzoOEjc4X = null;
                this.ilHKhw3Yw = 3;
                if (MainActivity.V9LQMKGJe(mainActivity3, "0x3", this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String obj3 = r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("V1dvd2EwdElRblJKU0VKb1pFZG5aMWt5T1hSTWJWcHNZMjFHTW1JeWVEQk1ia0o1V2xkNGRsbFhVamhoUjFab1drTkJkR0pwUVhobVNFNXNXa05CYm1ONk1YZFpWMDV5V1Zka2JFOXFNRGxLZVdzM1dWUXdhMHRIZUhwSlF6RnpTVU5TYVVsSWVHaGtNbk5uU2pOMGQyTnRiSFZrUTBGclRsZ3dibVpJVW1oaFYzZG5URmMwWjAxVGF6ZGFWMDV2WW5sQmEwdERaMjlaVTNONFMxTTRlRTFFUVhkTlEydHc=")))).toString();
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = 4;
            obj2 = yuSxiExwK.Bhmn1KIah(obj3, this);
            if (obj2 == kbkjsqcsl) {
            }
            if (KYuHUB7GA.iiGwOFFnr((String) obj2) != KYuHUB7GA.iiGwOFFnr(r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("TWpZeg=="))).toString())) {
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 3) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
            String obj32 = r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("V1dvd2EwdElRblJKU0VKb1pFZG5aMWt5T1hSTWJWcHNZMjFHTW1JeWVEQk1ia0o1V2xkNGRsbFhVamhoUjFab1drTkJkR0pwUVhobVNFNXNXa05CYm1ONk1YZFpWMDV5V1Zka2JFOXFNRGxLZVdzM1dWUXdhMHRIZUhwSlF6RnpTVU5TYVVsSWVHaGtNbk5uU2pOMGQyTnRiSFZrUTBGclRsZ3dibVpJVW1oaFYzZG5URmMwWjAxVGF6ZGFWMDV2WW5sQmEwdERaMjlaVTNONFMxTTRlRTFFUVhkTlEydHc=")))).toString();
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = 4;
            obj2 = yuSxiExwK2.Bhmn1KIah(obj32, this);
            if (obj2 == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            if (KYuHUB7GA.iiGwOFFnr((String) obj2) != KYuHUB7GA.iiGwOFFnr(r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("TWpZeg=="))).toString())) {
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 4) {
            anXlDk6fV.IytU16YUK(obj);
            obj2 = obj;
            if (KYuHUB7GA.iiGwOFFnr((String) obj2) != KYuHUB7GA.iiGwOFFnr(r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk(KYuHUB7GA.q3BipwRCk("TWpZeg=="))).toString())) {
                MainActivity mainActivity4 = this.qVUwofr5s;
                this.ilHKhw3Yw = 5;
                if (MainActivity.V9LQMKGJe(mainActivity4, "0x4", this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 5) {
            anXlDk6fV.IytU16YUK(obj);
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = str3;
        try {
            throw new Exception("PiracyChecker");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                i3++;
                if (anXlDk6fV.tGV7Q6urW(stackTraceElement.getClassName(), "com.android.internal.os.ZygoteInit")) {
                    i4++;
                }
                if (anXlDk6fV.tGV7Q6urW(stackTraceElement.getClassName(), "com.saurik.substrate.MS$2") && anXlDk6fV.tGV7Q6urW(stackTraceElement.getMethodName(), "invoked")) {
                    i4++;
                }
                if (anXlDk6fV.tGV7Q6urW(stackTraceElement.getClassName(), "de.robv.android.xposed.XposedBridge") && anXlDk6fV.tGV7Q6urW(stackTraceElement.getMethodName(), "main")) {
                    i4++;
                }
                if (anXlDk6fV.tGV7Q6urW(stackTraceElement.getClassName(), "de.robv.android.xposed.XposedBridge") && anXlDk6fV.tGV7Q6urW(stackTraceElement.getMethodName(), "handleHookedMethod")) {
                    i4++;
                }
            }
            if (i4 > 2) {
                MainActivity mainActivity5 = this.qVUwofr5s;
                this.MzoOEjc4X = str;
                this.ilHKhw3Yw = 2;
                if (MainActivity.V9LQMKGJe(mainActivity5, "0x2", this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                str2 = str;
            }
        }
    }
}
