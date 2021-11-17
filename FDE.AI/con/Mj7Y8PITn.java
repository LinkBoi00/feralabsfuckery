package con;

import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class Mj7Y8PITn extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ Collection Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mj7Y8PITn(Collection collection, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = collection;
            super(1);
        } else if (i != 2) {
            this.Bhmn1KIah = collection;
        } else {
            this.Bhmn1KIah = collection;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                return q3BipwRCk(obj);
            case 1:
                return q3BipwRCk(obj);
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.Bhmn1KIah));
        }
    }

    public Boolean q3BipwRCk(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                return Boolean.valueOf(this.Bhmn1KIah.contains(obj));
            default:
                return Boolean.valueOf(this.Bhmn1KIah.contains(obj));
        }
    }
}
