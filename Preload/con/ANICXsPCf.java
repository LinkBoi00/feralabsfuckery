package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public class ANICXsPCf implements sTDZxriMn {
    public final uXZOTWgvT J4Ux7ym32;
    public final LKa8y802S tGV7Q6urW;
    public int q3BipwRCk = 0;
    public int dIocxURUo = 8;
    public int[] kCA6Zs9sL = new int[8];
    public int[] iiGwOFFnr = new int[8];
    public float[] GPLPRo6go = new float[8];
    public int Puu3Rhg4F = -1;
    public int yWvV4ePLl = -1;
    public boolean oon79WMrY = false;

    public ANICXsPCf(uXZOTWgvT uxzotwgvt, LKa8y802S lKa8y802S) {
        this.J4Ux7ym32 = uxzotwgvt;
        this.tGV7Q6urW = lKa8y802S;
    }

    @Override // con.sTDZxriMn
    public void GPLPRo6go(miIsFJ8kP miisfj8kp, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.Puu3Rhg4F;
            if (i == -1) {
                this.Puu3Rhg4F = 0;
                this.GPLPRo6go[0] = f;
                this.kCA6Zs9sL[0] = miisfj8kp.kmSgne1rO;
                this.iiGwOFFnr[0] = -1;
                miisfj8kp.sk5s77z6Q++;
                miisfj8kp.q3BipwRCk(this.J4Ux7ym32);
                this.q3BipwRCk++;
                if (!this.oon79WMrY) {
                    int i2 = this.yWvV4ePLl + 1;
                    this.yWvV4ePLl = i2;
                    int[] iArr = this.kCA6Zs9sL;
                    if (i2 >= iArr.length) {
                        this.oon79WMrY = true;
                        this.yWvV4ePLl = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.q3BipwRCk) {
                int[] iArr2 = this.kCA6Zs9sL;
                int i5 = iArr2[i];
                int i6 = miisfj8kp.kmSgne1rO;
                if (i5 == i6) {
                    float[] fArr = this.GPLPRo6go;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.Puu3Rhg4F) {
                            this.Puu3Rhg4F = this.iiGwOFFnr[i];
                        } else {
                            int[] iArr3 = this.iiGwOFFnr;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            miisfj8kp.J4Ux7ym32(this.J4Ux7ym32);
                        }
                        if (this.oon79WMrY) {
                            this.yWvV4ePLl = i;
                        }
                        miisfj8kp.sk5s77z6Q--;
                        this.q3BipwRCk--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.iiGwOFFnr[i];
                i3++;
            }
            int i7 = this.yWvV4ePLl;
            i7++;
            if (this.oon79WMrY) {
                int[] iArr4 = this.kCA6Zs9sL;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            }
            int[] iArr5 = this.kCA6Zs9sL;
            if (i7 >= iArr5.length && this.q3BipwRCk < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.kCA6Zs9sL;
                    if (i8 >= iArr6.length) {
                        break;
                    } else if (iArr6[i8] == -1) {
                        i7 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr7 = this.kCA6Zs9sL;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i9 = this.dIocxURUo * 2;
                this.dIocxURUo = i9;
                this.oon79WMrY = false;
                this.yWvV4ePLl = i7 - 1;
                this.GPLPRo6go = Arrays.copyOf(this.GPLPRo6go, i9);
                this.kCA6Zs9sL = Arrays.copyOf(this.kCA6Zs9sL, this.dIocxURUo);
                this.iiGwOFFnr = Arrays.copyOf(this.iiGwOFFnr, this.dIocxURUo);
            }
            this.kCA6Zs9sL[i7] = miisfj8kp.kmSgne1rO;
            this.GPLPRo6go[i7] = f;
            int[] iArr8 = this.iiGwOFFnr;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.Puu3Rhg4F;
                this.Puu3Rhg4F = i7;
            }
            miisfj8kp.sk5s77z6Q++;
            miisfj8kp.q3BipwRCk(this.J4Ux7ym32);
            this.q3BipwRCk++;
            if (!this.oon79WMrY) {
                this.yWvV4ePLl++;
            }
            int i10 = this.yWvV4ePLl;
            int[] iArr9 = this.kCA6Zs9sL;
            if (i10 >= iArr9.length) {
                this.oon79WMrY = true;
                this.yWvV4ePLl = iArr9.length - 1;
            }
        }
    }

    @Override // con.sTDZxriMn
    public final void J4Ux7ym32(miIsFJ8kP miisfj8kp, float f) {
        if (f == 0.0f) {
            iiGwOFFnr(miisfj8kp, true);
            return;
        }
        int i = this.Puu3Rhg4F;
        if (i == -1) {
            this.Puu3Rhg4F = 0;
            this.GPLPRo6go[0] = f;
            this.kCA6Zs9sL[0] = miisfj8kp.kmSgne1rO;
            this.iiGwOFFnr[0] = -1;
            miisfj8kp.sk5s77z6Q++;
            miisfj8kp.q3BipwRCk(this.J4Ux7ym32);
            this.q3BipwRCk++;
            if (!this.oon79WMrY) {
                int i2 = this.yWvV4ePLl + 1;
                this.yWvV4ePLl = i2;
                int[] iArr = this.kCA6Zs9sL;
                if (i2 >= iArr.length) {
                    this.oon79WMrY = true;
                    this.yWvV4ePLl = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.q3BipwRCk) {
            int[] iArr2 = this.kCA6Zs9sL;
            int i5 = iArr2[i];
            int i6 = miisfj8kp.kmSgne1rO;
            if (i5 == i6) {
                this.GPLPRo6go[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.iiGwOFFnr[i];
            i3++;
        }
        int i7 = this.yWvV4ePLl;
        i7++;
        if (this.oon79WMrY) {
            int[] iArr3 = this.kCA6Zs9sL;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        }
        int[] iArr4 = this.kCA6Zs9sL;
        if (i7 >= iArr4.length && this.q3BipwRCk < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.kCA6Zs9sL;
                if (i8 >= iArr5.length) {
                    break;
                } else if (iArr5[i8] == -1) {
                    i7 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int[] iArr6 = this.kCA6Zs9sL;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i9 = this.dIocxURUo * 2;
            this.dIocxURUo = i9;
            this.oon79WMrY = false;
            this.yWvV4ePLl = i7 - 1;
            this.GPLPRo6go = Arrays.copyOf(this.GPLPRo6go, i9);
            this.kCA6Zs9sL = Arrays.copyOf(this.kCA6Zs9sL, this.dIocxURUo);
            this.iiGwOFFnr = Arrays.copyOf(this.iiGwOFFnr, this.dIocxURUo);
        }
        this.kCA6Zs9sL[i7] = miisfj8kp.kmSgne1rO;
        this.GPLPRo6go[i7] = f;
        int[] iArr7 = this.iiGwOFFnr;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.Puu3Rhg4F;
            this.Puu3Rhg4F = i7;
        }
        miisfj8kp.sk5s77z6Q++;
        miisfj8kp.q3BipwRCk(this.J4Ux7ym32);
        int i10 = this.q3BipwRCk + 1;
        this.q3BipwRCk = i10;
        if (!this.oon79WMrY) {
            this.yWvV4ePLl++;
        }
        int[] iArr8 = this.kCA6Zs9sL;
        if (i10 >= iArr8.length) {
            this.oon79WMrY = true;
        }
        if (this.yWvV4ePLl >= iArr8.length) {
            this.oon79WMrY = true;
            this.yWvV4ePLl = iArr8.length - 1;
        }
    }

    @Override // con.sTDZxriMn
    public void Puu3Rhg4F(float f) {
        int i = this.Puu3Rhg4F;
        int i2 = 0;
        while (i != -1 && i2 < this.q3BipwRCk) {
            float[] fArr = this.GPLPRo6go;
            fArr[i] = fArr[i] / f;
            i = this.iiGwOFFnr[i];
            i2++;
        }
    }

    @Override // con.sTDZxriMn
    public final void clear() {
        int i = this.Puu3Rhg4F;
        int i2 = 0;
        while (i != -1 && i2 < this.q3BipwRCk) {
            miIsFJ8kP miisfj8kp = ((miIsFJ8kP[]) this.tGV7Q6urW.dIocxURUo)[this.kCA6Zs9sL[i]];
            if (miisfj8kp != null) {
                miisfj8kp.J4Ux7ym32(this.J4Ux7ym32);
            }
            i = this.iiGwOFFnr[i];
            i2++;
        }
        this.Puu3Rhg4F = -1;
        this.yWvV4ePLl = -1;
        this.oon79WMrY = false;
        this.q3BipwRCk = 0;
    }

    @Override // con.sTDZxriMn
    public float dIocxURUo(uXZOTWgvT uxzotwgvt, boolean z) {
        float yWvV4ePLl = yWvV4ePLl(uxzotwgvt.q3BipwRCk);
        iiGwOFFnr(uxzotwgvt.q3BipwRCk, z);
        sTDZxriMn stdzxrimn = uxzotwgvt.dIocxURUo;
        int vPSbyrYWX = stdzxrimn.vPSbyrYWX();
        for (int i = 0; i < vPSbyrYWX; i++) {
            miIsFJ8kP kCA6Zs9sL = stdzxrimn.kCA6Zs9sL(i);
            GPLPRo6go(kCA6Zs9sL, stdzxrimn.yWvV4ePLl(kCA6Zs9sL) * yWvV4ePLl, z);
        }
        return yWvV4ePLl;
    }

    @Override // con.sTDZxriMn
    public final float iiGwOFFnr(miIsFJ8kP miisfj8kp, boolean z) {
        int i = this.Puu3Rhg4F;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.q3BipwRCk) {
            if (this.kCA6Zs9sL[i] == miisfj8kp.kmSgne1rO) {
                if (i == this.Puu3Rhg4F) {
                    this.Puu3Rhg4F = this.iiGwOFFnr[i];
                } else {
                    int[] iArr = this.iiGwOFFnr;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    miisfj8kp.J4Ux7ym32(this.J4Ux7ym32);
                }
                miisfj8kp.sk5s77z6Q--;
                this.q3BipwRCk--;
                this.kCA6Zs9sL[i] = -1;
                if (this.oon79WMrY) {
                    this.yWvV4ePLl = i;
                }
                return this.GPLPRo6go[i];
            }
            i = this.iiGwOFFnr[i];
            i2++;
            i3 = i;
        }
        return 0.0f;
    }

    @Override // con.sTDZxriMn
    public miIsFJ8kP kCA6Zs9sL(int i) {
        int i2 = this.Puu3Rhg4F;
        int i3 = 0;
        while (i2 != -1 && i3 < this.q3BipwRCk) {
            if (i3 == i) {
                return ((miIsFJ8kP[]) this.tGV7Q6urW.dIocxURUo)[this.kCA6Zs9sL[i2]];
            }
            i2 = this.iiGwOFFnr[i2];
            i3++;
        }
        return null;
    }

    @Override // con.sTDZxriMn
    public void oon79WMrY() {
        int i = this.Puu3Rhg4F;
        int i2 = 0;
        while (i != -1 && i2 < this.q3BipwRCk) {
            float[] fArr = this.GPLPRo6go;
            fArr[i] = fArr[i] * -1.0f;
            i = this.iiGwOFFnr[i];
            i2++;
        }
    }

    @Override // con.sTDZxriMn
    public float q3BipwRCk(int i) {
        int i2 = this.Puu3Rhg4F;
        int i3 = 0;
        while (i2 != -1 && i3 < this.q3BipwRCk) {
            if (i3 == i) {
                return this.GPLPRo6go[i2];
            }
            i2 = this.iiGwOFFnr[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // con.sTDZxriMn
    public boolean tGV7Q6urW(miIsFJ8kP miisfj8kp) {
        int i = this.Puu3Rhg4F;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.q3BipwRCk) {
            if (this.kCA6Zs9sL[i] == miisfj8kp.kmSgne1rO) {
                return true;
            }
            i = this.iiGwOFFnr[i];
            i2++;
        }
        return false;
    }

    public String toString() {
        int i = this.Puu3Rhg4F;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.q3BipwRCk) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(UexvVay3o.q3BipwRCk(str, " -> "));
            q3BipwRCk.append(this.GPLPRo6go[i]);
            q3BipwRCk.append(" : ");
            StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk(q3BipwRCk.toString());
            q3BipwRCk2.append(((miIsFJ8kP[]) this.tGV7Q6urW.dIocxURUo)[this.kCA6Zs9sL[i]]);
            str = q3BipwRCk2.toString();
            i = this.iiGwOFFnr[i];
            i2++;
        }
        return str;
    }

    @Override // con.sTDZxriMn
    public int vPSbyrYWX() {
        return this.q3BipwRCk;
    }

    @Override // con.sTDZxriMn
    public final float yWvV4ePLl(miIsFJ8kP miisfj8kp) {
        int i = this.Puu3Rhg4F;
        int i2 = 0;
        while (i != -1 && i2 < this.q3BipwRCk) {
            if (this.kCA6Zs9sL[i] == miisfj8kp.kmSgne1rO) {
                return this.GPLPRo6go[i];
            }
            i = this.iiGwOFFnr[i];
            i2++;
        }
        return 0.0f;
    }
}
