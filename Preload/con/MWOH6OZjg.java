package con;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.RG2GI7LDp;
/* loaded from: classes.dex */
public class MWOH6OZjg extends ViewOutlineProvider {
    public final /* synthetic */ Chip q3BipwRCk;

    public MWOH6OZjg(Chip chip) {
        this.q3BipwRCk = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        RG2GI7LDp rG2GI7LDp = this.q3BipwRCk.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
