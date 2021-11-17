package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.K6PL0z3I0;
import con.RisoK3egD;
import con.YxooWVt2U;
import con.epVYzXVdP;
import con.pL929LqVg;
import con.s7MlVynBG;
import con.vk4vXxjbi;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class AppBarLayout extends LinearLayout {

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends pL929LqVg {
        public WeakReference oon79WMrY;
        public int yWvV4ePLl;

        /* loaded from: classes.dex */
        public static class RG2GI7LDp extends s7MlVynBG {
            public static final Parcelable.Creator<RG2GI7LDp> CREATOR = new vk4vXxjbi(1);
            public boolean Bhmn1KIah;
            public float MzoOEjc4X;
            public int PSTqBLTET;
            public boolean ilHKhw3Yw;

            public RG2GI7LDp(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.Bhmn1KIah = parcel.readByte() != 0;
                this.PSTqBLTET = parcel.readInt();
                this.MzoOEjc4X = parcel.readFloat();
                this.ilHKhw3Yw = parcel.readByte() == 0 ? false : z;
            }

            @Override // con.s7MlVynBG, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.CBQ5d1kRq, i);
                parcel.writeByte(this.Bhmn1KIah ? (byte) 1 : 0);
                parcel.writeInt(this.PSTqBLTET);
                parcel.writeFloat(this.MzoOEjc4X);
                parcel.writeByte(this.ilHKhw3Yw ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public void Bhmn1KIah(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            K6PL0z3I0.q3BipwRCk(view);
            if (parcelable instanceof RG2GI7LDp) {
                RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) parcelable;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public void CBQ5d1kRq(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            K6PL0z3I0.q3BipwRCk(view);
            if (i4 < 0) {
                throw null;
            } else if (i4 == 0) {
                sk5s77z6Q(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean MzoOEjc4X(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            K6PL0z3I0.q3BipwRCk(view);
            if ((i & 2) == 0) {
                this.oon79WMrY = null;
                this.yWvV4ePLl = i2;
                return false;
            }
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public Parcelable PSTqBLTET(CoordinatorLayout coordinatorLayout, View view) {
            K6PL0z3I0.q3BipwRCk(view);
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            Eeka1udhb();
            throw null;
        }

        @Override // con.cUyADHjN1, androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i) {
            K6PL0z3I0.q3BipwRCk(view);
            super.Puu3Rhg4F(coordinatorLayout, null, i);
            throw null;
        }

        public final View RG6kpfv3v(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof epVYzXVdP) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public void ilHKhw3Yw(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            K6PL0z3I0.q3BipwRCk(view);
            if (this.yWvV4ePLl == 0 || i == 1) {
                ixWaw2akD();
                throw null;
            } else {
                this.oon79WMrY = new WeakReference(view2);
            }
        }

        public int ixWaw2akD() {
            return Eeka1udhb() + 0;
        }

        public final void sk5s77z6Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            IuQbWntsc.kmSgne1rO(IqwHQ6O2l.RG2GI7LDp.Puu3Rhg4F.q3BipwRCk(), coordinatorLayout);
            IuQbWntsc.oon79WMrY(coordinatorLayout, 0);
            IuQbWntsc.kmSgne1rO(IqwHQ6O2l.RG2GI7LDp.yWvV4ePLl.q3BipwRCk(), coordinatorLayout);
            IuQbWntsc.oon79WMrY(coordinatorLayout, 0);
            if (RG6kpfv3v(coordinatorLayout) != null) {
                Objects.requireNonNull(appBarLayout);
                throw null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public void vPSbyrYWX(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            K6PL0z3I0.q3BipwRCk(view);
            if (i2 == 0) {
                throw null;
            } else if (i2 < 0) {
                Objects.requireNonNull(null);
                throw null;
            } else {
                throw null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean yWvV4ePLl(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            K6PL0z3I0.q3BipwRCk(view);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends YxooWVt2U {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.sk5s77z6Q);
            this.tGV7Q6urW = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // con.YxooWVt2U
        public View RG6kpfv3v(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean dIocxURUo(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.mhl5lIdbQ mhl5lidbq = ((CoordinatorLayout.s7MlVynBG) view2.getLayoutParams()).q3BipwRCk;
            if (mhl5lidbq instanceof BaseBehavior) {
                Objects.requireNonNull((BaseBehavior) mhl5lidbq);
                int bottom = (((view2.getBottom() - view.getTop()) + 0) + 0) - ixWaw2akD(view2);
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                view.offsetTopAndBottom(bottom);
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public void kCA6Zs9sL(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
        public boolean kmSgne1rO(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            List oon79WMrY = coordinatorLayout.oon79WMrY(view);
            int size = oon79WMrY.size();
            for (int i = 0; i < size; i++) {
                View view2 = (View) oon79WMrY.get(i);
            }
            return false;
        }
    }
}
