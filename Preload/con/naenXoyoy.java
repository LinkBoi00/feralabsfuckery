package con;

import java.util.List;
/* loaded from: classes.dex */
public final class naenXoyoy extends Wk9bO57s4 implements PmanMZxiM {
    public static final naenXoyoy kmSgne1rO = new naenXoyoy();

    public naenXoyoy() {
        super(1);
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = null;
        CGxBfURfz cGxBfURfz = obj2 == null ? null : (CGxBfURfz) obj2;
        Object obj4 = list.get(2);
        int intValue = (obj4 == null ? null : (Integer) obj4).intValue();
        Object obj5 = list.get(3);
        int intValue2 = (obj5 == null ? null : (Integer) obj5).intValue();
        Object obj6 = list.get(4);
        String str = obj6 == null ? null : (String) obj6;
        int ordinal = cGxBfURfz.ordinal();
        if (ordinal == 0) {
            Object obj7 = list.get(1);
            B6IRYLW14 b6irylw14 = ePzwFsfkJ.kCA6Zs9sL;
            if (!anXlDk6fV.tGV7Q6urW(obj7, Boolean.FALSE) && obj7 != null) {
                obj3 = (Nrdhx1ztZ) b6irylw14.J4Ux7ym32.IytU16YUK(obj7);
            }
            return new lzuuVzcu0(obj3, intValue, intValue2, str);
        } else if (ordinal == 1) {
            Object obj8 = list.get(1);
            B6IRYLW14 b6irylw142 = ePzwFsfkJ.iiGwOFFnr;
            if (!anXlDk6fV.tGV7Q6urW(obj8, Boolean.FALSE) && obj8 != null) {
                obj3 = (dBWPON5YR) b6irylw142.J4Ux7ym32.IytU16YUK(obj8);
            }
            return new lzuuVzcu0(obj3, intValue, intValue2, str);
        } else if (ordinal == 2) {
            Object obj9 = list.get(1);
            B6IRYLW14 b6irylw143 = ePzwFsfkJ.dIocxURUo;
            if (!anXlDk6fV.tGV7Q6urW(obj9, Boolean.FALSE) && obj9 != null) {
                obj3 = (tFUPpAQff) b6irylw143.J4Ux7ym32.IytU16YUK(obj9);
            }
            return new lzuuVzcu0(obj3, intValue, intValue2, str);
        } else if (ordinal == 3) {
            Object obj10 = list.get(1);
            if (obj10 != null) {
                obj3 = (String) obj10;
            }
            return new lzuuVzcu0(obj3, intValue, intValue2, str);
        } else {
            throw new dnCerKhAM();
        }
    }
}
