package con;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$getRamFreeKb$2", f = "Utils.kt", l = {62, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FV1rg7G6m extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;

    public FV1rg7G6m(Way959ade way959ade) {
        super(2, way959ade);
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new FV1rg7G6m((Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new FV1rg7G6m(way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        int i;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i2 = this.MzoOEjc4X;
        if (i2 == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk = KYuHUB7GA.q3BipwRCk("YT0kKGNhdCAvcHJvYy9tZW1pbmZvfGdyZXAgQXZhaWx8aGVhZCAtbiAxfGF3ayAneyBwcmludCAkMiB9Jyk7ZWNobyAkKChhKzApKQ==");
            this.MzoOEjc4X = 1;
            obj = yuSxiExwK.Bhmn1KIah(q3BipwRCk, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i2 == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else if (i2 == 2) {
            anXlDk6fV.IytU16YUK(obj);
            i = KYuHUB7GA.iiGwOFFnr((String) obj);
            return new Integer(i);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = KYuHUB7GA.iiGwOFFnr((String) obj);
        if (i < 1) {
            YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk2 = KYuHUB7GA.q3BipwRCk("YT0kKGNhdCAvcHJvYy9tZW1pbmZvfGdyZXAgRnJlZXxoZWFkIC1uIDF8YXdrICd7IHByaW50ICQyIH0nKTtlY2hvICQoKGErMCkp");
            this.MzoOEjc4X = 2;
            obj = yuSxiExwK2.Bhmn1KIah(q3BipwRCk2, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            i = KYuHUB7GA.iiGwOFFnr((String) obj);
        }
        return new Integer(i);
    }
}
