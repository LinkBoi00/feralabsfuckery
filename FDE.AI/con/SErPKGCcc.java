package con;

import java.util.ArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class SErPKGCcc {
    public final /* synthetic */ Executor J4Ux7ym32;
    public final /* synthetic */ FIC2AFxvd q3BipwRCk;
    public final /* synthetic */ SErPKGCcc tGV7Q6urW;

    public /* synthetic */ SErPKGCcc(FIC2AFxvd fIC2AFxvd, Executor executor, SErPKGCcc sErPKGCcc, int i) {
        this.q3BipwRCk = fIC2AFxvd;
        this.J4Ux7ym32 = executor;
        this.tGV7Q6urW = sErPKGCcc;
    }

    public void J4Ux7ym32(xheEapSkC xheeapskc) {
        FIC2AFxvd fIC2AFxvd = this.q3BipwRCk;
        Executor executor = this.J4Ux7ym32;
        SErPKGCcc sErPKGCcc = this.tGV7Q6urW;
        if (!fIC2AFxvd.MzoOEjc4X || xheeapskc.J4Ux7ym32()) {
            if (fIC2AFxvd.CBQ5d1kRq instanceof nGmxdG7rV) {
                fIC2AFxvd.CBQ5d1kRq = sErPKGCcc == null ? null : new ArrayList();
            }
            fIC2AFxvd.PSTqBLTET = xheeapskc;
            xheeapskc.kmSgne1rO.execute(new Runnable(executor, new SErPKGCcc(fIC2AFxvd, executor, sErPKGCcc, 1)) { // from class: con.PbWvKxS09
                public final /* synthetic */ SErPKGCcc Bhmn1KIah;
                public final /* synthetic */ Executor kmSgne1rO;

                {
                    this.kmSgne1rO = r2;
                    this.Bhmn1KIah = r3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    jaM2zCRJ5 jam2zcrj5 = jaM2zCRJ5.this;
                    Executor executor2 = this.kmSgne1rO;
                    SErPKGCcc sErPKGCcc2 = this.Bhmn1KIah;
                    MCXoBhXFn J4Ux7ym32 = jam2zcrj5.J4Ux7ym32();
                    if (sErPKGCcc2 == null) {
                        return;
                    }
                    if (executor2 == null) {
                        sErPKGCcc2.q3BipwRCk(J4Ux7ym32);
                    } else {
                        executor2.execute(new NS7vjtAxy(J4Ux7ym32, sErPKGCcc2));
                    }
                }
            });
            return;
        }
        fIC2AFxvd.close();
        MCXoBhXFn mCXoBhXFn = MCXoBhXFn.tGV7Q6urW;
        if (sErPKGCcc == null) {
            return;
        }
        if (executor == null) {
            sErPKGCcc.q3BipwRCk(mCXoBhXFn);
        } else {
            executor.execute(new NS7vjtAxy(mCXoBhXFn, sErPKGCcc));
        }
    }

    public void q3BipwRCk(DfseMYa7G dfseMYa7G) {
        FIC2AFxvd fIC2AFxvd = this.q3BipwRCk;
        Executor executor = this.J4Ux7ym32;
        SErPKGCcc sErPKGCcc = this.tGV7Q6urW;
        if (fIC2AFxvd.ilHKhw3Yw && dfseMYa7G == MCXoBhXFn.dIocxURUo) {
            fIC2AFxvd.ilHKhw3Yw = false;
            fIC2AFxvd.dIocxURUo(executor, sErPKGCcc);
        } else if (sErPKGCcc != null) {
            sErPKGCcc.q3BipwRCk(dfseMYa7G);
        }
    }
}
