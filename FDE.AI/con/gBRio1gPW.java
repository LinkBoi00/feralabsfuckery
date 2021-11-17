package con;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes.dex */
public final class gBRio1gPW<S> extends rPEfIZQkt {
    public static final /* synthetic */ int KlYagMRWx;
    public GB7SBlGiG Dr7UqlxEV;
    public View IG30YE5GU;
    public RAxgJWiGj INnK5Rew6;
    public wROT9IZc9 KBYw84i3W;
    public RecyclerView M66hQ219i;
    public RecyclerView R2hkbNqWf;
    public mznBSeryj SuKhTJIQc;
    public View buPcffgdD;
    public int kktL0P5MG;
    public int ln3nf7LH3;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Runnable {
        public final /* synthetic */ int CBQ5d1kRq;

        public RG2GI7LDp(int i) {
            gBRio1gPW.this = r1;
            this.CBQ5d1kRq = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            gBRio1gPW.this.R2hkbNqWf.M66hQ219i(this.CBQ5d1kRq);
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr extends suTVAeEU9 {
        public final /* synthetic */ int qFBXIgpia;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aXI58Y1kr(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            gBRio1gPW.this = r1;
            this.qFBXIgpia = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void LFW0KvNFt(RecyclerView.kvFwRYSUX kvfwrysux, int[] iArr) {
            if (this.qFBXIgpia == 0) {
                iArr[0] = gBRio1gPW.this.R2hkbNqWf.getWidth();
                iArr[1] = gBRio1gPW.this.R2hkbNqWf.getWidth();
                return;
            }
            iArr[0] = gBRio1gPW.this.R2hkbNqWf.getHeight();
            iArr[1] = gBRio1gPW.this.R2hkbNqWf.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends XflkRyC2J {
        public mhl5lIdbQ(gBRio1gPW gbrio1gpw) {
        }

        @Override // con.XflkRyC2J
        public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
            this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
            iqwHQ6O2l.Bhmn1KIah(null);
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements s7MlVynBG {
        public qhPEQQaQ4() {
            gBRio1gPW.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public interface s7MlVynBG {
    }

    @Override // con.UxHHqhbTP
    public View AqaWJg0b4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        Pzd2J3aOK pzd2J3aOK;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(Puu3Rhg4F(), this.kktL0P5MG);
        this.Dr7UqlxEV = new GB7SBlGiG(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        mznBSeryj mznbseryj = this.INnK5Rew6.CBQ5d1kRq;
        if (YRza28WC3.M66hQ219i(contextThemeWrapper)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = ziwPzaoF3().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = com.google.android.material.datepicker.mhl5lIdbQ.ilHKhw3Yw;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        IuQbWntsc.MzoOEjc4X(gridView, new mhl5lIdbQ(this));
        gridView.setAdapter((ListAdapter) new d3ICzDunv());
        gridView.setNumColumns(mznbseryj.PSTqBLTET);
        gridView.setEnabled(false);
        this.R2hkbNqWf = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.R2hkbNqWf.setLayoutManager(new aXI58Y1kr(Puu3Rhg4F(), i, false, i));
        this.R2hkbNqWf.setTag("MONTHS_VIEW_GROUP_TAG");
        com.google.android.material.datepicker.s7MlVynBG s7mlvynbg = new com.google.android.material.datepicker.s7MlVynBG(contextThemeWrapper, this.KBYw84i3W, this.INnK5Rew6, new qhPEQQaQ4());
        this.R2hkbNqWf.setAdapter(s7mlvynbg);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.M66hQ219i = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.M66hQ219i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.M66hQ219i.setAdapter(new jlGuDYsZo(this));
            this.M66hQ219i.GPLPRo6go(new G6uQuwJ9e(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            IuQbWntsc.MzoOEjc4X(materialButton, new uCG9ix8YG(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.IG30YE5GU = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.buPcffgdD = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            Dr7UqlxEV(1);
            materialButton.setText(this.SuKhTJIQc.kmSgne1rO(inflate.getContext()));
            this.R2hkbNqWf.Puu3Rhg4F(new W81lZKiLu(this, s7mlvynbg, materialButton));
            materialButton.setOnClickListener(new fMf14mR8B(this));
            materialButton3.setOnClickListener(new fE6m3O878(this, s7mlvynbg));
            materialButton2.setOnClickListener(new Ug0Gttm3z(this, s7mlvynbg));
        }
        if (!YRza28WC3.M66hQ219i(contextThemeWrapper) && (recyclerView2 = (pzd2J3aOK = new Pzd2J3aOK()).q3BipwRCk) != (recyclerView = this.R2hkbNqWf)) {
            if (recyclerView2 != null) {
                pzd2J3aOK.J4Ux7ym32();
            }
            pzd2J3aOK.q3BipwRCk = recyclerView;
            if (recyclerView != null) {
                pzd2J3aOK.GPLPRo6go();
                new Scroller(pzd2J3aOK.q3BipwRCk.getContext(), new DecelerateInterpolator());
                pzd2J3aOK.yWvV4ePLl();
            }
        }
        this.R2hkbNqWf.SuKhTJIQc(s7mlvynbg.yWvV4ePLl(this.SuKhTJIQc));
        return inflate;
    }

    public void Dr7UqlxEV(int i) {
        this.ln3nf7LH3 = i;
        if (i == 2) {
            this.M66hQ219i.getLayoutManager().vIbyhVf1d(((jlGuDYsZo) this.M66hQ219i.getAdapter()).Puu3Rhg4F(this.SuKhTJIQc.Bhmn1KIah));
            this.IG30YE5GU.setVisibility(0);
            this.buPcffgdD.setVisibility(8);
        } else if (i == 1) {
            this.IG30YE5GU.setVisibility(8);
            this.buPcffgdD.setVisibility(0);
            ln3nf7LH3(this.SuKhTJIQc);
        }
    }

    public LinearLayoutManager INnK5Rew6() {
        return (LinearLayoutManager) this.R2hkbNqWf.getLayoutManager();
    }

    @Override // con.rPEfIZQkt
    public boolean KBYw84i3W(fUfhthdYl fufhthdyl) {
        return this.XYT7vJqNO.add(fufhthdyl);
    }

    public final void SuKhTJIQc(int i) {
        this.R2hkbNqWf.post(new RG2GI7LDp(i));
    }

    public void ln3nf7LH3(mznBSeryj mznbseryj) {
        RecyclerView recyclerView;
        int i;
        com.google.android.material.datepicker.s7MlVynBG s7mlvynbg = (com.google.android.material.datepicker.s7MlVynBG) this.R2hkbNqWf.getAdapter();
        int PSTqBLTET = s7mlvynbg.kCA6Zs9sL.CBQ5d1kRq.PSTqBLTET(mznbseryj);
        int yWvV4ePLl = PSTqBLTET - s7mlvynbg.yWvV4ePLl(this.SuKhTJIQc);
        boolean z = true;
        boolean z2 = Math.abs(yWvV4ePLl) > 3;
        if (yWvV4ePLl <= 0) {
            z = false;
        }
        this.SuKhTJIQc = mznbseryj;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.R2hkbNqWf;
                i = PSTqBLTET + 3;
            }
            SuKhTJIQc(PSTqBLTET);
        }
        recyclerView = this.R2hkbNqWf;
        i = PSTqBLTET - 3;
        recyclerView.SuKhTJIQc(i);
        SuKhTJIQc(PSTqBLTET);
    }

    @Override // con.UxHHqhbTP
    public void nlGCs0NZs(Bundle bundle) {
        super.nlGCs0NZs(bundle);
        if (bundle == null) {
            bundle = this.ilHKhw3Yw;
        }
        this.kktL0P5MG = bundle.getInt("THEME_RES_ID_KEY");
        this.KBYw84i3W = (wROT9IZc9) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.INnK5Rew6 = (RAxgJWiGj) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.SuKhTJIQc = (mznBSeryj) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // con.UxHHqhbTP
    public void o4LF8RkoQ(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.kktL0P5MG);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.KBYw84i3W);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.INnK5Rew6);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.SuKhTJIQc);
    }
}
