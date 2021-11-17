package con;

import con.h7j7Zcum2;
import con.k007RzV1x;
/* loaded from: classes.dex */
public class gy98n89o5 extends INrKfCE8Y {
    public int Ta2zrwkcM = 0;
    public boolean uSBmk4hFZ = true;
    public int a8N8UmDyD = 0;
    public boolean vIbyhVf1d = false;

    @Override // con.k007RzV1x
    public boolean CpG0imbht() {
        return this.vIbyhVf1d;
    }

    @Override // con.k007RzV1x
    public boolean IytU16YUK() {
        return this.vIbyhVf1d;
    }

    public int IzM1cD9ly() {
        int i = this.Ta2zrwkcM;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // con.k007RzV1x
    public void dIocxURUo(WLlBJNJ2W wLlBJNJ2W, boolean z) {
        Object[] objArr;
        boolean z2;
        miIsFJ8kP miisfj8kp;
        h7j7Zcum2 h7j7zcum2;
        int i;
        int i2;
        int i3;
        miIsFJ8kP miisfj8kp2;
        int i4;
        k007RzV1x.RG2GI7LDp rG2GI7LDp = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        h7j7Zcum2[] h7j7zcum2Arr = this.j22ftfeNI;
        h7j7zcum2Arr[0] = this.i0Zug1mVk;
        h7j7zcum2Arr[2] = this.o4LF8RkoQ;
        h7j7zcum2Arr[1] = this.V9LQMKGJe;
        h7j7zcum2Arr[3] = this.QNqj6nIzv;
        int i5 = 0;
        while (true) {
            objArr = this.j22ftfeNI;
            if (i5 >= objArr.length) {
                break;
            }
            objArr[i5].yWvV4ePLl = wLlBJNJ2W.CBQ5d1kRq(objArr[i5]);
            i5++;
        }
        int i6 = this.Ta2zrwkcM;
        if (i6 >= 0 && i6 < 4) {
            h7j7Zcum2 h7j7zcum22 = objArr[i6];
            if (!this.vIbyhVf1d) {
                wIZEdYHUn();
            }
            if (this.vIbyhVf1d) {
                this.vIbyhVf1d = false;
                int i7 = this.Ta2zrwkcM;
                if (i7 == 0 || i7 == 1) {
                    wLlBJNJ2W.kCA6Zs9sL(this.i0Zug1mVk.yWvV4ePLl, this.BL4OzhZBd);
                    miisfj8kp2 = this.V9LQMKGJe.yWvV4ePLl;
                    i4 = this.BL4OzhZBd;
                } else if (i7 == 2 || i7 == 3) {
                    wLlBJNJ2W.kCA6Zs9sL(this.o4LF8RkoQ.yWvV4ePLl, this.DuuXfa7LE);
                    miisfj8kp2 = this.QNqj6nIzv.yWvV4ePLl;
                    i4 = this.DuuXfa7LE;
                } else {
                    return;
                }
                wLlBJNJ2W.kCA6Zs9sL(miisfj8kp2, i4);
                return;
            }
            for (int i8 = 0; i8 < this.Ihm5o4uLx; i8++) {
                k007RzV1x k007rzv1x = this.ShSN9wbzk[i8];
                if ((this.uSBmk4hFZ || k007rzv1x.kCA6Zs9sL()) && ((((i2 = this.Ta2zrwkcM) == 0 || i2 == 1) && k007rzv1x.kmSgne1rO() == rG2GI7LDp && k007rzv1x.i0Zug1mVk.iiGwOFFnr != null && k007rzv1x.V9LQMKGJe.iiGwOFFnr != null) || (((i3 = this.Ta2zrwkcM) == 2 || i3 == 3) && k007rzv1x.Eeka1udhb() == rG2GI7LDp && k007rzv1x.o4LF8RkoQ.iiGwOFFnr != null && k007rzv1x.QNqj6nIzv.iiGwOFFnr != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            boolean z3 = this.i0Zug1mVk.kCA6Zs9sL() || this.V9LQMKGJe.kCA6Zs9sL();
            boolean z4 = this.o4LF8RkoQ.kCA6Zs9sL() || this.QNqj6nIzv.kCA6Zs9sL();
            boolean z5 = !z2 && (((i = this.Ta2zrwkcM) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
            int i9 = 5;
            if (!z5) {
                i9 = 4;
            }
            for (int i10 = 0; i10 < this.Ihm5o4uLx; i10++) {
                k007RzV1x k007rzv1x2 = this.ShSN9wbzk[i10];
                if (this.uSBmk4hFZ || k007rzv1x2.kCA6Zs9sL()) {
                    miIsFJ8kP CBQ5d1kRq = wLlBJNJ2W.CBQ5d1kRq(k007rzv1x2.j22ftfeNI[this.Ta2zrwkcM]);
                    h7j7Zcum2[] h7j7zcum2Arr2 = k007rzv1x2.j22ftfeNI;
                    int i11 = this.Ta2zrwkcM;
                    h7j7zcum2Arr2[i11].yWvV4ePLl = CBQ5d1kRq;
                    int i12 = (h7j7zcum2Arr2[i11].iiGwOFFnr == null || h7j7zcum2Arr2[i11].iiGwOFFnr.dIocxURUo != this) ? 0 : h7j7zcum2Arr2[i11].GPLPRo6go + 0;
                    if (i11 == 0 || i11 == 2) {
                        uXZOTWgvT kmSgne1rO = wLlBJNJ2W.kmSgne1rO();
                        miIsFJ8kP Bhmn1KIah = wLlBJNJ2W.Bhmn1KIah();
                        Bhmn1KIah.PSTqBLTET = 0;
                        kmSgne1rO.iiGwOFFnr(h7j7zcum22.yWvV4ePLl, CBQ5d1kRq, Bhmn1KIah, this.a8N8UmDyD - i12);
                        wLlBJNJ2W.tGV7Q6urW(kmSgne1rO);
                    } else {
                        uXZOTWgvT kmSgne1rO2 = wLlBJNJ2W.kmSgne1rO();
                        miIsFJ8kP Bhmn1KIah2 = wLlBJNJ2W.Bhmn1KIah();
                        Bhmn1KIah2.PSTqBLTET = 0;
                        kmSgne1rO2.kCA6Zs9sL(h7j7zcum22.yWvV4ePLl, CBQ5d1kRq, Bhmn1KIah2, this.a8N8UmDyD + i12);
                        wLlBJNJ2W.tGV7Q6urW(kmSgne1rO2);
                    }
                    wLlBJNJ2W.dIocxURUo(h7j7zcum22.yWvV4ePLl, CBQ5d1kRq, this.a8N8UmDyD + i12, i9);
                }
            }
            int i13 = this.Ta2zrwkcM;
            if (i13 == 0) {
                wLlBJNJ2W.dIocxURUo(this.V9LQMKGJe.yWvV4ePLl, this.i0Zug1mVk.yWvV4ePLl, 0, 8);
                wLlBJNJ2W.dIocxURUo(this.i0Zug1mVk.yWvV4ePLl, this.ziwPzaoF3.V9LQMKGJe.yWvV4ePLl, 0, 4);
                miisfj8kp = this.i0Zug1mVk.yWvV4ePLl;
                h7j7zcum2 = this.ziwPzaoF3.i0Zug1mVk;
            } else if (i13 == 1) {
                wLlBJNJ2W.dIocxURUo(this.i0Zug1mVk.yWvV4ePLl, this.V9LQMKGJe.yWvV4ePLl, 0, 8);
                wLlBJNJ2W.dIocxURUo(this.i0Zug1mVk.yWvV4ePLl, this.ziwPzaoF3.i0Zug1mVk.yWvV4ePLl, 0, 4);
                miisfj8kp = this.i0Zug1mVk.yWvV4ePLl;
                h7j7zcum2 = this.ziwPzaoF3.V9LQMKGJe;
            } else if (i13 == 2) {
                wLlBJNJ2W.dIocxURUo(this.QNqj6nIzv.yWvV4ePLl, this.o4LF8RkoQ.yWvV4ePLl, 0, 8);
                wLlBJNJ2W.dIocxURUo(this.o4LF8RkoQ.yWvV4ePLl, this.ziwPzaoF3.QNqj6nIzv.yWvV4ePLl, 0, 4);
                miisfj8kp = this.o4LF8RkoQ.yWvV4ePLl;
                h7j7zcum2 = this.ziwPzaoF3.o4LF8RkoQ;
            } else if (i13 == 3) {
                wLlBJNJ2W.dIocxURUo(this.o4LF8RkoQ.yWvV4ePLl, this.QNqj6nIzv.yWvV4ePLl, 0, 8);
                wLlBJNJ2W.dIocxURUo(this.o4LF8RkoQ.yWvV4ePLl, this.ziwPzaoF3.o4LF8RkoQ.yWvV4ePLl, 0, 4);
                miisfj8kp = this.o4LF8RkoQ.yWvV4ePLl;
                h7j7zcum2 = this.ziwPzaoF3.QNqj6nIzv;
            } else {
                return;
            }
            wLlBJNJ2W.dIocxURUo(miisfj8kp, h7j7zcum2.yWvV4ePLl, 0, 0);
        }
    }

    @Override // con.k007RzV1x
    public boolean kCA6Zs9sL() {
        return true;
    }

    @Override // con.k007RzV1x
    public String toString() {
        String q3BipwRCk = my9FFKbZi.q3BipwRCk(abGBwSu8x.q3BipwRCk("[Barrier] "), this.M66hQ219i, " {");
        for (int i = 0; i < this.Ihm5o4uLx; i++) {
            k007RzV1x k007rzv1x = this.ShSN9wbzk[i];
            if (i > 0) {
                q3BipwRCk = UexvVay3o.q3BipwRCk(q3BipwRCk, ", ");
            }
            StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk(q3BipwRCk);
            q3BipwRCk2.append(k007rzv1x.M66hQ219i);
            q3BipwRCk = q3BipwRCk2.toString();
        }
        return UexvVay3o.q3BipwRCk(q3BipwRCk, "}");
    }

    public boolean wIZEdYHUn() {
        int i;
        h7j7Zcum2 yWvV4ePLl;
        h7j7Zcum2 yWvV4ePLl2;
        h7j7Zcum2 yWvV4ePLl3;
        int i2;
        int i3;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp = h7j7Zcum2.RG2GI7LDp.BOTTOM;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp2 = h7j7Zcum2.RG2GI7LDp.TOP;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp3 = h7j7Zcum2.RG2GI7LDp.RIGHT;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp4 = h7j7Zcum2.RG2GI7LDp.LEFT;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.Ihm5o4uLx;
            if (i4 >= i) {
                break;
            }
            k007RzV1x k007rzv1x = this.ShSN9wbzk[i4];
            if ((this.uSBmk4hFZ || k007rzv1x.kCA6Zs9sL()) && ((((i2 = this.Ta2zrwkcM) == 0 || i2 == 1) && !k007rzv1x.IytU16YUK()) || (((i3 = this.Ta2zrwkcM) == 2 || i3 == 3) && !k007rzv1x.CpG0imbht()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.Ihm5o4uLx; i6++) {
            k007RzV1x k007rzv1x2 = this.ShSN9wbzk[i6];
            if (this.uSBmk4hFZ || k007rzv1x2.kCA6Zs9sL()) {
                if (!z2) {
                    int i7 = this.Ta2zrwkcM;
                    if (i7 == 0) {
                        yWvV4ePLl3 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp4);
                    } else if (i7 == 1) {
                        yWvV4ePLl3 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp3);
                    } else if (i7 == 2) {
                        yWvV4ePLl3 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp2);
                    } else {
                        if (i7 == 3) {
                            yWvV4ePLl3 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp);
                        }
                        z2 = true;
                    }
                    i5 = yWvV4ePLl3.tGV7Q6urW();
                    z2 = true;
                }
                int i8 = this.Ta2zrwkcM;
                if (i8 == 0) {
                    yWvV4ePLl2 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp4);
                } else {
                    if (i8 == 1) {
                        yWvV4ePLl = k007rzv1x2.yWvV4ePLl(rG2GI7LDp3);
                    } else if (i8 == 2) {
                        yWvV4ePLl2 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp2);
                    } else if (i8 == 3) {
                        yWvV4ePLl = k007rzv1x2.yWvV4ePLl(rG2GI7LDp);
                    }
                    i5 = Math.max(i5, yWvV4ePLl.tGV7Q6urW());
                }
                i5 = Math.min(i5, yWvV4ePLl2.tGV7Q6urW());
            }
        }
        int i9 = i5 + this.a8N8UmDyD;
        int i10 = this.Ta2zrwkcM;
        if (i10 == 0 || i10 == 1) {
            vNtjxmzUM(i9, i9);
        } else {
            i0Zug1mVk(i9, i9);
        }
        this.vIbyhVf1d = true;
        return true;
    }
}
