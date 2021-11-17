package con;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$getFiles$2", f = "Utils.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class txxY3u4NP extends dnd1L2J2K implements kkcQgCx5G {
    public Object MzoOEjc4X;
    public int ilHKhw3Yw;
    public final /* synthetic */ String qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txxY3u4NP(String str, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = str;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new txxY3u4NP(this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new txxY3u4NP(this.qVUwofr5s, way959ade);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        List list;
        ?? r6;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ArrayList arrayList = new ArrayList();
            if (!(this.qVUwofr5s.length() > 0)) {
                return arrayList;
            }
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk = M5g57XBLr.q3BipwRCk(KYuHUB7GA.q3BipwRCk("ZmluZCA="), this.qVUwofr5s, KYuHUB7GA.q3BipwRCk("IC10eXBlIGY="));
            this.MzoOEjc4X = arrayList;
            this.ilHKhw3Yw = 1;
            Object Bhmn1KIah = yuSxiExwK.Bhmn1KIah(q3BipwRCk, this);
            if (Bhmn1KIah == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            list = arrayList;
            obj = Bhmn1KIah;
        } else if (i == 1) {
            list = (List) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CharSequence charSequence = (CharSequence) obj;
        String[] strArr = {"\n"};
        String str = strArr[0];
        if (!(str.length() == 0)) {
            r6NbD4wnj.ziwPzaoF3(0);
            int i0Zug1mVk = r6NbD4wnj.i0Zug1mVk(charSequence, str, 0, false);
            if (i0Zug1mVk != -1) {
                r6 = new ArrayList(10);
                int i2 = 0;
                do {
                    r6.add(charSequence.subSequence(i2, i0Zug1mVk).toString());
                    i2 = str.length() + i0Zug1mVk;
                    i0Zug1mVk = r6NbD4wnj.i0Zug1mVk(charSequence, str, i2, false);
                } while (i0Zug1mVk != -1);
                r6.add(charSequence.subSequence(i2, charSequence.length()).toString());
            } else {
                r6 = Collections.singletonList(charSequence.toString());
            }
        } else {
            xa6IjhTtJ xa6ijhttj = new xa6IjhTtJ(r6NbD4wnj.j22ftfeNI(charSequence, strArr, 0, false, 0, 2));
            r6 = new ArrayList(CjvsxH2Me.nlGCs0NZs(xa6ijhttj, 10));
            Iterator it = xa6ijhttj.iterator();
            while (it.hasNext()) {
                r6.add(r6NbD4wnj.IzM1cD9ly(charSequence, (G8ebKyy85) it.next()));
            }
        }
        for (String str2 : r6) {
            if (!r6NbD4wnj.mUqPm6GBh(str2, "denied", false, 2) && !r6NbD4wnj.mUqPm6GBh(str2, "/cache", false, 2) && !r6NbD4wnj.mUqPm6GBh(str2, "firebase", false, 2)) {
                String kmSgne1rO = tzR8IMGfw.q3BipwRCk.kmSgne1rO(str2);
                if (kmSgne1rO.length() > 0) {
                    list.add(kmSgne1rO);
                }
            }
        }
        return list;
    }
}
