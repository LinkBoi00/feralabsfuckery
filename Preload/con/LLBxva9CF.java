package con;

import kotlinx.serialization.json.JsonElement;
/* loaded from: classes.dex */
public final class LLBxva9CF implements wjjWl3mHt {
    public static final W39e6bnPN J4Ux7ym32;
    public static final LLBxva9CF q3BipwRCk = new LLBxva9CF();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    static {
        sd7KBTZux sd7kbtzux = sd7KBTZux.q3BipwRCk;
        if (!r6NbD4wnj.EBQXiIPmm("kotlinx.serialization.json.JsonLiteral")) {
            for (WwFGbLVWX wwFGbLVWX : emCil6bAE.q3BipwRCk.keySet()) {
                String q3BipwRCk2 = emCil6bAE.q3BipwRCk(((Ej3Qf1wRO) wwFGbLVWX).J4Ux7ym32());
                if (r6NbD4wnj.NyWTwPF6V("kotlinx.serialization.json.JsonLiteral", anXlDk6fV.iMyQMM6Qj("kotlin.", q3BipwRCk2), true) || r6NbD4wnj.NyWTwPF6V("kotlinx.serialization.json.JsonLiteral", q3BipwRCk2, true)) {
                    StringBuilder q3BipwRCk3 = eEPBBadYl.q3BipwRCk("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", "kotlinx.serialization.json.JsonLiteral", " there already exist ");
                    q3BipwRCk3.append(emCil6bAE.q3BipwRCk(q3BipwRCk2));
                    q3BipwRCk3.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    throw new IllegalArgumentException(idpM54xlp.CpG0imbht(q3BipwRCk3.toString()));
                }
                while (r2.hasNext()) {
                }
            }
            J4Ux7ym32 = new v34CxtbfH("kotlinx.serialization.json.JsonLiteral", sd7kbtzux);
            return;
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @Override // con.NWqEIvIkR
    public Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        JsonElement dIocxURUo = rTcohQ78k.J4Ux7ym32(vobnba4s1).dIocxURUo();
        if (dIocxURUo instanceof ECCL6mpE4) {
            return (ECCL6mpE4) dIocxURUo;
        }
        throw Ot2IiNSkx.tGV7Q6urW(-1, anXlDk6fV.iMyQMM6Qj("Unexpected JSON element, expected JsonLiteral, had ", YGTdT21e3.q3BipwRCk(dIocxURUo.getClass())), dIocxURUo.toString());
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return J4Ux7ym32;
    }
}
