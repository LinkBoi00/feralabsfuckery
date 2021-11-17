package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import con.EssXmp5ks;
import con.ZJ8KC7OWm;
import con.gy98n89o5;
/* loaded from: classes.dex */
public class Barrier extends ZJ8KC7OWm {
    public int Eeka1udhb;
    public gy98n89o5 RG6kpfv3v;
    public int dXrmkklc8;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.RG6kpfv3v.uSBmk4hFZ;
    }

    public int getMargin() {
        return this.RG6kpfv3v.a8N8UmDyD;
    }

    public int getType() {
        return this.Eeka1udhb;
    }

    @Override // con.ZJ8KC7OWm
    public void kCA6Zs9sL(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, EssXmp5ks.J4Ux7ym32);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.MzoOEjc4X = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.ilHKhw3Yw = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.RG6kpfv3v = new gy98n89o5();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, EssXmp5ks.J4Ux7ym32);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = obtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    setType(obtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == 25) {
                    this.RG6kpfv3v.uSBmk4hFZ = obtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == 27) {
                    this.RG6kpfv3v.a8N8UmDyD = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        this.PSTqBLTET = this.RG6kpfv3v;
        iiGwOFFnr();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.RG6kpfv3v.uSBmk4hFZ = z;
    }

    public void setDpMargin(int i) {
        this.RG6kpfv3v.a8N8UmDyD = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.RG6kpfv3v.a8N8UmDyD = i;
    }

    public void setType(int i) {
        this.Eeka1udhb = i;
    }
}
