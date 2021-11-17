package con;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class LozNPPdAO {
    public static final Interpolator ixWaw2akD = new jT0DiZ2FL();
    public float Bhmn1KIah;
    public VelocityTracker CBQ5d1kRq;
    public boolean Eeka1udhb;
    public float[] GPLPRo6go;
    public int J4Ux7ym32;
    public OverScroller MzoOEjc4X;
    public int PSTqBLTET;
    public int[] Puu3Rhg4F;
    public float[] dIocxURUo;
    public final ViewGroup dXrmkklc8;
    public float[] iiGwOFFnr;
    public final RG2GI7LDp ilHKhw3Yw;
    public float[] kCA6Zs9sL;
    public float kmSgne1rO;
    public int[] oon79WMrY;
    public int q3BipwRCk;
    public View qVUwofr5s;
    public int vPSbyrYWX;
    public int[] yWvV4ePLl;
    public int tGV7Q6urW = -1;
    public final Runnable RG6kpfv3v = new go0qReAcx(this);

    /* loaded from: classes.dex */
    public static abstract class RG2GI7LDp {
        public abstract void GPLPRo6go(View view, int i, int i2, int i3, int i4);

        public abstract int J4Ux7ym32(View view, int i, int i2);

        public abstract void Puu3Rhg4F(View view, float f, float f2);

        public int dIocxURUo(View view) {
            return 0;
        }

        public abstract void iiGwOFFnr(int i);

        public void kCA6Zs9sL(View view, int i) {
        }

        public abstract int q3BipwRCk(View view, int i, int i2);

        public int tGV7Q6urW(View view) {
            return 0;
        }

        public abstract boolean yWvV4ePLl(View view, int i);
    }

    public LozNPPdAO(Context context, ViewGroup viewGroup, RG2GI7LDp rG2GI7LDp) {
        if (rG2GI7LDp != null) {
            this.dXrmkklc8 = viewGroup;
            this.ilHKhw3Yw = rG2GI7LDp;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.PSTqBLTET = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.J4Ux7ym32 = viewConfiguration.getScaledTouchSlop();
            this.kmSgne1rO = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.Bhmn1KIah = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.MzoOEjc4X = new OverScroller(context, ixWaw2akD);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public void Bhmn1KIah(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            q3BipwRCk();
        }
        if (this.CBQ5d1kRq == null) {
            this.CBQ5d1kRq = VelocityTracker.obtain();
        }
        this.CBQ5d1kRq.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.q3BipwRCk != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (kmSgne1rO(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.dIocxURUo[pointerId];
                                float f2 = y - this.kCA6Zs9sL[pointerId];
                                MzoOEjc4X(f, f2, pointerId);
                                if (this.q3BipwRCk != 1) {
                                    View vPSbyrYWX = vPSbyrYWX((int) x, (int) y);
                                    if (dIocxURUo(vPSbyrYWX, f, f2) && ixWaw2akD(vPSbyrYWX, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (kmSgne1rO(this.tGV7Q6urW)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.tGV7Q6urW);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.iiGwOFFnr;
                        int i3 = this.tGV7Q6urW;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.GPLPRo6go[i3]);
                        int left = this.qVUwofr5s.getLeft() + i4;
                        int top = this.qVUwofr5s.getTop() + i5;
                        int left2 = this.qVUwofr5s.getLeft();
                        int top2 = this.qVUwofr5s.getTop();
                        if (i4 != 0) {
                            left = this.ilHKhw3Yw.q3BipwRCk(this.qVUwofr5s, left, i4);
                            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                            this.qVUwofr5s.offsetLeftAndRight(left - left2);
                        }
                        if (i5 != 0) {
                            top = this.ilHKhw3Yw.J4Ux7ym32(this.qVUwofr5s, top, i5);
                            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                            this.qVUwofr5s.offsetTopAndBottom(top - top2);
                        }
                        if (!(i4 == 0 && i5 == 0)) {
                            this.ilHKhw3Yw.GPLPRo6go(this.qVUwofr5s, left, top, left - left2, top - top2);
                        }
                    } else {
                        return;
                    }
                    qVUwofr5s(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        ilHKhw3Yw(x3, y3, pointerId2);
                        if (this.q3BipwRCk == 0) {
                            ixWaw2akD(vPSbyrYWX((int) x3, (int) y3), pointerId2);
                            if ((this.Puu3Rhg4F[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i6 = (int) x3;
                            int i7 = (int) y3;
                            View view = this.qVUwofr5s;
                            if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                ixWaw2akD(this.qVUwofr5s, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.q3BipwRCk == 1 && pointerId3 == this.tGV7Q6urW) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.tGV7Q6urW) {
                                    View vPSbyrYWX2 = vPSbyrYWX((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view2 = this.qVUwofr5s;
                                    if (vPSbyrYWX2 == view2 && ixWaw2akD(view2, pointerId4)) {
                                        i = this.tGV7Q6urW;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                PSTqBLTET();
                            }
                        }
                        GPLPRo6go(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.q3BipwRCk == 1) {
                    oon79WMrY(0.0f, 0.0f);
                }
            } else if (this.q3BipwRCk == 1) {
                PSTqBLTET();
            }
            q3BipwRCk();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View vPSbyrYWX3 = vPSbyrYWX((int) x4, (int) y4);
        ilHKhw3Yw(x4, y4, pointerId5);
        ixWaw2akD(vPSbyrYWX3, pointerId5);
        if ((this.Puu3Rhg4F[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.ilHKhw3Yw);
    }

    public final boolean CBQ5d1kRq(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.qVUwofr5s.getLeft();
        int top = this.qVUwofr5s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.MzoOEjc4X.abortAnimation();
            Eeka1udhb(0);
            return false;
        }
        View view = this.qVUwofr5s;
        int iiGwOFFnr = iiGwOFFnr(i3, (int) this.Bhmn1KIah, (int) this.kmSgne1rO);
        int iiGwOFFnr2 = iiGwOFFnr(i4, (int) this.Bhmn1KIah, (int) this.kmSgne1rO);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(iiGwOFFnr);
        int abs4 = Math.abs(iiGwOFFnr2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (iiGwOFFnr != 0) {
            f = (float) abs3;
            f2 = (float) i7;
        } else {
            f = (float) abs;
            f2 = (float) i8;
        }
        float f5 = f / f2;
        if (iiGwOFFnr2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        int Puu3Rhg4F = Puu3Rhg4F(i5, iiGwOFFnr, this.ilHKhw3Yw.tGV7Q6urW(view));
        float Puu3Rhg4F2 = ((float) Puu3Rhg4F(i6, iiGwOFFnr2, this.ilHKhw3Yw.dIocxURUo(view))) * (f4 / f3);
        this.MzoOEjc4X.startScroll(left, top, i5, i6, (int) (Puu3Rhg4F2 + (((float) Puu3Rhg4F) * f5)));
        Eeka1udhb(2);
        return true;
    }

    public void Eeka1udhb(int i) {
        this.dXrmkklc8.removeCallbacks(this.RG6kpfv3v);
        if (this.q3BipwRCk != i) {
            this.q3BipwRCk = i;
            this.ilHKhw3Yw.iiGwOFFnr(i);
            if (this.q3BipwRCk == 0) {
                this.qVUwofr5s = null;
            }
        }
    }

    public final void GPLPRo6go(int i) {
        float[] fArr = this.dIocxURUo;
        if (fArr != null) {
            int i2 = this.vPSbyrYWX;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.kCA6Zs9sL[i] = 0.0f;
                this.iiGwOFFnr[i] = 0.0f;
                this.GPLPRo6go[i] = 0.0f;
                this.Puu3Rhg4F[i] = 0;
                this.yWvV4ePLl[i] = 0;
                this.oon79WMrY[i] = 0;
                this.vPSbyrYWX = (~i3) & i2;
            }
        }
    }

    public void J4Ux7ym32(View view, int i) {
        if (view.getParent() == this.dXrmkklc8) {
            this.qVUwofr5s = view;
            this.tGV7Q6urW = i;
            this.ilHKhw3Yw.kCA6Zs9sL(view, i);
            Eeka1udhb(1);
            return;
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        q3BipwRCk.append(this.dXrmkklc8);
        q3BipwRCk.append(")");
        throw new IllegalArgumentException(q3BipwRCk.toString());
    }

    public final void MzoOEjc4X(float f, float f2, int i) {
        boolean tGV7Q6urW = tGV7Q6urW(f, f2, i, 1);
        if (tGV7Q6urW(f2, f, i, 4)) {
            tGV7Q6urW |= true;
        }
        if (tGV7Q6urW(f, f2, i, 2)) {
            tGV7Q6urW |= true;
        }
        if (tGV7Q6urW(f2, f, i, 8)) {
            tGV7Q6urW |= true;
        }
        if (tGV7Q6urW) {
            int[] iArr = this.yWvV4ePLl;
            iArr[i] = iArr[i] | tGV7Q6urW;
            Objects.requireNonNull(this.ilHKhw3Yw);
        }
    }

    public final void PSTqBLTET() {
        this.CBQ5d1kRq.computeCurrentVelocity(1000, this.kmSgne1rO);
        oon79WMrY(kCA6Zs9sL(this.CBQ5d1kRq.getXVelocity(this.tGV7Q6urW), this.Bhmn1KIah, this.kmSgne1rO), kCA6Zs9sL(this.CBQ5d1kRq.getYVelocity(this.tGV7Q6urW), this.Bhmn1KIah, this.kmSgne1rO));
    }

    public final int Puu3Rhg4F(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.dXrmkklc8.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean RG6kpfv3v(MotionEvent motionEvent) {
        boolean z;
        View vPSbyrYWX;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            q3BipwRCk();
        }
        if (this.CBQ5d1kRq == null) {
            this.CBQ5d1kRq = VelocityTracker.obtain();
        }
        this.CBQ5d1kRq.addMovement(motionEvent);
        boolean z2 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            ilHKhw3Yw(x, y, pointerId);
                            int i = this.q3BipwRCk;
                            if (i == 0) {
                                if ((this.Puu3Rhg4F[pointerId] & 0) != 0) {
                                    Objects.requireNonNull(this.ilHKhw3Yw);
                                }
                            } else if (i == 2 && (vPSbyrYWX = vPSbyrYWX((int) x, (int) y)) == this.qVUwofr5s) {
                                ixWaw2akD(vPSbyrYWX, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            GPLPRo6go(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (!(this.dIocxURUo == null || this.kCA6Zs9sL == null)) {
                    int pointerCount = motionEvent.getPointerCount();
                    int i2 = 0;
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (kmSgne1rO(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.dIocxURUo[pointerId2];
                            float f2 = y2 - this.kCA6Zs9sL[pointerId2];
                            View vPSbyrYWX2 = vPSbyrYWX((int) x2, (int) y2);
                            if (vPSbyrYWX2 != null && dIocxURUo(vPSbyrYWX2, f, f2)) {
                                z2 = true;
                            }
                            if (z2) {
                                int left = vPSbyrYWX2.getLeft();
                                int i3 = (int) f;
                                int q3BipwRCk = this.ilHKhw3Yw.q3BipwRCk(vPSbyrYWX2, left + i3, i3);
                                int top = vPSbyrYWX2.getTop();
                                int i4 = (int) f2;
                                int J4Ux7ym32 = this.ilHKhw3Yw.J4Ux7ym32(vPSbyrYWX2, top + i4, i4);
                                int tGV7Q6urW = this.ilHKhw3Yw.tGV7Q6urW(vPSbyrYWX2);
                                int dIocxURUo = this.ilHKhw3Yw.dIocxURUo(vPSbyrYWX2);
                                if (tGV7Q6urW != 0) {
                                    if (tGV7Q6urW > 0) {
                                    }
                                }
                                if (dIocxURUo != 0) {
                                    if (dIocxURUo > 0 && J4Ux7ym32 == top) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            MzoOEjc4X(f, f2, pointerId2);
                            if (this.q3BipwRCk != 1) {
                                if (z2 && ixWaw2akD(vPSbyrYWX2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                        z2 = false;
                    }
                    qVUwofr5s(motionEvent);
                }
                z = false;
            }
            q3BipwRCk();
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            ilHKhw3Yw(x3, y3, pointerId3);
            View vPSbyrYWX3 = vPSbyrYWX((int) x3, (int) y3);
            if (vPSbyrYWX3 == this.qVUwofr5s && this.q3BipwRCk == 2) {
                ixWaw2akD(vPSbyrYWX3, pointerId3);
            }
            z = false;
            if ((this.Puu3Rhg4F[pointerId3] & 0) != 0) {
                Objects.requireNonNull(this.ilHKhw3Yw);
            }
        }
        if (this.q3BipwRCk == 1) {
            return true;
        }
        return z;
    }

    public final boolean dIocxURUo(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.ilHKhw3Yw.tGV7Q6urW(view) > 0;
        boolean z2 = this.ilHKhw3Yw.dIocxURUo(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.J4Ux7ym32) : z2 && Math.abs(f2) > ((float) this.J4Ux7ym32);
        }
        float f3 = f2 * f2;
        int i = this.J4Ux7ym32;
        return f3 + (f * f) > ((float) (i * i));
    }

    public boolean dXrmkklc8(int i, int i2) {
        if (this.Eeka1udhb) {
            return CBQ5d1kRq(i, i2, (int) this.CBQ5d1kRq.getXVelocity(this.tGV7Q6urW), (int) this.CBQ5d1kRq.getYVelocity(this.tGV7Q6urW));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final int iiGwOFFnr(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void ilHKhw3Yw(float f, float f2, int i) {
        float[] fArr = this.dIocxURUo;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.kCA6Zs9sL;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.iiGwOFFnr;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.GPLPRo6go;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.Puu3Rhg4F;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.yWvV4ePLl;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.oon79WMrY;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.dIocxURUo = fArr2;
            this.kCA6Zs9sL = fArr3;
            this.iiGwOFFnr = fArr4;
            this.GPLPRo6go = fArr5;
            this.Puu3Rhg4F = iArr;
            this.yWvV4ePLl = iArr2;
            this.oon79WMrY = iArr3;
        }
        float[] fArr9 = this.dIocxURUo;
        this.iiGwOFFnr[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.kCA6Zs9sL;
        this.GPLPRo6go[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.Puu3Rhg4F;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.dXrmkklc8.getLeft() + this.PSTqBLTET) {
            i2 = 1;
        }
        if (i5 < this.dXrmkklc8.getTop() + this.PSTqBLTET) {
            i2 |= 4;
        }
        if (i4 > this.dXrmkklc8.getRight() - this.PSTqBLTET) {
            i2 |= 2;
        }
        if (i5 > this.dXrmkklc8.getBottom() - this.PSTqBLTET) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.vPSbyrYWX |= 1 << i;
    }

    public boolean ixWaw2akD(View view, int i) {
        if (view == this.qVUwofr5s && this.tGV7Q6urW == i) {
            return true;
        }
        if (view == null || !this.ilHKhw3Yw.yWvV4ePLl(view, i)) {
            return false;
        }
        this.tGV7Q6urW = i;
        J4Ux7ym32(view, i);
        return true;
    }

    public final float kCA6Zs9sL(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public final boolean kmSgne1rO(int i) {
        if ((this.vPSbyrYWX & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void oon79WMrY(float f, float f2) {
        this.Eeka1udhb = true;
        this.ilHKhw3Yw.Puu3Rhg4F(this.qVUwofr5s, f, f2);
        this.Eeka1udhb = false;
        if (this.q3BipwRCk == 1) {
            Eeka1udhb(0);
        }
    }

    public void q3BipwRCk() {
        this.tGV7Q6urW = -1;
        float[] fArr = this.dIocxURUo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.kCA6Zs9sL, 0.0f);
            Arrays.fill(this.iiGwOFFnr, 0.0f);
            Arrays.fill(this.GPLPRo6go, 0.0f);
            Arrays.fill(this.Puu3Rhg4F, 0);
            Arrays.fill(this.yWvV4ePLl, 0);
            Arrays.fill(this.oon79WMrY, 0);
            this.vPSbyrYWX = 0;
        }
        VelocityTracker velocityTracker = this.CBQ5d1kRq;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.CBQ5d1kRq = null;
        }
    }

    public final void qVUwofr5s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (kmSgne1rO(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.iiGwOFFnr[pointerId] = x;
                this.GPLPRo6go[pointerId] = y;
            }
        }
    }

    public final boolean tGV7Q6urW(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.Puu3Rhg4F[i] & i2) != i2 || (0 & i2) == 0 || (this.oon79WMrY[i] & i2) == i2 || (this.yWvV4ePLl[i] & i2) == i2) {
            return false;
        }
        int i3 = this.J4Ux7ym32;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.ilHKhw3Yw);
        }
        return (this.yWvV4ePLl[i] & i2) == 0 && abs > ((float) this.J4Ux7ym32);
    }

    public View vPSbyrYWX(int i, int i2) {
        for (int childCount = this.dXrmkklc8.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.dXrmkklc8;
            Objects.requireNonNull(this.ilHKhw3Yw);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean yWvV4ePLl(boolean z) {
        if (this.q3BipwRCk == 2) {
            boolean computeScrollOffset = this.MzoOEjc4X.computeScrollOffset();
            int currX = this.MzoOEjc4X.getCurrX();
            int currY = this.MzoOEjc4X.getCurrY();
            int left = currX - this.qVUwofr5s.getLeft();
            int top = currY - this.qVUwofr5s.getTop();
            if (left != 0) {
                View view = this.qVUwofr5s;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.qVUwofr5s;
                WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.ilHKhw3Yw.GPLPRo6go(this.qVUwofr5s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.MzoOEjc4X.getFinalX() && currY == this.MzoOEjc4X.getFinalY()) {
                this.MzoOEjc4X.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.dXrmkklc8.post(this.RG6kpfv3v);
                } else {
                    Eeka1udhb(0);
                }
            }
        }
        if (this.q3BipwRCk == 2) {
            return true;
        }
        return false;
    }
}
