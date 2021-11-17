package con;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
/* loaded from: classes.dex */
public final class vfV41oYWu extends IP5eUxTmc {
    public bZmnXN812 GPLPRo6go;
    public bZmnXN812 J4Ux7ym32;
    public float iiGwOFFnr;
    public yEz1ivYb6 ilHKhw3Yw;
    public float kmSgne1rO;
    public float vPSbyrYWX;
    public float tGV7Q6urW = 1.0f;
    public List dIocxURUo = Dqz1pJHWH.CBQ5d1kRq;
    public float kCA6Zs9sL = 1.0f;
    public int Puu3Rhg4F = 0;
    public int yWvV4ePLl = 0;
    public float oon79WMrY = 4.0f;
    public float CBQ5d1kRq = 1.0f;
    public boolean Bhmn1KIah = true;
    public boolean PSTqBLTET = true;
    public boolean MzoOEjc4X = true;
    public final A128gLXzp qVUwofr5s = xP6F5SR9v.iiGwOFFnr();
    public final A128gLXzp Eeka1udhb = xP6F5SR9v.iiGwOFFnr();
    public final llWJsfBCK dXrmkklc8 = anXlDk6fV.RG6kpfv3v(3, juufjqtjC.RG6kpfv3v);
    public final rKKfiOTQO RG6kpfv3v = new rKKfiOTQO();

    public vfV41oYWu() {
        super(null);
        int i = fpjpWAHwn.q3BipwRCk;
    }

    public final void iiGwOFFnr() {
        Path path;
        ((Q3Qxqu4re) this.Eeka1udhb).q3BipwRCk.reset();
        if (this.vPSbyrYWX == 0.0f) {
            if (this.CBQ5d1kRq == 1.0f) {
                ODug2UCW1.GPLPRo6go(this.Eeka1udhb, this.qVUwofr5s, 0, 2, null);
                return;
            }
        }
        f34QVUq2J kCA6Zs9sL = kCA6Zs9sL();
        A128gLXzp a128gLXzp = this.qVUwofr5s;
        PathMeasure pathMeasure = kCA6Zs9sL.q3BipwRCk;
        if (a128gLXzp == null) {
            path = null;
        } else if (a128gLXzp instanceof Q3Qxqu4re) {
            path = ((Q3Qxqu4re) a128gLXzp).q3BipwRCk;
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, false);
        float length = kCA6Zs9sL().q3BipwRCk.getLength();
        float f = this.vPSbyrYWX;
        float f2 = this.kmSgne1rO;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.CBQ5d1kRq + f2) % 1.0f) * length;
        if (f3 > f4) {
            kCA6Zs9sL().q3BipwRCk(f3, length, this.Eeka1udhb, true);
            kCA6Zs9sL().q3BipwRCk(0.0f, f4, this.Eeka1udhb, true);
            return;
        }
        kCA6Zs9sL().q3BipwRCk(f3, f4, this.Eeka1udhb, true);
    }

    public final f34QVUq2J kCA6Zs9sL() {
        return (f34QVUq2J) this.dXrmkklc8.getValue();
    }

    @Override // con.IP5eUxTmc
    public void q3BipwRCk(wvIIkk6mx wviikk6mx) {
        if (this.Bhmn1KIah) {
            ((List) this.RG6kpfv3v.q3BipwRCk).clear();
            ((Q3Qxqu4re) this.qVUwofr5s).q3BipwRCk.reset();
            rKKfiOTQO rkkfiotqo = this.RG6kpfv3v;
            ((List) rkkfiotqo.q3BipwRCk).addAll(this.dIocxURUo);
            rkkfiotqo.Puu3Rhg4F(this.qVUwofr5s);
            iiGwOFFnr();
        } else if (this.MzoOEjc4X) {
            iiGwOFFnr();
        }
        this.Bhmn1KIah = false;
        this.MzoOEjc4X = false;
        bZmnXN812 bzmnxn812 = this.J4Ux7ym32;
        if (bzmnxn812 != null) {
            YFPaMFEQT.kCA6Zs9sL(wviikk6mx, this.Eeka1udhb, bzmnxn812, this.tGV7Q6urW, null, null, 0, 56, null);
        }
        bZmnXN812 bzmnxn8122 = this.GPLPRo6go;
        if (bzmnxn8122 != null) {
            yEz1ivYb6 yez1ivyb6 = this.ilHKhw3Yw;
            if (this.PSTqBLTET || yez1ivyb6 == null) {
                yez1ivyb6 = new yEz1ivYb6(this.iiGwOFFnr, this.oon79WMrY, this.Puu3Rhg4F, this.yWvV4ePLl, 16);
                this.ilHKhw3Yw = yez1ivyb6;
                this.PSTqBLTET = false;
            }
            YFPaMFEQT.kCA6Zs9sL(wviikk6mx, this.Eeka1udhb, bzmnxn8122, this.kCA6Zs9sL, yez1ivyb6, null, 0, 48, null);
        }
    }

    public String toString() {
        return this.qVUwofr5s.toString();
    }
}
