package con;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.util.List;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$preloadThings$2$1", f = "MainActivity.kt", l = {962, 966, 968, 970, 971, 972, 974, 976}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aweKky1Hz extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ List Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ MainActivity RG6kpfv3v;
    public final /* synthetic */ int dXrmkklc8;
    public Object ilHKhw3Yw;
    public final /* synthetic */ String ixWaw2akD;
    public int qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aweKky1Hz(List list, int i, MainActivity mainActivity, String str, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = list;
        this.dXrmkklc8 = i;
        this.RG6kpfv3v = mainActivity;
        this.ixWaw2akD = str;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new aweKky1Hz(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new aweKky1Hz(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        int i;
        MainActivity mainActivity;
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb;
        MainActivity mainActivity2;
        int i2;
        MainActivity mainActivity3;
        Object obj2;
        Object obj3;
        Object obj4;
        String str5;
        String str6;
        YuSxiExwK yuSxiExwK;
        String EBQXiIPmm;
        String str7;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i3;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        switch (this.qVUwofr5s) {
            case 0:
                anXlDk6fV.IytU16YUK(obj);
                if (!this.Eeka1udhb.isEmpty()) {
                    i3 = this.dXrmkklc8;
                    YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
                    this.MzoOEjc4X = i3;
                    this.qVUwofr5s = 1;
                    obj8 = yuSxiExwK2.q3BipwRCk(this);
                    if (obj8 == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    if (i3 >= ((Number) obj8).intValue()) {
                        ApplicationInfo applicationInfo = this.RG6kpfv3v.getApplicationInfo();
                        str6 = UexvVay3o.q3BipwRCk(applicationInfo == null ? null : applicationInfo.nativeLibraryDir, KYuHUB7GA.q3BipwRCk("L2xpYnZtdG91Y2guc28="));
                        this.ilHKhw3Yw = str6;
                        this.qVUwofr5s = 2;
                        obj7 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.TyB1UUd72(this.Eeka1udhb), this);
                        if (obj7 == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        str5 = (String) obj7;
                        if (!(str5.length() != 0) || r6NbD4wnj.NyWTwPF6V(str5, "0 M/s", true)) {
                            this.ilHKhw3Yw = str6;
                            this.qVUwofr5s = 3;
                            obj6 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.o4LF8RkoQ(this.Eeka1udhb), this);
                            if (obj6 == kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            str5 = (String) obj6;
                        }
                        if (!(str5.length() == 0) || r6NbD4wnj.NyWTwPF6V(str5, "0 M/s", true)) {
                            this.ilHKhw3Yw = str6;
                            this.qVUwofr5s = 4;
                            obj5 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                            if (obj5 == kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            str5 = (String) obj5;
                        }
                        yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                        EBQXiIPmm = wkFJfVmcv.EBQXiIPmm(this.Eeka1udhb, " ", null, null, 0, null, null, 62);
                        str7 = this.ixWaw2akD;
                        this.ilHKhw3Yw = str5;
                        this.qVUwofr5s = 5;
                        if (yuSxiExwK.J4Ux7ym32(str6, false, EBQXiIPmm, str7, this) != kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        str2 = str5;
                        this.ilHKhw3Yw = str2;
                        this.qVUwofr5s = 6;
                        obj4 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.TyB1UUd72(this.Eeka1udhb), this);
                        if (obj4 == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                        str = (String) obj4;
                        if (!(str.length() == 0) || r6NbD4wnj.NyWTwPF6V(str, "0 M/s", true)) {
                            this.ilHKhw3Yw = str2;
                            this.qVUwofr5s = 7;
                            obj3 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.o4LF8RkoQ(this.Eeka1udhb), this);
                            if (obj3 == kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            str = (String) obj3;
                        }
                        if (!(str.length() != 0) || r6NbD4wnj.NyWTwPF6V(str, "0 M/s", true)) {
                            this.ilHKhw3Yw = str2;
                            this.qVUwofr5s = 8;
                            obj2 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                            if (obj2 == kbkjsqcsl) {
                                return kbkjsqcsl;
                            }
                            str = (String) obj2;
                        }
                        MainActivity mainActivity4 = this.RG6kpfv3v;
                        MainActivity.NyWTwPF6V(mainActivity4, mainActivity4.getString(R.string.preloaded));
                        if ((str.length() > 0) || r6NbD4wnj.NyWTwPF6V(str, "0 M/s", true) || r6NbD4wnj.NyWTwPF6V(str, str2, true)) {
                            mainActivity2 = this.RG6kpfv3v;
                            str3 = MainActivity.cAwN510t2(mainActivity2);
                            str4 = this.RG6kpfv3v.getString(R.string.speed_fail);
                            sb = new StringBuilder();
                        } else {
                            MainActivity mainActivity5 = this.RG6kpfv3v;
                            String cAwN510t2 = MainActivity.cAwN510t2(mainActivity5);
                            String string = this.RG6kpfv3v.getString(R.string.speed_before);
                            ((prCJwNx2x) mainActivity5.i8XZMQc6Z).CBQ5d1kRq(cAwN510t2 + string + " " + str2);
                            MainActivity mainActivity6 = this.RG6kpfv3v;
                            String cAwN510t22 = MainActivity.cAwN510t2(mainActivity6);
                            String string2 = this.RG6kpfv3v.getString(R.string.speed_after);
                            ((prCJwNx2x) mainActivity6.i8XZMQc6Z).CBQ5d1kRq(cAwN510t22 + string2 + " " + str);
                            MainActivity mainActivity7 = this.RG6kpfv3v;
                            String cAwN510t23 = MainActivity.cAwN510t2(mainActivity7);
                            String string3 = this.RG6kpfv3v.getString(R.string.preloadedram);
                            int i4 = this.dXrmkklc8;
                            int i5 = i4 > 1024 ? i4 / 1024 : i4;
                            if (i4 > 1024) {
                                mainActivity3 = this.RG6kpfv3v;
                                i2 = R.string.mb;
                            } else {
                                mainActivity3 = this.RG6kpfv3v;
                                i2 = R.string.kb;
                            }
                            String string4 = mainActivity3.getString(i2);
                            ((prCJwNx2x) mainActivity7.i8XZMQc6Z).CBQ5d1kRq(cAwN510t23 + string3 + " " + i5 + " " + string4);
                            if (PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).getBoolean("skipped_parts", false)) {
                                mainActivity2 = this.RG6kpfv3v;
                                String cAwN510t24 = MainActivity.cAwN510t2(mainActivity2);
                                str4 = this.RG6kpfv3v.getString(R.string.preloading_skipped);
                                sb = abGBwSu8x.q3BipwRCk(cAwN510t24);
                                str3 = "\n";
                            }
                            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).edit();
                            edit.putBoolean("preloaded", true);
                            edit.apply();
                            return qih4lW99W.q3BipwRCk;
                        }
                        ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(my9FFKbZi.q3BipwRCk(sb, str3, str4));
                        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).edit();
                        edit2.putBoolean("preloaded", true);
                        edit2.apply();
                        return qih4lW99W.q3BipwRCk;
                    }
                    mainActivity = this.RG6kpfv3v;
                    i = R.string.low_ram;
                    MainActivity.NyWTwPF6V(mainActivity, mainActivity.getString(i));
                    return qih4lW99W.q3BipwRCk;
                }
                mainActivity = this.RG6kpfv3v;
                i = R.string.name_error;
                MainActivity.NyWTwPF6V(mainActivity, mainActivity.getString(i));
                return qih4lW99W.q3BipwRCk;
            case 1:
                i3 = this.MzoOEjc4X;
                anXlDk6fV.IytU16YUK(obj);
                obj8 = obj;
                if (i3 >= ((Number) obj8).intValue()) {
                }
                break;
            case 2:
                str6 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                obj7 = obj;
                str5 = (String) obj7;
                if (!(str5.length() != 0)) {
                    break;
                }
                this.ilHKhw3Yw = str6;
                this.qVUwofr5s = 3;
                obj6 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.o4LF8RkoQ(this.Eeka1udhb), this);
                if (obj6 == kbkjsqcsl) {
                }
                str5 = (String) obj6;
                if (!(str5.length() == 0)) {
                    break;
                }
                this.ilHKhw3Yw = str6;
                this.qVUwofr5s = 4;
                obj5 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                if (obj5 == kbkjsqcsl) {
                }
                str5 = (String) obj5;
                yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                EBQXiIPmm = wkFJfVmcv.EBQXiIPmm(this.Eeka1udhb, " ", null, null, 0, null, null, 62);
                str7 = this.ixWaw2akD;
                this.ilHKhw3Yw = str5;
                this.qVUwofr5s = 5;
                if (yuSxiExwK.J4Ux7ym32(str6, false, EBQXiIPmm, str7, this) != kbkjsqcsl) {
                }
                break;
            case 3:
                str6 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                obj6 = obj;
                str5 = (String) obj6;
                if (!(str5.length() == 0)) {
                }
                this.ilHKhw3Yw = str6;
                this.qVUwofr5s = 4;
                obj5 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                if (obj5 == kbkjsqcsl) {
                }
                str5 = (String) obj5;
                yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                EBQXiIPmm = wkFJfVmcv.EBQXiIPmm(this.Eeka1udhb, " ", null, null, 0, null, null, 62);
                str7 = this.ixWaw2akD;
                this.ilHKhw3Yw = str5;
                this.qVUwofr5s = 5;
                if (yuSxiExwK.J4Ux7ym32(str6, false, EBQXiIPmm, str7, this) != kbkjsqcsl) {
                }
                break;
            case 4:
                str6 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                obj5 = obj;
                str5 = (String) obj5;
                yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                EBQXiIPmm = wkFJfVmcv.EBQXiIPmm(this.Eeka1udhb, " ", null, null, 0, null, null, 62);
                str7 = this.ixWaw2akD;
                this.ilHKhw3Yw = str5;
                this.qVUwofr5s = 5;
                if (yuSxiExwK.J4Ux7ym32(str6, false, EBQXiIPmm, str7, this) != kbkjsqcsl) {
                }
                break;
            case 5:
                str2 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                this.ilHKhw3Yw = str2;
                this.qVUwofr5s = 6;
                obj4 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.TyB1UUd72(this.Eeka1udhb), this);
                if (obj4 == kbkjsqcsl) {
                }
                str = (String) obj4;
                if (!(str.length() == 0)) {
                    break;
                }
                this.ilHKhw3Yw = str2;
                this.qVUwofr5s = 7;
                obj3 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.o4LF8RkoQ(this.Eeka1udhb), this);
                if (obj3 == kbkjsqcsl) {
                }
                str = (String) obj3;
                if (!(str.length() != 0)) {
                    break;
                }
                this.ilHKhw3Yw = str2;
                this.qVUwofr5s = 8;
                obj2 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                if (obj2 == kbkjsqcsl) {
                }
                str = (String) obj2;
                MainActivity mainActivity42 = this.RG6kpfv3v;
                MainActivity.NyWTwPF6V(mainActivity42, mainActivity42.getString(R.string.preloaded));
                if (str.length() > 0) {
                    break;
                }
                mainActivity2 = this.RG6kpfv3v;
                str3 = MainActivity.cAwN510t2(mainActivity2);
                str4 = this.RG6kpfv3v.getString(R.string.speed_fail);
                sb = new StringBuilder();
                ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(my9FFKbZi.q3BipwRCk(sb, str3, str4));
                SharedPreferences.Editor edit22 = PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).edit();
                edit22.putBoolean("preloaded", true);
                edit22.apply();
                return qih4lW99W.q3BipwRCk;
            case 6:
                str2 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                obj4 = obj;
                str = (String) obj4;
                if (!(str.length() == 0)) {
                }
                this.ilHKhw3Yw = str2;
                this.qVUwofr5s = 7;
                obj3 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.o4LF8RkoQ(this.Eeka1udhb), this);
                if (obj3 == kbkjsqcsl) {
                }
                str = (String) obj3;
                if (!(str.length() != 0)) {
                }
                this.ilHKhw3Yw = str2;
                this.qVUwofr5s = 8;
                obj2 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                if (obj2 == kbkjsqcsl) {
                }
                str = (String) obj2;
                MainActivity mainActivity422 = this.RG6kpfv3v;
                MainActivity.NyWTwPF6V(mainActivity422, mainActivity422.getString(R.string.preloaded));
                if (str.length() > 0) {
                }
                mainActivity2 = this.RG6kpfv3v;
                str3 = MainActivity.cAwN510t2(mainActivity2);
                str4 = this.RG6kpfv3v.getString(R.string.speed_fail);
                sb = new StringBuilder();
                ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(my9FFKbZi.q3BipwRCk(sb, str3, str4));
                SharedPreferences.Editor edit222 = PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).edit();
                edit222.putBoolean("preloaded", true);
                edit222.apply();
                return qih4lW99W.q3BipwRCk;
            case 7:
                str2 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                obj3 = obj;
                str = (String) obj3;
                if (!(str.length() != 0)) {
                }
                this.ilHKhw3Yw = str2;
                this.qVUwofr5s = 8;
                obj2 = tzR8IMGfw.q3BipwRCk.yWvV4ePLl((String) wkFJfVmcv.zHl31GGXU(this.Eeka1udhb, frseFxszT.kmSgne1rO), this);
                if (obj2 == kbkjsqcsl) {
                }
                str = (String) obj2;
                MainActivity mainActivity4222 = this.RG6kpfv3v;
                MainActivity.NyWTwPF6V(mainActivity4222, mainActivity4222.getString(R.string.preloaded));
                if (str.length() > 0) {
                }
                mainActivity2 = this.RG6kpfv3v;
                str3 = MainActivity.cAwN510t2(mainActivity2);
                str4 = this.RG6kpfv3v.getString(R.string.speed_fail);
                sb = new StringBuilder();
                ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(my9FFKbZi.q3BipwRCk(sb, str3, str4));
                SharedPreferences.Editor edit2222 = PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).edit();
                edit2222.putBoolean("preloaded", true);
                edit2222.apply();
                return qih4lW99W.q3BipwRCk;
            case 8:
                str2 = (String) this.ilHKhw3Yw;
                anXlDk6fV.IytU16YUK(obj);
                obj2 = obj;
                str = (String) obj2;
                MainActivity mainActivity42222 = this.RG6kpfv3v;
                MainActivity.NyWTwPF6V(mainActivity42222, mainActivity42222.getString(R.string.preloaded));
                if (str.length() > 0) {
                }
                mainActivity2 = this.RG6kpfv3v;
                str3 = MainActivity.cAwN510t2(mainActivity2);
                str4 = this.RG6kpfv3v.getString(R.string.speed_fail);
                sb = new StringBuilder();
                ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(my9FFKbZi.q3BipwRCk(sb, str3, str4));
                SharedPreferences.Editor edit22222 = PreferenceManager.getDefaultSharedPreferences(this.RG6kpfv3v).edit();
                edit22222.putBoolean("preloaded", true);
                edit22222.apply();
                return qih4lW99W.q3BipwRCk;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
