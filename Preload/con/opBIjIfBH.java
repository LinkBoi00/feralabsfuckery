package con;
/* loaded from: classes.dex */
public final class opBIjIfBH extends s05BzCoHq {
    public final PmanMZxiM dIocxURUo;
    public int kCA6Zs9sL = 1;

    public opBIjIfBH(int i, Uhy55gmtq uhy55gmtq, PmanMZxiM pmanMZxiM) {
        super(i, uhy55gmtq, null);
        this.dIocxURUo = pmanMZxiM;
    }

    @Override // con.s05BzCoHq
    public void CBQ5d1kRq(vlsBqYUof vlsbqyuof) {
        PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // con.s05BzCoHq
    public PmanMZxiM GPLPRo6go() {
        return null;
    }

    @Override // con.s05BzCoHq
    public void J4Ux7ym32() {
        if (!this.tGV7Q6urW) {
            int i = this.kCA6Zs9sL - 1;
            this.kCA6Zs9sL = i;
            if (i == 0) {
                q3BipwRCk();
            }
            this.tGV7Q6urW = true;
        }
    }

    @Override // con.s05BzCoHq
    public s05BzCoHq PSTqBLTET(PmanMZxiM pmanMZxiM) {
        UvOuyIFuT.dIocxURUo(this);
        return new z2btETSE4(this.J4Ux7ym32, this.q3BipwRCk, pmanMZxiM, this);
    }

    @Override // con.s05BzCoHq
    public boolean iiGwOFFnr() {
        return true;
    }

    @Override // con.s05BzCoHq
    public PmanMZxiM kCA6Zs9sL() {
        return this.dIocxURUo;
    }

    @Override // con.s05BzCoHq
    public void oon79WMrY(s05BzCoHq s05bzcohq) {
        int i = this.kCA6Zs9sL - 1;
        this.kCA6Zs9sL = i;
        if (i == 0) {
            q3BipwRCk();
        }
    }

    @Override // con.s05BzCoHq
    public void vPSbyrYWX() {
    }

    @Override // con.s05BzCoHq
    public void yWvV4ePLl(s05BzCoHq s05bzcohq) {
        this.kCA6Zs9sL++;
    }
}
