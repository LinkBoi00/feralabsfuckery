package con;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class cclHSBzpG {
    public static final vX9ZKIhAp q3BipwRCk = new vX9ZKIhAp("NO_THREAD_ELEMENTS");

    public static final Object J4Ux7ym32(bu5cjmae6 bu5cjmae6, Object obj) {
        if (obj == null) {
            obj = bu5cjmae6.fold(0, pSdrExTbX.o4LF8RkoQ);
        }
        if (obj == 0) {
            return q3BipwRCk;
        }
        if (obj instanceof Integer) {
            return bu5cjmae6.fold(new tGypkjr6r(bu5cjmae6, ((Number) obj).intValue()), RxoyIGMI4.Bhmn1KIah);
        }
        K6PL0z3I0.q3BipwRCk((eI009iAto) obj);
        throw null;
    }

    public static final void q3BipwRCk(bu5cjmae6 bu5cjmae6, Object obj) {
        if (obj != q3BipwRCk) {
            if (obj instanceof tGypkjr6r) {
                tGypkjr6r tgypkjr6r = (tGypkjr6r) obj;
                int length = tgypkjr6r.tGV7Q6urW.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        eI009iAto ei009iato = tgypkjr6r.tGV7Q6urW[length];
                        Thread.currentThread().setName((String) tgypkjr6r.J4Ux7ym32[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = bu5cjmae6.fold(null, rK9K320Ix.cAwN510t2);
                Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                eI009iAto ei009iato2 = (eI009iAto) fold;
                Thread.currentThread().setName((String) obj);
            }
        }
    }
}
