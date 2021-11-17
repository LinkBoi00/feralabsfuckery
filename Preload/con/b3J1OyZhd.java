package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class b3J1OyZhd {
    public static final PorterDuff.Mode Puu3Rhg4F = PorterDuff.Mode.SRC_IN;
    public static final Chhy0jfBu oon79WMrY = new Chhy0jfBu(6);
    public static b3J1OyZhd yWvV4ePLl;
    public lxnOH5yvO GPLPRo6go;
    public ZmYjNS8wW J4Ux7ym32;
    public final WeakHashMap dIocxURUo = new WeakHashMap(0);
    public boolean iiGwOFFnr;
    public TypedValue kCA6Zs9sL;
    public WeakHashMap q3BipwRCk;
    public aT3qVrmRB tGV7Q6urW;

    public static synchronized PorterDuffColorFilter GPLPRo6go(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (b3J1OyZhd.class) {
            Chhy0jfBu chhy0jfBu = oon79WMrY;
            Objects.requireNonNull(chhy0jfBu);
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) chhy0jfBu.q3BipwRCk(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                Objects.requireNonNull(chhy0jfBu);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) chhy0jfBu.J4Ux7ym32(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized b3J1OyZhd tGV7Q6urW() {
        b3J1OyZhd b3j1oyzhd;
        synchronized (b3J1OyZhd.class) {
            if (yWvV4ePLl == null) {
                yWvV4ePLl = new b3J1OyZhd();
            }
            b3j1oyzhd = yWvV4ePLl;
        }
        return b3j1oyzhd;
    }

    public final Drawable J4Ux7ym32(Context context, int i) {
        int i2;
        if (this.kCA6Zs9sL == null) {
            this.kCA6Zs9sL = new TypedValue();
        }
        TypedValue typedValue = this.kCA6Zs9sL;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable dIocxURUo = dIocxURUo(context, j);
        if (dIocxURUo != null) {
            return dIocxURUo;
        }
        lxnOH5yvO lxnoh5yvo = this.GPLPRo6go;
        LayerDrawable layerDrawable = null;
        if (lxnoh5yvo != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{kCA6Zs9sL(context, R.drawable.abc_cab_background_internal_bg), kCA6Zs9sL(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i == R.drawable.abc_ratingbar_material) {
                    i2 = R.dimen.abc_star_big;
                } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                    i2 = R.dimen.abc_star_medium;
                } else if (i == R.drawable.abc_ratingbar_small_material) {
                    i2 = R.dimen.abc_star_small;
                }
                layerDrawable = lxnoh5yvo.tGV7Q6urW(this, context, i2);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            q3BipwRCk(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    public synchronized ColorStateList Puu3Rhg4F(Context context, int i) {
        ColorStateList colorStateList;
        aT3qVrmRB at3qvrmrb;
        WeakHashMap weakHashMap = this.q3BipwRCk;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (at3qvrmrb = (aT3qVrmRB) weakHashMap.get(context)) == null) ? null : (ColorStateList) at3qvrmrb.kCA6Zs9sL(i, null);
        if (colorStateList == null) {
            lxnOH5yvO lxnoh5yvo = this.GPLPRo6go;
            if (lxnoh5yvo != null) {
                colorStateList2 = lxnoh5yvo.dIocxURUo(context, i);
            }
            if (colorStateList2 != null) {
                if (this.q3BipwRCk == null) {
                    this.q3BipwRCk = new WeakHashMap();
                }
                aT3qVrmRB at3qvrmrb2 = (aT3qVrmRB) this.q3BipwRCk.get(context);
                if (at3qvrmrb2 == null) {
                    at3qvrmrb2 = new aT3qVrmRB();
                    this.q3BipwRCk.put(context, at3qvrmrb2);
                }
                at3qvrmrb2.q3BipwRCk(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized Drawable dIocxURUo(Context context, long j) {
        Object[] objArr;
        Object obj;
        NRnsbVC1Y nRnsbVC1Y = (NRnsbVC1Y) this.dIocxURUo.get(context);
        if (nRnsbVC1Y == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) nRnsbVC1Y.kCA6Zs9sL(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int J4Ux7ym32 = PhWyMtRZm.J4Ux7ym32(nRnsbVC1Y.kmSgne1rO, nRnsbVC1Y.PSTqBLTET, j);
            if (J4Ux7ym32 >= 0 && (objArr = nRnsbVC1Y.Bhmn1KIah)[J4Ux7ym32] != (obj = NRnsbVC1Y.MzoOEjc4X)) {
                objArr[J4Ux7ym32] = obj;
                nRnsbVC1Y.CBQ5d1kRq = true;
            }
        }
        return null;
    }

    public synchronized Drawable iiGwOFFnr(Context context, int i, boolean z) {
        Drawable yWvV4ePLl2;
        if (!this.iiGwOFFnr) {
            boolean z2 = true;
            this.iiGwOFFnr = true;
            Drawable kCA6Zs9sL = kCA6Zs9sL(context, R.drawable.abc_vector_test);
            if (kCA6Zs9sL != null) {
                if (!(kCA6Zs9sL instanceof xi5sqtihD) && !"android.graphics.drawable.VectorDrawable".equals(kCA6Zs9sL.getClass().getName())) {
                    z2 = false;
                }
            }
            this.iiGwOFFnr = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        yWvV4ePLl2 = yWvV4ePLl(context, i);
        if (yWvV4ePLl2 == null) {
            yWvV4ePLl2 = J4Ux7ym32(context, i);
        }
        if (yWvV4ePLl2 == null) {
            Object obj = D856HTNqd.q3BipwRCk;
            yWvV4ePLl2 = jsNC7SjP9.J4Ux7ym32(context, i);
        }
        if (yWvV4ePLl2 != null) {
            yWvV4ePLl2 = oon79WMrY(context, i, z, yWvV4ePLl2);
        }
        if (yWvV4ePLl2 != null) {
            int[] iArr = Y4wRqkFOh.q3BipwRCk;
        }
        return yWvV4ePLl2;
    }

    public synchronized Drawable kCA6Zs9sL(Context context, int i) {
        return iiGwOFFnr(context, i, false);
    }

    public final Drawable oon79WMrY(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList Puu3Rhg4F2 = Puu3Rhg4F(context, i);
        PorterDuff.Mode mode = null;
        if (Puu3Rhg4F2 != null) {
            if (Y4wRqkFOh.q3BipwRCk(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(Puu3Rhg4F2);
            if (this.GPLPRo6go != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        lxnOH5yvO lxnoh5yvo = this.GPLPRo6go;
        if (lxnoh5yvo != null) {
            boolean z2 = true;
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int tGV7Q6urW = hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = srLS6zLvm.J4Ux7ym32;
                lxnoh5yvo.kCA6Zs9sL(findDrawableByLayerId, tGV7Q6urW, mode2);
                lxnoh5yvo.kCA6Zs9sL(layerDrawable.findDrawableByLayerId(16908303), hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlNormal), mode2);
                lxnoh5yvo.kCA6Zs9sL(layerDrawable.findDrawableByLayerId(16908301), hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlActivated), mode2);
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int J4Ux7ym32 = hfLGvn7bI.J4Ux7ym32(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = srLS6zLvm.J4Ux7ym32;
                lxnoh5yvo.kCA6Zs9sL(findDrawableByLayerId2, J4Ux7ym32, mode3);
                lxnoh5yvo.kCA6Zs9sL(layerDrawable2.findDrawableByLayerId(16908303), hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlActivated), mode3);
                lxnoh5yvo.kCA6Zs9sL(layerDrawable2.findDrawableByLayerId(16908301), hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (vPSbyrYWX(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    public final synchronized boolean q3BipwRCk(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            NRnsbVC1Y nRnsbVC1Y = (NRnsbVC1Y) this.dIocxURUo.get(context);
            if (nRnsbVC1Y == null) {
                nRnsbVC1Y = new NRnsbVC1Y();
                this.dIocxURUo.put(context, nRnsbVC1Y);
            }
            nRnsbVC1Y.iiGwOFFnr(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean vPSbyrYWX(Context context, int i, Drawable drawable) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        lxnOH5yvO lxnoh5yvo = this.GPLPRo6go;
        if (lxnoh5yvo != null) {
            Objects.requireNonNull(lxnoh5yvo);
            PorterDuff.Mode mode = srLS6zLvm.J4Ux7ym32;
            int i4 = 16842801;
            if (lxnoh5yvo.q3BipwRCk(lxnoh5yvo.q3BipwRCk, i)) {
                i4 = R.attr.colorControlNormal;
            } else if (lxnoh5yvo.q3BipwRCk(lxnoh5yvo.tGV7Q6urW, i)) {
                i4 = R.attr.colorControlActivated;
            } else if (lxnoh5yvo.q3BipwRCk(lxnoh5yvo.dIocxURUo, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                i2 = 16842800;
                i3 = Math.round(40.8f);
                z = true;
                if (z) {
                    if (Y4wRqkFOh.q3BipwRCk(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(srLS6zLvm.tGV7Q6urW(hfLGvn7bI.tGV7Q6urW(context, i2), mode));
                    if (i3 != -1) {
                        drawable.setAlpha(i3);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            } else if (i != R.drawable.abc_dialog_material_background) {
                i2 = 0;
                z = false;
                i3 = -1;
                if (z) {
                }
                if (z2) {
                }
            }
            i2 = i4;
            i3 = -1;
            z = true;
            if (z) {
            }
            if (z2) {
            }
        }
        return false;
    }

    public final Drawable yWvV4ePLl(Context context, int i) {
        int next;
        ZmYjNS8wW zmYjNS8wW = this.J4Ux7ym32;
        if (zmYjNS8wW == null || zmYjNS8wW.isEmpty()) {
            return null;
        }
        aT3qVrmRB at3qvrmrb = this.tGV7Q6urW;
        if (at3qvrmrb != null) {
            String str = (String) at3qvrmrb.kCA6Zs9sL(i, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.J4Ux7ym32.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.tGV7Q6urW = new aT3qVrmRB();
        }
        if (this.kCA6Zs9sL == null) {
            this.kCA6Zs9sL = new TypedValue();
        }
        TypedValue typedValue = this.kCA6Zs9sL;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable dIocxURUo = dIocxURUo(context, j);
        if (dIocxURUo != null) {
            return dIocxURUo;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.tGV7Q6urW.q3BipwRCk(i, name);
                    oNVBNGw3p onvbngw3p = (oNVBNGw3p) this.J4Ux7ym32.get(name);
                    if (onvbngw3p != null) {
                        dIocxURUo = onvbngw3p.q3BipwRCk(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (dIocxURUo != null) {
                        dIocxURUo.setChangingConfigurations(typedValue.changingConfigurations);
                        q3BipwRCk(context, j, dIocxURUo);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (dIocxURUo == null) {
            this.tGV7Q6urW.q3BipwRCk(i, "appcompat_skip_skip");
        }
        return dIocxURUo;
    }
}
