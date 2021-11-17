package con;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class k8d73inuH {
    public static final ExecutorService J4Ux7ym32;
    public static final sRvcTfY85 q3BipwRCk = new sRvcTfY85(16);
    public static final Object tGV7Q6urW = new Object();
    public static final ZmYjNS8wW dIocxURUo = new ZmYjNS8wW();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new D6h9d6aft("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        J4Ux7ym32 = threadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static OLEAwlv46 J4Ux7ym32(String str, Context context, SfQ6fqrlg sfQ6fqrlg, int i) {
        int i2;
        Typeface typeface = (Typeface) q3BipwRCk.q3BipwRCk(str);
        if (typeface != null) {
            return new OLEAwlv46(typeface);
        }
        try {
            ffMwHtM6b q3BipwRCk2 = hJ5US7JPM.q3BipwRCk(context, sfQ6fqrlg, null);
            int i3 = q3BipwRCk2.q3BipwRCk;
            int i4 = 1;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                    if (i2 != 0) {
                        return new OLEAwlv46(i2);
                    }
                    Typeface J4Ux7ym322 = ieVIpzqcX.q3BipwRCk.J4Ux7ym32(context, null, q3BipwRCk2.J4Ux7ym32, i);
                    if (J4Ux7ym322 == null) {
                        return new OLEAwlv46(-3);
                    }
                    q3BipwRCk.J4Ux7ym32(str, J4Ux7ym322);
                    return new OLEAwlv46(J4Ux7ym322);
                }
                i2 = -3;
                if (i2 != 0) {
                }
            } else {
                k9x1izWJn[] k9x1izwjnArr = q3BipwRCk2.J4Ux7ym32;
                if (!(k9x1izwjnArr == null || k9x1izwjnArr.length == 0)) {
                    for (k9x1izWJn k9x1izwjn : k9x1izwjnArr) {
                        int i5 = k9x1izwjn.kCA6Zs9sL;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                                if (i2 != 0) {
                                }
                            }
                            i2 = -3;
                            if (i2 != 0) {
                            }
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
                if (i2 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new OLEAwlv46(-1);
        }
    }

    public static String q3BipwRCk(SfQ6fqrlg sfQ6fqrlg, int i) {
        return ((String) sfQ6fqrlg.GPLPRo6go) + "-" + i;
    }
}
