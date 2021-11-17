package con;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class emCil6bAE {
    public static final Map q3BipwRCk = s0tSbdszx.AqaWJg0b4(new n4f84B5OG(YGTdT21e3.q3BipwRCk(String.class), smQtjXFxp.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Character.TYPE), AlZSSeD49.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(char[].class), iqpcdfvjs.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Double.TYPE), FMv443bPP.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(double[].class), cNbU56l9r.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Float.TYPE), JwfU1E5pc.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(float[].class), tnwU7LYNo.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Long.TYPE), SKjOgOq86.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(long[].class), lRYdUpxUj.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Integer.TYPE), kjqdVymBu.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(int[].class), c3VgdcdyZ.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Short.TYPE), K6dVvwIjj.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(short[].class), NMaQdsmkN.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Byte.TYPE), ttqVrKbQ6.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(byte[].class), jzB2ka0cL.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(Boolean.TYPE), NjamaLaV2.q3BipwRCk), new n4f84B5OG(YGTdT21e3.q3BipwRCk(boolean[].class), b6dpo8USj.tGV7Q6urW), new n4f84B5OG(YGTdT21e3.q3BipwRCk(qih4lW99W.class), bqxQ4FVMn.J4Ux7ym32));

    public static final String q3BipwRCk(String str) {
        String str2;
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            String valueOf = String.valueOf(charAt);
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            str2 = valueOf.toUpperCase(locale);
            if (str2.length() <= 1) {
                str2 = String.valueOf(Character.toTitleCase(charAt));
            } else if (charAt != 329) {
                char charAt2 = str2.charAt(0);
                str2 = String.valueOf(charAt2) + str2.substring(1).toLowerCase(locale);
            }
        } else {
            str2 = String.valueOf(charAt);
        }
        sb.append(str2.toString());
        sb.append(str.substring(1));
        return sb.toString();
    }
}
