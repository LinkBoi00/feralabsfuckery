package con;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.feravolt.preload.R;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class wRt60CcGM extends ListView {
    public ffsBxLfwm Eeka1udhb;
    public boolean RG6kpfv3v;
    public go0qReAcx WaUP0CF08;
    public boolean dXrmkklc8;
    public int ilHKhw3Yw;
    public boolean ixWaw2akD;
    public Field qVUwofr5s;
    public O30O4Sjfj sk5s77z6Q;
    public final Rect CBQ5d1kRq = new Rect();
    public int kmSgne1rO = 0;
    public int Bhmn1KIah = 0;
    public int PSTqBLTET = 0;
    public int MzoOEjc4X = 0;

    public wRt60CcGM(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.RG6kpfv3v = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.qVUwofr5s = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean J4Ux7ym32(android.view.MotionEvent r17, int r18) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: con.wRt60CcGM.J4Ux7ym32(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.CBQ5d1kRq.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.CBQ5d1kRq);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.WaUP0CF08 == null) {
            super.drawableStateChanged();
            ffsBxLfwm ffsbxlfwm = this.Eeka1udhb;
            if (ffsbxlfwm != null) {
                ffsbxlfwm.kmSgne1rO = true;
            }
            tGV7Q6urW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.RG6kpfv3v || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.RG6kpfv3v || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.RG6kpfv3v || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.RG6kpfv3v && this.dXrmkklc8) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View, android.widget.AdapterView
    public void onDetachedFromWindow() {
        this.WaUP0CF08 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.WaUP0CF08 == null) {
            go0qReAcx go0qreacx = new go0qReAcx(this);
            this.WaUP0CF08 = go0qreacx;
            post(go0qreacx);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                tGV7Q6urW();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.ilHKhw3Yw = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        go0qReAcx go0qreacx = this.WaUP0CF08;
        if (go0qreacx != null) {
            wRt60CcGM wrt60ccgm = (wRt60CcGM) go0qreacx.kmSgne1rO;
            wrt60ccgm.WaUP0CF08 = null;
            wrt60ccgm.removeCallbacks(go0qreacx);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int q3BipwRCk(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        View view = null;
        while (i5 < count) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return (i3 < 0 || i5 <= i3 || i7 <= 0 || i4 == i2) ? i2 : i7;
            }
            if (i3 >= 0 && i5 >= i3) {
                i7 = i4;
            }
            i5++;
        }
        return i4;
    }

    public void setListSelectionHidden(boolean z) {
        this.dXrmkklc8 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        ffsBxLfwm ffsbxlfwm = drawable != null ? new ffsBxLfwm(drawable) : null;
        this.Eeka1udhb = ffsbxlfwm;
        super.setSelector(ffsbxlfwm);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.kmSgne1rO = rect.left;
        this.Bhmn1KIah = rect.top;
        this.PSTqBLTET = rect.right;
        this.MzoOEjc4X = rect.bottom;
    }

    public final void tGV7Q6urW() {
        Drawable selector = getSelector();
        if (selector != null && this.ixWaw2akD && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
