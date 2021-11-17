package con;
/* loaded from: classes.dex */
public final class exL1qvzlc {
    public final long J4Ux7ym32;
    public final long q3BipwRCk;

    public exL1qvzlc(long j, long j2, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exL1qvzlc)) {
            return false;
        }
        exL1qvzlc exl1qvzlc = (exL1qvzlc) obj;
        return bO2dbmrf7.tGV7Q6urW(this.q3BipwRCk, exl1qvzlc.q3BipwRCk) && bO2dbmrf7.tGV7Q6urW(this.J4Ux7ym32, exl1qvzlc.J4Ux7ym32);
    }

    public int hashCode() {
        return bO2dbmrf7.yWvV4ePLl(this.J4Ux7ym32) + (bO2dbmrf7.yWvV4ePLl(this.q3BipwRCk) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SelectionColors(selectionHandleColor=");
        q3BipwRCk.append((Object) bO2dbmrf7.oon79WMrY(this.q3BipwRCk));
        q3BipwRCk.append(", selectionBackgroundColor=");
        q3BipwRCk.append((Object) bO2dbmrf7.oon79WMrY(this.J4Ux7ym32));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
