package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class SXpWpmH9A {
    public static final joIJ4ANvK q3BipwRCk = new joIJ4ANvK("", (List) null, (List) null, 6);

    public static final boolean J4Ux7ym32(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 != i4) {
                return true;
            }
            if ((i3 == i4) == (i == i2)) {
                return true;
            }
        }
        return false;
    }

    public static final List q3BipwRCk(List list, int i, int i2) {
        int i3 = 0;
        if (i <= i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size() - 1;
            if (size >= 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    Object obj = list.get(i4);
                    lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) obj;
                    if (tGV7Q6urW(i, i2, lzuuvzcu0.J4Ux7ym32, lzuuvzcu0.tGV7Q6urW)) {
                        arrayList.add(obj);
                    }
                    if (i5 > size) {
                        break;
                    }
                    i4 = i5;
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i6 = i3 + 1;
                    lzuuVzcu0 lzuuvzcu02 = (lzuuVzcu0) arrayList.get(i3);
                    arrayList2.add(new lzuuVzcu0(lzuuvzcu02.q3BipwRCk, Math.max(i, lzuuvzcu02.J4Ux7ym32) - i, Math.min(i2, lzuuvzcu02.tGV7Q6urW) - i, lzuuvzcu02.dIocxURUo));
                    if (i6 > size2) {
                        break;
                    }
                    i3 = i6;
                }
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    public static final boolean tGV7Q6urW(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || J4Ux7ym32(i, i2, i3, i4) || J4Ux7ym32(i3, i4, i, i2);
    }
}
