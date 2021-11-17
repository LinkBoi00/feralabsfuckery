package con;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class IOOiTD5XG {
    public int J4Ux7ym32;
    public final XmlPullParser q3BipwRCk;

    public IOOiTD5XG(XmlPullParser xmlPullParser, int i, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        this.q3BipwRCk = xmlPullParser;
        this.J4Ux7ym32 = i;
    }

    public final String J4Ux7ym32(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        dIocxURUo(typedArray.getChangingConfigurations());
        return string;
    }

    public final void dIocxURUo(int i) {
        this.J4Ux7ym32 = i | this.J4Ux7ym32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IOOiTD5XG)) {
            return false;
        }
        IOOiTD5XG iOOiTD5XG = (IOOiTD5XG) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, iOOiTD5XG.q3BipwRCk) && this.J4Ux7ym32 == iOOiTD5XG.J4Ux7ym32;
    }

    public int hashCode() {
        return Integer.hashCode(this.J4Ux7ym32) + (this.q3BipwRCk.hashCode() * 31);
    }

    public final QuZ1OlV57 q3BipwRCk(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        QuZ1OlV57 MzoOEjc4X = BBVaGLNaU.MzoOEjc4X(typedArray, this.q3BipwRCk, theme, str, i, i2);
        dIocxURUo(typedArray.getChangingConfigurations());
        return MzoOEjc4X;
    }

    public final TypedArray tGV7Q6urW(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray NyWTwPF6V = BBVaGLNaU.NyWTwPF6V(resources, theme, attributeSet, iArr);
        dIocxURUo(NyWTwPF6V.getChangingConfigurations());
        return NyWTwPF6V;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AndroidVectorParser(xmlParser=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", config=");
        return dbCvJyBoB.q3BipwRCk(q3BipwRCk, this.J4Ux7ym32, ')');
    }
}
