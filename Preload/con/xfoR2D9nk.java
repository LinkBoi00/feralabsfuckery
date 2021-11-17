package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.RG2GI7LDp;
/* loaded from: classes.dex */
public class xfoR2D9nk {
    public static SparseIntArray PSTqBLTET;
    public boolean q3BipwRCk = false;
    public int J4Ux7ym32 = -1;
    public int tGV7Q6urW = 0;
    public String dIocxURUo = null;
    public int kCA6Zs9sL = -1;
    public int iiGwOFFnr = 0;
    public float GPLPRo6go = Float.NaN;
    public int Puu3Rhg4F = -1;
    public float yWvV4ePLl = Float.NaN;
    public float oon79WMrY = Float.NaN;
    public int vPSbyrYWX = -1;
    public String CBQ5d1kRq = null;
    public int kmSgne1rO = -3;
    public int Bhmn1KIah = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        PSTqBLTET = sparseIntArray;
        sparseIntArray.append(3, 1);
        PSTqBLTET.append(5, 2);
        PSTqBLTET.append(9, 3);
        PSTqBLTET.append(2, 4);
        PSTqBLTET.append(1, 5);
        PSTqBLTET.append(0, 6);
        PSTqBLTET.append(4, 7);
        PSTqBLTET.append(8, 8);
        PSTqBLTET.append(7, 9);
        PSTqBLTET.append(6, 10);
    }

    public void q3BipwRCk(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EssXmp5ks.iiGwOFFnr);
        this.q3BipwRCk = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (PSTqBLTET.get(index)) {
                case 1:
                    this.yWvV4ePLl = obtainStyledAttributes.getFloat(index, this.yWvV4ePLl);
                    break;
                case 2:
                    this.kCA6Zs9sL = obtainStyledAttributes.getInt(index, this.kCA6Zs9sL);
                    break;
                case 3:
                    this.dIocxURUo = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : FDHceZ60i.q3BipwRCk[obtainStyledAttributes.getInteger(index, 0)];
                    break;
                case 4:
                    this.iiGwOFFnr = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    int i2 = this.J4Ux7ym32;
                    int[] iArr = RG2GI7LDp.dIocxURUo;
                    int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    this.J4Ux7ym32 = resourceId;
                    break;
                case 6:
                    this.tGV7Q6urW = obtainStyledAttributes.getInteger(index, this.tGV7Q6urW);
                    break;
                case 7:
                    this.GPLPRo6go = obtainStyledAttributes.getFloat(index, this.GPLPRo6go);
                    break;
                case 8:
                    this.vPSbyrYWX = obtainStyledAttributes.getInteger(index, this.vPSbyrYWX);
                    break;
                case 9:
                    this.oon79WMrY = obtainStyledAttributes.getFloat(index, this.oon79WMrY);
                    break;
                case 10:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                        this.Bhmn1KIah = resourceId2;
                        if (resourceId2 == -1) {
                            break;
                        }
                        this.kmSgne1rO = -2;
                        break;
                    } else if (i3 != 3) {
                        this.kmSgne1rO = obtainStyledAttributes.getInteger(index, this.Bhmn1KIah);
                        break;
                    } else {
                        String string = obtainStyledAttributes.getString(index);
                        this.CBQ5d1kRq = string;
                        if (string.indexOf("/") <= 0) {
                            this.kmSgne1rO = -1;
                            break;
                        } else {
                            this.Bhmn1KIah = obtainStyledAttributes.getResourceId(index, -1);
                            this.kmSgne1rO = -2;
                        }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
