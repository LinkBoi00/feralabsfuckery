package con;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class gl0eeduiq {
    public final Set q3BipwRCk;
    public final List J4Ux7ym32 = new ArrayList();
    public final List tGV7Q6urW = new ArrayList();
    public final List dIocxURUo = new ArrayList();

    public gl0eeduiq(Set set) {
        this.q3BipwRCk = set;
    }

    public final void J4Ux7ym32() {
        int i;
        if ((!this.tGV7Q6urW.isEmpty()) && this.tGV7Q6urW.size() - 1 >= 0) {
            while (true) {
                int i2 = i - 1;
                knaaJ6t3r knaaj6t3r = (knaaJ6t3r) this.tGV7Q6urW.get(i);
                if (!this.q3BipwRCk.contains(knaaj6t3r)) {
                    knaaj6t3r.q3BipwRCk();
                }
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        if (!this.J4Ux7ym32.isEmpty()) {
            List list = this.J4Ux7ym32;
            int i3 = 0;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = i3 + 1;
                    knaaJ6t3r knaaj6t3r2 = (knaaJ6t3r) list.get(i3);
                    this.q3BipwRCk.remove(knaaj6t3r2);
                    knaaj6t3r2.J4Ux7ym32();
                    if (i4 <= size) {
                        i3 = i4;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void dIocxURUo(knaaJ6t3r knaaj6t3r) {
        int lastIndexOf = this.tGV7Q6urW.lastIndexOf(knaaj6t3r);
        if (lastIndexOf >= 0) {
            this.tGV7Q6urW.remove(lastIndexOf);
            this.q3BipwRCk.remove(knaaj6t3r);
            return;
        }
        this.J4Ux7ym32.add(knaaj6t3r);
    }

    public final void q3BipwRCk() {
        if (!this.q3BipwRCk.isEmpty()) {
            Iterator it = this.q3BipwRCk.iterator();
            while (it.hasNext()) {
                it.remove();
                ((knaaJ6t3r) it.next()).tGV7Q6urW();
            }
        }
    }

    public void tGV7Q6urW(knaaJ6t3r knaaj6t3r) {
        int lastIndexOf = this.J4Ux7ym32.lastIndexOf(knaaj6t3r);
        if (lastIndexOf >= 0) {
            this.J4Ux7ym32.remove(lastIndexOf);
            this.q3BipwRCk.remove(knaaj6t3r);
            return;
        }
        this.tGV7Q6urW.add(knaaj6t3r);
    }
}
