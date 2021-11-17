package androidx.compose.ui.platform;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.WrappedComposition;
import com.feravolt.preload.R;
import con.D3DEikrvb;
import con.DlhjQ2PrY;
import con.DpXbxvzXm;
import con.G93AcjBI3;
import con.GPJ4QWO2h;
import con.J7YsuEuPq;
import con.Ka0YY9gOW;
import con.MLnKY8xDo;
import con.Rjnc3TWC6;
import con.UvOuyIFuT;
import con.aPSn62JU5;
import con.bu5cjmae6;
import con.hDwK7ZkhL;
import con.idpM54xlp;
import con.kkcQgCx5G;
import con.ksLrMHgEz;
import con.nVhenZUxZ;
import con.rTcohQ78k;
import con.v0l3RHDWl;
import con.z3ICU5k15;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class s7MlVynBG {
    public static final ViewGroup.LayoutParams q3BipwRCk = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final v0l3RHDWl q3BipwRCk(ViewGroup viewGroup, z3ICU5k15 z3icu5k15, kkcQgCx5G kkcqgcx5g) {
        AndroidComposeView androidComposeView;
        Object tag;
        GPJ4QWO2h gPJ4QWO2h = GPJ4QWO2h.q3BipwRCk;
        boolean z = false;
        WrappedComposition wrappedComposition = null;
        if (GPJ4QWO2h.J4Ux7ym32.compareAndSet(false, true)) {
            DpXbxvzXm q3BipwRCk2 = rTcohQ78k.q3BipwRCk(-1, null, null, 6);
            ksLrMHgEz kslrmhgez = J7YsuEuPq.sk5s77z6Q;
            idpM54xlp.RG6kpfv3v(D3DEikrvb.q3BipwRCk((bu5cjmae6) ((Ka0YY9gOW) J7YsuEuPq.WaUP0CF08).getValue()), null, 0, new G93AcjBI3(q3BipwRCk2, null), 3, null);
            nVhenZUxZ nvhenzuxz = new nVhenZUxZ(q3BipwRCk2);
            synchronized (UvOuyIFuT.J4Ux7ym32) {
                ((ArrayList) UvOuyIFuT.iiGwOFFnr).add(nvhenzuxz);
            }
            UvOuyIFuT.iiGwOFFnr(DlhjQ2PrY.IytU16YUK);
        }
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
                if (androidComposeView == null) {
                    androidComposeView = new AndroidComposeView(viewGroup.getContext());
                    viewGroup.addView(androidComposeView.getView(), q3BipwRCk);
                }
                if (Build.VERSION.SDK_INT >= 29 && (!hDwK7ZkhL.q3BipwRCk.q3BipwRCk(androidComposeView).isEmpty())) {
                    z = true;
                }
                if (z) {
                    androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                    try {
                        Field declaredField = Rjnc3TWC6.class.getDeclaredField("q3BipwRCk");
                        declaredField.setAccessible(true);
                        declaredField.setBoolean(null, true);
                    } catch (Exception unused) {
                        Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                    }
                }
                v0l3RHDWl q3BipwRCk3 = MLnKY8xDo.q3BipwRCk(new aPSn62JU5(androidComposeView.getRoot()), z3icu5k15);
                tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
                if (tag instanceof WrappedComposition) {
                    wrappedComposition = (WrappedComposition) tag;
                }
                if (wrappedComposition == null) {
                    wrappedComposition = new WrappedComposition(androidComposeView, q3BipwRCk3);
                    androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
                }
                wrappedComposition.CBQ5d1kRq.setOnViewTreeOwnersAvailable(new WrappedComposition.RG2GI7LDp(kkcqgcx5g));
                return wrappedComposition;
            }
        } else {
            viewGroup.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (z) {
        }
        v0l3RHDWl q3BipwRCk32 = MLnKY8xDo.q3BipwRCk(new aPSn62JU5(androidComposeView.getRoot()), z3icu5k15);
        tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
        }
        wrappedComposition.CBQ5d1kRq.setOnViewTreeOwnersAvailable(new WrappedComposition.RG2GI7LDp(kkcqgcx5g));
        return wrappedComposition;
    }
}
