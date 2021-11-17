package con;
/* loaded from: classes.dex */
public final class mYnW3ngzJ implements eSSARtQU6 {
    public final jOCYbBWA4 GPLPRo6go;
    public final aVKpYNINy J4Ux7ym32;
    public final long Puu3Rhg4F;
    public final Object dIocxURUo;
    public final jOCYbBWA4 iiGwOFFnr;
    public final jOCYbBWA4 kCA6Zs9sL;
    public final bfRmVSaJr q3BipwRCk;
    public final Object tGV7Q6urW;
    public final jOCYbBWA4 yWvV4ePLl;

    public mYnW3ngzJ(SmsTS63dj smsTS63dj, aVKpYNINy avkpyniny, Object obj, Object obj2, jOCYbBWA4 jocybbwa4) {
        bfRmVSaJr q3BipwRCk = smsTS63dj.mo1q3BipwRCk(avkpyniny);
        this.q3BipwRCk = q3BipwRCk;
        this.J4Ux7ym32 = avkpyniny;
        this.tGV7Q6urW = obj;
        this.dIocxURUo = obj2;
        jOCYbBWA4 jocybbwa42 = (jOCYbBWA4) avkpyniny.q3BipwRCk.IytU16YUK(obj);
        this.kCA6Zs9sL = jocybbwa42;
        jOCYbBWA4 jocybbwa43 = (jOCYbBWA4) avkpyniny.q3BipwRCk.IytU16YUK(obj2);
        this.iiGwOFFnr = jocybbwa43;
        jOCYbBWA4 iiGwOFFnr = jocybbwa4 == null ? null : syekKyXqd.iiGwOFFnr(jocybbwa4);
        iiGwOFFnr = iiGwOFFnr == null ? ((jOCYbBWA4) avkpyniny.q3BipwRCk.IytU16YUK(obj)).tGV7Q6urW() : iiGwOFFnr;
        this.GPLPRo6go = iiGwOFFnr;
        this.Puu3Rhg4F = q3BipwRCk.GPLPRo6go(jocybbwa42, jocybbwa43, iiGwOFFnr);
        this.yWvV4ePLl = q3BipwRCk.dIocxURUo(jocybbwa42, jocybbwa43, iiGwOFFnr);
    }

    public /* synthetic */ mYnW3ngzJ(SmsTS63dj smsTS63dj, aVKpYNINy avkpyniny, Object obj, Object obj2, jOCYbBWA4 jocybbwa4, int i) {
        this(smsTS63dj, avkpyniny, obj, obj2, null);
    }

    @Override // con.eSSARtQU6
    public jOCYbBWA4 GPLPRo6go(long j) {
        return !iiGwOFFnr(j) ? this.q3BipwRCk.J4Ux7ym32(j, this.kCA6Zs9sL, this.iiGwOFFnr, this.GPLPRo6go) : this.yWvV4ePLl;
    }

    @Override // con.eSSARtQU6
    public Object J4Ux7ym32(long j) {
        if (!iiGwOFFnr(j)) {
            return this.J4Ux7ym32.J4Ux7ym32.IytU16YUK(this.q3BipwRCk.kCA6Zs9sL(j, this.kCA6Zs9sL, this.iiGwOFFnr, this.GPLPRo6go));
        }
        return this.dIocxURUo;
    }

    @Override // con.eSSARtQU6
    public aVKpYNINy dIocxURUo() {
        return this.J4Ux7ym32;
    }

    @Override // con.eSSARtQU6
    public boolean iiGwOFFnr(long j) {
        return j >= this.Puu3Rhg4F;
    }

    @Override // con.eSSARtQU6
    public Object kCA6Zs9sL() {
        return this.dIocxURUo;
    }

    @Override // con.eSSARtQU6
    public boolean q3BipwRCk() {
        return this.q3BipwRCk.q3BipwRCk();
    }

    @Override // con.eSSARtQU6
    public long tGV7Q6urW() {
        return this.Puu3Rhg4F;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TargetBasedAnimation: ");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(" -> ");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(",initial velocity: ");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(", duration: ");
        q3BipwRCk.append(tGV7Q6urW() / 1000000);
        q3BipwRCk.append(" ms");
        return q3BipwRCk.toString();
    }
}
