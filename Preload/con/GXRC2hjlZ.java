package con;
/* loaded from: classes.dex */
public final class GXRC2hjlZ implements BheGN9HzV {
    public final /* synthetic */ UBY2Inzw8 J4Ux7ym32;
    public final /* synthetic */ boolean q3BipwRCk;

    public GXRC2hjlZ(boolean z, UBY2Inzw8 uBY2Inzw8) {
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = uBY2Inzw8;
    }

    @Override // con.BheGN9HzV
    public long J4Ux7ym32(long j, long j2, int i) {
        if (this.q3BipwRCk) {
            b0pCjrhT1 b0pcjrht1 = (b0pCjrhT1) this.J4Ux7ym32.getValue();
            if (!b0pcjrht1.dIocxURUo.tGV7Q6urW()) {
                return b0pcjrht1.GPLPRo6go(b0pcjrht1.dIocxURUo(b0pcjrht1.dIocxURUo.q3BipwRCk(b0pcjrht1.dIocxURUo(b0pcjrht1.iiGwOFFnr(j2)))));
            }
            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
            return bRgfgYIQX.tGV7Q6urW;
        }
        JhpbRXxsg jhpbRXxsg2 = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.tGV7Q6urW;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // con.BheGN9HzV
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object dIocxURUo(long j, long j2, Way959ade way959ade) {
        MxUphuxpF mxUphuxpF;
        int i;
        long j3;
        if (way959ade instanceof MxUphuxpF) {
            mxUphuxpF = (MxUphuxpF) way959ade;
            int i2 = mxUphuxpF.qVUwofr5s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mxUphuxpF.qVUwofr5s = i2 - Integer.MIN_VALUE;
                Object obj = mxUphuxpF.MzoOEjc4X;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = mxUphuxpF.qVUwofr5s;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    if (this.q3BipwRCk) {
                        mxUphuxpF.PSTqBLTET = j2;
                        mxUphuxpF.qVUwofr5s = 1;
                        obj = ((b0pCjrhT1) this.J4Ux7ym32.getValue()).J4Ux7ym32(j2, mxUphuxpF);
                        if (obj == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                    } else {
                        JhpbRXxsg jhpbRXxsg = yqaDqocAW.J4Ux7ym32;
                        j3 = yqaDqocAW.tGV7Q6urW;
                        return new yqaDqocAW(j3);
                    }
                } else if (i == 1) {
                    j2 = mxUphuxpF.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = yqaDqocAW.dIocxURUo(j2, ((yqaDqocAW) obj).q3BipwRCk);
                return new yqaDqocAW(j3);
            }
        }
        mxUphuxpF = new MxUphuxpF(this, way959ade);
        Object obj2 = mxUphuxpF.MzoOEjc4X;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = mxUphuxpF.qVUwofr5s;
        if (i != 0) {
        }
        j3 = yqaDqocAW.dIocxURUo(j2, ((yqaDqocAW) obj2).q3BipwRCk);
        return new yqaDqocAW(j3);
    }

    @Override // con.BheGN9HzV
    public long q3BipwRCk(long j, int i) {
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.tGV7Q6urW;
    }

    @Override // con.BheGN9HzV
    public Object tGV7Q6urW(long j, Way959ade way959ade) {
        JhpbRXxsg jhpbRXxsg = yqaDqocAW.J4Ux7ym32;
        return new yqaDqocAW(yqaDqocAW.tGV7Q6urW);
    }
}
