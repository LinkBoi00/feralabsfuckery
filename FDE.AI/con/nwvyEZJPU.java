package con;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import me.rosuh.filepicker.widget.RecyclerViewFilePicker;
/* loaded from: classes.dex */
public final class nwvyEZJPU extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO = 16;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(Context context) {
        super(0);
        this.Bhmn1KIah = context;
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        Object obj;
        int i = 0;
        switch (this.kmSgne1rO) {
            case 0:
                return q3BipwRCk();
            case 1:
                return ((UwmKmkwV0) this.Bhmn1KIah).iiGwOFFnr;
            case 2:
                return new K0KMmkEKu((njjwS3RZT) this.Bhmn1KIah, 0.0f);
            case 3:
                return ((T3vFETFEI) this.Bhmn1KIah).tGV7Q6urW();
            case 4:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 5:
                Object obj2 = G7WvUK4mQ.q3BipwRCk;
                HashMap hashMap = new HashMap();
                OorBbPyQS oorBbPyQS = (OorBbPyQS) this.Bhmn1KIah;
                int size = oorBbPyQS.q3BipwRCk.size();
                if (size > 0) {
                    while (true) {
                        int i2 = i + 1;
                        o1LB6r8qp o1lb6r8qp = (o1LB6r8qp) oorBbPyQS.q3BipwRCk.get(i);
                        if (o1lb6r8qp.J4Ux7ym32 != null) {
                            obj = new sl3YzGsPn(Integer.valueOf(o1lb6r8qp.q3BipwRCk), o1lb6r8qp.J4Ux7ym32);
                        } else {
                            obj = Integer.valueOf(o1lb6r8qp.q3BipwRCk);
                        }
                        Object obj3 = hashMap.get(obj);
                        if (obj3 == null) {
                            obj3 = new LinkedHashSet();
                            hashMap.put(obj, obj3);
                        }
                        ((LinkedHashSet) obj3).add(o1lb6r8qp);
                        if (i2 < size) {
                            i = i2;
                        }
                    }
                }
                return hashMap;
            case 6:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 7:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 8:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 9:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 10:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 11:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 12:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 13:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 14:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 15:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 16:
                Object systemService = ((Context) this.Bhmn1KIah).getSystemService("input_method");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 17:
                return new BaseInputConnection(((LCXryTULd) this.Bhmn1KIah).q3BipwRCk, false);
            case 18:
                return new sY2yP4rM4(((IosOyUQuh) this.Bhmn1KIah).q3BipwRCk.GPLPRo6go.getTextLocale(), ((IosOyUQuh) this.Bhmn1KIah).dIocxURUo.J4Ux7ym32.getText());
            case 19:
                return q3BipwRCk();
            case 20:
                AU29aHa4X aU29aHa4X = ((RUkE4Bs9R) this.Bhmn1KIah).kCA6Zs9sL;
                Objects.requireNonNull(aU29aHa4X);
                return new A2fLYD2UL(aU29aHa4X);
            case 21:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 22:
                J4Ux7ym32();
                return qih4lW99W.q3BipwRCk;
            case 23:
                return new lP4K00fUB((Object[]) this.Bhmn1KIah);
            case 24:
                return new uMtjyfLKf(anXlDk6fV.kCA6Zs9sL("kotlinx.serialization.Polymorphic", Ggf0tqAA3.q3BipwRCk, new W39e6bnPN[0], new nVhenZUxZ((r26j0AqG0) this.Bhmn1KIah)), ((r26j0AqG0) this.Bhmn1KIah).q3BipwRCk);
            case 25:
                AcpiZ60A3 acpiZ60A3 = (AcpiZ60A3) this.Bhmn1KIah;
                int hashCode = (acpiZ60A3.q3BipwRCk.hashCode() * 31) + Arrays.hashCode(acpiZ60A3.vPSbyrYWX);
                lP4K00fUB lp4k00fub = new lP4K00fUB(acpiZ60A3);
                int i3 = 1;
                int i4 = 1;
                while (lp4k00fub.hasNext()) {
                    int i5 = i4 * 31;
                    String dIocxURUo = ((W39e6bnPN) lp4k00fub.next()).dIocxURUo();
                    i4 = i5 + (dIocxURUo != null ? dIocxURUo.hashCode() : 0);
                }
                lP4K00fUB lp4k00fub2 = new lP4K00fUB(acpiZ60A3);
                while (lp4k00fub2.hasNext()) {
                    int i6 = i3 * 31;
                    EMeKvJHwJ yWvV4ePLl = ((W39e6bnPN) lp4k00fub2.next()).yWvV4ePLl();
                    i3 = i6 + (yWvV4ePLl != null ? yWvV4ePLl.hashCode() : 0);
                }
                return Integer.valueOf((((hashCode * 31) + i4) * 31) + i3);
            default:
                return new n7frFZomx((RecyclerViewFilePicker) this.Bhmn1KIah);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[ORIG_RETURN, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32() {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: con.nwvyEZJPU.J4Ux7ym32():void");
    }

    public Boolean q3BipwRCk() {
        boolean z = true;
        switch (this.kmSgne1rO) {
            case 0:
                ViewParent parent = ((View) this.Bhmn1KIah).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        return Boolean.valueOf(z);
                    }
                    parent = viewGroup.getParent();
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                if (((QWpF893u7) ((prCJwNx2x) ((svUKnQBs3) this.Bhmn1KIah).i8XZMQc6Z).getValue()) == null || ((YWiUMZOtw) ((prCJwNx2x) ((svUKnQBs3) this.Bhmn1KIah).dfpT1j18n).getValue()) == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(View view) {
        super(0);
        this.Bhmn1KIah = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(IosOyUQuh iosOyUQuh) {
        super(0);
        this.Bhmn1KIah = iosOyUQuh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(c7T7lgkF7 c7t7lgkf7) {
        super(0);
        this.Bhmn1KIah = c7t7lgkf7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(SDU9Amek1 sDU9Amek1) {
        super(0);
        this.Bhmn1KIah = sDU9Amek1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(ErB1wWwOl erB1wWwOl) {
        super(0);
        this.Bhmn1KIah = erB1wWwOl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(PmanMZxiM pmanMZxiM) {
        super(0);
        this.Bhmn1KIah = pmanMZxiM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(pLYbCSTk0 plybcstk0) {
        super(0);
        this.Bhmn1KIah = plybcstk0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(qhaZGYFO8 qhazgyfo8) {
        super(0);
        this.Bhmn1KIah = qhazgyfo8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(RUkE4Bs9R rUkE4Bs9R) {
        super(0);
        this.Bhmn1KIah = rUkE4Bs9R;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(FxoPRWx5H fxoPRWx5H) {
        super(0);
        this.Bhmn1KIah = fxoPRWx5H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(fb3DLy6Ym fb3dly6ym) {
        super(0);
        this.Bhmn1KIah = fb3dly6ym;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(n0Qzow0z6 n0qzow0z6) {
        super(0);
        this.Bhmn1KIah = n0qzow0z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(njjwS3RZT njjws3rzt) {
        super(0);
        this.Bhmn1KIah = njjws3rzt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(OorBbPyQS oorBbPyQS) {
        super(0);
        this.Bhmn1KIah = oorBbPyQS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(r26j0AqG0 r26j0aqg0) {
        super(0);
        this.Bhmn1KIah = r26j0aqg0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(svUKnQBs3 svuknqbs3) {
        super(0);
        this.Bhmn1KIah = svuknqbs3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(rQamjxEL9 rqamjxel9) {
        super(0);
        this.Bhmn1KIah = rqamjxel9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(AcpiZ60A3 acpiZ60A3) {
        super(0);
        this.Bhmn1KIah = acpiZ60A3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(ZcF0ya1BQ zcF0ya1BQ) {
        super(0);
        this.Bhmn1KIah = zcF0ya1BQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(T3vFETFEI t3vFETFEI) {
        super(0);
        this.Bhmn1KIah = t3vFETFEI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(UwmKmkwV0 uwmKmkwV0) {
        super(0);
        this.Bhmn1KIah = uwmKmkwV0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(LCXryTULd lCXryTULd) {
        super(0);
        this.Bhmn1KIah = lCXryTULd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(xAnqkutd5 xanqkutd5) {
        super(0);
        this.Bhmn1KIah = xanqkutd5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(FJQyC64rH fJQyC64rH) {
        super(0);
        this.Bhmn1KIah = fJQyC64rH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(RecyclerViewFilePicker recyclerViewFilePicker) {
        super(0);
        this.Bhmn1KIah = recyclerViewFilePicker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwvyEZJPU(Object[] objArr) {
        super(0);
        this.Bhmn1KIah = objArr;
    }
}
