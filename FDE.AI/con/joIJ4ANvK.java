package con;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class joIJ4ANvK implements CharSequence {
    public final List Bhmn1KIah;
    public final String CBQ5d1kRq;
    public final List PSTqBLTET;
    public final List kmSgne1rO;

    public joIJ4ANvK(String str, List list, List list2, int i) {
        this(str, (i & 2) != 0 ? Dqz1pJHWH.CBQ5d1kRq : list, (i & 4) != 0 ? Dqz1pJHWH.CBQ5d1kRq : null, Dqz1pJHWH.CBQ5d1kRq);
    }

    /* renamed from: J4Ux7ym32 */
    public joIJ4ANvK subSequence(int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.CBQ5d1kRq.length()) {
            return this;
        } else {
            String str = this.CBQ5d1kRq;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            return new joIJ4ANvK(str.substring(i, i2), SXpWpmH9A.q3BipwRCk(this.kmSgne1rO, i, i2), SXpWpmH9A.q3BipwRCk(this.Bhmn1KIah, i, i2), SXpWpmH9A.q3BipwRCk(this.PSTqBLTET, i, i2));
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.CBQ5d1kRq.charAt(i);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joIJ4ANvK)) {
            return false;
        }
        joIJ4ANvK joij4anvk = (joIJ4ANvK) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, joij4anvk.CBQ5d1kRq) && anXlDk6fV.tGV7Q6urW(this.kmSgne1rO, joij4anvk.kmSgne1rO) && anXlDk6fV.tGV7Q6urW(this.Bhmn1KIah, joij4anvk.Bhmn1KIah) && anXlDk6fV.tGV7Q6urW(this.PSTqBLTET, joij4anvk.PSTqBLTET);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = this.kmSgne1rO.hashCode();
        int hashCode2 = this.Bhmn1KIah.hashCode();
        return this.PSTqBLTET.hashCode() + ((hashCode2 + ((hashCode + (this.CBQ5d1kRq.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.CBQ5d1kRq.length();
    }

    public final joIJ4ANvK q3BipwRCk(joIJ4ANvK joij4anvk) {
        rKKfiOTQO rkkfiotqo = new rKKfiOTQO(0, 1);
        rkkfiotqo.tGV7Q6urW(this);
        rkkfiotqo.tGV7Q6urW(joij4anvk);
        return rkkfiotqo.GPLPRo6go();
    }

    @Override // java.lang.CharSequence, java.lang.Object
    public String toString() {
        return this.CBQ5d1kRq;
    }

    public joIJ4ANvK(String str, List list, List list2, List list3) {
        this.CBQ5d1kRq = str;
        this.kmSgne1rO = list;
        this.Bhmn1KIah = list2;
        this.PSTqBLTET = list3;
        int i = -1;
        int size = list2.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) list2.get(i2);
                boolean z = true;
                if (lzuuvzcu0.J4Ux7ym32 >= i) {
                    if (lzuuvzcu0.tGV7Q6urW > this.CBQ5d1kRq.length() ? false : z) {
                        i = lzuuvzcu0.tGV7Q6urW;
                        if (i3 <= size) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ParagraphStyle range [");
                        q3BipwRCk.append(lzuuvzcu0.J4Ux7ym32);
                        q3BipwRCk.append(", ");
                        q3BipwRCk.append(lzuuvzcu0.tGV7Q6urW);
                        q3BipwRCk.append(") is out of boundary");
                        throw new IllegalArgumentException(q3BipwRCk.toString().toString());
                    }
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }
}
