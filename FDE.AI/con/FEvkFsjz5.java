package con;
/* loaded from: classes.dex */
public class FEvkFsjz5 extends yUQFqpqgq {
    public FEvkFsjz5(k007RzV1x k007rzv1x) {
        super(k007rzv1x);
    }

    @Override // con.yUQFqpqgq
    public void dIocxURUo() {
        yUQFqpqgq yuqfqpqgq;
        k007RzV1x k007rzv1x = this.J4Ux7ym32;
        if (k007rzv1x instanceof gy98n89o5) {
            fTuF5tuYZ ftuf5tuyz = this.Puu3Rhg4F;
            ftuf5tuyz.J4Ux7ym32 = true;
            gy98n89o5 gy98n89o5 = (gy98n89o5) k007rzv1x;
            int i = gy98n89o5.Ta2zrwkcM;
            boolean z = gy98n89o5.uSBmk4hFZ;
            int i2 = 0;
            if (i == 0) {
                ftuf5tuyz.kCA6Zs9sL = T5hg5V2qV.LEFT;
                while (i2 < gy98n89o5.Ihm5o4uLx) {
                    k007RzV1x k007rzv1x2 = gy98n89o5.ShSN9wbzk[i2];
                    if (z || k007rzv1x2.Dr7UqlxEV != 8) {
                        fTuF5tuYZ ftuf5tuyz2 = k007rzv1x2.dIocxURUo.Puu3Rhg4F;
                        ftuf5tuyz2.vPSbyrYWX.add(this.Puu3Rhg4F);
                        this.Puu3Rhg4F.CBQ5d1kRq.add(ftuf5tuyz2);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ftuf5tuyz.kCA6Zs9sL = T5hg5V2qV.TOP;
                    while (i2 < gy98n89o5.Ihm5o4uLx) {
                        k007RzV1x k007rzv1x3 = gy98n89o5.ShSN9wbzk[i2];
                        if (z || k007rzv1x3.Dr7UqlxEV != 8) {
                            fTuF5tuYZ ftuf5tuyz3 = k007rzv1x3.kCA6Zs9sL.Puu3Rhg4F;
                            ftuf5tuyz3.vPSbyrYWX.add(this.Puu3Rhg4F);
                            this.Puu3Rhg4F.CBQ5d1kRq.add(ftuf5tuyz3);
                        }
                        i2++;
                    }
                } else if (i == 3) {
                    ftuf5tuyz.kCA6Zs9sL = T5hg5V2qV.BOTTOM;
                    while (i2 < gy98n89o5.Ihm5o4uLx) {
                        k007RzV1x k007rzv1x4 = gy98n89o5.ShSN9wbzk[i2];
                        if (z || k007rzv1x4.Dr7UqlxEV != 8) {
                            fTuF5tuYZ ftuf5tuyz4 = k007rzv1x4.kCA6Zs9sL.yWvV4ePLl;
                            ftuf5tuyz4.vPSbyrYWX.add(this.Puu3Rhg4F);
                            this.Puu3Rhg4F.CBQ5d1kRq.add(ftuf5tuyz4);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                kmSgne1rO(this.J4Ux7ym32.kCA6Zs9sL.Puu3Rhg4F);
                yuqfqpqgq = this.J4Ux7ym32.kCA6Zs9sL;
                kmSgne1rO(yuqfqpqgq.yWvV4ePLl);
            } else {
                ftuf5tuyz.kCA6Zs9sL = T5hg5V2qV.RIGHT;
                while (i2 < gy98n89o5.Ihm5o4uLx) {
                    k007RzV1x k007rzv1x5 = gy98n89o5.ShSN9wbzk[i2];
                    if (z || k007rzv1x5.Dr7UqlxEV != 8) {
                        fTuF5tuYZ ftuf5tuyz5 = k007rzv1x5.dIocxURUo.yWvV4ePLl;
                        ftuf5tuyz5.vPSbyrYWX.add(this.Puu3Rhg4F);
                        this.Puu3Rhg4F.CBQ5d1kRq.add(ftuf5tuyz5);
                    }
                    i2++;
                }
            }
            kmSgne1rO(this.J4Ux7ym32.dIocxURUo.Puu3Rhg4F);
            yuqfqpqgq = this.J4Ux7ym32.dIocxURUo;
            kmSgne1rO(yuqfqpqgq.yWvV4ePLl);
        }
    }

    @Override // con.yUQFqpqgq
    public void iiGwOFFnr() {
        this.tGV7Q6urW = null;
        this.Puu3Rhg4F.J4Ux7ym32();
    }

    @Override // con.yUQFqpqgq
    public void kCA6Zs9sL() {
        k007RzV1x k007rzv1x = this.J4Ux7ym32;
        if (k007rzv1x instanceof gy98n89o5) {
            int i = ((gy98n89o5) k007rzv1x).Ta2zrwkcM;
            if (i == 0 || i == 1) {
                k007rzv1x.BL4OzhZBd = this.Puu3Rhg4F.GPLPRo6go;
            } else {
                k007rzv1x.DuuXfa7LE = this.Puu3Rhg4F.GPLPRo6go;
            }
        }
    }

    public final void kmSgne1rO(fTuF5tuYZ ftuf5tuyz) {
        this.Puu3Rhg4F.vPSbyrYWX.add(ftuf5tuyz);
        ftuf5tuyz.CBQ5d1kRq.add(this.Puu3Rhg4F);
    }

    @Override // con.yUQFqpqgq, con.OA9bkVDuZ
    public void q3BipwRCk(OA9bkVDuZ oA9bkVDuZ) {
        gy98n89o5 gy98n89o5 = (gy98n89o5) this.J4Ux7ym32;
        int i = gy98n89o5.Ta2zrwkcM;
        int i2 = 0;
        int i3 = -1;
        for (fTuF5tuYZ ftuf5tuyz : this.Puu3Rhg4F.CBQ5d1kRq) {
            int i4 = ftuf5tuyz.GPLPRo6go;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.Puu3Rhg4F.tGV7Q6urW(i3 + gy98n89o5.a8N8UmDyD);
        } else {
            this.Puu3Rhg4F.tGV7Q6urW(i2 + gy98n89o5.a8N8UmDyD);
        }
    }

    @Override // con.yUQFqpqgq
    public boolean vPSbyrYWX() {
        return false;
    }
}
