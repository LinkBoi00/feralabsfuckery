package con;

import com.feravolt.preload.MainActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$CleanRamIconButton$1$1", f = "MainActivity.kt", l = {847, 852, 853, 856, 858}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class xveaPxuey extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ MainActivity ilHKhw3Yw;
    public final /* synthetic */ boolean qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xveaPxuey(MainActivity mainActivity, boolean z, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = mainActivity;
        this.qVUwofr5s = z;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new xveaPxuey(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new xveaPxuey(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r9) {
        /*
            r8 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r8.MzoOEjc4X
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r6) goto L_0x0029
            if (r1 == r5) goto L_0x0025
            if (r1 == r4) goto L_0x0021
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0088
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0077
        L_0x0025:
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x005b
        L_0x0029:
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0046
        L_0x002d:
            con.anXlDk6fV.IytU16YUK(r9)
            com.feravolt.preload.MainActivity r9 = r8.ilHKhw3Yw
            com.feravolt.preload.MainActivity.mUqPm6GBh(r9, r6)
            con.YuSxiExwK r9 = con.tzR8IMGfw.q3BipwRCk
            java.lang.String r1 = "Uz0kKGdldHByb3Agcm8uYnVpbGQudmVyc2lvbi5zZGspO2lmIFsgIiRTIiAtbGUgIjI2IiBdO3RoZW4gc2VydmljZSBjYWxsIGFjdGl2aXR5IDUxIGkzMiAwO2VsaWYgWyAiJFMiIC1lcSAiMjciIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNDIgaTMyIDA7ZWxpZiBbICIkUyIgLWVxICIyOCIgXTt0aGVuIHNlcnZpY2UgY2FsbCBhY3Rpdml0eSA0NyBpMzIgMDtlbGlmIFsgIiRTIiAtZXEgIjI5IiBdO3RoZW4gc2VydmljZSBjYWxsIGFjdGl2aXR5IDQwIGkzMiAwO2VsaWYgWyAiJFMiIC1nZSAiMzAiIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNDQgaTMyIDA7Zmk7YW0ga2lsbC1hbGw7YW0gbWVtb3J5LWZhY3RvciBzZXQgQ1JJVElDQUw7"
            java.lang.String r1 = con.KYuHUB7GA.q3BipwRCk(r1)
            r8.MzoOEjc4X = r6
            java.lang.Object r9 = r9.Bhmn1KIah(r1, r8)
            if (r9 != r0) goto L_0x0046
            return r0
        L_0x0046:
            java.lang.System.runFinalization()
            java.lang.System.gc()
            boolean r9 = r8.qVUwofr5s
            if (r9 == 0) goto L_0x006c
            r6 = 900(0x384, double:4.447E-321)
            r8.MzoOEjc4X = r5
            java.lang.Object r9 = con.dnBSj5uJN.Bhmn1KIah(r6, r8)
            if (r9 != r0) goto L_0x005b
            return r0
        L_0x005b:
            con.YuSxiExwK r9 = con.tzR8IMGfw.q3BipwRCk
            java.lang.String r1 = "YW0gd3JpdGU7c3luYzthbSBraWxsLWFsbDtzbGVlcCAxO2VjaG8gMyA+L3Byb2Mvc3lzL3ZtL2Ryb3BfY2FjaGVzO3NsZWVwIDE7c3luYzs="
            java.lang.String r1 = con.KYuHUB7GA.q3BipwRCk(r1)
            r8.MzoOEjc4X = r4
            java.lang.Object r9 = r9.Bhmn1KIah(r1, r8)
            if (r9 != r0) goto L_0x0077
            return r0
        L_0x006c:
            r4 = 7200(0x1c20, double:3.5573E-320)
            r8.MzoOEjc4X = r3
            java.lang.Object r9 = con.dnBSj5uJN.Bhmn1KIah(r4, r8)
            if (r9 != r0) goto L_0x0077
            return r0
        L_0x0077:
            con.YuSxiExwK r9 = con.tzR8IMGfw.q3BipwRCk
            java.lang.String r1 = "Uz0kKGdldHByb3Agcm8uYnVpbGQudmVyc2lvbi5zZGspO2FtIG1lbW9yeS1mYWN0b3IgcmVzZXQ7aWYgWyAiJFMiIC1sZSAiMjYiIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNTEgaTMyIC0xO2VsaWYgWyAiJFMiIC1lcSAiMjciIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNDIgaTMyIC0xO2VsaWYgWyAiJFMiIC1lcSAiMjgiIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNDcgaTMyIC0xO2VsaWYgWyAiJFMiIC1lcSAiMjkiIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNDAgaTMyIC0xO2VsaWYgWyAiJFMiIC1nZSAiMzAiIF07dGhlbiBzZXJ2aWNlIGNhbGwgYWN0aXZpdHkgNDQgaTMyIC0xO2ZpOw=="
            java.lang.String r1 = con.KYuHUB7GA.q3BipwRCk(r1)
            r8.MzoOEjc4X = r2
            java.lang.Object r9 = r9.Bhmn1KIah(r1, r8)
            if (r9 != r0) goto L_0x0088
            return r0
        L_0x0088:
            com.feravolt.preload.MainActivity r9 = r8.ilHKhw3Yw
            r0 = 0
            com.feravolt.preload.MainActivity.mUqPm6GBh(r9, r0)
            com.feravolt.preload.MainActivity r9 = r8.ilHKhw3Yw
            r0 = 2131755212(0x7f1000cc, float:1.9141297E38)
            java.lang.String r0 = r9.getString(r0)
            com.feravolt.preload.MainActivity.NyWTwPF6V(r9, r0)
            con.qih4lW99W r9 = con.qih4lW99W.q3BipwRCk
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xveaPxuey.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
