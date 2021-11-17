package con;
/* loaded from: classes.dex */
public final class Lkusa3sxO implements Kh7ffW4RH {
    public final Kh7ffW4RH CBQ5d1kRq;
    public final gknx5HUb7 kmSgne1rO = new gknx5HUb7();

    public Lkusa3sxO(Kh7ffW4RH kh7ffW4RH) {
        this.CBQ5d1kRq = kh7ffW4RH;
    }

    @Override // con.bu5cjmae6
    public Object fold(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    @Override // con.zG81huwZq, con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        return idpM54xlp.Puu3Rhg4F(this, adus3shb2);
    }

    @Override // con.zG81huwZq
    public adUS3SHb2 getKey() {
        return LQcLPKzab.CBQ5d1kRq;
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        return pz7YPhQTU.RG6kpfv3v(this, adus3shb2);
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return idpM54xlp.dfpT1j18n(this, bu5cjmae6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r8 == r1) goto L_0x007a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:32:0x008b, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // con.Kh7ffW4RH
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.Object q3BipwRCk(con.PmanMZxiM r7, con.Way959ade r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof con.voqXHI10U
            if (r0 == 0) goto L_0x0013
            r0 = r8
            con.voqXHI10U r0 = (con.voqXHI10U) r0
            int r1 = r0.Eeka1udhb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Eeka1udhb = r1
            goto L_0x0018
        L_0x0013:
            con.voqXHI10U r0 = new con.voqXHI10U
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.ilHKhw3Yw
            con.kBKJSqCSL r1 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r2 = r0.Eeka1udhb
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            con.anXlDk6fV.IytU16YUK(r8)
            goto L_0x008e
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.MzoOEjc4X
            con.PmanMZxiM r7 = (con.PmanMZxiM) r7
            java.lang.Object r2 = r0.PSTqBLTET
            con.Lkusa3sxO r2 = (con.Lkusa3sxO) r2
            con.anXlDk6fV.IytU16YUK(r8)
            goto L_0x007e
        L_0x003e:
            con.anXlDk6fV.IytU16YUK(r8)
            con.gknx5HUb7 r8 = r6.kmSgne1rO
            r0.PSTqBLTET = r6
            r0.MzoOEjc4X = r7
            r0.Eeka1udhb = r4
            java.lang.Object r2 = r8.J4Ux7ym32
            monitor-enter(r2)
            boolean r5 = r8.kCA6Zs9sL     // Catch: all -> 0x0092
            monitor-exit(r2)
            if (r5 == 0) goto L_0x0052
            goto L_0x0078
        L_0x0052:
            con.tmgChDFqU r2 = new con.tmgChDFqU
            con.Way959ade r5 = con.idpM54xlp.PSTqBLTET(r0)
            r2.<init>(r5, r4)
            r2.Eeka1udhb()
            java.lang.Object r4 = r8.J4Ux7ym32
            monitor-enter(r4)
            java.lang.Object r5 = r8.tGV7Q6urW     // Catch: all -> 0x008f
            java.util.List r5 = (java.util.List) r5     // Catch: all -> 0x008f
            r5.add(r2)     // Catch: all -> 0x008f
            monitor-exit(r4)
            con.dMQC97DHs r4 = new con.dMQC97DHs
            r4.<init>(r8, r2)
            r2.RG6kpfv3v(r4)
            java.lang.Object r8 = r2.qVUwofr5s()
            if (r8 != r1) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            con.qih4lW99W r8 = con.qih4lW99W.q3BipwRCk
        L_0x007a:
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r2 = r6
        L_0x007e:
            con.Kh7ffW4RH r8 = r2.CBQ5d1kRq
            r2 = 0
            r0.PSTqBLTET = r2
            r0.MzoOEjc4X = r2
            r0.Eeka1udhb = r3
            java.lang.Object r8 = r8.q3BipwRCk(r7, r0)
            if (r8 != r1) goto L_0x008e
            return r1
        L_0x008e:
            return r8
        L_0x008f:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L_0x0092:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Lkusa3sxO.q3BipwRCk(con.PmanMZxiM, con.Way959ade):java.lang.Object");
    }
}
