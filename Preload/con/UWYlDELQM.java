package con;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
/* loaded from: classes.dex */
public class UWYlDELQM extends KxvfgyCbJ {
    public final /* synthetic */ List J4Ux7ym32;
    public final /* synthetic */ Matrix tGV7Q6urW;

    public UWYlDELQM(Dkj44tvhZ dkj44tvhZ, List list, Matrix matrix) {
        this.J4Ux7ym32 = list;
        this.tGV7Q6urW = matrix;
    }

    @Override // con.KxvfgyCbJ
    public void q3BipwRCk(Matrix matrix, abYU3brjj abyu3brjj, int i, Canvas canvas) {
        for (KxvfgyCbJ kxvfgyCbJ : this.J4Ux7ym32) {
            kxvfgyCbJ.q3BipwRCk(this.tGV7Q6urW, abyu3brjj, i, canvas);
        }
    }
}
