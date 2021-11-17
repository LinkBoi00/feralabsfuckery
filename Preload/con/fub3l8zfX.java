package con;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.RG2GI7LDp;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class fub3l8zfX extends Ct2GXtyrO {
    public final /* synthetic */ TeoeEf1aF Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fub3l8zfX(TeoeEf1aF teoeEf1aF, Context context, RG2GI7LDp rG2GI7LDp, View view, boolean z) {
        super(context, rG2GI7LDp, view, z, R.attr.actionOverflowMenuStyle, 0);
        this.Bhmn1KIah = teoeEf1aF;
        this.GPLPRo6go = 8388613;
        dIocxURUo(teoeEf1aF.mUqPm6GBh);
    }

    @Override // con.Ct2GXtyrO
    public void tGV7Q6urW() {
        switch (this.kmSgne1rO) {
            case 0:
                this.Bhmn1KIah.qFBXIgpia = null;
                super.tGV7Q6urW();
                return;
            default:
                RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah.Bhmn1KIah;
                if (rG2GI7LDp != null) {
                    rG2GI7LDp.tGV7Q6urW(true);
                }
                this.Bhmn1KIah.CpG0imbht = null;
                super.tGV7Q6urW();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fub3l8zfX(TeoeEf1aF teoeEf1aF, Context context, anclinfG8 anclinfg8, View view) {
        super(context, anclinfg8, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.Bhmn1KIah = teoeEf1aF;
        if (!anclinfg8.iMyQMM6Qj.GPLPRo6go()) {
            View view2 = teoeEf1aF.dXrmkklc8;
            this.iiGwOFFnr = view2 == null ? (View) teoeEf1aF.Eeka1udhb : view2;
        }
        dIocxURUo(teoeEf1aF.mUqPm6GBh);
    }
}
