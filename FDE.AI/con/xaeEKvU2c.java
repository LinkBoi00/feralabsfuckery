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
    public con.bu5cjmae6 minusKey(con.adUS3SHb2 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof con.aDHI5aP05
            if (r0 == 0) goto L_0x0025
            con.aDHI5aP05 r3 = (con.aDHI5aP05) r3
            con.adUS3SHb2 r0 = r2.getKey()
            if (r0 == r3) goto L_0x0013
            con.adUS3SHb2 r1 = r3.CBQ5d1kRq
            if (r1 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 == 0) goto L_0x0023
            con.PmanMZxiM r3 = r3.kmSgne1rO
            java.lang.Object r3 = r3.IytU16YUK(r2)
            con.zG81huwZq r3 = (con.zG81huwZq) r3
            if (r3 == 0) goto L_0x0023
        L_0x0020:
            con.HbUTGjFCZ r3 = con.HbUTGjFCZ.CBQ5d1kRq
            goto L_0x002a
        L_0x0023:
            r3 = r2
            goto L_0x002a
        L_0x0025:
            con.wrCZc9nGY r0 = con.wrCZc9nGY.CBQ5d1kRq
            if (r0 != r3) goto L_0x0023
            goto L_0x0020
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xaeEKvU2c.minusKey(con.adUS3SHb2):con.bu5cjmae6");
    }

    @Override // java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + '@' + cOutqbkMD.GPLPRo6go(this);
    }

    public boolean yWvV4ePLl(bu5cjmae6 bu5cjmae6) {
        return !(this instanceof Tbczj1VHC);
    }
}
