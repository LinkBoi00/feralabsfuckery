package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public class VHBcLsri4 {
    public int[] q3BipwRCk = new int[10];
    public int[] J4Ux7ym32 = new int[10];
    public int tGV7Q6urW = 0;
    public int[] dIocxURUo = new int[10];
    public float[] kCA6Zs9sL = new float[10];
    public int iiGwOFFnr = 0;
    public int[] GPLPRo6go = new int[5];
    public String[] Puu3Rhg4F = new String[5];
    public int yWvV4ePLl = 0;
    public int[] oon79WMrY = new int[4];
    public boolean[] vPSbyrYWX = new boolean[4];
    public int CBQ5d1kRq = 0;

    public void J4Ux7ym32(int i, int i2) {
        int i3 = this.tGV7Q6urW;
        int[] iArr = this.q3BipwRCk;
        if (i3 >= iArr.length) {
            this.q3BipwRCk = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.J4Ux7ym32;
            this.J4Ux7ym32 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.q3BipwRCk;
        int i4 = this.tGV7Q6urW;
        iArr3[i4] = i;
        int[] iArr4 = this.J4Ux7ym32;
        this.tGV7Q6urW = i4 + 1;
        iArr4[i4] = i2;
    }

    public void dIocxURUo(int i, boolean z) {
        int i2 = this.CBQ5d1kRq;
        int[] iArr = this.oon79WMrY;
        if (i2 >= iArr.length) {
            this.oon79WMrY = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.vPSbyrYWX;
            this.vPSbyrYWX = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.oon79WMrY;
        int i3 = this.CBQ5d1kRq;
        iArr2[i3] = i;
        boolean[] zArr2 = this.vPSbyrYWX;
        this.CBQ5d1kRq = i3 + 1;
        zArr2[i3] = z;
    }

    public void q3BipwRCk(int i, float f) {
        int i2 = this.iiGwOFFnr;
        int[] iArr = this.dIocxURUo;
        if (i2 >= iArr.length) {
            this.dIocxURUo = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.kCA6Zs9sL;
            this.kCA6Zs9sL = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.dIocxURUo;
        int i3 = this.iiGwOFFnr;
        iArr2[i3] = i;
        float[] fArr2 = this.kCA6Zs9sL;
        this.iiGwOFFnr = i3 + 1;
        fArr2[i3] = f;
    }

    public void tGV7Q6urW(int i, String str) {
        int i2 = this.yWvV4ePLl;
        int[] iArr = this.GPLPRo6go;
        if (i2 >= iArr.length) {
            this.GPLPRo6go = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.Puu3Rhg4F;
            this.Puu3Rhg4F = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.GPLPRo6go;
        int i3 = this.yWvV4ePLl;
        iArr2[i3] = i;
        String[] strArr2 = this.Puu3Rhg4F;
        this.yWvV4ePLl = i3 + 1;
        strArr2[i3] = str;
    }
}
