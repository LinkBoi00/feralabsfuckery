package con;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class Sk4RzIxF3 extends YcVx1OAEe {
    public final YcVx1OAEe oon79WMrY;
    public boolean vPSbyrYWX;

    public Sk4RzIxF3(int i, Uhy55gmtq uhy55gmtq, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, YcVx1OAEe ycVx1OAEe) {
        super(i, uhy55gmtq, pmanMZxiM, pmanMZxiM2);
        this.oon79WMrY = ycVx1OAEe;
        ycVx1OAEe.yWvV4ePLl(this);
    }

    @Override // con.YcVx1OAEe, con.s05BzCoHq
    public void J4Ux7ym32() {
        if (!this.tGV7Q6urW) {
            super.J4Ux7ym32();
            if (!this.vPSbyrYWX) {
                this.vPSbyrYWX = true;
                this.oon79WMrY.oon79WMrY(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x00a9, TryCatch #1 {, blocks: (B:12:0x001f, B:14:0x0024, B:17:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0057, B:25:0x005b, B:26:0x005e, B:28:0x0066, B:29:0x006b, B:30:0x008a, B:32:0x0093, B:31:0x008b), top: B:43:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x001f, B:14:0x0024, B:17:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0057, B:25:0x005b, B:26:0x005e, B:28:0x0066, B:29:0x006b, B:30:0x008a, B:32:0x0093, B:31:0x008b), top: B:43:0x001f }] */
    @Override // con.YcVx1OAEe
    /* Code decompiled incorrectly, please refer to instructions dump */
    public mxyx08G80 ilHKhw3Yw() {
        YcVx1OAEe ycVx1OAEe = this.oon79WMrY;
        if (ycVx1OAEe.yWvV4ePLl || ycVx1OAEe.tGV7Q6urW) {
            return new k3hmDZbMb(this);
        }
        Set set = this.iiGwOFFnr;
        int i = this.J4Ux7ym32;
        Map tGV7Q6urW = set != null ? UvOuyIFuT.tGV7Q6urW(ycVx1OAEe, this, ycVx1OAEe.dIocxURUo()) : null;
        Object obj = UvOuyIFuT.J4Ux7ym32;
        synchronized (obj) {
            UvOuyIFuT.dIocxURUo(this);
            if (!(set == null || set.size() == 0)) {
                mxyx08G80 Eeka1udhb = Eeka1udhb(this.oon79WMrY.tGV7Q6urW(), tGV7Q6urW, this.oon79WMrY.dIocxURUo());
                if (!anXlDk6fV.tGV7Q6urW(Eeka1udhb, xr8bQ8VNz.q3BipwRCk)) {
                    return Eeka1udhb;
                }
                Set qVUwofr5s = this.oon79WMrY.qVUwofr5s();
                if (qVUwofr5s == null) {
                    qVUwofr5s = new HashSet();
                    this.oon79WMrY.RG6kpfv3v(qVUwofr5s);
                }
                qVUwofr5s.addAll(set);
                if (this.oon79WMrY.tGV7Q6urW() < i) {
                    this.oon79WMrY.MzoOEjc4X();
                }
                YcVx1OAEe ycVx1OAEe2 = this.oon79WMrY;
                ycVx1OAEe2.Bhmn1KIah(ycVx1OAEe2.dIocxURUo().kCA6Zs9sL(i).J4Ux7ym32(this.GPLPRo6go));
                this.oon79WMrY.dXrmkklc8(i);
                YcVx1OAEe ycVx1OAEe3 = this.oon79WMrY;
                Uhy55gmtq uhy55gmtq = this.GPLPRo6go;
                Objects.requireNonNull(ycVx1OAEe3);
                synchronized (obj) {
                    ycVx1OAEe3.GPLPRo6go = ycVx1OAEe3.GPLPRo6go.GPLPRo6go(uhy55gmtq);
                }
                this.yWvV4ePLl = true;
                if (!this.vPSbyrYWX) {
                    this.vPSbyrYWX = true;
                    this.oon79WMrY.oon79WMrY(this);
                }
                return xr8bQ8VNz.q3BipwRCk;
            }
            q3BipwRCk();
            if (this.oon79WMrY.tGV7Q6urW() < i) {
            }
            YcVx1OAEe ycVx1OAEe22 = this.oon79WMrY;
            ycVx1OAEe22.Bhmn1KIah(ycVx1OAEe22.dIocxURUo().kCA6Zs9sL(i).J4Ux7ym32(this.GPLPRo6go));
            this.oon79WMrY.dXrmkklc8(i);
            YcVx1OAEe ycVx1OAEe32 = this.oon79WMrY;
            Uhy55gmtq uhy55gmtq2 = this.GPLPRo6go;
            Objects.requireNonNull(ycVx1OAEe32);
            synchronized (obj) {
            }
        }
    }
}
