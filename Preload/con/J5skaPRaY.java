package con;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class J5skaPRaY implements RecyclerView.LBkrQilnp {
    public final msTbxirqH J4Ux7ym32;
    public final llWJsfBCK dIocxURUo;
    public final double iiGwOFFnr;
    public final double kCA6Zs9sL;
    public final RecyclerView q3BipwRCk;
    public iFKnyAZAM tGV7Q6urW;

    public J5skaPRaY(RecyclerView recyclerView, msTbxirqH mstbxirqh) {
        this.q3BipwRCk = recyclerView;
        this.J4Ux7ym32 = mstbxirqh;
        this.tGV7Q6urW = new iFKnyAZAM(recyclerView.getContext(), new fuuY17ChX(this));
        llWJsfBCK ixWaw2akD = anXlDk6fV.ixWaw2akD(juufjqtjC.nlGCs0NZs);
        this.dIocxURUo = ixWaw2akD;
        Ka0YY9gOW ka0YY9gOW = (Ka0YY9gOW) ixWaw2akD;
        this.kCA6Zs9sL = ((double) ((Number) ka0YY9gOW.getValue()).intValue()) * 0.137d;
        this.iiGwOFFnr = ((double) ((Number) ka0YY9gOW.getValue()).intValue()) * 0.863d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LBkrQilnp
    public void J4Ux7ym32(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.tGV7Q6urW.cAwN510t2(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LBkrQilnp
    public boolean q3BipwRCk(RecyclerView recyclerView, MotionEvent motionEvent) {
        return this.tGV7Q6urW.cAwN510t2(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LBkrQilnp
    public void tGV7Q6urW(boolean z) {
    }
}
