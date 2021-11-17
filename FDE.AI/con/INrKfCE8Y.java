package con;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class INrKfCE8Y extends k007RzV1x implements JAwcpriIz {
    public k007RzV1x[] ShSN9wbzk = new k007RzV1x[4];
    public int Ihm5o4uLx = 0;

    public void zHl31GGXU(k007RzV1x k007rzv1x) {
        if (k007rzv1x != this && k007rzv1x != null) {
            int i = this.Ihm5o4uLx + 1;
            k007RzV1x[] k007rzv1xArr = this.ShSN9wbzk;
            if (i > k007rzv1xArr.length) {
                this.ShSN9wbzk = (k007RzV1x[]) Arrays.copyOf(k007rzv1xArr, k007rzv1xArr.length * 2);
            }
            k007RzV1x[] k007rzv1xArr2 = this.ShSN9wbzk;
            int i2 = this.Ihm5o4uLx;
            k007rzv1xArr2[i2] = k007rzv1x;
            this.Ihm5o4uLx = i2 + 1;
        }
    }

    public void ziwPzaoF3(ArrayList arrayList, int i, WQmeMGPEH wQmeMGPEH) {
        for (int i2 = 0; i2 < this.Ihm5o4uLx; i2++) {
            wQmeMGPEH.q3BipwRCk(this.ShSN9wbzk[i2]);
        }
        for (int i3 = 0; i3 < this.Ihm5o4uLx; i3++) {
            BBVaGLNaU.oon79WMrY(this.ShSN9wbzk[i3], i, arrayList, wQmeMGPEH);
        }
    }
}
