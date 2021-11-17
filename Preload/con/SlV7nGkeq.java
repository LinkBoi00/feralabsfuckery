package con;

import con.h7j7Zcum2;
import con.k007RzV1x;
/* loaded from: classes.dex */
public class SlV7nGkeq extends k007RzV1x {
    public boolean vIbyhVf1d;
    public float ShSN9wbzk = -1.0f;
    public int Ihm5o4uLx = -1;
    public int Ta2zrwkcM = -1;
    public h7j7Zcum2 uSBmk4hFZ = this.o4LF8RkoQ;
    public int a8N8UmDyD = 0;

    public SlV7nGkeq() {
        this.QSbMsHU5X.clear();
        this.QSbMsHU5X.add(this.uSBmk4hFZ);
        int length = this.j22ftfeNI.length;
        for (int i = 0; i < length; i++) {
            this.j22ftfeNI[i] = this.uSBmk4hFZ;
        }
    }

    @Override // con.k007RzV1x
    public boolean CpG0imbht() {
        return this.vIbyhVf1d;
    }

    @Override // con.k007RzV1x
    public boolean IytU16YUK() {
        return this.vIbyhVf1d;
    }

    @Override // con.k007RzV1x
    public void L4EwGfXiQ(WLlBJNJ2W wLlBJNJ2W, boolean z) {
        if (this.ziwPzaoF3 != null) {
            int PSTqBLTET = wLlBJNJ2W.PSTqBLTET(this.uSBmk4hFZ);
            if (this.a8N8UmDyD == 1) {
                this.BL4OzhZBd = PSTqBLTET;
                this.DuuXfa7LE = 0;
                o4LF8RkoQ(this.ziwPzaoF3.CBQ5d1kRq());
                j22ftfeNI(0);
                return;
            }
            this.BL4OzhZBd = 0;
            this.DuuXfa7LE = PSTqBLTET;
            j22ftfeNI(this.ziwPzaoF3.dXrmkklc8());
            o4LF8RkoQ(0);
        }
    }

