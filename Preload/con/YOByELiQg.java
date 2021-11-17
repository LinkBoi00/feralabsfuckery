package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class YOByELiQg {
    public static int tGV7Q6urW;
    public ArrayList J4Ux7ym32 = new ArrayList();
    public yUQFqpqgq q3BipwRCk;

    public YOByELiQg(yUQFqpqgq yuqfqpqgq, int i) {
        this.q3BipwRCk = null;
        tGV7Q6urW++;
        this.q3BipwRCk = yuqfqpqgq;
    }

    public final long J4Ux7ym32(fTuF5tuYZ ftuf5tuyz, long j) {
        yUQFqpqgq yuqfqpqgq = ftuf5tuyz.dIocxURUo;
        if (yuqfqpqgq instanceof FEvkFsjz5) {
            return j;
        }
        int size = ftuf5tuyz.vPSbyrYWX.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            OA9bkVDuZ oA9bkVDuZ = (OA9bkVDuZ) ftuf5tuyz.vPSbyrYWX.get(i);
            if (oA9bkVDuZ instanceof fTuF5tuYZ) {
                fTuF5tuYZ ftuf5tuyz2 = (fTuF5tuYZ) oA9bkVDuZ;
                if (ftuf5tuyz2.dIocxURUo != yuqfqpqgq) {
                    j2 = Math.max(j2, J4Ux7ym32(ftuf5tuyz2, ((long) ftuf5tuyz2.iiGwOFFnr) + j));
                }
            }
        }
        if (ftuf5tuyz != yuqfqpqgq.Puu3Rhg4F) {
            return j2;
        }
        long oon79WMrY = j + yuqfqpqgq.oon79WMrY();
        return Math.max(Math.max(j2, J4Ux7ym32(yuqfqpqgq.yWvV4ePLl, oon79WMrY)), oon79WMrY - ((long) yuqfqpqgq.yWvV4ePLl.iiGwOFFnr));
    }

    public final long q3BipwRCk(fTuF5tuYZ ftuf5tuyz, long j) {
        yUQFqpqgq yuqfqpqgq = ftuf5tuyz.dIocxURUo;
        if (yuqfqpqgq instanceof FEvkFsjz5) {
            return j;
        }
        int size = ftuf5tuyz.vPSbyrYWX.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            OA9bkVDuZ oA9bkVDuZ = (OA9bkVDuZ) ftuf5tuyz.vPSbyrYWX.get(i);
            if (oA9bkVDuZ instanceof fTuF5tuYZ) {
                fTuF5tuYZ ftuf5tuyz2 = (fTuF5tuYZ) oA9bkVDuZ;
                if (ftuf5tuyz2.dIocxURUo != yuqfqpqgq) {
                    j2 = Math.min(j2, q3BipwRCk(ftuf5tuyz2, ((long) ftuf5tuyz2.iiGwOFFnr) + j));
                }
            }
        }
        if (ftuf5tuyz != yuqfqpqgq.yWvV4ePLl) {
            return j2;
        }
        long oon79WMrY = j - yuqfqpqgq.oon79WMrY();
        return Math.min(Math.min(j2, q3BipwRCk(yuqfqpqgq.Puu3Rhg4F, oon79WMrY)), oon79WMrY - ((long) yuqfqpqgq.Puu3Rhg4F.iiGwOFFnr));
    }
}
