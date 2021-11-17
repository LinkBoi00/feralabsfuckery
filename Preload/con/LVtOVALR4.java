package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class LVtOVALR4 {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap q3BipwRCk = new ConcurrentHashMap();

    public static Object dIocxURUo(Object[] objArr, int i, KjpvfPHdv kjpvfPHdv) {
        int i2;
        boolean z;
        int i3 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            rPR8g1Ebn rpr8g1ebn = (rPR8g1Ebn) kjpvfPHdv;
            switch (rpr8g1ebn.q3BipwRCk) {
                case 0:
                    i2 = ((k9x1izWJn) obj2).tGV7Q6urW;
                    break;
                default:
                    i2 = ((U90DuDsYT) obj2).J4Ux7ym32;
                    break;
            }
            int abs = Math.abs(i2 - i3) * 2;
            switch (rpr8g1ebn.q3BipwRCk) {
                case 0:
                    z = ((k9x1izWJn) obj2).dIocxURUo;
                    break;
                default:
                    z = ((U90DuDsYT) obj2).tGV7Q6urW;
                    break;
            }
            int i5 = abs + (z == z2 ? 0 : 1);
            if (obj == null || i4 > i5) {
                obj = obj2;
                i4 = i5;
            }
        }
        return obj;
    }

    public abstract Typeface J4Ux7ym32(Context context, CancellationSignal cancellationSignal, k9x1izWJn[] k9x1izwjnArr, int i);

    public abstract Typeface q3BipwRCk(Context context, fyPKNAQNN fypknaqnn, Resources resources, int i);

    public Typeface tGV7Q6urW(Context context, Resources resources, int i, String str, int i2) {
        File i8XZMQc6Z = BBVaGLNaU.i8XZMQc6Z(context);
        if (i8XZMQc6Z == null) {
            return null;
        }
        try {
            if (!BBVaGLNaU.Puu3Rhg4F(i8XZMQc6Z, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(i8XZMQc6Z.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            i8XZMQc6Z.delete();
        }
    }
}
