package con;

import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class xoW3gOxG8 {
    public int J4Ux7ym32;
    public int dIocxURUo;
    public int kCA6Zs9sL;
    public final View q3BipwRCk;
    public int tGV7Q6urW;

    public xoW3gOxG8(View view) {
        this.q3BipwRCk = view;
    }

    public void q3BipwRCk() {
        View view = this.q3BipwRCk;
        int top = this.dIocxURUo - (view.getTop() - this.J4Ux7ym32);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        view.offsetTopAndBottom(top);
        View view2 = this.q3BipwRCk;
        view2.offsetLeftAndRight(this.kCA6Zs9sL - (view2.getLeft() - this.tGV7Q6urW));
    }
}
