package con;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class I6sO15l0X {
    public int J4Ux7ym32;
    public Object q3BipwRCk;

    public I6sO15l0X() {
        this.q3BipwRCk = new int[10];
    }

    public I6sO15l0X GPLPRo6go(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        Object obj = this.q3BipwRCk;
        ((V8gQUs5xA) obj).Bhmn1KIah = listAdapter;
        ((V8gQUs5xA) obj).PSTqBLTET = onClickListener;
        ((V8gQUs5xA) obj).ilHKhw3Yw = i;
        ((V8gQUs5xA) obj).MzoOEjc4X = true;
        return this;
    }

    public float J4Ux7ym32(int i) {
        return ((Float[]) this.q3BipwRCk)[i].floatValue();
    }

    public I6sO15l0X Puu3Rhg4F(CharSequence charSequence) {
        ((V8gQUs5xA) this.q3BipwRCk).kCA6Zs9sL = charSequence;
        return this;
    }

    public int dIocxURUo(int i) {
        int i2 = this.J4Ux7ym32;
        return i2 > 0 ? ((int[]) this.q3BipwRCk)[i2 - 1] : i;
    }

    public void iiGwOFFnr(int i) {
        int i2 = this.J4Ux7ym32;
        Object obj = this.q3BipwRCk;
        if (i2 >= ((int[]) obj).length) {
            this.q3BipwRCk = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
        }
        int i3 = this.J4Ux7ym32;
        this.J4Ux7ym32 = i3 + 1;
        ((int[]) this.q3BipwRCk)[i3] = i;
    }

    public int kCA6Zs9sL() {
        int i = this.J4Ux7ym32 - 1;
        this.J4Ux7ym32 = i;
        return ((int[]) this.q3BipwRCk)[i];
    }

    public float oon79WMrY(I6sO15l0X i6sO15l0X) {
        int i = this.J4Ux7ym32;
        float f = 0.0f;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                f += i6sO15l0X.J4Ux7ym32(i2) * J4Ux7ym32(i2);
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return f;
    }

    public dF3gF5M3i q3BipwRCk() {
        dF3gF5M3i df3gf5m3i = new dF3gF5M3i(((V8gQUs5xA) this.q3BipwRCk).q3BipwRCk, this.J4Ux7ym32);
        V8gQUs5xA v8gQUs5xA = (V8gQUs5xA) this.q3BipwRCk;
        AlertController alertController = df3gf5m3i.Bhmn1KIah;
        View view = v8gQUs5xA.iiGwOFFnr;
        if (view != null) {
            alertController.AqaWJg0b4 = view;
        } else {
            CharSequence charSequence = v8gQUs5xA.kCA6Zs9sL;
            if (charSequence != null) {
                alertController.kCA6Zs9sL = charSequence;
                TextView textView = alertController.qFBXIgpia;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = v8gQUs5xA.dIocxURUo;
            if (drawable != null) {
                alertController.IytU16YUK = drawable;
                alertController.cAwN510t2 = 0;
                ImageView imageView = alertController.CpG0imbht;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.CpG0imbht.setImageDrawable(drawable);
                }
            }
            int i = v8gQUs5xA.tGV7Q6urW;
            if (i != 0) {
                alertController.iiGwOFFnr(i);
            }
        }
        CharSequence charSequence2 = v8gQUs5xA.GPLPRo6go;
        if (charSequence2 != null) {
            alertController.iiGwOFFnr = charSequence2;
            TextView textView2 = alertController.nlGCs0NZs;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = v8gQUs5xA.Puu3Rhg4F;
        if (charSequence3 != null) {
            alertController.kCA6Zs9sL(-1, charSequence3, v8gQUs5xA.yWvV4ePLl, null, null);
        }
        CharSequence charSequence4 = v8gQUs5xA.oon79WMrY;
        if (charSequence4 != null) {
            alertController.kCA6Zs9sL(-2, charSequence4, v8gQUs5xA.vPSbyrYWX, null, null);
        }
        if (v8gQUs5xA.Bhmn1KIah != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) v8gQUs5xA.J4Ux7ym32.inflate(alertController.o4LF8RkoQ, (ViewGroup) null);
            int i2 = v8gQUs5xA.MzoOEjc4X ? alertController.QNqj6nIzv : alertController.igRQEZxnW;
            ListAdapter listAdapter = v8gQUs5xA.Bhmn1KIah;
            if (listAdapter == null) {
                listAdapter = new guXA4nqtH(v8gQUs5xA.q3BipwRCk, i2, 16908308, null);
            }
            alertController.mUqPm6GBh = listAdapter;
            alertController.NyWTwPF6V = v8gQUs5xA.ilHKhw3Yw;
            if (v8gQUs5xA.PSTqBLTET != null) {
                recycleListView.setOnItemClickListener(new tM3F0H8KO(v8gQUs5xA, alertController));
            }
            if (v8gQUs5xA.MzoOEjc4X) {
                recycleListView.setChoiceMode(1);
            }
            alertController.GPLPRo6go = recycleListView;
        }
        df3gf5m3i.setCancelable(((V8gQUs5xA) this.q3BipwRCk).CBQ5d1kRq);
        if (((V8gQUs5xA) this.q3BipwRCk).CBQ5d1kRq) {
            df3gf5m3i.setCanceledOnTouchOutside(true);
        }
        Objects.requireNonNull((V8gQUs5xA) this.q3BipwRCk);
        df3gf5m3i.setOnCancelListener(null);
        Objects.requireNonNull((V8gQUs5xA) this.q3BipwRCk);
        df3gf5m3i.setOnDismissListener(null);
        Object obj = this.q3BipwRCk;
        if (((V8gQUs5xA) obj).kmSgne1rO != null) {
            df3gf5m3i.setOnKeyListener(((V8gQUs5xA) obj).kmSgne1rO);
        }
        return df3gf5m3i;
    }

    public Context tGV7Q6urW() {
        return ((V8gQUs5xA) this.q3BipwRCk).q3BipwRCk;
    }

    public dF3gF5M3i yWvV4ePLl() {
        dF3gF5M3i q3BipwRCk = q3BipwRCk();
        q3BipwRCk.show();
        return q3BipwRCk;
    }

    public I6sO15l0X(int i) {
        this.J4Ux7ym32 = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.q3BipwRCk = fArr;
    }

    public I6sO15l0X(Context context, int i) {
        this.q3BipwRCk = new V8gQUs5xA(new ContextThemeWrapper(context, dF3gF5M3i.tGV7Q6urW(context, i)));
        this.J4Ux7ym32 = i;
    }

    public I6sO15l0X(yUfRSVKGd yufrsvkgd, int i) {
        this.q3BipwRCk = yufrsvkgd;
        this.J4Ux7ym32 = i;
    }
}
