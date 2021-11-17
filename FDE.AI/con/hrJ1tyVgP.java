package con;

import android.graphics.Matrix;
/* loaded from: classes.dex */
public final class hrJ1tyVgP {
    public Matrix J4Ux7ym32;
    public float[] dIocxURUo;
    public float[] kCA6Zs9sL;
    public final kkcQgCx5G q3BipwRCk;
    public Matrix tGV7Q6urW;
    public boolean iiGwOFFnr = true;
    public boolean GPLPRo6go = true;
    public boolean Puu3Rhg4F = true;

    public hrJ1tyVgP(kkcQgCx5G kkcqgcx5g) {
        this.q3BipwRCk = kkcqgcx5g;
    }

    public final float[] J4Ux7ym32(Object obj) {
        float[] fArr = this.dIocxURUo;
        if (fArr == null) {
            fArr = p20sE4qqm.q3BipwRCk(null, 1);
            this.dIocxURUo = fArr;
        }
        if (!this.iiGwOFFnr) {
            return fArr;
        }
        Matrix matrix = this.J4Ux7ym32;
        if (matrix == null) {
            matrix = new Matrix();
            this.J4Ux7ym32 = matrix;
        }
        this.q3BipwRCk.WaUP0CF08(obj, matrix);
        Matrix matrix2 = this.tGV7Q6urW;
        if (matrix2 == null || !anXlDk6fV.tGV7Q6urW(matrix, matrix2)) {
            ODug2UCW1.i0Zug1mVk(fArr, matrix);
            this.J4Ux7ym32 = matrix2;
            this.tGV7Q6urW = matrix;
        }
        this.iiGwOFFnr = false;
        return fArr;
    }

    public final float[] q3BipwRCk(Object obj) {
        float[] fArr = this.kCA6Zs9sL;
        if (fArr == null) {
            fArr = p20sE4qqm.q3BipwRCk(null, 1);
            this.kCA6Zs9sL = fArr;
        }
        if (this.GPLPRo6go) {
            this.Puu3Rhg4F = BBVaGLNaU.IytU16YUK(J4Ux7ym32(obj), fArr);
            this.GPLPRo6go = false;
        }
        if (this.Puu3Rhg4F) {
            return fArr;
        }
        return null;
    }

    public final void tGV7Q6urW() {
        this.iiGwOFFnr = true;
        this.GPLPRo6go = true;
    }
}
