package con;

import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class rWo8LwadH extends kVmRinNH6 implements RandomAccess {
    public final /* synthetic */ float[] CBQ5d1kRq;

    public rWo8LwadH(float[] fArr) {
        this.CBQ5d1kRq = fArr;
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.CBQ5d1kRq.length;
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        float floatValue = ((Number) obj).floatValue();
        for (float f : this.CBQ5d1kRq) {
            if (Float.floatToIntBits(f) == Float.floatToIntBits(floatValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // con.kVmRinNH6, java.util.List
    public Object get(int i) {
        return Float.valueOf(this.CBQ5d1kRq[i]);
    }

    @Override // con.kVmRinNH6, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.CBQ5d1kRq;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(floatValue)) {
                return i;
            }
        }
        return -1;
    }

    @Override // con.Og6dYSoy7, java.util.Collection
    public boolean isEmpty() {
        return this.CBQ5d1kRq.length == 0;
    }

    @Override // con.kVmRinNH6, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.CBQ5d1kRq;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(floatValue)) {
                return length;
            }
        }
        return -1;
    }
}
