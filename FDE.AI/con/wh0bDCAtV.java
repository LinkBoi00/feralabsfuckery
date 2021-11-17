package con;

import android.graphics.Matrix;
import android.graphics.Path;
/* loaded from: classes.dex */
public class wh0bDCAtV extends YfBJruzTn {
    public float J4Ux7ym32;
    public float tGV7Q6urW;

    @Override // con.YfBJruzTn
    public void q3BipwRCk(Matrix matrix, Path path) {
        Matrix matrix2 = this.q3BipwRCk;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.J4Ux7ym32, this.tGV7Q6urW);
        path.transform(matrix);
    }
}
