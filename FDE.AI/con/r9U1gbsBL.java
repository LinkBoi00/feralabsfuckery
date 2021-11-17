package con;
/* loaded from: classes.dex */
public final class r9U1gbsBL {
    public final long J4Ux7ym32;
    public final float q3BipwRCk;
    public final B82vleiqp tGV7Q6urW;

    public r9U1gbsBL(float f, long j, B82vleiqp b82vleiqp, dnBSj5uJN dnbsj5ujn) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = j;
        this.tGV7Q6urW = b82vleiqp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9U1gbsBL)) {
            return false;
        }
        r9U1gbsBL r9u1gbsbl = (r9U1gbsBL) obj;
        if (!anXlDk6fV.tGV7Q6urW(Float.valueOf(this.q3BipwRCk), Float.valueOf(r9u1gbsbl.q3BipwRCk))) {
            return false;
        }
        long j = this.J4Ux7ym32;
        long j2 = r9u1gbsbl.J4Ux7ym32;
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, r9u1gbsbl.tGV7Q6urW);
    }

    public int hashCode() {
        long j = this.J4Ux7ym32;
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        return this.tGV7Q6urW.hashCode() + (((Float.hashCode(this.q3BipwRCk) * 31) + Long.hashCode(j)) * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Scale(scale=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", transformOrigin=");
        q3BipwRCk.append((Object) WyfbJwwBZ.tGV7Q6urW(this.J4Ux7ym32));
        q3BipwRCk.append(", animationSpec=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
