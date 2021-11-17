package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class JyP4fsVuo {
    public String J4Ux7ym32;
    public final String dIocxURUo;
    public int q3BipwRCk;
    public StringBuilder tGV7Q6urW = new StringBuilder();

    public JyP4fsVuo(String str) {
        this.dIocxURUo = str;
    }

    public static Void dXrmkklc8(JyP4fsVuo jyP4fsVuo, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = jyP4fsVuo.q3BipwRCk;
        }
        throw Ot2IiNSkx.tGV7Q6urW(i, str, jyP4fsVuo.dIocxURUo);
    }

    public final String Bhmn1KIah() {
        if (this.J4Ux7ym32 != null) {
            return i8XZMQc6Z();
        }
        int sk5s77z6Q = sk5s77z6Q();
        if (sk5s77z6Q >= this.dIocxURUo.length() || sk5s77z6Q == -1) {
            throw Ot2IiNSkx.tGV7Q6urW(sk5s77z6Q, "EOF", this.dIocxURUo);
        }
        byte q3BipwRCk = bqV8ECpZf.q3BipwRCk(this.dIocxURUo.charAt(sk5s77z6Q));
        if (q3BipwRCk == 1) {
            return kmSgne1rO();
        }
        if (q3BipwRCk == 0) {
            boolean z = false;
            while (bqV8ECpZf.q3BipwRCk(this.dIocxURUo.charAt(sk5s77z6Q)) == 0) {
                sk5s77z6Q++;
                if (sk5s77z6Q >= this.dIocxURUo.length()) {
                    dIocxURUo(this.q3BipwRCk, sk5s77z6Q);
                    int ilHKhw3Yw = ilHKhw3Yw(sk5s77z6Q);
                    if (ilHKhw3Yw == -1) {
                        this.q3BipwRCk = sk5s77z6Q;
                        return MzoOEjc4X(0, 0);
                    }
                    sk5s77z6Q = ilHKhw3Yw;
                    z = true;
                }
            }
            int i = this.q3BipwRCk;
            String WaUP0CF08 = !z ? WaUP0CF08(i, sk5s77z6Q) : MzoOEjc4X(i, sk5s77z6Q);
            this.q3BipwRCk = sk5s77z6Q;
            return WaUP0CF08;
        }
        dXrmkklc8(this, anXlDk6fV.iMyQMM6Qj("Expected beginning of the string, but got ", Character.valueOf(this.dIocxURUo.charAt(sk5s77z6Q))), 0, 2, null);
        throw null;
    }

    public final long CBQ5d1kRq() {
        boolean z;
        int ilHKhw3Yw = ilHKhw3Yw(sk5s77z6Q());
        int i = 0;
        int i2 = 2;
        if (ilHKhw3Yw >= this.dIocxURUo.length() || ilHKhw3Yw == -1) {
            dXrmkklc8(this, "EOF", 0, 2, null);
            throw null;
        }
        if (this.dIocxURUo.charAt(ilHKhw3Yw) == '\"') {
            ilHKhw3Yw++;
            if (ilHKhw3Yw != this.dIocxURUo.length()) {
                z = true;
            } else {
                dXrmkklc8(this, "EOF", 0, 2, null);
                throw null;
            }
        } else {
            z = false;
        }
        int i3 = ilHKhw3Yw;
        boolean z2 = false;
        int i4 = 1;
        long j = 0;
        while (i4 != 0) {
            char charAt = this.dIocxURUo.charAt(i3);
            if (charAt == '-') {
                if (i3 == ilHKhw3Yw) {
                    i3++;
                    z2 = true;
                } else {
                    dXrmkklc8(this, "Unexpected symbol '-' in numeric literal", i, i2, null);
                    throw null;
                }
            } else if (bqV8ECpZf.q3BipwRCk(charAt) != 0) {
                break;
            } else {
                i3++;
                i4 = i3 != this.dIocxURUo.length() ? 1 : i;
                int i5 = charAt - '0';
                if (((i5 < 0 || i5 > 9) ? i : 1) != 0) {
                    j = (j * ((long) 10)) - ((long) i5);
                    if (j <= 0) {
                        i = 0;
                        i2 = 2;
                    } else {
                        dXrmkklc8(this, "Numeric value overflow", 0, 2, null);
                        throw null;
                    }
                } else {
                    dXrmkklc8(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, i2, null);
                    throw null;
                }
            }
        }
        if (ilHKhw3Yw == i3 || (z2 && ilHKhw3Yw == i3 - 1)) {
            dXrmkklc8(this, "Expected numeric literal", 0, 2, null);
            throw null;
        }
        if (z) {
            if (i4 == 0) {
                dXrmkklc8(this, "EOF", 0, 2, null);
                throw null;
            } else if (this.dIocxURUo.charAt(i3) == '\"') {
                i3++;
            } else {
                dXrmkklc8(this, "Expected closing quotation mark", 0, 2, null);
                throw null;
            }
        }
        this.q3BipwRCk = i3;
        if (z2) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        dXrmkklc8(this, "Numeric value overflow", 0, 2, null);
        throw null;
    }

    public final void Eeka1udhb(byte b) {
        int i;
        String str = b == 1 ? "quotation mark '\"'" : b == 4 ? "comma ','" : b == 5 ? "semicolon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : "valid token";
        String valueOf = (this.q3BipwRCk == this.dIocxURUo.length() || (i = this.q3BipwRCk) <= 0) ? "EOF" : String.valueOf(this.dIocxURUo.charAt(i - 1));
        qVUwofr5s("Expected " + str + ", but had '" + valueOf + "' instead", this.q3BipwRCk - 1);
        throw null;
    }

    public final void GPLPRo6go(String str, int i) {
        if (this.dIocxURUo.length() - i >= str.length()) {
            int length = str.length() - 1;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (str.charAt(i2) != (this.dIocxURUo.charAt(i2 + i) | ' ')) {
                        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Expected valid boolean literal prefix, but had '");
                        q3BipwRCk.append(Bhmn1KIah());
                        q3BipwRCk.append('\'');
                        dXrmkklc8(this, q3BipwRCk.toString(), 0, 2, null);
                        throw null;
                    } else if (i3 > length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            this.q3BipwRCk = str.length() + i;
            return;
        }
        dXrmkklc8(this, "Unexpected end of boolean literal", 0, 2, null);
        throw null;
    }

    public final boolean IytU16YUK() {
        return this.dIocxURUo.charAt(this.q3BipwRCk - 1) != '\"';
    }

    public final int J4Ux7ym32(int i, int i2) {
        this.tGV7Q6urW.append((CharSequence) this.dIocxURUo, i, i2);
        return q3BipwRCk(i2 + 1);
    }

    public final String MzoOEjc4X(int i, int i2) {
        this.tGV7Q6urW.append((CharSequence) this.dIocxURUo, i, i2);
        String sb = this.tGV7Q6urW.toString();
        this.tGV7Q6urW.setLength(0);
        return sb;
    }

    public final String PSTqBLTET() {
        String Bhmn1KIah = Bhmn1KIah();
        if (!anXlDk6fV.tGV7Q6urW(Bhmn1KIah, "null") || !IytU16YUK()) {
            return Bhmn1KIah;
        }
        dXrmkklc8(this, "Unexpected 'null' value instead of string literal", 0, 2, null);
        throw null;
    }

    public String Puu3Rhg4F() {
        vPSbyrYWX('\"');
        int i = this.q3BipwRCk;
        boolean z = false;
        int QNqj6nIzv = r6NbD4wnj.QNqj6nIzv(this.dIocxURUo, '\"', i, false, 4);
        if (QNqj6nIzv != -1) {
            if (i < QNqj6nIzv) {
                int i2 = i;
                while (true) {
                    int i3 = i2 + 1;
                    if (this.dIocxURUo.charAt(i2) == '\\') {
                        String str = this.dIocxURUo;
                        int i4 = this.q3BipwRCk;
                        while (true) {
                            char charAt = str.charAt(i2);
                            if (charAt != '\"') {
                                if (charAt == '\\') {
                                    i4 = J4Ux7ym32(i4, i2);
                                } else {
                                    i2++;
                                    if (i2 >= str.length()) {
                                        dIocxURUo(i4, i2);
                                        i4 = ilHKhw3Yw(i2);
                                        if (i4 == -1) {
                                            throw Ot2IiNSkx.tGV7Q6urW(i4, "EOF", this.dIocxURUo);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i2 = i4;
                                z = true;
                            } else {
                                String WaUP0CF08 = !z ? WaUP0CF08(i4, i2) : MzoOEjc4X(i4, i2);
                                this.q3BipwRCk = i2 + 1;
                                return WaUP0CF08;
                            }
                        }
                    } else if (i3 >= QNqj6nIzv) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            this.q3BipwRCk = QNqj6nIzv + 1;
            String str2 = this.dIocxURUo;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            return str2.substring(i, QNqj6nIzv);
        }
        Eeka1udhb((byte) 1);
        throw null;
    }

    public final int RG6kpfv3v(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        boolean z = true;
        if ('0' <= charAt && charAt <= '9') {
            return charAt - '0';
        }
        char c = 'a';
        if (!('a' <= charAt && charAt <= 'f')) {
            c = 'A';
            if ('A' > charAt || charAt > 'F') {
                z = false;
            }
            if (!z) {
                dXrmkklc8(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 2, null);
                throw null;
            }
        }
        return (charAt - c) + 10;
    }

    public String WaUP0CF08(int i, int i2) {
        return this.dIocxURUo.subSequence(i, i2).toString();
    }

    public final void cAwN510t2(char c) {
        int i = this.q3BipwRCk - 1;
        this.q3BipwRCk = i;
        if (i < 0 || c != '\"' || !anXlDk6fV.tGV7Q6urW(Bhmn1KIah(), "null")) {
            Eeka1udhb(bqV8ECpZf.q3BipwRCk(c));
            throw null;
        }
        throw Ot2IiNSkx.tGV7Q6urW(this.q3BipwRCk - 4, "Expected string literal but 'null' literal was found.\nUse 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.", this.dIocxURUo);
    }

    public void dIocxURUo(int i, int i2) {
        this.tGV7Q6urW.append((CharSequence) this.dIocxURUo, i, i2);
    }

    public boolean dfpT1j18n() {
        int sk5s77z6Q = sk5s77z6Q();
        if (sk5s77z6Q == this.dIocxURUo.length() || sk5s77z6Q == -1 || this.dIocxURUo.charAt(sk5s77z6Q) != ',') {
            return false;
        }
        this.q3BipwRCk++;
        return true;
    }

    public final String i8XZMQc6Z() {
        String str = this.J4Ux7ym32;
        this.J4Ux7ym32 = null;
        return str;
    }

    public final boolean iMyQMM6Qj() {
        int ilHKhw3Yw = ilHKhw3Yw(sk5s77z6Q());
        int length = this.dIocxURUo.length() - ilHKhw3Yw;
        if (length < 4 || ilHKhw3Yw == -1) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if ("null".charAt(i) != this.dIocxURUo.charAt(i + ilHKhw3Yw)) {
                return true;
            }
            if (i2 <= 3) {
                i = i2;
            } else if (length > 4 && bqV8ECpZf.q3BipwRCk(this.dIocxURUo.charAt(ilHKhw3Yw + 4)) == 0) {
                return true;
            } else {
                this.q3BipwRCk = ilHKhw3Yw + 4;
                return false;
            }
        }
    }

    public final boolean iiGwOFFnr(int i) {
        if (i >= this.dIocxURUo.length()) {
            i = -1;
        }
        if (i >= this.dIocxURUo.length() || i == -1) {
            dXrmkklc8(this, "EOF", 0, 2, null);
            throw null;
        }
        int i2 = i + 1;
        int charAt = this.dIocxURUo.charAt(i) | ' ';
        if (charAt == 116) {
            GPLPRo6go("rue", i2);
            return true;
        } else if (charAt == 102) {
            GPLPRo6go("alse", i2);
            return false;
        } else {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Expected valid boolean literal prefix, but had '");
            q3BipwRCk.append(Bhmn1KIah());
            q3BipwRCk.append('\'');
            dXrmkklc8(this, q3BipwRCk.toString(), 0, 2, null);
            throw null;
        }
    }

    public int ilHKhw3Yw(int i) {
        if (i < this.dIocxURUo.length()) {
            return i;
        }
        return -1;
    }

    public final byte ixWaw2akD() {
        String str = this.dIocxURUo;
        int i = this.q3BipwRCk;
        while (true) {
            int ilHKhw3Yw = ilHKhw3Yw(i);
            if (ilHKhw3Yw == -1) {
                this.q3BipwRCk = ilHKhw3Yw;
                return 10;
            }
            char charAt = str.charAt(ilHKhw3Yw);
            if (charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t') {
                i = ilHKhw3Yw + 1;
            } else {
                this.q3BipwRCk = ilHKhw3Yw;
                return bqV8ECpZf.q3BipwRCk(charAt);
            }
        }
    }

    public boolean kCA6Zs9sL() {
        int i = this.q3BipwRCk;
        boolean z = false;
        if (i == -1) {
            return false;
        }
        while (i < this.dIocxURUo.length()) {
            char charAt = this.dIocxURUo.charAt(i);
            if (charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t') {
                i++;
            } else {
                this.q3BipwRCk = i;
                if (((charAt == '}' || charAt == ']') || charAt == ':') || charAt == ',') {
                    z = true;
                }
                return !z;
            }
        }
        this.q3BipwRCk = i;
        return false;
    }

    public final String kmSgne1rO() {
        return this.J4Ux7ym32 != null ? i8XZMQc6Z() : Puu3Rhg4F();
    }

    public final byte oon79WMrY(byte b) {
        byte yWvV4ePLl = yWvV4ePLl();
        if (yWvV4ePLl == b) {
            return yWvV4ePLl;
        }
        Eeka1udhb(b);
        throw null;
    }

    public final int q3BipwRCk(int i) {
        if (i >= this.dIocxURUo.length()) {
            i = -1;
        }
        if (i != -1) {
            int i2 = i + 1;
            char charAt = this.dIocxURUo.charAt(i);
            if (charAt == 'u') {
                return tGV7Q6urW(this.dIocxURUo, i2);
            }
            char c = charAt < 'u' ? GabIU2lD1.J4Ux7ym32[charAt] : 0;
            if (c != 0) {
                this.tGV7Q6urW.append(c);
                return i2;
            }
            dXrmkklc8(this, "Invalid escaped char '" + charAt + '\'', 0, 2, null);
            throw null;
        }
        dXrmkklc8(this, "Expected escape sequence to continue, got EOF", 0, 2, null);
        throw null;
    }

    public final Void qVUwofr5s(String str, int i) {
        throw Ot2IiNSkx.tGV7Q6urW(i, str, this.dIocxURUo);
    }

    public int sk5s77z6Q() {
        int i = this.q3BipwRCk;
        if (i == -1) {
            return i;
        }
        while (i < this.dIocxURUo.length() && ((r1 = this.dIocxURUo.charAt(i)) == ' ' || r1 == '\n' || r1 == '\r' || r1 == '\t')) {
            i++;
        }
        this.q3BipwRCk = i;
        return i;
    }

    public final int tGV7Q6urW(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.tGV7Q6urW.append((char) (RG6kpfv3v(charSequence, i + 3) + (RG6kpfv3v(charSequence, i) << 12) + (RG6kpfv3v(charSequence, i + 1) << 8) + (RG6kpfv3v(charSequence, i + 2) << 4)));
            return i2;
        }
        dXrmkklc8(this, "Unexpected EOF during unicode escape", 0, 2, null);
        throw null;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("JsonReader(source='");
        q3BipwRCk.append((Object) this.dIocxURUo);
        q3BipwRCk.append("', currentPosition=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.q3BipwRCk, ')');
    }

    public void vPSbyrYWX(char c) {
        if (this.q3BipwRCk != -1) {
            String str = this.dIocxURUo;
            while (this.q3BipwRCk < str.length()) {
                int i = this.q3BipwRCk;
                this.q3BipwRCk = i + 1;
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt != c) {
                        cAwN510t2(c);
                        throw null;
                    }
                    return;
                }
            }
            cAwN510t2(c);
            throw null;
        }
        cAwN510t2(c);
        throw null;
    }

    public byte yWvV4ePLl() {
        byte q3BipwRCk;
        String str = this.dIocxURUo;
        do {
            int i = this.q3BipwRCk;
            if (i == -1 || i >= str.length()) {
                return 10;
            }
            int i2 = this.q3BipwRCk;
            this.q3BipwRCk = i2 + 1;
            q3BipwRCk = bqV8ECpZf.q3BipwRCk(str.charAt(i2));
        } while (q3BipwRCk == 3);
        return q3BipwRCk;
    }
}
