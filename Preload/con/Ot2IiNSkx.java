package con;
/* loaded from: classes.dex */
public abstract class Ot2IiNSkx {
    public static final k21lZSJHT J4Ux7ym32(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new k21lZSJHT(str);
    }

    public static final CharSequence dIocxURUo(CharSequence charSequence, int i) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str = ".....";
        if (i == -1) {
            int length = charSequence.length() - 60;
            return length <= 0 ? charSequence : anXlDk6fV.iMyQMM6Qj(str, charSequence.subSequence(length, charSequence.length()).toString());
        }
        int i2 = i - 30;
        int i3 = i + 30;
        String str2 = i2 <= 0 ? "" : str;
        if (i3 >= charSequence.length()) {
            str = "";
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(str2);
        i2 = 0;
        if (i2 < 0) {
        }
        int length2 = charSequence.length();
        if (i3 > length2) {
            i3 = length2;
        }
        q3BipwRCk.append(charSequence.subSequence(i2, i3).toString());
        q3BipwRCk.append(str);
        return q3BipwRCk.toString();
    }

    public static final Void kCA6Zs9sL(JyP4fsVuo jyP4fsVuo, Number number) {
        JyP4fsVuo.dXrmkklc8(jyP4fsVuo, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 0, 2, null);
        throw null;
    }

    public static final PvyYO7Arq q3BipwRCk(W39e6bnPN w39e6bnPN) {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Value of type '");
        q3BipwRCk.append(w39e6bnPN.dIocxURUo());
        q3BipwRCk.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        q3BipwRCk.append(w39e6bnPN.yWvV4ePLl());
        q3BipwRCk.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new PvyYO7Arq(q3BipwRCk.toString());
    }

    public static final k21lZSJHT tGV7Q6urW(int i, String str, CharSequence charSequence) {
        return J4Ux7ym32(i, str + "\nJSON input: " + ((Object) dIocxURUo(charSequence, i)));
    }
}
