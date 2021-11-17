package con;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
/* loaded from: classes.dex */
public class ac56gvUNR extends ContentFrameLayout {
    public final /* synthetic */ Jg0aTLb6g dXrmkklc8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac56gvUNR(Jg0aTLb6g jg0aTLb6g, Context context) {
        super(context, null);
        this.dXrmkklc8 = jg0aTLb6g;
    }

    @Override // android.view.View, android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.dXrmkklc8.ixWaw2akD(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                Jg0aTLb6g jg0aTLb6g = this.dXrmkklc8;
                jg0aTLb6g.dXrmkklc8(jg0aTLb6g.IytU16YUK(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(C8A1BseZU.q3BipwRCk(getContext(), i));
    }
}
