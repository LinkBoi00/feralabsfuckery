package con;
/* loaded from: classes.dex */
public final class MtOsY9hF5 extends wwj2VvJy1 {
    public final Object[] Bhmn1KIah;
    public final vXaCS6jDZ PSTqBLTET;

    public MtOsY9hF5(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.Bhmn1KIah = objArr2;
        int i4 = (i2 - 1) & -32;
        this.PSTqBLTET = new vXaCS6jDZ(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        J4Ux7ym32();
        if (this.PSTqBLTET.hasNext()) {
            this.CBQ5d1kRq++;
            return this.PSTqBLTET.next();
        }
        Object[] objArr = this.Bhmn1KIah;
        int i = this.CBQ5d1kRq;
        this.CBQ5d1kRq = i + 1;
        return objArr[i - this.PSTqBLTET.kmSgne1rO];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        kCA6Zs9sL();
        int i = this.CBQ5d1kRq;
        vXaCS6jDZ vxacs6jdz = this.PSTqBLTET;
        int i2 = vxacs6jdz.kmSgne1rO;
        if (i > i2) {
            Object[] objArr = this.Bhmn1KIah;
            int i3 = i - 1;
            this.CBQ5d1kRq = i3;
            return objArr[i3 - i2];
        }
        this.CBQ5d1kRq = i - 1;
        return vxacs6jdz.previous();
    }
}
