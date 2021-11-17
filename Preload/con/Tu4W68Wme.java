package con;

import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class Tu4W68Wme {
    public static final Integer kCA6Zs9sL = 0;
    public final HAVKqwFVy dIocxURUo;
    public HashMap q3BipwRCk = new HashMap();
    public HashMap J4Ux7ym32 = new HashMap();
    public HashMap tGV7Q6urW = new HashMap();

    public Tu4W68Wme() {
        HAVKqwFVy hAVKqwFVy = new HAVKqwFVy(this);
        this.dIocxURUo = hAVKqwFVy;
        this.q3BipwRCk.put(kCA6Zs9sL, hAVKqwFVy);
    }

    public abstract int J4Ux7ym32(Object obj);

    public HAVKqwFVy q3BipwRCk(Object obj) {
        stVpOZKoA stvpozkoa = (stVpOZKoA) this.q3BipwRCk.get(obj);
        HAVKqwFVy hAVKqwFVy = stvpozkoa;
        if (stvpozkoa == null) {
            HAVKqwFVy hAVKqwFVy2 = new HAVKqwFVy(this);
            this.q3BipwRCk.put(obj, hAVKqwFVy2);
            hAVKqwFVy2.q3BipwRCk = obj;
            hAVKqwFVy = hAVKqwFVy2;
        }
        if (hAVKqwFVy instanceof HAVKqwFVy) {
            return (HAVKqwFVy) hAVKqwFVy;
        }
        return null;
    }

    public auO4JQva1 tGV7Q6urW(Object obj, int i) {
        HAVKqwFVy q3BipwRCk = q3BipwRCk(obj);
        MV2w6qPoc mV2w6qPoc = q3BipwRCk.tGV7Q6urW;
        if (mV2w6qPoc == null || !(mV2w6qPoc instanceof auO4JQva1)) {
            auO4JQva1 auo4jqva1 = new auO4JQva1(this);
            auo4jqva1.q3BipwRCk = i;
            auo4jqva1.iiGwOFFnr = obj;
            q3BipwRCk.tGV7Q6urW = auo4jqva1;
            q3BipwRCk.q3BipwRCk(auo4jqva1.dIocxURUo());
        }
        return (auO4JQva1) q3BipwRCk.tGV7Q6urW;
    }
}
