package con;

import android.app.Activity;
import android.content.Intent;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import me.rosuh.filepicker.FilePickerActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$SelectFileButton$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class XaTXMCyTz extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ MainActivity MzoOEjc4X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XaTXMCyTz(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        XaTXMCyTz xaTXMCyTz = new XaTXMCyTz(this.MzoOEjc4X, (Way959ade) obj2);
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        xaTXMCyTz.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new XaTXMCyTz(this.MzoOEjc4X, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Activity activity;
        anXlDk6fV.IytU16YUK(obj);
        MainActivity mainActivity = this.MzoOEjc4X;
        int i = MainActivity.mUqPm6GBh;
        Objects.requireNonNull(mainActivity);
        ey4Vf0Eiu q3BipwRCk = HZDtN0XJv.q3BipwRCk(mainActivity);
        q3BipwRCk.kCA6Zs9sL = "Internal Storage";
        q3BipwRCk.iiGwOFFnr = "STORAGE_CUSTOM_ROOT_PATH";
        q3BipwRCk.GPLPRo6go = "/storage/emulated/0";
        int i2 = mainActivity.QNqj6nIzv() ? 50 : 1;
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        q3BipwRCk.dIocxURUo = i2;
        q3BipwRCk.J4Ux7ym32 = true;
        q3BipwRCk.tGV7Q6urW = !mainActivity.QNqj6nIzv();
        String string = mainActivity.getString(R.string.select_all);
        String string2 = mainActivity.getString(R.string.unselect_all);
        String string3 = mainActivity.getString(R.string.confirm_preload);
        String string4 = mainActivity.getString(R.string.empty_file_picker);
        q3BipwRCk.oon79WMrY = string;
        q3BipwRCk.vPSbyrYWX = string2;
        q3BipwRCk.CBQ5d1kRq = R.string.has_selected;
        q3BipwRCk.kmSgne1rO = string3;
        q3BipwRCk.Bhmn1KIah = R.string.max_select_count_tips;
        q3BipwRCk.PSTqBLTET = string4;
        HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
        WeakReference weakReference = HZDtN0XJv.J4Ux7ym32;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        Intent intent = new Intent(activity, FilePickerActivity.class);
        if (activity != null) {
            activity.startActivityForResult(intent, 10401);
        }
        return qih4lW99W.q3BipwRCk;
    }
}
