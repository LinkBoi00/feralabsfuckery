package con;
/* loaded from: classes.dex */
public final class RFvh4RAur {
    public Y3ibtOJiE q3BipwRCk = null;
    public SI0VpKubr J4Ux7ym32 = null;
    public BVPIXOq8T tGV7Q6urW = null;
    public A128gLXzp dIocxURUo = null;

    public RFvh4RAur(Y3ibtOJiE y3ibtOJiE, SI0VpKubr sI0VpKubr, BVPIXOq8T bVPIXOq8T, A128gLXzp a128gLXzp, int i) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RFvh4RAur)) {
            return false;
        }
        RFvh4RAur rFvh4RAur = (RFvh4RAur) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, rFvh4RAur.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, rFvh4RAur.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, rFvh4RAur.tGV7Q6urW) && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, rFvh4RAur.dIocxURUo);
    }

    public int hashCode() {
        Y3ibtOJiE y3ibtOJiE = this.q3BipwRCk;
        int i = 0;
        int hashCode = (y3ibtOJiE == null ? 0 : y3ibtOJiE.hashCode()) * 31;
        SI0VpKubr sI0VpKubr = this.J4Ux7ym32;
        int hashCode2 = (hashCode + (sI0VpKubr == null ? 0 : sI0VpKubr.hashCode())) * 31;
        BVPIXOq8T bVPIXOq8T = this.tGV7Q6urW;
        int hashCode3 = (hashCode2 + (bVPIXOq8T == null ? 0 : bVPIXOq8T.hashCode())) * 31;
        A128gLXzp a128gLXzp = this.dIocxURUo;
        if (a128gLXzp != null) {
            i = a128gLXzp.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("BorderCache(imageBitmap=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", canvas=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", canvasDrawScope=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", borderPath=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
