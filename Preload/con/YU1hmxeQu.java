package con;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class YU1hmxeQu extends mrqhBRukL {
    @Override // con.Edd3IMDyn, con.ZNRZ3lc8t
    public void GPLPRo6go(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // con.mrqhBRukL, con.ZNRZ3lc8t
    public void Puu3Rhg4F(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // con.Edd3IMDyn, con.ZNRZ3lc8t
    public float dIocxURUo(View view) {
        return view.getTransitionAlpha();
    }

    @Override // con.ftUv7nIZr, con.ZNRZ3lc8t
    public void iiGwOFFnr(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // con.SGtAXGXHq, con.ZNRZ3lc8t
    public void oon79WMrY(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // con.SGtAXGXHq, con.ZNRZ3lc8t
    public void yWvV4ePLl(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
