package con;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public class NDdSbKQHH implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView CBQ5d1kRq;
    public final /* synthetic */ rf3cOyxnl kmSgne1rO;

    public NDdSbKQHH(rf3cOyxnl rf3coyxnl, AutoCompleteTextView autoCompleteTextView) {
        this.kmSgne1rO = rf3coyxnl;
        this.CBQ5d1kRq = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.kmSgne1rO.yWvV4ePLl()) {
                this.kmSgne1rO.oon79WMrY = false;
            }
            rf3cOyxnl.GPLPRo6go(this.kmSgne1rO, this.CBQ5d1kRq);
        }
        return false;
    }
}
