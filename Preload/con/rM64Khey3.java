package con;

import java.util.concurrent.CancellationException;
@jHNqfwCVd(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {235, 237, 239, 249, 251, 255}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class rM64Khey3 extends dnd1L2J2K implements kkcQgCx5G {
    public /* synthetic */ Object Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ nzd5Clgtu RG6kpfv3v;
    public final /* synthetic */ DpXbxvzXm dXrmkklc8;
    public Object ilHKhw3Yw;
    public final /* synthetic */ UBY2Inzw8 ixWaw2akD;
    public int qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rM64Khey3(DpXbxvzXm dpXbxvzXm, nzd5Clgtu nzd5clgtu, UBY2Inzw8 uBY2Inzw8, Way959ade way959ade) {
        super(2, way959ade);
        this.dXrmkklc8 = dpXbxvzXm;
        this.RG6kpfv3v = nzd5clgtu;
        this.ixWaw2akD = uBY2Inzw8;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        rM64Khey3 rm64khey3 = new rM64Khey3(this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, (Way959ade) obj2);
        rm64khey3.Eeka1udhb = (oQkvjGXIr) obj;
        return rm64khey3.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        rM64Khey3 rm64khey3 = new rM64Khey3(this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
        rm64khey3.Eeka1udhb = obj;
        return rm64khey3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:35|12|60|36|(2:41|(2:43|(1:45)))(2:38|(1:40))|19|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[Catch: CancellationException -> 0x00fe, TryCatch #3 {CancellationException -> 0x00fe, blocks: (B:36:0x00cd, B:38:0x00d9, B:41:0x00e9, B:43:0x00ed), top: B:60:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9 A[Catch: CancellationException -> 0x00fe, TryCatch #3 {CancellationException -> 0x00fe, blocks: (B:36:0x00cd, B:38:0x00d9, B:41:0x00e9, B:43:0x00ed), top: B:60:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        IXMg0nBBI iXMg0nBBI;
        oQkvjGXIr oqkvjgxir;
        kBKJSqCSL kbkjsqcsl;
        rM64Khey3 rm64khey3;
        rM64Khey3 rm64khey32;
        nzd5Clgtu nzd5clgtu;
        s1x258HRp s1x258hrp;
        jwvlSqURP jwvlsqurp;
        IXMg0nBBI iXMg0nBBI2;
        wofrUMIDj q3BipwRCk;
        oQkvjGXIr oqkvjgxir2;
        IXMg0nBBI iXMg0nBBI3;
        Object obj2;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        switch (this.qVUwofr5s) {
            case 0:
                anXlDk6fV.IytU16YUK(obj);
                oqkvjgxir = (oQkvjGXIr) this.Eeka1udhb;
                rm64khey32 = this;
                if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                    IXMg0nBBI iXMg0nBBI4 = new IXMg0nBBI();
                    DpXbxvzXm dpXbxvzXm = rm64khey32.dXrmkklc8;
                    rm64khey32.Eeka1udhb = oqkvjgxir;
                    rm64khey32.MzoOEjc4X = iXMg0nBBI4;
                    rm64khey32.ilHKhw3Yw = iXMg0nBBI4;
                    rm64khey32.qVUwofr5s = 1;
                    Object MzoOEjc4X = ((DrTf1eLw4) dpXbxvzXm).MzoOEjc4X(rm64khey32);
                    if (MzoOEjc4X == kbkjsqcsl2) {
                        return kbkjsqcsl2;
                    }
                    oqkvjgxir2 = oqkvjgxir;
                    iXMg0nBBI = iXMg0nBBI4;
                    kbkjsqcsl = kbkjsqcsl2;
                    rm64khey3 = rm64khey32;
                    obj = MzoOEjc4X;
                    iXMg0nBBI3 = iXMg0nBBI;
                    iXMg0nBBI3.CBQ5d1kRq = obj;
                    if (iXMg0nBBI.CBQ5d1kRq instanceof s4NxAcTJi) {
                        rm64khey32 = rm64khey3;
                        kbkjsqcsl2 = kbkjsqcsl;
                        oqkvjgxir = oqkvjgxir2;
                        if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                            return qih4lW99W.q3BipwRCk;
                        }
                    } else {
                        rm64khey3.Eeka1udhb = oqkvjgxir2;
                        rm64khey3.MzoOEjc4X = iXMg0nBBI;
                        rm64khey3.ilHKhw3Yw = null;
                        rm64khey3.qVUwofr5s = 2;
                        if (oPtznyhSA.q3BipwRCk(rm64khey3.ixWaw2akD).J4Ux7ym32(oqkvjgxir2, (s4NxAcTJi) iXMg0nBBI.CBQ5d1kRq, rm64khey3) == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        oqkvjgxir = oqkvjgxir2;
                        try {
                        } catch (CancellationException unused) {
                            rm64khey32 = rm64khey3;
                            kbkjsqcsl2 = kbkjsqcsl;
                            oqkvjgxir = oqkvjgxir;
                            q3BipwRCk = oPtznyhSA.q3BipwRCk(rm64khey32.ixWaw2akD);
                            rm64khey32.Eeka1udhb = oqkvjgxir;
                            rm64khey32.MzoOEjc4X = null;
                            rm64khey32.qVUwofr5s = 6;
                            if (q3BipwRCk.q3BipwRCk(oqkvjgxir, rm64khey32) == kbkjsqcsl2) {
                            }
                            if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                            }
                        }
                        nzd5clgtu = rm64khey3.RG6kpfv3v;
                        s1x258hrp = s1x258HRp.UserInput;
                        jwvlsqurp = new jwvlSqURP(iXMg0nBBI, rm64khey3.dXrmkklc8, null);
                        rm64khey3.Eeka1udhb = oqkvjgxir;
                        rm64khey3.MzoOEjc4X = iXMg0nBBI;
                        rm64khey3.qVUwofr5s = 3;
                        if (nzd5clgtu.J4Ux7ym32(s1x258hrp, jwvlsqurp, rm64khey3) != kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        rm64khey32 = rm64khey3;
                        kbkjsqcsl2 = kbkjsqcsl;
                        iXMg0nBBI2 = iXMg0nBBI;
                        wofrUMIDj q3BipwRCk2 = oPtznyhSA.q3BipwRCk(rm64khey32.ixWaw2akD);
                        obj2 = iXMg0nBBI2.CBQ5d1kRq;
                        if (obj2 instanceof UliWfoMkZ) {
                            rm64khey32.Eeka1udhb = oqkvjgxir;
                            rm64khey32.MzoOEjc4X = null;
                            rm64khey32.qVUwofr5s = 4;
                            if (q3BipwRCk2.tGV7Q6urW(oqkvjgxir, (UliWfoMkZ) obj2, rm64khey32) == kbkjsqcsl2) {
                                return kbkjsqcsl2;
                            }
                        } else if (obj2 instanceof vM0xskL0R) {
                            rm64khey32.Eeka1udhb = oqkvjgxir;
                            rm64khey32.MzoOEjc4X = null;
                            rm64khey32.qVUwofr5s = 5;
                            if (q3BipwRCk2.q3BipwRCk(oqkvjgxir, rm64khey32) == kbkjsqcsl2) {
                                return kbkjsqcsl2;
                            }
                        }
                        if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                        }
                    }
                }
                break;
            case 1:
                iXMg0nBBI3 = (IXMg0nBBI) this.ilHKhw3Yw;
                iXMg0nBBI = (IXMg0nBBI) this.MzoOEjc4X;
                oqkvjgxir2 = (oQkvjGXIr) this.Eeka1udhb;
                anXlDk6fV.IytU16YUK(obj);
                kbkjsqcsl = kbkjsqcsl2;
                rm64khey3 = this;
                iXMg0nBBI3.CBQ5d1kRq = obj;
                if (iXMg0nBBI.CBQ5d1kRq instanceof s4NxAcTJi) {
                }
                break;
            case 2:
                iXMg0nBBI = (IXMg0nBBI) this.MzoOEjc4X;
                oqkvjgxir = (oQkvjGXIr) this.Eeka1udhb;
                anXlDk6fV.IytU16YUK(obj);
                kbkjsqcsl = kbkjsqcsl2;
                rm64khey3 = this;
                nzd5clgtu = rm64khey3.RG6kpfv3v;
                s1x258hrp = s1x258HRp.UserInput;
                jwvlsqurp = new jwvlSqURP(iXMg0nBBI, rm64khey3.dXrmkklc8, null);
                rm64khey3.Eeka1udhb = oqkvjgxir;
                rm64khey3.MzoOEjc4X = iXMg0nBBI;
                rm64khey3.qVUwofr5s = 3;
                if (nzd5clgtu.J4Ux7ym32(s1x258hrp, jwvlsqurp, rm64khey3) != kbkjsqcsl) {
                }
                break;
            case 3:
                iXMg0nBBI2 = (IXMg0nBBI) this.MzoOEjc4X;
                oqkvjgxir = (oQkvjGXIr) this.Eeka1udhb;
                try {
                    anXlDk6fV.IytU16YUK(obj);
                    rm64khey32 = this;
                } catch (CancellationException unused2) {
                    oqkvjgxir = oqkvjgxir;
                    rm64khey32 = this;
                    q3BipwRCk = oPtznyhSA.q3BipwRCk(rm64khey32.ixWaw2akD);
                    rm64khey32.Eeka1udhb = oqkvjgxir;
                    rm64khey32.MzoOEjc4X = null;
                    rm64khey32.qVUwofr5s = 6;
                    if (q3BipwRCk.q3BipwRCk(oqkvjgxir, rm64khey32) == kbkjsqcsl2) {
                        return kbkjsqcsl2;
                    }
                    if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                    }
                }
                wofrUMIDj q3BipwRCk22 = oPtznyhSA.q3BipwRCk(rm64khey32.ixWaw2akD);
                obj2 = iXMg0nBBI2.CBQ5d1kRq;
                if (obj2 instanceof UliWfoMkZ) {
                }
                if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                }
                break;
            case 4:
            case 5:
                oqkvjgxir = (oQkvjGXIr) this.Eeka1udhb;
                try {
                    anXlDk6fV.IytU16YUK(obj);
                    rm64khey32 = this;
                } catch (CancellationException unused3) {
                    rm64khey32 = this;
                    q3BipwRCk = oPtznyhSA.q3BipwRCk(rm64khey32.ixWaw2akD);
                    rm64khey32.Eeka1udhb = oqkvjgxir;
                    rm64khey32.MzoOEjc4X = null;
                    rm64khey32.qVUwofr5s = 6;
                    if (q3BipwRCk.q3BipwRCk(oqkvjgxir, rm64khey32) == kbkjsqcsl2) {
                    }
                    if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                    }
                }
                if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                }
                break;
            case 6:
                oqkvjgxir = (oQkvjGXIr) this.Eeka1udhb;
                anXlDk6fV.IytU16YUK(obj);
                rm64khey32 = this;
                if (!D3DEikrvb.MzoOEjc4X(oqkvjgxir)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
