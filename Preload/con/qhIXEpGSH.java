package con;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
    public final int tGV7Q6urW(vhdnXl5MS vhdnxl5ms, s05BzCoHq s05bzcohq) {
        HashSet hashSet;
        Iterator it;
        int J4Ux7ym32;
        synchronized (UvOuyIFuT.J4Ux7ym32) {
            hashSet = this.tGV7Q6urW;
        }
        int i = 7;
        if (hashSet != null) {
            List list = (HrqgPICFj) xrf75itJm.q3BipwRCk.kCA6Zs9sL();
            if (list == null) {
                xpuSUT7Gh.DuuXfa7LE();
                list = DkgxZF0Q3.Bhmn1KIah;
            }
            int J4Ux7ym322 = ((Og6dYSoy7) list).J4Ux7ym32() - 1;
            int i2 = 0;
            try {
                if (J4Ux7ym322 >= 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        ((PmanMZxiM) ((n4f84B5OG) list.get(i3)).CBQ5d1kRq).IytU16YUK(vhdnxl5ms);
                        if (i4 <= J4Ux7ym322) {
                            i3 = i4;
                        }
                    }
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        vlsBqYUof vlsbqyuof = (vlsBqYUof) it.next();
                        aq0NJzKbg Bhmn1KIah = UvOuyIFuT.Bhmn1KIah(vlsbqyuof.J4Ux7ym32(), vlsbqyuof, s05bzcohq);
                        i = (((i * 31) + System.identityHashCode(Bhmn1KIah)) * 31) + Bhmn1KIah.q3BipwRCk;
                    }
                    J4Ux7ym32 = ((Og6dYSoy7) list).J4Ux7ym32() - 1;
                    if (J4Ux7ym32 >= 0) {
                        while (true) {
                            int i5 = i2 + 1;
                            ((PmanMZxiM) ((n4f84B5OG) list.get(i2)).kmSgne1rO).IytU16YUK(vhdnxl5ms);
                            if (i5 > J4Ux7ym32) {
                                break;
                            }
                            i2 = i5;
                        }
                    }
                }
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                J4Ux7ym32 = ((Og6dYSoy7) list).J4Ux7ym32() - 1;
                if (J4Ux7ym32 >= 0) {
                }
            } catch (Throwable th) {
                int J4Ux7ym323 = ((Og6dYSoy7) list).J4Ux7ym32() - 1;
                if (J4Ux7ym323 >= 0) {
                    while (true) {
                        int i6 = i2 + 1;
                        ((PmanMZxiM) ((n4f84B5OG) list.get(i2)).kmSgne1rO).IytU16YUK(vhdnxl5ms);
                        if (i6 > J4Ux7ym323) {
                            break;
                        }
                        i2 = i6;
                    }
                }
                throw th;
            }
        }
        return i;
    }
}
