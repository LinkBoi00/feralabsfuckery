package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class txLC9Bpvz {
    public static final int J4Ux7ym32(JYTRn9Ica jYTRn9Ica, int i) {
        if (i < 0 || i >= jYTRn9Ica.tGV7Q6urW) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("Index ", i, ", size ");
            q3BipwRCk.append(jYTRn9Ica.tGV7Q6urW);
            throw new IndexOutOfBoundsException(q3BipwRCk.toString());
        }
        List list = jYTRn9Ica.J4Ux7ym32;
        int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(list);
        int i2 = 0;
        while (i2 < CBQ5d1kRq) {
            int i3 = ((CBQ5d1kRq - i2) / 2) + i2;
            int i4 = ((Lw10f0Sd9) list.get(i3)).q3BipwRCk;
            if (i4 != i) {
                if (i4 < i) {
                    i2 = i3 + 1;
                    if (i < ((Lw10f0Sd9) list.get(i2)).q3BipwRCk) {
                    }
                } else {
                    CBQ5d1kRq = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0256 A[LOOP:0: B:147:0x0254->B:148:0x0256, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(con.BgIsSUB3d r24, con.cnnoFa4Tx r25, con.MHv2Ig8xA r26, boolean r27, boolean r28, con.IzQNDLr32 r29, con.phqQlbVE3 r30, con.MEtaL9md5 r31, con.T0XFCDCob r32, con.xrlB614az r33, con.PmanMZxiM r34, con.rJ0s9PfCL r35, int r36, int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 988
        */
        throw new UnsupportedOperationException("Method not decompiled: con.txLC9Bpvz.q3BipwRCk(con.BgIsSUB3d, con.cnnoFa4Tx, con.MHv2Ig8xA, boolean, boolean, con.IzQNDLr32, con.phqQlbVE3, con.MEtaL9md5, con.T0XFCDCob, con.xrlB614az, con.PmanMZxiM, con.rJ0s9PfCL, int, int, int):void");
    }

    public static final cnnoFa4Tx tGV7Q6urW(int i, int i2, rJ0s9PfCL rj0s9pfcl, int i3) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(690738043);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        cnnoFa4Tx cnnofa4tx = (cnnoFa4Tx) uI1r9gOOH.q3BipwRCk(new Object[0], cnnoFa4Tx.Bhmn1KIah.GPLPRo6go(), null, new jLul7pBWy(i, i2), wpxpbwg1j, 4);
        wpxpbwg1j.ilHKhw3Yw(false);
        return cnnofa4tx;
    }
}
