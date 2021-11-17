package con;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
/* loaded from: classes.dex */
public final class oA6YPOuZA implements wjjWl3mHt {
    public static final W39e6bnPN J4Ux7ym32;
    public static final oA6YPOuZA q3BipwRCk = new oA6YPOuZA();

    static {
        J4Ux7ym32 = anXlDk6fV.kCA6Zs9sL("kotlinx.serialization.json.JsonPrimitive", sd7KBTZux.q3BipwRCk, new W39e6bnPN[0], (r4 & 8) != 0 ? GQN3dSqKV.o4LF8RkoQ : null);
    }

    @Override // con.NWqEIvIkR
    public Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        JsonElement dIocxURUo = rTcohQ78k.J4Ux7ym32(vobnba4s1).dIocxURUo();
        if (dIocxURUo instanceof JsonPrimitive) {
            return (JsonPrimitive) dIocxURUo;
        }
        throw Ot2IiNSkx.tGV7Q6urW(-1, anXlDk6fV.iMyQMM6Qj("Unexpected JSON element, expected JsonPrimitive, had ", YGTdT21e3.q3BipwRCk(dIocxURUo.getClass())), dIocxURUo.toString());
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return J4Ux7ym32;
    }
}
