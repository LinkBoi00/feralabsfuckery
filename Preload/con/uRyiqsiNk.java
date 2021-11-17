package con;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes.dex */
public class uRyiqsiNk implements hAHDFOdMb {
    public final /* synthetic */ fVMSvDhE6 J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;

    public uRyiqsiNk(fVMSvDhE6 fvmsvdhe6, int i) {
        this.q3BipwRCk = i;
        if (i == 1) {
            this.J4Ux7ym32 = fvmsvdhe6;
        } else if (i == 2) {
            this.J4Ux7ym32 = fvmsvdhe6;
        } else if (i == 3) {
            this.J4Ux7ym32 = fvmsvdhe6;
        } else if (i != 4) {
            this.J4Ux7ym32 = fvmsvdhe6;
        } else {
            this.J4Ux7ym32 = fvmsvdhe6;
        }
    }

    public void J4Ux7ym32(Object obj) {
        String str;
        switch (this.q3BipwRCk) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                qBIc82vNg qbic82vng = (qBIc82vNg) this.J4Ux7ym32.dfpT1j18n.pollFirst();
                if (qbic82vng == null) {
                    str = "No permissions were requested for " + this;
                } else {
                    String str2 = qbic82vng.CBQ5d1kRq;
                    if (this.J4Ux7ym32.tGV7Q6urW.Puu3Rhg4F(str2) == null) {
                        str = "Permission request result delivered for unknown Fragment " + str2;
                    } else {
                        return;
                    }
                }
                Log.w("FragmentManager", str);
                return;
            case 1:
                q3BipwRCk((ullZnRGKg) obj);
                return;
            default:
                q3BipwRCk((ullZnRGKg) obj);
                return;
        }
    }

    public void dIocxURUo(UxHHqhbTP uxHHqhbTP, ce8tBZHr1 ce8tbzhr1) {
        fVMSvDhE6 fvmsvdhe6 = this.J4Ux7ym32;
        if (fvmsvdhe6.CBQ5d1kRq.get(uxHHqhbTP) == null) {
            fvmsvdhe6.CBQ5d1kRq.put(uxHHqhbTP, new HashSet());
        }
        ((HashSet) fvmsvdhe6.CBQ5d1kRq.get(uxHHqhbTP)).add(ce8tbzhr1);
    }

    public void q3BipwRCk(ullZnRGKg ullznrgkg) {
        StringBuilder sb;
        StringBuilder sb2;
        switch (this.q3BipwRCk) {
            case 1:
                qBIc82vNg qbic82vng = (qBIc82vNg) this.J4Ux7ym32.dfpT1j18n.pollFirst();
                if (qbic82vng == null) {
                    sb2 = new StringBuilder();
                    sb2.append("No IntentSenders were started for ");
                    sb2.append(this);
                } else {
                    String str = qbic82vng.CBQ5d1kRq;
                    int i = qbic82vng.kmSgne1rO;
                    UxHHqhbTP Puu3Rhg4F = this.J4Ux7ym32.tGV7Q6urW.Puu3Rhg4F(str);
                    if (Puu3Rhg4F == null) {
                        sb2 = new StringBuilder();
                        sb2.append("Intent Sender result delivered for unknown Fragment ");
                        sb2.append(str);
                    } else {
                        Puu3Rhg4F.CpG0imbht(i, ullznrgkg.CBQ5d1kRq, ullznrgkg.kmSgne1rO);
                        return;
                    }
                }
                Log.w("FragmentManager", sb2.toString());
                return;
            default:
                qBIc82vNg qbic82vng2 = (qBIc82vNg) this.J4Ux7ym32.dfpT1j18n.pollFirst();
                if (qbic82vng2 == null) {
                    sb = new StringBuilder();
                    sb.append("No Activities were started for result for ");
                    sb.append(this);
                } else {
                    String str2 = qbic82vng2.CBQ5d1kRq;
                    int i2 = qbic82vng2.kmSgne1rO;
                    UxHHqhbTP Puu3Rhg4F2 = this.J4Ux7ym32.tGV7Q6urW.Puu3Rhg4F(str2);
                    if (Puu3Rhg4F2 == null) {
                        sb = new StringBuilder();
                        sb.append("Activity result delivered for unknown Fragment ");
                        sb.append(str2);
                    } else {
                        Puu3Rhg4F2.CpG0imbht(i2, ullznrgkg.CBQ5d1kRq, ullznrgkg.kmSgne1rO);
                        return;
                    }
                }
                Log.w("FragmentManager", sb.toString());
                return;
        }
    }

    public void tGV7Q6urW(UxHHqhbTP uxHHqhbTP, ce8tBZHr1 ce8tbzhr1) {
        boolean z;
        synchronized (ce8tbzhr1) {
            z = ce8tbzhr1.q3BipwRCk;
        }
        if (!z) {
            fVMSvDhE6 fvmsvdhe6 = this.J4Ux7ym32;
            HashSet hashSet = (HashSet) fvmsvdhe6.CBQ5d1kRq.get(uxHHqhbTP);
            if (hashSet != null && hashSet.remove(ce8tbzhr1) && hashSet.isEmpty()) {
                fvmsvdhe6.CBQ5d1kRq.remove(uxHHqhbTP);
                if (uxHHqhbTP.CBQ5d1kRq < 5) {
                    fvmsvdhe6.vPSbyrYWX(uxHHqhbTP);
                    fvmsvdhe6.wIZEdYHUn(uxHHqhbTP, fvmsvdhe6.MzoOEjc4X);
                }
            }
        }
    }
}
