package con;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class XquAaIjWL {
    public avTFec6Zj iiGwOFFnr;
    public WeakReference kCA6Zs9sL;
    public float tGV7Q6urW;
    public final TextPaint q3BipwRCk = new TextPaint(1);
    public final SQ4Lz5bqj J4Ux7ym32 = new LklHNCuSp(this);
    public boolean dIocxURUo = true;

    public XquAaIjWL(dyQHhJCgE dyqhhjcge) {
        this.kCA6Zs9sL = new WeakReference(null);
        this.kCA6Zs9sL = new WeakReference(dyqhhjcge);
    }

    public float q3BipwRCk(String str) {
        if (!this.dIocxURUo) {
            return this.tGV7Q6urW;
        }
        float measureText = str == null ? 0.0f : this.q3BipwRCk.measureText((CharSequence) str, 0, str.length());
        this.tGV7Q6urW = measureText;
        this.dIocxURUo = false;
        return measureText;
    }
}
