package con;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Objects;
/* loaded from: classes.dex */
public class c3Ne9ffky extends KxvfgyCbJ {
    public final wh0bDCAtV J4Ux7ym32;
    public final float dIocxURUo;
    public final float tGV7Q6urW;

    public c3Ne9ffky(wh0bDCAtV wh0bdcatv, float f, float f2) {
        this.J4Ux7ym32 = wh0bdcatv;
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }

    public float J4Ux7ym32() {
        wh0bDCAtV wh0bdcatv = this.J4Ux7ym32;
        return (float) Math.toDegrees(Math.atan((double) ((wh0bdcatv.tGV7Q6urW - this.dIocxURUo) / (wh0bdcatv.J4Ux7ym32 - this.tGV7Q6urW))));
    }

    @Override // con.KxvfgyCbJ
    public void q3BipwRCk(Matrix matrix, abYU3brjj abyu3brjj, int i, Canvas canvas) {
        wh0bDCAtV wh0bdcatv = this.J4Ux7ym32;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (wh0bdcatv.tGV7Q6urW - this.dIocxURUo), (double) (wh0bdcatv.J4Ux7ym32 - this.tGV7Q6urW)), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.tGV7Q6urW, this.dIocxURUo);
        matrix2.preRotate(J4Ux7ym32());
        Objects.requireNonNull(abyu3brjj);
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = abYU3brjj.yWvV4ePLl;
        iArr[0] = abyu3brjj.iiGwOFFnr;
        iArr[1] = abyu3brjj.kCA6Zs9sL;
        iArr[2] = abyu3brjj.dIocxURUo;
        Paint paint = abyu3brjj.tGV7Q6urW;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, abYU3brjj.oon79WMrY, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, abyu3brjj.tGV7Q6urW);
        canvas.restore();
    }
}
