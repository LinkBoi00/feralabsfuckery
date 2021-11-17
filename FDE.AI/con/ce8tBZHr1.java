package con;
/* loaded from: classes.dex */
public final class ce8tBZHr1 {
    public u07HajUDq J4Ux7ym32;
    public boolean q3BipwRCk;
    public boolean tGV7Q6urW;

    public void J4Ux7ym32(u07HajUDq u07hajudq) {
        synchronized (this) {
            while (this.tGV7Q6urW) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.J4Ux7ym32 != u07hajudq) {
                this.J4Ux7ym32 = u07hajudq;
                if (this.q3BipwRCk) {
                    u07hajudq.q3BipwRCk();
                }
            }
        }
    }

    public void q3BipwRCk() {
        synchronized (this) {
            try {
                if (!this.q3BipwRCk) {
                    this.q3BipwRCk = true;
                    this.tGV7Q6urW = true;
                    u07HajUDq u07hajudq = this.J4Ux7ym32;
                    if (u07hajudq != null) {
                        try {
                            u07hajudq.q3BipwRCk();
                        } catch (Throwable th) {
                            synchronized (this) {
                                try {
                                    this.tGV7Q6urW = false;
                                    notifyAll();
                                    throw th;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            this.tGV7Q6urW = false;
                            notifyAll();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
