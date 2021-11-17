package con;

import java.util.Objects;
/* loaded from: classes.dex */
public class auO4JQva1 implements MV2w6qPoc, stVpOZKoA {
    public SlV7nGkeq J4Ux7ym32;
    public Object iiGwOFFnr;
    public int q3BipwRCk;
    public int tGV7Q6urW = -1;
    public int dIocxURUo = -1;
    public float kCA6Zs9sL = 0.0f;

    public auO4JQva1(Tu4W68Wme tu4W68Wme) {
    }

    @Override // con.stVpOZKoA
    public void J4Ux7ym32() {
        this.J4Ux7ym32.ziwPzaoF3(this.q3BipwRCk);
        int i = this.tGV7Q6urW;
        if (i != -1) {
            SlV7nGkeq slV7nGkeq = this.J4Ux7ym32;
            Objects.requireNonNull(slV7nGkeq);
            if (i > -1) {
                slV7nGkeq.ShSN9wbzk = -1.0f;
                slV7nGkeq.Ihm5o4uLx = i;
                slV7nGkeq.Ta2zrwkcM = -1;
                return;
            }
            return;
        }
        int i2 = this.dIocxURUo;
        if (i2 != -1) {
            SlV7nGkeq slV7nGkeq2 = this.J4Ux7ym32;
            Objects.requireNonNull(slV7nGkeq2);
            if (i2 > -1) {
                slV7nGkeq2.ShSN9wbzk = -1.0f;
                slV7nGkeq2.Ihm5o4uLx = -1;
                slV7nGkeq2.Ta2zrwkcM = i2;
                return;
            }
            return;
        }
        SlV7nGkeq slV7nGkeq3 = this.J4Ux7ym32;
        float f = this.kCA6Zs9sL;
        Objects.requireNonNull(slV7nGkeq3);
        if (f > -1.0f) {
            slV7nGkeq3.ShSN9wbzk = f;
            slV7nGkeq3.Ihm5o4uLx = -1;
            slV7nGkeq3.Ta2zrwkcM = -1;
        }
    }

    @Override // con.stVpOZKoA
    public k007RzV1x dIocxURUo() {
        if (this.J4Ux7ym32 == null) {
            this.J4Ux7ym32 = new SlV7nGkeq();
        }
        return this.J4Ux7ym32;
    }

    @Override // con.stVpOZKoA
    public Object getKey() {
        return this.iiGwOFFnr;
    }

    public auO4JQva1 kCA6Zs9sL(float f) {
        this.tGV7Q6urW = -1;
        this.dIocxURUo = -1;
        this.kCA6Zs9sL = f;
        return this;
    }

    @Override // con.stVpOZKoA
    public void q3BipwRCk(k007RzV1x k007rzv1x) {
        this.J4Ux7ym32 = k007rzv1x instanceof SlV7nGkeq ? (SlV7nGkeq) k007rzv1x : null;
    }

    @Override // con.stVpOZKoA
    public MV2w6qPoc tGV7Q6urW() {
        return null;
    }
}
