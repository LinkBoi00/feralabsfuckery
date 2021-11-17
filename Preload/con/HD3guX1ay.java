package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class HD3guX1ay implements Iterator, Tnctn6sSk {
    public VbWI3BZ7c CBQ5d1kRq;
    public VbWI3BZ7c kmSgne1rO;

    public HD3guX1ay(VbWI3BZ7c vbWI3BZ7c, VbWI3BZ7c vbWI3BZ7c2) {
        this.CBQ5d1kRq = vbWI3BZ7c2;
        this.kmSgne1rO = vbWI3BZ7c;
    }

    public abstract VbWI3BZ7c J4Ux7ym32(VbWI3BZ7c vbWI3BZ7c);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.kmSgne1rO != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        VbWI3BZ7c vbWI3BZ7c = this.kmSgne1rO;
        VbWI3BZ7c vbWI3BZ7c2 = this.CBQ5d1kRq;
        this.kmSgne1rO = (vbWI3BZ7c == vbWI3BZ7c2 || vbWI3BZ7c2 == null) ? null : tGV7Q6urW(vbWI3BZ7c);
        return vbWI3BZ7c;
    }

    @Override // con.Tnctn6sSk
    public void q3BipwRCk(VbWI3BZ7c vbWI3BZ7c) {
        VbWI3BZ7c vbWI3BZ7c2 = null;
        if (this.CBQ5d1kRq == vbWI3BZ7c && vbWI3BZ7c == this.kmSgne1rO) {
            this.kmSgne1rO = null;
            this.CBQ5d1kRq = null;
        }
        VbWI3BZ7c vbWI3BZ7c3 = this.CBQ5d1kRq;
        if (vbWI3BZ7c3 == vbWI3BZ7c) {
            this.CBQ5d1kRq = J4Ux7ym32(vbWI3BZ7c3);
        }
        VbWI3BZ7c vbWI3BZ7c4 = this.kmSgne1rO;
        if (vbWI3BZ7c4 == vbWI3BZ7c) {
            VbWI3BZ7c vbWI3BZ7c5 = this.CBQ5d1kRq;
            if (!(vbWI3BZ7c4 == vbWI3BZ7c5 || vbWI3BZ7c5 == null)) {
                vbWI3BZ7c2 = tGV7Q6urW(vbWI3BZ7c4);
            }
            this.kmSgne1rO = vbWI3BZ7c2;
        }
    }

    public abstract VbWI3BZ7c tGV7Q6urW(VbWI3BZ7c vbWI3BZ7c);
}