    @Override // con.k007RzV1x
    public void dIocxURUo(WLlBJNJ2W wLlBJNJ2W, boolean z) {
        miIsFJ8kP CBQ5d1kRq;
        miIsFJ8kP CBQ5d1kRq2;
        miIsFJ8kP CBQ5d1kRq3;
        k007RzV1x.RG2GI7LDp rG2GI7LDp = k007RzV1x.RG2GI7LDp.WRAP_CONTENT;
        S5aezmTgi s5aezmTgi = (S5aezmTgi) this.ziwPzaoF3;
        if (s5aezmTgi != null) {
            Object yWvV4ePLl = s5aezmTgi.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.LEFT);
            Object yWvV4ePLl2 = s5aezmTgi.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.RIGHT);
            k007RzV1x k007rzv1x = this.ziwPzaoF3;
            boolean z2 = true;
            boolean z3 = k007rzv1x != null && k007rzv1x.zHl31GGXU[0] == rG2GI7LDp;
            if (this.a8N8UmDyD == 0) {
                yWvV4ePLl = s5aezmTgi.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.TOP);
                yWvV4ePLl2 = s5aezmTgi.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.BOTTOM);
                k007RzV1x k007rzv1x2 = this.ziwPzaoF3;
                if (k007rzv1x2 == null || k007rzv1x2.zHl31GGXU[1] != rG2GI7LDp) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.vIbyhVf1d) {
                h7j7Zcum2 h7j7zcum2 = this.uSBmk4hFZ;
                if (h7j7zcum2.tGV7Q6urW) {
                    miIsFJ8kP CBQ5d1kRq4 = wLlBJNJ2W.CBQ5d1kRq(h7j7zcum2);
                    wLlBJNJ2W.kCA6Zs9sL(CBQ5d1kRq4, this.uSBmk4hFZ.tGV7Q6urW());
                    if (this.Ihm5o4uLx != -1) {
                        if (z3) {
                            CBQ5d1kRq3 = wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl2);
                            wLlBJNJ2W.iiGwOFFnr(CBQ5d1kRq3, CBQ5d1kRq4, 0, 5);
                        }
                        this.vIbyhVf1d = false;
                        return;
                    }
                    if (this.Ta2zrwkcM != -1 && z3) {
                        CBQ5d1kRq3 = wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl2);
                        wLlBJNJ2W.iiGwOFFnr(CBQ5d1kRq4, wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl), 0, 5);
                        wLlBJNJ2W.iiGwOFFnr(CBQ5d1kRq3, CBQ5d1kRq4, 0, 5);
                    }
                    this.vIbyhVf1d = false;
                    return;
                }
            }
            if (this.Ihm5o4uLx != -1) {
                CBQ5d1kRq = wLlBJNJ2W.CBQ5d1kRq(this.uSBmk4hFZ);
                wLlBJNJ2W.dIocxURUo(CBQ5d1kRq, wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl), this.Ihm5o4uLx, 8);
                if (z3) {
                    CBQ5d1kRq2 = wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl2);
                } else {
                    return;
                }
            } else if (this.Ta2zrwkcM != -1) {
                CBQ5d1kRq = wLlBJNJ2W.CBQ5d1kRq(this.uSBmk4hFZ);
                CBQ5d1kRq2 = wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl2);
                wLlBJNJ2W.dIocxURUo(CBQ5d1kRq, CBQ5d1kRq2, -this.Ta2zrwkcM, 8);
                if (z3) {
                    wLlBJNJ2W.iiGwOFFnr(CBQ5d1kRq, wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl), 0, 5);
                } else {
                    return;
                }
            } else if (this.ShSN9wbzk != -1.0f) {
                miIsFJ8kP CBQ5d1kRq5 = wLlBJNJ2W.CBQ5d1kRq(this.uSBmk4hFZ);
                miIsFJ8kP CBQ5d1kRq6 = wLlBJNJ2W.CBQ5d1kRq(yWvV4ePLl2);
                float f = this.ShSN9wbzk;
                uXZOTWgvT kmSgne1rO = wLlBJNJ2W.kmSgne1rO();
                kmSgne1rO.dIocxURUo.J4Ux7ym32(CBQ5d1kRq5, -1.0f);
                kmSgne1rO.dIocxURUo.J4Ux7ym32(CBQ5d1kRq6, f);
                wLlBJNJ2W.tGV7Q6urW(kmSgne1rO);
                return;
            } else {
                return;
            }
            wLlBJNJ2W.iiGwOFFnr(CBQ5d1kRq2, CBQ5d1kRq, 0, 5);
        }
    }

    @Override // con.k007RzV1x
    public boolean kCA6Zs9sL() {
        return true;
    }

    @Override // con.k007RzV1x
    public h7j7Zcum2 yWvV4ePLl(h7j7Zcum2.RG2GI7LDp rG2GI7LDp) {
        int ordinal = rG2GI7LDp.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.a8N8UmDyD == 0) {
                return this.uSBmk4hFZ;
            }
            return null;
        }
        if (this.a8N8UmDyD == 1) {
            return this.uSBmk4hFZ;
        }
        return null;
    }

    public void zHl31GGXU(int i) {
        h7j7Zcum2 h7j7zcum2 = this.uSBmk4hFZ;
        h7j7zcum2.J4Ux7ym32 = i;
        h7j7zcum2.tGV7Q6urW = true;
        this.vIbyhVf1d = true;
    }

    public void ziwPzaoF3(int i) {
        if (this.a8N8UmDyD != i) {
            this.a8N8UmDyD = i;
            this.QSbMsHU5X.clear();
            this.uSBmk4hFZ = this.a8N8UmDyD == 1 ? this.i0Zug1mVk : this.o4LF8RkoQ;
            this.QSbMsHU5X.add(this.uSBmk4hFZ);
            int length = this.j22ftfeNI.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.j22ftfeNI[i2] = this.uSBmk4hFZ;
            }
        }
    }
}
