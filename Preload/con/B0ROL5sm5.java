package con;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.mhl5lIdbQ;
/* loaded from: classes.dex */
public class B0ROL5sm5 extends Fragment {
    public static final /* synthetic */ int kmSgne1rO;
    public iFKnyAZAM CBQ5d1kRq;

    public static void q3BipwRCk(Activity activity, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        if (activity instanceof BgHiMFrEI) {
            mhl5lIdbQ GPLPRo6go = ((BgHiMFrEI) activity).GPLPRo6go();
            if (GPLPRo6go instanceof N0a4Shkkl) {
                N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) GPLPRo6go;
                n0a4Shkkl.dIocxURUo("handleLifecycleEvent");
                n0a4Shkkl.GPLPRo6go(rG2GI7LDp.q3BipwRCk());
            }
        }
    }

    public static void tGV7Q6urW(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            nZvWAgcjx.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new B0ROL5sm5(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        if (Build.VERSION.SDK_INT < 29) {
            q3BipwRCk(getActivity(), rG2GI7LDp);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_DESTROY);
        this.CBQ5d1kRq = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        iFKnyAZAM ifknyazam = this.CBQ5d1kRq;
        if (ifknyazam != null) {
            ((K3JGdRcke) ifknyazam.kmSgne1rO).J4Ux7ym32();
        }
        J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        iFKnyAZAM ifknyazam = this.CBQ5d1kRq;
        if (ifknyazam != null) {
            ((K3JGdRcke) ifknyazam.kmSgne1rO).tGV7Q6urW();
        }
        J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
    }
}
