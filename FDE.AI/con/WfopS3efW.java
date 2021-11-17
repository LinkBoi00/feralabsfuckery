package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class WfopS3efW implements GX14exZ1F {
    public final List J4Ux7ym32 = new ArrayList();
    public final Object q3BipwRCk;
    public Object tGV7Q6urW;

    public WfopS3efW(Object obj) {
        this.q3BipwRCk = obj;
        this.tGV7Q6urW = obj;
    }

    public void GPLPRo6go() {
        if (!this.J4Ux7ym32.isEmpty()) {
            List list = this.J4Ux7ym32;
            this.tGV7Q6urW = list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public abstract void iiGwOFFnr();

    @Override // con.GX14exZ1F
    public void tGV7Q6urW() {
    }
}
