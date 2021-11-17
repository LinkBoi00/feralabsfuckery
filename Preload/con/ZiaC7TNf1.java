package con;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ZiaC7TNf1 {
    public final gdEmqfwpT J4Ux7ym32;
    public final c80AgRIEf q3BipwRCk;
    public final Map tGV7Q6urW = new LinkedHashMap();
    public AU29aHa4X dIocxURUo = new DtU31vERS(0.0f, 0.0f);
    public long kCA6Zs9sL = dnBSj5uJN.J4Ux7ym32(0, 0, 0, 0, 15);

    public ZiaC7TNf1(c80AgRIEf c80agrief, gdEmqfwpT gdemqfwpt) {
        this.q3BipwRCk = c80agrief;
        this.J4Ux7ym32 = gdemqfwpt;
    }

    public final kkcQgCx5G q3BipwRCk(int i, Object obj) {
        zvdoVJBz0 zvdovjbz0 = (zvdoVJBz0) this.tGV7Q6urW.get(obj);
        if (zvdovjbz0 == null || ((Number) ((prCJwNx2x) zvdovjbz0.J4Ux7ym32).getValue()).intValue() != i) {
            zvdovjbz0 = new zvdoVJBz0(this, i, obj);
            this.tGV7Q6urW.put(obj, zvdovjbz0);
        }
        return zvdovjbz0.tGV7Q6urW;
    }
}
