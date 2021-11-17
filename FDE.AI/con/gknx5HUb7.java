package con;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
/* loaded from: classes.dex */
public final class gknx5HUb7 {
    public final Object J4Ux7ym32;
    public Object dIocxURUo;
    public boolean kCA6Zs9sL;
    public final /* synthetic */ int q3BipwRCk;
    public Object tGV7Q6urW;

    public gknx5HUb7() {
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = new Object();
        this.tGV7Q6urW = new ArrayList();
        this.dIocxURUo = new ArrayList();
        this.kCA6Zs9sL = true;
    }

    public Map J4Ux7ym32() {
        return (Map) ((llWJsfBCK) this.J4Ux7ym32).getValue();
    }

    public void dIocxURUo(pLYbCSTk0 plybcstk0) {
        if (plybcstk0.Eeka1udhb()) {
            boolean remove = ((QP0NCzv7O) this.dIocxURUo).remove(plybcstk0);
            if (this.kCA6Zs9sL) {
                Integer num = (Integer) J4Ux7ym32().remove(plybcstk0);
                boolean z = true;
                if (remove) {
                    int i = plybcstk0.Eeka1udhb;
                    if (num == null || num.intValue() != i) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return;
                }
                if (num != null) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void q3BipwRCk(pLYbCSTk0 plybcstk0) {
        if (plybcstk0.Eeka1udhb()) {
            if (this.kCA6Zs9sL) {
                Integer num = (Integer) J4Ux7ym32().get(plybcstk0);
                if (num == null) {
                    J4Ux7ym32().put(plybcstk0, Integer.valueOf(plybcstk0.Eeka1udhb));
                } else {
                    if (!(num.intValue() == plybcstk0.Eeka1udhb)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            ((QP0NCzv7O) this.dIocxURUo).add(plybcstk0);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean tGV7Q6urW() {
        return ((QP0NCzv7O) this.dIocxURUo).isEmpty();
    }

    public String toString() {
        switch (this.q3BipwRCk) {
            case 1:
                return ((QP0NCzv7O) this.dIocxURUo).toString();
            default:
                return super.toString();
        }
    }

    public gknx5HUb7(boolean z) {
        this.q3BipwRCk = 1;
        this.kCA6Zs9sL = z;
        this.J4Ux7ym32 = anXlDk6fV.RG6kpfv3v(3, juufjqtjC.ixWaw2akD);
        this.tGV7Q6urW = new SBwiBzDMY(0);
        this.dIocxURUo = new QP0NCzv7O((Comparator) this.tGV7Q6urW);
    }
}
