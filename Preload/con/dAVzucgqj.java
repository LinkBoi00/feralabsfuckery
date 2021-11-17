package con;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class dAVzucgqj extends UuvLiXwHL {
    public static final /* synthetic */ AtomicIntegerFieldUpdater PSTqBLTET = AtomicIntegerFieldUpdater.newUpdater(dAVzucgqj.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public dAVzucgqj(bu5cjmae6 bu5cjmae6, Way959ade way959ade) {
        super(bu5cjmae6, way959ade);
    }

    @Override // con.UuvLiXwHL, con.Zgh96z4e6
    public void Puu3Rhg4F(Object obj) {
        juJ6pnCpu(obj);
    }

    public final Object QSbMsHU5X() {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (PSTqBLTET.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return kBKJSqCSL.COROUTINE_SUSPENDED;
        }
        Object q3BipwRCk = AB5ApHoQM.q3BipwRCk(i8XZMQc6Z());
        if (!(q3BipwRCk instanceof zo6RfsWe2)) {
            return q3BipwRCk;
        }
        throw ((zo6RfsWe2) q3BipwRCk).q3BipwRCk;
    }

    @Override // con.UuvLiXwHL, con.Y371ZqMzx
    public void juJ6pnCpu(Object obj) {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i == 0) {
                if (PSTqBLTET.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z) {
            AIDP2j9pY.J4Ux7ym32(idpM54xlp.PSTqBLTET(this.Bhmn1KIah), cOutqbkMD.vPSbyrYWX(obj, this.Bhmn1KIah), null, 2);
        }
    }
}
