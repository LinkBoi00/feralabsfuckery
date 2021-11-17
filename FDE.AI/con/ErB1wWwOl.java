package con;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.feravolt.preload.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ErB1wWwOl implements Zkj7rJHNb {
    public static final /* synthetic */ Sd85yPnM9[] Puu3Rhg4F;
    public ViewGroup J4Ux7ym32;
    public DialogActionButtonLayout dIocxURUo;
    public WQpIMzWun kCA6Zs9sL;
    public BottomSheetBehavior q3BipwRCk;
    public CoordinatorLayout tGV7Q6urW;
    public final cRWwgrvAI iiGwOFFnr = new cRWwgrvAI();
    public final cRWwgrvAI GPLPRo6go = new cRWwgrvAI();

    static {
        SlcWfGSDB slcWfGSDB = new SlcWfGSDB(YGTdT21e3.q3BipwRCk(ErB1wWwOl.class), "defaultPeekHeight", "getDefaultPeekHeight$bottomsheets()I");
        sXaMULvdn sxamulvdn = YGTdT21e3.q3BipwRCk;
        Objects.requireNonNull(sxamulvdn);
        SlcWfGSDB slcWfGSDB2 = new SlcWfGSDB(YGTdT21e3.q3BipwRCk(ErB1wWwOl.class), "actualPeekHeight", "getActualPeekHeight()I");
        Objects.requireNonNull(sxamulvdn);
        Puu3Rhg4F = new Sd85yPnM9[]{slcWfGSDB, slcWfGSDB2};
    }

    public ErB1wWwOl(ZaxjSdKpQ zaxjSdKpQ) {
    }

    public static final void dIocxURUo(ErB1wWwOl erB1wWwOl, int i) {
        DialogLayout dialogLayout;
        DialogContentLayout contentLayout;
        WQpIMzWun wQpIMzWun;
        DialogLayout dialogLayout2;
        boolean z;
        DialogActionButtonLayout dialogActionButtonLayout;
        WQpIMzWun wQpIMzWun2 = erB1wWwOl.kCA6Zs9sL;
        if (wQpIMzWun2 != null && (dialogLayout = wQpIMzWun2.Eeka1udhb) != null && (contentLayout = dialogLayout.getContentLayout()) != null && (wQpIMzWun = erB1wWwOl.kCA6Zs9sL) != null && (dialogLayout2 = wQpIMzWun.Eeka1udhb) != null) {
            int measuredHeight = dialogLayout2.getMeasuredHeight();
            DialogScrollView scrollView = contentLayout.getScrollView();
            DialogRecyclerView recyclerView = contentLayout.getRecyclerView();
            if (i < measuredHeight) {
                dialogActionButtonLayout = erB1wWwOl.dIocxURUo;
                z = true;
            } else if (scrollView != null) {
                scrollView.q3BipwRCk();
                return;
            } else if (recyclerView != null) {
                recyclerView.oesmsHQJU();
                return;
            } else {
                dialogActionButtonLayout = erB1wWwOl.dIocxURUo;
                z = false;
            }
            dialogActionButtonLayout.setDrawDivider(z);
        }
    }

    public DialogLayout GPLPRo6go(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.md_root);
        if (findViewById != null) {
            DialogLayout dialogLayout = (DialogLayout) findViewById;
            dialogLayout.setLayoutMode(ZaxjSdKpQ.WRAP_CONTENT);
            dialogLayout.RG6kpfv3v = this.dIocxURUo;
            dialogLayout.sk5s77z6Q = false;
            return dialogLayout;
        }
        throw new y5mNuzXIA("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    @Override // con.Zkj7rJHNb
    public void J4Ux7ym32(WQpIMzWun wQpIMzWun) {
        if (!wQpIMzWun.ilHKhw3Yw || !wQpIMzWun.qVUwofr5s) {
            this.tGV7Q6urW.setOnClickListener(null);
            BottomSheetBehavior bottomSheetBehavior = this.q3BipwRCk;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.cAwN510t2(false);
            } else {
                anXlDk6fV.cAwN510t2();
                throw null;
            }
        } else {
            this.tGV7Q6urW.setOnClickListener(new Q3GvMwgzv(this));
            BottomSheetBehavior bottomSheetBehavior2 = this.q3BipwRCk;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.cAwN510t2(true);
            } else {
                anXlDk6fV.cAwN510t2();
                throw null;
            }
        }
        ViewGroup viewGroup = this.J4Ux7ym32;
        SDU9Amek1 sDU9Amek1 = new SDU9Amek1(this, 1);
        if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new nEBNqwNJt(viewGroup, sDU9Amek1, 0));
        } else {
            sDU9Amek1.IytU16YUK(viewGroup);
        }
    }

    public int Puu3Rhg4F(boolean z) {
        return z ? 2131820835 : 2131820844;
    }

    public final int iiGwOFFnr() {
        return ((Number) this.iiGwOFFnr.q3BipwRCk(Puu3Rhg4F[0])).intValue();
    }

    @SuppressLint({"InflateParams"})
    public ViewGroup kCA6Zs9sL(Context context, Window window, LayoutInflater layoutInflater, WQpIMzWun wQpIMzWun) {
        View inflate = layoutInflater.inflate(R.layout.md_dialog_base_bottomsheet, (ViewGroup) null, false);
        if (inflate != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
            this.tGV7Q6urW = coordinatorLayout;
            this.kCA6Zs9sL = wQpIMzWun;
            this.J4Ux7ym32 = (ViewGroup) coordinatorLayout.findViewById(R.id.md_root_bottom_sheet);
            this.dIocxURUo = (DialogActionButtonLayout) this.tGV7Q6urW.findViewById(R.id.md_button_layout);
            WindowManager windowManager = window.getWindowManager();
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            cRWwgrvAI crwwgrvai = this.iiGwOFFnr;
            Sd85yPnM9[] sd85yPnM9Arr = Puu3Rhg4F;
            Sd85yPnM9 sd85yPnM9 = sd85yPnM9Arr[0];
            crwwgrvai.q3BipwRCk = Integer.valueOf((int) (((float) Integer.valueOf(point.y).intValue()) * 0.6f));
            int iiGwOFFnr = iiGwOFFnr();
            cRWwgrvAI crwwgrvai2 = this.GPLPRo6go;
            Sd85yPnM9 sd85yPnM92 = sd85yPnM9Arr[1];
            crwwgrvai2.q3BipwRCk = Integer.valueOf(iiGwOFFnr);
            ViewGroup.LayoutParams layoutParams = this.J4Ux7ym32.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.s7MlVynBG) {
                CoordinatorLayout.mhl5lIdbQ mhl5lidbq = ((CoordinatorLayout.s7MlVynBG) layoutParams).q3BipwRCk;
                if (mhl5lidbq instanceof BottomSheetBehavior) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) mhl5lidbq;
                    bottomSheetBehavior.cAwN510t2(true);
                    bottomSheetBehavior.IytU16YUK(0);
                    Pb0Tfh98F pb0Tfh98F = new Pb0Tfh98F(bottomSheetBehavior, new SDU9Amek1(this, 2), new nwvyEZJPU(this));
                    Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
                    bottomSheetBehavior.TyB1UUd72.clear();
                    bottomSheetBehavior.TyB1UUd72.add(pb0Tfh98F);
                    this.q3BipwRCk = bottomSheetBehavior;
                    ViewGroup viewGroup = this.J4Ux7ym32;
                    SDU9Amek1 sDU9Amek1 = new SDU9Amek1(this, 3);
                    if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
                        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new nEBNqwNJt(viewGroup, sDU9Amek1, 0));
                    } else {
                        sDU9Amek1.IytU16YUK(viewGroup);
                    }
                    if (context instanceof Activity) {
                        Window window2 = ((Activity) context).getWindow();
                        if (window2 != null) {
                            window.setNavigationBarColor(window2.getNavigationBarColor());
                        } else {
                            anXlDk6fV.cAwN510t2();
                            throw null;
                        }
                    }
                    return this.tGV7Q6urW;
                }
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        throw new y5mNuzXIA("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
    }

    @Override // con.Zkj7rJHNb
    public boolean onDismiss() {
        BottomSheetBehavior bottomSheetBehavior = this.q3BipwRCk;
        if (this.kCA6Zs9sL == null || bottomSheetBehavior == null || bottomSheetBehavior.AqaWJg0b4 == 5) {
            return false;
        }
        bottomSheetBehavior.cAwN510t2(true);
        bottomSheetBehavior.CpG0imbht(5);
        if (pA5wCkne4.iMyQMM6Qj(this.dIocxURUo)) {
            Animator animator = dnBSj5uJN.kCA6Zs9sL(0, this.dIocxURUo.getMeasuredHeight(), 250, new SDU9Amek1(this, 0), (r12 & 16) != 0 ? SFccbMiBr.WaUP0CF08 : null);
            dnBSj5uJN.iMyQMM6Qj(this.dIocxURUo, new inMzAxvvL(animator, 0));
            animator.start();
        }
        return true;
    }

    @Override // con.Zkj7rJHNb
    public void q3BipwRCk(Context context, Window window, DialogLayout dialogLayout, Integer num) {
        window.setSoftInputMode(16);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        window.setAttributes(layoutParams);
    }

    @Override // con.Zkj7rJHNb
    public void tGV7Q6urW(WQpIMzWun wQpIMzWun) {
    }

    public void yWvV4ePLl(DialogLayout dialogLayout, int i, float f) {
        ViewGroup viewGroup = this.J4Ux7ym32;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(i);
        viewGroup.setBackground(gradientDrawable);
        this.dIocxURUo.setBackgroundColor(i);
    }
}
