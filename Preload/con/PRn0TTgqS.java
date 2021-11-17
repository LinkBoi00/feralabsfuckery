package con;
/* loaded from: classes.dex */
public final class PRn0TTgqS {
    public buIjhcyx1 J4Ux7ym32;
    public String q3BipwRCk;
    public int tGV7Q6urW = -1;
    public int dIocxURUo = -1;

    public PRn0TTgqS(String str) {
        this.q3BipwRCk = str;
    }

    public final void J4Ux7ym32(int i, int i2, String str) {
        int i3;
        buIjhcyx1 buijhcyx1 = this.J4Ux7ym32;
        if (buijhcyx1 == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.q3BipwRCk.length() - i2, 64);
            String str2 = this.q3BipwRCk;
            int i4 = i - min;
            for (int i5 = i4; i5 < i; i5++) {
                cArr[(0 + i5) - i4] = str2.charAt(i5);
            }
            String str3 = this.q3BipwRCk;
            int i6 = max - min2;
            int i7 = i2 + min2;
            for (int i8 = i2; i8 < i7; i8++) {
                cArr[(i6 + i8) - i2] = str3.charAt(i8);
            }
            ODug2UCW1.V9LQMKGJe(str, cArr, min, 0, 0, 12);
            this.J4Ux7ym32 = new buIjhcyx1(cArr, str.length() + min, i6);
            this.tGV7Q6urW = i4;
            this.dIocxURUo = i7;
            return;
        }
        int i9 = this.tGV7Q6urW;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > buijhcyx1.J4Ux7ym32()) {
            this.q3BipwRCk = toString();
            this.J4Ux7ym32 = null;
            this.tGV7Q6urW = -1;
            this.dIocxURUo = -1;
            J4Ux7ym32(i, i2, str);
            return;
        }
        int length = str.length() - (i11 - i10);
        if (length > buijhcyx1.q3BipwRCk()) {
            int q3BipwRCk = length - buijhcyx1.q3BipwRCk();
            int i12 = buijhcyx1.q3BipwRCk;
            do {
                i12 *= 2;
            } while (i12 - buijhcyx1.q3BipwRCk < q3BipwRCk);
            char[] cArr2 = new char[i12];
            System.arraycopy(buijhcyx1.J4Ux7ym32, 0, cArr2, 0, buijhcyx1.tGV7Q6urW - 0);
            int i13 = buijhcyx1.q3BipwRCk;
            int i14 = buijhcyx1.dIocxURUo;
            int i15 = i13 - i14;
            int i16 = i12 - i15;
            System.arraycopy(buijhcyx1.J4Ux7ym32, i14, cArr2, i16, (i15 + i14) - i14);
            buijhcyx1.J4Ux7ym32 = cArr2;
            buijhcyx1.q3BipwRCk = i12;
            buijhcyx1.dIocxURUo = i16;
        }
        int i17 = buijhcyx1.tGV7Q6urW;
        if (i10 < i17 && i11 <= i17) {
            int i18 = i17 - i11;
            char[] cArr3 = buijhcyx1.J4Ux7ym32;
            System.arraycopy(cArr3, i11, cArr3, buijhcyx1.dIocxURUo - i18, i18);
            buijhcyx1.tGV7Q6urW = i10;
            i3 = buijhcyx1.dIocxURUo - i18;
        } else if (i10 >= i17 || i11 < i17) {
            i3 = buijhcyx1.q3BipwRCk() + i11;
            int i19 = buijhcyx1.dIocxURUo;
            int q3BipwRCk2 = (buijhcyx1.q3BipwRCk() + i10) - i19;
            char[] cArr4 = buijhcyx1.J4Ux7ym32;
            System.arraycopy(cArr4, i19, cArr4, buijhcyx1.tGV7Q6urW, q3BipwRCk2);
            buijhcyx1.tGV7Q6urW += q3BipwRCk2;
        } else {
            buijhcyx1.dIocxURUo = buijhcyx1.q3BipwRCk() + i11;
            buijhcyx1.tGV7Q6urW = i10;
            ODug2UCW1.V9LQMKGJe(str, buijhcyx1.J4Ux7ym32, buijhcyx1.tGV7Q6urW, 0, 0, 12);
            buijhcyx1.tGV7Q6urW = str.length() + buijhcyx1.tGV7Q6urW;
        }
        buijhcyx1.dIocxURUo = i3;
        ODug2UCW1.V9LQMKGJe(str, buijhcyx1.J4Ux7ym32, buijhcyx1.tGV7Q6urW, 0, 0, 12);
        buijhcyx1.tGV7Q6urW = str.length() + buijhcyx1.tGV7Q6urW;
    }

    public final int q3BipwRCk() {
        buIjhcyx1 buijhcyx1 = this.J4Ux7ym32;
        if (buijhcyx1 == null) {
            return this.q3BipwRCk.length();
        }
        return buijhcyx1.J4Ux7ym32() + (this.q3BipwRCk.length() - (this.dIocxURUo - this.tGV7Q6urW));
    }

    public String toString() {
        buIjhcyx1 buijhcyx1 = this.J4Ux7ym32;
        if (buijhcyx1 == null) {
            return this.q3BipwRCk;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.q3BipwRCk, 0, this.tGV7Q6urW);
        sb.append(buijhcyx1.J4Ux7ym32, 0, buijhcyx1.tGV7Q6urW);
        char[] cArr = buijhcyx1.J4Ux7ym32;
        int i = buijhcyx1.dIocxURUo;
        sb.append(cArr, i, buijhcyx1.q3BipwRCk - i);
        String str = this.q3BipwRCk;
        sb.append((CharSequence) str, this.dIocxURUo, str.length());
        return sb.toString();
    }
}
