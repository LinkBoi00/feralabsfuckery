package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import con.K6PL0z3I0;
import con.SQ4Lz5bqj;
import con.UBpyZCltz;
import con.eEPBBadYl;
import con.hAHDFOdMb;
import con.uRyiqsiNk;
import con.ullZnRGKg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class RG2GI7LDp {
    public Random q3BipwRCk = new Random();
    public final Map J4Ux7ym32 = new HashMap();
    public final Map tGV7Q6urW = new HashMap();
    public final Map dIocxURUo = new HashMap();
    public ArrayList kCA6Zs9sL = new ArrayList();
    public final transient Map iiGwOFFnr = new HashMap();
    public final Map GPLPRo6go = new HashMap();
    public final Bundle Puu3Rhg4F = new Bundle();

    /* renamed from: androidx.activity.result.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public static class C0000RG2GI7LDp {
        public final SQ4Lz5bqj J4Ux7ym32;
        public final hAHDFOdMb q3BipwRCk;

        public C0000RG2GI7LDp(hAHDFOdMb hahdfodmb, SQ4Lz5bqj sQ4Lz5bqj) {
            this.q3BipwRCk = hahdfodmb;
            this.J4Ux7ym32 = sQ4Lz5bqj;
        }
    }

    public final UBpyZCltz J4Ux7ym32(String str, SQ4Lz5bqj sQ4Lz5bqj, hAHDFOdMb hahdfodmb) {
        int i;
        if (((Integer) this.tGV7Q6urW.get(str)) == null) {
            int nextInt = this.q3BipwRCk.nextInt(2147418112);
            while (true) {
                i = nextInt + 65536;
                if (!this.J4Ux7ym32.containsKey(Integer.valueOf(i))) {
                    break;
                }
                nextInt = this.q3BipwRCk.nextInt(2147418112);
            }
            this.J4Ux7ym32.put(Integer.valueOf(i), str);
            this.tGV7Q6urW.put(str, Integer.valueOf(i));
        }
        this.iiGwOFFnr.put(str, new C0000RG2GI7LDp(hahdfodmb, sQ4Lz5bqj));
        if (this.GPLPRo6go.containsKey(str)) {
            Object obj = this.GPLPRo6go.get(str);
            this.GPLPRo6go.remove(str);
            ((uRyiqsiNk) hahdfodmb).J4Ux7ym32(obj);
        }
        ullZnRGKg ullznrgkg = (ullZnRGKg) this.Puu3Rhg4F.getParcelable(str);
        if (ullznrgkg != null) {
            this.Puu3Rhg4F.remove(str);
            ((uRyiqsiNk) hahdfodmb).J4Ux7ym32(sQ4Lz5bqj.tGV7Q6urW(ullznrgkg.CBQ5d1kRq, ullznrgkg.kmSgne1rO));
        }
        return new UBpyZCltz(this, str, sQ4Lz5bqj);
    }

    public final boolean q3BipwRCk(int i, int i2, Intent intent) {
        String str = (String) this.J4Ux7ym32.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0000RG2GI7LDp rG2GI7LDp = (C0000RG2GI7LDp) this.iiGwOFFnr.get(str);
        if (rG2GI7LDp == null || rG2GI7LDp.q3BipwRCk == null || !this.kCA6Zs9sL.contains(str)) {
            this.GPLPRo6go.remove(str);
            this.Puu3Rhg4F.putParcelable(str, new ullZnRGKg(i2, intent));
            return true;
        }
        ((uRyiqsiNk) rG2GI7LDp.q3BipwRCk).J4Ux7ym32(rG2GI7LDp.J4Ux7ym32.tGV7Q6urW(i2, intent));
        this.kCA6Zs9sL.remove(str);
        return true;
    }

    public final void tGV7Q6urW(String str) {
        Integer num;
        if (!this.kCA6Zs9sL.contains(str) && (num = (Integer) this.tGV7Q6urW.remove(str)) != null) {
            this.J4Ux7ym32.remove(num);
        }
        this.iiGwOFFnr.remove(str);
        if (this.GPLPRo6go.containsKey(str)) {
            StringBuilder q3BipwRCk = eEPBBadYl.q3BipwRCk("Dropping pending result for request ", str, ": ");
            q3BipwRCk.append(this.GPLPRo6go.get(str));
            Log.w("ActivityResultRegistry", q3BipwRCk.toString());
            this.GPLPRo6go.remove(str);
        }
        if (this.Puu3Rhg4F.containsKey(str)) {
            StringBuilder q3BipwRCk2 = eEPBBadYl.q3BipwRCk("Dropping pending result for request ", str, ": ");
            q3BipwRCk2.append(this.Puu3Rhg4F.getParcelable(str));
            Log.w("ActivityResultRegistry", q3BipwRCk2.toString());
            this.Puu3Rhg4F.remove(str);
        }
        K6PL0z3I0.q3BipwRCk(this.dIocxURUo.get(str));
    }
}
