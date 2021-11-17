package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SfQ6fqrlg {
    public Object GPLPRo6go;
    public final Object J4Ux7ym32;
    public int dIocxURUo;
    public Object iiGwOFFnr;
    public Object kCA6Zs9sL;
    public final /* synthetic */ int q3BipwRCk;
    public final Object tGV7Q6urW;

    public SfQ6fqrlg(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, xT3tobMV0 xt3tobmv0, Rect rect) {
        this.q3BipwRCk = 2;
        D3DEikrvb.iiGwOFFnr(rect.left);
        D3DEikrvb.iiGwOFFnr(rect.top);
        D3DEikrvb.iiGwOFFnr(rect.right);
        D3DEikrvb.iiGwOFFnr(rect.bottom);
        this.J4Ux7ym32 = rect;
        this.tGV7Q6urW = colorStateList2;
        this.kCA6Zs9sL = colorStateList;
        this.iiGwOFFnr = colorStateList3;
        this.dIocxURUo = i;
        this.GPLPRo6go = xt3tobmv0;
    }

    public static SfQ6fqrlg J4Ux7ym32(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, RisoK3egD.PSTqBLTET);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList Bhmn1KIah = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 4);
            ColorStateList Bhmn1KIah2 = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 9);
            ColorStateList Bhmn1KIah3 = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            xT3tobMV0 q3BipwRCk = xT3tobMV0.q3BipwRCk(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new dNif5KqqH((float) 0)).q3BipwRCk();
            obtainStyledAttributes.recycle();
            return new SfQ6fqrlg(Bhmn1KIah, Bhmn1KIah2, Bhmn1KIah3, dimensionPixelSize, q3BipwRCk, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public void CBQ5d1kRq(TextView textView) {
        dOSsQaJVg dossqajvg = new dOSsQaJVg();
        dOSsQaJVg dossqajvg2 = new dOSsQaJVg();
        dossqajvg.setShapeAppearanceModel((xT3tobMV0) this.GPLPRo6go);
        dossqajvg2.setShapeAppearanceModel((xT3tobMV0) this.GPLPRo6go);
        dossqajvg.MzoOEjc4X((ColorStateList) this.kCA6Zs9sL);
        dossqajvg.Eeka1udhb((float) this.dIocxURUo, (ColorStateList) this.iiGwOFFnr);
        textView.setTextColor((ColorStateList) this.tGV7Q6urW);
        RippleDrawable rippleDrawable = new RippleDrawable(((ColorStateList) this.tGV7Q6urW).withAlpha(30), dossqajvg, dossqajvg2);
        Object obj = this.J4Ux7ym32;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, ((Rect) obj).left, ((Rect) obj).top, ((Rect) obj).right, ((Rect) obj).bottom);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(textView, insetDrawable);
    }

    public void GPLPRo6go() {
        this.dIocxURUo = -1;
        yWvV4ePLl(null);
        q3BipwRCk();
    }

    public void Puu3Rhg4F(int i) {
        this.dIocxURUo = i;
        Object obj = this.tGV7Q6urW;
        yWvV4ePLl(((srLS6zLvm) obj) != null ? ((srLS6zLvm) obj).dIocxURUo(((View) this.J4Ux7ym32).getContext(), i) : null);
        q3BipwRCk();
    }

    public ColorStateList dIocxURUo() {
        Object obj = this.iiGwOFFnr;
        if (((lNNWSSNDS) obj) != null) {
            return (ColorStateList) ((lNNWSSNDS) obj).q3BipwRCk;
        }
        return null;
    }

    public void iiGwOFFnr(AttributeSet attributeSet, int i) {
        Context context = ((View) this.J4Ux7ym32).getContext();
        int[] iArr = ZolH67hOx.dfpT1j18n;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(context, attributeSet, iArr, i, 0);
        Object obj = this.J4Ux7ym32;
        IuQbWntsc.PSTqBLTET((View) obj, ((View) obj).getContext(), iArr, attributeSet, (TypedArray) mUqPm6GBh.Bhmn1KIah, i, 0);
        try {
            if (mUqPm6GBh.CpG0imbht(0)) {
                this.dIocxURUo = mUqPm6GBh.iMyQMM6Qj(0, -1);
                ColorStateList dIocxURUo = ((srLS6zLvm) this.tGV7Q6urW).dIocxURUo(((View) this.J4Ux7ym32).getContext(), this.dIocxURUo);
                if (dIocxURUo != null) {
                    yWvV4ePLl(dIocxURUo);
                }
            }
            if (mUqPm6GBh.CpG0imbht(1)) {
                mJLaJepZo.ilHKhw3Yw((View) this.J4Ux7ym32, mUqPm6GBh.Bhmn1KIah(1));
            }
            if (mUqPm6GBh.CpG0imbht(2)) {
                mJLaJepZo.qVUwofr5s((View) this.J4Ux7ym32, Y4wRqkFOh.tGV7Q6urW(mUqPm6GBh.i8XZMQc6Z(2, -1), null));
            }
        } finally {
            mUqPm6GBh.NyWTwPF6V();
        }
    }

    public PorterDuff.Mode kCA6Zs9sL() {
        Object obj = this.iiGwOFFnr;
        if (((lNNWSSNDS) obj) != null) {
            return (PorterDuff.Mode) ((lNNWSSNDS) obj).J4Ux7ym32;
        }
        return null;
    }

    public void oon79WMrY(ColorStateList colorStateList) {
        if (((lNNWSSNDS) this.iiGwOFFnr) == null) {
            this.iiGwOFFnr = new lNNWSSNDS();
        }
        Object obj = this.iiGwOFFnr;
        ((lNNWSSNDS) obj).q3BipwRCk = colorStateList;
        ((lNNWSSNDS) obj).dIocxURUo = true;
        q3BipwRCk();
    }

    public void q3BipwRCk() {
        Drawable background = ((View) this.J4Ux7ym32).getBackground();
        if (background != null) {
            boolean z = true;
            if (((lNNWSSNDS) this.kCA6Zs9sL) != null) {
                if (((lNNWSSNDS) this.GPLPRo6go) == null) {
                    this.GPLPRo6go = new lNNWSSNDS();
                }
                lNNWSSNDS lnnwssnds = (lNNWSSNDS) this.GPLPRo6go;
                lnnwssnds.q3BipwRCk = null;
                lnnwssnds.dIocxURUo = false;
                lnnwssnds.J4Ux7ym32 = null;
                lnnwssnds.tGV7Q6urW = false;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                ColorStateList GPLPRo6go = mJLaJepZo.GPLPRo6go((View) this.J4Ux7ym32);
                if (GPLPRo6go != null) {
                    lnnwssnds.dIocxURUo = true;
                    lnnwssnds.q3BipwRCk = GPLPRo6go;
                }
                PorterDuff.Mode Puu3Rhg4F = mJLaJepZo.Puu3Rhg4F((View) this.J4Ux7ym32);
                if (Puu3Rhg4F != null) {
                    lnnwssnds.tGV7Q6urW = true;
                    lnnwssnds.J4Ux7ym32 = Puu3Rhg4F;
                }
                if (lnnwssnds.dIocxURUo || lnnwssnds.tGV7Q6urW) {
                    srLS6zLvm.iiGwOFFnr(background, lnnwssnds, ((View) this.J4Ux7ym32).getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Object obj = this.iiGwOFFnr;
            if (((lNNWSSNDS) obj) != null) {
                srLS6zLvm.iiGwOFFnr(background, (lNNWSSNDS) obj, ((View) this.J4Ux7ym32).getDrawableState());
                return;
            }
            Object obj2 = this.kCA6Zs9sL;
            if (((lNNWSSNDS) obj2) != null) {
                srLS6zLvm.iiGwOFFnr(background, (lNNWSSNDS) obj2, ((View) this.J4Ux7ym32).getDrawableState());
            }
        }
    }

    public String tGV7Q6urW(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        switch (this.q3BipwRCk) {
            case 1:
                StringBuilder sb = new StringBuilder();
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("FontRequest {mProviderAuthority: ");
                q3BipwRCk.append((String) this.J4Ux7ym32);
                q3BipwRCk.append(", mProviderPackage: ");
                q3BipwRCk.append((String) this.tGV7Q6urW);
                q3BipwRCk.append(", mQuery: ");
                q3BipwRCk.append((String) this.kCA6Zs9sL);
                q3BipwRCk.append(", mCertificates:");
                sb.append(q3BipwRCk.toString());
                for (int i = 0; i < ((List) this.iiGwOFFnr).size(); i++) {
                    sb.append(" [");
                    List list = (List) ((List) this.iiGwOFFnr).get(i);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.dIocxURUo);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vPSbyrYWX(PorterDuff.Mode mode) {
        if (((lNNWSSNDS) this.iiGwOFFnr) == null) {
            this.iiGwOFFnr = new lNNWSSNDS();
        }
        Object obj = this.iiGwOFFnr;
        ((lNNWSSNDS) obj).J4Ux7ym32 = mode;
        ((lNNWSSNDS) obj).tGV7Q6urW = true;
        q3BipwRCk();
    }

    public void yWvV4ePLl(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((lNNWSSNDS) this.kCA6Zs9sL) == null) {
                this.kCA6Zs9sL = new lNNWSSNDS();
            }
            Object obj = this.kCA6Zs9sL;
            ((lNNWSSNDS) obj).q3BipwRCk = colorStateList;
            ((lNNWSSNDS) obj).dIocxURUo = true;
        } else {
            this.kCA6Zs9sL = null;
        }
        q3BipwRCk();
    }

    public SfQ6fqrlg(View view) {
        this.q3BipwRCk = 0;
        this.dIocxURUo = -1;
        this.J4Ux7ym32 = view;
        this.tGV7Q6urW = srLS6zLvm.q3BipwRCk();
    }

    public SfQ6fqrlg(String str, String str2, String str3, List list) {
        this.q3BipwRCk = 1;
        this.J4Ux7ym32 = str;
        this.tGV7Q6urW = str2;
        this.kCA6Zs9sL = str3;
        Objects.requireNonNull(list);
        this.iiGwOFFnr = list;
        this.dIocxURUo = 0;
        this.GPLPRo6go = tGV7Q6urW(str, str2, str3);
    }
}
