package con;
/* loaded from: classes.dex */
public final class dGRcjwJnj extends WfopS3efW {
    public dGRcjwJnj(IP5eUxTmc iP5eUxTmc) {
        super(iP5eUxTmc);
    }

    @Override // con.GX14exZ1F
    public void J4Ux7ym32(int i, Object obj) {
        IP5eUxTmc iP5eUxTmc = (IP5eUxTmc) obj;
        hlx9onKps Puu3Rhg4F = Puu3Rhg4F((IP5eUxTmc) this.tGV7Q6urW);
        if (i < Puu3Rhg4F.tGV7Q6urW.size()) {
            Puu3Rhg4F.tGV7Q6urW.set(i, iP5eUxTmc);
        } else {
            Puu3Rhg4F.tGV7Q6urW.add(iP5eUxTmc);
        }
        iP5eUxTmc.dIocxURUo(Puu3Rhg4F.Puu3Rhg4F);
        Puu3Rhg4F.tGV7Q6urW();
    }

    public final hlx9onKps Puu3Rhg4F(IP5eUxTmc iP5eUxTmc) {
        if (iP5eUxTmc instanceof hlx9onKps) {
            return (hlx9onKps) iP5eUxTmc;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // con.GX14exZ1F
    public void dIocxURUo(int i, int i2, int i3) {
        hlx9onKps Puu3Rhg4F = Puu3Rhg4F((IP5eUxTmc) this.tGV7Q6urW);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                Puu3Rhg4F.tGV7Q6urW.remove(i);
                Puu3Rhg4F.tGV7Q6urW.add(i2, (IP5eUxTmc) Puu3Rhg4F.tGV7Q6urW.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                Puu3Rhg4F.tGV7Q6urW.remove(i);
                Puu3Rhg4F.tGV7Q6urW.add(i2 - 1, (IP5eUxTmc) Puu3Rhg4F.tGV7Q6urW.get(i));
                i4++;
            }
        }
        Puu3Rhg4F.tGV7Q6urW();
    }

    @Override // con.WfopS3efW
    public void iiGwOFFnr() {
        hlx9onKps Puu3Rhg4F = Puu3Rhg4F((IP5eUxTmc) this.q3BipwRCk);
        Puu3Rhg4F.kCA6Zs9sL(0, Puu3Rhg4F.tGV7Q6urW.size());
    }

    @Override // con.GX14exZ1F
    public void kCA6Zs9sL(int i, int i2) {
        Puu3Rhg4F((IP5eUxTmc) this.tGV7Q6urW).kCA6Zs9sL(i, i2);
    }

    @Override // con.GX14exZ1F
    public /* bridge */ /* synthetic */ void q3BipwRCk(int i, Object obj) {
        IP5eUxTmc iP5eUxTmc = (IP5eUxTmc) obj;
    }
}
