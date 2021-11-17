package con;
/* loaded from: classes.dex */
public final class yj0abztt3 {
    public final Object J4Ux7ym32;
    public final /* synthetic */ CSCtv8Wiy dIocxURUo;
    public final /* synthetic */ int q3BipwRCk;
    public final int tGV7Q6urW;

    public yj0abztt3(CSCtv8Wiy cSCtv8Wiy, Object obj, int i, int i2) {
        this.q3BipwRCk = i2;
        if (i2 != 1) {
            this.dIocxURUo = cSCtv8Wiy;
            this.J4Ux7ym32 = obj;
            this.tGV7Q6urW = i;
            return;
        }
        this.dIocxURUo = cSCtv8Wiy;
        this.J4Ux7ym32 = obj;
        this.tGV7Q6urW = i;
    }

    public static void dIocxURUo(yj0abztt3 yj0abztt3, VZDBz9ON3 vZDBz9ON3, float f, int i) {
        if ((i & 2) != 0) {
            f = (float) 0;
        }
        yj0abztt3.dIocxURUo.J4Ux7ym32.add(new IXwqy33GU(yj0abztt3, vZDBz9ON3, f));
    }

    public static void tGV7Q6urW(yj0abztt3 yj0abztt3, brVSm9F9Z brvsm9f9z, float f, int i) {
        if ((i & 2) != 0) {
            f = (float) 0;
        }
        CSCtv8Wiy cSCtv8Wiy = yj0abztt3.dIocxURUo;
        cSCtv8Wiy.J4Ux7ym32.add(new K9d5WfFhw(cSCtv8Wiy, yj0abztt3, brvsm9f9z, f));
    }

    public void J4Ux7ym32(VZDBz9ON3 vZDBz9ON3, float f) {
        this.dIocxURUo.J4Ux7ym32.add(new IXwqy33GU(this, vZDBz9ON3, f));
    }

    public void q3BipwRCk(brVSm9F9Z brvsm9f9z, float f) {
        CSCtv8Wiy cSCtv8Wiy = this.dIocxURUo;
        cSCtv8Wiy.J4Ux7ym32.add(new K9d5WfFhw(cSCtv8Wiy, this, brvsm9f9z, f));
    }
}
