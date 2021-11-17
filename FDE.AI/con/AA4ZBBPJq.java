package con;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
/* loaded from: classes.dex */
public final class AA4ZBBPJq {
    public jvKy1qifN dIocxURUo;
    public Shader tGV7Q6urW;
    public Paint q3BipwRCk = new Paint(7);
    public int J4Ux7ym32 = 3;

    public AA4ZBBPJq() {
        ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
        ksLrMHgEz kslrmhgez2 = KtdRQT1Je.q3BipwRCk;
    }

    public void Bhmn1KIah(Shader shader) {
        this.tGV7Q6urW = shader;
        this.q3BipwRCk.setShader(shader);
    }

    public void CBQ5d1kRq(int i) {
        Paint paint = this.q3BipwRCk;
        oWhsE8IPp owhse8ipp = C2KV764vt.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = C2KV764vt.q3BipwRCk;
        paint.setFilterBitmap(!C2KV764vt.q3BipwRCk(i, 0));
    }

    public float GPLPRo6go() {
        return this.q3BipwRCk.getStrokeWidth();
    }

    public long J4Ux7ym32() {
        return xpuSUT7Gh.tGV7Q6urW(this.q3BipwRCk.getColor());
    }

    public void MzoOEjc4X(int i) {
        Paint.Join join;
        Paint paint = this.q3BipwRCk;
        if (!O4O9M8RBT.q3BipwRCk(i, 0)) {
            if (O4O9M8RBT.q3BipwRCk(i, 2)) {
                join = Paint.Join.BEVEL;
            } else if (O4O9M8RBT.q3BipwRCk(i, 1)) {
                join = Paint.Join.ROUND;
            }
            paint.setStrokeJoin(join);
        }
        join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
    }

    public void PSTqBLTET(int i) {
        this.q3BipwRCk.setStrokeCap(vyxsUqAQM.q3BipwRCk(i, 2) ? Paint.Cap.SQUARE : vyxsUqAQM.q3BipwRCk(i, 1) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
    }

    public void Puu3Rhg4F(float f) {
        this.q3BipwRCk.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public int dIocxURUo() {
        Paint.Cap strokeCap = this.q3BipwRCk.getStrokeCap();
        int i = strokeCap == null ? -1 : bEEiOFPMI.q3BipwRCk[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public float iiGwOFFnr() {
        return this.q3BipwRCk.getStrokeMiter();
    }

    public void ilHKhw3Yw(int i) {
        Paint paint = this.q3BipwRCk;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        paint.setStyle(z ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public int kCA6Zs9sL() {
        Paint.Join strokeJoin = this.q3BipwRCk.getStrokeJoin();
        int i = strokeJoin == null ? -1 : bEEiOFPMI.J4Ux7ym32[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void kmSgne1rO(wgN3F5Nrd wgn3f5nrd) {
        this.q3BipwRCk.setPathEffect(null);
    }

    public void oon79WMrY(long j) {
        this.q3BipwRCk.setColor(xpuSUT7Gh.R2hkbNqWf(j));
    }

    public float q3BipwRCk() {
        return ((float) this.q3BipwRCk.getAlpha()) / 255.0f;
    }

    public int tGV7Q6urW() {
        if (!this.q3BipwRCk.isFilterBitmap()) {
            oWhsE8IPp owhse8ipp = C2KV764vt.q3BipwRCk;
            oWhsE8IPp owhse8ipp2 = C2KV764vt.q3BipwRCk;
            return 0;
        }
        oWhsE8IPp owhse8ipp3 = C2KV764vt.q3BipwRCk;
        oWhsE8IPp owhse8ipp4 = C2KV764vt.q3BipwRCk;
        return 1;
    }

    public void vPSbyrYWX(jvKy1qifN jvky1qifn) {
        this.dIocxURUo = jvky1qifn;
        this.q3BipwRCk.setColorFilter(jvky1qifn == null ? null : jvky1qifn.q3BipwRCk);
    }

    public void yWvV4ePLl(int i) {
        this.J4Ux7ym32 = i;
        Paint paint = this.q3BipwRCk;
        if (Build.VERSION.SDK_INT >= 29) {
            hiSF3PcVv.q3BipwRCk.q3BipwRCk(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(xP6F5SR9v.dXrmkklc8(i)));
        }
    }
}
