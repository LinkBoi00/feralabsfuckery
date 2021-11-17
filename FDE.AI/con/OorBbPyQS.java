package con;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class OorBbPyQS {
    public final int J4Ux7ym32;
    public final List dIocxURUo;
    public final llWJsfBCK iiGwOFFnr;
    public final HashMap kCA6Zs9sL;
    public final List q3BipwRCk;
    public int tGV7Q6urW;

    public OorBbPyQS(List list, int i) {
        this.q3BipwRCk = list;
        this.J4Ux7ym32 = i;
        int i2 = 0;
        if (i >= 0) {
            this.dIocxURUo = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = list.size();
            if (size > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    o1LB6r8qp o1lb6r8qp = (o1LB6r8qp) this.q3BipwRCk.get(i2);
                    hashMap.put(Integer.valueOf(o1lb6r8qp.tGV7Q6urW), new yIp9YLAV5(i2, i3, o1lb6r8qp.dIocxURUo));
                    i3 += o1lb6r8qp.dIocxURUo;
                    if (i4 >= size) {
                        break;
                    }
                    i2 = i4;
                }
            }
            this.kCA6Zs9sL = hashMap;
            this.iiGwOFFnr = anXlDk6fV.ixWaw2akD(new nwvyEZJPU(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final boolean J4Ux7ym32(int i, int i2) {
        yIp9YLAV5 yip9ylav5 = (yIp9YLAV5) this.kCA6Zs9sL.get(Integer.valueOf(i));
        if (yip9ylav5 == null) {
            return false;
        }
        int i3 = yip9ylav5.J4Ux7ym32;
        int i4 = i2 - yip9ylav5.tGV7Q6urW;
        yip9ylav5.tGV7Q6urW = i2;
        if (i4 == 0) {
            return true;
        }
        for (yIp9YLAV5 yip9ylav52 : this.kCA6Zs9sL.values()) {
            if (yip9ylav52.J4Ux7ym32 >= i3 && !anXlDk6fV.tGV7Q6urW(yip9ylav52, yip9ylav5)) {
                yip9ylav52.J4Ux7ym32 += i4;
            }
        }
        return true;
    }

    public final int q3BipwRCk(o1LB6r8qp o1lb6r8qp) {
        yIp9YLAV5 yip9ylav5 = (yIp9YLAV5) this.kCA6Zs9sL.get(Integer.valueOf(o1lb6r8qp.tGV7Q6urW));
        if (yip9ylav5 == null) {
            return -1;
        }
        return yip9ylav5.J4Ux7ym32;
    }

    public final int tGV7Q6urW(o1LB6r8qp o1lb6r8qp) {
        yIp9YLAV5 yip9ylav5 = (yIp9YLAV5) this.kCA6Zs9sL.get(Integer.valueOf(o1lb6r8qp.tGV7Q6urW));
        if (yip9ylav5 == null) {
            return o1lb6r8qp.dIocxURUo;
        }
        return yip9ylav5.tGV7Q6urW;
    }
}
