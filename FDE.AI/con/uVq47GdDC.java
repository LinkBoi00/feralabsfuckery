package con;

import com.feravolt.preload.R;
import java.util.List;
/* loaded from: classes.dex */
public final class uVq47GdDC extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ int kmSgne1rO;
    public static final uVq47GdDC Bhmn1KIah = new uVq47GdDC(0);
    public static final uVq47GdDC PSTqBLTET = new uVq47GdDC(1);
    public static final uVq47GdDC MzoOEjc4X = new uVq47GdDC(2);
    public static final uVq47GdDC ilHKhw3Yw = new uVq47GdDC(3);
    public static final uVq47GdDC qVUwofr5s = new uVq47GdDC(4);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uVq47GdDC(int i) {
        super(3);
        this.kmSgne1rO = i;
        if (i == 1) {
            super(3);
        } else if (i == 2) {
            super(3);
        } else if (i == 3) {
            super(3);
        } else if (i != 4) {
        } else {
            super(3);
        }
    }

    public Integer q3BipwRCk(List list, int i, int i2) {
        switch (this.kmSgne1rO) {
            case 0:
                return Integer.valueOf(xP6F5SR9v.GPLPRo6go(list, ncKm8DzZ7.Bhmn1KIah, ZUnPHIUWr.PSTqBLTET, i, i2, 1, 2));
            default:
                return Integer.valueOf(xP6F5SR9v.GPLPRo6go(list, ncKm8DzZ7.MzoOEjc4X, ZUnPHIUWr.ilHKhw3Yw, i, i2, 2, 2));
        }
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        switch (this.kmSgne1rO) {
            case 0:
                return q3BipwRCk((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 1:
                return q3BipwRCk((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 2:
                GX14exZ1F gX14exZ1F = (GX14exZ1F) obj;
                G7WvUK4mQ.kCA6Zs9sL((ZVqfObOve) obj2, (gl0eeduiq) obj3);
                return qih4lW99W.q3BipwRCk;
            case 3:
                HAVKqwFVy hAVKqwFVy = (HAVKqwFVy) obj;
                hAVKqwFVy.i8XZMQc6Z = 3;
                hAVKqwFVy.kmSgne1rO = null;
                hAVKqwFVy.i8XZMQc6Z = 4;
                hAVKqwFVy.Bhmn1KIah = null;
                int ordinal = ((BFRsKhrQv) obj3).ordinal();
                if (ordinal == 0) {
                    hAVKqwFVy.i8XZMQc6Z = 7;
                    hAVKqwFVy.ilHKhw3Yw = null;
                    hAVKqwFVy.i8XZMQc6Z = 8;
                    hAVKqwFVy.qVUwofr5s = null;
                } else if (ordinal == 1) {
                    hAVKqwFVy.i8XZMQc6Z = 5;
                    hAVKqwFVy.PSTqBLTET = null;
                    hAVKqwFVy.i8XZMQc6Z = 6;
                    hAVKqwFVy.MzoOEjc4X = null;
                }
                hAVKqwFVy.i8XZMQc6Z = 4;
                hAVKqwFVy.Bhmn1KIah = obj2;
                return hAVKqwFVy;
            default:
                D3PUCzPxK d3PUCzPxK = (D3PUCzPxK) obj;
                rJ0s9PfCL rj0s9pfcl = (rJ0s9PfCL) obj2;
                if (((((Number) obj3).intValue() & 81) ^ 16) == 0) {
                    wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j.i8XZMQc6Z()) {
                        wpxpbwg1j.igRQEZxnW();
                        return qih4lW99W.q3BipwRCk;
                    }
                }
                CxqHP5W0n.tGV7Q6urW(ODug2UCW1.o4LF8RkoQ(R.string.unpreload, rj0s9pfcl), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, rj0s9pfcl, 0, 0, 65534);
                return qih4lW99W.q3BipwRCk;
        }
    }
}
