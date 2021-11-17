package con;
/* loaded from: classes.dex */
public class nOPp9PCGN {
    public final Object[] J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;
    public int tGV7Q6urW;

    public nOPp9PCGN(int i, int i2) {
        this.q3BipwRCk = i2;
        if (i2 != 1) {
            if (i > 0) {
                this.J4Ux7ym32 = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i > 0) {
            this.J4Ux7ym32 = new Object[i];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public boolean J4Ux7ym32(Object obj) {
        for (int i = 0; i < this.tGV7Q6urW; i++) {
            if (this.J4Ux7ym32[i] == obj) {
                return true;
            }
        }
        return false;
    }

    public Object q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                int i = this.tGV7Q6urW;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                Object[] objArr = this.J4Ux7ym32;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.tGV7Q6urW = i2;
                return obj;
            default:
                int i3 = this.tGV7Q6urW;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr2 = this.J4Ux7ym32;
                Object obj2 = objArr2[i4];
                objArr2[i4] = null;
                this.tGV7Q6urW = i4;
                return obj2;
        }
    }

    public boolean tGV7Q6urW(Object obj) {
        switch (this.q3BipwRCk) {
            case 0:
                int i = this.tGV7Q6urW;
                Object[] objArr = this.J4Ux7ym32;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = obj;
                this.tGV7Q6urW = i + 1;
                return true;
            default:
                if (!J4Ux7ym32(obj)) {
                    int i2 = this.tGV7Q6urW;
                    Object[] objArr2 = this.J4Ux7ym32;
                    if (i2 >= objArr2.length) {
                        return false;
                    }
                    objArr2[i2] = obj;
                    this.tGV7Q6urW = i2 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }
}
