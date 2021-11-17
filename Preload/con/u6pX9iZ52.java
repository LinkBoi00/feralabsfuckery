package con;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final /* synthetic */ class u6pX9iZ52 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ Object kmSgne1rO;

    public /* synthetic */ u6pX9iZ52(SharedPreferences sharedPreferences) {
        this.CBQ5d1kRq = 3;
        this.kmSgne1rO = sharedPreferences;
    }

    public /* synthetic */ u6pX9iZ52(MainActivity mainActivity, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.kmSgne1rO = mainActivity;
        } else {
            this.kmSgne1rO = mainActivity;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.CBQ5d1kRq) {
            case 0:
                int i2 = MainActivity.mUqPm6GBh;
                ((MainActivity) this.kmSgne1rO).finish();
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) this.kmSgne1rO;
                int i3 = MainActivity.mUqPm6GBh;
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(mainActivity).edit();
                edit.putBoolean("eulaAccepted", true);
                edit.apply();
                mainActivity.dXrmkklc8 = tzR8IMGfw.q3BipwRCk.vPSbyrYWX();
                mainActivity.TyB1UUd72();
                return;
            case 2:
                MainActivity mainActivity2 = (MainActivity) this.kmSgne1rO;
                anXlDk6fV.sk5s77z6Q(mainActivity2, mainActivity2.getString(R.string.nodoze));
                Intent intent = new Intent();
                intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                mainActivity2.startActivity(intent);
                mainActivity2.finish();
                return;
            default:
                SharedPreferences.Editor edit2 = ((SharedPreferences) this.kmSgne1rO).edit();
                edit2.putBoolean("longtapHintShown", true);
                edit2.apply();
                return;
        }
    }
}
