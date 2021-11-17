package con;
/* loaded from: classes.dex */
public final class snbZ14V7z extends yxtPW6v5D {
    public final Runnable PSTqBLTET;

    public snbZ14V7z(long j, Runnable runnable) {
        super(j);
        this.PSTqBLTET = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.PSTqBLTET.run();
    }

    @Override // con.yxtPW6v5D, java.lang.Object
    public String toString() {
        return anXlDk6fV.iMyQMM6Qj(super.toString(), this.PSTqBLTET);
    }
}
