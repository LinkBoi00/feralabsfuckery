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
    public Object kCA6Zs9sL(Object obj) {
        vX9ZKIhAp vx9zkihap;
        OIfZMZeX0 iiGwOFFnr;
        ReentrantLock reentrantLock = this.GPLPRo6go;
        reentrantLock.lock();
        try {
            int i = this.size;
            WPks89pLg tGV7Q6urW = tGV7Q6urW();
            if (tGV7Q6urW != null) {
                return tGV7Q6urW;
            }
            if (i < this.kCA6Zs9sL) {
                this.size = i + 1;
            } else {
                int ordinal = this.iiGwOFFnr.ordinal();
                if (ordinal == 0) {
                    vx9zkihap = dgsh68zH8.tGV7Q6urW;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        vx9zkihap = dgsh68zH8.J4Ux7ym32;
                    } else {
                        throw new dnCerKhAM();
                    }
                }
                if (vx9zkihap == null) {
                    return vx9zkihap;
                }
                if (i == 0) {
                    do {
                        iiGwOFFnr = iiGwOFFnr();
                        if (iiGwOFFnr != null) {
                            if (iiGwOFFnr instanceof WPks89pLg) {
                                this.size = i;
                                return iiGwOFFnr;
                            }
                        }
                    } while (iiGwOFFnr.yWvV4ePLl(obj, null) == null);
                    this.size = i;
                    reentrantLock.unlock();
                    iiGwOFFnr.iiGwOFFnr(obj);
                    return iiGwOFFnr.tGV7Q6urW();
                }
                qVUwofr5s(i, obj);
                return dgsh68zH8.J4Ux7ym32;
            }
            vx9zkihap = null;
            if (vx9zkihap == null) {
            }
        } finally {
            reentrantLock.unlock();
        }
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
