package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class fTuF5tuYZ implements OA9bkVDuZ {
    public int GPLPRo6go;
    public yUQFqpqgq dIocxURUo;
    public int iiGwOFFnr;
    public OA9bkVDuZ q3BipwRCk = null;
    public boolean J4Ux7ym32 = false;
    public boolean tGV7Q6urW = false;
    public T5hg5V2qV kCA6Zs9sL = T5hg5V2qV.UNKNOWN;
    public int Puu3Rhg4F = 1;
    public kI6UYBIBf yWvV4ePLl = null;
    public boolean oon79WMrY = false;
    public List vPSbyrYWX = new ArrayList();
    public List CBQ5d1kRq = new ArrayList();

    public fTuF5tuYZ(yUQFqpqgq yuqfqpqgq) {
        this.dIocxURUo = yuqfqpqgq;
    }

    public void J4Ux7ym32() {
        this.CBQ5d1kRq.clear();
        this.vPSbyrYWX.clear();
        this.oon79WMrY = false;
        this.GPLPRo6go = 0;
        this.tGV7Q6urW = false;
        this.J4Ux7ym32 = false;
    }

    @Override // con.OA9bkVDuZ
    public void q3BipwRCk(OA9bkVDuZ oA9bkVDuZ) {
        for (fTuF5tuYZ ftuf5tuyz : this.CBQ5d1kRq) {
            if (!ftuf5tuyz.oon79WMrY) {
                return;
            }
        }
        this.tGV7Q6urW = true;
        OA9bkVDuZ oA9bkVDuZ2 = this.q3BipwRCk;
        if (oA9bkVDuZ2 != null) {
            oA9bkVDuZ2.q3BipwRCk(this);
        }
        if (this.J4Ux7ym32) {
            this.dIocxURUo.q3BipwRCk(this);
            return;
        }
        fTuF5tuYZ ftuf5tuyz2 = null;
        int i = 0;
        for (fTuF5tuYZ ftuf5tuyz3 : this.CBQ5d1kRq) {
            if (!(ftuf5tuyz3 instanceof kI6UYBIBf)) {
                i++;
                ftuf5tuyz2 = ftuf5tuyz3;
            }
        }
        if (ftuf5tuyz2 != null && i == 1 && ftuf5tuyz2.oon79WMrY) {
            kI6UYBIBf ki6uybibf = this.yWvV4ePLl;
            if (ki6uybibf != null) {
                if (ki6uybibf.oon79WMrY) {
                    this.iiGwOFFnr = this.Puu3Rhg4F * ki6uybibf.GPLPRo6go;
                } else {
                    return;
                }
            }
            tGV7Q6urW(ftuf5tuyz2.GPLPRo6go + this.iiGwOFFnr);
        }
        OA9bkVDuZ oA9bkVDuZ3 = this.q3BipwRCk;
        if (oA9bkVDuZ3 != null) {
            oA9bkVDuZ3.q3BipwRCk(this);
        }
    }

    public void tGV7Q6urW(int i) {
        if (!this.oon79WMrY) {
            this.oon79WMrY = true;
            this.GPLPRo6go = i;
            for (OA9bkVDuZ oA9bkVDuZ : this.vPSbyrYWX) {
                oA9bkVDuZ.q3BipwRCk(oA9bkVDuZ);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dIocxURUo.J4Ux7ym32.M66hQ219i);
        sb.append(":");
        sb.append(this.kCA6Zs9sL);
        sb.append("(");
        sb.append(this.oon79WMrY ? Integer.valueOf(this.GPLPRo6go) : "unresolved");
        sb.append(") <t=");
        sb.append(this.CBQ5d1kRq.size());
        sb.append(":d=");
        sb.append(this.vPSbyrYWX.size());
        sb.append(">");
        return sb.toString();
    }
}
