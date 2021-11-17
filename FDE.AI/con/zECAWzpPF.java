package con;
/* loaded from: classes.dex */
public final class zECAWzpPF implements e61xwX1kt {
    public final float J4Ux7ym32;
    public final BE0Hz4svm dIocxURUo;
    public final float q3BipwRCk;
    public final float tGV7Q6urW;

    public zECAWzpPF(float f, float f2, float f3) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f3;
        BE0Hz4svm bE0Hz4svm = new BE0Hz4svm(1.0f);
        if (f >= 0.0f) {
            bE0Hz4svm.GPLPRo6go = f;
            bE0Hz4svm.tGV7Q6urW = false;
            double d = bE0Hz4svm.J4Ux7ym32;
            if (((float) (d * d)) > 0.0f) {
                bE0Hz4svm.J4Ux7ym32 = Math.sqrt((double) f2);
                bE0Hz4svm.tGV7Q6urW = false;
                this.dIocxURUo = bE0Hz4svm;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    @Override // con.e61xwX1kt
    public float J4Ux7ym32(long j, float f, float f2, float f3) {
        BE0Hz4svm bE0Hz4svm = this.dIocxURUo;
        bE0Hz4svm.q3BipwRCk = f2;
        return Float.intBitsToFloat((int) (bE0Hz4svm.q3BipwRCk(f, f3, j / 1000000) >> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0271, code lost:
        if (r20 > 0.0d) goto L_0x0280;
     */
    @Override // con.e61xwX1kt
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long dIocxURUo(float r35, float r36, float r37) {
        /*
        // Method dump skipped, instructions count: 757
        */
        throw new UnsupportedOperationException("Method not decompiled: con.zECAWzpPF.dIocxURUo(float, float, float):long");
    }

    @Override // con.e61xwX1kt
    public float kCA6Zs9sL(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // con.SmsTS63dj
    /* renamed from: q3BipwRCk */
    public bfRmVSaJr mo1q3BipwRCk(aVKpYNINy avkpyniny) {
        return new unvqWbaGj(this);
    }

    @Override // con.e61xwX1kt
    public float tGV7Q6urW(long j, float f, float f2, float f3) {
        BE0Hz4svm bE0Hz4svm = this.dIocxURUo;
        bE0Hz4svm.q3BipwRCk = f2;
        return Float.intBitsToFloat((int) (bE0Hz4svm.q3BipwRCk(f, f3, j / 1000000) & 4294967295L));
    }
}
