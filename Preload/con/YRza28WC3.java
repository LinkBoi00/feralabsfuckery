package con;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.feravolt.preload.R;
import com.google.android.material.internal.CheckableImageButton;
import con.RAxgJWiGj;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class YRza28WC3<S> extends rsLqYP5un {
    public static final /* synthetic */ int oRfL5Lv1q;
    public boolean BqpzfZavo;
    public CheckableImageButton CMnfe2r2N;
    public rPEfIZQkt JxIJId84K;
    public dOSsQaJVg OuoYhTxyj;
    public int a8N8UmDyD;
    public int aS2AFthYA;
    public gBRio1gPW hKeU0pt2N;
    public TextView ifDs8fRNm;
    public int koMoKnP1S;
    public RAxgJWiGj suAKJqyYV;
    public CharSequence tFD7BDQ71;
    public Button tTcQQNK5P;
    public wROT9IZc9 vIbyhVf1d;
    public final LinkedHashSet ShSN9wbzk = new LinkedHashSet();
    public final LinkedHashSet Ihm5o4uLx = new LinkedHashSet();
    public final LinkedHashSet Ta2zrwkcM = new LinkedHashSet();
    public final LinkedHashSet uSBmk4hFZ = new LinkedHashSet();

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements View.OnClickListener {
        public RG2GI7LDp() {
            YRza28WC3.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = YRza28WC3.this.ShSN9wbzk.iterator();
            while (it.hasNext()) {
                ((tsgy1lLhz) it.next()).q3BipwRCk(YRza28WC3.this.ln3nf7LH3().q3BipwRCk());
            }
            YRza28WC3.this.KBYw84i3W(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr extends fUfhthdYl {
        public aXI58Y1kr() {
            YRza28WC3.this = r1;
        }

        @Override // con.fUfhthdYl
        public void q3BipwRCk(Object obj) {
            YRza28WC3 yRza28WC3 = YRza28WC3.this;
            int i = YRza28WC3.oRfL5Lv1q;
            yRza28WC3.buPcffgdD();
            YRza28WC3 yRza28WC32 = YRza28WC3.this;
            yRza28WC32.tTcQQNK5P.setEnabled(yRza28WC32.ln3nf7LH3().GPLPRo6go());
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements View.OnClickListener {
        public mhl5lIdbQ() {
            YRza28WC3.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = YRza28WC3.this.Ihm5o4uLx.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            YRza28WC3.this.KBYw84i3W(false, false);
        }
    }

    public static int Dr7UqlxEV(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar dIocxURUo = AepEH275c.dIocxURUo();
        dIocxURUo.set(5, 1);
        Calendar J4Ux7ym32 = AepEH275c.J4Ux7ym32(dIocxURUo);
        J4Ux7ym32.get(2);
        J4Ux7ym32.get(1);
        int maximum = J4Ux7ym32.getMaximum(7);
        J4Ux7ym32.getActualMaximum(5);
        J4Ux7ym32.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean M66hQ219i(Context context) {
        return R2hkbNqWf(context, 16843277);
    }

    public static boolean R2hkbNqWf(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(KYuHUB7GA.kCA6Zs9sL(context, R.attr.materialCalendarStyle, gBRio1gPW.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // con.UxHHqhbTP
    public final View AqaWJg0b4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.BqpzfZavo ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.BqpzfZavo) {
            view = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(Dr7UqlxEV(context), -2);
        } else {
            view = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(Dr7UqlxEV(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.ifDs8fRNm = textView;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        mN6fklC4R.iiGwOFFnr(textView, 1);
        this.CMnfe2r2N = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.tFD7BDQ71;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.aS2AFthYA);
        }
        this.CMnfe2r2N.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.CMnfe2r2N;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C8A1BseZU.q3BipwRCk(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C8A1BseZU.q3BipwRCk(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.CMnfe2r2N.setChecked(this.koMoKnP1S != 0);
        IuQbWntsc.MzoOEjc4X(this.CMnfe2r2N, null);
        KlYagMRWx(this.CMnfe2r2N);
        this.CMnfe2r2N.setOnClickListener(new IGwEvs8ZZ(this));
        this.tTcQQNK5P = (Button) inflate.findViewById(R.id.confirm_button);
        if (ln3nf7LH3().GPLPRo6go()) {
            this.tTcQQNK5P.setEnabled(true);
        } else {
            this.tTcQQNK5P.setEnabled(false);
        }
        this.tTcQQNK5P.setTag("CONFIRM_BUTTON_TAG");
        this.tTcQQNK5P.setOnClickListener(new RG2GI7LDp());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new mhl5lIdbQ());
        return inflate;
    }

    public final void IG30YE5GU() {
        rPEfIZQkt rpefizqkt;
        Context ziwPzaoF3 = ziwPzaoF3();
        int i = this.a8N8UmDyD;
        if (i == 0) {
            i = ln3nf7LH3().dIocxURUo(ziwPzaoF3);
        }
        wROT9IZc9 ln3nf7LH3 = ln3nf7LH3();
        RAxgJWiGj rAxgJWiGj = this.suAKJqyYV;
        gBRio1gPW gbrio1gpw = new gBRio1gPW();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", ln3nf7LH3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", rAxgJWiGj);
        bundle.putParcelable("CURRENT_MONTH_KEY", rAxgJWiGj.PSTqBLTET);
        gbrio1gpw.BL4OzhZBd(bundle);
        this.hKeU0pt2N = gbrio1gpw;
        if (this.CMnfe2r2N.isChecked()) {
            wROT9IZc9 ln3nf7LH32 = ln3nf7LH3();
            RAxgJWiGj rAxgJWiGj2 = this.suAKJqyYV;
            rpefizqkt = new MoX9VkYal();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", ln3nf7LH32);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", rAxgJWiGj2);
            rpefizqkt.BL4OzhZBd(bundle2);
        } else {
            rpefizqkt = this.hKeU0pt2N;
        }
        this.JxIJId84K = rpefizqkt;
        buPcffgdD();
        xkmNtxX26 xkmntxx26 = new xkmNtxX26(iiGwOFFnr());
        xkmntxx26.kCA6Zs9sL(R.id.mtrl_calendar_frame, this.JxIJId84K, null, 2);
        if (!xkmntxx26.GPLPRo6go) {
            xkmntxx26.MzoOEjc4X.nlGCs0NZs(xkmntxx26, false);
            this.JxIJId84K.KBYw84i3W(new aXI58Y1kr());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // con.rsLqYP5un
    public final Dialog INnK5Rew6(Bundle bundle) {
        Context ziwPzaoF3 = ziwPzaoF3();
        Context ziwPzaoF32 = ziwPzaoF3();
        int i = this.a8N8UmDyD;
        if (i == 0) {
            i = ln3nf7LH3().dIocxURUo(ziwPzaoF32);
        }
        Dialog dialog = new Dialog(ziwPzaoF3, i);
        Context context = dialog.getContext();
        this.BqpzfZavo = M66hQ219i(context);
        int kCA6Zs9sL = KYuHUB7GA.kCA6Zs9sL(context, R.attr.colorSurface, YRza28WC3.class.getCanonicalName());
        dOSsQaJVg dossqajvg = new dOSsQaJVg(context, null, R.attr.materialCalendarStyle, 2131821549);
        this.OuoYhTxyj = dossqajvg;
        dossqajvg.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(context);
        dossqajvg.sk5s77z6Q();
        this.OuoYhTxyj.MzoOEjc4X(ColorStateList.valueOf(kCA6Zs9sL));
        dOSsQaJVg dossqajvg2 = this.OuoYhTxyj;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        dossqajvg2.PSTqBLTET(mJLaJepZo.yWvV4ePLl(decorView));
        return dialog;
    }

    public final void KlYagMRWx(CheckableImageButton checkableImageButton) {
        this.CMnfe2r2N.setContentDescription(checkableImageButton.getContext().getString(this.CMnfe2r2N.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // con.rsLqYP5un, con.UxHHqhbTP
    public void QNqj6nIzv() {
        this.JxIJId84K.XYT7vJqNO.clear();
        this.QNqj6nIzv = true;
        Dialog dialog = this.KlYagMRWx;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // con.rsLqYP5un, con.UxHHqhbTP
    public void V9LQMKGJe() {
        super.V9LQMKGJe();
        Window window = SuKhTJIQc().getWindow();
        if (this.BqpzfZavo) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.OuoYhTxyj);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = RG6kpfv3v().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.OuoYhTxyj, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ouK4dv6x7(SuKhTJIQc(), rect));
        }
        IG30YE5GU();
    }

    public final void buPcffgdD() {
        String tGV7Q6urW = ln3nf7LH3().tGV7Q6urW(Puu3Rhg4F());
        this.ifDs8fRNm.setContentDescription(String.format(i8XZMQc6Z(R.string.mtrl_picker_announce_current_selection), tGV7Q6urW));
        this.ifDs8fRNm.setText(tGV7Q6urW);
    }

    public final wROT9IZc9 ln3nf7LH3() {
        if (this.vIbyhVf1d == null) {
            this.vIbyhVf1d = (wROT9IZc9) this.ilHKhw3Yw.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.vIbyhVf1d;
    }

    @Override // con.rsLqYP5un, con.UxHHqhbTP
    public final void nlGCs0NZs(Bundle bundle) {
        super.nlGCs0NZs(bundle);
        if (bundle == null) {
            bundle = this.ilHKhw3Yw;
        }
        this.a8N8UmDyD = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.vIbyhVf1d = (wROT9IZc9) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.suAKJqyYV = (RAxgJWiGj) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.aS2AFthYA = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.tFD7BDQ71 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.koMoKnP1S = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // con.rsLqYP5un, con.UxHHqhbTP
    public final void o4LF8RkoQ(Bundle bundle) {
        super.o4LF8RkoQ(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.a8N8UmDyD);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.vIbyhVf1d);
        RAxgJWiGj.RG2GI7LDp rG2GI7LDp = new RAxgJWiGj.RG2GI7LDp(this.suAKJqyYV);
        mznBSeryj mznbseryj = this.hKeU0pt2N.SuKhTJIQc;
        if (mznbseryj != null) {
            rG2GI7LDp.tGV7Q6urW = Long.valueOf(mznbseryj.ilHKhw3Yw);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", rG2GI7LDp.dIocxURUo);
        mznBSeryj vPSbyrYWX = mznBSeryj.vPSbyrYWX(rG2GI7LDp.q3BipwRCk);
        mznBSeryj vPSbyrYWX2 = mznBSeryj.vPSbyrYWX(rG2GI7LDp.J4Ux7ym32);
        z7BMZ3UDZ z7bmz3udz = (z7BMZ3UDZ) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = rG2GI7LDp.tGV7Q6urW;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new RAxgJWiGj(vPSbyrYWX, vPSbyrYWX2, z7bmz3udz, l == null ? null : mznBSeryj.vPSbyrYWX(l.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.aS2AFthYA);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.tFD7BDQ71);
    }

    @Override // con.rsLqYP5un, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.Ta2zrwkcM.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // con.rsLqYP5un, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.uSBmk4hFZ.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.EBQXiIPmm;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
