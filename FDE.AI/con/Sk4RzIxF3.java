package con;
/* loaded from: classes.dex */
public final class Sk4RzIxF3 extends YcVx1OAEe {
    public final YcVx1OAEe oon79WMrY;
    public boolean vPSbyrYWX;

    public Sk4RzIxF3(int i, Uhy55gmtq uhy55gmtq, PmanMZxiM pmanMZxiM, PmanMZxiM pmanMZxiM2, YcVx1OAEe ycVx1OAEe) {
        super(i, uhy55gmtq, pmanMZxiM, pmanMZxiM2);
        this.oon79WMrY = ycVx1OAEe;
        ycVx1OAEe.yWvV4ePLl(this);
    }

    @Override // con.YcVx1OAEe, con.s05BzCoHq
    public void J4Ux7ym32() {
        if (!this.tGV7Q6urW) {
            super.J4Ux7ym32();
            if (!this.vPSbyrYWX) {
                this.vPSbyrYWX = true;
                this.oon79WMrY.oon79WMrY(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x00a9, TryCatch #1 {, blocks: (B:12:0x001f, B:14:0x0024, B:17:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0057, B:25:0x005b, B:26:0x005e, B:28:0x0066, B:29:0x006b, B:30:0x008a, B:32:0x0093, B:31:0x008b), top: B:43:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x001f, B:14:0x0024, B:17:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0057, B:25:0x005b, B:26:0x005e, B:28:0x0066, B:29:0x006b, B:30:0x008a, B:32:0x0093, B:31:0x008b), top: B:43:0x001f }] */
    @Override // con.YcVx1OAEe
    /* Code decompiled incorrectly, please refer to instructions dump */
    public con.mxyx08G80 ilHKhw3Yw() {
        /*
            r6 = this;
            con.YcVx1OAEe r0 = r6.oon79WMrY
            boolean r1 = r0.yWvV4ePLl
            if (r1 != 0) goto L_0x00ac
            boolean r1 = r0.tGV7Q6urW
            if (r1 == 0) goto L_0x000c
            goto L_0x00ac
        L_0x000c:
            java.util.Set r1 = r6.iiGwOFFnr
            int r2 = r6.J4Ux7ym32
            if (r1 == 0) goto L_0x001b
            con.Uhy55gmtq r3 = r0.dIocxURUo()
            java.util.Map r0 = con.UvOuyIFuT.tGV7Q6urW(r0, r6, r3)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.Object r3 = con.UvOuyIFuT.J4Ux7ym32
            monitor-enter(r3)
            con.UvOuyIFuT.dIocxURUo(r6)     // Catch: all -> 0x00a9
            if (r1 == 0) goto L_0x005b
            int r4 = r1.size()     // Catch: all -> 0x00a9
            if (r4 != 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            con.YcVx1OAEe r4 = r6.oon79WMrY     // Catch: all -> 0x00a9
            int r4 = r4.tGV7Q6urW()     // Catch: all -> 0x00a9
            con.YcVx1OAEe r5 = r6.oon79WMrY     // Catch: all -> 0x00a9
            con.Uhy55gmtq r5 = r5.dIocxURUo()     // Catch: all -> 0x00a9
            con.mxyx08G80 r0 = r6.Eeka1udhb(r4, r0, r5)     // Catch: all -> 0x00a9
            con.xr8bQ8VNz r4 = con.xr8bQ8VNz.q3BipwRCk     // Catch: all -> 0x00a9
            boolean r4 = con.anXlDk6fV.tGV7Q6urW(r0, r4)     // Catch: all -> 0x00a9
            if (r4 != 0) goto L_0x0045
            monitor-exit(r3)
            return r0
        L_0x0045:
            con.YcVx1OAEe r0 = r6.oon79WMrY     // Catch: all -> 0x00a9
            java.util.Set r0 = r0.qVUwofr5s()     // Catch: all -> 0x00a9
            if (r0 != 0) goto L_0x0057
            java.util.HashSet r0 = new java.util.HashSet     // Catch: all -> 0x00a9
            r0.<init>()     // Catch: all -> 0x00a9
            con.YcVx1OAEe r4 = r6.oon79WMrY     // Catch: all -> 0x00a9
            r4.RG6kpfv3v(r0)     // Catch: all -> 0x00a9
        L_0x0057:
            r0.addAll(r1)     // Catch: all -> 0x00a9
            goto L_0x005e
        L_0x005b:
            r6.q3BipwRCk()     // Catch: all -> 0x00a9
        L_0x005e:
            con.YcVx1OAEe r0 = r6.oon79WMrY     // Catch: all -> 0x00a9
            int r0 = r0.tGV7Q6urW()     // Catch: all -> 0x00a9
            if (r0 >= r2) goto L_0x006b
            con.YcVx1OAEe r0 = r6.oon79WMrY     // Catch: all -> 0x00a9
            r0.MzoOEjc4X()     // Catch: all -> 0x00a9
        L_0x006b:
            con.YcVx1OAEe r0 = r6.oon79WMrY     // Catch: all -> 0x00a9
            con.Uhy55gmtq r1 = r0.dIocxURUo()     // Catch: all -> 0x00a9
            con.Uhy55gmtq r1 = r1.kCA6Zs9sL(r2)     // Catch: all -> 0x00a9
            con.Uhy55gmtq r4 = r6.GPLPRo6go     // Catch: all -> 0x00a9
            con.Uhy55gmtq r1 = r1.J4Ux7ym32(r4)     // Catch: all -> 0x00a9
            r0.Bhmn1KIah(r1)     // Catch: all -> 0x00a9
            con.YcVx1OAEe r0 = r6.oon79WMrY     // Catch: all -> 0x00a9
            r0.dXrmkklc8(r2)     // Catch: all -> 0x00a9
            con.YcVx1OAEe r0 = r6.oon79WMrY     // Catch: all -> 0x00a9
            con.Uhy55gmtq r1 = r6.GPLPRo6go     // Catch: all -> 0x00a9
            java.util.Objects.requireNonNull(r0)     // Catch: all -> 0x00a9
            monitor-enter(r3)     // Catch: all -> 0x00a9
            con.Uhy55gmtq r2 = r0.GPLPRo6go     // Catch: all -> 0x00a6
            con.Uhy55gmtq r1 = r2.GPLPRo6go(r1)     // Catch: all -> 0x00a6
            r0.GPLPRo6go = r1     // Catch: all -> 0x00a6
            monitor-exit(r3)     // Catch: all -> 0x00a9
            monitor-exit(r3)
            r0 = 1
            r6.yWvV4ePLl = r0
            boolean r1 = r6.vPSbyrYWX
            if (r1 != 0) goto L_0x00a3
            r6.vPSbyrYWX = r0
            con.YcVx1OAEe r0 = r6.oon79WMrY
            r0.oon79WMrY(r6)
        L_0x00a3:
            con.xr8bQ8VNz r0 = con.xr8bQ8VNz.q3BipwRCk
            return r0
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x00a9
            throw r0     // Catch: all -> 0x00a9
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ac:
            con.k3hmDZbMb r0 = new con.k3hmDZbMb
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Sk4RzIxF3.ilHKhw3Yw():con.mxyx08G80");
    }
}
