package con;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class qhIXEpGSH extends aq0NJzKbg {
    public Object dIocxURUo;
    public int kCA6Zs9sL;
    public HashSet tGV7Q6urW;

    @Override // con.aq0NJzKbg
    public aq0NJzKbg J4Ux7ym32() {
        return new qhIXEpGSH();
    }

    @Override // con.aq0NJzKbg
    public void q3BipwRCk(aq0NJzKbg aq0njzkbg) {
        qhIXEpGSH qhixepgsh = (qhIXEpGSH) aq0njzkbg;
        this.tGV7Q6urW = qhixepgsh.tGV7Q6urW;
        this.dIocxURUo = qhixepgsh.dIocxURUo;
        this.kCA6Zs9sL = qhixepgsh.kCA6Zs9sL;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:17:0x0039, B:18:0x003d, B:20:0x0043), top: B:37:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[LOOP:2: B:24:0x0069->B:26:0x007b, LOOP_START, PHI: r4 
      PHI: (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:23:0x0067, B:26:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int tGV7Q6urW(con.vhdnXl5MS r8, con.s05BzCoHq r9) {
        /*
            r7 = this;
            java.lang.Object r0 = con.UvOuyIFuT.J4Ux7ym32
            monitor-enter(r0)
            java.util.HashSet r1 = r7.tGV7Q6urW     // Catch: all -> 0x009e
            monitor-exit(r0)
            r0 = 7
            if (r1 == 0) goto L_0x009d
            con.PlegqbMSA r2 = con.xrf75itJm.q3BipwRCk
            java.lang.Object r2 = r2.kCA6Zs9sL()
            con.HrqgPICFj r2 = (con.HrqgPICFj) r2
            if (r2 != 0) goto L_0x0018
            con.xpuSUT7Gh.DuuXfa7LE()
            con.DkgxZF0Q3 r2 = con.DkgxZF0Q3.Bhmn1KIah
        L_0x0018:
            r3 = r2
            con.Og6dYSoy7 r3 = (con.Og6dYSoy7) r3
            int r3 = r3.J4Ux7ym32()
            int r3 = r3 + -1
            r4 = 0
            if (r3 < 0) goto L_0x0039
            r5 = r4
        L_0x0025:
            int r6 = r5 + 1
            java.lang.Object r5 = r2.get(r5)
            con.n4f84B5OG r5 = (con.n4f84B5OG) r5
            java.lang.Object r5 = r5.CBQ5d1kRq
            con.PmanMZxiM r5 = (con.PmanMZxiM) r5
            r5.IytU16YUK(r8)
            if (r6 <= r3) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r5 = r6
            goto L_0x0025
        L_0x0039:
            java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x007d
        L_0x003d:
            boolean r3 = r1.hasNext()     // Catch: all -> 0x007d
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r1.next()     // Catch: all -> 0x007d
            con.vlsBqYUof r3 = (con.vlsBqYUof) r3     // Catch: all -> 0x007d
            con.aq0NJzKbg r5 = r3.J4Ux7ym32()     // Catch: all -> 0x007d
            con.aq0NJzKbg r3 = con.UvOuyIFuT.Bhmn1KIah(r5, r3, r9)     // Catch: all -> 0x007d
            int r0 = r0 * 31
            int r5 = java.lang.System.identityHashCode(r3)     // Catch: all -> 0x007d
            int r0 = r0 + r5
            int r0 = r0 * 31
            int r3 = r3.q3BipwRCk     // Catch: all -> 0x007d
            int r0 = r0 + r3
            goto L_0x003d
        L_0x005e:
            r9 = r2
            con.Og6dYSoy7 r9 = (con.Og6dYSoy7) r9
            int r9 = r9.J4Ux7ym32()
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x009d
        L_0x0069:
            int r1 = r4 + 1
            java.lang.Object r3 = r2.get(r4)
            con.n4f84B5OG r3 = (con.n4f84B5OG) r3
            java.lang.Object r3 = r3.kmSgne1rO
            con.PmanMZxiM r3 = (con.PmanMZxiM) r3
            r3.IytU16YUK(r8)
            if (r1 <= r9) goto L_0x007b
            goto L_0x009d
        L_0x007b:
            r4 = r1
            goto L_0x0069
        L_0x007d:
            r9 = move-exception
            r0 = r2
            con.Og6dYSoy7 r0 = (con.Og6dYSoy7) r0
            int r0 = r0.J4Ux7ym32()
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x009c
        L_0x0089:
            int r1 = r4 + 1
            java.lang.Object r3 = r2.get(r4)
            con.n4f84B5OG r3 = (con.n4f84B5OG) r3
            java.lang.Object r3 = r3.kmSgne1rO
            con.PmanMZxiM r3 = (con.PmanMZxiM) r3
            r3.IytU16YUK(r8)
            if (r1 > r0) goto L_0x009c
            r4 = r1
            goto L_0x0089
        L_0x009c:
            throw r9
        L_0x009d:
            return r0
        L_0x009e:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qhIXEpGSH.tGV7Q6urW(con.vhdnXl5MS, con.s05BzCoHq):int");
    }
}
