package con;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pZznYi2iw {
    public final orkFM0MAe J4Ux7ym32;
    public final float dIocxURUo;
    public final List iiGwOFFnr;
    public final float kCA6Zs9sL;
    public final tzF55gjpq q3BipwRCk;
    public final long tGV7Q6urW;

    public pZznYi2iw(tzF55gjpq tzf55gjpq, orkFM0MAe orkfm0mae, long j, dnBSj5uJN dnbsj5ujn) {
        float f;
        this.q3BipwRCk = tzf55gjpq;
        this.J4Ux7ym32 = orkfm0mae;
        this.tGV7Q6urW = j;
        float f2 = 0.0f;
        if (orkfm0mae.Puu3Rhg4F.isEmpty()) {
            f = 0.0f;
        } else {
            f = ((kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(0)).q3BipwRCk.dIocxURUo.q3BipwRCk(0);
        }
        this.dIocxURUo = f;
        if (!orkfm0mae.Puu3Rhg4F.isEmpty()) {
            kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) wkFJfVmcv.TyB1UUd72(orkfm0mae.Puu3Rhg4F);
            IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
            int i = iosOyUQuh.J4Ux7ym32;
            YK9K1XOO8 yk9k1xoo8 = iosOyUQuh.dIocxURUo;
            int i2 = yk9k1xoo8.tGV7Q6urW;
            f2 = (i < i2 ? yk9k1xoo8.q3BipwRCk(i - 1) : yk9k1xoo8.q3BipwRCk(i2 - 1)) + kuiy8woq5.iiGwOFFnr;
        }
        this.kCA6Zs9sL = f2;
        this.iiGwOFFnr = orkfm0mae.GPLPRo6go;
    }

    public static /* synthetic */ int GPLPRo6go(pZznYi2iw pzznyi2iw, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return pzznyi2iw.iiGwOFFnr(i, z);
    }

    public final int Bhmn1KIah(long j) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        Objects.requireNonNull(orkfm0mae);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(bRgfgYIQX.dIocxURUo(j) <= 0.0f ? 0 : bRgfgYIQX.dIocxURUo(j) >= orkfm0mae.kCA6Zs9sL ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.Puu3Rhg4F(orkfm0mae.Puu3Rhg4F, bRgfgYIQX.dIocxURUo(j)));
        int i = kuiy8woq5.tGV7Q6urW;
        int i2 = kuiy8woq5.J4Ux7ym32;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        long dIocxURUo = ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j) - kuiy8woq5.iiGwOFFnr);
        return iosOyUQuh.dIocxURUo.J4Ux7ym32.getOffsetForHorizontal(iosOyUQuh.dIocxURUo.J4Ux7ym32.getLineForVertical((int) bRgfgYIQX.dIocxURUo(dIocxURUo)), bRgfgYIQX.tGV7Q6urW(dIocxURUo)) + kuiy8woq5.J4Ux7ym32;
    }

    public final int CBQ5d1kRq(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.dIocxURUo(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.GPLPRo6go(orkfm0mae.Puu3Rhg4F, i));
        return kuiy8woq5.q3BipwRCk.dIocxURUo.J4Ux7ym32.getLineStart(i - kuiy8woq5.dIocxURUo) + kuiy8woq5.J4Ux7ym32;
    }

    public final bzmJZsHMu J4Ux7ym32(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        Objects.requireNonNull(orkfm0mae);
        boolean z = false;
        if (i >= 0 && i <= orkfm0mae.q3BipwRCk.q3BipwRCk.CBQ5d1kRq.length() - 1) {
            z = true;
        }
        if (z) {
            kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.iiGwOFFnr(orkfm0mae.Puu3Rhg4F, i));
            IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
            int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(i, kuiy8woq5.J4Ux7ym32, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32;
            float primaryHorizontal = iosOyUQuh.dIocxURUo.J4Ux7ym32.getPrimaryHorizontal(kCA6Zs9sL);
            float iiGwOFFnr = iosOyUQuh.dIocxURUo.iiGwOFFnr(kCA6Zs9sL + 1);
            int lineForOffset = iosOyUQuh.dIocxURUo.J4Ux7ym32.getLineForOffset(kCA6Zs9sL);
            return new bzmJZsHMu(primaryHorizontal, iosOyUQuh.dIocxURUo.kCA6Zs9sL(lineForOffset), iiGwOFFnr, iosOyUQuh.dIocxURUo.J4Ux7ym32(lineForOffset)).GPLPRo6go(ODug2UCW1.dIocxURUo(0.0f, kuiy8woq5.iiGwOFFnr));
        }
        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("offset(", i, ") is out of bounds [0, ");
        q3BipwRCk.append(orkfm0mae.q3BipwRCk.q3BipwRCk.length());
        q3BipwRCk.append(')');
        throw new IllegalArgumentException(q3BipwRCk.toString().toString());
    }

    public final long MzoOEjc4X(int i) {
        int i2;
        int i3;
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.tGV7Q6urW(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(i == orkfm0mae.q3BipwRCk.q3BipwRCk.length() ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.iiGwOFFnr(orkfm0mae.Puu3Rhg4F, i));
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(i, kuiy8woq5.J4Ux7ym32, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32;
        sY2yP4rM4 sy2yp4rm4 = (sY2yP4rM4) iosOyUQuh.iiGwOFFnr.getValue();
        jcIEErzDw jcieerzdw = sy2yp4rm4.q3BipwRCk;
        jcieerzdw.q3BipwRCk(kCA6Zs9sL);
        boolean kCA6Zs9sL2 = sy2yp4rm4.q3BipwRCk.kCA6Zs9sL(jcieerzdw.dIocxURUo.preceding(kCA6Zs9sL));
        jcIEErzDw jcieerzdw2 = sy2yp4rm4.q3BipwRCk;
        if (kCA6Zs9sL2) {
            jcieerzdw2.q3BipwRCk(kCA6Zs9sL);
            i2 = kCA6Zs9sL;
            while (i2 != -1) {
                if (jcieerzdw2.kCA6Zs9sL(i2) && !jcieerzdw2.tGV7Q6urW(i2)) {
                    break;
                }
                jcieerzdw2.q3BipwRCk(i2);
                i2 = jcieerzdw2.dIocxURUo.preceding(i2);
            }
        } else {
            jcieerzdw2.q3BipwRCk(kCA6Zs9sL);
            if (jcieerzdw2.dIocxURUo(kCA6Zs9sL)) {
                if (jcieerzdw2.dIocxURUo.isBoundary(kCA6Zs9sL) && !jcieerzdw2.J4Ux7ym32(kCA6Zs9sL)) {
                    i2 = kCA6Zs9sL;
                }
                i2 = jcieerzdw2.dIocxURUo.preceding(kCA6Zs9sL);
            } else {
                if (!jcieerzdw2.J4Ux7ym32(kCA6Zs9sL)) {
                    i2 = -1;
                }
                i2 = jcieerzdw2.dIocxURUo.preceding(kCA6Zs9sL);
            }
        }
        if (i2 == -1) {
            i2 = kCA6Zs9sL;
        }
        sY2yP4rM4 sy2yp4rm42 = (sY2yP4rM4) iosOyUQuh.iiGwOFFnr.getValue();
        jcIEErzDw jcieerzdw3 = sy2yp4rm42.q3BipwRCk;
        jcieerzdw3.q3BipwRCk(kCA6Zs9sL);
        boolean tGV7Q6urW = sy2yp4rm42.q3BipwRCk.tGV7Q6urW(jcieerzdw3.dIocxURUo.following(kCA6Zs9sL));
        jcIEErzDw jcieerzdw4 = sy2yp4rm42.q3BipwRCk;
        if (tGV7Q6urW) {
            jcieerzdw4.q3BipwRCk(kCA6Zs9sL);
            i3 = kCA6Zs9sL;
            while (i3 != -1) {
                if (!jcieerzdw4.kCA6Zs9sL(i3) && jcieerzdw4.tGV7Q6urW(i3)) {
                    break;
                }
                jcieerzdw4.q3BipwRCk(i3);
                i3 = jcieerzdw4.dIocxURUo.following(i3);
            }
        } else {
            jcieerzdw4.q3BipwRCk(kCA6Zs9sL);
            if (jcieerzdw4.J4Ux7ym32(kCA6Zs9sL)) {
                if (jcieerzdw4.dIocxURUo.isBoundary(kCA6Zs9sL) && !jcieerzdw4.dIocxURUo(kCA6Zs9sL)) {
                    i3 = kCA6Zs9sL;
                }
                i3 = jcieerzdw4.dIocxURUo.following(kCA6Zs9sL);
            } else {
                if (!jcieerzdw4.dIocxURUo(kCA6Zs9sL)) {
                    i3 = -1;
                }
                i3 = jcieerzdw4.dIocxURUo.following(kCA6Zs9sL);
            }
        }
        if (i3 != -1) {
            kCA6Zs9sL = i3;
        }
        long iiGwOFFnr = ODug2UCW1.iiGwOFFnr(i2, kCA6Zs9sL);
        return ODug2UCW1.iiGwOFFnr(czCYotiRn.yWvV4ePLl(iiGwOFFnr) + kuiy8woq5.J4Ux7ym32, czCYotiRn.dIocxURUo(iiGwOFFnr) + kuiy8woq5.J4Ux7ym32);
    }

    public final sL9xhCFIS PSTqBLTET(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.tGV7Q6urW(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(i == orkfm0mae.q3BipwRCk.q3BipwRCk.length() ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.iiGwOFFnr(orkfm0mae.Puu3Rhg4F, i));
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        return iosOyUQuh.dIocxURUo.J4Ux7ym32.getParagraphDirection(iosOyUQuh.dIocxURUo.J4Ux7ym32.getLineForOffset(cT9gik1zL.kCA6Zs9sL(i, kuiy8woq5.J4Ux7ym32, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32)) == 1 ? sL9xhCFIS.Ltr : sL9xhCFIS.Rtl;
    }

    public final int Puu3Rhg4F(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.tGV7Q6urW(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(i == orkfm0mae.q3BipwRCk.q3BipwRCk.length() ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.iiGwOFFnr(orkfm0mae.Puu3Rhg4F, i));
        return kuiy8woq5.q3BipwRCk.dIocxURUo.J4Ux7ym32.getLineForOffset(cT9gik1zL.kCA6Zs9sL(i, kuiy8woq5.J4Ux7ym32, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32) + kuiy8woq5.dIocxURUo;
    }

    public final boolean dIocxURUo() {
        return ((float) YWiUMZOtw.tGV7Q6urW(this.tGV7Q6urW)) < this.J4Ux7ym32.dIocxURUo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pZznYi2iw)) {
            return false;
        }
        pZznYi2iw pzznyi2iw = (pZznYi2iw) obj;
        if (!anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, pzznyi2iw.q3BipwRCk) || !anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, pzznyi2iw.J4Ux7ym32) || !YWiUMZOtw.q3BipwRCk(this.tGV7Q6urW, pzznyi2iw.tGV7Q6urW)) {
            return false;
        }
        if (!(this.dIocxURUo == pzznyi2iw.dIocxURUo)) {
            return false;
        }
        return ((this.kCA6Zs9sL > pzznyi2iw.kCA6Zs9sL ? 1 : (this.kCA6Zs9sL == pzznyi2iw.kCA6Zs9sL ? 0 : -1)) == 0) && anXlDk6fV.tGV7Q6urW(this.iiGwOFFnr, pzznyi2iw.iiGwOFFnr);
    }

    public int hashCode() {
        int hashCode = this.J4Ux7ym32.hashCode();
        int hashCode2 = Long.hashCode(this.tGV7Q6urW);
        return this.iiGwOFFnr.hashCode() + gXNsYvZus.q3BipwRCk(this.kCA6Zs9sL, gXNsYvZus.q3BipwRCk(this.dIocxURUo, (hashCode2 + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final int iiGwOFFnr(int i, boolean z) {
        int i2;
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.dIocxURUo(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.GPLPRo6go(orkfm0mae.Puu3Rhg4F, i));
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        int i3 = i - kuiy8woq5.dIocxURUo;
        if (z) {
            YK9K1XOO8 yk9k1xoo8 = iosOyUQuh.dIocxURUo;
            if (yk9k1xoo8.J4Ux7ym32.getEllipsisStart(i3) == 0) {
                i2 = yk9k1xoo8.J4Ux7ym32.getLineVisibleEnd(i3);
            } else {
                i2 = yk9k1xoo8.J4Ux7ym32.getEllipsisStart(i3) + yk9k1xoo8.J4Ux7ym32.getLineStart(i3);
            }
        } else {
            i2 = iosOyUQuh.dIocxURUo.tGV7Q6urW(i3);
        }
        return i2 + kuiy8woq5.J4Ux7ym32;
    }

    public final float kCA6Zs9sL(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.dIocxURUo(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.GPLPRo6go(orkfm0mae.Puu3Rhg4F, i));
        return ((float) kuiy8woq5.q3BipwRCk.dIocxURUo.J4Ux7ym32.getLineBottom(i - kuiy8woq5.dIocxURUo)) + kuiy8woq5.iiGwOFFnr;
    }

    public final float kmSgne1rO(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.dIocxURUo(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.GPLPRo6go(orkfm0mae.Puu3Rhg4F, i));
        return ((float) kuiy8woq5.q3BipwRCk.dIocxURUo.J4Ux7ym32.getLineTop(i - kuiy8woq5.dIocxURUo)) + kuiy8woq5.iiGwOFFnr;
    }

    public final float oon79WMrY(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.dIocxURUo(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.GPLPRo6go(orkfm0mae.Puu3Rhg4F, i));
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        return iosOyUQuh.dIocxURUo.J4Ux7ym32.getLineLeft(i - kuiy8woq5.dIocxURUo);
    }

    public final sL9xhCFIS q3BipwRCk(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.tGV7Q6urW(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(i == orkfm0mae.q3BipwRCk.q3BipwRCk.length() ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.iiGwOFFnr(orkfm0mae.Puu3Rhg4F, i));
        return kuiy8woq5.q3BipwRCk.dIocxURUo.J4Ux7ym32.isRtlCharAt(cT9gik1zL.kCA6Zs9sL(i, kuiy8woq5.J4Ux7ym32, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32) ? sL9xhCFIS.Rtl : sL9xhCFIS.Ltr;
    }

    public final bzmJZsHMu tGV7Q6urW(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.tGV7Q6urW(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(i == orkfm0mae.q3BipwRCk.q3BipwRCk.length() ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.iiGwOFFnr(orkfm0mae.Puu3Rhg4F, i));
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(i, kuiy8woq5.J4Ux7ym32, kuiy8woq5.tGV7Q6urW) - kuiy8woq5.J4Ux7ym32;
        Objects.requireNonNull(iosOyUQuh);
        boolean z = false;
        if (kCA6Zs9sL >= 0 && kCA6Zs9sL <= iosOyUQuh.q3BipwRCk.Puu3Rhg4F.length()) {
            z = true;
        }
        if (z) {
            float primaryHorizontal = iosOyUQuh.dIocxURUo.J4Ux7ym32.getPrimaryHorizontal(kCA6Zs9sL);
            int lineForOffset = iosOyUQuh.dIocxURUo.J4Ux7ym32.getLineForOffset(kCA6Zs9sL);
            return new bzmJZsHMu(primaryHorizontal, iosOyUQuh.dIocxURUo.kCA6Zs9sL(lineForOffset), primaryHorizontal, iosOyUQuh.dIocxURUo.J4Ux7ym32(lineForOffset)).GPLPRo6go(ODug2UCW1.dIocxURUo(0.0f, kuiy8woq5.iiGwOFFnr));
        }
        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("offset(", kCA6Zs9sL, ") is out of bounds (0,");
        q3BipwRCk.append(iosOyUQuh.q3BipwRCk.Puu3Rhg4F.length());
        throw new AssertionError(q3BipwRCk.toString());
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextLayoutResult(layoutInput=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", multiParagraph=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", size=");
        q3BipwRCk.append((Object) YWiUMZOtw.dIocxURUo(this.tGV7Q6urW));
        q3BipwRCk.append(", firstBaseline=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", lastBaseline=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", placeholderRects=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    public final float vPSbyrYWX(int i) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        orkfm0mae.dIocxURUo(i);
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(pA5wCkne4.GPLPRo6go(orkfm0mae.Puu3Rhg4F, i));
        IosOyUQuh iosOyUQuh = kuiy8woq5.q3BipwRCk;
        return iosOyUQuh.dIocxURUo.J4Ux7ym32.getLineRight(i - kuiy8woq5.dIocxURUo);
    }

    public final int yWvV4ePLl(float f) {
        orkFM0MAe orkfm0mae = this.J4Ux7ym32;
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) orkfm0mae.Puu3Rhg4F.get(f <= 0.0f ? 0 : f >= orkfm0mae.kCA6Zs9sL ? idpM54xlp.CBQ5d1kRq(orkfm0mae.Puu3Rhg4F) : pA5wCkne4.Puu3Rhg4F(orkfm0mae.Puu3Rhg4F, f));
        int i = kuiy8woq5.tGV7Q6urW;
        int i2 = kuiy8woq5.J4Ux7ym32;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        return kuiy8woq5.q3BipwRCk.dIocxURUo.J4Ux7ym32.getLineForVertical((int) (f - kuiy8woq5.iiGwOFFnr)) + kuiy8woq5.dIocxURUo;
    }
}
