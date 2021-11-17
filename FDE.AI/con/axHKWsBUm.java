package con;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class axHKWsBUm implements PmYqqGuHi {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public axHKWsBUm(Iterable iterable) {
        this.J4Ux7ym32 = iterable;
    }

    @Override // con.PmYqqGuHi
    public Iterator iterator() {
        switch (this.q3BipwRCk) {
            case 0:
                return ((Iterable) this.J4Ux7ym32).iterator();
            case 1:
                QScS9iO33 qScS9iO33 = new QScS9iO33();
                qScS9iO33.Bhmn1KIah = idpM54xlp.dIocxURUo((kkcQgCx5G) this.J4Ux7ym32, qScS9iO33, qScS9iO33);
                return qScS9iO33;
            default:
                return (Iterator) this.J4Ux7ym32;
        }
    }

    public axHKWsBUm(Iterator it) {
        this.J4Ux7ym32 = it;
    }
}
