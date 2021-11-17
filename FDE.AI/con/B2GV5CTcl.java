package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract /* synthetic */ class B2GV5CTcl {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
        if (r4 == false) goto L_0x018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
        if (r11 == false) goto L_0x0113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r12 == false) goto L_0x0157;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2 A[Catch: NoSuchFieldException -> 0x01a5, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x01a5, blocks: (B:94:0x016b, B:96:0x0174, B:101:0x0187, B:104:0x018d, B:107:0x0193, B:110:0x019a, B:111:0x019e, B:113:0x01a2), top: B:131:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final con.wjjWl3mHt J4Ux7ym32(con.WwFGbLVWX r16, con.wjjWl3mHt... r17) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: con.B2GV5CTcl.J4Ux7ym32(con.WwFGbLVWX, con.wjjWl3mHt[]):con.wjjWl3mHt");
    }

    public static final wjjWl3mHt dIocxURUo(IOYQk1Nz8 iOYQk1Nz8, v1smVeB0h v1smveb0h) {
        wjjWl3mHt GPLPRo6go = rTcohQ78k.GPLPRo6go(iOYQk1Nz8, v1smveb0h, true);
        if (GPLPRo6go != null) {
            return GPLPRo6go;
        }
        WwFGbLVWX tGV7Q6urW = gScbsbDFV.tGV7Q6urW(v1smveb0h);
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Serializer for class '");
        q3BipwRCk.append((Object) ((Ej3Qf1wRO) tGV7Q6urW).J4Ux7ym32());
        q3BipwRCk.append("' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
        throw new oPOFYJ4Sr(q3BipwRCk.toString());
    }

    public static final wjjWl3mHt kCA6Zs9sL(WwFGbLVWX wwFGbLVWX) {
        wjjWl3mHt J4Ux7ym32 = J4Ux7ym32(wwFGbLVWX, new wjjWl3mHt[0]);
        return J4Ux7ym32 == null ? (wjjWl3mHt) emCil6bAE.q3BipwRCk.get(wwFGbLVWX) : J4Ux7ym32;
    }

    public static final W39e6bnPN q3BipwRCk(W39e6bnPN w39e6bnPN, IOYQk1Nz8 iOYQk1Nz8) {
        if (!anXlDk6fV.tGV7Q6urW(w39e6bnPN.yWvV4ePLl(), ExxfeSnE3.q3BipwRCk)) {
            return w39e6bnPN.J4Ux7ym32() ? w39e6bnPN.Puu3Rhg4F(0) : w39e6bnPN;
        }
        if (anXlDk6fV.kmSgne1rO(w39e6bnPN) == null) {
            return w39e6bnPN;
        }
        K6PL0z3I0.q3BipwRCk(null);
        return w39e6bnPN;
    }

    public static final Object tGV7Q6urW(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }
}
