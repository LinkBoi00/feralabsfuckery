package con;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class qSqursFWx implements jK6SuKeQs {
    public final List q3BipwRCk;

    public qSqursFWx(jOCYbBWA4 jocybbwa4, float f, float f2) {
        G8ebKyy85 yWvV4ePLl = cT9gik1zL.yWvV4ePLl(0, jocybbwa4.J4Ux7ym32());
        ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(yWvV4ePLl, 10));
        Iterator it = yWvV4ePLl.iterator();
        while (true) {
            hbC5oTdpL hbc5otdpl = (hbC5oTdpL) it;
            if (hbc5otdpl.kmSgne1rO) {
                arrayList.add(new zECAWzpPF(f, f2, jocybbwa4.q3BipwRCk(hbc5otdpl.J4Ux7ym32())));
            } else {
                this.q3BipwRCk = arrayList;
                return;
            }
        }
    }

    @Override // con.jK6SuKeQs
    public e61xwX1kt get(int i) {
        return (zECAWzpPF) this.q3BipwRCk.get(i);
    }
}
