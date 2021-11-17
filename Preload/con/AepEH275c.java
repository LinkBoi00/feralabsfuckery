package con;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class AepEH275c {
    public static AtomicReference q3BipwRCk = new AtomicReference();

    public static Calendar J4Ux7ym32(Calendar calendar) {
        Calendar iiGwOFFnr = iiGwOFFnr(calendar);
        Calendar kCA6Zs9sL = kCA6Zs9sL();
        kCA6Zs9sL.set(iiGwOFFnr.get(1), iiGwOFFnr.get(2), iiGwOFFnr.get(5));
        return kCA6Zs9sL;
    }

    public static Calendar dIocxURUo() {
        LDTGRDDLi lDTGRDDLi = (LDTGRDDLi) q3BipwRCk.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(tGV7Q6urW());
        return instance;
    }

    public static Calendar iiGwOFFnr(Calendar calendar) {
        Calendar instance = Calendar.getInstance(tGV7Q6urW());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static Calendar kCA6Zs9sL() {
        return iiGwOFFnr(null);
    }

    public static long q3BipwRCk(long j) {
        Calendar kCA6Zs9sL = kCA6Zs9sL();
        kCA6Zs9sL.setTimeInMillis(j);
        return J4Ux7ym32(kCA6Zs9sL).getTimeInMillis();
    }

    public static TimeZone tGV7Q6urW() {
        return TimeZone.getTimeZone("UTC");
    }
}
