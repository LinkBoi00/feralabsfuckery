package con;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class mVCAZ6E2C extends XflkRyC2J {
    public final AccessibilityManager Puu3Rhg4F;
    public vLb68MYqX oon79WMrY;
    public final View yWvV4ePLl;
    public static final Rect Bhmn1KIah = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final Q4TFMtvSV PSTqBLTET = new Q4TFMtvSV(10);
    public static final joOFKdxvJ MzoOEjc4X = new joOFKdxvJ(11);
    public final Rect dIocxURUo = new Rect();
    public final Rect kCA6Zs9sL = new Rect();
    public final Rect iiGwOFFnr = new Rect();
    public final int[] GPLPRo6go = new int[2];
    public int vPSbyrYWX = Integer.MIN_VALUE;
    public int CBQ5d1kRq = Integer.MIN_VALUE;
    public int kmSgne1rO = Integer.MIN_VALUE;

    public mVCAZ6E2C(View view) {
        if (view != null) {
            this.yWvV4ePLl = view;
            this.Puu3Rhg4F = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (VCCyeOu6I.tGV7Q6urW(view) == 0) {
                VCCyeOu6I.Eeka1udhb(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0139;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean Bhmn1KIah(int i, Rect rect) {
        IqwHQ6O2l iqwHQ6O2l;
        int i2;
        Object obj;
        int Puu3Rhg4F;
        int i3;
        boolean z;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        kmSgne1rO(arrayList);
        aT3qVrmRB at3qvrmrb = new aT3qVrmRB();
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            at3qvrmrb.GPLPRo6go(((Integer) arrayList.get(i7)).intValue(), CBQ5d1kRq(((Integer) arrayList.get(i7)).intValue()));
        }
        int i8 = this.CBQ5d1kRq;
        IqwHQ6O2l iqwHQ6O2l2 = i8 == Integer.MIN_VALUE ? null : (IqwHQ6O2l) at3qvrmrb.dIocxURUo(i8);
        int i9 = -1;
        if (i == 1 || i == 2) {
            View view = this.yWvV4ePLl;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            boolean z2 = RBJDIwG1D.dIocxURUo(view) == 1;
            joOFKdxvJ joofkdxvj = MzoOEjc4X;
            Q4TFMtvSV q4TFMtvSV = PSTqBLTET;
            Objects.requireNonNull(joofkdxvj);
            int Puu3Rhg4F2 = at3qvrmrb.Puu3Rhg4F();
            ArrayList arrayList2 = new ArrayList(Puu3Rhg4F2);
            for (int i10 = 0; i10 < Puu3Rhg4F2; i10++) {
                arrayList2.add((IqwHQ6O2l) at3qvrmrb.kmSgne1rO[i10]);
            }
            Collections.sort(arrayList2, new cQLm6iJtY(z2, q4TFMtvSV));
            if (i == 1) {
                int size = arrayList2.size();
                if (iqwHQ6O2l2 != null) {
                    size = arrayList2.indexOf(iqwHQ6O2l2);
                }
                int i11 = size - 1;
                if (i11 >= 0) {
                    obj = arrayList2.get(i11);
                    iqwHQ6O2l = (IqwHQ6O2l) obj;
                }
                obj = null;
                iqwHQ6O2l = (IqwHQ6O2l) obj;
            } else if (i == 2) {
                int size2 = arrayList2.size();
                int lastIndexOf = (iqwHQ6O2l2 == null ? -1 : arrayList2.lastIndexOf(iqwHQ6O2l2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    iqwHQ6O2l = (IqwHQ6O2l) obj;
                }
                obj = null;
                iqwHQ6O2l = (IqwHQ6O2l) obj;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i12 = this.CBQ5d1kRq;
            if (i12 != Integer.MIN_VALUE) {
                PSTqBLTET(i12).q3BipwRCk.getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.yWvV4ePLl;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else if (i == 130) {
                    rect2.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            joOFKdxvJ joofkdxvj2 = MzoOEjc4X;
            Q4TFMtvSV q4TFMtvSV2 = PSTqBLTET;
            Rect rect3 = new Rect(rect2);
            if (i != 17) {
                if (i == 33) {
                    i5 = rect2.height() + 1;
                } else if (i == 66) {
                    i4 = -(rect2.width() + 1);
                } else if (i == 130) {
                    i5 = -(rect2.height() + 1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, i5);
                Objects.requireNonNull(joofkdxvj2);
                Puu3Rhg4F = at3qvrmrb.Puu3Rhg4F();
                Rect rect4 = new Rect();
                iqwHQ6O2l = null;
                for (i3 = 0; i3 < Puu3Rhg4F; i3++) {
                    IqwHQ6O2l iqwHQ6O2l3 = (IqwHQ6O2l) at3qvrmrb.kmSgne1rO[i3];
                    if (iqwHQ6O2l3 != iqwHQ6O2l2) {
                        q4TFMtvSV2.J4Ux7ym32(iqwHQ6O2l3, rect4);
                        if (BB6nXdVOc.tGV7Q6urW(rect2, rect4, i)) {
                            if (BB6nXdVOc.tGV7Q6urW(rect2, rect3, i) && !BB6nXdVOc.q3BipwRCk(i, rect2, rect4, rect3)) {
                                if (!BB6nXdVOc.q3BipwRCk(i, rect2, rect3, rect4)) {
                                    int dIocxURUo = BB6nXdVOc.dIocxURUo(i, rect2, rect4);
                                    int kCA6Zs9sL = BB6nXdVOc.kCA6Zs9sL(i, rect2, rect4);
                                    int i13 = (kCA6Zs9sL * kCA6Zs9sL) + (dIocxURUo * 13 * dIocxURUo);
                                    int dIocxURUo2 = BB6nXdVOc.dIocxURUo(i, rect2, rect3);
                                    int kCA6Zs9sL2 = BB6nXdVOc.kCA6Zs9sL(i, rect2, rect3);
                                }
                            }
                            z = true;
                            if (!z) {
                                rect3.set(rect4);
                                iqwHQ6O2l = iqwHQ6O2l3;
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                }
            } else {
                i4 = rect2.width() + 1;
            }
            rect3.offset(i4, 0);
            Objects.requireNonNull(joofkdxvj2);
            Puu3Rhg4F = at3qvrmrb.Puu3Rhg4F();
            Rect rect42 = new Rect();
            iqwHQ6O2l = null;
            while (i3 < Puu3Rhg4F) {
            }
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (iqwHQ6O2l == null) {
            i2 = Integer.MIN_VALUE;
        } else {
            while (true) {
                if (i6 >= at3qvrmrb.Bhmn1KIah) {
                    break;
                } else if (at3qvrmrb.kmSgne1rO[i6] == iqwHQ6O2l) {
                    i9 = i6;
                    break;
                } else {
                    i6++;
                }
            }
            i2 = at3qvrmrb.iiGwOFFnr(i9);
        }
        return qVUwofr5s(i2);
    }

    public final IqwHQ6O2l CBQ5d1kRq(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        IqwHQ6O2l CBQ5d1kRq = IqwHQ6O2l.CBQ5d1kRq();
        CBQ5d1kRq.q3BipwRCk.setEnabled(true);
        CBQ5d1kRq.q3BipwRCk.setFocusable(true);
        CBQ5d1kRq.q3BipwRCk.setClassName("android.view.View");
        Rect rect = Bhmn1KIah;
        CBQ5d1kRq.q3BipwRCk.setBoundsInParent(rect);
        CBQ5d1kRq.q3BipwRCk.setBoundsInScreen(rect);
        View view = this.yWvV4ePLl;
        CBQ5d1kRq.J4Ux7ym32 = -1;
        CBQ5d1kRq.q3BipwRCk.setParent(view);
        ilHKhw3Yw(i, CBQ5d1kRq);
        if (CBQ5d1kRq.yWvV4ePLl() == null && CBQ5d1kRq.kCA6Zs9sL() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        CBQ5d1kRq.q3BipwRCk.getBoundsInParent(this.kCA6Zs9sL);
        if (!this.kCA6Zs9sL.equals(rect)) {
            int actions = CBQ5d1kRq.q3BipwRCk.getActions();
            if ((actions & 64) == 0) {
                int i2 = 128;
                if ((actions & 128) == 0) {
                    CBQ5d1kRq.q3BipwRCk.setPackageName(this.yWvV4ePLl.getContext().getPackageName());
                    View view2 = this.yWvV4ePLl;
                    CBQ5d1kRq.tGV7Q6urW = i;
                    CBQ5d1kRq.q3BipwRCk.setSource(view2, i);
                    boolean z = false;
                    if (this.vPSbyrYWX == i) {
                        CBQ5d1kRq.q3BipwRCk.setAccessibilityFocused(true);
                        accessibilityNodeInfo = CBQ5d1kRq.q3BipwRCk;
                    } else {
                        CBQ5d1kRq.q3BipwRCk.setAccessibilityFocused(false);
                        accessibilityNodeInfo = CBQ5d1kRq.q3BipwRCk;
                        i2 = 64;
                    }
                    accessibilityNodeInfo.addAction(i2);
                    boolean z2 = this.CBQ5d1kRq == i;
                    if (z2) {
                        CBQ5d1kRq.q3BipwRCk.addAction(2);
                    } else if (CBQ5d1kRq.oon79WMrY()) {
                        CBQ5d1kRq.q3BipwRCk.addAction(1);
                    }
                    CBQ5d1kRq.q3BipwRCk.setFocused(z2);
                    this.yWvV4ePLl.getLocationOnScreen(this.GPLPRo6go);
                    CBQ5d1kRq.q3BipwRCk.getBoundsInScreen(this.dIocxURUo);
                    if (this.dIocxURUo.equals(rect)) {
                        CBQ5d1kRq.q3BipwRCk.getBoundsInParent(this.dIocxURUo);
                        if (CBQ5d1kRq.J4Ux7ym32 != -1) {
                            IqwHQ6O2l CBQ5d1kRq2 = IqwHQ6O2l.CBQ5d1kRq();
                            for (int i3 = CBQ5d1kRq.J4Ux7ym32; i3 != -1; i3 = CBQ5d1kRq2.J4Ux7ym32) {
                                View view3 = this.yWvV4ePLl;
                                CBQ5d1kRq2.J4Ux7ym32 = -1;
                                CBQ5d1kRq2.q3BipwRCk.setParent(view3, -1);
                                CBQ5d1kRq2.q3BipwRCk.setBoundsInParent(Bhmn1KIah);
                                ilHKhw3Yw(i3, CBQ5d1kRq2);
                                CBQ5d1kRq2.q3BipwRCk.getBoundsInParent(this.kCA6Zs9sL);
                                Rect rect2 = this.dIocxURUo;
                                Rect rect3 = this.kCA6Zs9sL;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            CBQ5d1kRq2.q3BipwRCk.recycle();
                        }
                        this.dIocxURUo.offset(this.GPLPRo6go[0] - this.yWvV4ePLl.getScrollX(), this.GPLPRo6go[1] - this.yWvV4ePLl.getScrollY());
                    }
                    if (this.yWvV4ePLl.getLocalVisibleRect(this.iiGwOFFnr)) {
                        this.iiGwOFFnr.offset(this.GPLPRo6go[0] - this.yWvV4ePLl.getScrollX(), this.GPLPRo6go[1] - this.yWvV4ePLl.getScrollY());
                        if (this.dIocxURUo.intersect(this.iiGwOFFnr)) {
                            CBQ5d1kRq.q3BipwRCk.setBoundsInScreen(this.dIocxURUo);
                            Rect rect4 = this.dIocxURUo;
                            if (rect4 != null && !rect4.isEmpty() && this.yWvV4ePLl.getWindowVisibility() == 0) {
                                View view4 = this.yWvV4ePLl;
                                while (true) {
                                    ViewParent parent = view4.getParent();
                                    if (parent instanceof View) {
                                        view4 = (View) parent;
                                        if (view4.getAlpha() > 0.0f) {
                                            if (view4.getVisibility() != 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                CBQ5d1kRq.q3BipwRCk.setVisibleToUser(true);
                            }
                        }
                    }
                    return CBQ5d1kRq;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final boolean Eeka1udhb(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i == Integer.MIN_VALUE || !this.Puu3Rhg4F.isEnabled() || (parent = this.yWvV4ePLl.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            IqwHQ6O2l PSTqBLTET2 = PSTqBLTET(i);
            accessibilityEvent.getText().add(PSTqBLTET2.yWvV4ePLl());
            accessibilityEvent.setContentDescription(PSTqBLTET2.kCA6Zs9sL());
            accessibilityEvent.setScrollable(PSTqBLTET2.q3BipwRCk.isScrollable());
            accessibilityEvent.setPassword(PSTqBLTET2.q3BipwRCk.isPassword());
            accessibilityEvent.setEnabled(PSTqBLTET2.q3BipwRCk.isEnabled());
            accessibilityEvent.setChecked(PSTqBLTET2.q3BipwRCk.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(PSTqBLTET2.q3BipwRCk.getClassName());
                accessibilityEvent.setSource(this.yWvV4ePLl, i);
                accessibilityEvent.setPackageName(this.yWvV4ePLl.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            this.yWvV4ePLl.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.yWvV4ePLl, accessibilityEvent);
    }

    @Override // con.XflkRyC2J
    public DGdyNqLvN J4Ux7ym32(View view) {
        if (this.oon79WMrY == null) {
            this.oon79WMrY = new vLb68MYqX(this);
        }
        return this.oon79WMrY;
    }

    public abstract boolean MzoOEjc4X(int i, int i2, Bundle bundle);

    public IqwHQ6O2l PSTqBLTET(int i) {
        if (i != -1) {
            return CBQ5d1kRq(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.yWvV4ePLl);
        IqwHQ6O2l iqwHQ6O2l = new IqwHQ6O2l(obtain);
        View view = this.yWvV4ePLl;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        kmSgne1rO(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                iqwHQ6O2l.q3BipwRCk.addChild(this.yWvV4ePLl, ((Integer) arrayList.get(i2)).intValue());
            }
            return iqwHQ6O2l;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    @Override // con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
        Chip.mhl5lIdbQ mhl5lidbq = (Chip.mhl5lIdbQ) this;
        iqwHQ6O2l.q3BipwRCk.setCheckable(Chip.this.kCA6Zs9sL());
        iqwHQ6O2l.q3BipwRCk.setClickable(Chip.this.isClickable());
        iqwHQ6O2l.q3BipwRCk.setClassName(Chip.this.getAccessibilityClassName());
        iqwHQ6O2l.q3BipwRCk.setText(Chip.this.getText());
    }

    public abstract void ilHKhw3Yw(int i, IqwHQ6O2l iqwHQ6O2l);

    public abstract void kmSgne1rO(List list);

    public final boolean oon79WMrY(int i) {
        if (this.vPSbyrYWX != i) {
            return false;
        }
        this.vPSbyrYWX = Integer.MIN_VALUE;
        this.yWvV4ePLl.invalidate();
        Eeka1udhb(i, 65536);
        return true;
    }

    public final boolean qVUwofr5s(int i) {
        int i2;
        if ((!this.yWvV4ePLl.isFocused() && !this.yWvV4ePLl.requestFocus()) || (i2 = this.CBQ5d1kRq) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            vPSbyrYWX(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.CBQ5d1kRq = i;
        Chip.mhl5lIdbQ mhl5lidbq = (Chip.mhl5lIdbQ) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.sk5s77z6Q = true;
            chip.refreshDrawableState();
        }
        Eeka1udhb(i, 8);
        return true;
    }

    @Override // con.XflkRyC2J
    public void tGV7Q6urW(View view, AccessibilityEvent accessibilityEvent) {
        this.q3BipwRCk.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean vPSbyrYWX(int i) {
        if (this.CBQ5d1kRq != i) {
            return false;
        }
        this.CBQ5d1kRq = Integer.MIN_VALUE;
        Chip.mhl5lIdbQ mhl5lidbq = (Chip.mhl5lIdbQ) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.sk5s77z6Q = false;
            chip.refreshDrawableState();
        }
        Eeka1udhb(i, 8);
        return true;
    }
}
