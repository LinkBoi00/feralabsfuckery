package con;
/* loaded from: classes.dex */
public final class Isoa6Y5Ue {
    @Deprecated
    public static final long[] kCA6Zs9sL = new long[0];
    public final kkcQgCx5G J4Ux7ym32;
    public final long[] dIocxURUo;
    public final W39e6bnPN q3BipwRCk;
    public long tGV7Q6urW;

    public Isoa6Y5Ue(W39e6bnPN w39e6bnPN, kkcQgCx5G kkcqgcx5g) {
        this.q3BipwRCk = w39e6bnPN;
        this.J4Ux7ym32 = kkcqgcx5g;
        int CBQ5d1kRq = w39e6bnPN.CBQ5d1kRq();
        long j = 0;
        if (CBQ5d1kRq <= 64) {
            this.tGV7Q6urW = CBQ5d1kRq != 64 ? -1 << CBQ5d1kRq : j;
            this.dIocxURUo = kCA6Zs9sL;
            return;
        }
        this.tGV7Q6urW = 0;
        int i = (CBQ5d1kRq - 1) >>> 6;
        long[] jArr = new long[i];
        if ((CBQ5d1kRq & 63) != 0) {
            jArr[i - 1] = -1 << CBQ5d1kRq;
        }
        this.dIocxURUo = jArr;
    }
}
