package con;
/* loaded from: classes.dex */
public abstract class wAtO2xjDY {
    public static final A8uSID1ll q3BipwRCk(float f, float f2, float f3, float f4, rJ0s9PfCL rj0s9pfcl, int i) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(795787729);
        if ((i & 1) != 0) {
            f = (float) 6;
        }
        if ((i & 2) != 0) {
            f2 = (float) 12;
        }
        if ((i & 4) != 0) {
            f3 = (float) 8;
        }
        if ((i & 8) != 0) {
            f4 = (float) 8;
        }
        Object[] objArr = {new lRwPpHNL9(f), new lRwPpHNL9(f2), new lRwPpHNL9(f3), new lRwPpHNL9(f4)};
        wpxpbwg1j.zHl31GGXU(-3685570);
        int i2 = 0;
        boolean z = false;
        while (i2 < 4) {
            Object obj = objArr[i2];
            i2++;
            z |= wpxpbwg1j.iiGwOFFnr(obj);
        }
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        if (z || dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            dfpT1j18n = new A8uSID1ll(f, f2, f3, f4, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        A8uSID1ll a8uSID1ll = (A8uSID1ll) dfpT1j18n;
        wpxpbwg1j.ilHKhw3Yw(false);
        return a8uSID1ll;
    }
}
