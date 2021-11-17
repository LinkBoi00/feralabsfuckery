package con;

import android.content.ComponentName;
import android.content.Intent;
import com.feravolt.preload.MainActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$helloProApp$2", f = "MainActivity.kt", l = {1234}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class asc9xrIdl extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ MainActivity ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asc9xrIdl(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new asc9xrIdl(this.ilHKhw3Yw, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new asc9xrIdl(this.ilHKhw3Yw, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            MainActivity mainActivity = this.ilHKhw3Yw;
            int i2 = MainActivity.mUqPm6GBh;
            if (!mainActivity.QNqj6nIzv()) {
                return qih4lW99W.q3BipwRCk;
            }
            if (this.ilHKhw3Yw.dXrmkklc8) {
                YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                String obj2 = r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk("YW0gYnJvYWRjYXN0IC1hIGFuZHJvaWQuaW50ZW50LmFjdGlvbi5TRU5EIC10IHRleHQvcGxhaW4gLS1lcyAncHJlbG9hZCcgLW4gY29tLmZlcmF2b2x0LnByZWxvYWQucHJvLy5JbnRlbnRSZWNpZXZlcg==")).toString();
                this.MzoOEjc4X = 1;
                if (yuSxiExwK.Bhmn1KIah(obj2, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            } else {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk("cHJlbG9hZA==")).toString());
                intent.setComponent(new ComponentName(r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk("Y29tLmZlcmF2b2x0LnByZWxvYWQucHJv")).toString(), r6NbD4wnj.BL4OzhZBd(KYuHUB7GA.q3BipwRCk("Y29tLmZlcmF2b2x0LnByZWxvYWQucHJvLkludGVudFJlY2lldmVy")).toString()));
                this.ilHKhw3Yw.sendBroadcast(intent);
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
