package con;
/* loaded from: classes.dex */
public abstract class xaeEKvU2c extends V1xq9aVRv implements V2LokvvBN {
    public static final PdrkC2cPV CBQ5d1kRq = new PdrkC2cPV(null);

    public xaeEKvU2c() {
        super(wrCZc9nGY.CBQ5d1kRq);
    }

    public abstract void Puu3Rhg4F(bu5cjmae6 bu5cjmae6, Runnable runnable);

    @Override // con.V1xq9aVRv, con.zG81huwZq, con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        if (adus3shb2 instanceof aDHI5aP05) {
            aDHI5aP05 adhi5ap05 = (aDHI5aP05) adus3shb2;
            adUS3SHb2 key = getKey();
            if (!(key == adhi5ap05 || adhi5ap05.CBQ5d1kRq == key)) {
                return null;
            }
            zG81huwZq zg81huwzq = (zG81huwZq) adhi5ap05.kmSgne1rO.IytU16YUK(this);
            if (!(zg81huwzq instanceof zG81huwZq)) {
                return null;
            }
            return zg81huwzq;
        } else if (wrCZc9nGY.CBQ5d1kRq == adus3shb2) {
            return this;
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (((con.zG81huwZq) r3.kmSgne1rO.IytU16YUK(r2)) != null) goto L_0x0020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (con.wrCZc9nGY.CBQ5d1kRq == r3) goto L_0x0020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        return con.HbUTGjFCZ.CBQ5d1kRq;
     */
    @Override // con.V1xq9aVRv, con.bu5cjmae6
    /* Code decompiled incorrectly, please refer to instructions dump */
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        if (adus3shb2 instanceof aDHI5aP05) {
            aDHI5aP05 adhi5ap05 = (aDHI5aP05) adus3shb2;
            adUS3SHb2 key = getKey();
            if (key == adhi5ap05 || adhi5ap05.CBQ5d1kRq == key) {
            }
            return this;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + '@' + cOutqbkMD.GPLPRo6go(this);
    }

    public boolean yWvV4ePLl(bu5cjmae6 bu5cjmae6) {
        return !(this instanceof Tbczj1VHC);
    }
}
