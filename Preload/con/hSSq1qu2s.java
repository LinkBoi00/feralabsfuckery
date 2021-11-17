package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class hSSq1qu2s implements F5n0QAijb {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public hSSq1qu2s(PlegqbMSA plegqbMSA) {
        this.J4Ux7ym32 = plegqbMSA;
    }

    public /* bridge */ /* synthetic */ void J4Ux7ym32(Object obj) {
        switch (this.q3BipwRCk) {
            case 0:
                q3BipwRCk((OLEAwlv46) obj);
                return;
            default:
                q3BipwRCk((OLEAwlv46) obj);
                return;
        }
    }

    public void q3BipwRCk(OLEAwlv46 oLEAwlv46) {
        switch (this.q3BipwRCk) {
            case 0:
                if (oLEAwlv46 == null) {
                    oLEAwlv46 = new OLEAwlv46(-3);
                }
                ((PlegqbMSA) this.J4Ux7ym32).yWvV4ePLl(oLEAwlv46);
                return;
            default:
                synchronized (k8d73inuH.tGV7Q6urW) {
                    ZmYjNS8wW zmYjNS8wW = k8d73inuH.dIocxURUo;
                    ArrayList arrayList = (ArrayList) zmYjNS8wW.get((String) this.J4Ux7ym32);
                    if (arrayList != null) {
                        zmYjNS8wW.remove((String) this.J4Ux7ym32);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((hSSq1qu2s) ((F5n0QAijb) arrayList.get(i))).J4Ux7ym32(oLEAwlv46);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    public hSSq1qu2s(String str) {
        this.J4Ux7ym32 = str;
    }
}
