package con;
/* loaded from: classes.dex */
public final /* synthetic */ class nmKJZrF2V extends cdHZcyjGN implements PmanMZxiM {
    public final /* synthetic */ int dXrmkklc8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmKJZrF2V(Object obj, int i) {
        super(1, obj, bnrfwdIF3.class, "onFrame", "onFrame(J)V", 0);
        this.dXrmkklc8 = i;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        boolean z;
        switch (this.dXrmkklc8) {
            case 0:
                long longValue = ((Number) obj).longValue();
                bnrfwdIF3 bnrfwdif3 = (bnrfwdIF3) this.kmSgne1rO;
                if (bnrfwdif3.tGV7Q6urW == Long.MIN_VALUE) {
                    bnrfwdif3.tGV7Q6urW = longValue;
                }
                long j = longValue - bnrfwdif3.tGV7Q6urW;
                pnuAOe8oh pnuaoe8oh = bnrfwdif3.q3BipwRCk;
                int i = pnuaoe8oh.Bhmn1KIah;
                if (i > 0) {
                    Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
                    z = true;
                    int i2 = 0;
                    do {
                        dBm62qLsX dbm62qlsx = (dBm62qLsX) objArr[i2];
                        if (!dbm62qlsx.qVUwofr5s) {
                            ((prCJwNx2x) dbm62qlsx.RG6kpfv3v.J4Ux7ym32).CBQ5d1kRq(Boolean.FALSE);
                            if (dbm62qlsx.Eeka1udhb) {
                                dbm62qlsx.Eeka1udhb = false;
                                dbm62qlsx.dXrmkklc8 = j;
                            }
                            long j2 = j - dbm62qlsx.dXrmkklc8;
                            ((prCJwNx2x) dbm62qlsx.MzoOEjc4X).CBQ5d1kRq(dbm62qlsx.ilHKhw3Yw.J4Ux7ym32(j2));
                            dbm62qlsx.qVUwofr5s = dbm62qlsx.ilHKhw3Yw.iiGwOFFnr(j2);
                        }
                        if (!dbm62qlsx.qVUwofr5s) {
                            z = false;
                        }
                        i2++;
                    } while (i2 < i);
                } else {
                    z = true;
                }
                ((prCJwNx2x) bnrfwdif3.dIocxURUo).CBQ5d1kRq(Boolean.valueOf(!z));
                return qih4lW99W.q3BipwRCk;
            case 1:
                return ((ox1v3fq6f) this.kmSgne1rO).q3BipwRCk(((Number) obj).intValue());
            default:
                return new czCYotiRn(((pZznYi2iw) this.kmSgne1rO).MzoOEjc4X(((Number) obj).intValue()));
        }
    }
}
