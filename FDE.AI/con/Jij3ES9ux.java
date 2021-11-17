package con;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class Jij3ES9ux extends KxvfgyCbJ {
    public final pVVJ0eZbs J4Ux7ym32;

    public Jij3ES9ux(pVVJ0eZbs pvvj0ezbs) {
        this.J4Ux7ym32 = pvvj0ezbs;
    }

    @Override // con.KxvfgyCbJ
    public void q3BipwRCk(Matrix matrix, abYU3brjj abyu3brjj, int i, Canvas canvas) {
        pVVJ0eZbs pvvj0ezbs = this.J4Ux7ym32;
        float f = pvvj0ezbs.iiGwOFFnr;
        float f2 = pvvj0ezbs.GPLPRo6go;
        pVVJ0eZbs pvvj0ezbs2 = this.J4Ux7ym32;
        RectF rectF = new RectF(pvvj0ezbs2.J4Ux7ym32, pvvj0ezbs2.tGV7Q6urW, pvvj0ezbs2.dIocxURUo, pvvj0ezbs2.kCA6Zs9sL);
        boolean z = f2 < 0.0f;
        Path path = abyu3brjj.GPLPRo6go;
        if (z) {
            int[] iArr = abYU3brjj.vPSbyrYWX;
            iArr[0] = 0;
            iArr[1] = abyu3brjj.iiGwOFFnr;
            iArr[2] = abyu3brjj.kCA6Zs9sL;
            iArr[3] = abyu3brjj.dIocxURUo;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i);
            rectF.inset(f3, f3);
            int[] iArr2 = abYU3brjj.vPSbyrYWX;
            iArr2[0] = 0;
            iArr2[1] = abyu3brjj.dIocxURUo;
            iArr2[2] = abyu3brjj.kCA6Zs9sL;
            iArr2[3] = abyu3brjj.iiGwOFFnr;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i) / width);
            float q3BipwRCk = ML8zUvnYf.q3BipwRCk(1.0f, f4, 2.0f, f4);
            float[] fArr = abYU3brjj.CBQ5d1kRq;
            fArr[1] = f4;
            fArr[2] = q3BipwRCk;
            abyu3brjj.J4Ux7ym32.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, abYU3brjj.vPSbyrYWX, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, abyu3brjj.Puu3Rhg4F);
            }
            canvas.drawArc(rectF, f, f2, true, abyu3brjj.J4Ux7ym32);
            canvas.restore();
        }
    }
}
