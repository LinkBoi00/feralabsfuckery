package con;
/* loaded from: classes.dex */
public final class hwv0S9AvT extends UuvLiXwHL implements Runnable {
    public final long PSTqBLTET;

    public hwv0S9AvT(long j, Way959ade way959ade) {
        super(way959ade.kCA6Zs9sL(), way959ade);
        this.PSTqBLTET = j;
    }

    @Override // con.Y371ZqMzx, con.Zgh96z4e6
    public String AqaWJg0b4() {
        return super.AqaWJg0b4() + "(timeMillis=" + this.PSTqBLTET + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        long j = this.PSTqBLTET;
        vPSbyrYWX(new S4tszCdo2("Timed out waiting for " + j + " ms", this));
    }
}
