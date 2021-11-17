package con;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mhjbbkjEL extends Cb827Z4La {
    public mhjbbkjEL(qhaZGYFO8 qhazgyfo8, GobDDNrsi gobDDNrsi) {
        super(qhazgyfo8, gobDDNrsi);
    }

    @Override // con.Cb827Z4La, con.qhaZGYFO8
    public void KlYagMRWx(long j, ugecCdPSw ugeccdpsw) {
        Xeg1rC5FI(j, ugeccdpsw, false, true, this, new PMHggSWX1(this, j, ugeccdpsw));
    }

    public final ogG45sslV eylCJcWC7() {
        mhjbbkjEL mhjbbkjel;
        qhaZGYFO8 qhazgyfo8 = this.mUqPm6GBh;
        while (true) {
            if (qhazgyfo8 == null) {
                mhjbbkjel = null;
                break;
            } else if (qhazgyfo8 instanceof mhjbbkjEL) {
                mhjbbkjel = (mhjbbkjEL) qhazgyfo8;
                break;
            } else {
                qhazgyfo8 = qhazgyfo8.IG30YE5GU();
            }
        }
        if (mhjbbkjel != null) {
            ogG45sslV ogg45sslv = ((CBcUvsHpG) ((GobDDNrsi) this.NyWTwPF6V)).kmSgne1rO;
            if (!ogg45sslv.Bhmn1KIah) {
                Objects.requireNonNull(ogg45sslv);
                ogG45sslV ogg45sslv2 = new ogG45sslV();
                ogg45sslv2.kmSgne1rO = ogg45sslv.kmSgne1rO;
                ogg45sslv2.Bhmn1KIah = ogg45sslv.Bhmn1KIah;
                ogg45sslv2.CBQ5d1kRq.putAll(ogg45sslv.CBQ5d1kRq);
                ogG45sslV eylCJcWC7 = mhjbbkjel.eylCJcWC7();
                if (eylCJcWC7.kmSgne1rO) {
                    ogg45sslv2.kmSgne1rO = true;
                }
                if (eylCJcWC7.Bhmn1KIah) {
                    ogg45sslv2.Bhmn1KIah = true;
                }
                for (Map.Entry entry : eylCJcWC7.CBQ5d1kRq.entrySet()) {
                    SHlGWJTIu sHlGWJTIu = (SHlGWJTIu) entry.getKey();
                    Object value = entry.getValue();
                    if (!ogg45sslv2.CBQ5d1kRq.containsKey(sHlGWJTIu)) {
                        ogg45sslv2.CBQ5d1kRq.put(sHlGWJTIu, value);
                    } else if (value instanceof ngczBF8du) {
                        Object obj = ogg45sslv2.CBQ5d1kRq.get(sHlGWJTIu);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                        ngczBF8du ngczbf8du = (ngczBF8du) obj;
                        Map map = ogg45sslv2.CBQ5d1kRq;
                        String str = ngczbf8du.q3BipwRCk;
                        if (str == null) {
                            str = ((ngczBF8du) value).q3BipwRCk;
                        }
                        eEwksJAjd eewksjajd = ngczbf8du.J4Ux7ym32;
                        if (eewksjajd == null) {
                            eewksjajd = ((ngczBF8du) value).J4Ux7ym32;
                        }
                        map.put(sHlGWJTIu, new ngczBF8du(str, eewksjajd));
                    }
                }
                return ogg45sslv2;
            }
        }
        return ((CBcUvsHpG) ((GobDDNrsi) this.NyWTwPF6V)).kmSgne1rO;
    }

    @Override // con.qhaZGYFO8
    public void j22ftfeNI() {
        super.j22ftfeNI();
        jRWr6Yc4S jrwr6yc4s = this.MzoOEjc4X.qVUwofr5s;
        if (jrwr6yc4s != null) {
            ((AndroidComposeView) jrwr6yc4s).Bhmn1KIah();
        }
    }

    @Override // con.qhaZGYFO8
    public void suAKJqyYV() {
        super.suAKJqyYV();
        jRWr6Yc4S jrwr6yc4s = this.MzoOEjc4X.qVUwofr5s;
        if (jrwr6yc4s != null) {
            ((AndroidComposeView) jrwr6yc4s).Bhmn1KIah();
        }
    }

    public String toString() {
        return super.toString() + " id: " + ((CBcUvsHpG) ((GobDDNrsi) this.NyWTwPF6V)).CBQ5d1kRq + " config: " + ((CBcUvsHpG) ((GobDDNrsi) this.NyWTwPF6V)).kmSgne1rO;
    }
}
