package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.feravolt.preload.R;
import con.Lz1xD66IT;
import con.Q3GvMwgzv;
import con.ZolH67hOx;
import con.dF3gF5M3i;
/* loaded from: classes.dex */
public class AlertController {
    public View AqaWJg0b4;
    public int CBQ5d1kRq;
    public ImageView CpG0imbht;
    public boolean EBQXiIPmm;
    public Button Eeka1udhb;
    public ListView GPLPRo6go;
    public Drawable IytU16YUK;
    public final dF3gF5M3i J4Ux7ym32;
    public CharSequence MzoOEjc4X;
    public Button PSTqBLTET;
    public View Puu3Rhg4F;
    public int QNqj6nIzv;
    public Message RG6kpfv3v;
    public Handler TyB1UUd72;
    public int V9LQMKGJe;
    public CharSequence WaUP0CF08;
    public final int dIocxURUo;
    public CharSequence dXrmkklc8;
    public Drawable dfpT1j18n;
    public int i0Zug1mVk;
    public Message i8XZMQc6Z;
    public NestedScrollView iMyQMM6Qj;
    public int igRQEZxnW;
    public CharSequence iiGwOFFnr;
    public Message ilHKhw3Yw;
    public Drawable ixWaw2akD;
    public CharSequence kCA6Zs9sL;
    public int kmSgne1rO;
    public ListAdapter mUqPm6GBh;
    public TextView nlGCs0NZs;
    public int o4LF8RkoQ;
    public int oon79WMrY;
    public final Context q3BipwRCk;
    public TextView qFBXIgpia;
    public Drawable qVUwofr5s;
    public Button sk5s77z6Q;
    public final Window tGV7Q6urW;
    public int vNtjxmzUM;
    public int vPSbyrYWX;
    public int yWvV4ePLl;
    public boolean Bhmn1KIah = false;
    public int cAwN510t2 = 0;
    public int NyWTwPF6V = -1;
    public final View.OnClickListener juJ6pnCpu = new Q3GvMwgzv(this);

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {
        public final int CBQ5d1kRq;
        public final int kmSgne1rO;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.Eeka1udhb);
            this.kmSgne1rO = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.CBQ5d1kRq = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, dF3gF5M3i df3gf5m3i, Window window) {
        this.q3BipwRCk = context;
        this.J4Ux7ym32 = df3gf5m3i;
        this.tGV7Q6urW = window;
        this.TyB1UUd72 = new Lz1xD66IT(df3gf5m3i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ZolH67hOx.kCA6Zs9sL, R.attr.alertDialogStyle, 0);
        this.vNtjxmzUM = obtainStyledAttributes.getResourceId(0, 0);
        this.i0Zug1mVk = obtainStyledAttributes.getResourceId(2, 0);
        this.o4LF8RkoQ = obtainStyledAttributes.getResourceId(4, 0);
        this.V9LQMKGJe = obtainStyledAttributes.getResourceId(5, 0);
        this.QNqj6nIzv = obtainStyledAttributes.getResourceId(7, 0);
        this.igRQEZxnW = obtainStyledAttributes.getResourceId(3, 0);
        this.EBQXiIPmm = obtainStyledAttributes.getBoolean(6, true);
        this.dIocxURUo = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        df3gf5m3i.q3BipwRCk().oon79WMrY(1);
    }

    public static boolean q3BipwRCk(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (q3BipwRCk(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void tGV7Q6urW(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public final void J4Ux7ym32(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup dIocxURUo(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void iiGwOFFnr(int i) {
        this.IytU16YUK = null;
        this.cAwN510t2 = i;
        ImageView imageView = this.CpG0imbht;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.CpG0imbht.setImageResource(this.cAwN510t2);
            return;
        }
        imageView.setVisibility(8);
    }

    public void kCA6Zs9sL(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.TyB1UUd72.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.WaUP0CF08 = charSequence;
            this.i8XZMQc6Z = obtainMessage;
            this.dfpT1j18n = null;
        } else if (i == -2) {
            this.dXrmkklc8 = charSequence;
            this.RG6kpfv3v = obtainMessage;
            this.ixWaw2akD = null;
        } else if (i == -1) {
            this.MzoOEjc4X = charSequence;
            this.ilHKhw3Yw = obtainMessage;
            this.qVUwofr5s = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
