package con;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class Vy9q8M95G extends XfZNqxMmg implements StKB0Hl3H, Sm35UxCQt {
    public long Eeka1udhb;
    public final int MzoOEjc4X;
    public final int PSTqBLTET;
    public int RG6kpfv3v;
    public long dXrmkklc8;
    public final n5fKsru0Y ilHKhw3Yw;
    public int ixWaw2akD;
    public Object[] qVUwofr5s;

    public Vy9q8M95G(int i, int i2, n5fKsru0Y n5fksru0y) {
        this.PSTqBLTET = i;
        this.MzoOEjc4X = i2;
        this.ilHKhw3Yw = n5fksru0y;
    }

    public final long Bhmn1KIah() {
        return Math.min(this.dXrmkklc8, this.Eeka1udhb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Way959ade[] CBQ5d1kRq(Way959ade[] way959adeArr) {
        JQhKJ2jfw[] jQhKJ2jfwArr;
        i9ai2FKAd i9ai2fkad;
        Way959ade way959ade;
        int length = way959adeArr.length;
        if (!(this.kmSgne1rO == 0 || (jQhKJ2jfwArr = this.CBQ5d1kRq) == null)) {
            int length2 = jQhKJ2jfwArr.length;
            int i = 0;
            way959adeArr = way959adeArr;
            while (i < length2) {
                JQhKJ2jfw jQhKJ2jfw = jQhKJ2jfwArr[i];
                if (!(jQhKJ2jfw == null || (way959ade = (i9ai2fkad = (i9ai2FKAd) jQhKJ2jfw).J4Ux7ym32) == null || qVUwofr5s(i9ai2fkad) < 0)) {
                    int length3 = way959adeArr.length;
                    way959adeArr = way959adeArr;
                    if (length >= length3) {
                        way959adeArr = Arrays.copyOf(way959adeArr, Math.max(2, way959adeArr.length * 2));
                    }
                    length++;
                    way959adeArr[length] = way959ade;
                    i9ai2fkad.J4Ux7ym32 = null;
                }
                i++;
                way959adeArr = way959adeArr;
            }
        }
        return way959adeArr;
    }

    public final Object Eeka1udhb(i9ai2FKAd i9ai2fkad) {
        Object obj;
        Way959ade[] way959adeArr = OYElP68OS.q3BipwRCk;
        synchronized (this) {
            long qVUwofr5s = qVUwofr5s(i9ai2fkad);
            if (qVUwofr5s < 0) {
                obj = dKhv6D4Rg.q3BipwRCk;
            } else {
                long j = i9ai2fkad.q3BipwRCk;
                Object[] objArr = this.qVUwofr5s;
                Object obj2 = objArr[((int) qVUwofr5s) & (objArr.length - 1)];
                if (obj2 instanceof T6mjRn3Wp) {
                    obj2 = ((T6mjRn3Wp) obj2).Bhmn1KIah;
                }
                i9ai2fkad.q3BipwRCk = qVUwofr5s + 1;
                way959adeArr = RG6kpfv3v(j);
                obj = obj2;
            }
        }
        int i = 0;
        int length = way959adeArr.length;
        while (i < length) {
            Way959ade way959ade = way959adeArr[i];
            i++;
            if (way959ade != null) {
                way959ade.Bhmn1KIah(qih4lW99W.q3BipwRCk);
            }
        }
        return obj;
    }

    @Override // con.StKB0Hl3H
    public boolean J4Ux7ym32(Object obj) {
        int i;
        boolean z;
        Way959ade[] way959adeArr = OYElP68OS.q3BipwRCk;
        synchronized (this) {
            i = 0;
            if (ilHKhw3Yw(obj)) {
                way959adeArr = CBQ5d1kRq(way959adeArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = way959adeArr.length;
        while (i < length) {
            Way959ade way959ade = way959adeArr[i];
            i++;
            if (way959ade != null) {
                way959ade.Bhmn1KIah(qih4lW99W.q3BipwRCk);
            }
        }
        return z;
    }

    public final Object[] MzoOEjc4X(Object[] objArr, int i, int i2) {
        int i3 = 0;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.qVUwofr5s = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long Bhmn1KIah = Bhmn1KIah();
            if (i > 0) {
                while (true) {
                    int i4 = i3 + 1;
                    int i5 = (int) (((long) i3) + Bhmn1KIah);
                    objArr2[i5 & (i2 - 1)] = objArr[(objArr.length - 1) & i5];
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final int PSTqBLTET() {
        return this.RG6kpfv3v + this.ixWaw2akD;
    }

    public final Object Puu3Rhg4F(i9ai2FKAd i9ai2fkad, Way959ade way959ade) {
        qih4lW99W qih4lw99w;
        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(way959ade), 1);
        tmgchdfqu.Eeka1udhb();
        synchronized (this) {
            if (qVUwofr5s(i9ai2fkad) < 0) {
                i9ai2fkad.J4Ux7ym32 = tmgchdfqu;
                i9ai2fkad.J4Ux7ym32 = tmgchdfqu;
            } else {
                tmgchdfqu.Bhmn1KIah(qih4lW99W.q3BipwRCk);
            }
            qih4lw99w = qih4lW99W.q3BipwRCk;
        }
        Object qVUwofr5s = tmgchdfqu.qVUwofr5s();
        return qVUwofr5s == kBKJSqCSL.COROUTINE_SUSPENDED ? qVUwofr5s : qih4lw99w;
    }

    public final Way959ade[] RG6kpfv3v(long j) {
        JQhKJ2jfw[] jQhKJ2jfwArr;
        if (j > this.dXrmkklc8) {
            return OYElP68OS.q3BipwRCk;
        }
        long Bhmn1KIah = Bhmn1KIah();
        long j2 = ((long) this.RG6kpfv3v) + Bhmn1KIah;
        long j3 = 1;
        if (this.MzoOEjc4X == 0 && this.ixWaw2akD > 0) {
            j2++;
        }
        if (!(this.kmSgne1rO == 0 || (jQhKJ2jfwArr = this.CBQ5d1kRq) == null)) {
            for (JQhKJ2jfw jQhKJ2jfw : jQhKJ2jfwArr) {
                if (jQhKJ2jfw != null) {
                    long j4 = ((i9ai2FKAd) jQhKJ2jfw).q3BipwRCk;
                    if (j4 >= 0 && j4 < j2) {
                        j2 = j4;
                    }
                }
            }
        }
        if (j2 <= this.dXrmkklc8) {
            return OYElP68OS.q3BipwRCk;
        }
        long kmSgne1rO = kmSgne1rO();
        int min = this.kmSgne1rO > 0 ? Math.min(this.ixWaw2akD, this.MzoOEjc4X - ((int) (kmSgne1rO - j2))) : this.ixWaw2akD;
        Way959ade[] way959adeArr = OYElP68OS.q3BipwRCk;
        long j5 = ((long) this.ixWaw2akD) + kmSgne1rO;
        if (min > 0) {
            way959adeArr = new Way959ade[min];
            Object[] objArr = this.qVUwofr5s;
            if (kmSgne1rO < j5) {
                long j6 = kmSgne1rO;
                int i = 0;
                while (true) {
                    long j7 = kmSgne1rO + j3;
                    int i2 = (int) kmSgne1rO;
                    Object obj = objArr[(objArr.length - 1) & i2];
                    vX9ZKIhAp vx9zkihap = dKhv6D4Rg.q3BipwRCk;
                    if (obj != vx9zkihap) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        T6mjRn3Wp t6mjRn3Wp = (T6mjRn3Wp) obj;
                        int i3 = i + 1;
                        way959adeArr[i] = t6mjRn3Wp.PSTqBLTET;
                        objArr[(objArr.length - 1) & i2] = vx9zkihap;
                        objArr[((int) j6) & (objArr.length - 1)] = t6mjRn3Wp.Bhmn1KIah;
                        kmSgne1rO = j6 + 1;
                        if (i3 >= min) {
                            break;
                        }
                        i = i3;
                        j6 = kmSgne1rO;
                    }
                    if (j7 >= j5) {
                        kmSgne1rO = j6;
                        break;
                    }
                    kmSgne1rO = j7;
                    j3 = 1;
                }
            }
        }
        int i4 = (int) (kmSgne1rO - Bhmn1KIah);
        long j8 = this.kmSgne1rO == 0 ? kmSgne1rO : j2;
        long max = Math.max(this.Eeka1udhb, kmSgne1rO - ((long) Math.min(this.PSTqBLTET, i4)));
        if (this.MzoOEjc4X == 0 && max < j5) {
            Object[] objArr2 = this.qVUwofr5s;
            if (anXlDk6fV.tGV7Q6urW(objArr2[((int) max) & (objArr2.length - 1)], dKhv6D4Rg.q3BipwRCk)) {
                kmSgne1rO++;
                max++;
            }
        }
        dXrmkklc8(max, j8, kmSgne1rO, j5);
        yWvV4ePLl();
        boolean z = true;
        if (way959adeArr.length != 0) {
            z = false;
        }
        return z ^ true ? CBQ5d1kRq(way959adeArr) : way959adeArr;
    }

    public final void dXrmkklc8(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        long Bhmn1KIah = Bhmn1KIah();
        if (Bhmn1KIah < min) {
            while (true) {
                long j5 = 1 + Bhmn1KIah;
                Object[] objArr = this.qVUwofr5s;
                objArr[((int) Bhmn1KIah) & (objArr.length - 1)] = null;
                if (j5 >= min) {
                    break;
                }
                Bhmn1KIah = j5;
            }
        }
        this.Eeka1udhb = j;
        this.dXrmkklc8 = j2;
        this.RG6kpfv3v = (int) (j3 - min);
        this.ixWaw2akD = (int) (j4 - j3);
    }

    @Override // con.XfZNqxMmg
    public JQhKJ2jfw[] iiGwOFFnr(int i) {
        return new i9ai2FKAd[i];
    }

    public final boolean ilHKhw3Yw(Object obj) {
        if (this.kmSgne1rO == 0) {
            if (this.PSTqBLTET != 0) {
                vPSbyrYWX(obj);
                int i = this.RG6kpfv3v + 1;
                this.RG6kpfv3v = i;
                if (i > this.PSTqBLTET) {
                    oon79WMrY();
                }
                this.dXrmkklc8 = Bhmn1KIah() + ((long) this.RG6kpfv3v);
            }
            return true;
        }
        if (this.RG6kpfv3v >= this.MzoOEjc4X && this.dXrmkklc8 <= this.Eeka1udhb) {
            int ordinal = this.ilHKhw3Yw.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        vPSbyrYWX(obj);
        int i2 = this.RG6kpfv3v + 1;
        this.RG6kpfv3v = i2;
        if (i2 > this.MzoOEjc4X) {
            oon79WMrY();
        }
        long Bhmn1KIah = Bhmn1KIah() + ((long) this.RG6kpfv3v);
        long j = this.Eeka1udhb;
        if (((int) (Bhmn1KIah - j)) > this.PSTqBLTET) {
            dXrmkklc8(j + 1, this.dXrmkklc8, kmSgne1rO(), Bhmn1KIah() + ((long) this.RG6kpfv3v) + ((long) this.ixWaw2akD));
        }
        return true;
    }

    @Override // con.XfZNqxMmg
    public JQhKJ2jfw kCA6Zs9sL() {
        return new i9ai2FKAd();
    }

    public final long kmSgne1rO() {
        return Bhmn1KIah() + ((long) this.RG6kpfv3v);
    }

    public final void oon79WMrY() {
        JQhKJ2jfw[] jQhKJ2jfwArr;
        Object[] objArr = this.qVUwofr5s;
        objArr[((int) Bhmn1KIah()) & (objArr.length - 1)] = null;
        this.RG6kpfv3v--;
        long Bhmn1KIah = Bhmn1KIah() + 1;
        if (this.Eeka1udhb < Bhmn1KIah) {
            this.Eeka1udhb = Bhmn1KIah;
        }
        if (this.dXrmkklc8 < Bhmn1KIah) {
            if (!(this.kmSgne1rO == 0 || (jQhKJ2jfwArr = this.CBQ5d1kRq) == null)) {
                for (JQhKJ2jfw jQhKJ2jfw : jQhKJ2jfwArr) {
                    if (jQhKJ2jfw != null) {
                        i9ai2FKAd i9ai2fkad = (i9ai2FKAd) jQhKJ2jfw;
                        long j = i9ai2fkad.q3BipwRCk;
                        if (j >= 0 && j < Bhmn1KIah) {
                            i9ai2fkad.q3BipwRCk = Bhmn1KIah;
                        }
                    }
                }
            }
            this.dXrmkklc8 = Bhmn1KIah;
        }
    }

    @Override // con.StKB0Hl3H, con.f106ugAzx
    public Object q3BipwRCk(Object obj, Way959ade way959ade) {
        T6mjRn3Wp t6mjRn3Wp;
        Way959ade[] way959adeArr;
        if (J4Ux7ym32(obj)) {
            return qih4lW99W.q3BipwRCk;
        }
        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(way959ade), 1);
        tmgchdfqu.Eeka1udhb();
        Way959ade[] way959adeArr2 = OYElP68OS.q3BipwRCk;
        synchronized (this) {
            if (ilHKhw3Yw(obj)) {
                tmgchdfqu.Bhmn1KIah(qih4lW99W.q3BipwRCk);
                way959adeArr = CBQ5d1kRq(way959adeArr2);
                t6mjRn3Wp = null;
            } else {
                T6mjRn3Wp t6mjRn3Wp2 = new T6mjRn3Wp(this, ((long) PSTqBLTET()) + Bhmn1KIah(), obj, tmgchdfqu);
                vPSbyrYWX(t6mjRn3Wp2);
                this.ixWaw2akD++;
                if (this.MzoOEjc4X == 0) {
                    way959adeArr2 = CBQ5d1kRq(way959adeArr2);
                }
                way959adeArr = way959adeArr2;
                t6mjRn3Wp = t6mjRn3Wp2;
            }
        }
        if (t6mjRn3Wp != null) {
            idpM54xlp.kCA6Zs9sL(tmgchdfqu, t6mjRn3Wp);
        }
        int i = 0;
        int length = way959adeArr.length;
        while (i < length) {
            Way959ade way959ade2 = way959adeArr[i];
            i++;
            if (way959ade2 != null) {
                way959ade2.Bhmn1KIah(qih4lW99W.q3BipwRCk);
            }
        }
        Object qVUwofr5s = tmgchdfqu.qVUwofr5s();
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        if (qVUwofr5s != kbkjsqcsl) {
            qVUwofr5s = qih4lW99W.q3BipwRCk;
        }
        if (qVUwofr5s == kbkjsqcsl) {
            return qVUwofr5s;
        }
        return qih4lW99W.q3BipwRCk;
    }

    public final long qVUwofr5s(i9ai2FKAd i9ai2fkad) {
        long j = i9ai2fkad.q3BipwRCk;
        if (j < kmSgne1rO()) {
            return j;
        }
        if (this.MzoOEjc4X <= 0 && j <= Bhmn1KIah() && this.ixWaw2akD != 0) {
            return j;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:15:0x0039, B:20:0x0057, B:22:0x0069, B:25:0x007a, B:27:0x0088, B:31:0x0093, B:32:0x0096, B:35:0x00a7), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [con.JQhKJ2jfw] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, con.i9ai2FKAd] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // con.Sm35UxCQt
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object tGV7Q6urW(f106ugAzx f106ugazx, Way959ade way959ade) {
        v42n0Cs7E v42n0cs7e;
        kBKJSqCSL kbkjsqcsl;
        ?? r2;
        JEWwjBE8f jEWwjBE8f;
        Vy9q8M95G vy9q8M95G;
        f106ugAzx f106ugazx2;
        Object Eeka1udhb;
        JEWwjBE8f jEWwjBE8f2;
        Vy9q8M95G vy9q8M95G2;
        i9ai2FKAd i9ai2fkad;
        Vy9q8M95G vy9q8M95G3;
        i9ai2FKAd i9ai2fkad2;
        try {
            if (way959ade instanceof v42n0Cs7E) {
                v42n0cs7e = (v42n0Cs7E) way959ade;
                int i = v42n0cs7e.RG6kpfv3v;
                if ((i & Integer.MIN_VALUE) != 0) {
                    v42n0cs7e.RG6kpfv3v = i - Integer.MIN_VALUE;
                    Object obj = v42n0cs7e.Eeka1udhb;
                    kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                    r2 = v42n0cs7e.RG6kpfv3v;
                    if (r2 != 0) {
                        anXlDk6fV.IytU16YUK(obj);
                        vy9q8M95G3 = this;
                        i9ai2fkad2 = (i9ai2FKAd) dIocxURUo();
                    } else if (r2 == 1) {
                        i9ai2FKAd i9ai2fkad3 = (i9ai2FKAd) v42n0cs7e.ilHKhw3Yw;
                        f106ugazx = (f106ugAzx) v42n0cs7e.MzoOEjc4X;
                        vy9q8M95G3 = (Vy9q8M95G) v42n0cs7e.PSTqBLTET;
                        anXlDk6fV.IytU16YUK(obj);
                        i9ai2fkad2 = i9ai2fkad3;
                    } else if (r2 == 2) {
                        jEWwjBE8f = (JEWwjBE8f) v42n0cs7e.qVUwofr5s;
                        i9ai2FKAd i9ai2fkad4 = (i9ai2FKAd) v42n0cs7e.ilHKhw3Yw;
                        f106ugazx2 = (f106ugAzx) v42n0cs7e.MzoOEjc4X;
                        Vy9q8M95G vy9q8M95G4 = (Vy9q8M95G) v42n0cs7e.PSTqBLTET;
                        anXlDk6fV.IytU16YUK(obj);
                        r2 = i9ai2fkad4;
                        vy9q8M95G = vy9q8M95G4;
                        do {
                            Eeka1udhb = vy9q8M95G.Eeka1udhb(r2);
                            if (Eeka1udhb == dKhv6D4Rg.q3BipwRCk) {
                            }
                        } while (vy9q8M95G.Puu3Rhg4F(r2, v42n0cs7e) != kbkjsqcsl);
                        return kbkjsqcsl;
                    } else if (r2 == 3) {
                        jEWwjBE8f = (JEWwjBE8f) v42n0cs7e.qVUwofr5s;
                        i9ai2FKAd i9ai2fkad5 = (i9ai2FKAd) v42n0cs7e.ilHKhw3Yw;
                        f106ugazx2 = (f106ugAzx) v42n0cs7e.MzoOEjc4X;
                        Vy9q8M95G vy9q8M95G5 = (Vy9q8M95G) v42n0cs7e.PSTqBLTET;
                        anXlDk6fV.IytU16YUK(obj);
                        i9ai2FKAd i9ai2fkad6 = i9ai2fkad5;
                        Vy9q8M95G vy9q8M95G6 = vy9q8M95G5;
                        jEWwjBE8f2 = jEWwjBE8f;
                        f106ugazx = f106ugazx2;
                        i9ai2fkad = i9ai2fkad6;
                        vy9q8M95G2 = vy9q8M95G6;
                        f106ugazx2 = f106ugazx;
                        jEWwjBE8f = jEWwjBE8f2;
                        r2 = i9ai2fkad;
                        vy9q8M95G = vy9q8M95G2;
                        do {
                            Eeka1udhb = vy9q8M95G.Eeka1udhb(r2);
                            if (Eeka1udhb == dKhv6D4Rg.q3BipwRCk) {
                                v42n0cs7e.PSTqBLTET = vy9q8M95G;
                                v42n0cs7e.MzoOEjc4X = f106ugazx2;
                                v42n0cs7e.ilHKhw3Yw = r2;
                                v42n0cs7e.qVUwofr5s = jEWwjBE8f;
                                v42n0cs7e.RG6kpfv3v = 2;
                            } else {
                                if (jEWwjBE8f != null) {
                                    anXlDk6fV.CBQ5d1kRq(jEWwjBE8f);
                                }
                                v42n0cs7e.PSTqBLTET = vy9q8M95G;
                                v42n0cs7e.MzoOEjc4X = f106ugazx2;
                                v42n0cs7e.ilHKhw3Yw = r2;
                                v42n0cs7e.qVUwofr5s = jEWwjBE8f;
                                v42n0cs7e.RG6kpfv3v = 3;
                                i9ai2fkad6 = r2;
                                vy9q8M95G6 = vy9q8M95G;
                                if (f106ugazx2.q3BipwRCk(Eeka1udhb, v42n0cs7e) == kbkjsqcsl) {
                                    return kbkjsqcsl;
                                }
                                jEWwjBE8f2 = jEWwjBE8f;
                                f106ugazx = f106ugazx2;
                                i9ai2fkad = i9ai2fkad6;
                                vy9q8M95G2 = vy9q8M95G6;
                                f106ugazx2 = f106ugazx;
                                jEWwjBE8f = jEWwjBE8f2;
                                r2 = i9ai2fkad;
                                vy9q8M95G = vy9q8M95G2;
                                Eeka1udhb = vy9q8M95G.Eeka1udhb(r2);
                                if (Eeka1udhb == dKhv6D4Rg.q3BipwRCk) {
                                }
                            }
                        } while (vy9q8M95G.Puu3Rhg4F(r2, v42n0cs7e) != kbkjsqcsl);
                        return kbkjsqcsl;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bu5cjmae6 bu5cjmae6 = v42n0cs7e.Bhmn1KIah;
                    int i2 = JEWwjBE8f.GPLPRo6go;
                    jEWwjBE8f2 = (JEWwjBE8f) bu5cjmae6.get(y5p19vMdC.CBQ5d1kRq);
                    i9ai2fkad = i9ai2fkad2;
                    vy9q8M95G2 = vy9q8M95G3;
                    f106ugazx2 = f106ugazx;
                    jEWwjBE8f = jEWwjBE8f2;
                    r2 = i9ai2fkad;
                    vy9q8M95G = vy9q8M95G2;
                    do {
                        Eeka1udhb = vy9q8M95G.Eeka1udhb(r2);
                        if (Eeka1udhb == dKhv6D4Rg.q3BipwRCk) {
                        }
                    } while (vy9q8M95G.Puu3Rhg4F(r2, v42n0cs7e) != kbkjsqcsl);
                    return kbkjsqcsl;
                }
            }
            if (r2 != 0) {
            }
            bu5cjmae6 bu5cjmae62 = v42n0cs7e.Bhmn1KIah;
            int i22 = JEWwjBE8f.GPLPRo6go;
            jEWwjBE8f2 = (JEWwjBE8f) bu5cjmae62.get(y5p19vMdC.CBQ5d1kRq);
            i9ai2fkad = i9ai2fkad2;
            vy9q8M95G2 = vy9q8M95G3;
            f106ugazx2 = f106ugazx;
            jEWwjBE8f = jEWwjBE8f2;
            r2 = i9ai2fkad;
            vy9q8M95G = vy9q8M95G2;
            do {
                Eeka1udhb = vy9q8M95G.Eeka1udhb(r2);
                if (Eeka1udhb == dKhv6D4Rg.q3BipwRCk) {
                }
            } while (vy9q8M95G.Puu3Rhg4F(r2, v42n0cs7e) != kbkjsqcsl);
            return kbkjsqcsl;
        } catch (Throwable th) {
            vy9q8M95G.GPLPRo6go(r2);
            throw th;
        }
        v42n0cs7e = new v42n0Cs7E(this, way959ade);
        Object obj2 = v42n0cs7e.Eeka1udhb;
        kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        r2 = v42n0cs7e.RG6kpfv3v;
    }

    public final void vPSbyrYWX(Object obj) {
        int PSTqBLTET = PSTqBLTET();
        Object[] objArr = this.qVUwofr5s;
        if (objArr == null) {
            objArr = MzoOEjc4X(null, 0, 2);
        } else if (PSTqBLTET >= objArr.length) {
            objArr = MzoOEjc4X(objArr, PSTqBLTET, objArr.length * 2);
        }
        objArr[((int) (Bhmn1KIah() + ((long) PSTqBLTET))) & (objArr.length - 1)] = obj;
    }

    public final void yWvV4ePLl() {
        if (this.MzoOEjc4X != 0 || this.ixWaw2akD > 1) {
            Object[] objArr = this.qVUwofr5s;
            while (this.ixWaw2akD > 0 && objArr[((int) ((Bhmn1KIah() + ((long) PSTqBLTET())) - 1)) & (objArr.length - 1)] == dKhv6D4Rg.q3BipwRCk) {
                this.ixWaw2akD--;
                objArr[((int) (Bhmn1KIah() + ((long) PSTqBLTET()))) & (objArr.length - 1)] = null;
            }
        }
    }
}
