package con;
/* loaded from: classes.dex */
public final class z2btETSE4 extends s05BzCoHq {
    public final s05BzCoHq dIocxURUo;
    public final PmanMZxiM kCA6Zs9sL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2btETSE4(int i, Uhy55gmtq uhy55gmtq, PmanMZxiM pmanMZxiM, s05BzCoHq s05bzcohq) {
        super(i, uhy55gmtq, null);
        pmanMZxiM = null;
        this.dIocxURUo = s05bzcohq;
        s05bzcohq.yWvV4ePLl(this);
        if (pmanMZxiM != null) {
            PmanMZxiM kCA6Zs9sL = s05bzcohq.kCA6Zs9sL();
            pmanMZxiM = kCA6Zs9sL != null ? new MHI3maOyb(pmanMZxiM, kCA6Zs9sL, 1) : pmanMZxiM;
        }
        this.kCA6Zs9sL = pmanMZxiM == null ? s05bzcohq.kCA6Zs9sL() : pmanMZxiM;
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
            if (this.J4Ux7ym32 != this.dIocxURUo.tGV7Q6urW()) {
                q3BipwRCk();
            }
            this.dIocxURUo.oon79WMrY(this);
            this.tGV7Q6urW = true;
        }
    }

    @Override // con.s05BzCoHq
    public s05BzCoHq PSTqBLTET(PmanMZxiM pmanMZxiM) {
        return new z2btETSE4(this.J4Ux7ym32, this.q3BipwRCk, pmanMZxiM, this.dIocxURUo);
    }

    @Override // con.s05BzCoHq
    public boolean iiGwOFFnr() {
        return true;
    }

    @Override // con.s05BzCoHq
    public PmanMZxiM kCA6Zs9sL() {
        return this.kCA6Zs9sL;
    }

    @Override // con.s05BzCoHq
    public void oon79WMrY(s05BzCoHq s05bzcohq) {
        Object obj = G5eK0AZDb.q3BipwRCk;
        throw new UnsupportedOperationException();
    }

    @Override // con.s05BzCoHq
    public void vPSbyrYWX() {
    }

    @Override // con.s05BzCoHq
    public void yWvV4ePLl(s05BzCoHq s05bzcohq) {
        Object obj = G5eK0AZDb.q3BipwRCk;
        throw new UnsupportedOperationException();
    }
}
