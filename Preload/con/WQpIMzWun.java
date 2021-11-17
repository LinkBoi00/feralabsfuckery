package con;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    public WQpIMzWun(Context context, Zkj7rJHNb zkj7rJHNb) {
        super(context, r2.Puu3Rhg4F(!pA5wCkne4.CBQ5d1kRq(context)));
        ErB1wWwOl erB1wWwOl = (ErB1wWwOl) zkj7rJHNb;
        this.WaUP0CF08 = context;
        this.i8XZMQc6Z = zkj7rJHNb;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        LayoutInflater from = LayoutInflater.from(context);
        Window window = getWindow();
        if (window != null) {
            ViewGroup kCA6Zs9sL = erB1wWwOl.kCA6Zs9sL(context, window, from, this);
            setContentView(kCA6Zs9sL);
            DialogLayout GPLPRo6go = erB1wWwOl.GPLPRo6go(kCA6Zs9sL);
            GPLPRo6go.Eeka1udhb.setDialog(this);
            DialogActionButtonLayout dialogActionButtonLayout = GPLPRo6go.RG6kpfv3v;
            if (dialogActionButtonLayout != null) {
                dialogActionButtonLayout.setDialog(this);
            }
            this.Eeka1udhb = GPLPRo6go;
            this.Bhmn1KIah = dnBSj5uJN.PSTqBLTET(this, null, Integer.valueOf((int) R.attr.md_font_title), 1);
            this.PSTqBLTET = dnBSj5uJN.PSTqBLTET(this, null, Integer.valueOf((int) R.attr.md_font_body), 1);
            this.MzoOEjc4X = dnBSj5uJN.PSTqBLTET(this, null, Integer.valueOf((int) R.attr.md_font_button), 1);
            int iMyQMM6Qj = idpM54xlp.iMyQMM6Qj(this, null, Integer.valueOf((int) R.attr.md_background_color), new sB4KKf1D2(this, 1), 1);
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.md_corner_radius});
            try {
                Float valueOf = Float.valueOf(getContext().getResources().getDimension(R.dimen.md_dialog_default_corner_radius));
                float dimension = obtainStyledAttributes.getDimension(0, valueOf != null ? valueOf.floatValue() : 0.0f);
                obtainStyledAttributes.recycle();
                erB1wWwOl.yWvV4ePLl(GPLPRo6go, iMyQMM6Qj, dimension);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            anXlDk6fV.cAwN510t2();
            throw null;
        }
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
