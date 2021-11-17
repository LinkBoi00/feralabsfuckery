package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class qYFy65iys extends k007RzV1x {
    public ArrayList ShSN9wbzk = new ArrayList();

    public qYFy65iys() {
    }

    public qYFy65iys(int i, int i2) {
        super(i, i2);
    }

    @Override // con.k007RzV1x
    public void AqaWJg0b4(LKa8y802S lKa8y802S) {
        super.AqaWJg0b4(lKa8y802S);
        int size = this.ShSN9wbzk.size();
        for (int i = 0; i < size; i++) {
            ((k007RzV1x) this.ShSN9wbzk.get(i)).AqaWJg0b4(lKa8y802S);
        }
    }

    @Override // con.k007RzV1x
    public void qFBXIgpia() {
        this.ShSN9wbzk.clear();
        super.qFBXIgpia();
    }

    public abstract void zHl31GGXU();
}
