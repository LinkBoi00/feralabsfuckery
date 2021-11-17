package con;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public class G9VdDqs1M {
    public View q3BipwRCk;

    public G9VdDqs1M() {
    }

    public boolean q3BipwRCk(iFKnyAZAM ifknyazam, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                ifknyazam.J4Ux7ym32();
                InputContentInfo inputContentInfo = (InputContentInfo) ((TJkYEZky4) ifknyazam.kmSgne1rO).PSTqBLTET();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipData clipData = new ClipData(ifknyazam.kmSgne1rO(), new ClipData.Item(ifknyazam.MzoOEjc4X()));
        baMQ0cfN8 ifknyazam2 = Build.VERSION.SDK_INT >= 31 ? new iFKnyAZAM(clipData, 2, 12) : new tXvnR1bb6(clipData, 2);
        ifknyazam2.vPSbyrYWX(ifknyazam.kCA6Zs9sL());
        ifknyazam2.oon79WMrY(bundle);
        return IuQbWntsc.CBQ5d1kRq(this.q3BipwRCk, ifknyazam2.dIocxURUo()) == null;
    }

    public G9VdDqs1M(View view) {
        this.q3BipwRCk = view;
    }
}
