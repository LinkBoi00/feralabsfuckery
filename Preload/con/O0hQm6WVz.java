package con;
/* loaded from: classes.dex */
public final class O0hQm6WVz implements B82vleiqp {
    public final float J4Ux7ym32;
    public final float q3BipwRCk;
    public final Object tGV7Q6urW;

    public O0hQm6WVz(float f, float f2, Object obj) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = obj;
    }

    public /* synthetic */ O0hQm6WVz(float f, float f2, Object obj, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof O0hQm6WVz) {
            O0hQm6WVz o0hQm6WVz = (O0hQm6WVz) obj;
            if (o0hQm6WVz.q3BipwRCk == this.q3BipwRCk) {
                if ((o0hQm6WVz.J4Ux7ym32 == this.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(o0hQm6WVz.tGV7Q6urW, this.tGV7Q6urW)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.tGV7Q6urW;
        return Float.hashCode(this.J4Ux7ym32) + gXNsYvZus.q3BipwRCk(this.q3BipwRCk, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    @Override // con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public bfRmVSaJr mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        jOCYbBWA4 jocybbwa4;
        float f = this.q3BipwRCk;
        float f2 = this.J4Ux7ym32;
        Object obj = this.tGV7Q6urW;
        if (obj == null) {
            jocybbwa4 = null;
        } else {
            jocybbwa4 = (jOCYbBWA4) avkpyniny.q3BipwRCk.IytU16YUK(obj);
        }
        return new Ba5PSlnSk(f, f2, jocybbwa4);
    }
}
