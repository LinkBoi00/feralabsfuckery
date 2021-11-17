package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class hrmqyyOPt {
    public final int q3BipwRCk;
    public static final hrmqyyOPt J4Ux7ym32 = new hrmqyyOPt(0);
    public static final hrmqyyOPt tGV7Q6urW = new hrmqyyOPt(1);
    public static final hrmqyyOPt dIocxURUo = new hrmqyyOPt(2);

    public hrmqyyOPt(int i) {
        this.q3BipwRCk = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrmqyyOPt) && this.q3BipwRCk == ((hrmqyyOPt) obj).q3BipwRCk;
    }

    public int hashCode() {
        return this.q3BipwRCk;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[LOOP:0: B:18:0x004d->B:32:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[EDGE_INSN: B:35:0x0080->B:33:0x0080 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public String toString() {
        boolean z;
        CharSequence charSequence;
        if (this.q3BipwRCk == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.q3BipwRCk & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.q3BipwRCk & 2) != 0) {
            arrayList.add("LineThrough");
        }
        int i = 0;
        if (arrayList.size() == 1) {
            return anXlDk6fV.iMyQMM6Qj("TextDecoration.", arrayList.get(0));
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextDecoration[");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                Object obj = arrayList.get(i);
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    charSequence = (CharSequence) obj;
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    if (i3 <= size) {
                        break;
                    }
                    i = i3;
                } else {
                    charSequence = String.valueOf(obj);
                }
                sb.append(charSequence);
                if (i3 <= size) {
                }
            }
        }
        sb.append((CharSequence) "");
        q3BipwRCk.append(sb.toString());
        q3BipwRCk.append(']');
        return q3BipwRCk.toString();
    }
}
