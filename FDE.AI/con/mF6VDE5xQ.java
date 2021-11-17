package con;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class mF6VDE5xQ extends RecyclerView.wnbPPCp4x {
    public final /* synthetic */ isrYs6b4I q3BipwRCk;

    public mF6VDE5xQ(isrYs6b4I isrys6b4i) {
        this.q3BipwRCk = isrys6b4i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wnbPPCp4x
    public void J4Ux7ym32(RecyclerView recyclerView, int i, int i2) {
        isrYs6b4I isrys6b4i = this.q3BipwRCk;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = isrys6b4i.Eeka1udhb.computeVerticalScrollRange();
        int i3 = isrys6b4i.qVUwofr5s;
        isrys6b4i.dXrmkklc8 = computeVerticalScrollRange - i3 > 0 && i3 >= isrys6b4i.q3BipwRCk;
        int computeHorizontalScrollRange = isrys6b4i.Eeka1udhb.computeHorizontalScrollRange();
        int i4 = isrys6b4i.ilHKhw3Yw;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= isrys6b4i.q3BipwRCk;
        isrys6b4i.RG6kpfv3v = z;
        boolean z2 = isrys6b4i.dXrmkklc8;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                isrys6b4i.CBQ5d1kRq = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                isrys6b4i.vPSbyrYWX = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (isrys6b4i.RG6kpfv3v) {
                float f2 = (float) computeHorizontalScrollOffset;
                float f3 = (float) i4;
                isrys6b4i.PSTqBLTET = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                isrys6b4i.Bhmn1KIah = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = isrys6b4i.ixWaw2akD;
            if (i5 == 0 || i5 == 1) {
                isrys6b4i.oon79WMrY(1);
            }
        } else if (isrys6b4i.ixWaw2akD != 0) {
            isrys6b4i.oon79WMrY(0);
        }
    }
}
