package con;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final class SbDM1N4Hj implements Kh7ffW4RH {
    public final Choreographer CBQ5d1kRq;

    public SbDM1N4Hj(Choreographer choreographer) {
        this.CBQ5d1kRq = choreographer;
    }

    @Override // con.bu5cjmae6
    public Object fold(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    @Override // con.zG81huwZq, con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        return idpM54xlp.Puu3Rhg4F(this, adus3shb2);
    }

    @Override // con.zG81huwZq
    public adUS3SHb2 getKey() {
        return LQcLPKzab.CBQ5d1kRq;
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        return pz7YPhQTU.RG6kpfv3v(this, adus3shb2);
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return idpM54xlp.dfpT1j18n(this, bu5cjmae6);
    }

    @Override // con.Kh7ffW4RH
    public Object q3BipwRCk(PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        dMQC97DHs dmqc97dhs;
        bu5cjmae6 kCA6Zs9sL = way959ade.kCA6Zs9sL();
        int i = V2LokvvBN.dIocxURUo;
        zG81huwZq zg81huwzq = kCA6Zs9sL.get(wrCZc9nGY.CBQ5d1kRq);
        J7YsuEuPq j7YsuEuPq = zg81huwzq instanceof J7YsuEuPq ? (J7YsuEuPq) zg81huwzq : null;
        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(way959ade), 1);
        tmgchdfqu.Eeka1udhb();
        MVyDqfW5Z mVyDqfW5Z = new MVyDqfW5Z(tmgchdfqu, this, pmanMZxiM);
        if (j7YsuEuPq == null || !anXlDk6fV.tGV7Q6urW(j7YsuEuPq.kmSgne1rO, this.CBQ5d1kRq)) {
            this.CBQ5d1kRq.postFrameCallback(mVyDqfW5Z);
            dmqc97dhs = new dMQC97DHs(this, mVyDqfW5Z);
        } else {
            synchronized (j7YsuEuPq.PSTqBLTET) {
                j7YsuEuPq.ilHKhw3Yw.add(mVyDqfW5Z);
                if (!j7YsuEuPq.dXrmkklc8) {
                    j7YsuEuPq.dXrmkklc8 = true;
                    j7YsuEuPq.kmSgne1rO.postFrameCallback(j7YsuEuPq.RG6kpfv3v);
                }
            }
            dmqc97dhs = new dMQC97DHs(j7YsuEuPq, mVyDqfW5Z);
        }
        tmgchdfqu.RG6kpfv3v(dmqc97dhs);
        return tmgchdfqu.qVUwofr5s();
    }
}
