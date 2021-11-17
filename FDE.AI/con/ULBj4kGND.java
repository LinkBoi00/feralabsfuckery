package con;

import java.util.Map;
/* loaded from: classes.dex */
public abstract class ULBj4kGND extends LBkrQilnp {
    public final wjjWl3mHt J4Ux7ym32;
    public final wjjWl3mHt q3BipwRCk;

    public ULBj4kGND(wjjWl3mHt wjjwl3mht, wjjWl3mHt wjjwl3mht2, dnBSj5uJN dnbsj5ujn) {
        super(null);
        this.q3BipwRCk = wjjwl3mht;
        this.J4Ux7ym32 = wjjwl3mht2;
    }

    @Override // con.LBkrQilnp
    public void GPLPRo6go(C8ZZcTzJg c8ZZcTzJg, Object obj, int i, int i2) {
        Map map = (Map) obj;
        if (i2 >= 0) {
            DoyxeIIWl Puu3Rhg4F = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, i2 * 2), 2);
            int i3 = Puu3Rhg4F.CBQ5d1kRq;
            int i4 = Puu3Rhg4F.kmSgne1rO;
            int i5 = Puu3Rhg4F.Bhmn1KIah;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    int i6 = i3 + i5;
                    Puu3Rhg4F(c8ZZcTzJg, i + i3, map, false);
                    if (i3 != i4) {
                        i3 = i6;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public abstract W39e6bnPN q3BipwRCk();

    /* renamed from: vPSbyrYWX */
    public final void Puu3Rhg4F(C8ZZcTzJg c8ZZcTzJg, int i, Map map, boolean z) {
        int i2;
        Object obj = c8ZZcTzJg.cAwN510t2(q3BipwRCk(), i, this.q3BipwRCk, null);
        boolean z2 = true;
        if (z) {
            i2 = c8ZZcTzJg.oon79WMrY(q3BipwRCk());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(mbAen3Jsn.q3BipwRCk("Value must follow key in a map, index for key: ", i, ", returned index for value: ", i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        map.put(obj, (!map.containsKey(obj) || (this.J4Ux7ym32.q3BipwRCk().yWvV4ePLl() instanceof wffjJUfc9)) ? c8ZZcTzJg.cAwN510t2(q3BipwRCk(), i2, this.J4Ux7ym32, null) : c8ZZcTzJg.cAwN510t2(q3BipwRCk(), i2, this.J4Ux7ym32, s0tSbdszx.nlGCs0NZs(map, obj)));
    }
}
