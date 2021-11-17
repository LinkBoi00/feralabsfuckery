package con;

import android.widget.AbsListView;
/* loaded from: classes.dex */
public class vLXhVaRma implements AbsListView.OnScrollListener {
    public final /* synthetic */ uBkGbmfhd q3BipwRCk;

    public vLXhVaRma(uBkGbmfhd ubkgbmfhd) {
        this.q3BipwRCk = ubkgbmfhd;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        boolean z = true;
        if (i == 1) {
            if (this.q3BipwRCk.vNtjxmzUM.getInputMethodMode() != 2) {
                z = false;
            }
            if (!z && this.q3BipwRCk.vNtjxmzUM.getContentView() != null) {
                uBkGbmfhd ubkgbmfhd = this.q3BipwRCk;
                ubkgbmfhd.nlGCs0NZs.removeCallbacks(ubkgbmfhd.cAwN510t2);
                this.q3BipwRCk.cAwN510t2.run();
            }
        }
    }
}
