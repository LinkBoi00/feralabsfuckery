package con;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
public class Poyuktm92 extends P1uqVBniW {
    public final Object dIocxURUo;
    public final /* synthetic */ Jg0aTLb6g kCA6Zs9sL;
    public final /* synthetic */ int tGV7Q6urW = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Poyuktm92(Jg0aTLb6g jg0aTLb6g, Context context) {
        super(jg0aTLb6g);
        this.kCA6Zs9sL = jg0aTLb6g;
        this.dIocxURUo = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0109 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    @Override // con.P1uqVBniW
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int dIocxURUo() {
        boolean z;
        long j;
        switch (this.tGV7Q6urW) {
            case 0:
                if (((PowerManager) this.dIocxURUo).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                YKK4R667A ykk4r667a = (YKK4R667A) this.dIocxURUo;
                AcTXRPxx6 acTXRPxx6 = (AcTXRPxx6) ykk4r667a.tGV7Q6urW;
                boolean z2 = false;
                if (!(acTXRPxx6.J4Ux7ym32 > System.currentTimeMillis())) {
                    Location location = null;
                    Location q3BipwRCk = BBVaGLNaU.iiGwOFFnr((Context) ykk4r667a.q3BipwRCk, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? ykk4r667a.q3BipwRCk("network") : null;
                    if (BBVaGLNaU.iiGwOFFnr((Context) ykk4r667a.q3BipwRCk, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location = ykk4r667a.q3BipwRCk("gps");
                    }
                    if (location == null || q3BipwRCk == null ? location != null : location.getTime() > q3BipwRCk.getTime()) {
                        q3BipwRCk = location;
                    }
                    if (q3BipwRCk != null) {
                        AcTXRPxx6 acTXRPxx62 = (AcTXRPxx6) ykk4r667a.tGV7Q6urW;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (Yl6794IYt.dIocxURUo == null) {
                            Yl6794IYt.dIocxURUo = new Yl6794IYt();
                        }
                        Yl6794IYt yl6794IYt = Yl6794IYt.dIocxURUo;
                        yl6794IYt.q3BipwRCk(currentTimeMillis - 86400000, q3BipwRCk.getLatitude(), q3BipwRCk.getLongitude());
                        yl6794IYt.q3BipwRCk(currentTimeMillis, q3BipwRCk.getLatitude(), q3BipwRCk.getLongitude());
                        if (yl6794IYt.tGV7Q6urW == 1) {
                            z2 = true;
                        }
                        long j2 = yl6794IYt.J4Ux7ym32;
                        long j3 = yl6794IYt.q3BipwRCk;
                        yl6794IYt.q3BipwRCk(currentTimeMillis + 86400000, q3BipwRCk.getLatitude(), q3BipwRCk.getLongitude());
                        long j4 = yl6794IYt.J4Ux7ym32;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                        }
                        acTXRPxx62.q3BipwRCk = z2;
                        acTXRPxx62.J4Ux7ym32 = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z2 = true;
                        }
                        z = z2;
                        if (!z) {
                            return 2;
                        }
                        return 1;
                    }
                }
                z = acTXRPxx6.q3BipwRCk;
                if (!z) {
                }
                break;
        }
    }

    @Override // con.P1uqVBniW
    public void iiGwOFFnr() {
        switch (this.tGV7Q6urW) {
            case 0:
                this.kCA6Zs9sL.PSTqBLTET();
                return;
            default:
                this.kCA6Zs9sL.PSTqBLTET();
                return;
        }
    }

    @Override // con.P1uqVBniW
    public IntentFilter tGV7Q6urW() {
        switch (this.tGV7Q6urW) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Poyuktm92(Jg0aTLb6g jg0aTLb6g, YKK4R667A ykk4r667a) {
        super(jg0aTLb6g);
        this.kCA6Zs9sL = jg0aTLb6g;
        this.dIocxURUo = ykk4r667a;
    }
}
