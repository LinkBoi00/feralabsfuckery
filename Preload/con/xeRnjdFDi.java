package con;
/* loaded from: classes.dex */
public final class xeRnjdFDi extends P3AfVviyS {
    public final Runnable Bhmn1KIah;

    public xeRnjdFDi(Runnable runnable, long j, MgUdeu75i mgUdeu75i) {
        super(j, mgUdeu75i);
        this.Bhmn1KIah = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.Bhmn1KIah.run();
        } finally {
            this.kmSgne1rO.GPLPRo6go();
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Task[");
        q3BipwRCk.append(cOutqbkMD.iiGwOFFnr(this.Bhmn1KIah));
        q3BipwRCk.append('@');
        q3BipwRCk.append(cOutqbkMD.GPLPRo6go(this.Bhmn1KIah));
        q3BipwRCk.append(", ");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", ");
        q3BipwRCk.append(this.kmSgne1rO);
        q3BipwRCk.append(']');
        return q3BipwRCk.toString();
    }
}
