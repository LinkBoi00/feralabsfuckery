package con;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class V5vZdt0Bu extends DfseMYa7G {
    public final /* synthetic */ int J4Ux7ym32;
    public final /* synthetic */ mZIyARhC1 dIocxURUo;
    public final /* synthetic */ int q3BipwRCk;
    public final /* synthetic */ WeakReference tGV7Q6urW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5vZdt0Bu(mZIyARhC1 mziyarhc1, int i, int i2, WeakReference weakReference) {
        super(0);
        this.dIocxURUo = mziyarhc1;
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = weakReference;
    }

    @Override // con.DfseMYa7G
    public void iiGwOFFnr(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.q3BipwRCk) != -1) {
            typeface = Typeface.create(typeface, i, (this.J4Ux7ym32 & 2) != 0);
        }
        mZIyARhC1 mziyarhc1 = this.dIocxURUo;
        WeakReference weakReference = this.tGV7Q6urW;
        if (mziyarhc1.kmSgne1rO) {
            mziyarhc1.CBQ5d1kRq = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (mN6fklC4R.J4Ux7ym32(textView)) {
                    textView.post(new ln76RAJSI(mziyarhc1, textView, typeface, mziyarhc1.oon79WMrY));
                } else {
                    textView.setTypeface(typeface, mziyarhc1.oon79WMrY);
                }
            }
        }
    }

    @Override // con.DfseMYa7G
    public void kCA6Zs9sL(int i) {
    }
}
