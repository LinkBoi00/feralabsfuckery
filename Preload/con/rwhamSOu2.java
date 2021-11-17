package con;

import con.XicO3QTQd;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class rwhamSOu2 extends ZmYjNS8wW implements Map {
    public XicO3QTQd Eeka1udhb;

    public rwhamSOu2() {
    }

    public rwhamSOu2(int i) {
        super(i);
    }

    public rwhamSOu2(ZmYjNS8wW zmYjNS8wW) {
        if (zmYjNS8wW != null) {
            int i = zmYjNS8wW.Bhmn1KIah;
            J4Ux7ym32(this.Bhmn1KIah + i);
            if (this.Bhmn1KIah != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(zmYjNS8wW.Puu3Rhg4F(i2), zmYjNS8wW.vPSbyrYWX(i2));
                }
            } else if (i > 0) {
                System.arraycopy(zmYjNS8wW.CBQ5d1kRq, 0, this.CBQ5d1kRq, 0, i);
                System.arraycopy(zmYjNS8wW.kmSgne1rO, 0, this.kmSgne1rO, 0, i << 1);
                this.Bhmn1KIah = i;
            }
        }
    }

    public final XicO3QTQd CBQ5d1kRq() {
        if (this.Eeka1udhb == null) {
            this.Eeka1udhb = new alHS0cjlg(this);
        }
        return this.Eeka1udhb;
    }

    @Override // java.util.Map
    public Set entrySet() {
        XicO3QTQd CBQ5d1kRq = CBQ5d1kRq();
        if (CBQ5d1kRq.q3BipwRCk == null) {
            CBQ5d1kRq.q3BipwRCk = new XicO3QTQd.mhl5lIdbQ();
        }
        return CBQ5d1kRq.q3BipwRCk;
    }

    @Override // java.util.Map
    public Set keySet() {
        XicO3QTQd CBQ5d1kRq = CBQ5d1kRq();
        if (CBQ5d1kRq.J4Ux7ym32 == null) {
            CBQ5d1kRq.J4Ux7ym32 = new XicO3QTQd.aXI58Y1kr();
        }
        return CBQ5d1kRq.J4Ux7ym32;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        J4Ux7ym32(map.size() + this.Bhmn1KIah);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        XicO3QTQd CBQ5d1kRq = CBQ5d1kRq();
        if (CBQ5d1kRq.tGV7Q6urW == null) {
            CBQ5d1kRq.tGV7Q6urW = new XicO3QTQd.s7MlVynBG();
        }
        return CBQ5d1kRq.tGV7Q6urW;
    }
}
