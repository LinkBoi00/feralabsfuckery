package con;
/* loaded from: classes.dex */
public final class y4A3w2Ci6 {
    public final BaMMm5shD J4Ux7ym32;
    public final r9U1gbsBL dIocxURUo;
    public final gsUpNChDr q3BipwRCk;
    public final lTg88Bp1o tGV7Q6urW;

    public y4A3w2Ci6(gsUpNChDr gsupnchdr, BaMMm5shD baMMm5shD, lTg88Bp1o ltg88bp1o, r9U1gbsBL r9u1gbsbl) {
        this.q3BipwRCk = gsupnchdr;
        this.J4Ux7ym32 = baMMm5shD;
        this.tGV7Q6urW = ltg88bp1o;
        this.dIocxURUo = r9u1gbsbl;
    }

    public /* synthetic */ y4A3w2Ci6(gsUpNChDr gsupnchdr, BaMMm5shD baMMm5shD, lTg88Bp1o ltg88bp1o, r9U1gbsBL r9u1gbsbl, int i) {
        this((i & 1) != 0 ? null : gsupnchdr, (i & 2) != 0 ? null : baMMm5shD, (i & 4) != 0 ? null : ltg88bp1o, (i & 8) != 0 ? null : r9u1gbsbl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4A3w2Ci6)) {
            return false;
        }
        y4A3w2Ci6 y4a3w2ci6 = (y4A3w2Ci6) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, y4a3w2ci6.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, y4a3w2ci6.J4Ux7ym32) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, y4a3w2ci6.tGV7Q6urW) && anXlDk6fV.tGV7Q6urW(this.dIocxURUo, y4a3w2ci6.dIocxURUo);
    }

    public int hashCode() {
        gsUpNChDr gsupnchdr = this.q3BipwRCk;
        int i = 0;
        int hashCode = (gsupnchdr == null ? 0 : gsupnchdr.hashCode()) * 31;
        BaMMm5shD baMMm5shD = this.J4Ux7ym32;
        int hashCode2 = (hashCode + (baMMm5shD == null ? 0 : baMMm5shD.hashCode())) * 31;
        lTg88Bp1o ltg88bp1o = this.tGV7Q6urW;
        int hashCode3 = (hashCode2 + (ltg88bp1o == null ? 0 : ltg88bp1o.hashCode())) * 31;
        r9U1gbsBL r9u1gbsbl = this.dIocxURUo;
        if (r9u1gbsbl != null) {
            i = r9u1gbsbl.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TransitionData(fade=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", slide=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", changeSize=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", scale=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
