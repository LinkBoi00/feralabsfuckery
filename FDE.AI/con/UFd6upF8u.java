package con;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public class UFd6upF8u implements View.OnTouchListener {
    public final /* synthetic */ uBkGbmfhd CBQ5d1kRq;

    public UFd6upF8u(uBkGbmfhd ubkgbmfhd) {
        this.CBQ5d1kRq = ubkgbmfhd;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (popupWindow = this.CBQ5d1kRq.vNtjxmzUM) != null && popupWindow.isShowing() && x >= 0 && x < this.CBQ5d1kRq.vNtjxmzUM.getWidth() && y >= 0 && y < this.CBQ5d1kRq.vNtjxmzUM.getHeight()) {
            uBkGbmfhd ubkgbmfhd = this.CBQ5d1kRq;
            ubkgbmfhd.nlGCs0NZs.postDelayed(ubkgbmfhd.cAwN510t2, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            uBkGbmfhd ubkgbmfhd2 = this.CBQ5d1kRq;
            ubkgbmfhd2.nlGCs0NZs.removeCallbacks(ubkgbmfhd2.cAwN510t2);
            return false;
        }
    }
}
