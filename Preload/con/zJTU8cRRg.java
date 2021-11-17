package con;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class zJTU8cRRg implements f106ugAzx {
    public final /* synthetic */ T3vFETFEI CBQ5d1kRq;
    public final /* synthetic */ float kmSgne1rO;

    public zJTU8cRRg(T3vFETFEI t3vFETFEI, float f) {
        this.CBQ5d1kRq = t3vFETFEI;
        this.kmSgne1rO = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4 A[RETURN] */
    @Override // con.f106ugAzx
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        int i;
        List list;
        int i2;
        int size;
        float f;
        Object obj2;
        Object J4Ux7ym32;
        float f2;
        List list2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        Map map = (Map) obj;
        float floatValue = xpuSUT7Gh.vPSbyrYWX(map, this.CBQ5d1kRq.dIocxURUo()).floatValue();
        float floatValue2 = ((Number) ((prCJwNx2x) this.CBQ5d1kRq.kCA6Zs9sL).getValue()).floatValue();
        Set keySet = map.keySet();
        kkcQgCx5G kkcqgcx5g = (kkcQgCx5G) ((prCJwNx2x) this.CBQ5d1kRq.kmSgne1rO).getValue();
        float f3 = this.kmSgne1rO;
        float floatValue3 = ((Number) ((prCJwNx2x) this.CBQ5d1kRq.Bhmn1KIah).getValue()).floatValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : keySet) {
            if (((double) ((Number) obj3).floatValue()) <= ((double) floatValue2) + 0.001d) {
                arrayList.add(obj3);
            }
            kkcqgcx5g = kkcqgcx5g;
            kbkjsqcsl = kbkjsqcsl;
            f3 = f3;
        }
        Float j22ftfeNI = wkFJfVmcv.j22ftfeNI(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : keySet) {
            if (((double) ((Number) obj4).floatValue()) >= ((double) floatValue2) - 0.001d) {
                arrayList2.add(obj4);
            }
            floatValue3 = floatValue3;
        }
        Float QSbMsHU5X = wkFJfVmcv.QSbMsHU5X(arrayList2);
        if (j22ftfeNI != null) {
            if (QSbMsHU5X != null) {
                if (!(j22ftfeNI.floatValue() == QSbMsHU5X.floatValue())) {
                    i = 0;
                    i2 = 1;
                    list = idpM54xlp.ixWaw2akD(j22ftfeNI, QSbMsHU5X);
                    size = list.size();
                    if (size == 0) {
                        if (size != i2) {
                            f = ((Number) list.get(i)).floatValue();
                            f2 = ((Number) list.get(i2)).floatValue();
                            if (floatValue > floatValue2) {
                            }
                        } else {
                            f2 = ((Number) list.get(i)).floatValue();
                        }
                        f = f2;
                    } else {
                        f = floatValue;
                    }
                    obj2 = map.get(new Float(f));
                    if (obj2 != null || !((Boolean) this.CBQ5d1kRq.J4Ux7ym32.IytU16YUK(obj2)).booleanValue()) {
                        T3vFETFEI t3vFETFEI = this.CBQ5d1kRq;
                        J4Ux7ym32 = t3vFETFEI.J4Ux7ym32(floatValue, t3vFETFEI.q3BipwRCk, way959ade);
                        if (J4Ux7ym32 == kbkjsqcsl) {
                            return J4Ux7ym32;
                        }
                    } else {
                        T3vFETFEI t3vFETFEI2 = this.CBQ5d1kRq;
                        Object tGV7Q6urW = t3vFETFEI2.oon79WMrY.tGV7Q6urW(new wH2gwzEtu(obj2, t3vFETFEI2, t3vFETFEI2.q3BipwRCk), way959ade);
                        if (tGV7Q6urW != kbkjsqcsl) {
                            tGV7Q6urW = qih4lW99W.q3BipwRCk;
                        }
                        if (tGV7Q6urW == kbkjsqcsl) {
                            return tGV7Q6urW;
                        }
                    }
                    return qih4lW99W.q3BipwRCk;
                }
            }
            list2 = Collections.singletonList(j22ftfeNI);
        } else if (QSbMsHU5X != null) {
            list2 = Collections.singletonList(QSbMsHU5X);
        } else {
            list2 = Dqz1pJHWH.CBQ5d1kRq;
        }
        list = list2;
        i2 = 1;
        i = 0;
        size = list.size();
        if (size == 0) {
        }
        obj2 = map.get(new Float(f));
        if (obj2 != null) {
        }
        T3vFETFEI t3vFETFEI3 = this.CBQ5d1kRq;
        J4Ux7ym32 = t3vFETFEI3.J4Ux7ym32(floatValue, t3vFETFEI3.q3BipwRCk, way959ade);
        if (J4Ux7ym32 == kbkjsqcsl) {
        }
        return qih4lW99W.q3BipwRCk;
    }
}
