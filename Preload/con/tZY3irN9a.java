package con;
/* loaded from: classes.dex */
public final class tZY3irN9a implements wjjWl3mHt {
    public final W39e6bnPN J4Ux7ym32;
    public final Enum[] q3BipwRCk;

    public tZY3irN9a(String str, Enum[] enumArr) {
        this.q3BipwRCk = enumArr;
        this.J4Ux7ym32 = anXlDk6fV.kCA6Zs9sL(str, UOgT70VGP.q3BipwRCk, new W39e6bnPN[0], new Idi5q1pZn(this, str));
    }

    @Override // con.NWqEIvIkR
    public Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        int ixWaw2akD = vobnba4s1.ixWaw2akD(this.J4Ux7ym32);
        boolean z = false;
        if (ixWaw2akD >= 0 && ixWaw2akD <= this.q3BipwRCk.length - 1) {
            z = true;
        }
        if (z) {
            return this.q3BipwRCk[ixWaw2akD];
        }
        throw new oPOFYJ4Sr(ixWaw2akD + " is not among valid " + this.J4Ux7ym32.dIocxURUo() + " enum values, values size is " + this.q3BipwRCk.length);
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return this.J4Ux7ym32;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("kotlinx.serialization.internal.EnumSerializer<");
        q3BipwRCk.append(this.J4Ux7ym32.dIocxURUo());
        q3BipwRCk.append('>');
        return q3BipwRCk.toString();
    }
}
