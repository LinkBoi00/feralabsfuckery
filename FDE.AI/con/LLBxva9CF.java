package con;

import kotlinx.serialization.json.JsonElement;
/* loaded from: classes.dex */
public final class LLBxva9CF implements wjjWl3mHt {
    public static final W39e6bnPN J4Ux7ym32;
    public static final LLBxva9CF q3BipwRCk = new LLBxva9CF();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    static {
        /*
            con.LLBxva9CF r0 = new con.LLBxva9CF
            r0.<init>()
            con.LLBxva9CF.q3BipwRCk = r0
            con.sd7KBTZux r0 = con.sd7KBTZux.q3BipwRCk
            java.lang.String r1 = "kotlinx.serialization.json.JsonLiteral"
            boolean r2 = con.r6NbD4wnj.EBQXiIPmm(r1)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0070
            java.util.Map r2 = con.emCil6bAE.q3BipwRCk
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r2.next()
            con.WwFGbLVWX r4 = (con.WwFGbLVWX) r4
            con.Ej3Qf1wRO r4 = (con.Ej3Qf1wRO) r4
            java.lang.String r4 = r4.J4Ux7ym32()
            java.lang.String r4 = con.emCil6bAE.q3BipwRCk(r4)
            java.lang.String r5 = "kotlin."
            java.lang.String r5 = con.anXlDk6fV.iMyQMM6Qj(r5, r4)
            boolean r5 = con.r6NbD4wnj.NyWTwPF6V(r1, r5, r3)
            if (r5 != 0) goto L_0x0046
            boolean r5 = con.r6NbD4wnj.NyWTwPF6V(r1, r4, r3)
            if (r5 != 0) goto L_0x0046
            goto L_0x001d
        L_0x0046:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            java.lang.String r3 = " there already exist "
            java.lang.StringBuilder r1 = con.eEPBBadYl.q3BipwRCk(r2, r1, r3)
            java.lang.String r2 = con.emCil6bAE.q3BipwRCk(r4)
            r1.append(r2)
            java.lang.String r2 = "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = con.idpM54xlp.CpG0imbht(r1)
            r0.<init>(r1)
            throw r0
        L_0x0068:
            con.v34CxtbfH r2 = new con.v34CxtbfH
            r2.<init>(r1, r0)
            con.LLBxva9CF.J4Ux7ym32 = r2
            return
        L_0x0070:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Blank serial names are prohibited"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.LLBxva9CF.<clinit>():void");
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
