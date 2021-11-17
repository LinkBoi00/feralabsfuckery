package con;
/* loaded from: classes.dex */
public final class nju3iOSRs {
    public final long J4Ux7ym32;
    public final AU29aHa4X q3BipwRCk;
    public final float tGV7Q6urW;

    public nju3iOSRs(AU29aHa4X aU29aHa4X, long j, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = aU29aHa4X;
        this.J4Ux7ym32 = j;
        this.tGV7Q6urW = aU29aHa4X.dfpT1j18n(K5PjwoFCN.yWvV4ePLl(j));
        aU29aHa4X.dfpT1j18n(K5PjwoFCN.Puu3Rhg4F(j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nju3iOSRs)) {
            return false;
        }
        nju3iOSRs nju3iosrs = (nju3iOSRs) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, nju3iosrs.q3BipwRCk) && K5PjwoFCN.J4Ux7ym32(this.J4Ux7ym32, nju3iosrs.J4Ux7ym32);
    }

    public int hashCode() {
        return (this.q3BipwRCk.hashCode() * 31) + Long.hashCode(this.J4Ux7ym32);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("LazyItemScopeImpl(density=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", constraints=");
        q3BipwRCk.append((Object) K5PjwoFCN.CBQ5d1kRq(this.J4Ux7ym32));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
