package con;
/* loaded from: classes.dex */
public final class k46AEZbBz implements BheGN9HzV {
    public BheGN9HzV J4Ux7ym32;
    public BheGN9HzV q3BipwRCk;

    public k46AEZbBz(BheGN9HzV bheGN9HzV, BheGN9HzV bheGN9HzV2) {
        this.q3BipwRCk = bheGN9HzV;
        this.J4Ux7ym32 = bheGN9HzV2;
    }

    @Override // con.BheGN9HzV
    public long J4Ux7ym32(long j, long j2, int i) {
        long J4Ux7ym32 = this.J4Ux7ym32.J4Ux7ym32(j, j2, i);
        return bRgfgYIQX.iiGwOFFnr(J4Ux7ym32, this.q3BipwRCk.J4Ux7ym32(bRgfgYIQX.iiGwOFFnr(j, J4Ux7ym32), bRgfgYIQX.kCA6Zs9sL(j2, J4Ux7ym32), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    @Override // con.BheGN9HzV
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object dIocxURUo(long j, long j2, Way959ade way959ade) {
        Ya97ow2bl ya97ow2bl;
        Object obj;
        kBKJSqCSL kbkjsqcsl;
        int i;
        long j3;
        long j4;
        long j5;
        k46AEZbBz k46aezbbz;
        if (way959ade instanceof Ya97ow2bl) {
            ya97ow2bl = (Ya97ow2bl) way959ade;
            int i2 = ya97ow2bl.dXrmkklc8;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ya97ow2bl.dXrmkklc8 = i2 - Integer.MIN_VALUE;
                obj = ya97ow2bl.qVUwofr5s;
                kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = ya97ow2bl.dXrmkklc8;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    BheGN9HzV bheGN9HzV = this.J4Ux7ym32;
                    ya97ow2bl.PSTqBLTET = this;
                    j5 = j;
                    ya97ow2bl.MzoOEjc4X = j5;
                    j4 = j2;
                    ya97ow2bl.ilHKhw3Yw = j4;
                    ya97ow2bl.dXrmkklc8 = 1;
                    obj = bheGN9HzV.dIocxURUo(j, j2, ya97ow2bl);
                    if (obj == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    k46aezbbz = this;
                } else if (i == 1) {
                    j4 = ya97ow2bl.ilHKhw3Yw;
                    j5 = ya97ow2bl.MzoOEjc4X;
                    k46aezbbz = (k46AEZbBz) ya97ow2bl.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else if (i == 2) {
                    j3 = ya97ow2bl.MzoOEjc4X;
                    anXlDk6fV.IytU16YUK(obj);
                    return new yqaDqocAW(yqaDqocAW.kCA6Zs9sL(j3, ((yqaDqocAW) obj).q3BipwRCk));
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j6 = ((yqaDqocAW) obj).q3BipwRCk;
                BheGN9HzV bheGN9HzV2 = k46aezbbz.q3BipwRCk;
                long kCA6Zs9sL = yqaDqocAW.kCA6Zs9sL(j5, j6);
                long dIocxURUo = yqaDqocAW.dIocxURUo(j4, j6);
                ya97ow2bl.PSTqBLTET = null;
                ya97ow2bl.MzoOEjc4X = j6;
                ya97ow2bl.dXrmkklc8 = 2;
                obj = bheGN9HzV2.dIocxURUo(kCA6Zs9sL, dIocxURUo, ya97ow2bl);
                if (obj != kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                j3 = j6;
                return new yqaDqocAW(yqaDqocAW.kCA6Zs9sL(j3, ((yqaDqocAW) obj).q3BipwRCk));
            }
        }
        ya97ow2bl = new Ya97ow2bl(this, way959ade);
        obj = ya97ow2bl.qVUwofr5s;
        kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = ya97ow2bl.dXrmkklc8;
        if (i != 0) {
        }
        long j62 = ((yqaDqocAW) obj).q3BipwRCk;
        BheGN9HzV bheGN9HzV22 = k46aezbbz.q3BipwRCk;
        long kCA6Zs9sL2 = yqaDqocAW.kCA6Zs9sL(j5, j62);
        long dIocxURUo2 = yqaDqocAW.dIocxURUo(j4, j62);
        ya97ow2bl.PSTqBLTET = null;
        ya97ow2bl.MzoOEjc4X = j62;
        ya97ow2bl.dXrmkklc8 = 2;
        obj = bheGN9HzV22.dIocxURUo(kCA6Zs9sL2, dIocxURUo2, ya97ow2bl);
        if (obj != kbkjsqcsl) {
        }
    }

    @Override // con.BheGN9HzV
    public long q3BipwRCk(long j, int i) {
        long q3BipwRCk = this.q3BipwRCk.q3BipwRCk(j, i);
        return bRgfgYIQX.iiGwOFFnr(q3BipwRCk, this.J4Ux7ym32.q3BipwRCk(bRgfgYIQX.kCA6Zs9sL(j, q3BipwRCk), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // con.BheGN9HzV
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object tGV7Q6urW(long j, Way959ade way959ade) {
        SsVJIGXUR ssVJIGXUR;
        Object obj;
        kBKJSqCSL kbkjsqcsl;
        int i;
        long j2;
        k46AEZbBz k46aezbbz;
        if (way959ade instanceof SsVJIGXUR) {
            ssVJIGXUR = (SsVJIGXUR) way959ade;
            int i2 = ssVJIGXUR.Eeka1udhb;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ssVJIGXUR.Eeka1udhb = i2 - Integer.MIN_VALUE;
                obj = ssVJIGXUR.ilHKhw3Yw;
                kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = ssVJIGXUR.Eeka1udhb;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    BheGN9HzV bheGN9HzV = this.q3BipwRCk;
                    ssVJIGXUR.PSTqBLTET = this;
                    ssVJIGXUR.MzoOEjc4X = j;
                    ssVJIGXUR.Eeka1udhb = 1;
                    obj = bheGN9HzV.tGV7Q6urW(j, ssVJIGXUR);
                    if (obj == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    k46aezbbz = this;
                } else if (i == 1) {
                    j = ssVJIGXUR.MzoOEjc4X;
                    k46aezbbz = (k46AEZbBz) ssVJIGXUR.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj);
                } else if (i == 2) {
                    j2 = ssVJIGXUR.MzoOEjc4X;
                    anXlDk6fV.IytU16YUK(obj);
                    return new yqaDqocAW(yqaDqocAW.kCA6Zs9sL(j2, ((yqaDqocAW) obj).q3BipwRCk));
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = ((yqaDqocAW) obj).q3BipwRCk;
                BheGN9HzV bheGN9HzV2 = k46aezbbz.J4Ux7ym32;
                long dIocxURUo = yqaDqocAW.dIocxURUo(j, j3);
                ssVJIGXUR.PSTqBLTET = null;
                ssVJIGXUR.MzoOEjc4X = j3;
                ssVJIGXUR.Eeka1udhb = 2;
                obj = bheGN9HzV2.tGV7Q6urW(dIocxURUo, ssVJIGXUR);
                if (obj != kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                j2 = j3;
                return new yqaDqocAW(yqaDqocAW.kCA6Zs9sL(j2, ((yqaDqocAW) obj).q3BipwRCk));
            }
        }
        ssVJIGXUR = new SsVJIGXUR(this, way959ade);
        obj = ssVJIGXUR.ilHKhw3Yw;
        kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = ssVJIGXUR.Eeka1udhb;
        if (i != 0) {
        }
        long j32 = ((yqaDqocAW) obj).q3BipwRCk;
        BheGN9HzV bheGN9HzV22 = k46aezbbz.J4Ux7ym32;
        long dIocxURUo2 = yqaDqocAW.dIocxURUo(j, j32);
        ssVJIGXUR.PSTqBLTET = null;
        ssVJIGXUR.MzoOEjc4X = j32;
        ssVJIGXUR.Eeka1udhb = 2;
        obj = bheGN9HzV22.tGV7Q6urW(dIocxURUo2, ssVJIGXUR);
        if (obj != kbkjsqcsl) {
        }
    }
}
