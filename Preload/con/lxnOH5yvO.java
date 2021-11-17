package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class lxnOH5yvO {
    public final int[] q3BipwRCk = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] J4Ux7ym32 = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] tGV7Q6urW = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] dIocxURUo = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] kCA6Zs9sL = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    public final int[] iiGwOFFnr = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public final ColorStateList J4Ux7ym32(Context context, int i) {
        int tGV7Q6urW = hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{hfLGvn7bI.J4Ux7ym32, hfLGvn7bI.dIocxURUo, hfLGvn7bI.tGV7Q6urW, hfLGvn7bI.iiGwOFFnr}, new int[]{hfLGvn7bI.J4Ux7ym32(context, R.attr.colorButtonNormal), R33DQrZIb.J4Ux7ym32(tGV7Q6urW, i), R33DQrZIb.J4Ux7ym32(tGV7Q6urW, i), i});
    }

    public ColorStateList dIocxURUo(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            return context.getColorStateList(R.color.abc_tint_edittext);
        } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            ThreadLocal threadLocal2 = C8A1BseZU.q3BipwRCk;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        } else if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList dIocxURUo = hfLGvn7bI.dIocxURUo(context, R.attr.colorSwitchThumbNormal);
            if (dIocxURUo == null || !dIocxURUo.isStateful()) {
                iArr[0] = hfLGvn7bI.J4Ux7ym32;
                iArr2[0] = hfLGvn7bI.J4Ux7ym32(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = hfLGvn7bI.kCA6Zs9sL;
                iArr2[1] = hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlActivated);
                iArr[2] = hfLGvn7bI.iiGwOFFnr;
                iArr2[2] = hfLGvn7bI.tGV7Q6urW(context, R.attr.colorSwitchThumbNormal);
            } else {
                iArr[0] = hfLGvn7bI.J4Ux7ym32;
                iArr2[0] = dIocxURUo.getColorForState(iArr[0], 0);
                iArr[1] = hfLGvn7bI.kCA6Zs9sL;
                iArr2[1] = hfLGvn7bI.tGV7Q6urW(context, R.attr.colorControlActivated);
                iArr[2] = hfLGvn7bI.iiGwOFFnr;
                iArr2[2] = dIocxURUo.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return J4Ux7ym32(context, hfLGvn7bI.tGV7Q6urW(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return J4Ux7ym32(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return J4Ux7ym32(context, hfLGvn7bI.tGV7Q6urW(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                ThreadLocal threadLocal3 = C8A1BseZU.q3BipwRCk;
                return context.getColorStateList(R.color.abc_tint_spinner);
            } else if (q3BipwRCk(this.J4Ux7ym32, i)) {
                return hfLGvn7bI.dIocxURUo(context, R.attr.colorControlNormal);
            } else {
                if (q3BipwRCk(this.kCA6Zs9sL, i)) {
                    ThreadLocal threadLocal4 = C8A1BseZU.q3BipwRCk;
                    return context.getColorStateList(R.color.abc_tint_default);
                } else if (q3BipwRCk(this.iiGwOFFnr, i)) {
                    ThreadLocal threadLocal5 = C8A1BseZU.q3BipwRCk;
                    return context.getColorStateList(R.color.abc_tint_btn_checkable);
                } else if (i != R.drawable.abc_seekbar_thumb_material) {
                    return null;
                } else {
                    ThreadLocal threadLocal6 = C8A1BseZU.q3BipwRCk;
                    return context.getColorStateList(R.color.abc_tint_seek_thumb);
                }
            }
        }
    }

    public final void kCA6Zs9sL(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (Y4wRqkFOh.q3BipwRCk(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = srLS6zLvm.J4Ux7ym32;
        }
        drawable.setColorFilter(srLS6zLvm.tGV7Q6urW(i, mode));
    }

    public final boolean q3BipwRCk(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final LayerDrawable tGV7Q6urW(b3J1OyZhd b3j1oyzhd, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable kCA6Zs9sL = b3j1oyzhd.kCA6Zs9sL(context, R.drawable.abc_star_black_48dp);
        Drawable kCA6Zs9sL2 = b3j1oyzhd.kCA6Zs9sL(context, R.drawable.abc_star_half_black_48dp);
        if ((kCA6Zs9sL instanceof BitmapDrawable) && kCA6Zs9sL.getIntrinsicWidth() == dimensionPixelSize && kCA6Zs9sL.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) kCA6Zs9sL;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            kCA6Zs9sL.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            kCA6Zs9sL.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((kCA6Zs9sL2 instanceof BitmapDrawable) && kCA6Zs9sL2.getIntrinsicWidth() == dimensionPixelSize && kCA6Zs9sL2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) kCA6Zs9sL2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            kCA6Zs9sL2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            kCA6Zs9sL2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }
}
