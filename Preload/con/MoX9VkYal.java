package con;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class MoX9VkYal<S> extends rPEfIZQkt {
    public RAxgJWiGj INnK5Rew6;
    public wROT9IZc9 KBYw84i3W;
    public int kktL0P5MG;

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends fUfhthdYl {
        public RG2GI7LDp() {
        }

        @Override // con.fUfhthdYl
        public void q3BipwRCk(Object obj) {
            Iterator it = MoX9VkYal.this.XYT7vJqNO.iterator();
            while (it.hasNext()) {
                ((fUfhthdYl) it.next()).q3BipwRCk(obj);
            }
        }
    }

    @Override // con.UxHHqhbTP
    public View AqaWJg0b4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.KBYw84i3W.Puu3Rhg4F(layoutInflater.cloneInContext(new ContextThemeWrapper(Puu3Rhg4F(), this.kktL0P5MG)), viewGroup, bundle, this.INnK5Rew6, new RG2GI7LDp());
    }

    @Override // con.UxHHqhbTP
    public void nlGCs0NZs(Bundle bundle) {
        super.nlGCs0NZs(bundle);
        if (bundle == null) {
            bundle = this.ilHKhw3Yw;
        }
        this.kktL0P5MG = bundle.getInt("THEME_RES_ID_KEY");
        this.KBYw84i3W = (wROT9IZc9) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.INnK5Rew6 = (RAxgJWiGj) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // con.UxHHqhbTP
    public void o4LF8RkoQ(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.kktL0P5MG);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.KBYw84i3W);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.INnK5Rew6);
    }
}
