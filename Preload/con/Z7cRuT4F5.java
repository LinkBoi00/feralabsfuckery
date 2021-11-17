package con;
/* loaded from: classes.dex */
public final class Z7cRuT4F5 implements zLqhNBfpE {
    public final int J4Ux7ym32(pZznYi2iw pzznyi2iw, int i, int i2, int i3, boolean z, boolean z2) {
        long MzoOEjc4X = pzznyi2iw.MzoOEjc4X(i);
        int yWvV4ePLl = pzznyi2iw.Puu3Rhg4F(czCYotiRn.yWvV4ePLl(MzoOEjc4X)) == i2 ? czCYotiRn.yWvV4ePLl(MzoOEjc4X) : pzznyi2iw.CBQ5d1kRq(i2);
        int dIocxURUo = pzznyi2iw.Puu3Rhg4F(czCYotiRn.dIocxURUo(MzoOEjc4X)) == i2 ? czCYotiRn.dIocxURUo(MzoOEjc4X) : pzznyi2iw.iiGwOFFnr(i2, false);
        if (yWvV4ePLl == i3) {
            return dIocxURUo;
        }
        if (dIocxURUo == i3) {
            return yWvV4ePLl;
        }
        int i4 = (yWvV4ePLl + dIocxURUo) / 2;
        if (z ^ z2) {
            if (i <= i4) {
                return yWvV4ePLl;
            }
        } else if (i < i4) {
            return yWvV4ePLl;
        }
        return dIocxURUo;
    }

    @Override // con.zLqhNBfpE
    public long q3BipwRCk(pZznYi2iw pzznyi2iw, long j, int i, boolean z, czCYotiRn czcyotirn) {
        int i2;
        int i3;
        if (czcyotirn == null) {
            return EXzNbZoO0.q3BipwRCk(EXzNbZoO0.q3BipwRCk, pzznyi2iw, j, new nmKJZrF2V(pzznyi2iw, 2));
        }
        if (czCYotiRn.tGV7Q6urW(j)) {
            return syekKyXqd.vPSbyrYWX(czCYotiRn.yWvV4ePLl(j), r6NbD4wnj.vNtjxmzUM(pzznyi2iw.q3BipwRCk.q3BipwRCk), z, czCYotiRn.Puu3Rhg4F(czcyotirn.q3BipwRCk));
        }
        if (z) {
            i3 = tGV7Q6urW(pzznyi2iw, czCYotiRn.yWvV4ePLl(j), i, czCYotiRn.yWvV4ePLl(czcyotirn.q3BipwRCk), czCYotiRn.dIocxURUo(j), true, czCYotiRn.Puu3Rhg4F(j));
            i2 = czCYotiRn.dIocxURUo(j);
        } else {
            int yWvV4ePLl = czCYotiRn.yWvV4ePLl(j);
            i2 = tGV7Q6urW(pzznyi2iw, czCYotiRn.dIocxURUo(j), i, czCYotiRn.dIocxURUo(czcyotirn.q3BipwRCk), czCYotiRn.yWvV4ePLl(j), false, czCYotiRn.Puu3Rhg4F(j));
            i3 = yWvV4ePLl;
        }
        return ODug2UCW1.iiGwOFFnr(i3, i2);
    }

    public final int tGV7Q6urW(pZznYi2iw pzznyi2iw, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (i == i2) {
            return i3;
        }
        int Puu3Rhg4F = pzznyi2iw.Puu3Rhg4F(i);
        if (Puu3Rhg4F == pzznyi2iw.Puu3Rhg4F(i3)) {
            boolean z3 = false;
            if (!(i2 == -1 || (i != i2 && (!(z ^ z2) ? i > i2 : i < i2)))) {
                return i;
            }
            long MzoOEjc4X = pzznyi2iw.MzoOEjc4X(i3);
            if (i3 == czCYotiRn.yWvV4ePLl(MzoOEjc4X) || i3 == czCYotiRn.dIocxURUo(MzoOEjc4X)) {
                z3 = true;
            }
            if (!z3) {
                return i;
            }
        }
        return J4Ux7ym32(pzznyi2iw, i, Puu3Rhg4F, i4, z, z2);
    }
}
