package con;
/* loaded from: classes.dex */
public final class KYeV3FWhw extends H9pO9gJ32 implements f106ugAzx {
    public Way959ade Eeka1udhb;
    public final bu5cjmae6 MzoOEjc4X;
    public final f106ugAzx PSTqBLTET;
    public final int ilHKhw3Yw;
    public bu5cjmae6 qVUwofr5s;

    public KYeV3FWhw(f106ugAzx f106ugazx, bu5cjmae6 bu5cjmae6) {
        super(z68cedDlE.CBQ5d1kRq, HbUTGjFCZ.CBQ5d1kRq);
        this.PSTqBLTET = f106ugazx;
        this.MzoOEjc4X = bu5cjmae6;
        this.ilHKhw3Yw = ((Number) bu5cjmae6.fold(0, rK9K320Ix.iMyQMM6Qj)).intValue();
    }

    @Override // con.LxklW3zxE
    public StackTraceElement iiGwOFFnr() {
        return null;
    }

    @Override // con.H9pO9gJ32, con.Way959ade
    public bu5cjmae6 kCA6Zs9sL() {
        Way959ade way959ade = this.Eeka1udhb;
        bu5cjmae6 kCA6Zs9sL = way959ade == null ? null : way959ade.kCA6Zs9sL();
        return kCA6Zs9sL == null ? HbUTGjFCZ.CBQ5d1kRq : kCA6Zs9sL;
    }

    @Override // con.H9pO9gJ32, con.LxklW3zxE
    public void oon79WMrY() {
        super.oon79WMrY();
    }

    @Override // con.f106ugAzx
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        try {
            Object vPSbyrYWX = vPSbyrYWX(way959ade, obj);
            return vPSbyrYWX == kBKJSqCSL.COROUTINE_SUSPENDED ? vPSbyrYWX : qih4lW99W.q3BipwRCk;
        } catch (Throwable th) {
            this.qVUwofr5s = new LNSgl7Q7t(th);
            throw th;
        }
    }

    @Override // con.LxklW3zxE, con.gXw4WGPur
    public gXw4WGPur tGV7Q6urW() {
        Way959ade way959ade = this.Eeka1udhb;
        if (way959ade instanceof gXw4WGPur) {
            return (gXw4WGPur) way959ade;
        }
        return null;
    }

    public final Object vPSbyrYWX(Way959ade way959ade, Object obj) {
        bu5cjmae6 kCA6Zs9sL = way959ade.kCA6Zs9sL();
        anXlDk6fV.vPSbyrYWX(kCA6Zs9sL);
        bu5cjmae6 bu5cjmae6 = this.qVUwofr5s;
        if (bu5cjmae6 != kCA6Zs9sL) {
            if (bu5cjmae6 instanceof LNSgl7Q7t) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                q3BipwRCk.append(((LNSgl7Q7t) bu5cjmae6).CBQ5d1kRq);
                q3BipwRCk.append(", but then emission attempt of value '");
                q3BipwRCk.append(obj);
                q3BipwRCk.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(idpM54xlp.CpG0imbht(q3BipwRCk.toString()).toString());
            } else if (((Number) kCA6Zs9sL.fold(0, new MAZDnzQe5(this))).intValue() == this.ilHKhw3Yw) {
                this.qVUwofr5s = kCA6Zs9sL;
            } else {
                StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Flow invariant is violated:\n\t\tFlow was collected in ");
                q3BipwRCk2.append(this.MzoOEjc4X);
                q3BipwRCk2.append(",\n\t\tbut emission happened in ");
                q3BipwRCk2.append(kCA6Zs9sL);
                q3BipwRCk2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(q3BipwRCk2.toString().toString());
            }
        }
        this.Eeka1udhb = way959ade;
        return pun6hGvSw.q3BipwRCk.sk5s77z6Q(this.PSTqBLTET, obj, this);
    }

    @Override // con.LxklW3zxE
    public Object yWvV4ePLl(Object obj) {
        Throwable q3BipwRCk = YqdLs8aRM.q3BipwRCk(obj);
        if (q3BipwRCk != null) {
            this.qVUwofr5s = new LNSgl7Q7t(q3BipwRCk);
        }
        Way959ade way959ade = this.Eeka1udhb;
        if (way959ade != null) {
            way959ade.Bhmn1KIah(obj);
        }
        return kBKJSqCSL.COROUTINE_SUSPENDED;
    }
}
