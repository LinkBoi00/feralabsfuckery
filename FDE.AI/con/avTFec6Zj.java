package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
/* loaded from: classes.dex */
public class avTFec6Zj {
    public Typeface Bhmn1KIah;
    public final int CBQ5d1kRq;
    public final float GPLPRo6go;
    public final String J4Ux7ym32;
    public final boolean Puu3Rhg4F;
    public final int dIocxURUo;
    public final float iiGwOFFnr;
    public final float kCA6Zs9sL;
    public boolean kmSgne1rO = false;
    public ColorStateList oon79WMrY;
    public final ColorStateList q3BipwRCk;
    public final int tGV7Q6urW;
    public float vPSbyrYWX;
    public final float yWvV4ePLl;

    public avTFec6Zj(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, RisoK3egD.dfpT1j18n);
        this.vPSbyrYWX = obtainStyledAttributes.getDimension(0, 0.0f);
        this.oon79WMrY = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 3);
        anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 4);
        anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 5);
        this.tGV7Q6urW = obtainStyledAttributes.getInt(2, 0);
        this.dIocxURUo = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.CBQ5d1kRq = obtainStyledAttributes.getResourceId(i2, 0);
        this.J4Ux7ym32 = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.q3BipwRCk = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 6);
        this.kCA6Zs9sL = obtainStyledAttributes.getFloat(7, 0.0f);
        this.iiGwOFFnr = obtainStyledAttributes.getFloat(8, 0.0f);
        this.GPLPRo6go = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, RisoK3egD.Eeka1udhb);
        this.Puu3Rhg4F = obtainStyledAttributes2.hasValue(0);
        this.yWvV4ePLl = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public void GPLPRo6go(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.tGV7Q6urW;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.vPSbyrYWX);
        if (this.Puu3Rhg4F) {
            textPaint.setLetterSpacing(this.yWvV4ePLl);
        }
    }

    public Typeface J4Ux7ym32(Context context) {
        if (this.kmSgne1rO) {
            return this.Bhmn1KIah;
        }
        if (!context.isRestricted()) {
            try {
                Typeface q3BipwRCk = K95C08eIr.q3BipwRCk(context, this.CBQ5d1kRq);
                this.Bhmn1KIah = q3BipwRCk;
                if (q3BipwRCk != null) {
                    this.Bhmn1KIah = Typeface.create(q3BipwRCk, this.tGV7Q6urW);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Error loading font ");
                q3BipwRCk2.append(this.J4Ux7ym32);
                Log.d("TextAppearance", q3BipwRCk2.toString(), e);
            }
        }
        q3BipwRCk();
        this.kmSgne1rO = true;
        return this.Bhmn1KIah;
    }

    public final boolean dIocxURUo(Context context) {
        int i = this.CBQ5d1kRq;
        Typeface typeface = null;
        if (i != 0) {
            ThreadLocal threadLocal = K95C08eIr.q3BipwRCk;
            if (!context.isRestricted()) {
                typeface = K95C08eIr.J4Ux7ym32(context, i, new TypedValue(), 0, null, null, false, true);
            }
        }
        return typeface != null;
    }

    public void iiGwOFFnr(Context context, TextPaint textPaint, SQ4Lz5bqj sQ4Lz5bqj) {
        if (dIocxURUo(context)) {
            GPLPRo6go(textPaint, J4Ux7ym32(context));
            return;
        }
        q3BipwRCk();
        GPLPRo6go(textPaint, this.Bhmn1KIah);
        tGV7Q6urW(context, new oEgrxLTjV(this, textPaint, sQ4Lz5bqj));
    }

    public void kCA6Zs9sL(Context context, TextPaint textPaint, SQ4Lz5bqj sQ4Lz5bqj) {
        iiGwOFFnr(context, textPaint, sQ4Lz5bqj);
        ColorStateList colorStateList = this.oon79WMrY;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.GPLPRo6go;
        float f2 = this.kCA6Zs9sL;
        float f3 = this.iiGwOFFnr;
        ColorStateList colorStateList2 = this.q3BipwRCk;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void q3BipwRCk() {
        String str;
        if (this.Bhmn1KIah == null && (str = this.J4Ux7ym32) != null) {
            this.Bhmn1KIah = Typeface.create(str, this.tGV7Q6urW);
        }
        if (this.Bhmn1KIah == null) {
            int i = this.dIocxURUo;
            this.Bhmn1KIah = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.Bhmn1KIah = Typeface.create(this.Bhmn1KIah, this.tGV7Q6urW);
        }
    }

    public void tGV7Q6urW(Context context, SQ4Lz5bqj sQ4Lz5bqj) {
        if (dIocxURUo(context)) {
            J4Ux7ym32(context);
        } else {
            q3BipwRCk();
        }
        int i = this.CBQ5d1kRq;
        if (i == 0) {
            this.kmSgne1rO = true;
        }
        if (this.kmSgne1rO) {
            sQ4Lz5bqj.J4Ux7ym32(this.Bhmn1KIah, true);
            return;
        }
        try {
            ODnYBrdmm oDnYBrdmm = new ODnYBrdmm(this, sQ4Lz5bqj);
            ThreadLocal threadLocal = K95C08eIr.q3BipwRCk;
            if (context.isRestricted()) {
                oDnYBrdmm.q3BipwRCk(-4, null);
            } else {
                K95C08eIr.J4Ux7ym32(context, i, new TypedValue(), 0, oDnYBrdmm, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            while (true) {
                this.kmSgne1rO = true;
                sQ4Lz5bqj.q3BipwRCk(1);
                return;
            }
        } catch (Exception e) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Error loading font ");
            q3BipwRCk.append(this.J4Ux7ym32);
            Log.d("TextAppearance", q3BipwRCk.toString(), e);
            this.kmSgne1rO = true;
            sQ4Lz5bqj.q3BipwRCk(-3);
        }
    }
}
