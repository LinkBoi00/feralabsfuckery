package con;

import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class Jbo7jfKH7 extends DrTf1eLw4 {
    public final ReentrantLock kCA6Zs9sL = new ReentrantLock();
    public Object iiGwOFFnr = dgsh68zH8.q3BipwRCk;

    public Jbo7jfKH7(PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
    }

    @Override // con.spFv56w6q
    public String J4Ux7ym32() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("(value=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }

    @Override // con.DrTf1eLw4
    public Object PSTqBLTET() {
        ReentrantLock reentrantLock = this.kCA6Zs9sL;
        reentrantLock.lock();
        try {
            Object obj = this.iiGwOFFnr;
            vX9ZKIhAp vx9zkihap = dgsh68zH8.q3BipwRCk;
            if (obj == vx9zkihap) {
                Object tGV7Q6urW = tGV7Q6urW();
                if (tGV7Q6urW == null) {
                    tGV7Q6urW = dgsh68zH8.dIocxURUo;
                }
                return tGV7Q6urW;
            }
            this.iiGwOFFnr = vx9zkihap;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // con.spFv56w6q
    public Object kCA6Zs9sL(Object obj) {
        OIfZMZeX0 iiGwOFFnr;
        ReentrantLock reentrantLock = this.kCA6Zs9sL;
        reentrantLock.lock();
        try {
            WPks89pLg tGV7Q6urW = tGV7Q6urW();
            if (tGV7Q6urW != null) {
                return tGV7Q6urW;
            }
            if (this.iiGwOFFnr == dgsh68zH8.q3BipwRCk) {
                do {
                    iiGwOFFnr = iiGwOFFnr();
                    if (iiGwOFFnr != null) {
                        if (iiGwOFFnr instanceof WPks89pLg) {
                            return iiGwOFFnr;
                        }
                    }
                } while (iiGwOFFnr.yWvV4ePLl(obj, null) == null);
                reentrantLock.unlock();
                iiGwOFFnr.iiGwOFFnr(obj);
                return iiGwOFFnr.tGV7Q6urW();
            }
            xwkpuMyKi qVUwofr5s = qVUwofr5s(obj);
            if (qVUwofr5s == null) {
                return dgsh68zH8.J4Ux7ym32;
            }
            throw qVUwofr5s;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // con.DrTf1eLw4
    public void kmSgne1rO(boolean z) {
        ReentrantLock reentrantLock = this.kCA6Zs9sL;
        reentrantLock.lock();
        try {
            xwkpuMyKi qVUwofr5s = qVUwofr5s(dgsh68zH8.q3BipwRCk);
            reentrantLock.unlock();
            super.kmSgne1rO(z);
            if (qVUwofr5s != null) {
                throw qVUwofr5s;
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

    public final xwkpuMyKi qVUwofr5s(Object obj) {
        PmanMZxiM pmanMZxiM;
        Object obj2 = this.iiGwOFFnr;
        xwkpuMyKi xwkpumyki = null;
        if (!(obj2 == dgsh68zH8.q3BipwRCk || (pmanMZxiM = this.J4Ux7ym32) == null)) {
            xwkpumyki = anXlDk6fV.GPLPRo6go(pmanMZxiM, obj2, null);
        }
        this.iiGwOFFnr = obj;
        return xwkpumyki;
    }

    @Override // con.DrTf1eLw4
    public final boolean vPSbyrYWX() {
        return this.iiGwOFFnr == dgsh68zH8.q3BipwRCk;
    }

    @Override // con.DrTf1eLw4
    public boolean yWvV4ePLl(FjdyTKOTM fjdyTKOTM) {
        ReentrantLock reentrantLock = this.kCA6Zs9sL;
        reentrantLock.lock();
        try {
            return super.yWvV4ePLl(fjdyTKOTM);
        } finally {
            reentrantLock.unlock();
        }
    }
}
