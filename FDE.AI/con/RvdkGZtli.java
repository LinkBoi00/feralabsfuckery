package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class RvdkGZtli {
    public int J4Ux7ym32;
    public final List q3BipwRCk = new ArrayList();
    public final int tGV7Q6urW = 1000;
    public int dIocxURUo = 1000;

    public final void J4Ux7ym32(int i) {
        this.J4Ux7ym32 = ((this.J4Ux7ym32 * 1009) + i) % 1000000007;
    }

    public final brVSm9F9Z q3BipwRCk(float f) {
        int i = this.dIocxURUo;
        this.dIocxURUo = i + 1;
        this.q3BipwRCk.add(new xGT7Yc8ED(i, f, 1));
        J4Ux7ym32(8);
        J4Ux7ym32(Float.hashCode(f));
        return new brVSm9F9Z(Integer.valueOf(i), 0);
    }
}
