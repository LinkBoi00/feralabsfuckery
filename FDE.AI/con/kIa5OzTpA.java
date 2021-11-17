package con;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class kIa5OzTpA {
    public static final Class[] q3BipwRCk = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean q3BipwRCk(Object obj) {
        if (obj instanceof RNEcgN6dQ) {
            prCJwNx2x prcjwnx2x = (prCJwNx2x) ((RNEcgN6dQ) obj);
            jdeJZ7JPq jdejz7jpq = prcjwnx2x.CBQ5d1kRq;
            if (jdejz7jpq != VpkLDqhd7.q3BipwRCk && jdejz7jpq != PSAOlugDJ.q3BipwRCk && jdejz7jpq != AE51MWSQF.q3BipwRCk) {
                return false;
            }
            Object value = prcjwnx2x.getValue();
            if (value == null) {
                return true;
            }
            return q3BipwRCk(value);
        }
        Class[] clsArr = q3BipwRCk;
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls = clsArr[i];
            i++;
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
