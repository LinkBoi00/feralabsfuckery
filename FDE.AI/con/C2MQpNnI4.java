package con;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class C2MQpNnI4 implements Callable {
    public final /* synthetic */ Context Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ int MzoOEjc4X;
    public final /* synthetic */ SfQ6fqrlg PSTqBLTET;
    public final /* synthetic */ String kmSgne1rO;

    public C2MQpNnI4(String str, Context context, SfQ6fqrlg sfQ6fqrlg, int i, int i2) {
        this.CBQ5d1kRq = i2;
        if (i2 != 1) {
            this.kmSgne1rO = str;
            this.Bhmn1KIah = context;
            this.PSTqBLTET = sfQ6fqrlg;
            this.MzoOEjc4X = i;
            return;
        }
        this.kmSgne1rO = str;
        this.Bhmn1KIah = context;
        this.PSTqBLTET = sfQ6fqrlg;
        this.MzoOEjc4X = i;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return q3BipwRCk();
            default:
                return q3BipwRCk();
        }
    }

    public OLEAwlv46 q3BipwRCk() {
        switch (this.CBQ5d1kRq) {
            case 0:
                return k8d73inuH.J4Ux7ym32(this.kmSgne1rO, this.Bhmn1KIah, this.PSTqBLTET, this.MzoOEjc4X);
            default:
                try {
                    return k8d73inuH.J4Ux7ym32(this.kmSgne1rO, this.Bhmn1KIah, this.PSTqBLTET, this.MzoOEjc4X);
                } catch (Throwable unused) {
                    return new OLEAwlv46(-3);
                }
        }
    }
}
