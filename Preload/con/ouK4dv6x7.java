package con;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class ouK4dv6x7 implements View.OnTouchListener {
    public final int Bhmn1KIah;
    public final Dialog CBQ5d1kRq;
    public final int PSTqBLTET;
    public final int kmSgne1rO;

    public ouK4dv6x7(Dialog dialog, Rect rect) {
        this.CBQ5d1kRq = dialog;
        this.kmSgne1rO = rect.left;
        this.Bhmn1KIah = rect.top;
        this.PSTqBLTET = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.kmSgne1rO;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.Bhmn1KIah;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.PSTqBLTET;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.CBQ5d1kRq.onTouchEvent(obtain);
    }
}
