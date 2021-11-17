package con;
/* loaded from: classes.dex */
public abstract class qv9mRCVmB {
    public static String J4Ux7ym32(int i) {
        return q3BipwRCk(i, 1) ? "Text" : q3BipwRCk(i, 2) ? "Ascii" : q3BipwRCk(i, 3) ? "Number" : q3BipwRCk(i, 4) ? "Phone" : q3BipwRCk(i, 5) ? "Uri" : q3BipwRCk(i, 6) ? "Email" : q3BipwRCk(i, 7) ? "Password" : q3BipwRCk(i, 8) ? "NumberPassword" : "Invalid";
    }

    public static final boolean q3BipwRCk(int i, int i2) {
        return i == i2;
    }
}
