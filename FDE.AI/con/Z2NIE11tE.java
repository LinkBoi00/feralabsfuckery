package con;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class Z2NIE11tE implements Iterable, f7VKpcPHS {
    public final /* synthetic */ M6jQSt0Qa CBQ5d1kRq;
    public final /* synthetic */ int kmSgne1rO;

    public Z2NIE11tE(M6jQSt0Qa m6jQSt0Qa, int i) {
        this.CBQ5d1kRq = m6jQSt0Qa;
        this.kmSgne1rO = i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        M6jQSt0Qa m6jQSt0Qa = this.CBQ5d1kRq;
        W3r8jsmHE w3r8jsmHE = (W3r8jsmHE) m6jQSt0Qa.kmSgne1rO;
        if (w3r8jsmHE.qVUwofr5s == m6jQSt0Qa.MzoOEjc4X) {
            int i = this.kmSgne1rO;
            return new M6jQSt0Qa(w3r8jsmHE, i + 1, xpuSUT7Gh.CBQ5d1kRq(w3r8jsmHE.CBQ5d1kRq, i) + i);
        }
        throw new ConcurrentModificationException();
    }
}
