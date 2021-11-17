package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class uBkGbmfhd implements JU5oYK2sJ {
    public static Method i0Zug1mVk;
    public static Method o4LF8RkoQ;
    public wRt60CcGM Bhmn1KIah;
    public Context CBQ5d1kRq;
    public boolean NyWTwPF6V;
    public boolean RG6kpfv3v;
    public boolean dXrmkklc8;
    public View dfpT1j18n;
    public DataSetObserver i8XZMQc6Z;
    public AdapterView.OnItemClickListener iMyQMM6Qj;
    public int ilHKhw3Yw;
    public boolean ixWaw2akD;
    public ListAdapter kmSgne1rO;
    public Rect mUqPm6GBh;
    public final Handler nlGCs0NZs;
    public int qVUwofr5s;
    public PopupWindow vNtjxmzUM;
    public int PSTqBLTET = -2;
    public int MzoOEjc4X = -2;
    public int Eeka1udhb = 1002;
    public int sk5s77z6Q = 0;
    public int WaUP0CF08 = Integer.MAX_VALUE;
    public final MQZmW1939 cAwN510t2 = new MQZmW1939(this, 2);
    public final UFd6upF8u IytU16YUK = new UFd6upF8u(this);
    public final vLXhVaRma CpG0imbht = new vLXhVaRma(this);
    public final MQZmW1939 qFBXIgpia = new MQZmW1939(this, 1);
    public final Rect AqaWJg0b4 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                i0Zug1mVk = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                o4LF8RkoQ = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public uBkGbmfhd(Context context, AttributeSet attributeSet, int i, int i2) {
        this.CBQ5d1kRq = context;
        this.nlGCs0NZs = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.Bhmn1KIah, i, i2);
        this.ilHKhw3Yw = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.qVUwofr5s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.dXrmkklc8 = true;
        }
        obtainStyledAttributes.recycle();
        h4GeaxU12 h4geaxu12 = new h4GeaxU12(context, attributeSet, i, i2);
        this.vNtjxmzUM = h4geaxu12;
        h4geaxu12.setInputMethodMode(1);
    }

    public void Bhmn1KIah(Drawable drawable) {
        this.vNtjxmzUM.setBackgroundDrawable(drawable);
    }

    @Override // con.JU5oYK2sJ
    public ListView CBQ5d1kRq() {
        return this.Bhmn1KIah;
    }

    public void Eeka1udhb(boolean z) {
        this.NyWTwPF6V = z;
        this.vNtjxmzUM.setFocusable(z);
    }

    @Override // con.JU5oYK2sJ
    public void GPLPRo6go() {
        int i;
        int i2;
        wRt60CcGM wrt60ccgm;
        int i3;
        if (this.Bhmn1KIah == null) {
            wRt60CcGM q3BipwRCk = q3BipwRCk(this.CBQ5d1kRq, !this.NyWTwPF6V);
            this.Bhmn1KIah = q3BipwRCk;
            q3BipwRCk.setAdapter(this.kmSgne1rO);
            this.Bhmn1KIah.setOnItemClickListener(this.iMyQMM6Qj);
            this.Bhmn1KIah.setFocusable(true);
            this.Bhmn1KIah.setFocusableInTouchMode(true);
            this.Bhmn1KIah.setOnItemSelectedListener(new Fw7Av8qoW(this));
            this.Bhmn1KIah.setOnScrollListener(this.CpG0imbht);
            this.vNtjxmzUM.setContentView(this.Bhmn1KIah);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.vNtjxmzUM.getContentView();
        }
        Drawable background = this.vNtjxmzUM.getBackground();
        int i4 = 0;
        if (background != null) {
            background.getPadding(this.AqaWJg0b4);
            Rect rect = this.AqaWJg0b4;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.dXrmkklc8) {
                this.qVUwofr5s = -i5;
            }
        } else {
            this.AqaWJg0b4.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.vNtjxmzUM.getMaxAvailableHeight(this.dfpT1j18n, this.qVUwofr5s, this.vNtjxmzUM.getInputMethodMode() == 2);
        if (this.PSTqBLTET == -1) {
            i2 = maxAvailableHeight + i;
        } else {
            int i6 = this.MzoOEjc4X;
            if (i6 != -2) {
                i3 = 1073741824;
                if (i6 == -1) {
                    int i7 = this.CBQ5d1kRq.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.AqaWJg0b4;
                    i6 = i7 - (rect2.left + rect2.right);
                }
            } else {
                int i8 = this.CBQ5d1kRq.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.AqaWJg0b4;
                i6 = i8 - (rect3.left + rect3.right);
                i3 = Integer.MIN_VALUE;
            }
            int q3BipwRCk2 = this.Bhmn1KIah.q3BipwRCk(View.MeasureSpec.makeMeasureSpec(i6, i3), maxAvailableHeight - 0, -1);
            i2 = q3BipwRCk2 + (q3BipwRCk2 > 0 ? this.Bhmn1KIah.getPaddingBottom() + this.Bhmn1KIah.getPaddingTop() + i + 0 : 0);
        }
        boolean z = this.vNtjxmzUM.getInputMethodMode() == 2;
        PpOXeTHUw.dIocxURUo(this.vNtjxmzUM, this.Eeka1udhb);
        if (this.vNtjxmzUM.isShowing()) {
            View view = this.dfpT1j18n;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (mN6fklC4R.J4Ux7ym32(view)) {
                int i9 = this.MzoOEjc4X;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.dfpT1j18n.getWidth();
                }
                int i10 = this.PSTqBLTET;
                if (i10 == -1) {
                    if (!z) {
                        i2 = -1;
                    }
                    if (z) {
                        this.vNtjxmzUM.setWidth(this.MzoOEjc4X == -1 ? -1 : 0);
                        this.vNtjxmzUM.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.vNtjxmzUM;
                        if (this.MzoOEjc4X == -1) {
                            i4 = -1;
                        }
                        popupWindow.setWidth(i4);
                        this.vNtjxmzUM.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    i2 = i10;
                }
                this.vNtjxmzUM.setOutsideTouchable(true);
                this.vNtjxmzUM.update(this.dfpT1j18n, this.ilHKhw3Yw, this.qVUwofr5s, i9 < 0 ? -1 : i9, i2 < 0 ? -1 : i2);
                return;
            }
            return;
        }
        int i11 = this.MzoOEjc4X;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.dfpT1j18n.getWidth();
        }
        int i12 = this.PSTqBLTET;
        if (i12 == -1) {
            i2 = -1;
        } else if (i12 != -2) {
            i2 = i12;
        }
        this.vNtjxmzUM.setWidth(i11);
        this.vNtjxmzUM.setHeight(i2);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = i0Zug1mVk;
            if (method != null) {
                try {
                    method.invoke(this.vNtjxmzUM, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.vNtjxmzUM.setIsClippedToScreen(true);
        }
        this.vNtjxmzUM.setOutsideTouchable(true);
        this.vNtjxmzUM.setTouchInterceptor(this.IytU16YUK);
        if (this.ixWaw2akD) {
            PpOXeTHUw.tGV7Q6urW(this.vNtjxmzUM, this.RG6kpfv3v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = o4LF8RkoQ;
            if (method2 != null) {
                try {
                    method2.invoke(this.vNtjxmzUM, this.mUqPm6GBh);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.vNtjxmzUM.setEpicenterBounds(this.mUqPm6GBh);
        }
        bY6a2kg9g.q3BipwRCk(this.vNtjxmzUM, this.dfpT1j18n, this.ilHKhw3Yw, this.qVUwofr5s, this.sk5s77z6Q);
        this.Bhmn1KIah.setSelection(-1);
        if ((!this.NyWTwPF6V || this.Bhmn1KIah.isInTouchMode()) && (wrt60ccgm = this.Bhmn1KIah) != null) {
            wrt60ccgm.setListSelectionHidden(true);
            wrt60ccgm.requestLayout();
        }
        if (!this.NyWTwPF6V) {
            this.nlGCs0NZs.post(this.qFBXIgpia);
        }
    }

    @Override // con.JU5oYK2sJ
    public boolean J4Ux7ym32() {
        return this.vNtjxmzUM.isShowing();
    }

    @Override // con.i8dsFkRky
    public void MzoOEjc4X(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.i8XZMQc6Z;
        if (dataSetObserver == null) {
            this.i8XZMQc6Z = new j2ocyIB2J(this);
        } else {
            ListAdapter listAdapter2 = this.kmSgne1rO;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.kmSgne1rO = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.i8XZMQc6Z);
        }
        wRt60CcGM wrt60ccgm = this.Bhmn1KIah;
        if (wrt60ccgm != null) {
            wrt60ccgm.setAdapter(this.kmSgne1rO);
        }
    }

    public void PSTqBLTET(int i) {
        this.qVUwofr5s = i;
        this.dXrmkklc8 = true;
    }

    public int Puu3Rhg4F() {
        if (!this.dXrmkklc8) {
            return 0;
        }
        return this.qVUwofr5s;
    }

    public int dIocxURUo() {
        return this.ilHKhw3Yw;
    }

    @Override // con.JU5oYK2sJ
    public void dismiss() {
        this.vNtjxmzUM.dismiss();
        this.vNtjxmzUM.setContentView(null);
        this.Bhmn1KIah = null;
        this.nlGCs0NZs.removeCallbacks(this.cAwN510t2);
    }

    public Drawable oon79WMrY() {
        return this.vNtjxmzUM.getBackground();
    }

    public wRt60CcGM q3BipwRCk(Context context, boolean z) {
        return new wRt60CcGM(context, z);
    }

    public void qVUwofr5s(int i) {
        Drawable background = this.vNtjxmzUM.getBackground();
        if (background != null) {
            background.getPadding(this.AqaWJg0b4);
            Rect rect = this.AqaWJg0b4;
            this.MzoOEjc4X = rect.left + rect.right + i;
            return;
        }
        this.MzoOEjc4X = i;
    }

    public void tGV7Q6urW(int i) {
        this.ilHKhw3Yw = i;
    }
}
