package con;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class wH2gwzEtu implements f106ugAzx {
    public final /* synthetic */ SmsTS63dj Bhmn1KIah;
    public final /* synthetic */ Object CBQ5d1kRq;
    public final /* synthetic */ T3vFETFEI kmSgne1rO;

    public wH2gwzEtu(Object obj, T3vFETFEI t3vFETFEI, SmsTS63dj smsTS63dj) {
        this.CBQ5d1kRq = obj;
        this.kmSgne1rO = t3vFETFEI;
        this.Bhmn1KIah = smsTS63dj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    @Override // con.f106ugAzx
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        uzMJrMh0c uzmjrmh0c;
        int i;
        Throwable th;
        Map map;
        wH2gwzEtu wh2gwzetu;
        Object V9LQMKGJe;
        Object V9LQMKGJe2;
        if (way959ade instanceof uzMJrMh0c) {
            uzmjrmh0c = (uzMJrMh0c) way959ade;
            int i2 = uzmjrmh0c.MzoOEjc4X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uzmjrmh0c.MzoOEjc4X = i2 - Integer.MIN_VALUE;
                Object obj2 = uzmjrmh0c.PSTqBLTET;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = uzmjrmh0c.MzoOEjc4X;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj2);
                    map = (Map) obj;
                    try {
                        Float vPSbyrYWX = xpuSUT7Gh.vPSbyrYWX(map, this.CBQ5d1kRq);
                        if (vPSbyrYWX != null) {
                            T3vFETFEI t3vFETFEI = this.kmSgne1rO;
                            float floatValue = vPSbyrYWX.floatValue();
                            SmsTS63dj smsTS63dj = this.Bhmn1KIah;
                            uzmjrmh0c.qVUwofr5s = this;
                            uzmjrmh0c.Eeka1udhb = map;
                            uzmjrmh0c.MzoOEjc4X = 1;
                            if (t3vFETFEI.J4Ux7ym32(floatValue, smsTS63dj, uzmjrmh0c) == kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            wh2gwzetu = this;
                        } else {
                            throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        wh2gwzetu = this;
                        float floatValue2 = ((Number) ((prCJwNx2x) wh2gwzetu.kmSgne1rO.GPLPRo6go).getValue()).floatValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                        }
                        V9LQMKGJe = wkFJfVmcv.V9LQMKGJe(linkedHashMap.values());
                        if (V9LQMKGJe == null) {
                        }
                        ((prCJwNx2x) wh2gwzetu.kmSgne1rO.tGV7Q6urW).CBQ5d1kRq(V9LQMKGJe);
                        throw th;
                    }
                } else if (i == 1) {
                    map = (Map) uzmjrmh0c.Eeka1udhb;
                    wh2gwzetu = (wH2gwzEtu) uzmjrmh0c.qVUwofr5s;
                    try {
                        anXlDk6fV.IytU16YUK(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        float floatValue22 = ((Number) ((prCJwNx2x) wh2gwzetu.kmSgne1rO.GPLPRo6go).getValue()).floatValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (Math.abs(((Number) entry.getKey()).floatValue() - floatValue22) < 0.5f) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        V9LQMKGJe = wkFJfVmcv.V9LQMKGJe(linkedHashMap2.values());
                        if (V9LQMKGJe == null) {
                            V9LQMKGJe = wh2gwzetu.kmSgne1rO.dIocxURUo();
                        }
                        ((prCJwNx2x) wh2gwzetu.kmSgne1rO.tGV7Q6urW).CBQ5d1kRq(V9LQMKGJe);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float floatValue3 = ((Number) ((prCJwNx2x) wh2gwzetu.kmSgne1rO.GPLPRo6go).getValue()).floatValue();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - floatValue3) < 0.5f) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                V9LQMKGJe2 = wkFJfVmcv.V9LQMKGJe(linkedHashMap3.values());
                if (V9LQMKGJe2 == null) {
                    V9LQMKGJe2 = wh2gwzetu.kmSgne1rO.dIocxURUo();
                }
                ((prCJwNx2x) wh2gwzetu.kmSgne1rO.tGV7Q6urW).CBQ5d1kRq(V9LQMKGJe2);
                return qih4lW99W.q3BipwRCk;
            }
        }
        uzmjrmh0c = new uzMJrMh0c(this, way959ade);
        Object obj22 = uzmjrmh0c.PSTqBLTET;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = uzmjrmh0c.MzoOEjc4X;
        if (i != 0) {
        }
        float floatValue32 = ((Number) ((prCJwNx2x) wh2gwzetu.kmSgne1rO.GPLPRo6go).getValue()).floatValue();
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        while (r9.hasNext()) {
        }
        V9LQMKGJe2 = wkFJfVmcv.V9LQMKGJe(linkedHashMap32.values());
        if (V9LQMKGJe2 == null) {
        }
        ((prCJwNx2x) wh2gwzetu.kmSgne1rO.tGV7Q6urW).CBQ5d1kRq(V9LQMKGJe2);
        return qih4lW99W.q3BipwRCk;
    }
}
