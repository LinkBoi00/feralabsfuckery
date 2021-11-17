package con;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class yd8TRguSG extends DrTf1eLw4 {
    public final ReentrantLock GPLPRo6go;
    public Object[] Puu3Rhg4F;
    public final n5fKsru0Y iiGwOFFnr;
    public final int kCA6Zs9sL;
    private volatile /* synthetic */ int size;
    public int yWvV4ePLl;

    public yd8TRguSG(int i, n5fKsru0Y n5fksru0y, PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
        this.kCA6Zs9sL = i;
        this.iiGwOFFnr = n5fksru0y;
        if (i < 1 ? false : true) {
            this.GPLPRo6go = new ReentrantLock();
            int min = Math.min(i, 8);
            Object[] objArr = new Object[min];
            Arrays.fill(objArr, 0, min, dgsh68zH8.q3BipwRCk);
            this.Puu3Rhg4F = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // con.DrTf1eLw4
    public boolean CBQ5d1kRq() {
        ReentrantLock reentrantLock = this.GPLPRo6go;
        reentrantLock.lock();
        try {
            return super.CBQ5d1kRq();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // con.spFv56w6q
    public String J4Ux7ym32() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("(buffer:capacity=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(",size=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.size, ')');
    }

    @Override // con.DrTf1eLw4
    public Object PSTqBLTET() {
        ReentrantLock reentrantLock = this.GPLPRo6go;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object tGV7Q6urW = tGV7Q6urW();
                if (tGV7Q6urW == null) {
                    tGV7Q6urW = dgsh68zH8.dIocxURUo;
                }
                return tGV7Q6urW;
            }
            Object[] objArr = this.Puu3Rhg4F;
            int i2 = this.yWvV4ePLl;
            Object obj = objArr[i2];
            oTpJSKL6O otpjskl6o = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = dgsh68zH8.dIocxURUo;
            boolean z = false;
            if (i == this.kCA6Zs9sL) {
                otpjskl6o = null;
                while (true) {
                    oTpJSKL6O GPLPRo6go = GPLPRo6go();
                    if (GPLPRo6go == null) {
                        break;
                    } else if (GPLPRo6go.nlGCs0NZs(null) != null) {
                        obj2 = GPLPRo6go.cAwN510t2();
                        z = true;
                        otpjskl6o = GPLPRo6go;
                        break;
                    } else {
                        otpjskl6o = GPLPRo6go;
                    }
                }
            }
            if (obj2 != dgsh68zH8.dIocxURUo && !(obj2 instanceof WPks89pLg)) {
                this.size = i;
                Object[] objArr2 = this.Puu3Rhg4F;
                objArr2[(this.yWvV4ePLl + i) % objArr2.length] = obj2;
            }
            this.yWvV4ePLl = (this.yWvV4ePLl + 1) % this.Puu3Rhg4F.length;
            if (z) {
                otpjskl6o.dfpT1j18n();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[DONT_GENERATE] */
    @Override // con.spFv56w6q
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.Object kCA6Zs9sL(java.lang.Object r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.GPLPRo6go
            r0.lock()
            int r1 = r5.size     // Catch: all -> 0x006b
            con.WPks89pLg r2 = r5.tGV7Q6urW()     // Catch: all -> 0x006b
            if (r2 != 0) goto L_0x0067
            int r2 = r5.kCA6Zs9sL     // Catch: all -> 0x006b
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0018
            int r2 = r1 + 1
            r5.size = r2     // Catch: all -> 0x006b
            goto L_0x002e
        L_0x0018:
            con.n5fKsru0Y r2 = r5.iiGwOFFnr     // Catch: all -> 0x006b
            int r2 = r2.ordinal()     // Catch: all -> 0x006b
            if (r2 == 0) goto L_0x0030
            if (r2 == r3) goto L_0x002e
            r3 = 2
            if (r2 != r3) goto L_0x0028
            con.vX9ZKIhAp r2 = con.dgsh68zH8.J4Ux7ym32     // Catch: all -> 0x006b
            goto L_0x0032
        L_0x0028:
            con.dnCerKhAM r6 = new con.dnCerKhAM     // Catch: all -> 0x006b
            r6.<init>()     // Catch: all -> 0x006b
            throw r6     // Catch: all -> 0x006b
        L_0x002e:
            r2 = r4
            goto L_0x0032
        L_0x0030:
            con.vX9ZKIhAp r2 = con.dgsh68zH8.tGV7Q6urW     // Catch: all -> 0x006b
        L_0x0032:
            if (r2 != 0) goto L_0x0063
            if (r1 != 0) goto L_0x005a
        L_0x0036:
            con.OIfZMZeX0 r2 = r5.iiGwOFFnr()     // Catch: all -> 0x006b
            if (r2 != 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            boolean r3 = r2 instanceof con.WPks89pLg     // Catch: all -> 0x006b
            if (r3 == 0) goto L_0x0047
            r5.size = r1     // Catch: all -> 0x006b
            r0.unlock()
            return r2
        L_0x0047:
            con.vX9ZKIhAp r3 = r2.yWvV4ePLl(r6, r4)     // Catch: all -> 0x006b
            if (r3 == 0) goto L_0x0036
            r5.size = r1     // Catch: all -> 0x006b
            r0.unlock()
            r2.iiGwOFFnr(r6)
            java.lang.Object r6 = r2.tGV7Q6urW()
            return r6
        L_0x005a:
            r5.qVUwofr5s(r1, r6)     // Catch: all -> 0x006b
            con.vX9ZKIhAp r6 = con.dgsh68zH8.J4Ux7ym32     // Catch: all -> 0x006b
            r0.unlock()
            return r6
        L_0x0063:
            r0.unlock()
            return r2
        L_0x0067:
            r0.unlock()
            return r2
        L_0x006b:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: con.yd8TRguSG.kCA6Zs9sL(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    @Override // con.DrTf1eLw4
    public void kmSgne1rO(boolean z) {
        PmanMZxiM pmanMZxiM = this.J4Ux7ym32;
        ReentrantLock reentrantLock = this.GPLPRo6go;
        reentrantLock.lock();
        try {
            int i = this.size;
            xwkpuMyKi xwkpumyki = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.Puu3Rhg4F[this.yWvV4ePLl];
                if (!(pmanMZxiM == null || obj == dgsh68zH8.q3BipwRCk)) {
                    xwkpumyki = anXlDk6fV.GPLPRo6go(pmanMZxiM, obj, xwkpumyki);
                }
                Object[] objArr = this.Puu3Rhg4F;
                int i3 = this.yWvV4ePLl;
                objArr[i3] = dgsh68zH8.q3BipwRCk;
                this.yWvV4ePLl = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            reentrantLock.unlock();
            super.kmSgne1rO(z);
            if (xwkpumyki != null) {
                throw xwkpumyki;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // con.DrTf1eLw4
    public final boolean oon79WMrY() {
        return false;
    }

    public final void qVUwofr5s(int i, Object obj) {
        int i2 = this.kCA6Zs9sL;
        if (i < i2) {
            Object[] objArr = this.Puu3Rhg4F;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                if (i > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        Object[] objArr3 = this.Puu3Rhg4F;
                        objArr2[i3] = objArr3[(this.yWvV4ePLl + i3) % objArr3.length];
                        if (i4 >= i) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                Arrays.fill(objArr2, i, min, dgsh68zH8.q3BipwRCk);
                this.Puu3Rhg4F = objArr2;
                this.yWvV4ePLl = 0;
            }
            Object[] objArr4 = this.Puu3Rhg4F;
            objArr4[(this.yWvV4ePLl + i) % objArr4.length] = obj;
            return;
        }
        Object[] objArr5 = this.Puu3Rhg4F;
        int i5 = this.yWvV4ePLl;
        objArr5[i5 % objArr5.length] = null;
        objArr5[(i + i5) % objArr5.length] = obj;
        this.yWvV4ePLl = (i5 + 1) % objArr5.length;
    }

    @Override // con.DrTf1eLw4
    public final boolean vPSbyrYWX() {
        return this.size == 0;
    }

    @Override // con.DrTf1eLw4
    public boolean yWvV4ePLl(FjdyTKOTM fjdyTKOTM) {
        ReentrantLock reentrantLock = this.GPLPRo6go;
        reentrantLock.lock();
        try {
            return super.yWvV4ePLl(fjdyTKOTM);
        } finally {
            reentrantLock.unlock();
        }
    }
}
