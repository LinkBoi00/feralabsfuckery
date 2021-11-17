package con;
/* loaded from: classes.dex */
public final class I5LF8ecws extends XfZNqxMmg implements V1N1H6iou, Sm35UxCQt {
    public int PSTqBLTET;
    private volatile /* synthetic */ Object _state;

    public I5LF8ecws(Object obj) {
        this._state = obj;
    }

    @Override // con.StKB0Hl3H
    public boolean J4Ux7ym32(Object obj) {
        yWvV4ePLl(null, obj);
        return true;
    }

    public Object Puu3Rhg4F() {
        vX9ZKIhAp vx9zkihap = rhiWXx8NP.q3BipwRCk;
        Object obj = this._state;
        if (obj == vx9zkihap) {
            return null;
        }
        return obj;
    }

    @Override // con.XfZNqxMmg
    public JQhKJ2jfw[] iiGwOFFnr(int i) {
        return new Mlzmby2a4[i];
    }

    @Override // con.XfZNqxMmg
    public JQhKJ2jfw kCA6Zs9sL() {
        return new Mlzmby2a4();
    }

    @Override // con.StKB0Hl3H, con.f106ugAzx
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        if (obj == null) {
            obj = rhiWXx8NP.q3BipwRCk;
        }
        yWvV4ePLl(null, obj);
        return qih4lW99W.q3BipwRCk;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:14:0x0041, B:19:0x0060, B:22:0x0073, B:25:0x0087, B:27:0x0097, B:30:0x009c, B:32:0x00a1, B:34:0x00a7, B:38:0x00ae, B:43:0x00c8, B:48:0x00dc, B:51:0x00fb, B:52:0x0100, B:55:0x0107), top: B:60:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:14:0x0041, B:19:0x0060, B:22:0x0073, B:25:0x0087, B:27:0x0097, B:30:0x009c, B:32:0x00a1, B:34:0x00a7, B:38:0x00ae, B:43:0x00c8, B:48:0x00dc, B:51:0x00fb, B:52:0x0100, B:55:0x0107), top: B:60:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:14:0x0041, B:19:0x0060, B:22:0x0073, B:25:0x0087, B:27:0x0097, B:30:0x009c, B:32:0x00a1, B:34:0x00a7, B:38:0x00ae, B:43:0x00c8, B:48:0x00dc, B:51:0x00fb, B:52:0x0100, B:55:0x0107), top: B:60:0x0027 }] */
    @Override // con.Sm35UxCQt
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.Object tGV7Q6urW(con.f106ugAzx r18, con.Way959ade r19) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: con.I5LF8ecws.tGV7Q6urW(con.f106ugAzx, con.Way959ade):java.lang.Object");
    }

    public final boolean yWvV4ePLl(Object obj, Object obj2) {
        int i;
        JQhKJ2jfw[] jQhKJ2jfwArr;
        vX9ZKIhAp vx9zkihap;
        synchronized (this) {
            Object obj3 = this._state;
            if (!(obj == null || anXlDk6fV.tGV7Q6urW(obj3, obj))) {
                return false;
            }
            if (anXlDk6fV.tGV7Q6urW(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.PSTqBLTET;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.PSTqBLTET = i3;
                JQhKJ2jfw[] jQhKJ2jfwArr2 = this.CBQ5d1kRq;
                while (true) {
                    Mlzmby2a4[] mlzmby2a4Arr = (Mlzmby2a4[]) jQhKJ2jfwArr2;
                    if (mlzmby2a4Arr != null) {
                        for (Mlzmby2a4 mlzmby2a4 : mlzmby2a4Arr) {
                            if (mlzmby2a4 != null) {
                                while (true) {
                                    Object obj4 = mlzmby2a4._state;
                                    if (obj4 != null && obj4 != (vx9zkihap = oKXqDRKlG.J4Ux7ym32)) {
                                        vX9ZKIhAp vx9zkihap2 = oKXqDRKlG.q3BipwRCk;
                                        if (obj4 == vx9zkihap2) {
                                            if (Mlzmby2a4.q3BipwRCk.compareAndSet(mlzmby2a4, obj4, vx9zkihap)) {
                                                break;
                                            }
                                        } else if (Mlzmby2a4.q3BipwRCk.compareAndSet(mlzmby2a4, obj4, vx9zkihap2)) {
                                            ((tmgChDFqU) obj4).Bhmn1KIah(qih4lW99W.q3BipwRCk);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.PSTqBLTET;
                        if (i == i3) {
                            this.PSTqBLTET = i3 + 1;
                            return true;
                        }
                        jQhKJ2jfwArr = this.CBQ5d1kRq;
                    }
                    jQhKJ2jfwArr2 = jQhKJ2jfwArr;
                    i3 = i;
                }
            } else {
                this.PSTqBLTET = i2 + 2;
                return true;
            }
        }
    }
}
