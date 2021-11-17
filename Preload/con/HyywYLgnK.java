package con;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class HyywYLgnK extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ Context Bhmn1KIah;
    public final /* synthetic */ attbzuWdD PSTqBLTET;
    public final /* synthetic */ MainActivity kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyywYLgnK(MainActivity mainActivity, Context context, attbzuWdD attbzuwdd) {
        super(0);
        this.kmSgne1rO = mainActivity;
        this.Bhmn1KIah = context;
        this.PSTqBLTET = attbzuwdd;
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        String str;
        Context context;
        MainActivity mainActivity = this.kmSgne1rO;
        int i = MainActivity.mUqPm6GBh;
        if (mainActivity.QNqj6nIzv()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.Bhmn1KIah);
            if (!defaultSharedPreferences.getBoolean("longtapHintShown", false)) {
                Pf8Spcrui pf8Spcrui = new Pf8Spcrui(this.kmSgne1rO);
                pf8Spcrui.vPSbyrYWX(this.kmSgne1rO.getString(R.string.longtap_hint_header));
                ((V8gQUs5xA) pf8Spcrui.q3BipwRCk).tGV7Q6urW = R.drawable.ic_round_autorenew_24;
                ((V8gQUs5xA) pf8Spcrui.q3BipwRCk).GPLPRo6go = this.kmSgne1rO.getString(R.string.longtap_hint_body);
                String string = this.kmSgne1rO.getString(17039370);
                u6pX9iZ52 u6px9iz52 = new u6pX9iZ52(defaultSharedPreferences);
                V8gQUs5xA v8gQUs5xA = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
                v8gQUs5xA.Puu3Rhg4F = string;
                v8gQUs5xA.yWvV4ePLl = u6px9iz52;
                pf8Spcrui.yWvV4ePLl();
                return qih4lW99W.q3BipwRCk;
            } else if (!anXlDk6fV.tGV7Q6urW(defaultSharedPreferences.getString("autopreload", ""), this.PSTqBLTET.tGV7Q6urW)) {
                attbzuWdD attbzuwdd = this.PSTqBLTET;
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("autopreload", attbzuwdd.tGV7Q6urW);
                edit.apply();
                context = this.Bhmn1KIah;
                str = this.kmSgne1rO.getString(R.string.will_be_preloaded, new Object[]{this.PSTqBLTET.J4Ux7ym32});
            } else {
                SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
                edit2.putString("autopreload", "");
                edit2.apply();
                context = this.Bhmn1KIah;
                str = this.kmSgne1rO.getString(R.string.will_not_be_preloaded, new Object[]{this.PSTqBLTET.J4Ux7ym32});
            }
        } else {
            context = this.Bhmn1KIah;
            str = this.kmSgne1rO.getString(R.string.get_pro_log);
        }
        anXlDk6fV.sk5s77z6Q(context, str);
        return qih4lW99W.q3BipwRCk;
    }
}
