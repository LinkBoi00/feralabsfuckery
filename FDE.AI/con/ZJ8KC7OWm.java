package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class ZJ8KC7OWm extends View {
    public Context Bhmn1KIah;
    public int[] CBQ5d1kRq;
    public String MzoOEjc4X;
    public JAwcpriIz PSTqBLTET;
    public String ilHKhw3Yw;
    public int kmSgne1rO;
    public HashMap qVUwofr5s;

    public ZJ8KC7OWm(Context context) {
        super(context);
        this.CBQ5d1kRq = new int[32];
        this.qVUwofr5s = new HashMap();
        this.Bhmn1KIah = context;
        kCA6Zs9sL(null);
    }

    public ZJ8KC7OWm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CBQ5d1kRq = new int[32];
        this.qVUwofr5s = new HashMap();
        this.Bhmn1KIah = context;
        kCA6Zs9sL(attributeSet);
    }

    public final void J4Ux7ym32(int i) {
        if (i != getId()) {
            int i2 = this.kmSgne1rO + 1;
            int[] iArr = this.CBQ5d1kRq;
            if (i2 > iArr.length) {
                this.CBQ5d1kRq = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.CBQ5d1kRq;
            int i3 = this.kmSgne1rO;
            iArr2[i3] = i;
            this.kmSgne1rO = i3 + 1;
        }
    }

    public final int dIocxURUo(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.Bhmn1KIah.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.CBQ5d1kRq, this.kmSgne1rO);
    }

    public void iiGwOFFnr() {
        if (this.PSTqBLTET != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.RG2GI7LDp) {
                ((ConstraintLayout.RG2GI7LDp) layoutParams).KlYagMRWx = (k007RzV1x) this.PSTqBLTET;
            }
        }
    }

    public abstract void kCA6Zs9sL(AttributeSet attributeSet);

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.MzoOEjc4X;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.ilHKhw3Yw;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void q3BipwRCk(String str) {
        if (str != null && str.length() != 0 && this.Bhmn1KIah != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object Puu3Rhg4F = constraintLayout2.Puu3Rhg4F(0, trim);
                if (Puu3Rhg4F instanceof Integer) {
                    i = ((Integer) Puu3Rhg4F).intValue();
                }
            }
            if (i == 0 && constraintLayout2 != null) {
                i = dIocxURUo(constraintLayout2, trim);
            }
            if (i == 0) {
                try {
                    i = xP6F5SR9v.class.getField(trim).getInt(null);
                } catch (Exception unused) {
                }
            }
            if (i == 0) {
                i = this.Bhmn1KIah.getResources().getIdentifier(trim, "id", this.Bhmn1KIah.getPackageName());
            }
            if (i != 0) {
                this.qVUwofr5s.put(Integer.valueOf(i), trim);
                J4Ux7ym32(i);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public void setIds(String str) {
        this.MzoOEjc4X = str;
        if (str != null) {
            int i = 0;
            this.kmSgne1rO = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    q3BipwRCk(str.substring(i));
                    return;
                } else {
                    q3BipwRCk(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.ilHKhw3Yw = str;
        if (str != null) {
            int i = 0;
            this.kmSgne1rO = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    tGV7Q6urW(str.substring(i));
                    return;
                } else {
                    tGV7Q6urW(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.MzoOEjc4X = null;
        this.kmSgne1rO = 0;
        for (int i : iArr) {
            J4Ux7ym32(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.MzoOEjc4X == null) {
            J4Ux7ym32(i);
        }
    }

    public final void tGV7Q6urW(String str) {
        if (!(str == null || str.length() == 0 || this.Bhmn1KIah == null)) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.RG2GI7LDp) && trim.equals(((ConstraintLayout.RG2GI7LDp) layoutParams).wIZEdYHUn)) {
                    if (childAt.getId() == -1) {
                        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("to use ConstraintTag view ");
                        q3BipwRCk.append(childAt.getClass().getSimpleName());
                        q3BipwRCk.append(" must have an ID");
                        Log.w("ConstraintHelper", q3BipwRCk.toString());
                    } else {
                        J4Ux7ym32(childAt.getId());
                    }
                }
            }
        }
    }
}
