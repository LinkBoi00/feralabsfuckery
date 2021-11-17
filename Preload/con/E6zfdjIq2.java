package con;
/* loaded from: classes.dex */
public final class E6zfdjIq2 implements f106ugAzx {
    public final /* synthetic */ kkcQgCx5G CBQ5d1kRq;
    public final /* synthetic */ IXMg0nBBI kmSgne1rO;

    public E6zfdjIq2(kkcQgCx5G kkcqgcx5g, IXMg0nBBI iXMg0nBBI) {
        this.CBQ5d1kRq = kkcqgcx5g;
        this.kmSgne1rO = iXMg0nBBI;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // con.f106ugAzx
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        xCiaovSLF xciaovslf;
        Object obj2;
        int i;
        boolean z;
        E6zfdjIq2 e6zfdjIq2;
        if (way959ade instanceof xCiaovSLF) {
            xciaovslf = (xCiaovSLF) way959ade;
            int i2 = xciaovslf.ilHKhw3Yw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xciaovslf.ilHKhw3Yw = i2 - Integer.MIN_VALUE;
                obj2 = xciaovslf.MzoOEjc4X;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = xciaovslf.ilHKhw3Yw;
                z = true;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj2);
                    kkcQgCx5G kkcqgcx5g = this.CBQ5d1kRq;
                    xciaovslf.PSTqBLTET = this;
                    xciaovslf.Eeka1udhb = obj;
                    xciaovslf.ilHKhw3Yw = 1;
                    obj2 = kkcqgcx5g.WaUP0CF08(obj, xciaovslf);
                    if (obj2 == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    e6zfdjIq2 = this;
                } else if (i == 1) {
                    obj = xciaovslf.Eeka1udhb;
                    e6zfdjIq2 = (E6zfdjIq2) xciaovslf.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (((Boolean) obj2).booleanValue()) {
                    e6zfdjIq2.kmSgne1rO.CBQ5d1kRq = obj;
                    z = false;
                }
                if (!z) {
                    return qih4lW99W.q3BipwRCk;
                }
                throw new RG2GI7LDp(e6zfdjIq2);
            }
        }
        xciaovslf = new xCiaovSLF(this, way959ade);
        obj2 = xciaovslf.MzoOEjc4X;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = xciaovslf.ilHKhw3Yw;
        z = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (!z) {
        }
    }
}
