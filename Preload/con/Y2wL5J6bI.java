package con;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.feravolt.preload.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class Y2wL5J6bI {
    public static final ThreadLocal q3BipwRCk = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static ColorStateList J4Ux7ym32(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int i;
        float f;
        int attributeCount;
        boolean z;
        int[][] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int[][] iArr3;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i4;
        int i5;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            ?? r4 = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr4 = new int[20];
            int[] iArr5 = new int[20];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                } else if (next != 2 || depth > depth2 || !xmlPullParser.getName().equals("item")) {
                    i7 = 0;
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    depth2 = depth2;
                } else {
                    int[] iArr6 = enT8o71oS.q3BipwRCk;
                    TypedArray obtainAttributes = theme2 == null ? resources2.obtainAttributes(attributeSet2, iArr6) : theme2.obtainStyledAttributes(attributeSet2, iArr6, i7, i7);
                    int resourceId = obtainAttributes.getResourceId(i7, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = q3BipwRCk;
                        TypedValue typedValue = (TypedValue) threadLocal.get();
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        }
                        resources2.getValue(resourceId, typedValue, r4);
                        int i8 = typedValue.type;
                        if (i8 < 28 || i8 > 31) {
                            i4 = i7;
                        } else {
                            int i9 = r4 == true ? 1 : 0;
                            ?? r42 = r4 == true ? 1 : 0;
                            ?? r43 = r4 == true ? 1 : 0;
                            ?? r44 = r4 == true ? 1 : 0;
                            ?? r45 = r4 == true ? 1 : 0;
                            ?? r46 = r4 == true ? 1 : 0;
                            i4 = i9;
                        }
                        if (i4 == 0) {
                            try {
                                i = q3BipwRCk(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                            }
                            i5 = r4 == true ? 1 : 0;
                            int i10 = r4 == true ? 1 : 0;
                            int i11 = r4 == true ? 1 : 0;
                            int i12 = r4 == true ? 1 : 0;
                            int i13 = r4 == true ? 1 : 0;
                            int i14 = r4 == true ? 1 : 0;
                            f = 1.0f;
                            if (!obtainAttributes.hasValue(i5)) {
                                f = obtainAttributes.getFloat(r4, 1.0f);
                            } else if (obtainAttributes.hasValue(3)) {
                                f = obtainAttributes.getFloat(3, 1.0f);
                            }
                            float f7 = (SacA58h0y.q3BipwRCk() || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                            obtainAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr7 = new int[attributeCount];
                            int i15 = i7;
                            while (i7 < attributeCount) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i7);
                                if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha || attributeNameResource == R.attr.lStar)) {
                                    i15++;
                                    if (!attributeSet2.getAttributeBooleanValue(i7, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr7[i15] = attributeNameResource;
                                }
                                i7++;
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr7, i15);
                            float f8 = 0.0f;
                            z = f7 < 0.0f && f7 <= 100.0f;
                            if (f == 1.0f || z) {
                                int GPLPRo6go = BBVaGLNaU.GPLPRo6go((int) ((((float) Color.alpha(i)) * f) + 0.5f), 0, 255);
                                if (!z) {
                                    ouG65LT98 q3BipwRCk2 = ouG65LT98.q3BipwRCk(i);
                                    float f9 = q3BipwRCk2.q3BipwRCk;
                                    float f10 = q3BipwRCk2.J4Ux7ym32;
                                    fMlcMUIts fmlcmuits = fMlcMUIts.vPSbyrYWX;
                                    if (((double) f10) < 1.0d || ((double) Math.round(f7)) <= 0.0d || ((double) Math.round(f7)) >= 100.0d) {
                                        i2 = depth2;
                                        iArr2 = iArr5;
                                        iArr = iArr4;
                                        z2 = true;
                                    } else {
                                        float min = f9 < 0.0f ? 0.0f : Math.min(360.0f, f9);
                                        ouG65LT98 oug65lt98 = null;
                                        boolean z3 = true;
                                        float f11 = f10;
                                        float f12 = 100.0f;
                                        float f13 = f11;
                                        float f14 = 0.0f;
                                        while (true) {
                                            if (Math.abs(f8 - f13) >= 0.4f) {
                                                float f15 = 1000.0f;
                                                ouG65LT98 oug65lt982 = null;
                                                float f16 = f12;
                                                float f17 = f14;
                                                float f18 = 1000.0f;
                                                while (true) {
                                                    i2 = depth2;
                                                    if (Math.abs(f14 - f16) <= 0.01f) {
                                                        iArr2 = iArr5;
                                                        iArr = iArr4;
                                                        f2 = min;
                                                        f3 = f11;
                                                        z2 = true;
                                                        break;
                                                    }
                                                    float q3BipwRCk3 = ML8zUvnYf.q3BipwRCk(f16, f14, 2.0f, f14);
                                                    int tGV7Q6urW = ouG65LT98.J4Ux7ym32(q3BipwRCk3, f11, min).tGV7Q6urW(fMlcMUIts.vPSbyrYWX);
                                                    float J4Ux7ym32 = kvUEpi7f7.J4Ux7ym32(Color.red(tGV7Q6urW));
                                                    float J4Ux7ym322 = kvUEpi7f7.J4Ux7ym32(Color.green(tGV7Q6urW));
                                                    float J4Ux7ym323 = kvUEpi7f7.J4Ux7ym32(Color.blue(tGV7Q6urW));
                                                    float[][] fArr = kvUEpi7f7.dIocxURUo;
                                                    z2 = true;
                                                    float f19 = ((J4Ux7ym323 * fArr[1][2]) + ((J4Ux7ym322 * fArr[1][1]) + (J4Ux7ym32 * fArr[1][0]))) / 100.0f;
                                                    if (f19 <= 0.008856452f) {
                                                        f5 = f19 * 903.2963f;
                                                        f3 = f11;
                                                        f4 = q3BipwRCk3;
                                                    } else {
                                                        f3 = f11;
                                                        f4 = q3BipwRCk3;
                                                        f5 = (((float) Math.cbrt((double) f19)) * 116.0f) - 16.0f;
                                                    }
                                                    float abs = Math.abs(f7 - f5);
                                                    if (abs < 0.2f) {
                                                        ouG65LT98 q3BipwRCk4 = ouG65LT98.q3BipwRCk(tGV7Q6urW);
                                                        f6 = f14;
                                                        ouG65LT98 J4Ux7ym324 = ouG65LT98.J4Ux7ym32(q3BipwRCk4.tGV7Q6urW, q3BipwRCk4.J4Ux7ym32, min);
                                                        f2 = min;
                                                        float f20 = q3BipwRCk4.dIocxURUo - J4Ux7ym324.dIocxURUo;
                                                        float f21 = q3BipwRCk4.kCA6Zs9sL - J4Ux7ym324.kCA6Zs9sL;
                                                        float f22 = q3BipwRCk4.iiGwOFFnr - J4Ux7ym324.iiGwOFFnr;
                                                        iArr2 = iArr5;
                                                        iArr = iArr4;
                                                        float pow = (float) (Math.pow(Math.sqrt((double) ((f22 * f22) + (f21 * f21) + (f20 * f20))), 0.63d) * 1.41d);
                                                        if (pow <= 1.0f) {
                                                            oug65lt982 = q3BipwRCk4;
                                                            f18 = pow;
                                                            f15 = abs;
                                                        }
                                                    } else {
                                                        iArr2 = iArr5;
                                                        iArr = iArr4;
                                                        f6 = f14;
                                                        f2 = min;
                                                    }
                                                    f17 = 0.0f;
                                                    if (f15 == 0.0f && f18 == 0.0f) {
                                                        break;
                                                    }
                                                    if (f5 < f7) {
                                                        f16 = f16;
                                                        f14 = f4;
                                                    } else {
                                                        f16 = f4;
                                                        f14 = f6;
                                                    }
                                                    depth2 = i2;
                                                    f11 = f3;
                                                    min = f2;
                                                    iArr5 = iArr2;
                                                    iArr4 = iArr;
                                                }
                                                f14 = f17;
                                                if (!z3) {
                                                    if (oug65lt982 == null) {
                                                        f13 = f3;
                                                    } else {
                                                        oug65lt98 = oug65lt982;
                                                        f8 = f3;
                                                    }
                                                    f11 = ML8zUvnYf.q3BipwRCk(f13, f8, 2.0f, f8);
                                                    f12 = 100.0f;
                                                } else if (oug65lt982 != null) {
                                                    i = oug65lt982.tGV7Q6urW(fmlcmuits);
                                                    break;
                                                } else {
                                                    f11 = ML8zUvnYf.q3BipwRCk(f13, f8, 2.0f, f8);
                                                    f12 = 100.0f;
                                                    z3 = false;
                                                }
                                                depth2 = i2;
                                                min = f2;
                                                iArr5 = iArr2;
                                                iArr4 = iArr;
                                            } else {
                                                i2 = depth2;
                                                iArr2 = iArr5;
                                                iArr = iArr4;
                                                z2 = true;
                                                if (oug65lt98 != null) {
                                                    i = oug65lt98.tGV7Q6urW(fmlcmuits);
                                                }
                                            }
                                        }
                                    }
                                    i = kvUEpi7f7.q3BipwRCk(f7);
                                } else {
                                    i2 = depth2;
                                    iArr2 = iArr5;
                                    iArr = iArr4;
                                    z2 = true;
                                }
                                i = (16777215 & i) | (GPLPRo6go << 24);
                                r4 = z2;
                            } else {
                                r4 = 1;
                                i2 = depth2;
                                iArr2 = iArr5;
                                iArr = iArr4;
                            }
                            i3 = i6 + 1;
                            iArr5 = iArr2;
                            int i16 = 8;
                            if (i3 > iArr5.length) {
                                int[] iArr8 = new int[i6 <= 4 ? 8 : i6 * 2];
                                System.arraycopy(iArr5, 0, iArr8, 0, i6);
                                iArr5 = iArr8;
                            }
                            iArr5[i6] = i;
                            iArr3 = iArr;
                            if (i3 > iArr3.length) {
                                Class<?> componentType = iArr3.getClass().getComponentType();
                                if (i6 > 4) {
                                    i16 = i6 * 2;
                                }
                                ?? r2 = (Object[]) Array.newInstance(componentType, i16);
                                System.arraycopy(iArr3, 0, r2, 0, i6);
                                iArr3 = r2;
                            }
                            iArr3[i6] = trimStateSet;
                            iArr4 = iArr3;
                            i7 = 0;
                            resources2 = resources;
                            theme2 = theme;
                            i6 = i3;
                            depth2 = i2;
                            attributeSet2 = attributeSet;
                        }
                    }
                    i = obtainAttributes.getColor(i7, -65281);
                    i5 = r4 == true ? 1 : 0;
                    int i102 = r4 == true ? 1 : 0;
                    int i112 = r4 == true ? 1 : 0;
                    int i122 = r4 == true ? 1 : 0;
                    int i132 = r4 == true ? 1 : 0;
                    int i142 = r4 == true ? 1 : 0;
                    f = 1.0f;
                    if (!obtainAttributes.hasValue(i5)) {
                    }
                    if (SacA58h0y.q3BipwRCk()) {
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr72 = new int[attributeCount];
                    int i152 = i7;
                    while (i7 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr72, i152);
                    float f82 = 0.0f;
                    if (f7 < 0.0f) {
                    }
                    if (f == 1.0f) {
                    }
                    int GPLPRo6go2 = BBVaGLNaU.GPLPRo6go((int) ((((float) Color.alpha(i)) * f) + 0.5f), 0, 255);
                    if (!z) {
                    }
                    i = (16777215 & i) | (GPLPRo6go2 << 24);
                    r4 = z2;
                    i3 = i6 + 1;
                    iArr5 = iArr2;
                    int i162 = 8;
                    if (i3 > iArr5.length) {
                    }
                    iArr5[i6] = i;
                    iArr3 = iArr;
                    if (i3 > iArr3.length) {
                    }
                    iArr3[i6] = trimStateSet2;
                    iArr4 = iArr3;
                    i7 = 0;
                    resources2 = resources;
                    theme2 = theme;
                    i6 = i3;
                    depth2 = i2;
                    attributeSet2 = attributeSet;
                }
            }
            int[] iArr9 = new int[i6];
            int[][] iArr10 = new int[i6];
            System.arraycopy(iArr5, 0, iArr9, 0, i6);
            System.arraycopy(iArr4, 0, iArr10, 0, i6);
            return new ColorStateList(iArr10, iArr9);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static ColorStateList q3BipwRCk(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return J4Ux7ym32(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
