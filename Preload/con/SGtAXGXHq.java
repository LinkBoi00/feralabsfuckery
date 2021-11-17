package con;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public abstract class SGtAXGXHq extends Edd3IMDyn {
    public static boolean GPLPRo6go = true;
    public static boolean iiGwOFFnr = true;

    @Override // con.ZNRZ3lc8t
    @SuppressLint({"NewApi"})
    public void oon79WMrY(View view, Matrix matrix) {
        if (GPLPRo6go) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                GPLPRo6go = false;
            }
        }
    }

    @Override // con.ZNRZ3lc8t
    @SuppressLint({"NewApi"})
    public void yWvV4ePLl(View view, Matrix matrix) {
        if (iiGwOFFnr) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                iiGwOFFnr = false;
            }
        }
    }
}
