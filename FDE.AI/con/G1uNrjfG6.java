package con;

import java.util.ConcurrentModificationException;
import java.util.Objects;
/* loaded from: classes.dex */
public class G1uNrjfG6 extends AO5jo8b7w {
    public Object MzoOEjc4X;
    public final z2UXUXueK PSTqBLTET;
    public boolean ilHKhw3Yw;
    public int qVUwofr5s;

    public G1uNrjfG6(z2UXUXueK z2uxuxuek, DAbXDOiPB[] dAbXDOiPBArr) {
        super(z2uxuxuek.Bhmn1KIah, dAbXDOiPBArr);
        this.PSTqBLTET = z2uxuxuek;
        this.qVUwofr5s = z2uxuxuek.MzoOEjc4X;
    }

    public final void GPLPRo6go(int i, yUfRSVKGd yufrsvkgd, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            DAbXDOiPB dAbXDOiPB = this.CBQ5d1kRq[i2];
            Object[] objArr = yufrsvkgd.dIocxURUo;
            int length = objArr.length;
            dAbXDOiPB.CBQ5d1kRq = objArr;
            dAbXDOiPB.kmSgne1rO = length;
            dAbXDOiPB.Bhmn1KIah = 0;
            while (true) {
                DAbXDOiPB dAbXDOiPB2 = this.CBQ5d1kRq[i2];
                if (!anXlDk6fV.tGV7Q6urW(dAbXDOiPB2.CBQ5d1kRq[dAbXDOiPB2.Bhmn1KIah], obj)) {
                    this.CBQ5d1kRq[i2].Bhmn1KIah += 2;
                } else {
                    this.kmSgne1rO = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (yufrsvkgd.oon79WMrY(i4)) {
                this.CBQ5d1kRq[i2].GPLPRo6go(yufrsvkgd.dIocxURUo, yufrsvkgd.GPLPRo6go() * 2, yufrsvkgd.Puu3Rhg4F(i4));
                this.kmSgne1rO = i2;
                return;
            }
            int ixWaw2akD = yufrsvkgd.ixWaw2akD(i4);
            yUfRSVKGd RG6kpfv3v = yufrsvkgd.RG6kpfv3v(ixWaw2akD);
            this.CBQ5d1kRq[i2].GPLPRo6go(yufrsvkgd.dIocxURUo, yufrsvkgd.GPLPRo6go() * 2, ixWaw2akD);
            GPLPRo6go(i, RG6kpfv3v, obj, i2 + 1);
        }
    }

    @Override // con.AO5jo8b7w, java.util.Iterator
    public Object next() {
        if (this.PSTqBLTET.MzoOEjc4X == this.qVUwofr5s) {
            this.MzoOEjc4X = J4Ux7ym32();
            this.ilHKhw3Yw = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // con.AO5jo8b7w, java.util.Iterator
    public void remove() {
        if (this.ilHKhw3Yw) {
            if (this.Bhmn1KIah) {
                Object J4Ux7ym32 = J4Ux7ym32();
                z2UXUXueK z2uxuxuek = this.PSTqBLTET;
                Object obj = this.MzoOEjc4X;
                Objects.requireNonNull(z2uxuxuek, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                cOutqbkMD.q3BipwRCk(z2uxuxuek).remove(obj);
                GPLPRo6go(J4Ux7ym32 != null ? J4Ux7ym32.hashCode() : 0, this.PSTqBLTET.Bhmn1KIah, J4Ux7ym32, 0);
            } else {
                z2UXUXueK z2uxuxuek2 = this.PSTqBLTET;
                Object obj2 = this.MzoOEjc4X;
                Objects.requireNonNull(z2uxuxuek2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                cOutqbkMD.q3BipwRCk(z2uxuxuek2).remove(obj2);
            }
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = false;
            this.qVUwofr5s = this.PSTqBLTET.MzoOEjc4X;
            return;
        }
        throw new IllegalStateException();
    }
}
