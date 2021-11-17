package con;
/* loaded from: classes.dex */
public abstract class V1xq9aVRv implements zG81huwZq {
    private final adUS3SHb2 key;

    public V1xq9aVRv(adUS3SHb2 adus3shb2) {
        this.key = adus3shb2;
    }

    @Override // con.bu5cjmae6
    public <R> R fold(R r, kkcQgCx5G kkcqgcx5g) {
        return (R) kkcqgcx5g.WaUP0CF08(r, this);
    }

    @Override // con.zG81huwZq, con.bu5cjmae6
    public <E extends zG81huwZq> E get(adUS3SHb2 adus3shb2) {
        return (E) idpM54xlp.Puu3Rhg4F(this, adus3shb2);
    }

    @Override // con.zG81huwZq
    public adUS3SHb2 getKey() {
        return this.key;
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        return anXlDk6fV.tGV7Q6urW(getKey(), adus3shb2) ? HbUTGjFCZ.CBQ5d1kRq : this;
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return idpM54xlp.dfpT1j18n(this, bu5cjmae6);
    }
}
