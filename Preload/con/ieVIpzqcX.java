package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public abstract class ieVIpzqcX {
    public static final sRvcTfY85 J4Ux7ym32;
    public static final LVtOVALR4 q3BipwRCk;

    static {
        int i = Build.VERSION.SDK_INT;
        q3BipwRCk = i >= 29 ? new QhIpuFtVf() : i >= 28 ? new LVuWXK3V0() : new dV9j1WF3U();
        J4Ux7ym32 = new sRvcTfY85(16);
    }

    public static Typeface J4Ux7ym32(Context context, Resources resources, int i, String str, int i2) {
        Typeface tGV7Q6urW = q3BipwRCk.tGV7Q6urW(context, resources, i, str, i2);
        if (tGV7Q6urW != null) {
            J4Ux7ym32.J4Ux7ym32(tGV7Q6urW(resources, i, i2), tGV7Q6urW);
        }
        return tGV7Q6urW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r4.equals(r6) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static Typeface q3BipwRCk(Context context, GezE1KLaf gezE1KLaf, Resources resources, int i, int i2, DfseMYa7G dfseMYa7G, Handler handler, boolean z) {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        if (gezE1KLaf instanceof p2QtUSFos) {
            p2QtUSFos p2qtusfos = (p2QtUSFos) gezE1KLaf;
            String str = p2qtusfos.dIocxURUo;
            typeface = null;
            boolean z2 = false;
            if (str != null && !str.isEmpty()) {
                typeface2 = Typeface.create(str, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface2 != null) {
                }
            }
            typeface2 = null;
            if (typeface2 != null) {
                if (dfseMYa7G != null) {
                    dfseMYa7G.J4Ux7ym32(typeface2, handler);
                }
                return typeface2;
            }
            if (!z ? dfseMYa7G == null : p2qtusfos.tGV7Q6urW == 0) {
                z2 = true;
            }
            int i3 = z ? p2qtusfos.J4Ux7ym32 : -1;
            Handler tGV7Q6urW = DfseMYa7G.tGV7Q6urW(handler);
            rPR8g1Ebn rpr8g1ebn = new rPR8g1Ebn(dfseMYa7G);
            SfQ6fqrlg sfQ6fqrlg = p2qtusfos.q3BipwRCk;
            PlegqbMSA plegqbMSA = new PlegqbMSA(rpr8g1ebn, tGV7Q6urW);
            if (z2) {
                String q3BipwRCk2 = k8d73inuH.q3BipwRCk(sfQ6fqrlg, i2);
                typeface3 = (Typeface) k8d73inuH.q3BipwRCk.q3BipwRCk(q3BipwRCk2);
                if (typeface3 != null) {
                    plegqbMSA.oon79WMrY(typeface3);
                } else if (i3 == -1) {
                    OLEAwlv46 J4Ux7ym322 = k8d73inuH.J4Ux7ym32(q3BipwRCk2, context, sfQ6fqrlg, i2);
                    plegqbMSA.yWvV4ePLl(J4Ux7ym322);
                    typeface = J4Ux7ym322.q3BipwRCk;
                } else {
                    try {
                        try {
                            try {
                                OLEAwlv46 oLEAwlv46 = (OLEAwlv46) k8d73inuH.J4Ux7ym32.submit(new C2MQpNnI4(q3BipwRCk2, context, sfQ6fqrlg, i2, 0)).get((long) i3, TimeUnit.MILLISECONDS);
                                plegqbMSA.yWvV4ePLl(oLEAwlv46);
                                typeface = oLEAwlv46.q3BipwRCk;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        plegqbMSA.Puu3Rhg4F(-3);
                    }
                }
            } else {
                String q3BipwRCk3 = k8d73inuH.q3BipwRCk(sfQ6fqrlg, i2);
                typeface3 = (Typeface) k8d73inuH.q3BipwRCk.q3BipwRCk(q3BipwRCk3);
                if (typeface3 != null) {
                    plegqbMSA.oon79WMrY(typeface3);
                } else {
                    hSSq1qu2s hssq1qu2s = new hSSq1qu2s(plegqbMSA);
                    synchronized (k8d73inuH.tGV7Q6urW) {
                        ZmYjNS8wW zmYjNS8wW = k8d73inuH.dIocxURUo;
                        ArrayList arrayList = (ArrayList) zmYjNS8wW.getOrDefault(q3BipwRCk3, null);
                        if (arrayList != null) {
                            arrayList.add(hssq1qu2s);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(hssq1qu2s);
                            zmYjNS8wW.put(q3BipwRCk3, arrayList2);
                            ((ThreadPoolExecutor) k8d73inuH.J4Ux7ym32).execute(new UcCYfgGXO(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new C2MQpNnI4(q3BipwRCk3, context, sfQ6fqrlg, i2, 1), new hSSq1qu2s(q3BipwRCk3)));
                        }
                    }
                }
            }
            typeface = typeface3;
        } else {
            typeface = q3BipwRCk.q3BipwRCk(context, (fyPKNAQNN) gezE1KLaf, resources, i2);
            if (dfseMYa7G != null) {
                if (typeface != null) {
                    dfseMYa7G.J4Ux7ym32(typeface, handler);
                } else {
                    dfseMYa7G.q3BipwRCk(-3, handler);
                }
            }
        }
        if (typeface != null) {
            J4Ux7ym32.J4Ux7ym32(tGV7Q6urW(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static String tGV7Q6urW(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
