package con;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Pf8Spcrui extends I6sO15l0X {
    public final Rect dIocxURUo;
    public Drawable tGV7Q6urW;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Pf8Spcrui(android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Pf8Spcrui.<init>(android.content.Context):void");
    }

    @Override // con.I6sO15l0X
    public I6sO15l0X GPLPRo6go(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        super.GPLPRo6go(listAdapter, i, onClickListener);
        return this;
    }

    @Override // con.I6sO15l0X
    public I6sO15l0X Puu3Rhg4F(CharSequence charSequence) {
        ((V8gQUs5xA) this.q3BipwRCk).kCA6Zs9sL = charSequence;
        return this;
    }

    @Override // con.I6sO15l0X
    public dF3gF5M3i q3BipwRCk() {
        dF3gF5M3i q3BipwRCk = super.q3BipwRCk();
        Window window = q3BipwRCk.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.tGV7Q6urW;
        if (drawable instanceof dOSsQaJVg) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            ((dOSsQaJVg) drawable).PSTqBLTET(mJLaJepZo.yWvV4ePLl(decorView));
        }
        Drawable drawable2 = this.tGV7Q6urW;
        Rect rect = this.dIocxURUo;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ouK4dv6x7(q3BipwRCk, this.dIocxURUo));
        return q3BipwRCk;
    }

    public Pf8Spcrui vPSbyrYWX(CharSequence charSequence) {
        ((V8gQUs5xA) this.q3BipwRCk).kCA6Zs9sL = charSequence;
        return this;
    }
}
