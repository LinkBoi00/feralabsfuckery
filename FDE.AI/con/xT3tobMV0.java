package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;
/* loaded from: classes.dex */
public class xT3tobMV0 {
    public oWhsE8IPp CBQ5d1kRq;
    public BR8wFu8f7 GPLPRo6go;
    public qdam7I1O8 J4Ux7ym32;
    public BR8wFu8f7 Puu3Rhg4F;
    public qdam7I1O8 dIocxURUo;
    public BR8wFu8f7 iiGwOFFnr;
    public BR8wFu8f7 kCA6Zs9sL;
    public oWhsE8IPp oon79WMrY;
    public qdam7I1O8 q3BipwRCk;
    public qdam7I1O8 tGV7Q6urW;
    public oWhsE8IPp vPSbyrYWX;
    public oWhsE8IPp yWvV4ePLl;

    public xT3tobMV0() {
        this.q3BipwRCk = new d6ChEZHmJ();
        this.J4Ux7ym32 = new d6ChEZHmJ();
        this.tGV7Q6urW = new d6ChEZHmJ();
        this.dIocxURUo = new d6ChEZHmJ();
        this.kCA6Zs9sL = new dNif5KqqH(0.0f);
        this.iiGwOFFnr = new dNif5KqqH(0.0f);
        this.GPLPRo6go = new dNif5KqqH(0.0f);
        this.Puu3Rhg4F = new dNif5KqqH(0.0f);
        this.yWvV4ePLl = dnBSj5uJN.kmSgne1rO();
        this.oon79WMrY = dnBSj5uJN.kmSgne1rO();
        this.vPSbyrYWX = dnBSj5uJN.kmSgne1rO();
        this.CBQ5d1kRq = dnBSj5uJN.kmSgne1rO();
    }

