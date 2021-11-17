package con;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
/* loaded from: classes.dex */
public final class qh9TNAzpX extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ T3vFETFEI Bhmn1KIah;
    public final /* synthetic */ fJQzHH3Lh Eeka1udhb;
    public final /* synthetic */ boolean MzoOEjc4X;
    public final /* synthetic */ njjwS3RZT PSTqBLTET;
    public final /* synthetic */ float RG6kpfv3v;
    public final /* synthetic */ kkcQgCx5G dXrmkklc8;
    public final /* synthetic */ RqP4RtdHY ilHKhw3Yw;
    public final /* synthetic */ Map kmSgne1rO;
    public final /* synthetic */ boolean qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh9TNAzpX(Map map, T3vFETFEI t3vFETFEI, njjwS3RZT njjws3rzt, boolean z, RqP4RtdHY rqP4RtdHY, boolean z2, fJQzHH3Lh fjqzhh3lh, kkcQgCx5G kkcqgcx5g, float f) {
        super(3);
        this.kmSgne1rO = map;
        this.Bhmn1KIah = t3vFETFEI;
        this.PSTqBLTET = njjws3rzt;
        this.MzoOEjc4X = z;
        this.ilHKhw3Yw = rqP4RtdHY;
        this.qVUwofr5s = z2;
        this.Eeka1udhb = fjqzhh3lh;
        this.dXrmkklc8 = kkcqgcx5g;
        this.RG6kpfv3v = f;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        LinkedHashSet linkedHashSet;
        BgIsSUB3d bgIsSUB3d = (BgIsSUB3d) obj;
        ((Number) obj3).intValue();
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) ((rJ0s9PfCL) obj2);
        wpxpbwg1j.zHl31GGXU(1735465469);
        Object obj4 = G7WvUK4mQ.q3BipwRCk;
        boolean z = true;
        if (!this.kmSgne1rO.isEmpty()) {
            Collection values = this.kmSgne1rO.values();
            if (values instanceof Collection) {
                linkedHashSet = new LinkedHashSet(values);
            } else {
                linkedHashSet = new LinkedHashSet();
                wkFJfVmcv.ziwPzaoF3(values, linkedHashSet);
            }
            if (wkFJfVmcv.IzM1cD9ly(linkedHashSet).size() != this.kmSgne1rO.size()) {
                z = false;
            }
            if (z) {
                AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                T3vFETFEI t3vFETFEI = this.Bhmn1KIah;
                Map map = this.kmSgne1rO;
                if (t3vFETFEI.tGV7Q6urW().isEmpty()) {
                    Float vPSbyrYWX = xpuSUT7Gh.vPSbyrYWX(map, t3vFETFEI.dIocxURUo());
                    if (vPSbyrYWX != null) {
                        ((prCJwNx2x) t3vFETFEI.kCA6Zs9sL).CBQ5d1kRq(vPSbyrYWX);
                        ((prCJwNx2x) t3vFETFEI.GPLPRo6go).CBQ5d1kRq(vPSbyrYWX);
                    } else {
                        throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                    }
                }
                Map map2 = this.kmSgne1rO;
                T3vFETFEI t3vFETFEI2 = this.Bhmn1KIah;
                gLDxq5bwv.tGV7Q6urW(map2, t3vFETFEI2, new bURVyXJhR(t3vFETFEI2, map2, this.Eeka1udhb, aU29aHa4X, this.dXrmkklc8, this.RG6kpfv3v, null), wpxpbwg1j);
                int i = BgIsSUB3d.Puu3Rhg4F;
                H11ySchUh h11ySchUh = H11ySchUh.CBQ5d1kRq;
                boolean booleanValue = ((Boolean) ((prCJwNx2x) this.Bhmn1KIah.dIocxURUo).getValue()).booleanValue();
                T3vFETFEI t3vFETFEI3 = this.Bhmn1KIah;
                EhLn833I5 ehLn833I5 = t3vFETFEI3.MzoOEjc4X;
                BgIsSUB3d RG6kpfv3v = p62TZmTyO.RG6kpfv3v(h11ySchUh, new MAZDnzQe5(ehLn833I5), DlhjQ2PrY.WaUP0CF08, this.PSTqBLTET, this.MzoOEjc4X, this.ilHKhw3Yw, new la9HfqtRv(booleanValue), new AizLTQ8JR(null), new rqP0HFtxz(t3vFETFEI3, null), this.qVUwofr5s);
                wpxpbwg1j.ilHKhw3Yw(false);
                return RG6kpfv3v;
            }
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        throw new IllegalArgumentException("You must have at least one anchor.".toString());
    }
}
