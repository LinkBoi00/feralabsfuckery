package con;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class or5nbo9ku {
    public final pLYbCSTk0 GPLPRo6go;
    public final boolean J4Ux7ym32;
    public or5nbo9ku dIocxURUo;
    public final int iiGwOFFnr;
    public final ogG45sslV kCA6Zs9sL;
    public final mhjbbkjEL q3BipwRCk;
    public boolean tGV7Q6urW;

    public or5nbo9ku(mhjbbkjEL mhjbbkjel, boolean z) {
        this.q3BipwRCk = mhjbbkjel;
        this.J4Ux7ym32 = z;
        this.kCA6Zs9sL = mhjbbkjel.eylCJcWC7();
        this.iiGwOFFnr = ((CBcUvsHpG) ((GobDDNrsi) mhjbbkjel.NyWTwPF6V)).CBQ5d1kRq;
        this.GPLPRo6go = mhjbbkjel.MzoOEjc4X;
    }

    public static List J4Ux7ym32(or5nbo9ku or5nbo9ku, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        List CBQ5d1kRq = or5nbo9ku.CBQ5d1kRq(z, false);
        int size = CBQ5d1kRq.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                or5nbo9ku or5nbo9ku2 = (or5nbo9ku) CBQ5d1kRq.get(i2);
                if (or5nbo9ku2.oon79WMrY()) {
                    list.add(or5nbo9ku2);
                } else if (!or5nbo9ku2.kCA6Zs9sL.Bhmn1KIah) {
                    J4Ux7ym32(or5nbo9ku2, list, false, 2);
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return list;
    }

    public final List CBQ5d1kRq(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.tGV7Q6urW) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            pLYbCSTk0 plybcstk0 = this.GPLPRo6go;
            arrayList = new ArrayList();
            ODug2UCW1.Eeka1udhb(plybcstk0, arrayList);
        } else {
            pLYbCSTk0 plybcstk02 = this.GPLPRo6go;
            arrayList = new ArrayList();
            BBVaGLNaU.CBQ5d1kRq(plybcstk02, arrayList);
        }
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList2.add(new or5nbo9ku((mhjbbkjEL) arrayList.get(i), this.J4Ux7ym32));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        if (z2) {
            ogG45sslV ogg45sslv = this.kCA6Zs9sL;
            VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
            qDffvYFss qdffvyfss = (qDffvYFss) xP6F5SR9v.Bhmn1KIah(ogg45sslv, VSVuhz7Ow.ilHKhw3Yw);
            if (qdffvyfss != null && this.kCA6Zs9sL.kmSgne1rO && (!arrayList2.isEmpty())) {
                arrayList2.add(q3BipwRCk(qdffvyfss, new nVhenZUxZ(qdffvyfss)));
            }
            ogG45sslV ogg45sslv2 = this.kCA6Zs9sL;
            SHlGWJTIu sHlGWJTIu = VSVuhz7Ow.J4Ux7ym32;
            if (ogg45sslv2.CBQ5d1kRq.containsKey(sHlGWJTIu) && (!arrayList2.isEmpty())) {
                ogG45sslV ogg45sslv3 = this.kCA6Zs9sL;
                if (ogg45sslv3.kmSgne1rO) {
                    List list = (List) xP6F5SR9v.Bhmn1KIah(ogg45sslv3, sHlGWJTIu);
                    String str = list == null ? null : (String) wkFJfVmcv.QNqj6nIzv(list);
                    if (str != null) {
                        arrayList2.add(0, q3BipwRCk(null, new YYJiHiGqL(str, 2)));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final or5nbo9ku GPLPRo6go() {
        or5nbo9ku or5nbo9ku = this.dIocxURUo;
        if (or5nbo9ku != null) {
            return or5nbo9ku;
        }
        pLYbCSTk0 tGV7Q6urW = this.J4Ux7ym32 ? BBVaGLNaU.tGV7Q6urW(this.GPLPRo6go, JHFXdtjfx.nlGCs0NZs) : null;
        if (tGV7Q6urW == null) {
            tGV7Q6urW = BBVaGLNaU.tGV7Q6urW(this.GPLPRo6go, AdUPdUuqH.qFBXIgpia);
        }
        mhjbbkjEL dXrmkklc8 = tGV7Q6urW == null ? null : BBVaGLNaU.dXrmkklc8(tGV7Q6urW);
        if (dXrmkklc8 == null) {
            return null;
        }
        return new or5nbo9ku(dXrmkklc8, this.J4Ux7ym32);
    }

    public final long Puu3Rhg4F() {
        if (this.GPLPRo6go.Eeka1udhb()) {
            return p62TZmTyO.nlGCs0NZs(tGV7Q6urW());
        }
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.tGV7Q6urW;
    }

    public final bzmJZsHMu dIocxURUo() {
        if (this.GPLPRo6go.Eeka1udhb()) {
            return p62TZmTyO.ilHKhw3Yw(tGV7Q6urW());
        }
        ksLrMHgEz kslrmhgez = bzmJZsHMu.kCA6Zs9sL;
        ksLrMHgEz kslrmhgez2 = bzmJZsHMu.kCA6Zs9sL;
        return bzmJZsHMu.iiGwOFFnr;
    }

    public final ogG45sslV iiGwOFFnr() {
        if (!oon79WMrY()) {
            return this.kCA6Zs9sL;
        }
        ogG45sslV ogg45sslv = this.kCA6Zs9sL;
        Objects.requireNonNull(ogg45sslv);
        ogG45sslV ogg45sslv2 = new ogG45sslV();
        ogg45sslv2.kmSgne1rO = ogg45sslv.kmSgne1rO;
        ogg45sslv2.Bhmn1KIah = ogg45sslv.Bhmn1KIah;
        ogg45sslv2.CBQ5d1kRq.putAll(ogg45sslv.CBQ5d1kRq);
        vPSbyrYWX(ogg45sslv2);
        return ogg45sslv2;
    }

    public final List kCA6Zs9sL(boolean z, boolean z2, boolean z3) {
        if (z2 || !this.kCA6Zs9sL.Bhmn1KIah) {
            return oon79WMrY() ? J4Ux7ym32(this, null, z, 1) : CBQ5d1kRq(z, z3);
        }
        return Dqz1pJHWH.CBQ5d1kRq;
    }

    public final boolean oon79WMrY() {
        return this.J4Ux7ym32 && this.kCA6Zs9sL.kmSgne1rO;
    }

    public final or5nbo9ku q3BipwRCk(qDffvYFss qdffvyfss, PmanMZxiM pmanMZxiM) {
        int i;
        int i2;
        qhaZGYFO8 qhazgyfo8 = new pLYbCSTk0(true).o4LF8RkoQ;
        if (qdffvyfss != null) {
            i = this.iiGwOFFnr;
            i2 = 1000000000;
        } else {
            i = this.iiGwOFFnr;
            i2 = 2000000000;
        }
        or5nbo9ku or5nbo9ku = new or5nbo9ku(new mhjbbkjEL(qhazgyfo8, new CBcUvsHpG(i + i2, false, false, pmanMZxiM)), false);
        or5nbo9ku.tGV7Q6urW = true;
        or5nbo9ku.dIocxURUo = this;
        return or5nbo9ku;
    }

    public final mhjbbkjEL tGV7Q6urW() {
        mhjbbkjEL Eeka1udhb;
        return (!this.kCA6Zs9sL.kmSgne1rO || (Eeka1udhb = BBVaGLNaU.Eeka1udhb(this.GPLPRo6go)) == null) ? this.q3BipwRCk : Eeka1udhb;
    }

    public final void vPSbyrYWX(ogG45sslV ogg45sslv) {
        if (!this.kCA6Zs9sL.Bhmn1KIah) {
            int i = 0;
            List CBQ5d1kRq = CBQ5d1kRq(false, false);
            int size = CBQ5d1kRq.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    or5nbo9ku or5nbo9ku = (or5nbo9ku) CBQ5d1kRq.get(i);
                    if (!or5nbo9ku.oon79WMrY()) {
                        for (Map.Entry entry : or5nbo9ku.kCA6Zs9sL.CBQ5d1kRq.entrySet()) {
                            SHlGWJTIu sHlGWJTIu = (SHlGWJTIu) entry.getKey();
                            Object WaUP0CF08 = sHlGWJTIu.J4Ux7ym32.WaUP0CF08(ogg45sslv.CBQ5d1kRq.get(sHlGWJTIu), entry.getValue());
                            if (WaUP0CF08 != null) {
                                ogg45sslv.CBQ5d1kRq.put(sHlGWJTIu, WaUP0CF08);
                            }
                        }
                        or5nbo9ku.vPSbyrYWX(ogg45sslv);
                    }
                    if (i2 <= size) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final List yWvV4ePLl() {
        return kCA6Zs9sL(false, false, true);
    }
}
