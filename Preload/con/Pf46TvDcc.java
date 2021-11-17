package con;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.savedstate.RG2GI7LDp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class Pf46TvDcc implements RG2GI7LDp.mhl5lIdbQ {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public /* synthetic */ Pf46TvDcc(ComponentActivity componentActivity) {
        this.J4Ux7ym32 = componentActivity;
    }

    public /* synthetic */ Pf46TvDcc(dVtF46MWK dvtf46mwk) {
        this.J4Ux7ym32 = dvtf46mwk;
    }

    @Override // androidx.savedstate.RG2GI7LDp.mhl5lIdbQ
    public final Bundle q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) this.J4Ux7ym32;
                Objects.requireNonNull(componentActivity);
                Bundle bundle = new Bundle();
                androidx.activity.result.RG2GI7LDp rG2GI7LDp = componentActivity.Eeka1udhb;
                Objects.requireNonNull(rG2GI7LDp);
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(rG2GI7LDp.tGV7Q6urW.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(rG2GI7LDp.tGV7Q6urW.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(rG2GI7LDp.kCA6Zs9sL));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) rG2GI7LDp.Puu3Rhg4F.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", rG2GI7LDp.q3BipwRCk);
                return bundle;
            default:
                Class[] clsArr = kIa5OzTpA.q3BipwRCk;
                Map J4Ux7ym32 = ((dVtF46MWK) this.J4Ux7ym32).J4Ux7ym32();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : J4Ux7ym32.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
