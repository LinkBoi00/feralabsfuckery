package con;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* loaded from: classes.dex */
public final class Q3Qxqu4re implements A128gLXzp {
    public final Path q3BipwRCk;
    public final RectF J4Ux7ym32 = new RectF();
    public final float[] tGV7Q6urW = new float[8];
    public final Matrix dIocxURUo = new Matrix();

    public Q3Qxqu4re(Path path) {
        this.q3BipwRCk = path;
    }

    public void J4Ux7ym32(wOXdxhlrk woxdxhlrk) {
        this.J4Ux7ym32.set(woxdxhlrk.q3BipwRCk, woxdxhlrk.J4Ux7ym32, woxdxhlrk.tGV7Q6urW, woxdxhlrk.dIocxURUo);
        this.tGV7Q6urW[0] = yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL);
        this.tGV7Q6urW[1] = yDwaznigW.tGV7Q6urW(woxdxhlrk.kCA6Zs9sL);
        this.tGV7Q6urW[2] = yDwaznigW.J4Ux7ym32(woxdxhlrk.iiGwOFFnr);
        this.tGV7Q6urW[3] = yDwaznigW.tGV7Q6urW(woxdxhlrk.iiGwOFFnr);
        this.tGV7Q6urW[4] = yDwaznigW.J4Ux7ym32(woxdxhlrk.GPLPRo6go);
        this.tGV7Q6urW[5] = yDwaznigW.tGV7Q6urW(woxdxhlrk.GPLPRo6go);
        this.tGV7Q6urW[6] = yDwaznigW.J4Ux7ym32(woxdxhlrk.Puu3Rhg4F);
        this.tGV7Q6urW[7] = yDwaznigW.tGV7Q6urW(woxdxhlrk.Puu3Rhg4F);
        this.q3BipwRCk.addRoundRect(this.J4Ux7ym32, this.tGV7Q6urW, Path.Direction.CCW);
    }

    public boolean dIocxURUo(A128gLXzp a128gLXzp, A128gLXzp a128gLXzp2, int i) {
        oWhsE8IPp owhse8ipp = anYMrvy8z.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = anYMrvy8z.q3BipwRCk;
        Path.Op op = anYMrvy8z.q3BipwRCk(i, 0) ? Path.Op.DIFFERENCE : anYMrvy8z.q3BipwRCk(i, 1) ? Path.Op.INTERSECT : anYMrvy8z.q3BipwRCk(i, 4) ? Path.Op.REVERSE_DIFFERENCE : anYMrvy8z.q3BipwRCk(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.q3BipwRCk;
        if (a128gLXzp instanceof Q3Qxqu4re) {
            return path.op(((Q3Qxqu4re) a128gLXzp).q3BipwRCk, ((Q3Qxqu4re) a128gLXzp2).q3BipwRCk, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void q3BipwRCk(bzmJZsHMu bzmjzshmu) {
        if (!(!Float.isNaN(bzmjzshmu.q3BipwRCk))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(bzmjzshmu.J4Ux7ym32))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(bzmjzshmu.tGV7Q6urW))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(bzmjzshmu.dIocxURUo)) {
            this.J4Ux7ym32.set(new RectF(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32, bzmjzshmu.tGV7Q6urW, bzmjzshmu.dIocxURUo));
            this.q3BipwRCk.addRect(this.J4Ux7ym32, Path.Direction.CCW);
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    public void tGV7Q6urW(float f, float f2, float f3, float f4, float f5, float f6) {
        this.q3BipwRCk.cubicTo(f, f2, f3, f4, f5, f6);
    }
}
