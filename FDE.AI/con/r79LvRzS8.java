package con;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class r79LvRzS8 extends FrameLayout implements GsWcrrhpK {
    public final CollapsibleActionView CBQ5d1kRq;

    public r79LvRzS8(View view) {
        super(view.getContext());
        this.CBQ5d1kRq = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // con.GsWcrrhpK
    public void dIocxURUo() {
        this.CBQ5d1kRq.onActionViewExpanded();
    }

    @Override // con.GsWcrrhpK
    public void kCA6Zs9sL() {
        this.CBQ5d1kRq.onActionViewCollapsed();
    }
}
