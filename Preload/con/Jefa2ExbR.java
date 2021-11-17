package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class Jefa2ExbR extends idpM54xlp {
    public static Object[] AqaWJg0b4(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    public static final char NyWTwPF6V(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final List i0Zug1mVk(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        if (length != 1) {
            return new ArrayList(new p5Q4EA2Wh(objArr, false));
        }
        return Collections.singletonList(objArr[0]);
    }

    public static final int mUqPm6GBh(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (anXlDk6fV.tGV7Q6urW(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int[] nlGCs0NZs(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static final List o4LF8RkoQ(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List vNtjxmzUM(float[] fArr, G8ebKyy85 g8ebKyy85) {
        if (g8ebKyy85.isEmpty()) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        int intValue = Integer.valueOf(g8ebKyy85.CBQ5d1kRq).intValue();
        int intValue2 = Integer.valueOf(g8ebKyy85.kmSgne1rO).intValue() + 1;
        idpM54xlp.tGV7Q6urW(intValue2, fArr.length);
        return new rWo8LwadH(Arrays.copyOfRange(fArr, intValue, intValue2));
    }
}
