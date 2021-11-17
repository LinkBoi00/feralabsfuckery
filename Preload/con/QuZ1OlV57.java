package con;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class QuZ1OlV57 {
    public int J4Ux7ym32;
    public Object dIocxURUo;
    public final /* synthetic */ int q3BipwRCk;
    public Object tGV7Q6urW;

    public QuZ1OlV57() {
        this.q3BipwRCk = 0;
        this.tGV7Q6urW = new Object[4];
        this.dIocxURUo = new int[4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c1, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, float, java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static QuZ1OlV57 q3BipwRCk(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int next2;
        int i2;
        float f2;
        Shader shader;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            Objects.requireNonNull(name);
            if (name.equals("gradient")) {
                String name2 = xml.getName();
                if (name2.equals("gradient")) {
                    TypedArray NyWTwPF6V = BBVaGLNaU.NyWTwPF6V(resources, theme, asAttributeSet, enT8o71oS.dIocxURUo);
                    float f3 = !BBVaGLNaU.iMyQMM6Qj(xml, "startX") ? 0.0f : NyWTwPF6V.getFloat(8, 0.0f);
                    float f4 = !BBVaGLNaU.iMyQMM6Qj(xml, "startY") ? 0.0f : NyWTwPF6V.getFloat(9, 0.0f);
                    if (BBVaGLNaU.iMyQMM6Qj(xml, "endX")) {
                        NyWTwPF6V.getFloat(10, 0.0f);
                    }
                    if (BBVaGLNaU.iMyQMM6Qj(xml, "endY")) {
                        NyWTwPF6V.getFloat(11, 0.0f);
                    }
                    if (BBVaGLNaU.iMyQMM6Qj(xml, "centerX")) {
                        NyWTwPF6V.getFloat(3, 0.0f);
                    }
                    float f5 = !BBVaGLNaU.iMyQMM6Qj(xml, "centerY") ? 0.0f : NyWTwPF6V.getFloat(4, 0.0f);
                    int i3 = !BBVaGLNaU.iMyQMM6Qj(xml, "type") ? 0 : NyWTwPF6V.getInt(2, 0);
                    int color = !BBVaGLNaU.iMyQMM6Qj(xml, "startColor") ? 0 : NyWTwPF6V.getColor(0, 0);
                    boolean iMyQMM6Qj = BBVaGLNaU.iMyQMM6Qj(xml, "centerColor");
                    int color2 = !BBVaGLNaU.iMyQMM6Qj(xml, "centerColor") ? 0 : NyWTwPF6V.getColor(7, 0);
                    int color3 = !BBVaGLNaU.iMyQMM6Qj(xml, "endColor") ? 0 : NyWTwPF6V.getColor(1, 0);
                    int i4 = 0;
                    if (BBVaGLNaU.iMyQMM6Qj(xml, "tileMode")) {
                        i4 = NyWTwPF6V.getInt(6, 0);
                    }
                    if (!BBVaGLNaU.iMyQMM6Qj(xml, "gradientRadius")) {
                        f = f5;
                    } else {
                        f = f5;
                        NyWTwPF6V.getFloat(5, 0.0f);
                    }
                    NyWTwPF6V.recycle();
                    int depth = xml.getDepth() + 1;
                    ArrayList arrayList = new ArrayList(20);
                    ?? arrayList2 = new ArrayList(20);
                    while (true) {
                        next2 = xml.next();
                        i2 = 1;
                        if (next2 == 1) {
                            f2 = f4;
                            break;
                        }
                        i2 = xml.getDepth();
                        f2 = f4;
                        if (i2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && i2 <= depth && xml.getName().equals("item")) {
                            TypedArray NyWTwPF6V2 = BBVaGLNaU.NyWTwPF6V(resources, theme, asAttributeSet, enT8o71oS.kCA6Zs9sL);
                            boolean hasValue = NyWTwPF6V2.hasValue(0);
                            boolean hasValue2 = NyWTwPF6V2.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color4 = NyWTwPF6V2.getColor(0, 0);
                            i2 = 0;
                            float f6 = NyWTwPF6V2.getFloat(1, 0.0f);
                            NyWTwPF6V2.recycle();
                            arrayList2.add(Integer.valueOf(color4));
                            arrayList.add(Float.valueOf(f6));
                        }
                        f4 = f2;
                    }
                    PlegqbMSA plegqbMSA = arrayList2.size() > 0 ? new PlegqbMSA((List) arrayList2, arrayList) : null;
                    if (plegqbMSA == null) {
                        plegqbMSA = iMyQMM6Qj ? new PlegqbMSA(color, color2, color3) : new PlegqbMSA(color, color3);
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            shader = new LinearGradient(f3, f2, (float) i2, (float) arrayList2, (int[]) plegqbMSA.CBQ5d1kRq, (float[]) plegqbMSA.kmSgne1rO, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
                        } else {
                            shader = new SweepGradient((float) i4, f, (int[]) plegqbMSA.CBQ5d1kRq, (float[]) plegqbMSA.kmSgne1rO);
                        }
                    } else if (next2 > 0.0f) {
                        shader = new RadialGradient((float) i4, f, (float) next2, (int[]) plegqbMSA.CBQ5d1kRq, (float[]) plegqbMSA.kmSgne1rO, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
                    } else {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                    return new QuZ1OlV57(shader, null, 0);
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
            } else if (name.equals("selector")) {
                ColorStateList J4Ux7ym32 = Y2wL5J6bI.J4Ux7ym32(resources, xml, asAttributeSet, theme);
                return new QuZ1OlV57(null, J4Ux7ym32, J4Ux7ym32.getDefaultColor());
            } else {
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
        } else {
            throw new XmlPullParserException("No start tag found");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r7 = -r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int J4Ux7ym32(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        switch (this.q3BipwRCk) {
            case 0:
                int i5 = this.J4Ux7ym32 - 1;
                int identityHashCode = System.identityHashCode(obj);
                while (i4 <= i5) {
                    int i6 = (i4 + i5) >>> 1;
                    Object obj2 = ((Object[]) this.tGV7Q6urW)[i6];
                    int identityHashCode2 = System.identityHashCode(obj2) - identityHashCode;
                    if (identityHashCode2 < 0) {
                        i4 = i6 + 1;
                    } else if (identityHashCode2 > 0) {
                        i5 = i6 - 1;
                    } else if (obj2 == obj) {
                        return i6;
                    } else {
                        switch (this.q3BipwRCk) {
                            case 0:
                                i3 = i6 - 1;
                                if (i3 >= 0) {
                                    while (true) {
                                        int i7 = i3 - 1;
                                        Object obj3 = ((Object[]) this.tGV7Q6urW)[i3];
                                        if (obj3 == obj) {
                                            break;
                                        } else if (System.identityHashCode(obj3) == identityHashCode && i7 >= 0) {
                                            i3 = i7;
                                        }
                                    }
                                }
                                int i8 = i6 + 1;
                                int i9 = this.J4Ux7ym32;
                                if (i8 < i9) {
                                    while (true) {
                                        i2 = i8 + 1;
                                        Object obj4 = ((Object[]) this.tGV7Q6urW)[i8];
                                        if (obj4 == obj) {
                                            return i8;
                                        }
                                        if (System.identityHashCode(obj4) != identityHashCode) {
                                            break;
                                        } else if (i2 < i9) {
                                            i8 = i2;
                                        }
                                    }
                                }
                                i = this.J4Ux7ym32;
                                int i10 = -(i + 1);
                                return i10;
                            default:
                                i3 = i6 - 1;
                                if (i3 >= 0) {
                                    while (true) {
                                        int i11 = i3 - 1;
                                        Object obj5 = ((Object[]) this.tGV7Q6urW)[i3];
                                        if (obj5 == obj) {
                                            break;
                                        } else if (System.identityHashCode(obj5) == identityHashCode && i11 >= 0) {
                                            i3 = i11;
                                        }
                                    }
                                }
                                int i12 = i6 + 1;
                                int i13 = this.J4Ux7ym32;
                                if (i12 < i13) {
                                    while (true) {
                                        i2 = i12 + 1;
                                        Object obj6 = ((Object[]) this.tGV7Q6urW)[i12];
                                        if (obj6 == obj) {
                                            return i12;
                                        }
                                        if (System.identityHashCode(obj6) != identityHashCode) {
                                            break;
                                        } else if (i2 < i13) {
                                            i12 = i2;
                                        }
                                    }
                                }
                                i = this.J4Ux7ym32;
                                int i102 = -(i + 1);
                                return i102;
                        }
                        return i3;
                    }
                }
                return -(i4 + 1);
            default:
                int identityHashCode3 = System.identityHashCode(obj);
                int i14 = this.J4Ux7ym32 - 1;
                while (i4 <= i14) {
                    int i15 = (i4 + i14) >>> 1;
                    Object obj7 = ((Object[]) this.tGV7Q6urW)[i15];
                    int identityHashCode4 = System.identityHashCode(obj7) - identityHashCode3;
                    if (identityHashCode4 < 0) {
                        i4 = i15 + 1;
                    } else if (identityHashCode4 <= 0) {
                        return obj == obj7 ? i15 : tGV7Q6urW(i15, obj, identityHashCode3);
                    } else {
                        i14 = i15 - 1;
                    }
                }
                return -(i4 + 1);
        }
    }

    public boolean dIocxURUo() {
        return ((Shader) this.tGV7Q6urW) != null;
    }

    public boolean iiGwOFFnr() {
        return dIocxURUo() || this.J4Ux7ym32 != 0;
    }

    public void kCA6Zs9sL(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = false;
        switch (this.q3BipwRCk) {
            case 0:
                int i5 = this.J4Ux7ym32 - 1;
                int identityHashCode = System.identityHashCode(obj);
                int i6 = 0;
                while (true) {
                    if (i6 > i5) {
                        i = -(i6 + 1);
                        break;
                    } else {
                        i = (i6 + i5) >>> 1;
                        Object obj3 = ((Object[]) this.tGV7Q6urW)[i];
                        int identityHashCode2 = System.identityHashCode(obj3) - identityHashCode;
                        if (identityHashCode2 >= 0) {
                            if (identityHashCode2 <= 0) {
                                if (obj3 != obj) {
                                    switch (this.q3BipwRCk) {
                                        case 0:
                                            i2 = i - 1;
                                            if (i2 >= 0) {
                                                while (true) {
                                                    int i7 = i2 - 1;
                                                    Object obj4 = ((Object[]) this.tGV7Q6urW)[i2];
                                                    if (obj4 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj4) == identityHashCode && i7 >= 0) {
                                                        i2 = i7;
                                                    }
                                                }
                                            }
                                            i++;
                                            int i8 = this.J4Ux7ym32;
                                            if (i < i8) {
                                                while (true) {
                                                    i3 = i + 1;
                                                    Object obj5 = ((Object[]) this.tGV7Q6urW)[i];
                                                    if (obj5 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj5) != identityHashCode) {
                                                        break;
                                                    } else if (i3 < i8) {
                                                        i = i3;
                                                    }
                                                }
                                            }
                                            i4 = this.J4Ux7ym32;
                                            i2 = -(i4 + 1);
                                            break;
                                        default:
                                            i2 = i - 1;
                                            if (i2 >= 0) {
                                                while (true) {
                                                    int i9 = i2 - 1;
                                                    Object obj6 = ((Object[]) this.tGV7Q6urW)[i2];
                                                    if (obj6 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj6) == identityHashCode && i9 >= 0) {
                                                        i2 = i9;
                                                    }
                                                }
                                            }
                                            i++;
                                            int i10 = this.J4Ux7ym32;
                                            if (i < i10) {
                                                while (true) {
                                                    i3 = i + 1;
                                                    Object obj7 = ((Object[]) this.tGV7Q6urW)[i];
                                                    if (obj7 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj7) != identityHashCode) {
                                                        break;
                                                    } else if (i3 < i10) {
                                                        i = i3;
                                                    }
                                                }
                                            }
                                            i4 = this.J4Ux7ym32;
                                            i2 = -(i4 + 1);
                                            break;
                                    }
                                }
                            } else {
                                i5 = i - 1;
                            }
                        } else {
                            i6 = i + 1;
                        }
                    }
                }
                break;
            default:
                int identityHashCode3 = System.identityHashCode(obj);
                int i11 = this.J4Ux7ym32 - 1;
                int i12 = 0;
                while (i12 <= i11) {
                    i = (i12 + i11) >>> 1;
                    Object obj8 = ((Object[]) this.tGV7Q6urW)[i];
                    int identityHashCode4 = System.identityHashCode(obj8) - identityHashCode3;
                    if (identityHashCode4 >= 0) {
                        if (identityHashCode4 <= 0) {
                            if (obj != obj8) {
                                i2 = tGV7Q6urW(i, obj, identityHashCode3);
                                i = i2;
                                break;
                            }
                        } else {
                            i11 = i - 1;
                        }
                    } else {
                        i12 = i + 1;
                    }
                }
                i3 = i12 + 1;
                i2 = -i3;
                i = i2;
                break;
        }
        if (i >= 0) {
            ((Object[]) this.dIocxURUo)[i] = obj2;
            return;
        }
        int i13 = -(i + 1);
        int i14 = this.J4Ux7ym32;
        Object[] objArr = (Object[]) this.tGV7Q6urW;
        if (i14 == objArr.length) {
            z = true;
        }
        Object[] objArr2 = z ? new Object[i14 * 2] : objArr;
        int i15 = i13 + 1;
        System.arraycopy(objArr, i13, objArr2, i15, i14 - i13);
        if (z) {
            Jefa2ExbR.AqaWJg0b4((Object[]) this.tGV7Q6urW, objArr2, 0, 0, i13, 6);
        }
        objArr2[i13] = obj;
        this.tGV7Q6urW = objArr2;
        Object[] objArr3 = z ? new Object[this.J4Ux7ym32 * 2] : (Object[]) this.dIocxURUo;
        System.arraycopy((Object[]) this.dIocxURUo, i13, objArr3, i15, this.J4Ux7ym32 - i13);
        if (z) {
            Jefa2ExbR.AqaWJg0b4((Object[]) this.dIocxURUo, objArr3, 0, 0, i13, 6);
        }
        objArr3[i13] = obj2;
        this.dIocxURUo = objArr3;
        this.J4Ux7ym32++;
    }

    public int tGV7Q6urW(int i, Object obj, int i2) {
        switch (this.q3BipwRCk) {
            case 0:
                int i3 = i - 1;
                if (i3 >= 0) {
                    while (true) {
                        int i4 = i3 - 1;
                        Object obj2 = ((Object[]) this.tGV7Q6urW)[i3];
                        if (obj2 == obj) {
                            return i3;
                        }
                        if (System.identityHashCode(obj2) == i2 && i4 >= 0) {
                            i3 = i4;
                        }
                    }
                }
                int i5 = i + 1;
                int i6 = this.J4Ux7ym32;
                if (i5 < i6) {
                    while (true) {
                        int i7 = i5 + 1;
                        Object obj3 = ((Object[]) this.tGV7Q6urW)[i5];
                        if (obj3 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj3) != i2) {
                            return -i7;
                        }
                        if (i7 < i6) {
                            i5 = i7;
                        }
                    }
                }
                return -(this.J4Ux7ym32 + 1);
            default:
                int i8 = i - 1;
                if (i8 >= 0) {
                    while (true) {
                        int i9 = i8 - 1;
                        Object obj4 = ((Object[]) this.tGV7Q6urW)[i8];
                        if (obj4 == obj) {
                            return i8;
                        }
                        if (System.identityHashCode(obj4) == i2 && i9 >= 0) {
                            i8 = i9;
                        }
                    }
                }
                int i10 = i + 1;
                int i11 = this.J4Ux7ym32;
                if (i10 < i11) {
                    while (true) {
                        int i12 = i10 + 1;
                        Object obj5 = ((Object[]) this.tGV7Q6urW)[i10];
                        if (obj5 == obj) {
                            return i10;
                        }
                        if (System.identityHashCode(obj5) != i2) {
                            return -i12;
                        }
                        if (i12 < i11) {
                            i10 = i12;
                        }
                    }
                }
                return -(this.J4Ux7ym32 + 1);
        }
    }

    public QuZ1OlV57(int i) {
        this.q3BipwRCk = 1;
        this.tGV7Q6urW = new Object[i];
        this.dIocxURUo = new Object[i];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuZ1OlV57(int i, int i2) {
        this((i2 & 1) != 0 ? 16 : i);
        this.q3BipwRCk = 1;
    }

    public QuZ1OlV57(Shader shader, ColorStateList colorStateList, int i) {
        this.q3BipwRCk = 2;
        this.tGV7Q6urW = shader;
        this.dIocxURUo = colorStateList;
        this.J4Ux7ym32 = i;
    }
}
