package con;
/* loaded from: classes.dex */
public abstract class yxtPW6v5D implements Runnable, Comparable, clUYjTSq7 {
    public int Bhmn1KIah = -1;
    public long CBQ5d1kRq;
    public Object kmSgne1rO;

    public yxtPW6v5D(long j) {
        this.CBQ5d1kRq = j;
    }

    public P77LAT9nA J4Ux7ym32() {
        Object obj = this.kmSgne1rO;
        if (obj instanceof P77LAT9nA) {
            return (P77LAT9nA) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int i = ((this.CBQ5d1kRq - ((yxtPW6v5D) obj).CBQ5d1kRq) > 0 ? 1 : ((this.CBQ5d1kRq - ((yxtPW6v5D) obj).CBQ5d1kRq) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    @Override // con.clUYjTSq7
    public final synchronized void q3BipwRCk() {
        Object obj = this.kmSgne1rO;
        vX9ZKIhAp vx9zkihap = plqClx8zg.q3BipwRCk;
        if (obj != vx9zkihap) {
            B4xCdATgk b4xCdATgk = obj instanceof B4xCdATgk ? (B4xCdATgk) obj : null;
            if (b4xCdATgk != null) {
                synchronized (b4xCdATgk) {
                    if (J4Ux7ym32() != null) {
                        b4xCdATgk.dIocxURUo(this.Bhmn1KIah);
                    }
                }
            }
            this.kmSgne1rO = vx9zkihap;
        }
    }

    public void tGV7Q6urW(P77LAT9nA p77LAT9nA) {
        if (this.kmSgne1rO != plqClx8zg.q3BipwRCk) {
            this.kmSgne1rO = p77LAT9nA;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Delayed[nanos=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(']');
        return q3BipwRCk.toString();
    }
}
