package con;
/* loaded from: classes.dex */
public abstract class mUgAoJZpo {
    public static final String q3BipwRCk;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i == 10) {
                        break;
                    }
                    i++;
                }
                str = sb.toString();
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    cArr[i2] = charAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        q3BipwRCk = str;
    }

    public static final long q3BipwRCk(GjhoS54Hf gjhoS54Hf, AU29aHa4X aU29aHa4X, C2cgp32t9 c2cgp32t9, String str, int i) {
        Dqz1pJHWH dqz1pJHWH = Dqz1pJHWH.CBQ5d1kRq;
        AyMB2YALh ayMB2YALh = new AyMB2YALh(str, gjhoS54Hf, dqz1pJHWH, dqz1pJHWH, new FeKFMR1ai(null, c2cgp32t9, 1), aU29aHa4X);
        return D3DEikrvb.dIocxURUo(D3DEikrvb.Eeka1udhb((float) Math.ceil((double) ayMB2YALh.q3BipwRCk())), D3DEikrvb.Eeka1udhb((float) Math.ceil((double) new IosOyUQuh(ayMB2YALh, i, false, Float.POSITIVE_INFINITY).q3BipwRCk())));
    }
}
