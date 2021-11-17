package con;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class ajXYnNhtv extends SQ4Lz5bqj {
    public ajXYnNhtv() {
        super(0);
    }

    @Override // con.SQ4Lz5bqj
    public Object tGV7Q6urW(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(CjvsxH2Me.nlGCs0NZs(arrayList2, 10), CjvsxH2Me.nlGCs0NZs(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new n4f84B5OG(it.next(), it2.next()));
                }
                return s0tSbdszx.mUqPm6GBh(arrayList3);
            }
        }
        return dmnvfTTyg.CBQ5d1kRq;
    }
}
