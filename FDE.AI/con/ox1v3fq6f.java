package con;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ox1v3fq6f implements x1XJraxts {
    public final JYTRn9Ica J4Ux7ym32;
    public final Map dIocxURUo;
    public final R7CNZOOL2 q3BipwRCk;
    public final List tGV7Q6urW;

    public ox1v3fq6f(R7CNZOOL2 r7cnzool2, JYTRn9Ica jYTRn9Ica, List list, G8ebKyy85 g8ebKyy85) {
        Map map;
        this.q3BipwRCk = r7cnzool2;
        this.J4Ux7ym32 = jYTRn9Ica;
        this.tGV7Q6urW = list;
        int i = g8ebKyy85.CBQ5d1kRq;
        if (i >= 0) {
            int min = Math.min(g8ebKyy85.kmSgne1rO, jYTRn9Ica.tGV7Q6urW - 1);
            if (min < i) {
                map = dmnvfTTyg.CBQ5d1kRq;
            } else {
                HashMap hashMap = new HashMap();
                int J4Ux7ym32 = txLC9Bpvz.J4Ux7ym32(jYTRn9Ica, i);
                while (i <= min) {
                    Lw10f0Sd9 lw10f0Sd9 = (Lw10f0Sd9) jYTRn9Ica.J4Ux7ym32.get(J4Ux7ym32);
                    PmanMZxiM pmanMZxiM = ((c9qe77qQ0) lw10f0Sd9.tGV7Q6urW).q3BipwRCk;
                    if (pmanMZxiM != null) {
                        int i2 = i - lw10f0Sd9.q3BipwRCk;
                        if (i2 == lw10f0Sd9.J4Ux7ym32) {
                            J4Ux7ym32++;
                        } else {
                            hashMap.put(pmanMZxiM.IytU16YUK(Integer.valueOf(i2)), Integer.valueOf(i));
                            i++;
                        }
                    } else {
                        J4Ux7ym32++;
                        i = lw10f0Sd9.q3BipwRCk + lw10f0Sd9.J4Ux7ym32;
                    }
                }
                map = hashMap;
            }
            this.dIocxURUo = map;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // con.x1XJraxts
    public Map J4Ux7ym32() {
        return this.dIocxURUo;
    }

    @Override // con.x1XJraxts
    public int dIocxURUo() {
        return this.J4Ux7ym32.tGV7Q6urW;
    }

    @Override // con.x1XJraxts
    public Object q3BipwRCk(int i) {
        Object obj;
        JYTRn9Ica jYTRn9Ica = this.J4Ux7ym32;
        Lw10f0Sd9 lw10f0Sd9 = (Lw10f0Sd9) jYTRn9Ica.J4Ux7ym32.get(txLC9Bpvz.J4Ux7ym32(jYTRn9Ica, i));
        int i2 = i - lw10f0Sd9.q3BipwRCk;
        PmanMZxiM pmanMZxiM = ((c9qe77qQ0) lw10f0Sd9.tGV7Q6urW).q3BipwRCk;
        if (pmanMZxiM == null) {
            obj = null;
        } else {
            obj = pmanMZxiM.IytU16YUK(Integer.valueOf(i2));
        }
        return obj == null ? new ifzHtOtm3(i) : obj;
    }

    @Override // con.x1XJraxts
    public kkcQgCx5G tGV7Q6urW(int i) {
        JYTRn9Ica jYTRn9Ica = this.J4Ux7ym32;
        Lw10f0Sd9 lw10f0Sd9 = (Lw10f0Sd9) jYTRn9Ica.J4Ux7ym32.get(txLC9Bpvz.J4Ux7ym32(jYTRn9Ica, i));
        return (kkcQgCx5G) ((c9qe77qQ0) lw10f0Sd9.tGV7Q6urW).J4Ux7ym32.WaUP0CF08(this.q3BipwRCk.q3BipwRCk, Integer.valueOf(i - lw10f0Sd9.q3BipwRCk));
    }
}
