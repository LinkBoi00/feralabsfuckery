package con;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class gScbsbDFV {
    public static final W39e6bnPN[] q3BipwRCk = new W39e6bnPN[0];

    public static final W39e6bnPN[] J4Ux7ym32(List list) {
        W39e6bnPN[] w39e6bnPNArr = null;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new W39e6bnPN[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            w39e6bnPNArr = (W39e6bnPN[]) array;
        }
        return w39e6bnPNArr == null ? q3BipwRCk : w39e6bnPNArr;
    }

    public static final Set q3BipwRCk(W39e6bnPN w39e6bnPN) {
        if (w39e6bnPN instanceof bq3D8Szxb) {
            return ((bq3D8Szxb) w39e6bnPN).kCA6Zs9sL();
        }
        HashSet hashSet = new HashSet(w39e6bnPN.CBQ5d1kRq());
        int i = 0;
        int CBQ5d1kRq = w39e6bnPN.CBQ5d1kRq();
        if (CBQ5d1kRq > 0) {
            while (true) {
                int i2 = i + 1;
                hashSet.add(w39e6bnPN.q3BipwRCk(i));
                if (i2 >= CBQ5d1kRq) {
                    break;
                }
                i = i2;
            }
        }
        return hashSet;
    }

    public static final WwFGbLVWX tGV7Q6urW(v1smVeB0h v1smveb0h) {
        WwFGbLVWX wwFGbLVWX = v1smveb0h.q3BipwRCk;
        if (wwFGbLVWX instanceof WwFGbLVWX) {
            return wwFGbLVWX;
        }
        throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Only KClass supported as classifier, got ", wwFGbLVWX).toString());
    }
}
