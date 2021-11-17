package con;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class WQpIMzWun extends Dialog {
    public Typeface Bhmn1KIah;
    public final DialogLayout Eeka1udhb;
    public Typeface MzoOEjc4X;
    public Typeface PSTqBLTET;
    public final Context WaUP0CF08;
    public final Zkj7rJHNb i8XZMQc6Z;
    public final Map CBQ5d1kRq = new LinkedHashMap();
    public boolean kmSgne1rO = true;
    public boolean ilHKhw3Yw = true;
    public boolean qVUwofr5s = true;
    public final List dXrmkklc8 = new ArrayList();
    public final List RG6kpfv3v = new ArrayList();
    public final List ixWaw2akD = new ArrayList();
    public final List sk5s77z6Q = new ArrayList();

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public WQpIMzWun(android.content.Context r7, con.Zkj7rJHNb r8) {
        /*
            r6 = this;
            boolean r0 = con.pA5wCkne4.CBQ5d1kRq(r7)
            r1 = 1
            r0 = r0 ^ r1
            r2 = r8
            con.ErB1wWwOl r2 = (con.ErB1wWwOl) r2
            int r0 = r2.Puu3Rhg4F(r0)
            r6.<init>(r7, r0)
            r6.WaUP0CF08 = r7
            r6.i8XZMQc6Z = r8
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r6.CBQ5d1kRq = r8
            r6.kmSgne1rO = r1
            r6.ilHKhw3Yw = r1
            r6.qVUwofr5s = r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r6.dXrmkklc8 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r6.RG6kpfv3v = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r6.ixWaw2akD = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r6.sk5s77z6Q = r8
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r7)
            android.view.Window r0 = r6.getWindow()
            r3 = 0
            if (r0 == 0) goto L_0x00f0
            android.view.ViewGroup r8 = r2.kCA6Zs9sL(r7, r0, r8, r6)
            r6.setContentView(r8)
            com.afollestad.materialdialogs.internal.main.DialogLayout r8 = r2.GPLPRo6go(r8)
            com.afollestad.materialdialogs.internal.main.DialogTitleLayout r0 = r8.Eeka1udhb
            r0.setDialog(r6)
            com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout r0 = r8.RG6kpfv3v
            if (r0 == 0) goto L_0x006e
            r0.setDialog(r6)
        L_0x006e:
            r6.Eeka1udhb = r8
            r0 = 2130969296(0x7f0402d0, float:1.754727E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.Typeface r0 = con.dnBSj5uJN.PSTqBLTET(r6, r3, r0, r1)
            r6.Bhmn1KIah = r0
            r0 = 2130969294(0x7f0402ce, float:1.7547266E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.Typeface r0 = con.dnBSj5uJN.PSTqBLTET(r6, r3, r0, r1)
            r6.PSTqBLTET = r0
            r0 = 2130969295(0x7f0402cf, float:1.7547268E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.Typeface r0 = con.dnBSj5uJN.PSTqBLTET(r6, r3, r0, r1)
            r6.MzoOEjc4X = r0
            r0 = 2130969283(0x7f0402c3, float:1.7547244E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            con.sB4KKf1D2 r4 = new con.sB4KKf1D2
            r4.<init>(r6, r1)
            int r0 = con.idpM54xlp.iMyQMM6Qj(r6, r3, r0, r4, r1)
            android.view.Window r3 = r6.getWindow()
            r4 = 0
            if (r3 == 0) goto L_0x00b6
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>(r4)
            r3.setBackgroundDrawable(r5)
        L_0x00b6:
            r3 = 2130969292(0x7f0402cc, float:1.7547262E38)
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int[] r1 = new int[r1]
            r1[r4] = r3
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r1)
            android.content.Context r1 = r6.getContext()     // Catch: all -> 0x00eb
            android.content.res.Resources r1 = r1.getResources()     // Catch: all -> 0x00eb
            r3 = 2131165541(0x7f070165, float:1.7945302E38)
            float r1 = r1.getDimension(r3)     // Catch: all -> 0x00eb
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: all -> 0x00eb
            if (r1 == 0) goto L_0x00df
            float r1 = r1.floatValue()     // Catch: all -> 0x00eb
            goto L_0x00e0
        L_0x00df:
            r1 = 0
        L_0x00e0:
            float r1 = r7.getDimension(r4, r1)     // Catch: all -> 0x00eb
            r7.recycle()
            r2.yWvV4ePLl(r8, r0, r1)
            return
        L_0x00eb:
            r8 = move-exception
            r7.recycle()
            throw r8
        L_0x00f0:
            con.anXlDk6fV.cAwN510t2()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: con.WQpIMzWun.<init>(android.content.Context, con.Zkj7rJHNb):void");
    }

    public static WQpIMzWun J4Ux7ym32(WQpIMzWun wQpIMzWun, Integer num, CharSequence charSequence, PmanMZxiM pmanMZxiM, int i) {
        Integer num2 = (i & 1) != 0 ? null : num;
        if ((i & 4) != 0) {
            pmanMZxiM = null;
        }
        if (pmanMZxiM != null) {
            wQpIMzWun.ixWaw2akD.add(pmanMZxiM);
        }
        DialogActionButton yWvV4ePLl = idpM54xlp.yWvV4ePLl(wQpIMzWun, LzT8CF9ie.NEGATIVE);
        if (num2 != null || !idpM54xlp.qVUwofr5s(yWvV4ePLl)) {
            KYuHUB7GA.J4Ux7ym32(wQpIMzWun, yWvV4ePLl, num2, null, 17039360, wQpIMzWun.MzoOEjc4X, null, 32);
        }
        return wQpIMzWun;
    }

    public static WQpIMzWun dIocxURUo(WQpIMzWun wQpIMzWun, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if (num != null) {
            KYuHUB7GA.J4Ux7ym32(wQpIMzWun, wQpIMzWun.Eeka1udhb.getTitleLayout().getTitleView$core(), num, null, 0, wQpIMzWun.Bhmn1KIah, Integer.valueOf((int) R.attr.md_color_title), 8);
            return wQpIMzWun;
        }
        throw new IllegalArgumentException("title: You must specify a resource ID or literal value");
    }

    public static WQpIMzWun q3BipwRCk(WQpIMzWun wQpIMzWun, Integer num, CharSequence charSequence, PmanMZxiM pmanMZxiM, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if (num != null) {
            wQpIMzWun.Eeka1udhb.getContentLayout().J4Ux7ym32(wQpIMzWun, num, null, wQpIMzWun.PSTqBLTET, null);
            return wQpIMzWun;
        }
        throw new IllegalArgumentException("message: You must specify a resource ID or literal value");
    }

    public static WQpIMzWun tGV7Q6urW(WQpIMzWun wQpIMzWun, Integer num, CharSequence charSequence, PmanMZxiM pmanMZxiM, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        DialogActionButton yWvV4ePLl = idpM54xlp.yWvV4ePLl(wQpIMzWun, LzT8CF9ie.POSITIVE);
        if (num != null || !idpM54xlp.qVUwofr5s(yWvV4ePLl)) {
            KYuHUB7GA.J4Ux7ym32(wQpIMzWun, yWvV4ePLl, num, null, 17039370, wQpIMzWun.MzoOEjc4X, null, 32);
        }
        return wQpIMzWun;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IBinder iBinder;
        if (!this.i8XZMQc6Z.onDismiss()) {
            Object systemService = this.WaUP0CF08.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                } else {
                    iBinder = this.Eeka1udhb.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                super.dismiss();
                return;
            }
            throw new y5mNuzXIA("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        this.qVUwofr5s = z;
        super.setCancelable(z);
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        this.ilHKhw3Yw = z;
        super.setCanceledOnTouchOutside(z);
    }

    @Override // android.app.Dialog
    public void show() {
        AppCompatCheckBox checkBoxPrompt;
        Zkj7rJHNb zkj7rJHNb = this.i8XZMQc6Z;
        Context context = this.WaUP0CF08;
        Window window = getWindow();
        Boolean bool = null;
        if (window != null) {
            zkj7rJHNb.q3BipwRCk(context, window, this.Eeka1udhb, null);
            Object obj = this.CBQ5d1kRq.get("md.custom_view_no_vertical_padding");
            if (obj instanceof Boolean) {
                bool = obj;
            }
            boolean tGV7Q6urW = anXlDk6fV.tGV7Q6urW(bool, Boolean.TRUE);
            idpM54xlp.MzoOEjc4X(this.dXrmkklc8, this);
            DialogLayout dialogLayout = this.Eeka1udhb;
            if (dialogLayout.getTitleLayout().J4Ux7ym32() && !tGV7Q6urW) {
                dialogLayout.getContentLayout().q3BipwRCk(dialogLayout.getFrameMarginVertical$core(), dialogLayout.getFrameMarginVertical$core());
            }
            DialogActionButtonLayout buttonsLayout = this.Eeka1udhb.getButtonsLayout();
            if (buttonsLayout == null || (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) == null) {
                throw new IllegalStateException("The dialog does not have an attached buttons layout.");
            }
            int i = 0;
            if (idpM54xlp.qVUwofr5s(checkBoxPrompt)) {
                DialogContentLayout contentLayout = dialogLayout.getContentLayout();
                Sd85yPnM9[] sd85yPnM9Arr = DialogContentLayout.qVUwofr5s;
                contentLayout.q3BipwRCk(-1, 0);
            } else {
                boolean z = true;
                if (dialogLayout.getContentLayout().getChildCount() <= 1) {
                    z = false;
                }
                if (z) {
                    DialogContentLayout contentLayout2 = dialogLayout.getContentLayout();
                    int frameMarginVerticalLess$core = dialogLayout.getFrameMarginVerticalLess$core();
                    View view = contentLayout2.PSTqBLTET;
                    if (view == null) {
                        view = contentLayout2.MzoOEjc4X;
                    }
                    if (frameMarginVerticalLess$core != -1) {
                        int paddingLeft = view != null ? view.getPaddingLeft() : 0;
                        int paddingTop = view != null ? view.getPaddingTop() : 0;
                        if (view != null) {
                            i = view.getPaddingRight();
                        }
                        if (!((view != null && paddingLeft == view.getPaddingLeft() && paddingTop == view.getPaddingTop() && i == view.getPaddingRight() && frameMarginVerticalLess$core == view.getPaddingBottom()) || view == null)) {
                            view.setPadding(paddingLeft, paddingTop, i, frameMarginVerticalLess$core);
                        }
                    }
                }
            }
            this.i8XZMQc6Z.J4Ux7ym32(this);
            super.show();
            this.i8XZMQc6Z.tGV7Q6urW(this);
            return;
        }
        anXlDk6fV.cAwN510t2();
        throw null;
    }
}
