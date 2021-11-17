package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.RG2GI7LDp;
/* loaded from: classes.dex */
public class HhTenJ4o3 {
    public static SparseIntArray PSTqBLTET;
    public boolean q3BipwRCk = false;
    public float J4Ux7ym32 = 0.0f;
    public float tGV7Q6urW = 0.0f;
    public float dIocxURUo = 0.0f;
    public float kCA6Zs9sL = 1.0f;
    public float iiGwOFFnr = 1.0f;
    public float GPLPRo6go = Float.NaN;
    public float Puu3Rhg4F = Float.NaN;
    public int yWvV4ePLl = -1;
    public float oon79WMrY = 0.0f;
    public float vPSbyrYWX = 0.0f;
    public float CBQ5d1kRq = 0.0f;
    public boolean kmSgne1rO = false;
    public float Bhmn1KIah = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        PSTqBLTET = sparseIntArray;
        sparseIntArray.append(6, 1);
        PSTqBLTET.append(7, 2);
        PSTqBLTET.append(8, 3);
        PSTqBLTET.append(4, 4);
        PSTqBLTET.append(5, 5);
        PSTqBLTET.append(0, 6);
        PSTqBLTET.append(1, 7);
        PSTqBLTET.append(2, 8);
        PSTqBLTET.append(3, 9);
        PSTqBLTET.append(9, 10);
        PSTqBLTET.append(10, 11);
        PSTqBLTET.append(11, 12);
    }

    public void q3BipwRCk(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EssXmp5ks.yWvV4ePLl);
        this.q3BipwRCk = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (PSTqBLTET.get(index)) {
                case 1:
                    this.J4Ux7ym32 = obtainStyledAttributes.getFloat(index, this.J4Ux7ym32);
                    break;
                case 2:
                    this.tGV7Q6urW = obtainStyledAttributes.getFloat(index, this.tGV7Q6urW);
                    break;
                case 3:
                    this.dIocxURUo = obtainStyledAttributes.getFloat(index, this.dIocxURUo);
                    break;
                case 4:
                    this.kCA6Zs9sL = obtainStyledAttributes.getFloat(index, this.kCA6Zs9sL);
                    break;
                case 5:
                    this.iiGwOFFnr = obtainStyledAttributes.getFloat(index, this.iiGwOFFnr);
                    break;
                case 6:
                    this.GPLPRo6go = obtainStyledAttributes.getDimension(index, this.GPLPRo6go);
                    break;
                case 7:
                    this.Puu3Rhg4F = obtainStyledAttributes.getDimension(index, this.Puu3Rhg4F);
                    break;
                case 8:
                    this.oon79WMrY = obtainStyledAttributes.getDimension(index, this.oon79WMrY);
                    break;
                case 9:
                    this.vPSbyrYWX = obtainStyledAttributes.getDimension(index, this.vPSbyrYWX);
                    break;
                case 10:
                    this.CBQ5d1kRq = obtainStyledAttributes.getDimension(index, this.CBQ5d1kRq);
                    break;
                case 11:
                    this.kmSgne1rO = true;
                    this.Bhmn1KIah = obtainStyledAttributes.getDimension(index, this.Bhmn1KIah);
                    break;
                case 12:
                    int i2 = this.yWvV4ePLl;
                    int[] iArr = RG2GI7LDp.dIocxURUo;
                    int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    this.yWvV4ePLl = resourceId;
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
