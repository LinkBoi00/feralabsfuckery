package con;

import java.util.ArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class FIC2AFxvd extends jaM2zCRJ5 {
    public final boolean MzoOEjc4X;
    public boolean ilHKhw3Yw = true;

    public FIC2AFxvd(boolean z) {
        this.MzoOEjc4X = z;
        if (nGmxdG7rV.CBQ5d1kRq == null) {
            nGmxdG7rV.CBQ5d1kRq = new nGmxdG7rV();
        }
        this.CBQ5d1kRq = nGmxdG7rV.CBQ5d1kRq;
        this.kmSgne1rO = null;
    }

    @Override // con.jaM2zCRJ5
    public void dIocxURUo(Executor executor, SErPKGCcc sErPKGCcc) {
        SErPKGCcc sErPKGCcc2 = new SErPKGCcc(this, executor, sErPKGCcc, 0);
        xheEapSkC J4Ux7ym32 = PVDPmuuqs.J4Ux7ym32();
        if (J4Ux7ym32 != null) {
            sErPKGCcc2.J4Ux7ym32(J4Ux7ym32);
        } else {
            xheEapSkC.Eeka1udhb.execute(new NS7vjtAxy((Executor) null, sErPKGCcc2));
        }
    }

    @Override // con.jaM2zCRJ5
    public DfseMYa7G q3BipwRCk() {
        try {
            xheEapSkC q3BipwRCk = PVDPmuuqs.q3BipwRCk();
            this.PSTqBLTET = q3BipwRCk;
            if (!this.MzoOEjc4X || q3BipwRCk.J4Ux7ym32()) {
                if (this.CBQ5d1kRq instanceof nGmxdG7rV) {
                    this.CBQ5d1kRq = new ArrayList();
                }
                MCXoBhXFn J4Ux7ym32 = J4Ux7ym32();
                if (!this.ilHKhw3Yw || J4Ux7ym32 != MCXoBhXFn.dIocxURUo) {
                    return J4Ux7ym32;
                }
                this.ilHKhw3Yw = false;
                return q3BipwRCk();
            }
            close();
            return MCXoBhXFn.tGV7Q6urW;
        } catch (CUby0PNcw unused) {
            close();
            return MCXoBhXFn.tGV7Q6urW;
        }
    }
}
