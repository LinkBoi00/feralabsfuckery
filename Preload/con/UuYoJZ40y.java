package con;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.util.Collections;
/* loaded from: classes.dex */
public final class UuYoJZ40y extends Wk9bO57s4 implements kkcQgCx5G {
    public final /* synthetic */ MainActivity Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UuYoJZ40y(MainActivity mainActivity, int i) {
        super(2);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = mainActivity;
            super(2);
        } else if (i == 2) {
            this.Bhmn1KIah = mainActivity;
            super(2);
        } else if (i == 3) {
            this.Bhmn1KIah = mainActivity;
            super(2);
        } else if (i != 4) {
            this.Bhmn1KIah = mainActivity;
        } else {
            this.Bhmn1KIah = mainActivity;
            super(2);
        }
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk((rJ0s9PfCL) obj, ((Number) obj2).intValue());
                return qih4lW99W.q3BipwRCk;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                String str = (String) obj2;
                if (anXlDk6fV.tGV7Q6urW(str, "preloaded")) {
                    MainActivity.vNtjxmzUM(this.Bhmn1KIah, sharedPreferences.getBoolean("preloaded", false));
                }
                if (anXlDk6fV.tGV7Q6urW(str, "preloaded_apps")) {
                    MainActivity mainActivity = this.Bhmn1KIah;
                    ((prCJwNx2x) mainActivity.iMyQMM6Qj).CBQ5d1kRq(PreferenceManager.getDefaultSharedPreferences(mainActivity).getStringSet("preloaded_apps", bSc306J1d.CBQ5d1kRq));
                }
                if (anXlDk6fV.tGV7Q6urW(str, "autopreload")) {
                    MainActivity mainActivity2 = this.Bhmn1KIah;
                    ((prCJwNx2x) mainActivity2.cAwN510t2).CBQ5d1kRq(Collections.singleton(PreferenceManager.getDefaultSharedPreferences(mainActivity2).getString("autopreload", "")));
                }
                return qih4lW99W.q3BipwRCk;
            case 2:
                q3BipwRCk((rJ0s9PfCL) obj, ((Number) obj2).intValue());
                return qih4lW99W.q3BipwRCk;
            case 3:
                q3BipwRCk((rJ0s9PfCL) obj, ((Number) obj2).intValue());
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk((rJ0s9PfCL) obj, ((Number) obj2).intValue());
                return qih4lW99W.q3BipwRCk;
        }
    }

    public void q3BipwRCk(rJ0s9PfCL rj0s9pfcl, int i) {
        wpXpbWG1J wpxpbwg1j;
        String str;
        boolean z;
        switch (this.kmSgne1rO) {
            case 0:
                if (((i & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j2 = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j2.i8XZMQc6Z()) {
                        wpxpbwg1j2.igRQEZxnW();
                        return;
                    }
                }
                if (!MainActivity.CpG0imbht(this.Bhmn1KIah)) {
                    TmNg4OOhj tmNg4OOhj = new TmNg4OOhj(this.Bhmn1KIah, 0);
                    JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
                    a6VKBsrxC.q3BipwRCk(tmNg4OOhj, null, false, null, JqVWgnx1C.GPLPRo6go, rj0s9pfcl, 24576, 14);
                    return;
                }
                return;
            case 1:
            default:
                if (((i & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j3 = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j3.i8XZMQc6Z()) {
                        wpxpbwg1j3.igRQEZxnW();
                        return;
                    }
                }
                MainActivity mainActivity = this.Bhmn1KIah;
                MainActivity mainActivity2 = this.Bhmn1KIah;
                u51fgFYkV.q3BipwRCk(new BaB9IKBYw[]{mainActivity.ixWaw2akD.J4Ux7ym32(Boolean.valueOf(mainActivity.dXrmkklc8)), mainActivity2.sk5s77z6Q.J4Ux7ym32(Boolean.valueOf(mainActivity2.QNqj6nIzv()))}, xpuSUT7Gh.qFBXIgpia(rj0s9pfcl, -819890137, true, new UuYoJZ40y(this.Bhmn1KIah, 3)), rj0s9pfcl, 56);
                return;
            case 2:
                if (((i & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j4 = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j4.i8XZMQc6Z()) {
                        wpxpbwg1j4.igRQEZxnW();
                        return;
                    }
                }
                MainActivity mainActivity3 = this.Bhmn1KIah;
                hOY2Rgtej hoy2rgtej = KApR71V3i.J4Ux7ym32;
                Object obj = G7WvUK4mQ.q3BipwRCk;
                MainActivity.dfpT1j18n(mainActivity3, ((Context) ((wpXpbWG1J) rj0s9pfcl).oon79WMrY(hoy2rgtej)).getPackageManager(), rj0s9pfcl, 72);
                return;
            case 3:
                if (((i & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j5 = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j5.i8XZMQc6Z()) {
                        wpxpbwg1j5.igRQEZxnW();
                        return;
                    }
                }
                MainActivity mainActivity4 = this.Bhmn1KIah;
                String o4LF8RkoQ = ODug2UCW1.o4LF8RkoQ(R.string.app_name, rj0s9pfcl);
                MainActivity mainActivity5 = this.Bhmn1KIah;
                int i2 = MainActivity.mUqPm6GBh;
                if (!mainActivity5.QNqj6nIzv()) {
                    wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
                    wpxpbwg1j.zHl31GGXU(1472914378);
                    str = ODug2UCW1.o4LF8RkoQ(R.string.info_section, rj0s9pfcl) + "\n" + ODug2UCW1.o4LF8RkoQ(R.string.get_pro_log, rj0s9pfcl);
                } else {
                    wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
                    wpxpbwg1j.zHl31GGXU(1472914657);
                    str = ODug2UCW1.o4LF8RkoQ(R.string.info_section, rj0s9pfcl);
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                MainActivity.NyWTwPF6V(mainActivity4, o4LF8RkoQ + " v3.0 | " + str);
                MainActivity mainActivity6 = this.Bhmn1KIah;
                wpXpbWG1J wpxpbwg1j6 = (wpXpbWG1J) rj0s9pfcl;
                wpxpbwg1j6.zHl31GGXU(1472914812);
                if (this.Bhmn1KIah.QNqj6nIzv() && (Build.VERSION.SDK_INT < 30 || this.Bhmn1KIah.dXrmkklc8)) {
                    hOY2Rgtej hoy2rgtej2 = KApR71V3i.q3BipwRCk;
                    Object obj2 = G7WvUK4mQ.q3BipwRCk;
                    if (((Configuration) wpxpbwg1j6.oon79WMrY(hoy2rgtej2)).orientation == 2) {
                        z = true;
                        wpxpbwg1j6.ilHKhw3Yw(false);
                        ((prCJwNx2x) mainActivity6.WaUP0CF08).CBQ5d1kRq(Boolean.valueOf(z));
                        int i3 = BgIsSUB3d.Puu3Rhg4F;
                        s9KPlorLI s9kplorli = PV8WgmiL7.J4Ux7ym32;
                        Object obj3 = G7WvUK4mQ.q3BipwRCk;
                        d3W76zKHG.q3BipwRCk(s9kplorli, null, ((grAfiZycg) wpxpbwg1j6.oon79WMrY(BPBXLXpsE.q3BipwRCk)).q3BipwRCk(), 0, 0.0f, 0.0f, xpuSUT7Gh.qFBXIgpia(rj0s9pfcl, -819903364, true, new UuYoJZ40y(this.Bhmn1KIah, 2)), rj0s9pfcl, 12582918, 122);
                        return;
                    }
                }
                z = false;
                wpxpbwg1j6.ilHKhw3Yw(false);
                ((prCJwNx2x) mainActivity6.WaUP0CF08).CBQ5d1kRq(Boolean.valueOf(z));
                int i32 = BgIsSUB3d.Puu3Rhg4F;
                s9KPlorLI s9kplorli2 = PV8WgmiL7.J4Ux7ym32;
                Object obj32 = G7WvUK4mQ.q3BipwRCk;
                d3W76zKHG.q3BipwRCk(s9kplorli2, null, ((grAfiZycg) wpxpbwg1j6.oon79WMrY(BPBXLXpsE.q3BipwRCk)).q3BipwRCk(), 0, 0.0f, 0.0f, xpuSUT7Gh.qFBXIgpia(rj0s9pfcl, -819903364, true, new UuYoJZ40y(this.Bhmn1KIah, 2)), rj0s9pfcl, 12582918, 122);
                return;
        }
    }
}
