package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class GB7SBlGiG {
    public final SfQ6fqrlg GPLPRo6go;
    public final SfQ6fqrlg J4Ux7ym32;
    public final SfQ6fqrlg dIocxURUo;
    public final SfQ6fqrlg iiGwOFFnr;
    public final SfQ6fqrlg kCA6Zs9sL;
    public final SfQ6fqrlg q3BipwRCk;
    public final SfQ6fqrlg tGV7Q6urW;

    public GB7SBlGiG(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(KYuHUB7GA.kCA6Zs9sL(context, R.attr.materialCalendarStyle, gBRio1gPW.class.getCanonicalName()), RisoK3egD.Bhmn1KIah);
        this.q3BipwRCk = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(3, 0));
        this.GPLPRo6go = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(1, 0));
        this.J4Ux7ym32 = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(2, 0));
        this.tGV7Q6urW = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList Bhmn1KIah = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 6);
        this.dIocxURUo = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(8, 0));
        this.kCA6Zs9sL = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(7, 0));
        this.iiGwOFFnr = SfQ6fqrlg.J4Ux7ym32(context, obtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(Bhmn1KIah.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
