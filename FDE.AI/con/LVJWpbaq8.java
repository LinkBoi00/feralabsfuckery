package con;

import com.feravolt.preload.MainActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$frgSetup$2$2$2", f = "MainActivity.kt", l = {476, 477}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LVJWpbaq8 extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ MainActivity qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LVJWpbaq8(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        LVJWpbaq8 lVJWpbaq8 = new LVJWpbaq8(this.qVUwofr5s, (Way959ade) obj2);
        lVJWpbaq8.ilHKhw3Yw = (oQkvjGXIr) obj;
        return lVJWpbaq8.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        LVJWpbaq8 lVJWpbaq8 = new LVJWpbaq8(this.qVUwofr5s, way959ade);
        lVJWpbaq8.ilHKhw3Yw = obj;
        return lVJWpbaq8;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object yWvV4ePLl(java.lang.Object r9) {
        /*
            r8 = this;
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r8.MzoOEjc4X
            r2 = 0
            java.lang.String r3 = "first_launch"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r5) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            java.lang.Object r0 = r8.ilHKhw3Yw
            con.oQkvjGXIr r0 = (con.oQkvjGXIr) r0
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x005e
        L_0x0017:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001f:
            java.lang.Object r1 = r8.ilHKhw3Yw
            con.oQkvjGXIr r1 = (con.oQkvjGXIr) r1
            con.anXlDk6fV.IytU16YUK(r9)
            goto L_0x0048
        L_0x0027:
            con.anXlDk6fV.IytU16YUK(r9)
            java.lang.Object r9 = r8.ilHKhw3Yw
            r1 = r9
            con.oQkvjGXIr r1 = (con.oQkvjGXIr) r1
            com.feravolt.preload.MainActivity r9 = r8.qVUwofr5s
            android.content.SharedPreferences r9 = android.preference.PreferenceManager.getDefaultSharedPreferences(r9)
            boolean r9 = r9.getBoolean(r3, r5)
            if (r9 == 0) goto L_0x00a3
            r6 = 1200(0x4b0, double:5.93E-321)
            r8.ilHKhw3Yw = r1
            r8.MzoOEjc4X = r5
            java.lang.Object r9 = con.dnBSj5uJN.Bhmn1KIah(r6, r8)
            if (r9 != r0) goto L_0x0048
            return r0
        L_0x0048:
            con.xaeEKvU2c r9 = con.tQmFGxsat.q3BipwRCk
            con.zkUmn2JpE r9 = con.ZezE4t3SB.q3BipwRCk
            con.op02snQYG r5 = new con.op02snQYG
            com.feravolt.preload.MainActivity r6 = r8.qVUwofr5s
            r5.<init>(r6, r2)
            r8.ilHKhw3Yw = r1
            r8.MzoOEjc4X = r4
            java.lang.Object r9 = con.idpM54xlp.qFBXIgpia(r9, r5, r8)
            if (r9 != r0) goto L_0x005e
            return r0
        L_0x005e:
            con.YuSxiExwK r9 = con.tzR8IMGfw.q3BipwRCk
            com.feravolt.preload.MainActivity r0 = r8.qVUwofr5s
            boolean r9 = r9.oon79WMrY(r0)
            if (r9 == 0) goto L_0x0092
            com.feravolt.preload.MainActivity r9 = r8.qVUwofr5s
            java.lang.String r0 = "https://github.com/feravolt/Preload-docs/releases/download/1.0/ver.json"
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()     // Catch: all -> 0x0089
            java.lang.String r9 = r9.dataDir     // Catch: all -> 0x0089
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0089
            r1.<init>()     // Catch: all -> 0x0089
            r1.append(r9)     // Catch: all -> 0x0089
            java.lang.String r9 = "/ver"
            r1.append(r9)     // Catch: all -> 0x0089
            java.lang.String r9 = r1.toString()     // Catch: all -> 0x0089
            r1 = 4
            android.net.Uri r9 = con.idpM54xlp.iiGwOFFnr(r0, r9, r2, r1)     // Catch: all -> 0x0089
            goto L_0x0090
        L_0x0089:
            r9 = move-exception
            con.qlt0VySXJ r0 = new con.qlt0VySXJ
            r0.<init>(r9)
            r9 = r0
        L_0x0090:
            boolean r9 = r9 instanceof con.qlt0VySXJ
        L_0x0092:
            com.feravolt.preload.MainActivity r9 = r8.qVUwofr5s
            android.content.SharedPreferences r9 = android.preference.PreferenceManager.getDefaultSharedPreferences(r9)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            r0 = 0
            r9.putBoolean(r3, r0)
            r9.apply()
        L_0x00a3:
            con.qih4lW99W r9 = con.qih4lW99W.q3BipwRCk
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: con.LVJWpbaq8.yWvV4ePLl(java.lang.Object):java.lang.Object");
    }
}
