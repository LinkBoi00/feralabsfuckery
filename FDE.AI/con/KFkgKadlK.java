package con;

import android.graphics.Shader;
/* loaded from: classes.dex */
public final class KFkgKadlK extends bZmnXN812 {
    public long J4Ux7ym32 = tbzY8QG6X.dIocxURUo;
    public Shader q3BipwRCk;
    public final /* synthetic */ Shader tGV7Q6urW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFkgKadlK(Shader shader) {
        super(null);
        this.tGV7Q6urW = shader;
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
    }

    @Override // con.bZmnXN812
    public final void q3BipwRCk(long j, AA4ZBBPJq aA4ZBBPJq, float f) {
        Shader shader = this.q3BipwRCk;
        if (shader == null || !tbzY8QG6X.J4Ux7ym32(this.J4Ux7ym32, j)) {
            shader = this.tGV7Q6urW;
            this.q3BipwRCk = shader;
            this.J4Ux7ym32 = j;
        }
        long J4Ux7ym32 = aA4ZBBPJq.J4Ux7ym32();
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        long j2 = bO2dbmrf7.tGV7Q6urW;
        if (!bO2dbmrf7.tGV7Q6urW(J4Ux7ym32, j2)) {
            aA4ZBBPJq.oon79WMrY(j2);
        }
        if (!anXlDk6fV.tGV7Q6urW(aA4ZBBPJq.tGV7Q6urW, shader)) {
            aA4ZBBPJq.Bhmn1KIah(shader);
        }
        if (!(aA4ZBBPJq.q3BipwRCk() == f)) {
            aA4ZBBPJq.Puu3Rhg4F(f);
        }
    }
}
