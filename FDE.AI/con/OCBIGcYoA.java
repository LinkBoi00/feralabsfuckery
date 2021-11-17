package con;
/* loaded from: classes.dex */
public abstract class OCBIGcYoA extends DV1oYHwIh implements clUYjTSq7, S35qAAg28, PmanMZxiM {
    public Zgh96z4e6 PSTqBLTET;

    @Override // con.S35qAAg28
    public boolean J4Ux7ym32() {
        return true;
    }

    public abstract void cAwN510t2(Throwable th);

    public final Zgh96z4e6 dfpT1j18n() {
        Zgh96z4e6 zgh96z4e6 = this.PSTqBLTET;
        if (zgh96z4e6 != null) {
            return zgh96z4e6;
        }
        return null;
    }

    @Override // con.S35qAAg28
    public NohLR2A3H kCA6Zs9sL() {
        return null;
    }

    @Override // con.clUYjTSq7
    public void q3BipwRCk() {
        Object i8XZMQc6Z;
        Zgh96z4e6 dfpT1j18n = dfpT1j18n();
        do {
            i8XZMQc6Z = dfpT1j18n.i8XZMQc6Z();
            if (i8XZMQc6Z instanceof OCBIGcYoA) {
                if (i8XZMQc6Z != this) {
                    return;
                }
            } else if ((i8XZMQc6Z instanceof S35qAAg28) && ((S35qAAg28) i8XZMQc6Z).kCA6Zs9sL() != null) {
                RG6kpfv3v();
                return;
            } else {
                return;
            }
        } while (!Zgh96z4e6.CBQ5d1kRq.compareAndSet(dfpT1j18n, i8XZMQc6Z, AB5ApHoQM.GPLPRo6go));
    }

    @Override // con.DV1oYHwIh
    public String toString() {
        return getClass().getSimpleName() + '@' + cOutqbkMD.GPLPRo6go(this) + "[job@" + cOutqbkMD.GPLPRo6go(dfpT1j18n()) + ']';
    }
}
