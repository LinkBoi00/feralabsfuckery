package con;

import con.kdbvrtBH1;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class r0uVnCFTP extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ kdbvrtBH1 Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0uVnCFTP(kdbvrtBH1 kdbvrtbh1, int i) {
        super(0);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = kdbvrtbh1;
            return;
        }
        this.Bhmn1KIah = kdbvrtbh1;
        super(0);
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        switch (this.kmSgne1rO) {
            case 0:
                Object J4Ux7ym32 = this.Bhmn1KIah.J4Ux7ym32();
                AwUV2q7WY awUV2q7WY = AwUV2q7WY.Visible;
                return Boolean.valueOf(J4Ux7ym32 == awUV2q7WY || this.Bhmn1KIah.iiGwOFFnr() == awUV2q7WY);
            default:
                ListIterator listIterator = this.Bhmn1KIah.Puu3Rhg4F.listIterator();
                long j = 0;
                while (true) {
                    S4jgv4n3l s4jgv4n3l = (S4jgv4n3l) listIterator;
                    if (s4jgv4n3l.hasNext()) {
                        j = Math.max(j, ((kdbvrtBH1.mhl5lIdbQ) s4jgv4n3l.next()).q3BipwRCk().Puu3Rhg4F);
                    } else {
                        ListIterator listIterator2 = this.Bhmn1KIah.yWvV4ePLl.listIterator();
                        while (true) {
                            S4jgv4n3l s4jgv4n3l2 = (S4jgv4n3l) listIterator2;
                            if (!s4jgv4n3l2.hasNext()) {
                                return Long.valueOf(j);
                            }
                            j = Math.max(j, ((Number) ((kdbvrtBH1) s4jgv4n3l2.next()).CBQ5d1kRq.getValue()).longValue());
                        }
                    }
                }
        }
    }
}
