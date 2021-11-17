package con;

import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class RefKSQ8Gp extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ int Bhmn1KIah;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefKSQ8Gp(int i, n2gATecRC n2gatecrc) {
        super(1);
        this.Bhmn1KIah = i;
        this.PSTqBLTET = n2gatecrc;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 1:
                vXUgPfyfe vxugpfyfe = (vXUgPfyfe) obj;
                int i = this.Bhmn1KIah;
                n2gATecRC n2gatecrc = (n2gATecRC) this.PSTqBLTET;
                vXUgPfyfe.iiGwOFFnr(vxugpfyfe, n2gatecrc, 0, (i - n2gatecrc.kmSgne1rO) / 2, 0.0f, 4, null);
                return qih4lW99W.q3BipwRCk;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.Bhmn1KIah, (Collection) this.PSTqBLTET));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefKSQ8Gp(int i, Collection collection) {
        super(1);
        this.Bhmn1KIah = i;
        this.PSTqBLTET = collection;
    }
}
