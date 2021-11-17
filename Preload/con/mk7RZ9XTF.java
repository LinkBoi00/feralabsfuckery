package con;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class mk7RZ9XTF extends AccessibilityNodeProvider {
    public final Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public mk7RZ9XTF(DGdyNqLvN dGdyNqLvN) {
        this.J4Ux7ym32 = dGdyNqLvN;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013a A[LOOP:0: B:29:0x0092->B:49:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[SYNTHETIC] */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        String str2;
        RectF rectF;
        switch (this.q3BipwRCk) {
            case 0:
                Tpuv1V0a9 tpuv1V0a9 = (Tpuv1V0a9) this.J4Ux7ym32;
                BIRL6IXtO bIRL6IXtO = (BIRL6IXtO) tpuv1V0a9.MzoOEjc4X().get(Integer.valueOf(i));
                if (bIRL6IXtO != null) {
                    or5nbo9ku or5nbo9ku = bIRL6IXtO.q3BipwRCk;
                    String ilHKhw3Yw = tpuv1V0a9.ilHKhw3Yw(or5nbo9ku);
                    ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
                    JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
                    SHlGWJTIu sHlGWJTIu = JCsIEQgIX.J4Ux7ym32;
                    if (!ogg45sslv.J4Ux7ym32(sHlGWJTIu) || bundle == null || !anXlDk6fV.tGV7Q6urW(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
                        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
                        SHlGWJTIu sHlGWJTIu2 = VSVuhz7Ow.qVUwofr5s;
                        if (ogg45sslv2.CBQ5d1kRq.containsKey(sHlGWJTIu2) && bundle != null && anXlDk6fV.tGV7Q6urW(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, sHlGWJTIu2)) != null) {
                            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                            return;
                        }
                        return;
                    }
                    int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i3 > 0 && i2 >= 0) {
                        if (i2 < (ilHKhw3Yw == null ? Integer.MAX_VALUE : ilHKhw3Yw.length())) {
                            ArrayList arrayList = new ArrayList();
                            PmanMZxiM pmanMZxiM = (PmanMZxiM) ((ngczBF8du) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu)).J4Ux7ym32;
                            if (anXlDk6fV.tGV7Q6urW(pmanMZxiM == null ? null : (Boolean) pmanMZxiM.IytU16YUK(arrayList), Boolean.TRUE)) {
                                boolean z = false;
                                pZznYi2iw pzznyi2iw = (pZznYi2iw) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                if (i3 > 0) {
                                    int i4 = 0;
                                    while (true) {
                                        int i5 = i4 + 1;
                                        int i6 = i4 + i2;
                                        if (i6 < pzznyi2iw.q3BipwRCk.q3BipwRCk.length()) {
                                            bzmJZsHMu GPLPRo6go = pzznyi2iw.J4Ux7ym32(i6).GPLPRo6go(or5nbo9ku.Puu3Rhg4F());
                                            bzmJZsHMu dIocxURUo = or5nbo9ku.dIocxURUo();
                                            bzmJZsHMu bzmjzshmu = ((GPLPRo6go.tGV7Q6urW > dIocxURUo.q3BipwRCk ? 1 : (GPLPRo6go.tGV7Q6urW == dIocxURUo.q3BipwRCk ? 0 : -1)) <= 0 || (dIocxURUo.tGV7Q6urW > GPLPRo6go.q3BipwRCk ? 1 : (dIocxURUo.tGV7Q6urW == GPLPRo6go.q3BipwRCk ? 0 : -1)) <= 0 || (GPLPRo6go.dIocxURUo > dIocxURUo.J4Ux7ym32 ? 1 : (GPLPRo6go.dIocxURUo == dIocxURUo.J4Ux7ym32 ? 0 : -1)) <= 0 || (dIocxURUo.dIocxURUo > GPLPRo6go.J4Ux7ym32 ? 1 : (dIocxURUo.dIocxURUo == GPLPRo6go.J4Ux7ym32 ? 0 : -1)) <= 0) ? z : true ? new bzmJZsHMu(Math.max(GPLPRo6go.q3BipwRCk, dIocxURUo.q3BipwRCk), Math.max(GPLPRo6go.J4Ux7ym32, dIocxURUo.J4Ux7ym32), Math.min(GPLPRo6go.tGV7Q6urW, dIocxURUo.tGV7Q6urW), Math.min(GPLPRo6go.dIocxURUo, dIocxURUo.dIocxURUo)) : null;
                                            if (bzmjzshmu != null) {
                                                long oon79WMrY = tpuv1V0a9.dIocxURUo.oon79WMrY(ODug2UCW1.dIocxURUo(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32));
                                                long oon79WMrY2 = tpuv1V0a9.dIocxURUo.oon79WMrY(ODug2UCW1.dIocxURUo(bzmjzshmu.tGV7Q6urW, bzmjzshmu.dIocxURUo));
                                                rectF = new RectF(bRgfgYIQX.tGV7Q6urW(oon79WMrY), bRgfgYIQX.dIocxURUo(oon79WMrY), bRgfgYIQX.tGV7Q6urW(oon79WMrY2), bRgfgYIQX.dIocxURUo(oon79WMrY2));
                                                arrayList2.add(rectF);
                                                if (i5 >= i3) {
                                                    i4 = i5;
                                                    z = false;
                                                }
                                            }
                                        }
                                        rectF = null;
                                        arrayList2.add(rectF);
                                        if (i5 >= i3) {
                                        }
                                    }
                                }
                                Bundle extras = accessibilityNodeInfo.getExtras();
                                Object[] array = arrayList2.toArray(new RectF[0]);
                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                extras.putParcelableArray(str, (Parcelable[]) array);
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                return;
            default:
                super.addExtraDataToAccessibilityNodeInfo(i, accessibilityNodeInfo, str, bundle);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x0808, code lost:
        if (con.p62TZmTyO.kmSgne1rO(r6) == false) goto L_0x0819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0814, code lost:
        if (con.p62TZmTyO.kmSgne1rO(r6) == false) goto L_0x0816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0816, code lost:
        r3 = con.IqwHQ6O2l.RG2GI7LDp.Bhmn1KIah;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0819, code lost:
        r3 = con.IqwHQ6O2l.RG2GI7LDp.MzoOEjc4X;
     */
    /* JADX WARN: Removed duplicated region for block: B:283:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0788  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /* Code decompiled incorrectly, please refer to instructions dump */
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        IqwHQ6O2l.RG2GI7LDp rG2GI7LDp;
        mhjbbkjEL mhjbbkjel;
        IqwHQ6O2l.RG2GI7LDp rG2GI7LDp2;
        IqwHQ6O2l.RG2GI7LDp rG2GI7LDp3;
        ngczBF8du ngczbf8du;
        float f;
        float floatValue;
        float floatValue2;
        String str;
        float f2;
        String str2;
        boolean z;
        int i2;
        Resources resources;
        int i3;
        Resources resources2;
        boolean z2;
        boolean z3;
        joIJ4ANvK joij4anvk;
        switch (this.q3BipwRCk) {
            case 0:
                Tpuv1V0a9 tpuv1V0a9 = (Tpuv1V0a9) this.J4Ux7ym32;
                Objects.requireNonNull(tpuv1V0a9);
                IqwHQ6O2l CBQ5d1kRq = IqwHQ6O2l.CBQ5d1kRq();
                BIRL6IXtO bIRL6IXtO = (BIRL6IXtO) tpuv1V0a9.MzoOEjc4X().get(Integer.valueOf(i));
                if (bIRL6IXtO == null) {
                    CBQ5d1kRq.q3BipwRCk.recycle();
                    return null;
                }
                or5nbo9ku or5nbo9ku = bIRL6IXtO.q3BipwRCk;
                if (i == -1) {
                    AndroidComposeView androidComposeView = tpuv1V0a9.dIocxURUo;
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    ViewParent iiGwOFFnr = VCCyeOu6I.iiGwOFFnr(androidComposeView);
                    View view = iiGwOFFnr instanceof View ? (View) iiGwOFFnr : null;
                    CBQ5d1kRq.J4Ux7ym32 = -1;
                    CBQ5d1kRq.q3BipwRCk.setParent(view);
                } else if (or5nbo9ku.GPLPRo6go() != null) {
                    int i4 = or5nbo9ku.GPLPRo6go().iiGwOFFnr;
                    if (i4 == tpuv1V0a9.dIocxURUo.getSemanticsOwner().q3BipwRCk().iiGwOFFnr) {
                        i4 = -1;
                    }
                    AndroidComposeView androidComposeView2 = tpuv1V0a9.dIocxURUo;
                    CBQ5d1kRq.J4Ux7ym32 = i4;
                    CBQ5d1kRq.q3BipwRCk.setParent(androidComposeView2, i4);
                } else {
                    throw new IllegalStateException("semanticsNode " + i + " has null parent");
                }
                AndroidComposeView androidComposeView3 = tpuv1V0a9.dIocxURUo;
                CBQ5d1kRq.tGV7Q6urW = i;
                CBQ5d1kRq.q3BipwRCk.setSource(androidComposeView3, i);
                Rect rect = bIRL6IXtO.J4Ux7ym32;
                long oon79WMrY = tpuv1V0a9.dIocxURUo.oon79WMrY(ODug2UCW1.dIocxURUo((float) rect.left, (float) rect.top));
                long oon79WMrY2 = tpuv1V0a9.dIocxURUo.oon79WMrY(ODug2UCW1.dIocxURUo((float) rect.right, (float) rect.bottom));
                CBQ5d1kRq.q3BipwRCk.setBoundsInScreen(new Rect((int) ((float) Math.floor((double) bRgfgYIQX.tGV7Q6urW(oon79WMrY))), (int) ((float) Math.floor((double) bRgfgYIQX.dIocxURUo(oon79WMrY))), (int) ((float) Math.ceil((double) bRgfgYIQX.tGV7Q6urW(oon79WMrY2))), (int) ((float) Math.ceil((double) bRgfgYIQX.dIocxURUo(oon79WMrY2)))));
                CBQ5d1kRq.q3BipwRCk.setClassName("android.view.View");
                ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
                VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
                qDffvYFss qdffvyfss = (qDffvYFss) xP6F5SR9v.Bhmn1KIah(ogg45sslv, VSVuhz7Ow.ilHKhw3Yw);
                int i5 = 2;
                if (qdffvyfss != null) {
                    int i6 = qdffvyfss.q3BipwRCk;
                    if (or5nbo9ku.tGV7Q6urW || or5nbo9ku.yWvV4ePLl().isEmpty()) {
                        ksLrMHgEz kslrmhgez = qDffvYFss.J4Ux7ym32;
                        ksLrMHgEz kslrmhgez2 = qDffvYFss.J4Ux7ym32;
                        if (qDffvYFss.q3BipwRCk(qdffvyfss.q3BipwRCk, 4)) {
                            CBQ5d1kRq.q3BipwRCk.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", tpuv1V0a9.dIocxURUo.getContext().getResources().getString(R.string.tab));
                        } else {
                            String str3 = qDffvYFss.q3BipwRCk(i6, 0) ? "android.widget.Button" : qDffvYFss.q3BipwRCk(i6, 1) ? "android.widget.CheckBox" : qDffvYFss.q3BipwRCk(i6, 2) ? "android.widget.Switch" : qDffvYFss.q3BipwRCk(i6, 3) ? "android.widget.RadioButton" : qDffvYFss.q3BipwRCk(i6, 5) ? "android.widget.ImageView" : null;
                            if (!qDffvYFss.q3BipwRCk(qdffvyfss.q3BipwRCk, 5) || p62TZmTyO.WaUP0CF08(or5nbo9ku.GPLPRo6go, JHFXdtjfx.qFBXIgpia) == null || or5nbo9ku.kCA6Zs9sL.kmSgne1rO) {
                                CBQ5d1kRq.q3BipwRCk.setClassName(str3);
                            }
                        }
                    }
                }
                ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
                JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
                if (ogg45sslv2.J4Ux7ym32(JCsIEQgIX.yWvV4ePLl)) {
                    CBQ5d1kRq.q3BipwRCk.setClassName("android.widget.EditText");
                }
                CBQ5d1kRq.q3BipwRCk.setPackageName(tpuv1V0a9.dIocxURUo.getContext().getPackageName());
                List kCA6Zs9sL = or5nbo9ku.kCA6Zs9sL(true, false, true);
                int size = kCA6Zs9sL.size() - 1;
                if (size >= 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        or5nbo9ku or5nbo9ku2 = (or5nbo9ku) kCA6Zs9sL.get(i7);
                        if (tpuv1V0a9.MzoOEjc4X().containsKey(Integer.valueOf(or5nbo9ku2.iiGwOFFnr))) {
                            K6PL0z3I0.q3BipwRCk(tpuv1V0a9.dIocxURUo.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(or5nbo9ku2.GPLPRo6go));
                            CBQ5d1kRq.q3BipwRCk.addChild(tpuv1V0a9.dIocxURUo, or5nbo9ku2.iiGwOFFnr);
                        }
                        if (i8 <= size) {
                            i7 = i8;
                        }
                    }
                }
                if (tpuv1V0a9.yWvV4ePLl == i) {
                    CBQ5d1kRq.q3BipwRCk.setAccessibilityFocused(true);
                    rG2GI7LDp = IqwHQ6O2l.RG2GI7LDp.GPLPRo6go;
                } else {
                    CBQ5d1kRq.q3BipwRCk.setAccessibilityFocused(false);
                    rG2GI7LDp = IqwHQ6O2l.RG2GI7LDp.iiGwOFFnr;
                }
                CBQ5d1kRq.q3BipwRCk(rG2GI7LDp);
                joIJ4ANvK qVUwofr5s = tpuv1V0a9.qVUwofr5s(or5nbo9ku.kCA6Zs9sL);
                SpannableString spannableString = (SpannableString) tpuv1V0a9.mUqPm6GBh(qVUwofr5s == null ? null : D3DEikrvb.sk5s77z6Q(qVUwofr5s, tpuv1V0a9.dIocxURUo.getDensity(), tpuv1V0a9.dIocxURUo.getFontLoader()), 100000);
                ogG45sslV ogg45sslv3 = or5nbo9ku.kCA6Zs9sL;
                VSVuhz7Ow vSVuhz7Ow2 = VSVuhz7Ow.q3BipwRCk;
                List list = (List) xP6F5SR9v.Bhmn1KIah(ogg45sslv3, VSVuhz7Ow.Eeka1udhb);
                spannableString = (SpannableString) tpuv1V0a9.mUqPm6GBh((list == null || (joij4anvk = (joIJ4ANvK) wkFJfVmcv.QNqj6nIzv(list)) == null) ? null : D3DEikrvb.sk5s77z6Q(joij4anvk, tpuv1V0a9.dIocxURUo.getDensity(), tpuv1V0a9.dIocxURUo.getFontLoader()), 100000);
                if (spannableString == null) {
                }
                CBQ5d1kRq.q3BipwRCk.setText(spannableString);
                ogG45sslV ogg45sslv4 = or5nbo9ku.kCA6Zs9sL;
                SHlGWJTIu sHlGWJTIu = VSVuhz7Ow.dfpT1j18n;
                if (ogg45sslv4.CBQ5d1kRq.containsKey(sHlGWJTIu)) {
                    CBQ5d1kRq.q3BipwRCk.setContentInvalid(true);
                    CBQ5d1kRq.q3BipwRCk.setError((CharSequence) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, sHlGWJTIu));
                }
                CBQ5d1kRq.ilHKhw3Yw((CharSequence) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.tGV7Q6urW));
                S7mdSVsUi s7mdSVsUi = (S7mdSVsUi) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.WaUP0CF08);
                if (s7mdSVsUi != null) {
                    CBQ5d1kRq.q3BipwRCk.setCheckable(true);
                    int ordinal = s7mdSVsUi.ordinal();
                    if (ordinal == 0) {
                        CBQ5d1kRq.q3BipwRCk.setChecked(true);
                        ksLrMHgEz kslrmhgez3 = qDffvYFss.J4Ux7ym32;
                        ksLrMHgEz kslrmhgez4 = qDffvYFss.J4Ux7ym32;
                        if (qdffvyfss == null) {
                            z2 = false;
                        } else {
                            z2 = qDffvYFss.q3BipwRCk(qdffvyfss.q3BipwRCk, 2);
                        }
                        if (z2 && CBQ5d1kRq.Puu3Rhg4F() == null) {
                            resources2 = tpuv1V0a9.dIocxURUo.getContext().getResources();
                            i3 = R.string.on;
                            CBQ5d1kRq.ilHKhw3Yw(resources2.getString(i3));
                        }
                    } else if (ordinal == 1) {
                        CBQ5d1kRq.q3BipwRCk.setChecked(false);
                        ksLrMHgEz kslrmhgez5 = qDffvYFss.J4Ux7ym32;
                        ksLrMHgEz kslrmhgez6 = qDffvYFss.J4Ux7ym32;
                        if (qdffvyfss == null) {
                            z3 = false;
                        } else {
                            z3 = qDffvYFss.q3BipwRCk(qdffvyfss.q3BipwRCk, 2);
                        }
                        if (z3 && CBQ5d1kRq.Puu3Rhg4F() == null) {
                            resources2 = tpuv1V0a9.dIocxURUo.getContext().getResources();
                            i3 = R.string.off;
                            CBQ5d1kRq.ilHKhw3Yw(resources2.getString(i3));
                        }
                    } else if (ordinal == 2 && CBQ5d1kRq.Puu3Rhg4F() == null) {
                        resources2 = tpuv1V0a9.dIocxURUo.getContext().getResources();
                        i3 = R.string.indeterminate;
                        CBQ5d1kRq.ilHKhw3Yw(resources2.getString(i3));
                    }
                }
                ogG45sslV ogg45sslv5 = or5nbo9ku.kCA6Zs9sL;
                SHlGWJTIu sHlGWJTIu2 = VSVuhz7Ow.sk5s77z6Q;
                Boolean bool = (Boolean) xP6F5SR9v.Bhmn1KIah(ogg45sslv5, sHlGWJTIu2);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    ksLrMHgEz kslrmhgez7 = qDffvYFss.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez8 = qDffvYFss.J4Ux7ym32;
                    if (qdffvyfss == null) {
                        z = false;
                    } else {
                        z = qDffvYFss.q3BipwRCk(qdffvyfss.q3BipwRCk, 4);
                    }
                    if (z) {
                        CBQ5d1kRq.q3BipwRCk.setSelected(booleanValue);
                    } else {
                        CBQ5d1kRq.q3BipwRCk.setCheckable(true);
                        CBQ5d1kRq.q3BipwRCk.setChecked(booleanValue);
                        if (CBQ5d1kRq.Puu3Rhg4F() == null) {
                            if (booleanValue) {
                                resources = tpuv1V0a9.dIocxURUo.getContext().getResources();
                                i2 = R.string.selected;
                            } else {
                                resources = tpuv1V0a9.dIocxURUo.getContext().getResources();
                                i2 = R.string.not_selected;
                            }
                            CBQ5d1kRq.ilHKhw3Yw(resources.getString(i2));
                        }
                    }
                }
                if (!or5nbo9ku.kCA6Zs9sL.kmSgne1rO || or5nbo9ku.yWvV4ePLl().isEmpty()) {
                    List list2 = (List) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.J4Ux7ym32);
                    CBQ5d1kRq.q3BipwRCk.setContentDescription(list2 == null ? null : (String) wkFJfVmcv.QNqj6nIzv(list2));
                }
                if (or5nbo9ku.kCA6Zs9sL.kmSgne1rO) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        CBQ5d1kRq.q3BipwRCk.setScreenReaderFocusable(true);
                    } else {
                        CBQ5d1kRq.kmSgne1rO(1, true);
                    }
                }
                if (((qih4lW99W) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.yWvV4ePLl)) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        CBQ5d1kRq.q3BipwRCk.setHeading(true);
                    } else {
                        CBQ5d1kRq.kmSgne1rO(2, true);
                    }
                }
                CBQ5d1kRq.q3BipwRCk.setPassword(or5nbo9ku.iiGwOFFnr().CBQ5d1kRq.containsKey(VSVuhz7Ow.i8XZMQc6Z));
                ogG45sslV ogg45sslv6 = or5nbo9ku.kCA6Zs9sL;
                JCsIEQgIX jCsIEQgIX2 = JCsIEQgIX.q3BipwRCk;
                SHlGWJTIu sHlGWJTIu3 = JCsIEQgIX.yWvV4ePLl;
                CBQ5d1kRq.q3BipwRCk.setEditable(ogg45sslv6.J4Ux7ym32(sHlGWJTIu3));
                CBQ5d1kRq.q3BipwRCk.setEnabled(p62TZmTyO.vPSbyrYWX(or5nbo9ku));
                ogG45sslV ogg45sslv7 = or5nbo9ku.kCA6Zs9sL;
                SHlGWJTIu sHlGWJTIu4 = VSVuhz7Ow.CBQ5d1kRq;
                CBQ5d1kRq.q3BipwRCk.setFocusable(ogg45sslv7.CBQ5d1kRq.containsKey(sHlGWJTIu4));
                if (CBQ5d1kRq.oon79WMrY()) {
                    CBQ5d1kRq.q3BipwRCk.setFocused(((Boolean) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu4)).booleanValue());
                    if (CBQ5d1kRq.vPSbyrYWX()) {
                        CBQ5d1kRq.q3BipwRCk.addAction(2);
                    } else {
                        CBQ5d1kRq.q3BipwRCk.addAction(1);
                    }
                }
                if (or5nbo9ku.tGV7Q6urW) {
                    or5nbo9ku GPLPRo6go = or5nbo9ku.GPLPRo6go();
                    mhjbbkjel = GPLPRo6go == null ? null : GPLPRo6go.tGV7Q6urW();
                } else {
                    mhjbbkjel = or5nbo9ku.tGV7Q6urW();
                }
                CBQ5d1kRq.q3BipwRCk.setVisibleToUser(!(mhjbbkjel == null ? false : mhjbbkjel.YmNRDyka4()) && xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.kmSgne1rO) == null);
                ExalH1Y2t exalH1Y2t = (ExalH1Y2t) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.vPSbyrYWX);
                if (exalH1Y2t != null) {
                    int i9 = exalH1Y2t.q3BipwRCk;
                    oWhsE8IPp owhse8ipp = ExalH1Y2t.J4Ux7ym32;
                    oWhsE8IPp owhse8ipp2 = ExalH1Y2t.J4Ux7ym32;
                    if (ExalH1Y2t.q3BipwRCk(i9, 0) || !ExalH1Y2t.q3BipwRCk(i9, 1)) {
                        i5 = 1;
                    }
                    CBQ5d1kRq.q3BipwRCk.setLiveRegion(i5);
                }
                CBQ5d1kRq.q3BipwRCk.setClickable(false);
                ngczBF8du ngczbf8du2 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.tGV7Q6urW);
                if (ngczbf8du2 != null) {
                    boolean tGV7Q6urW = anXlDk6fV.tGV7Q6urW(xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, sHlGWJTIu2), Boolean.TRUE);
                    CBQ5d1kRq.q3BipwRCk.setClickable(!tGV7Q6urW);
                    if (p62TZmTyO.vPSbyrYWX(or5nbo9ku) && !tGV7Q6urW) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(16, ngczbf8du2.q3BipwRCk).q3BipwRCk);
                    }
                }
                CBQ5d1kRq.q3BipwRCk.setLongClickable(false);
                ngczBF8du ngczbf8du3 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.dIocxURUo);
                if (ngczbf8du3 != null) {
                    CBQ5d1kRq.q3BipwRCk.setLongClickable(true);
                    if (p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(32, ngczbf8du3.q3BipwRCk).q3BipwRCk);
                    }
                }
                ngczBF8du ngczbf8du4 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.oon79WMrY);
                if (ngczbf8du4 != null) {
                    CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(16384, ngczbf8du4.q3BipwRCk).q3BipwRCk);
                }
                if (p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                    ngczBF8du ngczbf8du5 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, sHlGWJTIu3);
                    if (ngczbf8du5 != null) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(2097152, ngczbf8du5.q3BipwRCk).q3BipwRCk);
                    }
                    ngczBF8du ngczbf8du6 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.vPSbyrYWX);
                    if (ngczbf8du6 != null) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(65536, ngczbf8du6.q3BipwRCk).q3BipwRCk);
                    }
                    ngczBF8du ngczbf8du7 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.CBQ5d1kRq);
                    if (ngczbf8du7 != null && CBQ5d1kRq.vPSbyrYWX() && tpuv1V0a9.dIocxURUo.getClipboardManager().J4Ux7ym32()) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(32768, ngczbf8du7.q3BipwRCk).q3BipwRCk);
                    }
                }
                String ilHKhw3Yw = tpuv1V0a9.ilHKhw3Yw(or5nbo9ku);
                if (!(ilHKhw3Yw == null || ilHKhw3Yw.length() == 0)) {
                    CBQ5d1kRq.q3BipwRCk.setTextSelection(tpuv1V0a9.PSTqBLTET(or5nbo9ku), tpuv1V0a9.Bhmn1KIah(or5nbo9ku));
                    ngczBF8du ngczbf8du8 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.Puu3Rhg4F);
                    if (ngczbf8du8 == null) {
                        str2 = null;
                    } else {
                        str2 = ngczbf8du8.q3BipwRCk;
                    }
                    CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(131072, str2).q3BipwRCk);
                    CBQ5d1kRq.q3BipwRCk.addAction(256);
                    CBQ5d1kRq.q3BipwRCk.addAction(512);
                    CBQ5d1kRq.q3BipwRCk.setMovementGranularities(11);
                    List list3 = (List) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.J4Ux7ym32);
                    if ((list3 == null || list3.isEmpty()) && or5nbo9ku.kCA6Zs9sL.J4Ux7ym32(JCsIEQgIX.J4Ux7ym32) && !p62TZmTyO.CBQ5d1kRq(or5nbo9ku)) {
                        CBQ5d1kRq.q3BipwRCk.setMovementGranularities(CBQ5d1kRq.GPLPRo6go() | 4 | 16);
                    }
                }
                ArrayList arrayList = new ArrayList();
                CharSequence yWvV4ePLl = CBQ5d1kRq.yWvV4ePLl();
                if (!(yWvV4ePLl == null || yWvV4ePLl.length() == 0) && or5nbo9ku.kCA6Zs9sL.J4Ux7ym32(JCsIEQgIX.J4Ux7ym32)) {
                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (or5nbo9ku.kCA6Zs9sL.CBQ5d1kRq.containsKey(VSVuhz7Ow.qVUwofr5s)) {
                    arrayList.add("androidx.compose.ui.semantics.testTag");
                }
                if (!arrayList.isEmpty()) {
                    Ic7MUKoM6.q3BipwRCk.q3BipwRCk(CBQ5d1kRq.q3BipwRCk, arrayList);
                }
                dGwOm42fX dgwom42fx = (dGwOm42fX) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.dIocxURUo);
                if (dgwom42fx != null) {
                    ogG45sslV ogg45sslv8 = or5nbo9ku.kCA6Zs9sL;
                    SHlGWJTIu sHlGWJTIu5 = JCsIEQgIX.GPLPRo6go;
                    CBQ5d1kRq.q3BipwRCk.setClassName(ogg45sslv8.J4Ux7ym32(sHlGWJTIu5) ? "android.widget.SeekBar" : "android.widget.ProgressBar");
                    uEb6wTQlg ueb6wtqlg = dGwOm42fX.dIocxURUo;
                    uEb6wTQlg ueb6wtqlg2 = dGwOm42fX.dIocxURUo;
                    if (dgwom42fx != dGwOm42fX.kCA6Zs9sL) {
                        CBQ5d1kRq.q3BipwRCk.setRangeInfo((AccessibilityNodeInfo.RangeInfo) DGdyNqLvN.dIocxURUo(1, ((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue(), ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue(), dgwom42fx.q3BipwRCk).J4Ux7ym32);
                        if (CBQ5d1kRq.Puu3Rhg4F() == null) {
                            WLosHMQ8L wLosHMQ8L = dgwom42fx.J4Ux7ym32;
                            if (((Number) wLosHMQ8L.q3BipwRCk()).floatValue() - ((Number) wLosHMQ8L.J4Ux7ym32()).floatValue() == 0.0f) {
                                f2 = 0.0f;
                            } else {
                                f2 = (dgwom42fx.q3BipwRCk - ((Number) wLosHMQ8L.J4Ux7ym32()).floatValue()) / (((Number) wLosHMQ8L.q3BipwRCk()).floatValue() - ((Number) wLosHMQ8L.J4Ux7ym32()).floatValue());
                            }
                            float dIocxURUo = cT9gik1zL.dIocxURUo(f2, 0.0f, 1.0f);
                            int i10 = 100;
                            if (dIocxURUo == 0.0f) {
                                i10 = 0;
                            } else {
                                if (!(dIocxURUo == 1.0f)) {
                                    i10 = cT9gik1zL.kCA6Zs9sL(D3DEikrvb.Eeka1udhb(dIocxURUo * ((float) 100)), 1, 99);
                                }
                            }
                            str = tpuv1V0a9.dIocxURUo.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i10));
                            CBQ5d1kRq.ilHKhw3Yw(str);
                        }
                        if (or5nbo9ku.kCA6Zs9sL.J4Ux7ym32(sHlGWJTIu5) && p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                            f = dgwom42fx.q3BipwRCk;
                            floatValue = ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue();
                            floatValue2 = ((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue();
                            if (floatValue < floatValue2) {
                                floatValue = floatValue2;
                            }
                            if (f < floatValue) {
                                CBQ5d1kRq.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.Puu3Rhg4F);
                            }
                            if (dgwom42fx.q3BipwRCk > cT9gik1zL.q3BipwRCk(((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue(), ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue())) {
                                CBQ5d1kRq.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.yWvV4ePLl);
                            }
                        }
                    } else {
                        if (CBQ5d1kRq.Puu3Rhg4F() == null) {
                            str = tpuv1V0a9.dIocxURUo.getContext().getResources().getString(R.string.in_progress);
                            CBQ5d1kRq.ilHKhw3Yw(str);
                        }
                        if (or5nbo9ku.kCA6Zs9sL.J4Ux7ym32(sHlGWJTIu5)) {
                            f = dgwom42fx.q3BipwRCk;
                            floatValue = ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue();
                            floatValue2 = ((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue();
                            if (floatValue < floatValue2) {
                            }
                            if (f < floatValue) {
                            }
                            if (dgwom42fx.q3BipwRCk > cT9gik1zL.q3BipwRCk(((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue(), ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue())) {
                            }
                        }
                    }
                }
                if (p62TZmTyO.vPSbyrYWX(or5nbo9ku) && (ngczbf8du = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.GPLPRo6go)) != null) {
                    CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(16908349, ngczbf8du.q3BipwRCk).q3BipwRCk);
                }
                BBVaGLNaU.o4LF8RkoQ(or5nbo9ku, CBQ5d1kRq);
                BBVaGLNaU.V9LQMKGJe(or5nbo9ku, CBQ5d1kRq);
                niYpoU8Cm niypou8cm = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.Bhmn1KIah);
                ngczBF8du ngczbf8du9 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.kCA6Zs9sL);
                if (!(niypou8cm == null || ngczbf8du9 == null)) {
                    if (!BBVaGLNaU.cAwN510t2(or5nbo9ku)) {
                        CBQ5d1kRq.q3BipwRCk.setClassName("android.widget.HorizontalScrollView");
                    }
                    if (((Number) niypou8cm.J4Ux7ym32.GPLPRo6go()).floatValue() > 0.0f) {
                        CBQ5d1kRq.q3BipwRCk.setScrollable(true);
                    }
                    if (p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                        if (!Tpuv1V0a9.sk5s77z6Q(niypou8cm)) {
                            CBQ5d1kRq.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.yWvV4ePLl);
                            break;
                        } else {
                            CBQ5d1kRq.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.Puu3Rhg4F);
                            break;
                        }
                        CBQ5d1kRq.q3BipwRCk(rG2GI7LDp3);
                    }
                }
                niYpoU8Cm niypou8cm2 = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.PSTqBLTET);
                if (!(niypou8cm2 == null || ngczbf8du9 == null)) {
                    if (!BBVaGLNaU.cAwN510t2(or5nbo9ku)) {
                        CBQ5d1kRq.q3BipwRCk.setClassName("android.widget.ScrollView");
                    }
                    if (((Number) niypou8cm2.J4Ux7ym32.GPLPRo6go()).floatValue() > 0.0f) {
                        CBQ5d1kRq.q3BipwRCk.setScrollable(true);
                    }
                    if (p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                        if (Tpuv1V0a9.sk5s77z6Q(niypou8cm2)) {
                            CBQ5d1kRq.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.Puu3Rhg4F);
                            rG2GI7LDp2 = IqwHQ6O2l.RG2GI7LDp.PSTqBLTET;
                        } else {
                            CBQ5d1kRq.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.yWvV4ePLl);
                            rG2GI7LDp2 = IqwHQ6O2l.RG2GI7LDp.kmSgne1rO;
                        }
                        CBQ5d1kRq.q3BipwRCk(rG2GI7LDp2);
                    }
                }
                CBQ5d1kRq.MzoOEjc4X((CharSequence) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.kCA6Zs9sL));
                if (p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                    ngczBF8du ngczbf8du10 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.kmSgne1rO);
                    if (ngczbf8du10 != null) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(262144, ngczbf8du10.q3BipwRCk).q3BipwRCk);
                    }
                    ngczBF8du ngczbf8du11 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.Bhmn1KIah);
                    if (ngczbf8du11 != null) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(524288, ngczbf8du11.q3BipwRCk).q3BipwRCk);
                    }
                    ngczBF8du ngczbf8du12 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, JCsIEQgIX.PSTqBLTET);
                    if (ngczbf8du12 != null) {
                        CBQ5d1kRq.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) new IqwHQ6O2l.RG2GI7LDp(1048576, ngczbf8du12.q3BipwRCk).q3BipwRCk);
                    }
                    ogG45sslV ogg45sslv9 = or5nbo9ku.kCA6Zs9sL;
                    SHlGWJTIu sHlGWJTIu6 = JCsIEQgIX.MzoOEjc4X;
                    if (ogg45sslv9.J4Ux7ym32(sHlGWJTIu6)) {
                        List list4 = (List) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu6);
                        int size2 = list4.size();
                        int[] iArr = Tpuv1V0a9.dfpT1j18n;
                        if (size2 < iArr.length) {
                            aT3qVrmRB at3qvrmrb = new aT3qVrmRB();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (tpuv1V0a9.vPSbyrYWX.tGV7Q6urW(i)) {
                                Map map = (Map) tpuv1V0a9.vPSbyrYWX.kCA6Zs9sL(i, null);
                                List o4LF8RkoQ = Jefa2ExbR.o4LF8RkoQ(iArr);
                                ArrayList arrayList2 = new ArrayList();
                                if (list4.size() - 1 >= 0) {
                                    K6PL0z3I0.q3BipwRCk(list4.get(0));
                                    throw null;
                                } else if (arrayList2.size() - 1 >= 0) {
                                    K6PL0z3I0.q3BipwRCk(arrayList2.get(0));
                                    ((Number) ((ArrayList) o4LF8RkoQ).get(0)).intValue();
                                    throw null;
                                }
                            } else if (list4.size() - 1 >= 0) {
                                K6PL0z3I0.q3BipwRCk(list4.get(0));
                                int i11 = iArr[0];
                                throw null;
                            }
                            tpuv1V0a9.oon79WMrY.GPLPRo6go(i, at3qvrmrb);
                            tpuv1V0a9.vPSbyrYWX.GPLPRo6go(i, linkedHashMap);
                        } else {
                            throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                        }
                    }
                }
                return CBQ5d1kRq.q3BipwRCk;
            default:
                IqwHQ6O2l q3BipwRCk = ((DGdyNqLvN) this.J4Ux7ym32).q3BipwRCk(i);
                if (q3BipwRCk == null) {
                    return null;
                }
                return q3BipwRCk.q3BipwRCk;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        switch (this.q3BipwRCk) {
            case 1:
                Objects.requireNonNull((DGdyNqLvN) this.J4Ux7ym32);
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ee, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0210, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0232, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0254, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0276, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0367, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03cd, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0409, code lost:
        if (r1 != null) goto L_0x04c8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c4, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04c8, code lost:
        r1 = r1.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x052e, code lost:
        if (r1 != 16) goto L_0x05fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r2 == null) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r3 = con.JCsIEQgIX.q3BipwRCk;
        r2 = (con.ngczBF8du) con.xP6F5SR9v.Bhmn1KIah(r2, con.JCsIEQgIX.kCA6Zs9sL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r2 == null) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01aa, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cc, code lost:
        if (r1 == null) goto L_0x06a9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [con.JHsfNVnhw] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [con.Xqme2uw0r] */
    /* JADX WARN: Type inference failed for: r11v4, types: [con.Xqme2uw0r, con.pVANwMywy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [con.Xqme2uw0r, con.qSZNdC5Zx, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        Xqme2uw0r xqme2uw0r;
        boolean z;
        Boolean bool;
        gdEmqfwpT gdemqfwpt;
        PmanMZxiM pmanMZxiM;
        long j;
        ogG45sslV iiGwOFFnr;
        CharSequence charSequence;
        switch (this.q3BipwRCk) {
            case 0:
                Tpuv1V0a9 tpuv1V0a9 = (Tpuv1V0a9) this.J4Ux7ym32;
                BIRL6IXtO bIRL6IXtO = (BIRL6IXtO) tpuv1V0a9.MzoOEjc4X().get(Integer.valueOf(i));
                boolean z2 = true;
                boolean z3 = false;
                if (bIRL6IXtO != null) {
                    or5nbo9ku or5nbo9ku = bIRL6IXtO.q3BipwRCk;
                    ?? r11 = 0;
                    bRgfgYIQX brgfgyiqx = null;
                    qih4lW99W qih4lw99w = null;
                    r11 = 0;
                    r11 = 0;
                    r11 = 0;
                    if (i2 != 64) {
                        if (i2 != 128) {
                            int i5 = -1;
                            if (i2 != 256 && i2 != 512) {
                                if (i2 == 16384) {
                                    ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
                                    JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
                                    ngczBF8du ngczbf8du = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv, JCsIEQgIX.oon79WMrY);
                                    if (ngczbf8du != null) {
                                        gdEmqfwpT gdemqfwpt2 = (gdEmqfwpT) ngczbf8du.J4Ux7ym32;
                                        if (gdemqfwpt2 != null) {
                                            bool = (Boolean) gdemqfwpt2.GPLPRo6go();
                                            break;
                                        }
                                    }
                                } else if (i2 == 131072) {
                                    int i6 = bundle == null ? -1 : bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                    if (bundle != null) {
                                        i5 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                                    }
                                    boolean AqaWJg0b4 = tpuv1V0a9.AqaWJg0b4(or5nbo9ku, i6, i5, false);
                                    if (!AqaWJg0b4) {
                                        return AqaWJg0b4;
                                    }
                                    tpuv1V0a9.dfpT1j18n(tpuv1V0a9.WaUP0CF08(or5nbo9ku.iiGwOFFnr), 0, null, null);
                                    return AqaWJg0b4;
                                } else if (p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
                                    if (i2 == 1) {
                                        ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
                                        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
                                        if (anXlDk6fV.tGV7Q6urW(xP6F5SR9v.Bhmn1KIah(ogg45sslv2, VSVuhz7Ow.CBQ5d1kRq), Boolean.FALSE)) {
                                            KB2jjcOAK ziwPzaoF3 = or5nbo9ku.GPLPRo6go.V9LQMKGJe.ilHKhw3Yw.ziwPzaoF3();
                                            if (ziwPzaoF3 != null) {
                                                p62TZmTyO.AqaWJg0b4(ziwPzaoF3, false);
                                                qih4lw99w = qih4lW99W.q3BipwRCk;
                                            }
                                            if (qih4lw99w != null) {
                                                return true;
                                            }
                                        }
                                    } else if (i2 != 2) {
                                        switch (i2) {
                                            case 16:
                                                ogG45sslV ogg45sslv3 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX2 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du2 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv3, JCsIEQgIX.tGV7Q6urW);
                                                Boolean bool2 = (ngczbf8du2 == null || (gdemqfwpt = (gdEmqfwpT) ngczbf8du2.J4Ux7ym32) == null) ? null : (Boolean) gdemqfwpt.GPLPRo6go();
                                                tpuv1V0a9.dfpT1j18n(i, 1, null, null);
                                                if (bool2 != null) {
                                                    z = bool2.booleanValue();
                                                    break;
                                                }
                                                break;
                                            case 32:
                                                ogG45sslV ogg45sslv4 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX3 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du3 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv4, JCsIEQgIX.dIocxURUo);
                                                if (ngczbf8du3 != null) {
                                                    gdEmqfwpT gdemqfwpt3 = (gdEmqfwpT) ngczbf8du3.J4Ux7ym32;
                                                    if (gdemqfwpt3 != null) {
                                                        bool = (Boolean) gdemqfwpt3.GPLPRo6go();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 4096:
                                            case 8192:
                                                boolean z4 = i2 == 4096;
                                                boolean z5 = i2 == 8192;
                                                boolean z6 = i2 == 16908345;
                                                boolean z7 = i2 == 16908347;
                                                boolean z8 = i2 == 16908344;
                                                boolean z9 = i2 == 16908346;
                                                boolean z10 = z6 || z7 || z4 || z5;
                                                boolean z11 = z8 || z9 || z4 || z5;
                                                if (z4 || z5) {
                                                    ogG45sslV ogg45sslv5 = or5nbo9ku.kCA6Zs9sL;
                                                    VSVuhz7Ow vSVuhz7Ow2 = VSVuhz7Ow.q3BipwRCk;
                                                    dGwOm42fX dgwom42fx = (dGwOm42fX) xP6F5SR9v.Bhmn1KIah(ogg45sslv5, VSVuhz7Ow.dIocxURUo);
                                                    ogG45sslV ogg45sslv6 = or5nbo9ku.kCA6Zs9sL;
                                                    JCsIEQgIX jCsIEQgIX4 = JCsIEQgIX.q3BipwRCk;
                                                    ngczBF8du ngczbf8du4 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv6, JCsIEQgIX.GPLPRo6go);
                                                    if (!(dgwom42fx == null || ngczbf8du4 == null)) {
                                                        float floatValue = ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue();
                                                        float floatValue2 = ((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue();
                                                        if (floatValue < floatValue2) {
                                                            floatValue = floatValue2;
                                                        }
                                                        float q3BipwRCk = cT9gik1zL.q3BipwRCk(((Number) dgwom42fx.J4Ux7ym32.J4Ux7ym32()).floatValue(), ((Number) dgwom42fx.J4Ux7ym32.q3BipwRCk()).floatValue());
                                                        int i7 = dgwom42fx.tGV7Q6urW;
                                                        float f = (floatValue - q3BipwRCk) / (i7 > 0 ? (float) (i7 + 1) : (float) 20);
                                                        if (z5) {
                                                            f = -f;
                                                        }
                                                        PmanMZxiM pmanMZxiM2 = (PmanMZxiM) ngczbf8du4.J4Ux7ym32;
                                                        if (pmanMZxiM2 != null) {
                                                            bool = (Boolean) pmanMZxiM2.IytU16YUK(Float.valueOf(dgwom42fx.q3BipwRCk + f));
                                                            break;
                                                        }
                                                    }
                                                }
                                                long tGV7Q6urW = p62TZmTyO.MzoOEjc4X(or5nbo9ku.GPLPRo6go.o4LF8RkoQ).tGV7Q6urW();
                                                ogG45sslV ogg45sslv7 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX5 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du5 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv7, JCsIEQgIX.kCA6Zs9sL);
                                                if (ngczbf8du5 != null) {
                                                    ogG45sslV ogg45sslv8 = or5nbo9ku.kCA6Zs9sL;
                                                    VSVuhz7Ow vSVuhz7Ow3 = VSVuhz7Ow.q3BipwRCk;
                                                    niYpoU8Cm niypou8cm = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(ogg45sslv8, VSVuhz7Ow.Bhmn1KIah);
                                                    if (niypou8cm != null && z10) {
                                                        float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(tGV7Q6urW);
                                                        if (z6 || z5) {
                                                            kCA6Zs9sL = -kCA6Zs9sL;
                                                        }
                                                        if (niypou8cm.tGV7Q6urW) {
                                                            kCA6Zs9sL = -kCA6Zs9sL;
                                                        }
                                                        if (p62TZmTyO.kmSgne1rO(or5nbo9ku) && (z6 || z7)) {
                                                            kCA6Zs9sL = -kCA6Zs9sL;
                                                        }
                                                        if (Tpuv1V0a9.RG6kpfv3v(niypou8cm, kCA6Zs9sL)) {
                                                            kkcQgCx5G kkcqgcx5g = (kkcQgCx5G) ngczbf8du5.J4Ux7ym32;
                                                            if (kkcqgcx5g != null) {
                                                                bool = (Boolean) kkcqgcx5g.WaUP0CF08(Float.valueOf(kCA6Zs9sL), Float.valueOf(0.0f));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    niYpoU8Cm niypou8cm2 = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.PSTqBLTET);
                                                    if (niypou8cm2 != null && z11) {
                                                        float tGV7Q6urW2 = tbzY8QG6X.tGV7Q6urW(tGV7Q6urW);
                                                        if (z8 || z5) {
                                                            tGV7Q6urW2 = -tGV7Q6urW2;
                                                        }
                                                        if (niypou8cm2.tGV7Q6urW) {
                                                            tGV7Q6urW2 = -tGV7Q6urW2;
                                                        }
                                                        if (Tpuv1V0a9.RG6kpfv3v(niypou8cm2, tGV7Q6urW2)) {
                                                            kkcQgCx5G kkcqgcx5g2 = (kkcQgCx5G) ngczbf8du5.J4Ux7ym32;
                                                            if (kkcqgcx5g2 != null) {
                                                                bool = (Boolean) kkcqgcx5g2.WaUP0CF08(Float.valueOf(0.0f), Float.valueOf(tGV7Q6urW2));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case 32768:
                                                ogG45sslV ogg45sslv9 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX6 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du6 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv9, JCsIEQgIX.CBQ5d1kRq);
                                                if (ngczbf8du6 != null) {
                                                    gdEmqfwpT gdemqfwpt4 = (gdEmqfwpT) ngczbf8du6.J4Ux7ym32;
                                                    if (gdemqfwpt4 != null) {
                                                        bool = (Boolean) gdemqfwpt4.GPLPRo6go();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 65536:
                                                ogG45sslV ogg45sslv10 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX7 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du7 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv10, JCsIEQgIX.vPSbyrYWX);
                                                if (ngczbf8du7 != null) {
                                                    gdEmqfwpT gdemqfwpt5 = (gdEmqfwpT) ngczbf8du7.J4Ux7ym32;
                                                    if (gdemqfwpt5 != null) {
                                                        bool = (Boolean) gdemqfwpt5.GPLPRo6go();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 262144:
                                                ogG45sslV ogg45sslv11 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX8 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du8 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv11, JCsIEQgIX.kmSgne1rO);
                                                if (ngczbf8du8 != null) {
                                                    gdEmqfwpT gdemqfwpt6 = (gdEmqfwpT) ngczbf8du8.J4Ux7ym32;
                                                    if (gdemqfwpt6 != null) {
                                                        bool = (Boolean) gdemqfwpt6.GPLPRo6go();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 524288:
                                                ogG45sslV ogg45sslv12 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX9 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du9 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv12, JCsIEQgIX.Bhmn1KIah);
                                                if (ngczbf8du9 != null) {
                                                    gdEmqfwpT gdemqfwpt7 = (gdEmqfwpT) ngczbf8du9.J4Ux7ym32;
                                                    if (gdemqfwpt7 != null) {
                                                        bool = (Boolean) gdemqfwpt7.GPLPRo6go();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 1048576:
                                                ogG45sslV ogg45sslv13 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX10 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du10 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv13, JCsIEQgIX.PSTqBLTET);
                                                if (ngczbf8du10 != null) {
                                                    gdEmqfwpT gdemqfwpt8 = (gdEmqfwpT) ngczbf8du10.J4Ux7ym32;
                                                    if (gdemqfwpt8 != null) {
                                                        bool = (Boolean) gdemqfwpt8.GPLPRo6go();
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 2097152:
                                                String string = bundle == null ? null : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                                ogG45sslV ogg45sslv14 = or5nbo9ku.kCA6Zs9sL;
                                                JCsIEQgIX jCsIEQgIX11 = JCsIEQgIX.q3BipwRCk;
                                                ngczBF8du ngczbf8du11 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv14, JCsIEQgIX.yWvV4ePLl);
                                                if (!(ngczbf8du11 == null || (pmanMZxiM = (PmanMZxiM) ngczbf8du11.J4Ux7ym32) == null)) {
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    bool = (Boolean) pmanMZxiM.IytU16YUK(new joIJ4ANvK(string, (List) null, (List) null, 6));
                                                    break;
                                                }
                                                break;
                                            case 16908342:
                                                or5nbo9ku GPLPRo6go = or5nbo9ku.GPLPRo6go();
                                                if (GPLPRo6go != null) {
                                                    iiGwOFFnr = GPLPRo6go.iiGwOFFnr();
                                                    break;
                                                }
                                                ngczBF8du ngczbf8du12 = null;
                                                if (GPLPRo6go != null || ngczbf8du12 != null) {
                                                    if (GPLPRo6go != null) {
                                                        bzmJZsHMu MzoOEjc4X = p62TZmTyO.MzoOEjc4X(GPLPRo6go.GPLPRo6go.o4LF8RkoQ);
                                                        mnTaxtMa7 M66hQ219i = GPLPRo6go.GPLPRo6go.o4LF8RkoQ.M66hQ219i();
                                                        if (M66hQ219i != null) {
                                                            brgfgyiqx = new bRgfgYIQX(p62TZmTyO.nlGCs0NZs(M66hQ219i));
                                                        }
                                                        if (brgfgyiqx == null) {
                                                            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                                                            j = bRgfgYIQX.tGV7Q6urW;
                                                        } else {
                                                            j = brgfgyiqx.q3BipwRCk;
                                                        }
                                                        bzmJZsHMu GPLPRo6go2 = MzoOEjc4X.GPLPRo6go(j);
                                                        bzmJZsHMu q3BipwRCk2 = gThLCaTO1.q3BipwRCk(or5nbo9ku.Puu3Rhg4F(), D3DEikrvb.i8XZMQc6Z(or5nbo9ku.tGV7Q6urW().Bhmn1KIah));
                                                        ogG45sslV ogg45sslv15 = GPLPRo6go.kCA6Zs9sL;
                                                        VSVuhz7Ow vSVuhz7Ow4 = VSVuhz7Ow.q3BipwRCk;
                                                        niYpoU8Cm niypou8cm3 = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(ogg45sslv15, VSVuhz7Ow.Bhmn1KIah);
                                                        niYpoU8Cm niypou8cm4 = (niYpoU8Cm) xP6F5SR9v.Bhmn1KIah(GPLPRo6go.kCA6Zs9sL, VSVuhz7Ow.PSTqBLTET);
                                                        float ixWaw2akD = Tpuv1V0a9.ixWaw2akD(q3BipwRCk2.q3BipwRCk - GPLPRo6go2.q3BipwRCk, q3BipwRCk2.tGV7Q6urW - GPLPRo6go2.tGV7Q6urW);
                                                        if (niypou8cm3 != null && niypou8cm3.tGV7Q6urW) {
                                                            ixWaw2akD = -ixWaw2akD;
                                                        }
                                                        if (p62TZmTyO.kmSgne1rO(or5nbo9ku)) {
                                                            ixWaw2akD = -ixWaw2akD;
                                                        }
                                                        float ixWaw2akD2 = Tpuv1V0a9.ixWaw2akD(q3BipwRCk2.J4Ux7ym32 - GPLPRo6go2.J4Ux7ym32, q3BipwRCk2.dIocxURUo - GPLPRo6go2.dIocxURUo);
                                                        if (niypou8cm4 == null || !niypou8cm4.tGV7Q6urW) {
                                                            z2 = false;
                                                        }
                                                        if (z2) {
                                                            ixWaw2akD2 = -ixWaw2akD2;
                                                        }
                                                        if (ngczbf8du12 != null) {
                                                            kkcQgCx5G kkcqgcx5g3 = (kkcQgCx5G) ngczbf8du12.J4Ux7ym32;
                                                            if (kkcqgcx5g3 != null) {
                                                                bool = (Boolean) kkcqgcx5g3.WaUP0CF08(Float.valueOf(ixWaw2akD), Float.valueOf(ixWaw2akD2));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    GPLPRo6go = GPLPRo6go.GPLPRo6go();
                                                    if (GPLPRo6go != null) {
                                                        iiGwOFFnr = GPLPRo6go.iiGwOFFnr();
                                                        break;
                                                    }
                                                    ngczBF8du ngczbf8du122 = null;
                                                    if (GPLPRo6go != null) {
                                                    }
                                                    if (GPLPRo6go != null) {
                                                    }
                                                }
                                                break;
                                            case 16908349:
                                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                    ogG45sslV ogg45sslv16 = or5nbo9ku.kCA6Zs9sL;
                                                    JCsIEQgIX jCsIEQgIX12 = JCsIEQgIX.q3BipwRCk;
                                                    ngczBF8du ngczbf8du13 = (ngczBF8du) xP6F5SR9v.Bhmn1KIah(ogg45sslv16, JCsIEQgIX.GPLPRo6go);
                                                    if (ngczbf8du13 != null) {
                                                        PmanMZxiM pmanMZxiM3 = (PmanMZxiM) ngczbf8du13.J4Ux7ym32;
                                                        if (pmanMZxiM3 != null) {
                                                            bool = (Boolean) pmanMZxiM3.IytU16YUK(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")));
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 16908344:
                                                    case 16908345:
                                                    case 16908346:
                                                    case 16908347:
                                                        break;
                                                    default:
                                                        aT3qVrmRB at3qvrmrb = (aT3qVrmRB) tpuv1V0a9.oon79WMrY.kCA6Zs9sL(i, null);
                                                        if (at3qvrmrb == null) {
                                                            charSequence = null;
                                                        } else {
                                                            charSequence = (CharSequence) at3qvrmrb.kCA6Zs9sL(i2, null);
                                                        }
                                                        if (charSequence != null) {
                                                            ogG45sslV ogg45sslv17 = or5nbo9ku.kCA6Zs9sL;
                                                            JCsIEQgIX jCsIEQgIX13 = JCsIEQgIX.q3BipwRCk;
                                                            List list = (List) xP6F5SR9v.Bhmn1KIah(ogg45sslv17, JCsIEQgIX.MzoOEjc4X);
                                                            if (list != null && list.size() - 1 >= 0) {
                                                                K6PL0z3I0.q3BipwRCk(list.get(0));
                                                                Objects.requireNonNull(null);
                                                                throw null;
                                                            }
                                                        }
                                                        break;
                                                }
                                        }
                                    } else {
                                        ogG45sslV ogg45sslv18 = or5nbo9ku.kCA6Zs9sL;
                                        VSVuhz7Ow vSVuhz7Ow5 = VSVuhz7Ow.q3BipwRCk;
                                        if (anXlDk6fV.tGV7Q6urW(xP6F5SR9v.Bhmn1KIah(ogg45sslv18, VSVuhz7Ow.CBQ5d1kRq), Boolean.TRUE)) {
                                            ((EBke9S31I) tpuv1V0a9.dIocxURUo.getFocusManager()).q3BipwRCk(false);
                                            return true;
                                        }
                                    }
                                }
                                return z;
                            } else if (bundle != null) {
                                int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                boolean z12 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                boolean z13 = i2 == 256;
                                int i9 = or5nbo9ku.iiGwOFFnr;
                                Integer num = tpuv1V0a9.kmSgne1rO;
                                if (num == null || i9 != num.intValue()) {
                                    tpuv1V0a9.CBQ5d1kRq = -1;
                                    tpuv1V0a9.kmSgne1rO = Integer.valueOf(or5nbo9ku.iiGwOFFnr);
                                }
                                String ilHKhw3Yw = tpuv1V0a9.ilHKhw3Yw(or5nbo9ku);
                                if (!(ilHKhw3Yw == null || ilHKhw3Yw.length() == 0)) {
                                    String ilHKhw3Yw2 = tpuv1V0a9.ilHKhw3Yw(or5nbo9ku);
                                    if (!(ilHKhw3Yw2 == null || ilHKhw3Yw2.length() == 0)) {
                                        if (i8 == 1) {
                                            ksLrMHgEz kslrmhgez = bdb32iMWs.dIocxURUo;
                                            Locale locale = tpuv1V0a9.dIocxURUo.getContext().getResources().getConfiguration().locale;
                                            if (bdb32iMWs.kCA6Zs9sL == null) {
                                                bdb32iMWs.kCA6Zs9sL = new bdb32iMWs(locale, null);
                                            }
                                            Xqme2uw0r xqme2uw0r2 = bdb32iMWs.kCA6Zs9sL;
                                            Objects.requireNonNull(xqme2uw0r2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                            xqme2uw0r = xqme2uw0r2;
                                        } else if (i8 != 2) {
                                            if (i8 != 4) {
                                                if (i8 != 8) {
                                                    break;
                                                } else {
                                                    if (R1zyWYdFl.tGV7Q6urW == null) {
                                                        R1zyWYdFl.tGV7Q6urW = new R1zyWYdFl(null);
                                                    }
                                                    Xqme2uw0r xqme2uw0r3 = R1zyWYdFl.tGV7Q6urW;
                                                    Objects.requireNonNull(xqme2uw0r3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                                    xqme2uw0r = xqme2uw0r3;
                                                }
                                            }
                                            ogG45sslV ogg45sslv19 = or5nbo9ku.kCA6Zs9sL;
                                            JCsIEQgIX jCsIEQgIX14 = JCsIEQgIX.q3BipwRCk;
                                            SHlGWJTIu sHlGWJTIu = JCsIEQgIX.J4Ux7ym32;
                                            if (ogg45sslv19.J4Ux7ym32(sHlGWJTIu)) {
                                                ArrayList arrayList = new ArrayList();
                                                PmanMZxiM pmanMZxiM4 = (PmanMZxiM) ((ngczBF8du) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu)).J4Ux7ym32;
                                                if (anXlDk6fV.tGV7Q6urW(pmanMZxiM4 == null ? null : (Boolean) pmanMZxiM4.IytU16YUK(arrayList), Boolean.TRUE)) {
                                                    pZznYi2iw pzznyi2iw = (pZznYi2iw) arrayList.get(0);
                                                    if (i8 == 4) {
                                                        oWhsE8IPp owhse8ipp = qSZNdC5Zx.dIocxURUo;
                                                        if (qSZNdC5Zx.kCA6Zs9sL == null) {
                                                            qSZNdC5Zx.kCA6Zs9sL = new qSZNdC5Zx(null);
                                                        }
                                                        r11 = qSZNdC5Zx.kCA6Zs9sL;
                                                        Objects.requireNonNull(r11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                        r11.q3BipwRCk = ilHKhw3Yw2;
                                                        r11.tGV7Q6urW = pzznyi2iw;
                                                    } else {
                                                        if (pVANwMywy.kCA6Zs9sL == null) {
                                                            pVANwMywy.kCA6Zs9sL = new pVANwMywy(null);
                                                        }
                                                        r11 = pVANwMywy.kCA6Zs9sL;
                                                        Objects.requireNonNull(r11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                        r11.q3BipwRCk = ilHKhw3Yw2;
                                                        r11.tGV7Q6urW = pzznyi2iw;
                                                        r11.dIocxURUo = or5nbo9ku;
                                                    }
                                                }
                                            }
                                        } else {
                                            ksLrMHgEz kslrmhgez2 = YHc57QUJb.dIocxURUo;
                                            Locale locale2 = tpuv1V0a9.dIocxURUo.getContext().getResources().getConfiguration().locale;
                                            if (YHc57QUJb.kCA6Zs9sL == null) {
                                                YHc57QUJb.kCA6Zs9sL = new YHc57QUJb(locale2, null);
                                            }
                                            Xqme2uw0r xqme2uw0r4 = YHc57QUJb.kCA6Zs9sL;
                                            Objects.requireNonNull(xqme2uw0r4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                            xqme2uw0r = xqme2uw0r4;
                                        }
                                        r11 = xqme2uw0r;
                                        r11.kCA6Zs9sL(ilHKhw3Yw2);
                                    }
                                    if (r11 != 0) {
                                        int Bhmn1KIah = tpuv1V0a9.Bhmn1KIah(or5nbo9ku);
                                        if (Bhmn1KIah == -1) {
                                            Bhmn1KIah = z13 ? 0 : ilHKhw3Yw.length();
                                        }
                                        int[] q3BipwRCk3 = z13 ? r11.q3BipwRCk(Bhmn1KIah) : r11.J4Ux7ym32(Bhmn1KIah);
                                        if (q3BipwRCk3 != null) {
                                            int i10 = q3BipwRCk3[0];
                                            int i11 = q3BipwRCk3[1];
                                            if (z12) {
                                                ogG45sslV ogg45sslv20 = or5nbo9ku.kCA6Zs9sL;
                                                VSVuhz7Ow vSVuhz7Ow6 = VSVuhz7Ow.q3BipwRCk;
                                                if (!ogg45sslv20.CBQ5d1kRq.containsKey(VSVuhz7Ow.J4Ux7ym32)) {
                                                    if (or5nbo9ku.kCA6Zs9sL.CBQ5d1kRq.containsKey(VSVuhz7Ow.dXrmkklc8)) {
                                                        z3 = true;
                                                    }
                                                }
                                                if (z3) {
                                                    i4 = tpuv1V0a9.PSTqBLTET(or5nbo9ku);
                                                    if (i4 == -1) {
                                                        i4 = z13 ? i10 : i11;
                                                    }
                                                    i3 = z13 ? i11 : i10;
                                                    tpuv1V0a9.ilHKhw3Yw = new tNlzcFXUD(or5nbo9ku, !z13 ? 256 : 512, i8, i10, i11, SystemClock.uptimeMillis());
                                                    tpuv1V0a9.AqaWJg0b4(or5nbo9ku, i4, i3, true);
                                                    return true;
                                                }
                                            }
                                            i4 = z13 ? i11 : i10;
                                            i3 = i4;
                                            tpuv1V0a9.ilHKhw3Yw = new tNlzcFXUD(or5nbo9ku, !z13 ? 256 : 512, i8, i10, i11, SystemClock.uptimeMillis());
                                            tpuv1V0a9.AqaWJg0b4(or5nbo9ku, i4, i3, true);
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (tpuv1V0a9.yWvV4ePLl == i) {
                                tpuv1V0a9.yWvV4ePLl = Integer.MIN_VALUE;
                                tpuv1V0a9.dIocxURUo.invalidate();
                                tpuv1V0a9.dfpT1j18n(i, 65536, null, null);
                                return true;
                            }
                        }
                    } else if (tpuv1V0a9.Eeka1udhb()) {
                        int i12 = tpuv1V0a9.yWvV4ePLl;
                        if (!(i12 == i)) {
                            if (i12 != Integer.MIN_VALUE) {
                                tpuv1V0a9.dfpT1j18n(i12, 65536, null, null);
                            }
                            tpuv1V0a9.yWvV4ePLl = i;
                            tpuv1V0a9.dIocxURUo.invalidate();
                            tpuv1V0a9.dfpT1j18n(i, 32768, null, null);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((DGdyNqLvN) this.J4Ux7ym32).kCA6Zs9sL(i, i2, bundle);
        }
    }

    public mk7RZ9XTF(Tpuv1V0a9 tpuv1V0a9) {
        this.J4Ux7ym32 = tpuv1V0a9;
    }
}
