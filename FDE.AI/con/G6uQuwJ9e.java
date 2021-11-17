package con;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class G6uQuwJ9e extends RecyclerView.DrTf1eLw4 {
    public final /* synthetic */ gBRio1gPW q3BipwRCk;

    public G6uQuwJ9e(gBRio1gPW gbrio1gpw) {
        this.q3BipwRCk = gbrio1gpw;
        AepEH275c.kCA6Zs9sL();
        AepEH275c.kCA6Zs9sL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.DrTf1eLw4
    public void dIocxURUo(Canvas canvas, RecyclerView recyclerView, RecyclerView.kvFwRYSUX kvfwrysux) {
        if ((recyclerView.getAdapter() instanceof jlGuDYsZo) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            jlGuDYsZo jlgudyszo = (jlGuDYsZo) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            Iterator it = this.q3BipwRCk.KBYw84i3W.kCA6Zs9sL().iterator();
            if (it.hasNext()) {
                K6PL0z3I0.q3BipwRCk(it.next());
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }
}
