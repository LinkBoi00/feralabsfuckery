package con;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Comparator;
/* loaded from: classes.dex */
public class PSEid1kjm implements Comparator {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public PSEid1kjm(PackageManager packageManager) {
        this.J4Ux7ym32 = packageManager;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        switch (this.q3BipwRCk) {
            case 0:
                return ((miIsFJ8kP) obj).kmSgne1rO - ((miIsFJ8kP) obj2).kmSgne1rO;
            case 1:
                return dnBSj5uJN.Puu3Rhg4F(((ApplicationInfo) obj).loadLabel((PackageManager) this.J4Ux7ym32).toString(), ((ApplicationInfo) obj2).loadLabel((PackageManager) this.J4Ux7ym32).toString());
            default:
                PmanMZxiM[] pmanMZxiMArr = (PmanMZxiM[]) this.J4Ux7ym32;
                for (PmanMZxiM pmanMZxiM : pmanMZxiMArr) {
                    int Puu3Rhg4F = dnBSj5uJN.Puu3Rhg4F((Comparable) pmanMZxiM.IytU16YUK(obj), (Comparable) pmanMZxiM.IytU16YUK(obj2));
                    if (Puu3Rhg4F != 0) {
                        return Puu3Rhg4F;
                    }
                }
                return 0;
        }
    }

    public PSEid1kjm(mYZo3Ot61 myzo3ot61) {
        this.J4Ux7ym32 = myzo3ot61;
    }

    public PSEid1kjm(PmanMZxiM[] pmanMZxiMArr) {
        this.J4Ux7ym32 = pmanMZxiMArr;
    }
}
