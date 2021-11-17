package con;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* loaded from: classes.dex */
public class fWAISGlrC {
    public boolean Bhmn1KIah;
    public float CBQ5d1kRq;
    public int Eeka1udhb;
    public final Paint J4Ux7ym32;
    public Path PSTqBLTET;
    public int RG6kpfv3v;
    public final Paint dIocxURUo;
    public float ilHKhw3Yw;
    public float kmSgne1rO;
    public int oon79WMrY;
    public int qVUwofr5s;
    public final Paint tGV7Q6urW;
    public float vPSbyrYWX;
    public int[] yWvV4ePLl;
    public final RectF q3BipwRCk = new RectF();
    public float kCA6Zs9sL = 0.0f;
    public float iiGwOFFnr = 0.0f;
    public float GPLPRo6go = 0.0f;
    public float Puu3Rhg4F = 5.0f;
    public float MzoOEjc4X = 1.0f;
    public int dXrmkklc8 = 255;

    public fWAISGlrC() {
        Paint paint = new Paint();
        this.J4Ux7ym32 = paint;
        Paint paint2 = new Paint();
        this.tGV7Q6urW = paint2;
        Paint paint3 = new Paint();
        this.dIocxURUo = paint3;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public void J4Ux7ym32(boolean z) {
        if (this.Bhmn1KIah != z) {
            this.Bhmn1KIah = z;
        }
    }

    public void q3BipwRCk(int i) {
        this.oon79WMrY = i;
        this.RG6kpfv3v = this.yWvV4ePLl[i];
    }
}
