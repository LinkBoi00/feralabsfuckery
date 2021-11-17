package con;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class qya5U7BN8 implements KMt2sB4vK {
    public TeoeEf1aF Bhmn1KIah;
    public Window.Callback CBQ5d1kRq;
    public Drawable GPLPRo6go;
    public int J4Ux7ym32;
    public Drawable MzoOEjc4X;
    public int PSTqBLTET;
    public boolean Puu3Rhg4F;
    public View dIocxURUo;
    public Drawable iiGwOFFnr;
    public Drawable kCA6Zs9sL;
    public boolean kmSgne1rO;
    public CharSequence oon79WMrY;
    public Toolbar q3BipwRCk;
    public View tGV7Q6urW;
    public CharSequence vPSbyrYWX;
    public CharSequence yWvV4ePLl;

    public qya5U7BN8(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.PSTqBLTET = 0;
        this.q3BipwRCk = toolbar;
        this.yWvV4ePLl = toolbar.getTitle();
        this.oon79WMrY = toolbar.getSubtitle();
        this.Puu3Rhg4F = this.yWvV4ePLl != null;
        this.GPLPRo6go = toolbar.getNavigationIcon();
        String str = null;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(toolbar.getContext(), null, ZolH67hOx.q3BipwRCk, R.attr.actionBarStyle, 0);
        int i = 15;
        this.MzoOEjc4X = mUqPm6GBh.dXrmkklc8(15);
        if (z) {
            CharSequence IytU16YUK = mUqPm6GBh.IytU16YUK(27);
            if (!TextUtils.isEmpty(IytU16YUK)) {
                this.Puu3Rhg4F = true;
                this.yWvV4ePLl = IytU16YUK;
                if ((this.J4Ux7ym32 & 8) != 0) {
                    this.q3BipwRCk.setTitle(IytU16YUK);
                }
            }
            CharSequence IytU16YUK2 = mUqPm6GBh.IytU16YUK(25);
            if (!TextUtils.isEmpty(IytU16YUK2)) {
                this.oon79WMrY = IytU16YUK2;
                if ((this.J4Ux7ym32 & 8) != 0) {
                    this.q3BipwRCk.setSubtitle(IytU16YUK2);
                }
            }
            Drawable dXrmkklc8 = mUqPm6GBh.dXrmkklc8(20);
            if (dXrmkklc8 != null) {
                this.iiGwOFFnr = dXrmkklc8;
                iiGwOFFnr();
            }
            Drawable dXrmkklc82 = mUqPm6GBh.dXrmkklc8(17);
            if (dXrmkklc82 != null) {
                this.kCA6Zs9sL = dXrmkklc82;
                iiGwOFFnr();
            }
            if (this.GPLPRo6go == null && (drawable = this.MzoOEjc4X) != null) {
                this.GPLPRo6go = drawable;
                kCA6Zs9sL();
            }
            J4Ux7ym32(mUqPm6GBh.i8XZMQc6Z(10, 0));
            int iMyQMM6Qj = mUqPm6GBh.iMyQMM6Qj(9, 0);
            if (iMyQMM6Qj != 0) {
                View inflate = LayoutInflater.from(this.q3BipwRCk.getContext()).inflate(iMyQMM6Qj, (ViewGroup) this.q3BipwRCk, false);
                View view = this.dIocxURUo;
                if (!(view == null || (this.J4Ux7ym32 & 16) == 0)) {
                    this.q3BipwRCk.removeView(view);
                }
                this.dIocxURUo = inflate;
                if (!(inflate == null || (this.J4Ux7ym32 & 16) == 0)) {
                    this.q3BipwRCk.addView(inflate);
                }
                J4Ux7ym32(this.J4Ux7ym32 | 16);
            }
            int dfpT1j18n = mUqPm6GBh.dfpT1j18n(13, 0);
            if (dfpT1j18n > 0) {
                ViewGroup.LayoutParams layoutParams = this.q3BipwRCk.getLayoutParams();
                layoutParams.height = dfpT1j18n;
                this.q3BipwRCk.setLayoutParams(layoutParams);
            }
            int qVUwofr5s = mUqPm6GBh.qVUwofr5s(7, -1);
            int qVUwofr5s2 = mUqPm6GBh.qVUwofr5s(3, -1);
            if (qVUwofr5s >= 0 || qVUwofr5s2 >= 0) {
                Toolbar toolbar2 = this.q3BipwRCk;
                int max = Math.max(qVUwofr5s, 0);
                int max2 = Math.max(qVUwofr5s2, 0);
                toolbar2.dIocxURUo();
                toolbar2.qFBXIgpia.q3BipwRCk(max, max2);
            }
            int iMyQMM6Qj2 = mUqPm6GBh.iMyQMM6Qj(28, 0);
            if (iMyQMM6Qj2 != 0) {
                Toolbar toolbar3 = this.q3BipwRCk;
                Context context = toolbar3.getContext();
                toolbar3.sk5s77z6Q = iMyQMM6Qj2;
                TextView textView = toolbar3.kmSgne1rO;
                if (textView != null) {
                    textView.setTextAppearance(context, iMyQMM6Qj2);
                }
            }
            int iMyQMM6Qj3 = mUqPm6GBh.iMyQMM6Qj(26, 0);
            if (iMyQMM6Qj3 != 0) {
                Toolbar toolbar4 = this.q3BipwRCk;
                Context context2 = toolbar4.getContext();
                toolbar4.WaUP0CF08 = iMyQMM6Qj3;
                TextView textView2 = toolbar4.Bhmn1KIah;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iMyQMM6Qj3);
                }
            }
            int iMyQMM6Qj4 = mUqPm6GBh.iMyQMM6Qj(22, 0);
            if (iMyQMM6Qj4 != 0) {
                this.q3BipwRCk.setPopupTheme(iMyQMM6Qj4);
            }
        } else {
            if (this.q3BipwRCk.getNavigationIcon() != null) {
                this.MzoOEjc4X = this.q3BipwRCk.getNavigationIcon();
            } else {
                i = 11;
            }
            this.J4Ux7ym32 = i;
        }
        mUqPm6GBh.NyWTwPF6V();
        if (R.string.abc_action_bar_up_description != this.PSTqBLTET) {
            this.PSTqBLTET = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.q3BipwRCk.getNavigationContentDescription())) {
                int i2 = this.PSTqBLTET;
                this.vPSbyrYWX = i2 != 0 ? q3BipwRCk().getString(i2) : str;
                dIocxURUo();
            }
        }
        this.vPSbyrYWX = this.q3BipwRCk.getNavigationContentDescription();
        this.q3BipwRCk.setNavigationOnClickListener(new Y46sAvtbJ(this));
    }

    public void J4Ux7ym32(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.J4Ux7ym32 ^ i;
        this.J4Ux7ym32 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    dIocxURUo();
                }
                kCA6Zs9sL();
            }
            if ((i2 & 3) != 0) {
                iiGwOFFnr();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.q3BipwRCk.setTitle(this.yWvV4ePLl);
                    toolbar = this.q3BipwRCk;
                    charSequence = this.oon79WMrY;
                } else {
                    charSequence = null;
                    this.q3BipwRCk.setTitle((CharSequence) null);
                    toolbar = this.q3BipwRCk;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.dIocxURUo) != null) {
                if ((i & 16) != 0) {
                    this.q3BipwRCk.addView(view);
                } else {
                    this.q3BipwRCk.removeView(view);
                }
            }
        }
    }

    public final void dIocxURUo() {
        if ((this.J4Ux7ym32 & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.vPSbyrYWX)) {
            this.q3BipwRCk.setNavigationContentDescription(this.PSTqBLTET);
        } else {
            this.q3BipwRCk.setNavigationContentDescription(this.vPSbyrYWX);
        }
    }

    public final void iiGwOFFnr() {
        Drawable drawable;
        int i = this.J4Ux7ym32;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.iiGwOFFnr) == null) {
            drawable = this.kCA6Zs9sL;
        }
        this.q3BipwRCk.setLogo(drawable);
    }

    public final void kCA6Zs9sL() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.J4Ux7ym32 & 4) != 0) {
            toolbar = this.q3BipwRCk;
            drawable = this.GPLPRo6go;
            if (drawable == null) {
                drawable = this.MzoOEjc4X;
            }
        } else {
            toolbar = this.q3BipwRCk;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public Context q3BipwRCk() {
        return this.q3BipwRCk.getContext();
    }

    public Roohga8FY tGV7Q6urW(int i, long j) {
        Roohga8FY J4Ux7ym32 = IuQbWntsc.J4Ux7ym32(this.q3BipwRCk);
        J4Ux7ym32.q3BipwRCk(i == 0 ? 1.0f : 0.0f);
        J4Ux7ym32.tGV7Q6urW(j);
        jYxkMmc7F jyxkmmc7f = new jYxkMmc7F(this, i);
        View view = (View) J4Ux7ym32.q3BipwRCk.get();
        if (view != null) {
            J4Ux7ym32.kCA6Zs9sL(view, jyxkmmc7f);
        }
        return J4Ux7ym32;
    }
}
