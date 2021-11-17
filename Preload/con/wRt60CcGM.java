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
    public boolean J4Ux7ym32(MotionEvent motionEvent, int i) {
        boolean z;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                z = true;
                z2 = false;
                if (z || z2) {
                    this.ixWaw2akD = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt = getChildAt(this.ilHKhw3Yw - getFirstVisiblePosition());
                    if (childAt != null) {
                        childAt.setPressed(false);
                    }
                }
                if (!z) {
                    if (this.sk5s77z6Q == null) {
                        this.sk5s77z6Q = new O30O4Sjfj(this);
                    }
                    O30O4Sjfj o30O4Sjfj = this.sk5s77z6Q;
                    boolean z3 = o30O4Sjfj.iMyQMM6Qj;
                    o30O4Sjfj.iMyQMM6Qj = true;
                    o30O4Sjfj.onTouch(this, motionEvent);
                } else {
                    O30O4Sjfj o30O4Sjfj2 = this.sk5s77z6Q;
                    if (o30O4Sjfj2 != null) {
                        if (o30O4Sjfj2.iMyQMM6Qj) {
                            o30O4Sjfj2.kCA6Zs9sL();
                        }
                        o30O4Sjfj2.iMyQMM6Qj = false;
                    }
                }
                return z;
            }
            z = false;
            z2 = false;
            if (z) {
            }
            this.ixWaw2akD = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.ilHKhw3Yw - getFirstVisiblePosition());
            if (childAt != null) {
            }
            if (!z) {
            }
            return z;
        } else {
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = (float) x;
                float f2 = (float) y;
                this.ixWaw2akD = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.ilHKhw3Yw;
                if (!(i2 == -1 || (childAt2 = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt2 == childAt3 || !childAt2.isPressed())) {
                    childAt2.setPressed(false);
                }
                this.ilHKhw3Yw = pointToPosition;
                childAt3.drawableHotspotChanged(f - ((float) childAt3.getLeft()), f2 - ((float) childAt3.getTop()));
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || pointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.CBQ5d1kRq;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.kmSgne1rO;
                rect.top -= this.Bhmn1KIah;
                rect.right += this.PSTqBLTET;
                rect.bottom += this.MzoOEjc4X;
                try {
                    boolean z5 = this.qVUwofr5s.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        this.qVUwofr5s.set(this, Boolean.valueOf(!z5));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z4) {
                    Rect rect2 = this.CBQ5d1kRq;
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (!(selector2 == null || pointToPosition == -1)) {
                    selector2.setHotspot(f, f2);
                }
                ffsBxLfwm ffsbxlfwm = this.Eeka1udhb;
                if (ffsbxlfwm != null) {
                    ffsbxlfwm.kmSgne1rO = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = false;
                z = true;
            }
            if (z) {
            }
            this.ixWaw2akD = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.ilHKhw3Yw - getFirstVisiblePosition());
            if (childAt != null) {
            }
            if (!z) {
            }
            return z;
        }
        z = false;
        z2 = false;
        if (z) {
        }
        this.ixWaw2akD = false;
        setPressed(false);
        drawableStateChanged();
        childAt = getChildAt(this.ilHKhw3Yw - getFirstVisiblePosition());
        if (childAt != null) {
        }
        if (!z) {
        }
        return z;
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
