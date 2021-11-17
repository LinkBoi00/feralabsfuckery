package con;

import java.util.List;
/* loaded from: classes.dex */
public final class tzF55gjpq {
    public final AU29aHa4X GPLPRo6go;
    public final GjhoS54Hf J4Ux7ym32;
    public final BFRsKhrQv Puu3Rhg4F;
    public final int dIocxURUo;
    public final int iiGwOFFnr;
    public final boolean kCA6Zs9sL;
    public final long oon79WMrY;
    public final joIJ4ANvK q3BipwRCk;
    public final List tGV7Q6urW;
    public final C2cgp32t9 yWvV4ePLl;

    public tzF55gjpq(joIJ4ANvK joij4anvk, GjhoS54Hf gjhoS54Hf, List list, int i, boolean z, int i2, AU29aHa4X aU29aHa4X, BFRsKhrQv bFRsKhrQv, C2cgp32t9 c2cgp32t9, long j, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = joij4anvk;
        this.J4Ux7ym32 = gjhoS54Hf;
        this.tGV7Q6urW = list;
        this.dIocxURUo = i;
        this.kCA6Zs9sL = z;
        this.iiGwOFFnr = i2;
        this.GPLPRo6go = aU29aHa4X;
        this.Puu3Rhg4F = bFRsKhrQv;
        this.yWvV4ePLl = c2cgp32t9;
        this.oon79WMrY = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzF55gjpq)) {
            return false;
        }
        tzF55gjpq tzf55gjpq = (tzF55gjpq) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, tzf55gjpq.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, tzf55gjpq.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, tzf55gjpq.tGV7Q6urW) && this.dIocxURUo == tzf55gjpq.dIocxURUo && this.kCA6Zs9sL == tzf55gjpq.kCA6Zs9sL && o117kTMoU.q3BipwRCk(this.iiGwOFFnr, tzf55gjpq.iiGwOFFnr) && anXlDk6fV.tGV7Q6urW(this.GPLPRo6go, tzf55gjpq.GPLPRo6go) && this.Puu3Rhg4F == tzf55gjpq.Puu3Rhg4F && anXlDk6fV.tGV7Q6urW(this.yWvV4ePLl, tzf55gjpq.yWvV4ePLl) && K5PjwoFCN.J4Ux7ym32(this.oon79WMrY, tzf55gjpq.oon79WMrY);
    }

    public int hashCode() {
        int q3BipwRCk = m7Lp4b5fo.q3BipwRCk(this.J4Ux7ym32, this.q3BipwRCk.hashCode() * 31, 31);
        int hashCode = Boolean.hashCode(this.kCA6Zs9sL);
        int hashCode2 = Integer.hashCode(this.iiGwOFFnr);
        int hashCode3 = this.GPLPRo6go.hashCode();
        int hashCode4 = this.Puu3Rhg4F.hashCode();
        int hashCode5 = this.yWvV4ePLl.hashCode();
        return Long.hashCode(this.oon79WMrY) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((((this.tGV7Q6urW.hashCode() + q3BipwRCk) * 31) + this.dIocxURUo) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextLayoutInput(text=");
        q3BipwRCk.append((Object) this.q3BipwRCk);
        q3BipwRCk.append(", style=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", placeholders=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", maxLines=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", softWrap=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", overflow=");
        int i = this.iiGwOFFnr;
        q3BipwRCk.append((Object) (o117kTMoU.q3BipwRCk(i, 1) ? "Clip" : o117kTMoU.q3BipwRCk(i, 2) ? "Ellipsis" : o117kTMoU.q3BipwRCk(i, 3) ? "Visible" : "Invalid"));
        q3BipwRCk.append(", density=");
        q3BipwRCk.append(this.GPLPRo6go);
        q3BipwRCk.append(", layoutDirection=");
        q3BipwRCk.append(this.Puu3Rhg4F);
        q3BipwRCk.append(", resourceLoader=");
        q3BipwRCk.append(this.yWvV4ePLl);
        q3BipwRCk.append(", constraints=");
        q3BipwRCk.append((Object) K5PjwoFCN.CBQ5d1kRq(this.oon79WMrY));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
