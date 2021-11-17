package con;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class pVVJ0eZbs extends YfBJruzTn {
    public static final RectF Puu3Rhg4F = new RectF();
    @Deprecated
    public float GPLPRo6go;
    @Deprecated
    public float J4Ux7ym32;
    @Deprecated
    public float dIocxURUo;
    @Deprecated
    public float iiGwOFFnr;
    @Deprecated
    public float kCA6Zs9sL;
    @Deprecated
    public float tGV7Q6urW;

    public pVVJ0eZbs(float f, float f2, float f3, float f4) {
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = f2;
        this.dIocxURUo = f3;
        this.kCA6Zs9sL = f4;
    }

    @Override // con.YfBJruzTn
    public void q3BipwRCk(Matrix matrix, Path path) {
        Matrix matrix2 = this.q3BipwRCk;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = Puu3Rhg4F;
        rectF.set(this.J4Ux7ym32, this.tGV7Q6urW, this.dIocxURUo, this.kCA6Zs9sL);
        path.arcTo(rectF, this.iiGwOFFnr, this.GPLPRo6go, false);
        path.transform(matrix);
    }
}
