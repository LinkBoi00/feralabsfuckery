package con;

import android.app.Activity;
import android.content.res.Resources;
import com.feravolt.preload.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ey4Vf0Eiu {
    public boolean J4Ux7ym32;
    public String PSTqBLTET;
    public String kCA6Zs9sL;
    public String kmSgne1rO;
    public String oon79WMrY;
    public String vPSbyrYWX;
    public final llWJsfBCK q3BipwRCk = anXlDk6fV.ixWaw2akD(SFccbMiBr.iMyQMM6Qj);
    public boolean tGV7Q6urW = true;
    public int dIocxURUo = Integer.MAX_VALUE;
    public String iiGwOFFnr = "STORAGE_EXTERNAL_STORAGE";
    public String GPLPRo6go = "";
    public final llWJsfBCK Puu3Rhg4F = anXlDk6fV.ixWaw2akD(VSocs6HGb.NyWTwPF6V);
    public int yWvV4ePLl = R.style.FilePickerThemeRail;
    public int CBQ5d1kRq = R.string.file_picker_selected_count;
    public int Bhmn1KIah = R.string.max_select_count_tips;

    public ey4Vf0Eiu(HZDtN0XJv hZDtN0XJv) {
        Resources resources = ((Activity) HZDtN0XJv.J4Ux7ym32.get()).getResources();
        this.kCA6Zs9sL = resources.getString(R.string.file_picker_tv_sd_card);
        this.oon79WMrY = resources.getString(R.string.file_picker_tv_select_all);
        this.vPSbyrYWX = resources.getString(R.string.file_picker_tv_deselect_all);
        this.kmSgne1rO = resources.getString(R.string.file_picker_tv_select_done);
        this.PSTqBLTET = resources.getString(R.string.empty_list_tips_file_picker);
    }

    public final xo03SE02t J4Ux7ym32() {
        return (xo03SE02t) this.Puu3Rhg4F.getValue();
    }

    public final void q3BipwRCk() {
        ((ArrayList) this.q3BipwRCk.getValue()).clear();
        J4Ux7ym32().Puu3Rhg4F().clear();
    }
}
