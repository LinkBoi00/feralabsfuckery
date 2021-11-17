package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class WEtyFPo1W implements S35qAAg28 {
    public final NohLR2A3H CBQ5d1kRq;
    private volatile /* synthetic */ Object _exceptionsHolder = null;
    private volatile /* synthetic */ int _isCompleting;
    private volatile /* synthetic */ Object _rootCause;

    public WEtyFPo1W(NohLR2A3H nohLR2A3H, boolean z, Throwable th) {
        this.CBQ5d1kRq = nohLR2A3H;
        this._isCompleting = z ? 1 : 0;
        this._rootCause = th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean GPLPRo6go() {
        return this._isCompleting;
    }

    @Override // con.S35qAAg28
    public boolean J4Ux7ym32() {
        return ((Throwable) this._rootCause) == null;
    }

    public final boolean Puu3Rhg4F() {
        return this._exceptionsHolder == AB5ApHoQM.kCA6Zs9sL;
    }

    public final Throwable dIocxURUo() {
        return (Throwable) this._rootCause;
    }

    public final boolean iiGwOFFnr() {
        return ((Throwable) this._rootCause) != null;
    }

    @Override // con.S35qAAg28
    public NohLR2A3H kCA6Zs9sL() {
        return this.CBQ5d1kRq;
    }

    public final void oon79WMrY(boolean z) {
        this._isCompleting = z ? 1 : 0;
    }

    public final void q3BipwRCk(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
        } else if (th != th2) {
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList tGV7Q6urW = tGV7Q6urW();
                    tGV7Q6urW.add(obj);
                    tGV7Q6urW.add(th);
                    this._exceptionsHolder = tGV7Q6urW;
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("State is ", obj).toString());
            }
        }
    }

    public final ArrayList tGV7Q6urW() {
        return new ArrayList(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Finishing[cancelling=");
        q3BipwRCk.append(iiGwOFFnr());
        q3BipwRCk.append(", completing=");
        q3BipwRCk.append((boolean) this._isCompleting);
        q3BipwRCk.append(", rootCause=");
        q3BipwRCk.append((Throwable) this._rootCause);
        q3BipwRCk.append(", exceptions=");
        q3BipwRCk.append(this._exceptionsHolder);
        q3BipwRCk.append(", list=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(']');
        return q3BipwRCk.toString();
    }

    public final List yWvV4ePLl(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            arrayList = tGV7Q6urW();
        } else if (obj instanceof Throwable) {
            ArrayList tGV7Q6urW = tGV7Q6urW();
            tGV7Q6urW.add(obj);
            arrayList = tGV7Q6urW;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("State is ", obj).toString());
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !anXlDk6fV.tGV7Q6urW(th, th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = AB5ApHoQM.kCA6Zs9sL;
        return arrayList;
    }
}
