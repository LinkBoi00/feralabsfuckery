package con;
/* loaded from: classes.dex */
public class WpheuUJER extends nOPp9PCGN {
    public final Object dIocxURUo = new Object();

    public WpheuUJER(int i) {
        super(i, 1);
    }

    @Override // con.nOPp9PCGN
    public Object q3BipwRCk() {
        Object q3BipwRCk;
        synchronized (this.dIocxURUo) {
            q3BipwRCk = super.q3BipwRCk();
        }
        return q3BipwRCk;
    }

    @Override // con.nOPp9PCGN
    public boolean tGV7Q6urW(Object obj) {
        boolean tGV7Q6urW;
        synchronized (this.dIocxURUo) {
            tGV7Q6urW = super.tGV7Q6urW(obj);
        }
        return tGV7Q6urW;
    }
}
