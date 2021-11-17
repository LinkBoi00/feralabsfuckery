package con;

import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public class Fw7Av8qoW implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ uBkGbmfhd CBQ5d1kRq;

    public Fw7Av8qoW(uBkGbmfhd ubkgbmfhd) {
        this.CBQ5d1kRq = ubkgbmfhd;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        wRt60CcGM wrt60ccgm;
        if (i != -1 && (wrt60ccgm = this.CBQ5d1kRq.Bhmn1KIah) != null) {
            wrt60ccgm.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
