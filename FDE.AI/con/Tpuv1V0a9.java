package con;

import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class Tpuv1V0a9 extends XflkRyC2J {
    public static final int[] dfpT1j18n = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public Of4EROl6B RG6kpfv3v;
    public final AndroidComposeView dIocxURUo;
    public final AccessibilityManager iiGwOFFnr;
    public tNlzcFXUD ilHKhw3Yw;
    public boolean ixWaw2akD;
    public Integer kmSgne1rO;
    public Map qVUwofr5s;
    public int kCA6Zs9sL = Integer.MIN_VALUE;
    public final Handler GPLPRo6go = new Handler(Looper.getMainLooper());
    public DGdyNqLvN Puu3Rhg4F = new DGdyNqLvN(new mk7RZ9XTF(this), 3);
    public int yWvV4ePLl = Integer.MIN_VALUE;
    public aT3qVrmRB oon79WMrY = new aT3qVrmRB();
    public aT3qVrmRB vPSbyrYWX = new aT3qVrmRB();
    public int CBQ5d1kRq = -1;
    public final qIxSZWcre Bhmn1KIah = new qIxSZWcre(0);
    public final DpXbxvzXm PSTqBLTET = rTcohQ78k.q3BipwRCk(-1, null, null, 6);
    public boolean MzoOEjc4X = true;
    public qIxSZWcre Eeka1udhb = new qIxSZWcre(0);
    public Map dXrmkklc8 = new LinkedHashMap();
    public final Runnable sk5s77z6Q = new UoUKJhr5d(this);
    public final List WaUP0CF08 = new ArrayList();
    public final PmanMZxiM i8XZMQc6Z = new nVhenZUxZ(this);

    public Tpuv1V0a9(AndroidComposeView androidComposeView) {
        this.dIocxURUo = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.iiGwOFFnr = (AccessibilityManager) systemService;
        dmnvfTTyg dmnvfttyg = dmnvfTTyg.CBQ5d1kRq;
        this.qVUwofr5s = dmnvfttyg;
        this.RG6kpfv3v = new Of4EROl6B(androidComposeView.getSemanticsOwner().q3BipwRCk(), dmnvfttyg);
        androidComposeView.addOnAttachStateChangeListener(new mYYIIpcht(this));
    }

    public static final boolean RG6kpfv3v(niYpoU8Cm niypou8cm, float f) {
        return (f < 0.0f && ((Number) niypou8cm.q3BipwRCk.GPLPRo6go()).floatValue() > 0.0f) || (f > 0.0f && ((Number) niypou8cm.q3BipwRCk.GPLPRo6go()).floatValue() < ((Number) niypou8cm.J4Ux7ym32.GPLPRo6go()).floatValue());
    }

    public static /* synthetic */ boolean iMyQMM6Qj(Tpuv1V0a9 tpuv1V0a9, int i, int i2, Integer num, List list, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        return tpuv1V0a9.dfpT1j18n(i, i2, num, null);
    }

    public static final float ixWaw2akD(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public static final boolean sk5s77z6Q(niYpoU8Cm niypou8cm) {
        return (((Number) niypou8cm.q3BipwRCk.GPLPRo6go()).floatValue() < ((Number) niypou8cm.J4Ux7ym32.GPLPRo6go()).floatValue() && !niypou8cm.tGV7Q6urW) || (((Number) niypou8cm.q3BipwRCk.GPLPRo6go()).floatValue() > 0.0f && niypou8cm.tGV7Q6urW);
    }

    public final boolean AqaWJg0b4(or5nbo9ku or5nbo9ku, int i, int i2, boolean z) {
        String ilHKhw3Yw;
        Boolean bool;
        ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
        JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
        SHlGWJTIu sHlGWJTIu = JCsIEQgIX.Puu3Rhg4F;
        boolean z2 = false;
        if (ogg45sslv.J4Ux7ym32(sHlGWJTIu) && p62TZmTyO.vPSbyrYWX(or5nbo9ku)) {
            NzvP5Rex8 nzvP5Rex8 = (NzvP5Rex8) ((ngczBF8du) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu)).J4Ux7ym32;
            if (nzvP5Rex8 == null || (bool = (Boolean) nzvP5Rex8.sk5s77z6Q(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))) == null) {
                return false;
            }
            return bool.booleanValue();
        } else if ((i == i2 && i2 == this.CBQ5d1kRq) || (ilHKhw3Yw = ilHKhw3Yw(or5nbo9ku)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > ilHKhw3Yw.length()) {
                i = -1;
            }
            this.CBQ5d1kRq = i;
            if (ilHKhw3Yw.length() > 0) {
                z2 = true;
            }
            int WaUP0CF08 = WaUP0CF08(or5nbo9ku.iiGwOFFnr);
            Integer num = null;
            Integer valueOf = z2 ? Integer.valueOf(this.CBQ5d1kRq) : null;
            Integer valueOf2 = z2 ? Integer.valueOf(this.CBQ5d1kRq) : null;
            if (z2) {
                num = Integer.valueOf(ilHKhw3Yw.length());
            }
            i8XZMQc6Z(kmSgne1rO(WaUP0CF08, valueOf, valueOf2, num, ilHKhw3Yw));
            IytU16YUK(or5nbo9ku.iiGwOFFnr);
            return true;
        }
    }

    public final int Bhmn1KIah(or5nbo9ku or5nbo9ku) {
        ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        if (!ogg45sslv.CBQ5d1kRq.containsKey(VSVuhz7Ow.J4Ux7ym32)) {
            ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
            SHlGWJTIu sHlGWJTIu = VSVuhz7Ow.RG6kpfv3v;
            if (ogg45sslv2.CBQ5d1kRq.containsKey(sHlGWJTIu)) {
                return czCYotiRn.dIocxURUo(((czCYotiRn) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu)).q3BipwRCk);
            }
        }
        return this.CBQ5d1kRq;
    }

    public final AccessibilityEvent CBQ5d1kRq(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.dIocxURUo.getContext().getPackageName());
        obtain.setSource(this.dIocxURUo, i);
        BIRL6IXtO bIRL6IXtO = (BIRL6IXtO) MzoOEjc4X().get(Integer.valueOf(i));
        if (bIRL6IXtO != null) {
            ogG45sslV iiGwOFFnr = bIRL6IXtO.q3BipwRCk.iiGwOFFnr();
            VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
            obtain.setPassword(iiGwOFFnr.CBQ5d1kRq.containsKey(VSVuhz7Ow.i8XZMQc6Z));
        }
        return obtain;
    }

    public final void CpG0imbht(u1Gs6N2OQ u1gs6n2oq) {
        if (u1gs6n2oq.kmSgne1rO.contains(u1gs6n2oq)) {
            OIP2vionU snapshotObserver = this.dIocxURUo.getSnapshotObserver();
            snapshotObserver.q3BipwRCk.J4Ux7ym32(u1gs6n2oq, this.i8XZMQc6Z, new kuvj6DyFF(u1gs6n2oq, this));
        }
    }

    public final boolean Eeka1udhb() {
        return this.iiGwOFFnr.isEnabled() && this.iiGwOFFnr.isTouchExplorationEnabled();
    }

    public final void IytU16YUK(int i) {
        tNlzcFXUD tnlzcfxud = this.ilHKhw3Yw;
        if (tnlzcfxud != null) {
            if (i == tnlzcfxud.q3BipwRCk.iiGwOFFnr) {
                if (SystemClock.uptimeMillis() - tnlzcfxud.iiGwOFFnr <= 1000) {
                    AccessibilityEvent CBQ5d1kRq = CBQ5d1kRq(WaUP0CF08(tnlzcfxud.q3BipwRCk.iiGwOFFnr), 131072);
                    CBQ5d1kRq.setFromIndex(tnlzcfxud.dIocxURUo);
                    CBQ5d1kRq.setToIndex(tnlzcfxud.kCA6Zs9sL);
                    CBQ5d1kRq.setAction(tnlzcfxud.J4Ux7ym32);
                    CBQ5d1kRq.setMovementGranularity(tnlzcfxud.tGV7Q6urW);
                    CBQ5d1kRq.getText().add(ilHKhw3Yw(tnlzcfxud.q3BipwRCk));
                    i8XZMQc6Z(CBQ5d1kRq);
                }
            } else {
                return;
            }
        }
        this.ilHKhw3Yw = null;
    }

    @Override // con.XflkRyC2J
    public DGdyNqLvN J4Ux7ym32(View view) {
        return this.Puu3Rhg4F;
    }

    public final Map MzoOEjc4X() {
        if (this.MzoOEjc4X) {
            or5nbo9ku q3BipwRCk = this.dIocxURUo.getSemanticsOwner().q3BipwRCk();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (q3BipwRCk.GPLPRo6go.nlGCs0NZs) {
                Region region = new Region();
                region.set(p62TZmTyO.o4LF8RkoQ(q3BipwRCk.dIocxURUo()));
                p62TZmTyO.cAwN510t2(region, q3BipwRCk, linkedHashMap, q3BipwRCk);
            }
            this.qVUwofr5s = linkedHashMap;
            this.MzoOEjc4X = false;
        }
        return this.qVUwofr5s;
    }

    public final void NyWTwPF6V(int i) {
        int i2 = this.kCA6Zs9sL;
        if (i2 != i) {
            this.kCA6Zs9sL = i;
            iMyQMM6Qj(this, i, 128, null, null, 12);
            iMyQMM6Qj(this, i2, 256, null, null, 12);
        }
    }

    public final int PSTqBLTET(or5nbo9ku or5nbo9ku) {
        ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        if (!ogg45sslv.CBQ5d1kRq.containsKey(VSVuhz7Ow.J4Ux7ym32)) {
            ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
            SHlGWJTIu sHlGWJTIu = VSVuhz7Ow.RG6kpfv3v;
            if (ogg45sslv2.CBQ5d1kRq.containsKey(sHlGWJTIu)) {
                return czCYotiRn.yWvV4ePLl(((czCYotiRn) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu)).q3BipwRCk);
            }
        }
        return this.CBQ5d1kRq;
    }

    public final int WaUP0CF08(int i) {
        if (i == this.dIocxURUo.getSemanticsOwner().q3BipwRCk().iiGwOFFnr) {
            return -1;
        }
        return i;
    }

    public final void cAwN510t2(int i, int i2, String str) {
        AccessibilityEvent CBQ5d1kRq = CBQ5d1kRq(WaUP0CF08(i), 32);
        CBQ5d1kRq.setContentChangeTypes(i2);
        if (str != null) {
            CBQ5d1kRq.getText().add(str);
        }
        i8XZMQc6Z(CBQ5d1kRq);
    }

    public final void dXrmkklc8(pLYbCSTk0 plybcstk0) {
        if (this.Bhmn1KIah.add(plybcstk0)) {
            ((spFv56w6q) this.PSTqBLTET).Puu3Rhg4F(qih4lW99W.q3BipwRCk);
        }
    }

    public final boolean dfpT1j18n(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !Eeka1udhb()) {
            return false;
        }
        AccessibilityEvent CBQ5d1kRq = CBQ5d1kRq(i, i2);
        if (num != null) {
            CBQ5d1kRq.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            CBQ5d1kRq.setContentDescription(p62TZmTyO.ixWaw2akD(list, ",", null, null, 0, null, null, 62));
        }
        return i8XZMQc6Z(CBQ5d1kRq);
    }

    public final boolean i8XZMQc6Z(AccessibilityEvent accessibilityEvent) {
        if (!Eeka1udhb()) {
            return false;
        }
        return this.dIocxURUo.getParent().requestSendAccessibilityEvent(this.dIocxURUo, accessibilityEvent);
    }

    public final String ilHKhw3Yw(or5nbo9ku or5nbo9ku) {
        joIJ4ANvK joij4anvk;
        if (or5nbo9ku == null) {
            return null;
        }
        ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        SHlGWJTIu sHlGWJTIu = VSVuhz7Ow.J4Ux7ym32;
        if (ogg45sslv.CBQ5d1kRq.containsKey(sHlGWJTIu)) {
            return p62TZmTyO.ixWaw2akD((List) or5nbo9ku.kCA6Zs9sL.kCA6Zs9sL(sHlGWJTIu), ",", null, null, 0, null, null, 62);
        }
        ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
        JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
        if (ogg45sslv2.J4Ux7ym32(JCsIEQgIX.yWvV4ePLl)) {
            joIJ4ANvK qVUwofr5s = qVUwofr5s(or5nbo9ku.kCA6Zs9sL);
            if (qVUwofr5s == null) {
                return null;
            }
            return qVUwofr5s.CBQ5d1kRq;
        }
        List list = (List) xP6F5SR9v.Bhmn1KIah(or5nbo9ku.kCA6Zs9sL, VSVuhz7Ow.Eeka1udhb);
        if (list == null || (joij4anvk = (joIJ4ANvK) wkFJfVmcv.QNqj6nIzv(list)) == null) {
            return null;
        }
        return joij4anvk.CBQ5d1kRq;
    }

    public final AccessibilityEvent kmSgne1rO(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent CBQ5d1kRq = CBQ5d1kRq(i, 8192);
        if (num != null) {
            CBQ5d1kRq.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            CBQ5d1kRq.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            CBQ5d1kRq.setItemCount(num3.intValue());
        }
        if (str != null) {
            CBQ5d1kRq.getText().add(str);
        }
        return CBQ5d1kRq;
    }

    public final CharSequence mUqPm6GBh(CharSequence charSequence, int i) {
        boolean z = true;
        if (i > 0) {
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (z || charSequence.length() <= i) {
                return charSequence;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i))) {
                i = i2;
            }
            return charSequence.subSequence(0, i);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void nlGCs0NZs(pLYbCSTk0 plybcstk0, qIxSZWcre qixszwcre) {
        pLYbCSTk0 WaUP0CF08;
        mhjbbkjEL dXrmkklc8;
        if (plybcstk0.Eeka1udhb() && !this.dIocxURUo.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(plybcstk0)) {
            mhjbbkjEL dXrmkklc82 = BBVaGLNaU.dXrmkklc8(plybcstk0);
            if (dXrmkklc82 == null) {
                pLYbCSTk0 WaUP0CF082 = p62TZmTyO.WaUP0CF08(plybcstk0, GQN3dSqKV.mUqPm6GBh);
                if (WaUP0CF082 == null) {
                    dXrmkklc82 = null;
                } else {
                    dXrmkklc82 = BBVaGLNaU.dXrmkklc8(WaUP0CF082);
                }
                if (dXrmkklc82 == null) {
                    return;
                }
            }
            if (!(dXrmkklc82.eylCJcWC7().kmSgne1rO || (WaUP0CF08 = p62TZmTyO.WaUP0CF08(plybcstk0, AdUPdUuqH.cAwN510t2)) == null || (dXrmkklc8 = BBVaGLNaU.dXrmkklc8(WaUP0CF08)) == null)) {
                dXrmkklc82 = dXrmkklc8;
            }
            int i = ((CBcUvsHpG) ((GobDDNrsi) dXrmkklc82.NyWTwPF6V)).CBQ5d1kRq;
            if (qixszwcre.add(Integer.valueOf(i))) {
                dfpT1j18n(WaUP0CF08(i), 2048, 1, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0033, B:18:0x004d, B:23:0x0069, B:27:0x007c, B:29:0x0084, B:31:0x008d, B:34:0x0096, B:38:0x00a8, B:40:0x00af, B:41:0x00b8), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.Object oon79WMrY(con.Way959ade r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Tpuv1V0a9.oon79WMrY(con.Way959ade):java.lang.Object");
    }

    public final void qFBXIgpia(or5nbo9ku or5nbo9ku, Of4EROl6B of4EROl6B) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List yWvV4ePLl = or5nbo9ku.yWvV4ePLl();
        int size = yWvV4ePLl.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                or5nbo9ku or5nbo9ku2 = (or5nbo9ku) yWvV4ePLl.get(i2);
                if (MzoOEjc4X().containsKey(Integer.valueOf(or5nbo9ku2.iiGwOFFnr))) {
                    if (!of4EROl6B.J4Ux7ym32.contains(Integer.valueOf(or5nbo9ku2.iiGwOFFnr))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(or5nbo9ku2.iiGwOFFnr));
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        for (Number number : of4EROl6B.J4Ux7ym32) {
            if (!linkedHashSet.contains(Integer.valueOf(number.intValue()))) {
                dXrmkklc8(or5nbo9ku.GPLPRo6go);
                return;
            }
        }
        List yWvV4ePLl2 = or5nbo9ku.yWvV4ePLl();
        int size2 = yWvV4ePLl2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i4 = i + 1;
                or5nbo9ku or5nbo9ku3 = (or5nbo9ku) yWvV4ePLl2.get(i);
                if (MzoOEjc4X().containsKey(Integer.valueOf(or5nbo9ku3.iiGwOFFnr))) {
                    qFBXIgpia(or5nbo9ku3, (Of4EROl6B) this.dXrmkklc8.get(Integer.valueOf(or5nbo9ku3.iiGwOFFnr)));
                }
                if (i4 <= size2) {
                    i = i4;
                } else {
                    return;
                }
            }
        }
    }

    public final joIJ4ANvK qVUwofr5s(ogG45sslV ogg45sslv) {
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        return (joIJ4ANvK) xP6F5SR9v.Bhmn1KIah(ogg45sslv, VSVuhz7Ow.dXrmkklc8);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean vPSbyrYWX(boolean r10, int r11, long r12) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Tpuv1V0a9.vPSbyrYWX(boolean, int, long):boolean");
    }
}
