package con;

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
    public static con.OLEAwlv46 J4Ux7ym32(java.lang.String r7, android.content.Context r8, con.SfQ6fqrlg r9, int r10) {
        /*
            con.sRvcTfY85 r0 = con.k8d73inuH.q3BipwRCk
            java.lang.Object r0 = r0.q3BipwRCk(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            con.OLEAwlv46 r7 = new con.OLEAwlv46
            r7.<init>(r0)
            return r7
        L_0x0010:
            r0 = 0
            con.ffMwHtM6b r9 = con.hJ5US7JPM.q3BipwRCk(r8, r9, r0)     // Catch: NameNotFoundException -> 0x0061
            int r1 = r9.q3BipwRCk
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            con.k9x1izWJn[] r1 = r9.J4Ux7ym32
            if (r1 == 0) goto L_0x003d
            int r4 = r1.length
            if (r4 != 0) goto L_0x0028
            goto L_0x003d
        L_0x0028:
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x002b:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.kCA6Zs9sL
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = r2
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r3 = r4
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            con.OLEAwlv46 r7 = new con.OLEAwlv46
            r7.<init>(r1)
            return r7
        L_0x0046:
            con.k9x1izWJn[] r9 = r9.J4Ux7ym32
            con.LVtOVALR4 r1 = con.ieVIpzqcX.q3BipwRCk
            android.graphics.Typeface r8 = r1.J4Ux7ym32(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            con.sRvcTfY85 r9 = con.k8d73inuH.q3BipwRCk
            r9.J4Ux7ym32(r7, r8)
            con.OLEAwlv46 r7 = new con.OLEAwlv46
            r7.<init>(r8)
            return r7
        L_0x005b:
            con.OLEAwlv46 r7 = new con.OLEAwlv46
            r7.<init>(r2)
            return r7
        L_0x0061:
            con.OLEAwlv46 r7 = new con.OLEAwlv46
            r8 = -1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: con.k8d73inuH.J4Ux7ym32(java.lang.String, android.content.Context, con.SfQ6fqrlg, int):con.OLEAwlv46");
    }

    public static String q3BipwRCk(SfQ6fqrlg sfQ6fqrlg, int i) {
        return ((String) sfQ6fqrlg.GPLPRo6go) + "-" + i;
    }
}
