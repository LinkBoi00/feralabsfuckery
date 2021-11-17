package con;
/* loaded from: classes.dex */
public final class ufrUqYgoW extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ int Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufrUqYgoW(int i, int i2) {
        super(1);
        this.kmSgne1rO = i2;
        if (i2 != 1) {
            this.Bhmn1KIah = i;
            return;
        }
        this.Bhmn1KIah = i;
        super(1);
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                return Integer.valueOf(((HqmYLYbvB) obj).kCA6Zs9sL(this.Bhmn1KIah));
            default:
                ((Number) obj).intValue();
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.Bhmn1KIah + '.');
        }
    }
}