    public static RG2GI7LDp J4Ux7ym32(Context context, AttributeSet attributeSet, int i, int i2) {
        dNif5KqqH dnif5kqqh = new dNif5KqqH((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.qVUwofr5s, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return q3BipwRCk(context, resourceId, resourceId2, dnif5kqqh);
    }

    public static RG2GI7LDp q3BipwRCk(Context context, int i, int i2, BR8wFu8f7 bR8wFu8f7) {
        if (i2 != 0) {
            context = new ContextThemeWrapper(context, i);
            i = i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, RisoK3egD.WaUP0CF08);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            BR8wFu8f7 tGV7Q6urW = tGV7Q6urW(obtainStyledAttributes, 5, bR8wFu8f7);
            BR8wFu8f7 tGV7Q6urW2 = tGV7Q6urW(obtainStyledAttributes, 8, tGV7Q6urW);
            BR8wFu8f7 tGV7Q6urW3 = tGV7Q6urW(obtainStyledAttributes, 9, tGV7Q6urW);
            BR8wFu8f7 tGV7Q6urW4 = tGV7Q6urW(obtainStyledAttributes, 7, tGV7Q6urW);
            BR8wFu8f7 tGV7Q6urW5 = tGV7Q6urW(obtainStyledAttributes, 6, tGV7Q6urW);
            RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
            qdam7I1O8 CBQ5d1kRq = dnBSj5uJN.CBQ5d1kRq(i4);
            rG2GI7LDp.q3BipwRCk = CBQ5d1kRq;
            RG2GI7LDp.J4Ux7ym32(CBQ5d1kRq);
            rG2GI7LDp.kCA6Zs9sL = tGV7Q6urW2;
            qdam7I1O8 CBQ5d1kRq2 = dnBSj5uJN.CBQ5d1kRq(i5);
            rG2GI7LDp.J4Ux7ym32 = CBQ5d1kRq2;
            RG2GI7LDp.J4Ux7ym32(CBQ5d1kRq2);
            rG2GI7LDp.iiGwOFFnr = tGV7Q6urW3;
            qdam7I1O8 CBQ5d1kRq3 = dnBSj5uJN.CBQ5d1kRq(i6);
            rG2GI7LDp.tGV7Q6urW = CBQ5d1kRq3;
            RG2GI7LDp.J4Ux7ym32(CBQ5d1kRq3);
            rG2GI7LDp.GPLPRo6go = tGV7Q6urW4;
            qdam7I1O8 CBQ5d1kRq4 = dnBSj5uJN.CBQ5d1kRq(i7);
            rG2GI7LDp.dIocxURUo = CBQ5d1kRq4;
            RG2GI7LDp.J4Ux7ym32(CBQ5d1kRq4);
            rG2GI7LDp.Puu3Rhg4F = tGV7Q6urW5;
            return rG2GI7LDp;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static BR8wFu8f7 tGV7Q6urW(TypedArray typedArray, int i, BR8wFu8f7 bR8wFu8f7) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return bR8wFu8f7;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new dNif5KqqH((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new Oytaca5rU(peekValue.getFraction(1.0f, 1.0f)) : bR8wFu8f7;
    }

    public boolean dIocxURUo(RectF rectF) {
        boolean z = this.CBQ5d1kRq.getClass().equals(oWhsE8IPp.class) && this.oon79WMrY.getClass().equals(oWhsE8IPp.class) && this.yWvV4ePLl.getClass().equals(oWhsE8IPp.class) && this.vPSbyrYWX.getClass().equals(oWhsE8IPp.class);
        float q3BipwRCk = this.kCA6Zs9sL.q3BipwRCk(rectF);
        return z && ((this.iiGwOFFnr.q3BipwRCk(rectF) > q3BipwRCk ? 1 : (this.iiGwOFFnr.q3BipwRCk(rectF) == q3BipwRCk ? 0 : -1)) == 0 && (this.Puu3Rhg4F.q3BipwRCk(rectF) > q3BipwRCk ? 1 : (this.Puu3Rhg4F.q3BipwRCk(rectF) == q3BipwRCk ? 0 : -1)) == 0 && (this.GPLPRo6go.q3BipwRCk(rectF) > q3BipwRCk ? 1 : (this.GPLPRo6go.q3BipwRCk(rectF) == q3BipwRCk ? 0 : -1)) == 0) && ((this.J4Ux7ym32 instanceof d6ChEZHmJ) && (this.q3BipwRCk instanceof d6ChEZHmJ) && (this.tGV7Q6urW instanceof d6ChEZHmJ) && (this.dIocxURUo instanceof d6ChEZHmJ));
    }

    public xT3tobMV0 kCA6Zs9sL(float f) {
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(this);
        rG2GI7LDp.tGV7Q6urW(f);
        return rG2GI7LDp.q3BipwRCk();
    }

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp {
        public oWhsE8IPp CBQ5d1kRq;
        public BR8wFu8f7 GPLPRo6go;
        public qdam7I1O8 J4Ux7ym32;
        public BR8wFu8f7 Puu3Rhg4F;
        public qdam7I1O8 dIocxURUo;
        public BR8wFu8f7 iiGwOFFnr;
        public BR8wFu8f7 kCA6Zs9sL;
        public oWhsE8IPp oon79WMrY;
        public qdam7I1O8 q3BipwRCk;
        public qdam7I1O8 tGV7Q6urW;
        public oWhsE8IPp vPSbyrYWX;
        public oWhsE8IPp yWvV4ePLl;

        public RG2GI7LDp() {
            this.q3BipwRCk = new d6ChEZHmJ();
            this.J4Ux7ym32 = new d6ChEZHmJ();
            this.tGV7Q6urW = new d6ChEZHmJ();
            this.dIocxURUo = new d6ChEZHmJ();
            this.kCA6Zs9sL = new dNif5KqqH(0.0f);
            this.iiGwOFFnr = new dNif5KqqH(0.0f);
            this.GPLPRo6go = new dNif5KqqH(0.0f);
            this.Puu3Rhg4F = new dNif5KqqH(0.0f);
            this.yWvV4ePLl = dnBSj5uJN.kmSgne1rO();
            this.oon79WMrY = dnBSj5uJN.kmSgne1rO();
            this.vPSbyrYWX = dnBSj5uJN.kmSgne1rO();
            this.CBQ5d1kRq = dnBSj5uJN.kmSgne1rO();
        }

        public static float J4Ux7ym32(qdam7I1O8 qdam7i1o8) {
            Object obj;
            if (qdam7i1o8 instanceof d6ChEZHmJ) {
                obj = (d6ChEZHmJ) qdam7i1o8;
            } else if (!(qdam7i1o8 instanceof VU05rwNLK)) {
                return -1.0f;
            } else {
                obj = (VU05rwNLK) qdam7i1o8;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        public RG2GI7LDp GPLPRo6go(float f) {
            this.iiGwOFFnr = new dNif5KqqH(f);
            return this;
        }

        public RG2GI7LDp dIocxURUo(float f) {
            this.Puu3Rhg4F = new dNif5KqqH(f);
            return this;
        }

        public RG2GI7LDp iiGwOFFnr(float f) {
            this.kCA6Zs9sL = new dNif5KqqH(f);
            return this;
        }

        public RG2GI7LDp kCA6Zs9sL(float f) {
            this.GPLPRo6go = new dNif5KqqH(f);
            return this;
        }

        public xT3tobMV0 q3BipwRCk() {
            return new xT3tobMV0(this, null);
        }

        public RG2GI7LDp tGV7Q6urW(float f) {
            this.kCA6Zs9sL = new dNif5KqqH(f);
            this.iiGwOFFnr = new dNif5KqqH(f);
            this.GPLPRo6go = new dNif5KqqH(f);
            this.Puu3Rhg4F = new dNif5KqqH(f);
            return this;
        }

        public RG2GI7LDp(xT3tobMV0 xt3tobmv0) {
            this.q3BipwRCk = new d6ChEZHmJ();
            this.J4Ux7ym32 = new d6ChEZHmJ();
            this.tGV7Q6urW = new d6ChEZHmJ();
            this.dIocxURUo = new d6ChEZHmJ();
            this.kCA6Zs9sL = new dNif5KqqH(0.0f);
            this.iiGwOFFnr = new dNif5KqqH(0.0f);
            this.GPLPRo6go = new dNif5KqqH(0.0f);
            this.Puu3Rhg4F = new dNif5KqqH(0.0f);
            this.yWvV4ePLl = dnBSj5uJN.kmSgne1rO();
            this.oon79WMrY = dnBSj5uJN.kmSgne1rO();
            this.vPSbyrYWX = dnBSj5uJN.kmSgne1rO();
            this.CBQ5d1kRq = dnBSj5uJN.kmSgne1rO();
            this.q3BipwRCk = xt3tobmv0.q3BipwRCk;
            this.J4Ux7ym32 = xt3tobmv0.J4Ux7ym32;
            this.tGV7Q6urW = xt3tobmv0.tGV7Q6urW;
            this.dIocxURUo = xt3tobmv0.dIocxURUo;
            this.kCA6Zs9sL = xt3tobmv0.kCA6Zs9sL;
            this.iiGwOFFnr = xt3tobmv0.iiGwOFFnr;
            this.GPLPRo6go = xt3tobmv0.GPLPRo6go;
            this.Puu3Rhg4F = xt3tobmv0.Puu3Rhg4F;
            this.yWvV4ePLl = xt3tobmv0.yWvV4ePLl;
            this.oon79WMrY = xt3tobmv0.oon79WMrY;
            this.vPSbyrYWX = xt3tobmv0.vPSbyrYWX;
            this.CBQ5d1kRq = xt3tobmv0.CBQ5d1kRq;
        }
    }

    public xT3tobMV0(RG2GI7LDp rG2GI7LDp, idpM54xlp idpm54xlp) {
        this.q3BipwRCk = rG2GI7LDp.q3BipwRCk;
        this.J4Ux7ym32 = rG2GI7LDp.J4Ux7ym32;
        this.tGV7Q6urW = rG2GI7LDp.tGV7Q6urW;
        this.dIocxURUo = rG2GI7LDp.dIocxURUo;
        this.kCA6Zs9sL = rG2GI7LDp.kCA6Zs9sL;
        this.iiGwOFFnr = rG2GI7LDp.iiGwOFFnr;
        this.GPLPRo6go = rG2GI7LDp.GPLPRo6go;
        this.Puu3Rhg4F = rG2GI7LDp.Puu3Rhg4F;
        this.yWvV4ePLl = rG2GI7LDp.yWvV4ePLl;
        this.oon79WMrY = rG2GI7LDp.oon79WMrY;
        this.vPSbyrYWX = rG2GI7LDp.vPSbyrYWX;
        this.CBQ5d1kRq = rG2GI7LDp.CBQ5d1kRq;
    }
}
