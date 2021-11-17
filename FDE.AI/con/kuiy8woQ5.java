package con;
/* loaded from: classes.dex */
public final class kuiy8woQ5 {
    public float GPLPRo6go;
    public final int J4Ux7ym32;
    public int dIocxURUo;
    public float iiGwOFFnr;
    public int kCA6Zs9sL;
    public final IosOyUQuh q3BipwRCk;
    public final int tGV7Q6urW;

    public kuiy8woQ5(IosOyUQuh iosOyUQuh, int i, int i2, int i3, int i4, float f, float f2) {
        this.q3BipwRCk = iosOyUQuh;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = i3;
        this.kCA6Zs9sL = i4;
        this.iiGwOFFnr = f;
        this.GPLPRo6go = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuiy8woQ5)) {
            return false;
        }
        kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, kuiy8woq5.q3BipwRCk) && this.J4Ux7ym32 == kuiy8woq5.J4Ux7ym32 && this.tGV7Q6urW == kuiy8woq5.tGV7Q6urW && this.dIocxURUo == kuiy8woq5.dIocxURUo && this.kCA6Zs9sL == kuiy8woq5.kCA6Zs9sL && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.iiGwOFFnr), Float.valueOf(kuiy8woq5.iiGwOFFnr)) && anXlDk6fV.tGV7Q6urW(Float.valueOf(this.GPLPRo6go), Float.valueOf(kuiy8woq5.GPLPRo6go));
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.J4Ux7ym32);
        int hashCode2 = Integer.hashCode(this.tGV7Q6urW);
        int hashCode3 = Integer.hashCode(this.dIocxURUo);
        int hashCode4 = Integer.hashCode(this.kCA6Zs9sL);
        return Float.hashCode(this.GPLPRo6go) + gXNsYvZus.q3BipwRCk(this.iiGwOFFnr, (hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.q3BipwRCk.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ParagraphInfo(paragraph=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", startIndex=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(", endIndex=");
        q3BipwRCk.append(this.tGV7Q6urW);
        q3BipwRCk.append(", startLineIndex=");
        q3BipwRCk.append(this.dIocxURUo);
        q3BipwRCk.append(", endLineIndex=");
        q3BipwRCk.append(this.kCA6Zs9sL);
        q3BipwRCk.append(", top=");
        q3BipwRCk.append(this.iiGwOFFnr);
        q3BipwRCk.append(", bottom=");
        return eFKDR5jVr.q3BipwRCk(q3BipwRCk, this.GPLPRo6go, ')');
    }
}
