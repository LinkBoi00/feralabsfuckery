package con;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Dkj44tvhZ {
    @Deprecated
    public float J4Ux7ym32;
    @Deprecated
    public float dIocxURUo;
    @Deprecated
    public float iiGwOFFnr;
    @Deprecated
    public float kCA6Zs9sL;
    @Deprecated
    public float q3BipwRCk;
    @Deprecated
    public float tGV7Q6urW;
    public final List GPLPRo6go = new ArrayList();
    public final List Puu3Rhg4F = new ArrayList();

    public Dkj44tvhZ() {
        dIocxURUo(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void J4Ux7ym32(Matrix matrix, Path path) {
        int size = this.GPLPRo6go.size();
        for (int i = 0; i < size; i++) {
            ((YfBJruzTn) this.GPLPRo6go.get(i)).q3BipwRCk(matrix, path);
        }
    }

    public void dIocxURUo(float f, float f2, float f3, float f4) {
        this.q3BipwRCk = f;
        this.J4Ux7ym32 = f2;
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
        this.kCA6Zs9sL = f3;
        this.iiGwOFFnr = (f3 + f4) % 360.0f;
        this.GPLPRo6go.clear();
        this.Puu3Rhg4F.clear();
    }

    public final void q3BipwRCk(float f) {
        float f2 = this.kCA6Zs9sL;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.tGV7Q6urW;
                float f5 = this.dIocxURUo;
                pVVJ0eZbs pvvj0ezbs = new pVVJ0eZbs(f4, f5, f4, f5);
                pvvj0ezbs.iiGwOFFnr = this.kCA6Zs9sL;
                pvvj0ezbs.GPLPRo6go = f3;
                this.Puu3Rhg4F.add(new Jij3ES9ux(pvvj0ezbs));
                this.kCA6Zs9sL = f;
            }
        }
    }

    public void tGV7Q6urW(float f, float f2) {
        wh0bDCAtV wh0bdcatv = new wh0bDCAtV();
        wh0bdcatv.J4Ux7ym32 = f;
        wh0bdcatv.tGV7Q6urW = f2;
        this.GPLPRo6go.add(wh0bdcatv);
        c3Ne9ffky c3ne9ffky = new c3Ne9ffky(wh0bdcatv, this.tGV7Q6urW, this.dIocxURUo);
        q3BipwRCk(c3ne9ffky.J4Ux7ym32() + 270.0f);
        this.Puu3Rhg4F.add(c3ne9ffky);
        this.kCA6Zs9sL = c3ne9ffky.J4Ux7ym32() + 270.0f;
        this.tGV7Q6urW = f;
        this.dIocxURUo = f2;
    }
}
