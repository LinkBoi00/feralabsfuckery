package con;

import android.content.Context;
import android.view.ViewGroup;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class BVIwKl3Ar extends ViewGroup {
    public final List Bhmn1KIah;
    public final List kmSgne1rO;
    public final int CBQ5d1kRq = 5;
    public final PlegqbMSA PSTqBLTET = new PlegqbMSA(2);
    public int MzoOEjc4X = 1;

    public BVIwKl3Ar(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.kmSgne1rO = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.Bhmn1KIah = arrayList2;
        setClipChildren(false);
        R30OeZHHv r30OeZHHv = new R30OeZHHv(context);
        addView(r30OeZHHv);
        arrayList.add(r30OeZHHv);
        arrayList2.add(r30OeZHHv);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
