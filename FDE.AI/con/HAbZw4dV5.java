package con;

import kotlinx.serialization.json.JsonNull;
/* loaded from: classes.dex */
public final class HAbZw4dV5 implements wjjWl3mHt {
    public static final W39e6bnPN J4Ux7ym32;
    public static final HAbZw4dV5 q3BipwRCk = new HAbZw4dV5();

    static {
        J4Ux7ym32 = anXlDk6fV.kCA6Zs9sL("kotlinx.serialization.json.JsonNull", UOgT70VGP.q3BipwRCk, new W39e6bnPN[0], (r4 & 8) != 0 ? GQN3dSqKV.o4LF8RkoQ : null);
    }

    @Override // con.NWqEIvIkR
    public Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        rTcohQ78k.J4Ux7ym32(vobnba4s1);
        if (!vobnba4s1.yWvV4ePLl()) {
            vobnba4s1.ilHKhw3Yw();
            return JsonNull.q3BipwRCk;
        }
        throw new k21lZSJHT("Expected 'null' literal");
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return J4Ux7ym32;
    }
}
