package con;

import java.util.List;
/* loaded from: classes.dex */
public final class GkrqaNGqs extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ n2gATecRC[] Bhmn1KIah;
    public final /* synthetic */ int Eeka1udhb;
    public final /* synthetic */ int MzoOEjc4X;
    public final /* synthetic */ a9Q6ojHoZ PSTqBLTET;
    public final /* synthetic */ pennnCA24 RG6kpfv3v;
    public final /* synthetic */ iPxyBBmfH[] dXrmkklc8;
    public final /* synthetic */ FRJidynr8 ilHKhw3Yw;
    public final /* synthetic */ int ixWaw2akD;
    public final /* synthetic */ List kmSgne1rO;
    public final /* synthetic */ int[] qVUwofr5s;
    public final /* synthetic */ BdFQ0RqNz sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GkrqaNGqs(List list, n2gATecRC[] n2gatecrcArr, a9Q6ojHoZ a9q6ojhoz, int i, FRJidynr8 fRJidynr8, int[] iArr, int i2, iPxyBBmfH[] ipxybbmfhArr, pennnCA24 pennnca24, int i3, BdFQ0RqNz bdFQ0RqNz) {
        super(1);
        this.kmSgne1rO = list;
        this.Bhmn1KIah = n2gatecrcArr;
        this.PSTqBLTET = a9q6ojhoz;
        this.MzoOEjc4X = i;
        this.ilHKhw3Yw = fRJidynr8;
        this.qVUwofr5s = iArr;
        this.Eeka1udhb = i2;
        this.dXrmkklc8 = ipxybbmfhArr;
        this.RG6kpfv3v = pennnca24;
        this.ixWaw2akD = i3;
        this.sk5s77z6Q = bdFQ0RqNz;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        int i;
        pennnCA24 pennnca24;
        int i2;
        int i3;
        int i4;
        int i5;
        vXUgPfyfe vxugpfyfe = (vXUgPfyfe) obj;
        int size = this.kmSgne1rO.size();
        int[] iArr = new int[size];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = 1;
            if (i7 >= size) {
                break;
            }
            n2gATecRC n2gatecrc = this.Bhmn1KIah[i7];
            if (this.Eeka1udhb == 1) {
                i5 = n2gatecrc.CBQ5d1kRq;
            } else {
                i5 = n2gatecrc.kmSgne1rO;
            }
            iArr[i7] = i5;
            i7++;
        }
        this.PSTqBLTET.CpG0imbht(Integer.valueOf(this.MzoOEjc4X), iArr, this.ilHKhw3Yw.getLayoutDirection(), this.ilHKhw3Yw, this.qVUwofr5s);
        n2gATecRC[] n2gatecrcArr = this.Bhmn1KIah;
        iPxyBBmfH[] ipxybbmfhArr = this.dXrmkklc8;
        pennnCA24 pennnca242 = this.RG6kpfv3v;
        int i8 = this.ixWaw2akD;
        int i9 = this.Eeka1udhb;
        FRJidynr8 fRJidynr8 = this.ilHKhw3Yw;
        BdFQ0RqNz bdFQ0RqNz = this.sk5s77z6Q;
        int[] iArr2 = this.qVUwofr5s;
        int length = n2gatecrcArr.length;
        int i10 = 0;
        while (i6 < length) {
            n2gATecRC n2gatecrc2 = n2gatecrcArr[i6];
            int i11 = i10 + 1;
            iPxyBBmfH ipxybbmfh = ipxybbmfhArr[i10];
            if (ipxybbmfh == null) {
                pennnca24 = null;
            } else {
                pennnca24 = ipxybbmfh.tGV7Q6urW;
            }
            if (pennnca24 == null) {
                pennnca24 = pennnca242;
            }
            if (i9 == i) {
                i2 = n2gatecrc2.kmSgne1rO;
            } else {
                i2 = n2gatecrc2.CBQ5d1kRq;
            }
            int q3BipwRCk = pennnca24.q3BipwRCk(i8 - i2, i9 == 1 ? BFRsKhrQv.Ltr : fRJidynr8.getLayoutDirection(), n2gatecrc2, bdFQ0RqNz.CBQ5d1kRq);
            i = 1;
            if (i9 == 1) {
                i4 = iArr2[i10];
                i3 = q3BipwRCk;
            } else {
                i3 = iArr2[i10];
                i4 = q3BipwRCk;
            }
            vXUgPfyfe.tGV7Q6urW(vxugpfyfe, n2gatecrc2, i4, i3, 0.0f, 4, null);
            i6++;
            i10 = i11;
            length = length;
            fRJidynr8 = fRJidynr8;
            bdFQ0RqNz = bdFQ0RqNz;
            iArr2 = iArr2;
        }
        return qih4lW99W.q3BipwRCk;
    }
}
