package con;
/* loaded from: classes.dex */
public class lMYicAumF {
    public int J4Ux7ym32;
    public float dIocxURUo;
    public boolean iiGwOFFnr;
    public String kCA6Zs9sL;
    public String q3BipwRCk;
    public int tGV7Q6urW;

    public lMYicAumF(lMYicAumF lmyicaumf) {
        this.tGV7Q6urW = Integer.MIN_VALUE;
        this.dIocxURUo = Float.NaN;
        this.kCA6Zs9sL = null;
        this.q3BipwRCk = lmyicaumf.q3BipwRCk;
        this.J4Ux7ym32 = lmyicaumf.J4Ux7ym32;
        this.tGV7Q6urW = lmyicaumf.tGV7Q6urW;
        this.dIocxURUo = lmyicaumf.dIocxURUo;
        this.kCA6Zs9sL = lmyicaumf.kCA6Zs9sL;
        this.iiGwOFFnr = lmyicaumf.iiGwOFFnr;
    }

    public lMYicAumF(String str, int i, float f) {
        this.tGV7Q6urW = Integer.MIN_VALUE;
        this.dIocxURUo = Float.NaN;
        this.kCA6Zs9sL = null;
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = i;
        this.dIocxURUo = f;
    }

    public lMYicAumF(String str, int i, int i2) {
        this.tGV7Q6urW = Integer.MIN_VALUE;
        this.dIocxURUo = Float.NaN;
        this.kCA6Zs9sL = null;
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = i;
        if (i == 901) {
            this.dIocxURUo = (float) i2;
        } else {
            this.tGV7Q6urW = i2;
        }
    }

    public static String q3BipwRCk(int i) {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("00000000");
        q3BipwRCk.append(Integer.toHexString(i));
        String sb = q3BipwRCk.toString();
        StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("#");
        q3BipwRCk2.append(sb.substring(sb.length() - 8));
        return q3BipwRCk2.toString();
    }

    public String toString() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2 = this.q3BipwRCk + ':';
        switch (this.J4Ux7ym32) {
            case 900:
                sb = abGBwSu8x.q3BipwRCk(str2);
                sb.append(this.tGV7Q6urW);
                break;
            case 901:
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.dIocxURUo);
                sb = sb2;
                break;
            case 902:
                sb = abGBwSu8x.q3BipwRCk(str2);
                str = q3BipwRCk(this.tGV7Q6urW);
                sb.append(str);
                break;
            case 903:
                sb = abGBwSu8x.q3BipwRCk(str2);
                str = this.kCA6Zs9sL;
                sb.append(str);
                break;
            case 904:
                sb = abGBwSu8x.q3BipwRCk(str2);
                sb.append(Boolean.valueOf(this.iiGwOFFnr));
                break;
            case 905:
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.dIocxURUo);
                sb = sb2;
                break;
            default:
                sb = abGBwSu8x.q3BipwRCk(str2);
                str = "????";
                sb.append(str);
                break;
        }
        return sb.toString();
    }
}
