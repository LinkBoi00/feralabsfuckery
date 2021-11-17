package con;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
/* loaded from: classes.dex */
public class B8aS2gOjd {
    public final Dkj44tvhZ[] q3BipwRCk = new Dkj44tvhZ[4];
    public final Matrix[] J4Ux7ym32 = new Matrix[4];
    public final Matrix[] tGV7Q6urW = new Matrix[4];
    public final PointF dIocxURUo = new PointF();
    public final Path kCA6Zs9sL = new Path();
    public final Path iiGwOFFnr = new Path();
    public final Dkj44tvhZ GPLPRo6go = new Dkj44tvhZ();
    public final float[] Puu3Rhg4F = new float[2];
    public final float[] yWvV4ePLl = new float[2];
    public final Path oon79WMrY = new Path();
    public final Path vPSbyrYWX = new Path();
    public boolean CBQ5d1kRq = true;

    public B8aS2gOjd() {
        for (int i = 0; i < 4; i++) {
            this.q3BipwRCk[i] = new Dkj44tvhZ();
            this.J4Ux7ym32[i] = new Matrix();
            this.tGV7Q6urW[i] = new Matrix();
        }
    }

    public final boolean J4Ux7ym32(Path path, int i) {
        this.vPSbyrYWX.reset();
        this.q3BipwRCk[i].J4Ux7ym32(this.J4Ux7ym32[i], this.vPSbyrYWX);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.vPSbyrYWX.computeBounds(rectF, true);
        path.op(this.vPSbyrYWX, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public void q3BipwRCk(xT3tobMV0 xt3tobmv0, float f, RectF rectF, iFKnyAZAM ifknyazam, Path path) {
        int i;
        float f2;
        float f3;
        oWhsE8IPp owhse8ipp;
        char c;
        char c2;
        Path path2;
        Matrix matrix;
        Dkj44tvhZ dkj44tvhZ;
        BR8wFu8f7 bR8wFu8f7;
        qdam7I1O8 qdam7i1o8;
        float f4;
        float f5;
        path.rewind();
        this.kCA6Zs9sL.rewind();
        this.iiGwOFFnr.rewind();
        this.iiGwOFFnr.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                bR8wFu8f7 = xt3tobmv0.GPLPRo6go;
            } else if (i2 == 2) {
                bR8wFu8f7 = xt3tobmv0.Puu3Rhg4F;
            } else if (i2 != 3) {
                bR8wFu8f7 = xt3tobmv0.iiGwOFFnr;
            } else {
                bR8wFu8f7 = xt3tobmv0.kCA6Zs9sL;
            }
            if (i2 == 1) {
                qdam7i1o8 = xt3tobmv0.tGV7Q6urW;
            } else if (i2 == 2) {
                qdam7i1o8 = xt3tobmv0.dIocxURUo;
            } else if (i2 != 3) {
                qdam7i1o8 = xt3tobmv0.J4Ux7ym32;
            } else {
                qdam7i1o8 = xt3tobmv0.q3BipwRCk;
            }
            Dkj44tvhZ dkj44tvhZ2 = this.q3BipwRCk[i2];
            Objects.requireNonNull(qdam7i1o8);
            qdam7i1o8.q3BipwRCk(dkj44tvhZ2, 90.0f, f, bR8wFu8f7.q3BipwRCk(rectF));
            int i3 = i2 + 1;
            float f6 = (float) (i3 * 90);
            this.J4Ux7ym32[i2].reset();
            PointF pointF = this.dIocxURUo;
            if (i2 == 1) {
                f5 = rectF.right;
            } else if (i2 != 2) {
                f5 = i2 != 3 ? rectF.right : rectF.left;
                f4 = rectF.top;
                pointF.set(f5, f4);
                Matrix matrix2 = this.J4Ux7ym32[i2];
                PointF pointF2 = this.dIocxURUo;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.J4Ux7ym32[i2].preRotate(f6);
                float[] fArr = this.Puu3Rhg4F;
                Dkj44tvhZ[] dkj44tvhZArr = this.q3BipwRCk;
                fArr[0] = dkj44tvhZArr[i2].tGV7Q6urW;
                fArr[1] = dkj44tvhZArr[i2].dIocxURUo;
                this.J4Ux7ym32[i2].mapPoints(fArr);
                this.tGV7Q6urW[i2].reset();
                Matrix matrix3 = this.tGV7Q6urW[i2];
                float[] fArr2 = this.Puu3Rhg4F;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.tGV7Q6urW[i2].preRotate(f6);
                i2 = i3;
            } else {
                f5 = rectF.left;
            }
            f4 = rectF.bottom;
            pointF.set(f5, f4);
            Matrix matrix22 = this.J4Ux7ym32[i2];
            PointF pointF22 = this.dIocxURUo;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.J4Ux7ym32[i2].preRotate(f6);
            float[] fArr3 = this.Puu3Rhg4F;
            Dkj44tvhZ[] dkj44tvhZArr2 = this.q3BipwRCk;
            fArr3[0] = dkj44tvhZArr2[i2].tGV7Q6urW;
            fArr3[1] = dkj44tvhZArr2[i2].dIocxURUo;
            this.J4Ux7ym32[i2].mapPoints(fArr3);
            this.tGV7Q6urW[i2].reset();
            Matrix matrix32 = this.tGV7Q6urW[i2];
            float[] fArr22 = this.Puu3Rhg4F;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.tGV7Q6urW[i2].preRotate(f6);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr4 = this.Puu3Rhg4F;
            Dkj44tvhZ[] dkj44tvhZArr3 = this.q3BipwRCk;
            fArr4[0] = dkj44tvhZArr3[i4].q3BipwRCk;
            fArr4[1] = dkj44tvhZArr3[i4].J4Ux7ym32;
            this.J4Ux7ym32[i4].mapPoints(fArr4);
            float[] fArr5 = this.Puu3Rhg4F;
            if (i4 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.q3BipwRCk[i4].J4Ux7ym32(this.J4Ux7ym32[i4], path);
            if (ifknyazam != null) {
                Dkj44tvhZ dkj44tvhZ3 = this.q3BipwRCk[i4];
                Matrix matrix4 = this.J4Ux7ym32[i4];
                BitSet bitSet = ((dOSsQaJVg) ifknyazam.kmSgne1rO).PSTqBLTET;
                Objects.requireNonNull(dkj44tvhZ3);
                bitSet.set(i4, false);
                KxvfgyCbJ[] kxvfgyCbJArr = ((dOSsQaJVg) ifknyazam.kmSgne1rO).kmSgne1rO;
                dkj44tvhZ3.q3BipwRCk(dkj44tvhZ3.iiGwOFFnr);
                kxvfgyCbJArr[i4] = new UWYlDELQM(dkj44tvhZ3, new ArrayList(dkj44tvhZ3.Puu3Rhg4F), new Matrix(matrix4));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.Puu3Rhg4F;
            Dkj44tvhZ[] dkj44tvhZArr4 = this.q3BipwRCk;
            fArr6[0] = dkj44tvhZArr4[i4].tGV7Q6urW;
            fArr6[1] = dkj44tvhZArr4[i4].dIocxURUo;
            this.J4Ux7ym32[i4].mapPoints(fArr6);
            float[] fArr7 = this.yWvV4ePLl;
            Dkj44tvhZ[] dkj44tvhZArr5 = this.q3BipwRCk;
            fArr7[0] = dkj44tvhZArr5[i6].q3BipwRCk;
            fArr7[1] = dkj44tvhZArr5[i6].J4Ux7ym32;
            this.J4Ux7ym32[i6].mapPoints(fArr7);
            float[] fArr8 = this.Puu3Rhg4F;
            float f7 = fArr8[0];
            float[] fArr9 = this.yWvV4ePLl;
            float max = Math.max(((float) Math.hypot((double) (f7 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.Puu3Rhg4F;
            Dkj44tvhZ[] dkj44tvhZArr6 = this.q3BipwRCk;
            fArr10[0] = dkj44tvhZArr6[i4].tGV7Q6urW;
            fArr10[1] = dkj44tvhZArr6[i4].dIocxURUo;
            this.J4Ux7ym32[i4].mapPoints(fArr10);
            if (i4 == 1 || i4 == 3) {
                f3 = rectF.centerX();
                f2 = this.Puu3Rhg4F[0];
            } else {
                f3 = rectF.centerY();
                f2 = this.Puu3Rhg4F[1];
            }
            Math.abs(f3 - f2);
            this.GPLPRo6go.dIocxURUo(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                c2 = 2;
                if (i4 != 2) {
                    c = 3;
                    if (i4 != 3) {
                        owhse8ipp = xt3tobmv0.oon79WMrY;
                    } else {
                        owhse8ipp = xt3tobmv0.yWvV4ePLl;
                    }
                } else {
                    c = 3;
                    owhse8ipp = xt3tobmv0.CBQ5d1kRq;
                }
            } else {
                c2 = 2;
                c = 3;
                owhse8ipp = xt3tobmv0.vPSbyrYWX;
            }
            Dkj44tvhZ dkj44tvhZ4 = this.GPLPRo6go;
            Objects.requireNonNull(owhse8ipp);
            dkj44tvhZ4.tGV7Q6urW(max, 0.0f);
            this.oon79WMrY.reset();
            this.GPLPRo6go.J4Ux7ym32(this.tGV7Q6urW[i4], this.oon79WMrY);
            if (!this.CBQ5d1kRq || (!J4Ux7ym32(this.oon79WMrY, i4) && !J4Ux7ym32(this.oon79WMrY, i6))) {
                dkj44tvhZ = this.GPLPRo6go;
                matrix = this.tGV7Q6urW[i4];
                path2 = path;
            } else {
                Path path3 = this.oon79WMrY;
                path3.op(path3, this.iiGwOFFnr, Path.Op.DIFFERENCE);
                float[] fArr11 = this.Puu3Rhg4F;
                Dkj44tvhZ dkj44tvhZ5 = this.GPLPRo6go;
                fArr11[0] = dkj44tvhZ5.q3BipwRCk;
                fArr11[1] = dkj44tvhZ5.J4Ux7ym32;
                this.tGV7Q6urW[i4].mapPoints(fArr11);
                Path path4 = this.kCA6Zs9sL;
                float[] fArr12 = this.Puu3Rhg4F;
                path4.moveTo(fArr12[0], fArr12[1]);
                dkj44tvhZ = this.GPLPRo6go;
                matrix = this.tGV7Q6urW[i4];
                path2 = this.kCA6Zs9sL;
            }
            dkj44tvhZ.J4Ux7ym32(matrix, path2);
            if (ifknyazam != null) {
                Dkj44tvhZ dkj44tvhZ6 = this.GPLPRo6go;
                Matrix matrix5 = this.tGV7Q6urW[i4];
                Objects.requireNonNull(dkj44tvhZ6);
                ((dOSsQaJVg) ifknyazam.kmSgne1rO).PSTqBLTET.set(i4 + 4, false);
                KxvfgyCbJ[] kxvfgyCbJArr2 = ((dOSsQaJVg) ifknyazam.kmSgne1rO).Bhmn1KIah;
                dkj44tvhZ6.q3BipwRCk(dkj44tvhZ6.iiGwOFFnr);
                kxvfgyCbJArr2[i4] = new UWYlDELQM(dkj44tvhZ6, new ArrayList(dkj44tvhZ6.Puu3Rhg4F), new Matrix(matrix5));
            }
            i4 = i5;
        }
        path.close();
        this.kCA6Zs9sL.close();
        if (!this.kCA6Zs9sL.isEmpty()) {
            path.op(this.kCA6Zs9sL, Path.Op.UNION);
        }
    }
}
