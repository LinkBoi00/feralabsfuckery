package con;
/* loaded from: classes.dex */
public final class Hncu9o7E0 implements Jv1Fju7cm {
    public static final Hncu9o7E0 dIocxURUo = new Hncu9o7E0(null);
    public final IOYQk1Nz8 J4Ux7ym32;
    public final lWcW85d4y q3BipwRCk;
    public final Le3QZ1StH tGV7Q6urW = new Le3QZ1StH(2);

    public Hncu9o7E0(dnBSj5uJN dnbsj5ujn) {
        lWcW85d4y lwcw85d4y = new lWcW85d4y(false, false, false, false, false, false, null, false, false, null, false, false, 4095);
        IOYQk1Nz8 iOYQk1Nz8 = ND8vvY269.q3BipwRCk;
        this.q3BipwRCk = lwcw85d4y;
        this.J4Ux7ym32 = iOYQk1Nz8;
    }

    public final Object q3BipwRCk(NWqEIvIkR nWqEIvIkR, String str) {
        JyP4fsVuo jyP4fsVuo = new JyP4fsVuo(str);
        Object dIocxURUo2 = cOutqbkMD.dIocxURUo(new jVasboRrd(this, 1, jyP4fsVuo, nWqEIvIkR.q3BipwRCk()), nWqEIvIkR);
        if (jyP4fsVuo.yWvV4ePLl() == 10) {
            return dIocxURUo2;
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Expected EOF after parsing an object, but had ");
        q3BipwRCk.append(str.charAt(jyP4fsVuo.q3BipwRCk - 1));
        q3BipwRCk.append(" instead");
        JyP4fsVuo.dXrmkklc8(jyP4fsVuo, q3BipwRCk.toString(), 0, 2, null);
        throw null;
    }
}
