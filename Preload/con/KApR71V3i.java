package con;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.savedstate.RG2GI7LDp;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class KApR71V3i {
    public static final hOY2Rgtej q3BipwRCk = new TY2XlauBb(VpkLDqhd7.q3BipwRCk, juufjqtjC.WaUP0CF08);
    public static final hOY2Rgtej J4Ux7ym32 = new cUplJDe5D(SFccbMiBr.MzoOEjc4X);
    public static final hOY2Rgtej tGV7Q6urW = new cUplJDe5D(VSocs6HGb.dfpT1j18n);
    public static final hOY2Rgtej dIocxURUo = new cUplJDe5D(ZKEa6x2aW.sk5s77z6Q);
    public static final hOY2Rgtej kCA6Zs9sL = new cUplJDe5D(juufjqtjC.i8XZMQc6Z);
    public static final hOY2Rgtej iiGwOFFnr = new cUplJDe5D(SFccbMiBr.ilHKhw3Yw);

    public static final Void J4Ux7ym32(String str) {
        throw new IllegalStateException(M5g57XBLr.q3BipwRCk("CompositionLocal ", str, " not present").toString());
    }

    public static final void q3BipwRCk(AndroidComposeView androidComposeView, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i) {
        boolean z;
        boolean z2;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-340663129);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        Context context = androidComposeView.getContext();
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i2 = rJ0s9PfCL.q3BipwRCk;
        Object obj2 = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n == obj2) {
            WJknYg2ot wJknYg2ot = new WJknYg2ot(context.getResources().getConfiguration(), VpkLDqhd7.q3BipwRCk);
            wpxpbwg1j.INnK5Rew6(wJknYg2ot);
            dfpT1j18n = wJknYg2ot;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n;
        wpxpbwg1j.zHl31GGXU(-3686930);
        boolean iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ);
        Object dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
        if (iiGwOFFnr2 || dfpT1j18n2 == obj2) {
            dfpT1j18n2 = new AjFIIQ7mw(rNEcgN6dQ, 1);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        androidComposeView.setConfigurationChangeObserver((PmanMZxiM) dfpT1j18n2);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n3 == obj2) {
            dfpT1j18n3 = new J18mZLPRS(context);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        J18mZLPRS j18mZLPRS = (J18mZLPRS) dfpT1j18n3;
        AndroidComposeView.RG2GI7LDp viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            wpxpbwg1j.zHl31GGXU(-3687241);
            Object dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
            if (dfpT1j18n4 == obj2) {
                XHpudBVT5 xHpudBVT5 = viewTreeOwners.J4Ux7ym32;
                Class[] clsArr = kIa5OzTpA.q3BipwRCk;
                ViewParent parent = androidComposeView.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = ((Object) dVtF46MWK.class.getSimpleName()) + ':' + str;
                RG2GI7LDp q3BipwRCk2 = xHpudBVT5.q3BipwRCk();
                Bundle q3BipwRCk3 = q3BipwRCk2.q3BipwRCk(str2);
                if (q3BipwRCk3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : q3BipwRCk3.keySet()) {
                        ArrayList parcelableArrayList = q3BipwRCk3.getParcelableArrayList(str3);
                        Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                }
                AdUPdUuqH adUPdUuqH = AdUPdUuqH.CpG0imbht;
                hOY2Rgtej hoy2rgtej = cAJLJrM2D.q3BipwRCk;
                gXDw1hlBA gxdw1hlba = new gXDw1hlBA(linkedHashMap, adUPdUuqH);
                try {
                    q3BipwRCk2.J4Ux7ym32(str2, new Pf46TvDcc(gxdw1hlba));
                    z2 = true;
                } catch (IllegalArgumentException unused) {
                    z2 = false;
                }
                IxQRHSwcX ixQRHSwcX = new IxQRHSwcX(gxdw1hlba, new aMoFgJV3V(z2, q3BipwRCk2, str2));
                wpxpbwg1j.INnK5Rew6(ixQRHSwcX);
                dfpT1j18n4 = ixQRHSwcX;
                z = false;
            } else {
                z = false;
            }
            wpxpbwg1j.ilHKhw3Yw(z);
            IxQRHSwcX ixQRHSwcX2 = (IxQRHSwcX) dfpT1j18n4;
            gLDxq5bwv.q3BipwRCk(qih4lW99W.q3BipwRCk, new nVhenZUxZ(ixQRHSwcX2), wpxpbwg1j);
            prCJwNx2x prcjwnx2x = (prCJwNx2x) rNEcgN6dQ;
            Configuration configuration = (Configuration) prcjwnx2x.getValue();
            wpxpbwg1j.zHl31GGXU(2099958348);
            Object obj3 = G7WvUK4mQ.q3BipwRCk;
            wpxpbwg1j.zHl31GGXU(-3687241);
            Object dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
            int i3 = rJ0s9PfCL.q3BipwRCk;
            Object obj4 = P7Re99G8L.J4Ux7ym32;
            if (dfpT1j18n5 == obj4) {
                dfpT1j18n5 = new msAS1mvLD();
                wpxpbwg1j.INnK5Rew6(dfpT1j18n5);
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            msAS1mvLD msas1mvld = (msAS1mvLD) dfpT1j18n5;
            IXMg0nBBI iXMg0nBBI = new IXMg0nBBI();
            wpxpbwg1j.zHl31GGXU(-3687241);
            Object dfpT1j18n6 = wpxpbwg1j.dfpT1j18n();
            if (dfpT1j18n6 == obj4) {
                wpxpbwg1j.INnK5Rew6(configuration);
            } else {
                configuration = dfpT1j18n6;
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            iXMg0nBBI.CBQ5d1kRq = configuration;
            wpxpbwg1j.zHl31GGXU(-3687241);
            Object dfpT1j18n7 = wpxpbwg1j.dfpT1j18n();
            if (dfpT1j18n7 == obj4) {
                dfpT1j18n7 = new YwogV6ONJ(iXMg0nBBI, msas1mvld);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n7);
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            gLDxq5bwv.q3BipwRCk(msas1mvld, new dMQC97DHs(context, (YwogV6ONJ) dfpT1j18n7), wpxpbwg1j);
            wpxpbwg1j.ilHKhw3Yw(false);
            u51fgFYkV.q3BipwRCk(new BaB9IKBYw[]{q3BipwRCk.J4Ux7ym32((Configuration) prcjwnx2x.getValue()), J4Ux7ym32.J4Ux7ym32(context), dIocxURUo.J4Ux7ym32(viewTreeOwners.q3BipwRCk), kCA6Zs9sL.J4Ux7ym32(viewTreeOwners.J4Ux7ym32), cAJLJrM2D.q3BipwRCk.J4Ux7ym32(ixQRHSwcX2), iiGwOFFnr.J4Ux7ym32(androidComposeView.getView()), tGV7Q6urW.J4Ux7ym32(msas1mvld)}, xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819890514, true, new XrPnW080C(androidComposeView, j18mZLPRS, kkcqgcx5g, i)), wpxpbwg1j, 56);
            rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb != null) {
                Eeka1udhb.dIocxURUo = new oJ0LPfEQB(androidComposeView, kkcqgcx5g, i);
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }
}
