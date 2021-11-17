package con;
/* loaded from: classes.dex */
public final class pdaxWs7es implements zqBgm5sds {
    public final float q3BipwRCk;

    public pdaxWs7es(float f, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdaxWs7es) && lRwPpHNL9.q3BipwRCk(this.q3BipwRCk, ((pdaxWs7es) obj).q3BipwRCk);
    }

    public int hashCode() {
        return Float.hashCode(this.q3BipwRCk);
    }

    @Override // con.zqBgm5sds
    public float q3BipwRCk(AU29aHa4X aU29aHa4X, float f, float f2) {
        return (Math.signum(f2 - f) * aU29aHa4X.MzoOEjc4X(this.q3BipwRCk)) + f;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("FixedThreshold(offset=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.q3BipwRCk));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
