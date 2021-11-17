package con;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class isrYs6b4I extends RecyclerView.DrTf1eLw4 implements RecyclerView.LBkrQilnp {
    public static final int[] CpG0imbht = {16842919};
    public static final int[] qFBXIgpia = new int[0];
    public int Bhmn1KIah;
    public int CBQ5d1kRq;
    public RecyclerView Eeka1udhb;
    public final StateListDrawable GPLPRo6go;
    public final RecyclerView.wnbPPCp4x IytU16YUK;
    public final int J4Ux7ym32;
    public float MzoOEjc4X;
    public int PSTqBLTET;
    public final Drawable Puu3Rhg4F;
    public final Drawable dIocxURUo;
    public final ValueAnimator dfpT1j18n;
    public final int iiGwOFFnr;
    public final int kCA6Zs9sL;
    public float kmSgne1rO;
    public final int oon79WMrY;
    public final int q3BipwRCk;
    public final StateListDrawable tGV7Q6urW;
    public int vPSbyrYWX;
    public final int yWvV4ePLl;
    public int ilHKhw3Yw = 0;
    public int qVUwofr5s = 0;
    public boolean dXrmkklc8 = false;
    public boolean RG6kpfv3v = false;
    public int ixWaw2akD = 0;
    public int sk5s77z6Q = 0;
    public final int[] WaUP0CF08 = new int[2];
    public final int[] i8XZMQc6Z = new int[2];
    public int iMyQMM6Qj = 0;
    public final Runnable cAwN510t2 = new go0qReAcx(this);

    public isrYs6b4I(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.dfpT1j18n = ofFloat;
        mF6VDE5xQ mf6vde5xq = new mF6VDE5xQ(this);
        this.IytU16YUK = mf6vde5xq;
        this.tGV7Q6urW = stateListDrawable;
        this.dIocxURUo = drawable;
        this.GPLPRo6go = stateListDrawable2;
        this.Puu3Rhg4F = drawable2;
        this.kCA6Zs9sL = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.iiGwOFFnr = Math.max(i, drawable.getIntrinsicWidth());
        this.yWvV4ePLl = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.oon79WMrY = Math.max(i, drawable2.getIntrinsicWidth());
        this.q3BipwRCk = i2;
        this.J4Ux7ym32 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new zPXS7LbtI(this));
        ofFloat.addUpdateListener(new HOe5eFlJ6(this));
        RecyclerView recyclerView2 = this.Eeka1udhb;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.LULQkQlc9 lULQkQlc9 = recyclerView2.WaUP0CF08;
                if (lULQkQlc9 != null) {
                    lULQkQlc9.dIocxURUo("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.iMyQMM6Qj.remove(this);
                if (recyclerView2.iMyQMM6Qj.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z);
                }
                recyclerView2.j22ftfeNI();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.Eeka1udhb;
                recyclerView3.cAwN510t2.remove(this);
                if (recyclerView3.IytU16YUK == this) {
                    recyclerView3.IytU16YUK = null;
                }
                List list = this.Eeka1udhb.oesmsHQJU;
                if (list != null) {
                    list.remove(mf6vde5xq);
                }
                iiGwOFFnr();
            }
            this.Eeka1udhb = recyclerView;
            recyclerView.GPLPRo6go(this);
            this.Eeka1udhb.cAwN510t2.add(this);
            this.Eeka1udhb.Puu3Rhg4F(mf6vde5xq);
        }
    }

    public boolean GPLPRo6go(float f, float f2) {
        if (f2 >= ((float) (this.qVUwofr5s - this.yWvV4ePLl))) {
            int i = this.PSTqBLTET;
            int i2 = this.Bhmn1KIah;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LBkrQilnp
    public void J4Ux7ym32(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.ixWaw2akD != 0) {
            if (motionEvent.getAction() == 0) {
                boolean Puu3Rhg4F = Puu3Rhg4F(motionEvent.getX(), motionEvent.getY());
                boolean GPLPRo6go = GPLPRo6go(motionEvent.getX(), motionEvent.getY());
                if (Puu3Rhg4F || GPLPRo6go) {
                    if (GPLPRo6go) {
                        this.sk5s77z6Q = 1;
                        this.MzoOEjc4X = (float) ((int) motionEvent.getX());
                    } else if (Puu3Rhg4F) {
                        this.sk5s77z6Q = 2;
                        this.kmSgne1rO = (float) ((int) motionEvent.getY());
                    }
                    oon79WMrY(2);
                }
            } else if (motionEvent.getAction() == 1 && this.ixWaw2akD == 2) {
                this.kmSgne1rO = 0.0f;
                this.MzoOEjc4X = 0.0f;
                oon79WMrY(1);
                this.sk5s77z6Q = 0;
            } else if (motionEvent.getAction() == 2 && this.ixWaw2akD == 2) {
                vPSbyrYWX();
                if (this.sk5s77z6Q == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.i8XZMQc6Z;
                    int i = this.J4Ux7ym32;
                    iArr[0] = i;
                    iArr[1] = this.ilHKhw3Yw - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.PSTqBLTET) - max) >= 2.0f) {
                        int yWvV4ePLl = yWvV4ePLl(this.MzoOEjc4X, max, iArr, this.Eeka1udhb.computeHorizontalScrollRange(), this.Eeka1udhb.computeHorizontalScrollOffset(), this.ilHKhw3Yw);
                        if (yWvV4ePLl != 0) {
                            this.Eeka1udhb.scrollBy(yWvV4ePLl, 0);
                        }
                        this.MzoOEjc4X = max;
                    }
                }
                if (this.sk5s77z6Q == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.WaUP0CF08;
                    int i2 = this.J4Ux7ym32;
                    iArr2[0] = i2;
                    iArr2[1] = this.qVUwofr5s - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.CBQ5d1kRq) - max2) >= 2.0f) {
                        int yWvV4ePLl2 = yWvV4ePLl(this.kmSgne1rO, max2, iArr2, this.Eeka1udhb.computeVerticalScrollRange(), this.Eeka1udhb.computeVerticalScrollOffset(), this.qVUwofr5s);
                        if (yWvV4ePLl2 != 0) {
                            this.Eeka1udhb.scrollBy(0, yWvV4ePLl2);
                        }
                        this.kmSgne1rO = max2;
                    }
                }
            }
        }
    }

    public boolean Puu3Rhg4F(float f, float f2) {
        RecyclerView recyclerView = this.Eeka1udhb;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (RBJDIwG1D.dIocxURUo(recyclerView) == 1) {
            if (f > ((float) this.kCA6Zs9sL)) {
                return false;
            }
        } else if (f < ((float) (this.ilHKhw3Yw - this.kCA6Zs9sL))) {
            return false;
        }
        int i = this.CBQ5d1kRq;
        int i2 = this.vPSbyrYWX / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    public final void iiGwOFFnr() {
        this.Eeka1udhb.removeCallbacks(this.cAwN510t2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.DrTf1eLw4
    public void kCA6Zs9sL(Canvas canvas, RecyclerView recyclerView, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (this.ilHKhw3Yw != this.Eeka1udhb.getWidth() || this.qVUwofr5s != this.Eeka1udhb.getHeight()) {
            this.ilHKhw3Yw = this.Eeka1udhb.getWidth();
            this.qVUwofr5s = this.Eeka1udhb.getHeight();
            oon79WMrY(0);
        } else if (this.iMyQMM6Qj != 0) {
            if (this.dXrmkklc8) {
                int i = this.ilHKhw3Yw;
                int i2 = this.kCA6Zs9sL;
                int i3 = i - i2;
                int i4 = this.CBQ5d1kRq;
                int i5 = this.vPSbyrYWX;
                int i6 = i4 - (i5 / 2);
                this.tGV7Q6urW.setBounds(0, 0, i2, i5);
                this.dIocxURUo.setBounds(0, 0, this.iiGwOFFnr, this.qVUwofr5s);
                RecyclerView recyclerView2 = this.Eeka1udhb;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                boolean z = true;
                if (RBJDIwG1D.dIocxURUo(recyclerView2) != 1) {
                    z = false;
                }
                if (z) {
                    this.dIocxURUo.draw(canvas);
                    canvas.translate((float) this.kCA6Zs9sL, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.tGV7Q6urW.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i3 = this.kCA6Zs9sL;
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.dIocxURUo.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.tGV7Q6urW.draw(canvas);
                }
                canvas.translate((float) (-i3), (float) (-i6));
            }
            if (this.RG6kpfv3v) {
                int i7 = this.qVUwofr5s;
                int i8 = this.yWvV4ePLl;
                int i9 = i7 - i8;
                int i10 = this.PSTqBLTET;
                int i11 = this.Bhmn1KIah;
                int i12 = i10 - (i11 / 2);
                this.GPLPRo6go.setBounds(0, 0, i11, i8);
                this.Puu3Rhg4F.setBounds(0, 0, this.ilHKhw3Yw, this.oon79WMrY);
                canvas.translate(0.0f, (float) i9);
                this.Puu3Rhg4F.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.GPLPRo6go.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    public void oon79WMrY(int i) {
        int i2;
        if (i == 2 && this.ixWaw2akD != 2) {
            this.tGV7Q6urW.setState(CpG0imbht);
            iiGwOFFnr();
        }
        if (i == 0) {
            this.Eeka1udhb.invalidate();
        } else {
            vPSbyrYWX();
        }
        if (this.ixWaw2akD != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.ixWaw2akD = i;
        }
        this.tGV7Q6urW.setState(qFBXIgpia);
        i2 = 1200;
        iiGwOFFnr();
        this.Eeka1udhb.postDelayed(this.cAwN510t2, (long) i2);
        this.ixWaw2akD = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LBkrQilnp
    public boolean q3BipwRCk(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.ixWaw2akD;
        if (i == 1) {
            boolean Puu3Rhg4F = Puu3Rhg4F(motionEvent.getX(), motionEvent.getY());
            boolean GPLPRo6go = GPLPRo6go(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (Puu3Rhg4F || GPLPRo6go)) {
                if (GPLPRo6go) {
                    this.sk5s77z6Q = 1;
                    this.MzoOEjc4X = (float) ((int) motionEvent.getX());
                } else if (Puu3Rhg4F) {
                    this.sk5s77z6Q = 2;
                    this.kmSgne1rO = (float) ((int) motionEvent.getY());
                }
                oon79WMrY(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LBkrQilnp
    public void tGV7Q6urW(boolean z) {
    }

    public void vPSbyrYWX() {
        int i = this.iMyQMM6Qj;
        if (i != 0) {
            if (i == 3) {
                this.dfpT1j18n.cancel();
            } else {
                return;
            }
        }
        this.iMyQMM6Qj = 1;
        ValueAnimator valueAnimator = this.dfpT1j18n;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.dfpT1j18n.setDuration(500L);
        this.dfpT1j18n.setStartDelay(0);
        this.dfpT1j18n.start();
    }

    public final int yWvV4ePLl(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }
}
