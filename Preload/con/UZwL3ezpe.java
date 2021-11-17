package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.RG2GI7LDp;
import com.feravolt.preload.R;
import con.xT3tobMV0;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class UZwL3ezpe extends ConstraintLayout {
    public int AqaWJg0b4;
    public dOSsQaJVg mUqPm6GBh;
    public final Runnable nlGCs0NZs = new go0qReAcx(this);

    public UZwL3ezpe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        dOSsQaJVg dossqajvg = new dOSsQaJVg();
        this.mUqPm6GBh = dossqajvg;
        Oytaca5rU oytaca5rU = new Oytaca5rU(0.5f);
        xT3tobMV0 xt3tobmv0 = dossqajvg.CBQ5d1kRq.q3BipwRCk;
        Objects.requireNonNull(xt3tobmv0);
        xT3tobMV0.RG2GI7LDp rG2GI7LDp = new xT3tobMV0.RG2GI7LDp(xt3tobmv0);
        rG2GI7LDp.kCA6Zs9sL = oytaca5rU;
        rG2GI7LDp.iiGwOFFnr = oytaca5rU;
        rG2GI7LDp.GPLPRo6go = oytaca5rU;
        rG2GI7LDp.Puu3Rhg4F = oytaca5rU;
        dossqajvg.CBQ5d1kRq.q3BipwRCk = rG2GI7LDp.q3BipwRCk();
        dossqajvg.invalidateSelf();
        this.mUqPm6GBh.MzoOEjc4X(ColorStateList.valueOf(-1));
        dOSsQaJVg dossqajvg2 = this.mUqPm6GBh;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(this, dossqajvg2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.ixWaw2akD, i, 0);
        this.AqaWJg0b4 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void PSTqBLTET() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
        rG2GI7LDp.J4Ux7ym32(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.AqaWJg0b4;
                if (!rG2GI7LDp.tGV7Q6urW.containsKey(Integer.valueOf(id))) {
                    rG2GI7LDp.tGV7Q6urW.put(Integer.valueOf(id), new RG2GI7LDp.C0003RG2GI7LDp());
                }
                RG2GI7LDp.mhl5lIdbQ mhl5lidbq = ((RG2GI7LDp.C0003RG2GI7LDp) rG2GI7LDp.tGV7Q6urW.get(Integer.valueOf(id))).dIocxURUo;
                mhl5lidbq.dfpT1j18n = R.id.circle_center;
                mhl5lidbq.iMyQMM6Qj = i4;
                mhl5lidbq.cAwN510t2 = f;
                f = (360.0f / ((float) (childCount - i))) + f;
            }
        }
        rG2GI7LDp.q3BipwRCk(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            view.setId(RBJDIwG1D.q3BipwRCk());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.nlGCs0NZs);
            handler.post(this.nlGCs0NZs);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        PSTqBLTET();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.nlGCs0NZs);
            handler.post(this.nlGCs0NZs);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.mUqPm6GBh.MzoOEjc4X(ColorStateList.valueOf(i));
    }
}
