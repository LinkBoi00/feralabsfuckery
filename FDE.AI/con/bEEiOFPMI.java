package con;

import android.graphics.Paint;
/* loaded from: classes.dex */
public abstract /* synthetic */ class bEEiOFPMI {
    public static final /* synthetic */ int[] J4Ux7ym32;
    public static final /* synthetic */ int[] q3BipwRCk;

    static {
        new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        int[] iArr = new int[Paint.Cap.values().length];
        iArr[Paint.Cap.BUTT.ordinal()] = 1;
        iArr[Paint.Cap.ROUND.ordinal()] = 2;
        iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        q3BipwRCk = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        iArr2[Paint.Join.MITER.ordinal()] = 1;
        iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        iArr2[Paint.Join.ROUND.ordinal()] = 3;
        J4Ux7ym32 = iArr2;
    }
}
