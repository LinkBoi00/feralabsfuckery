package con;

import android.graphics.Typeface;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ln76RAJSI implements Runnable {
    public final /* synthetic */ int Bhmn1KIah;
    public final /* synthetic */ TextView CBQ5d1kRq;
    public final /* synthetic */ Typeface kmSgne1rO;

    public ln76RAJSI(mZIyARhC1 mziyarhc1, TextView textView, Typeface typeface, int i) {
        this.CBQ5d1kRq = textView;
        this.kmSgne1rO = typeface;
        this.Bhmn1KIah = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.CBQ5d1kRq.setTypeface(this.kmSgne1rO, this.Bhmn1KIah);
    }
}
