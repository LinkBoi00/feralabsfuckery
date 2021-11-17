package con;

import android.view.KeyEvent;
import java.util.Objects;
/* loaded from: classes.dex */
public final class jgMsl7cgu extends Cb827Z4La {
    public static final /* synthetic */ int V9LQMKGJe;
    public final /* synthetic */ int o4LF8RkoQ = 0;

    public jgMsl7cgu(qhaZGYFO8 qhazgyfo8, Awlb99mXV awlb99mXV) {
        super(qhazgyfo8, awlb99mXV);
        awlb99mXV.Bhmn1KIah = this;
    }

    public boolean D91ZKn9BG(KeyEvent keyEvent) {
        Boolean bool;
        PmanMZxiM pmanMZxiM = ((Awlb99mXV) this.NyWTwPF6V).CBQ5d1kRq;
        if (pmanMZxiM == null) {
            bool = null;
        } else {
            bool = (Boolean) pmanMZxiM.IytU16YUK(new PZAPy5kDf(keyEvent));
        }
        if (anXlDk6fV.tGV7Q6urW(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        jgMsl7cgu BL4OzhZBd = BL4OzhZBd();
        if (BL4OzhZBd == null) {
            return false;
        }
        return BL4OzhZBd.D91ZKn9BG(keyEvent);
    }

    @Override // con.Cb827Z4La
    public azsj7uixB XGA7b0zuB() {
        switch (this.o4LF8RkoQ) {
            case 0:
                return (Awlb99mXV) this.NyWTwPF6V;
            default:
                return (zbyfFPFas) this.NyWTwPF6V;
        }
    }

    @Override // con.Cb827Z4La, con.qhaZGYFO8
    public jgMsl7cgu XYT7vJqNO() {
        switch (this.o4LF8RkoQ) {
            case 0:
                return this;
            default:
                return super.XYT7vJqNO();
        }
    }

    @Override // con.Cb827Z4La, con.qhaZGYFO8
    public void buPcffgdD(long j, ugecCdPSw ugeccdpsw, boolean z) {
        switch (this.o4LF8RkoQ) {
            case 1:
                Objects.requireNonNull((ztvmwA530) ((zbyfFPFas) this.NyWTwPF6V));
                ztvmwA530 ztvmwa530 = (ztvmwA530) ((zbyfFPFas) this.NyWTwPF6V);
                Objects.requireNonNull(ztvmwa530);
                Xeg1rC5FI(j, ugeccdpsw, false, z, ztvmwa530, new npeWd6BOs(this, j, ugeccdpsw, z));
                return;
            default:
                super.buPcffgdD(j, ugeccdpsw, z);
                return;
        }
    }

    @Override // con.Cb827Z4La
    public void eUlgH2VO7(azsj7uixB azsj7uixb) {
        switch (this.o4LF8RkoQ) {
            case 0:
                Awlb99mXV awlb99mXV = (Awlb99mXV) azsj7uixb;
                this.NyWTwPF6V = awlb99mXV;
                awlb99mXV.Bhmn1KIah = this;
                return;
            default:
                zbyfFPFas zbyffpfas = (zbyfFPFas) azsj7uixb;
                this.NyWTwPF6V = zbyffpfas;
                ((ztvmwA530) zbyffpfas).CBQ5d1kRq = this;
                return;
        }
    }

    public void eylCJcWC7(long j, ugecCdPSw ugeccdpsw, boolean z) {
        this.mUqPm6GBh.buPcffgdD(this.mUqPm6GBh.INnK5Rew6(j), ugeccdpsw, z);
    }

    public boolean pwwzaxl9D(KeyEvent keyEvent) {
        Boolean bool;
        jgMsl7cgu BL4OzhZBd = BL4OzhZBd();
        Boolean valueOf = BL4OzhZBd == null ? null : Boolean.valueOf(BL4OzhZBd.pwwzaxl9D(keyEvent));
        if (anXlDk6fV.tGV7Q6urW(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        PmanMZxiM pmanMZxiM = ((Awlb99mXV) this.NyWTwPF6V).kmSgne1rO;
        if (pmanMZxiM == null || (bool = (Boolean) pmanMZxiM.IytU16YUK(new PZAPy5kDf(keyEvent))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public jgMsl7cgu(qhaZGYFO8 qhazgyfo8, zbyfFPFas zbyffpfas) {
        super(qhazgyfo8, zbyffpfas);
        ((ztvmwA530) zbyffpfas).CBQ5d1kRq = this;
    }
}
