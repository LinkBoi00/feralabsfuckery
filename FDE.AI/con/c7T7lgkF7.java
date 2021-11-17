package con;

import android.graphics.Canvas;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c7T7lgkF7 extends jQiuvL5NS implements knaaJ6t3r {
    public final float Bhmn1KIah;
    public final UBY2Inzw8 MzoOEjc4X;
    public final UBY2Inzw8 PSTqBLTET;
    public final BVIwKl3Ar ilHKhw3Yw;
    public final boolean kmSgne1rO;
    public final RNEcgN6dQ qVUwofr5s = u51fgFYkV.dIocxURUo(null, null, 2, null);
    public final RNEcgN6dQ Eeka1udhb = u51fgFYkV.dIocxURUo(Boolean.TRUE, null, 2, null);
    public long dXrmkklc8 = tbzY8QG6X.tGV7Q6urW;
    public int RG6kpfv3v = -1;
    public final gdEmqfwpT ixWaw2akD = new nwvyEZJPU(this);

    public c7T7lgkF7(boolean z, float f, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, BVIwKl3Ar bVIwKl3Ar, dnBSj5uJN dnbsj5ujn) {
        super(z, uBY2Inzw82);
        this.kmSgne1rO = z;
        this.Bhmn1KIah = f;
        this.PSTqBLTET = uBY2Inzw8;
        this.MzoOEjc4X = uBY2Inzw82;
        this.ilHKhw3Yw = bVIwKl3Ar;
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
    }

    @Override // con.jQiuvL5NS
    public void GPLPRo6go(UkUxUO2B6 ukUxUO2B6) {
        R30OeZHHv r30OeZHHv = (R30OeZHHv) ((prCJwNx2x) this.qVUwofr5s).getValue();
        if (r30OeZHHv != null) {
            r30OeZHHv.dIocxURUo();
        }
    }

    @Override // con.knaaJ6t3r
    public void J4Ux7ym32() {
    }

    public final void Puu3Rhg4F() {
        BVIwKl3Ar bVIwKl3Ar = this.ilHKhw3Yw;
        Objects.requireNonNull(bVIwKl3Ar);
        ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(null);
        R30OeZHHv r30OeZHHv = (R30OeZHHv) ((Map) bVIwKl3Ar.PSTqBLTET.CBQ5d1kRq).get(this);
        if (r30OeZHHv != null) {
            r30OeZHHv.tGV7Q6urW();
            bVIwKl3Ar.PSTqBLTET.vPSbyrYWX(this);
            bVIwKl3Ar.Bhmn1KIah.add(r30OeZHHv);
        }
    }

    @Override // con.toyRNCJyy
    public void dIocxURUo(HXRw132ar hXRw132ar) {
        this.dXrmkklc8 = hXRw132ar.q3BipwRCk();
        this.RG6kpfv3v = Float.isNaN(this.Bhmn1KIah) ? D3DEikrvb.Eeka1udhb(p7y47DSn9.q3BipwRCk(hXRw132ar, this.kmSgne1rO, hXRw132ar.q3BipwRCk())) : hXRw132ar.iiGwOFFnr(this.Bhmn1KIah);
        long j = ((bO2dbmrf7) this.PSTqBLTET.getValue()).q3BipwRCk;
        float f = ((hxTd0j6Xx) this.MzoOEjc4X.getValue()).dIocxURUo;
        hXRw132ar.J4Ux7ym32();
        iiGwOFFnr(hXRw132ar, this.Bhmn1KIah, j);
        SI0VpKubr q3BipwRCk = hXRw132ar.CBQ5d1kRq.kmSgne1rO.q3BipwRCk();
        ((Boolean) ((prCJwNx2x) this.Eeka1udhb).getValue()).booleanValue();
        R30OeZHHv r30OeZHHv = (R30OeZHHv) ((prCJwNx2x) this.qVUwofr5s).getValue();
        if (r30OeZHHv != null) {
            r30OeZHHv.kCA6Zs9sL(hXRw132ar.q3BipwRCk(), this.RG6kpfv3v, j, f);
            Canvas canvas = RvtysjeZn.q3BipwRCk;
            r30OeZHHv.draw(((YSo0hTREC) q3BipwRCk).q3BipwRCk);
        }
    }

    @Override // con.jQiuvL5NS
    public void kCA6Zs9sL(UkUxUO2B6 ukUxUO2B6, oQkvjGXIr oqkvjgxir) {
        BVIwKl3Ar bVIwKl3Ar = this.ilHKhw3Yw;
        R30OeZHHv r30OeZHHv = (R30OeZHHv) ((Map) bVIwKl3Ar.PSTqBLTET.CBQ5d1kRq).get(this);
        if (r30OeZHHv == null) {
            List list = bVIwKl3Ar.Bhmn1KIah;
            r30OeZHHv = (R30OeZHHv) (list.isEmpty() ? null : list.remove(0));
            if (r30OeZHHv == null) {
                if (bVIwKl3Ar.MzoOEjc4X > idpM54xlp.CBQ5d1kRq(bVIwKl3Ar.kmSgne1rO)) {
                    r30OeZHHv = new R30OeZHHv(bVIwKl3Ar.getContext());
                    bVIwKl3Ar.addView(r30OeZHHv);
                    bVIwKl3Ar.kmSgne1rO.add(r30OeZHHv);
                } else {
                    r30OeZHHv = (R30OeZHHv) bVIwKl3Ar.kmSgne1rO.get(bVIwKl3Ar.MzoOEjc4X);
                    c7T7lgkF7 c7t7lgkf7 = (c7T7lgkF7) ((Map) bVIwKl3Ar.PSTqBLTET.kmSgne1rO).get(r30OeZHHv);
                    if (c7t7lgkf7 != null) {
                        ((prCJwNx2x) c7t7lgkf7.qVUwofr5s).CBQ5d1kRq(null);
                        bVIwKl3Ar.PSTqBLTET.vPSbyrYWX(c7t7lgkf7);
                        r30OeZHHv.tGV7Q6urW();
                    }
                }
                int i = bVIwKl3Ar.MzoOEjc4X;
                if (i < bVIwKl3Ar.CBQ5d1kRq - 1) {
                    bVIwKl3Ar.MzoOEjc4X = i + 1;
                } else {
                    bVIwKl3Ar.MzoOEjc4X = 0;
                }
            }
            PlegqbMSA plegqbMSA = bVIwKl3Ar.PSTqBLTET;
            ((Map) plegqbMSA.CBQ5d1kRq).put(this, r30OeZHHv);
            ((Map) plegqbMSA.kmSgne1rO).put(r30OeZHHv, this);
        }
        r30OeZHHv.J4Ux7ym32(ukUxUO2B6, this.kmSgne1rO, this.dXrmkklc8, this.RG6kpfv3v, ((bO2dbmrf7) this.PSTqBLTET.getValue()).q3BipwRCk, ((hxTd0j6Xx) this.MzoOEjc4X.getValue()).dIocxURUo, this.ixWaw2akD);
        ((prCJwNx2x) this.qVUwofr5s).CBQ5d1kRq(r30OeZHHv);
    }

    @Override // con.knaaJ6t3r
    public void q3BipwRCk() {
        Puu3Rhg4F();
    }

    @Override // con.knaaJ6t3r
    public void tGV7Q6urW() {
        Puu3Rhg4F();
    }
}
