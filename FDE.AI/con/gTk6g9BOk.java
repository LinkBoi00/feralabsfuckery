package con;

import java.util.ConcurrentModificationException;
/* loaded from: classes.dex */
public final class gTk6g9BOk extends wwj2VvJy1 {
    public final bYMPHjVnt Bhmn1KIah;
    public vXaCS6jDZ MzoOEjc4X;
    public int PSTqBLTET;
    public int ilHKhw3Yw = -1;

    public gTk6g9BOk(bYMPHjVnt bymphjvnt, int i) {
        super(i, bymphjvnt.Eeka1udhb);
        this.Bhmn1KIah = bymphjvnt;
        this.PSTqBLTET = bymphjvnt.Puu3Rhg4F();
        Puu3Rhg4F();
    }

    public final void GPLPRo6go() {
        bYMPHjVnt bymphjvnt = this.Bhmn1KIah;
        this.kmSgne1rO = bymphjvnt.Eeka1udhb;
        this.PSTqBLTET = bymphjvnt.Puu3Rhg4F();
        this.ilHKhw3Yw = -1;
        Puu3Rhg4F();
    }

    public final void Puu3Rhg4F() {
        bYMPHjVnt bymphjvnt = this.Bhmn1KIah;
        Object[] objArr = bymphjvnt.ilHKhw3Yw;
        if (objArr == null) {
            this.MzoOEjc4X = null;
            return;
        }
        int J4Ux7ym32 = (bymphjvnt.J4Ux7ym32() - 1) & -32;
        int i = this.CBQ5d1kRq;
        if (i > J4Ux7ym32) {
            i = J4Ux7ym32;
        }
        int i2 = (this.Bhmn1KIah.PSTqBLTET / 5) + 1;
        vXaCS6jDZ vxacs6jdz = this.MzoOEjc4X;
        if (vxacs6jdz == null) {
            this.MzoOEjc4X = new vXaCS6jDZ(objArr, i, J4Ux7ym32, i2);
            return;
        }
        vxacs6jdz.CBQ5d1kRq = i;
        vxacs6jdz.kmSgne1rO = J4Ux7ym32;
        vxacs6jdz.Bhmn1KIah = i2;
        if (vxacs6jdz.PSTqBLTET.length < i2) {
            vxacs6jdz.PSTqBLTET = new Object[i2];
        }
        boolean z = false;
        vxacs6jdz.PSTqBLTET[0] = objArr;
        if (i == J4Ux7ym32) {
            z = true;
        }
        vxacs6jdz.MzoOEjc4X = z;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        vxacs6jdz.GPLPRo6go(i - i3, 1);
    }

    @Override // con.wwj2VvJy1, java.util.ListIterator
    public void add(Object obj) {
        iiGwOFFnr();
        this.Bhmn1KIah.add(this.CBQ5d1kRq, obj);
        this.CBQ5d1kRq++;
        GPLPRo6go();
    }

    public final void iiGwOFFnr() {
        if (this.PSTqBLTET != this.Bhmn1KIah.Puu3Rhg4F()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        iiGwOFFnr();
        J4Ux7ym32();
        int i = this.CBQ5d1kRq;
        this.ilHKhw3Yw = i;
        vXaCS6jDZ vxacs6jdz = this.MzoOEjc4X;
        if (vxacs6jdz == null) {
            Object[] objArr = this.Bhmn1KIah.qVUwofr5s;
            this.CBQ5d1kRq = i + 1;
            return objArr[i];
        } else if (vxacs6jdz.hasNext()) {
            this.CBQ5d1kRq++;
            return vxacs6jdz.next();
        } else {
            Object[] objArr2 = this.Bhmn1KIah.qVUwofr5s;
            int i2 = this.CBQ5d1kRq;
            this.CBQ5d1kRq = i2 + 1;
            return objArr2[i2 - vxacs6jdz.kmSgne1rO];
        }
    }

    @Override // java.util.ListIterator
    public Object previous() {
        iiGwOFFnr();
        kCA6Zs9sL();
        int i = this.CBQ5d1kRq;
        this.ilHKhw3Yw = i - 1;
        vXaCS6jDZ vxacs6jdz = this.MzoOEjc4X;
        if (vxacs6jdz == null) {
            Object[] objArr = this.Bhmn1KIah.qVUwofr5s;
            int i2 = i - 1;
            this.CBQ5d1kRq = i2;
            return objArr[i2];
        }
        int i3 = vxacs6jdz.kmSgne1rO;
        if (i > i3) {
            Object[] objArr2 = this.Bhmn1KIah.qVUwofr5s;
            int i4 = i - 1;
            this.CBQ5d1kRq = i4;
            return objArr2[i4 - i3];
        }
        this.CBQ5d1kRq = i - 1;
        return vxacs6jdz.previous();
    }

    @Override // con.wwj2VvJy1, java.util.ListIterator, java.util.Iterator
    public void remove() {
        iiGwOFFnr();
        int i = this.ilHKhw3Yw;
        if (i != -1) {
            this.Bhmn1KIah.kCA6Zs9sL(i);
            int i2 = this.ilHKhw3Yw;
            if (i2 < this.CBQ5d1kRq) {
                this.CBQ5d1kRq = i2;
            }
            GPLPRo6go();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // con.wwj2VvJy1, java.util.ListIterator
    public void set(Object obj) {
        iiGwOFFnr();
        int i = this.ilHKhw3Yw;
        if (i != -1) {
            this.Bhmn1KIah.set(i, obj);
            this.PSTqBLTET = this.Bhmn1KIah.Puu3Rhg4F();
            Puu3Rhg4F();
            return;
        }
        throw new IllegalStateException();
    }
}
