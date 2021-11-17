package con;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class p2GzZFWt4 {
    public ViewParent J4Ux7ym32;
    public boolean dIocxURUo;
    public int[] kCA6Zs9sL;
    public ViewParent q3BipwRCk;
    public final View tGV7Q6urW;

    public p2GzZFWt4(View view) {
        this.tGV7Q6urW = view;
    }

    public final ViewParent GPLPRo6go(int i) {
        if (i == 0) {
            return this.q3BipwRCk;
        }
        if (i != 1) {
            return null;
        }
        return this.J4Ux7ym32;
    }

    public boolean J4Ux7ym32(float f, float f2) {
        ViewParent GPLPRo6go;
        if (!this.dIocxURUo || (GPLPRo6go = GPLPRo6go(0)) == null) {
            return false;
        }
        try {
            return GPLPRo6go.onNestedPreFling(this.tGV7Q6urW, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + GPLPRo6go + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public boolean Puu3Rhg4F(int i) {
        return GPLPRo6go(i) != null;
    }

    public void dIocxURUo(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        iiGwOFFnr(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean iiGwOFFnr(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent GPLPRo6go;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.dIocxURUo || (GPLPRo6go = GPLPRo6go(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.tGV7Q6urW.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.kCA6Zs9sL == null) {
                this.kCA6Zs9sL = new int[2];
            }
            int[] iArr4 = this.kCA6Zs9sL;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.tGV7Q6urW;
        if (GPLPRo6go instanceof mmX2UQLSo) {
            ((mmX2UQLSo) GPLPRo6go).dIocxURUo(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (GPLPRo6go instanceof QiVwQCcLp) {
                ((QiVwQCcLp) GPLPRo6go).kCA6Zs9sL(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    GPLPRo6go.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + GPLPRo6go + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            this.tGV7Q6urW.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    public boolean kCA6Zs9sL(int i, int i2, int i3, int i4, int[] iArr) {
        return iiGwOFFnr(i, i2, i3, i4, iArr, 0, null);
    }

    public void oon79WMrY(int i) {
        ViewParent GPLPRo6go = GPLPRo6go(i);
        if (GPLPRo6go != null) {
            View view = this.tGV7Q6urW;
            if (GPLPRo6go instanceof QiVwQCcLp) {
                ((QiVwQCcLp) GPLPRo6go).J4Ux7ym32(view, i);
            } else if (i == 0) {
                try {
                    GPLPRo6go.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + GPLPRo6go + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.q3BipwRCk = null;
            } else if (i == 1) {
                this.J4Ux7ym32 = null;
            }
        }
    }

    public boolean q3BipwRCk(float f, float f2, boolean z) {
        ViewParent GPLPRo6go;
        if (!this.dIocxURUo || (GPLPRo6go = GPLPRo6go(0)) == null) {
            return false;
        }
        try {
            return GPLPRo6go.onNestedFling(this.tGV7Q6urW, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + GPLPRo6go + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public boolean tGV7Q6urW(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent GPLPRo6go;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.dIocxURUo || (GPLPRo6go = GPLPRo6go(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.tGV7Q6urW.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.kCA6Zs9sL == null) {
                    this.kCA6Zs9sL = new int[2];
                }
                iArr3 = this.kCA6Zs9sL;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.tGV7Q6urW;
            if (GPLPRo6go instanceof QiVwQCcLp) {
                ((QiVwQCcLp) GPLPRo6go).tGV7Q6urW(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                try {
                    GPLPRo6go.onNestedPreScroll(view, i, i2, iArr3);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + GPLPRo6go + " does not implement interface method onNestedPreScroll", e);
                }
            }
            if (iArr2 != null) {
                this.tGV7Q6urW.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public boolean yWvV4ePLl(int i, int i2) {
        boolean z;
        if (GPLPRo6go(i2) != null) {
            return true;
        }
        if (this.dIocxURUo) {
            View view = this.tGV7Q6urW;
            for (ViewParent parent = this.tGV7Q6urW.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.tGV7Q6urW;
                boolean z2 = parent instanceof QiVwQCcLp;
                if (z2) {
                    z = ((QiVwQCcLp) parent).iiGwOFFnr(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.q3BipwRCk = parent;
                    } else if (i2 == 1) {
                        this.J4Ux7ym32 = parent;
                    }
                    View view3 = this.tGV7Q6urW;
                    if (z2) {
                        ((QiVwQCcLp) parent).q3BipwRCk(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }
}
