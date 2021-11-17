package con;
/* loaded from: classes.dex */
public abstract class qFHLSmhbf extends TTldk3oyX {
    public final DV1oYHwIh J4Ux7ym32;
    public DV1oYHwIh tGV7Q6urW;

    public qFHLSmhbf(DV1oYHwIh dV1oYHwIh) {
        this.J4Ux7ym32 = dV1oYHwIh;
    }

    @Override // con.TTldk3oyX
    public void J4Ux7ym32(Object obj, Object obj2) {
        DV1oYHwIh dV1oYHwIh = (DV1oYHwIh) obj;
        boolean z = obj2 == null;
        DV1oYHwIh dV1oYHwIh2 = z ? this.J4Ux7ym32 : this.tGV7Q6urW;
        if (dV1oYHwIh2 != null && DV1oYHwIh.CBQ5d1kRq.compareAndSet(dV1oYHwIh, this, dV1oYHwIh2) && z) {
            this.J4Ux7ym32.CBQ5d1kRq(this.tGV7Q6urW);
        }
    }
}
