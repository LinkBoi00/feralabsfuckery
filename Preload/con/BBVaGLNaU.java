package con;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityNodeInfo;
import con.IqwHQ6O2l;
import con.k007RzV1x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class BBVaGLNaU {
    public static final long AqaWJg0b4(long j, long j2, float f) {
        if (CpG0imbht(j) || CpG0imbht(j2)) {
            return ((QnjhYJNrZ) nlGCs0NZs(new QnjhYJNrZ(j), new QnjhYJNrZ(j2), f)).q3BipwRCk;
        }
        if (!(!CpG0imbht(j) && !CpG0imbht(j2))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        } else if (fzM0nB5KM.q3BipwRCk(QnjhYJNrZ.J4Ux7ym32(j), QnjhYJNrZ.J4Ux7ym32(j2))) {
            return vNtjxmzUM(1095216660480L & j, qFBXIgpia(QnjhYJNrZ.tGV7Q6urW(j), QnjhYJNrZ.tGV7Q6urW(j2), f));
        } else {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Cannot perform operation for ");
            q3BipwRCk.append((Object) fzM0nB5KM.J4Ux7ym32(QnjhYJNrZ.J4Ux7ym32(j)));
            q3BipwRCk.append(" and ");
            q3BipwRCk.append((Object) fzM0nB5KM.J4Ux7ym32(QnjhYJNrZ.J4Ux7ym32(j2)));
            throw new IllegalArgumentException(q3BipwRCk.toString().toString());
        }
    }

    public static boolean Bhmn1KIah(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static final List CBQ5d1kRq(pLYbCSTk0 plybcstk0, List list) {
        pnuAOe8oh vPSbyrYWX = plybcstk0.vPSbyrYWX();
        int i = vPSbyrYWX.Bhmn1KIah;
        if (i <= 0) {
            return list;
        }
        int i2 = 0;
        Object[] objArr = vPSbyrYWX.CBQ5d1kRq;
        do {
            pLYbCSTk0 plybcstk02 = (pLYbCSTk0) objArr[i2];
            mhjbbkjEL dXrmkklc8 = dXrmkklc8(plybcstk02);
            if (dXrmkklc8 != null) {
                list.add(dXrmkklc8);
            } else {
                CBQ5d1kRq(plybcstk02, list);
            }
            i2++;
        } while (i2 < i);
        return list;
    }

    public static final boolean CpG0imbht(long j) {
        rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
        return (j & 1095216660480L) == 0;
    }

    public static final mhjbbkjEL Eeka1udhb(pLYbCSTk0 plybcstk0) {
        for (qhaZGYFO8 qhazgyfo8 = plybcstk0.V9LQMKGJe.ilHKhw3Yw; qhazgyfo8 != null; qhazgyfo8 = qhazgyfo8.IG30YE5GU()) {
            if (qhazgyfo8 instanceof mhjbbkjEL) {
                mhjbbkjEL mhjbbkjel = (mhjbbkjEL) qhazgyfo8;
                if (((CBcUvsHpG) ((GobDDNrsi) mhjbbkjel.NyWTwPF6V)).kmSgne1rO.kmSgne1rO) {
                    return mhjbbkjel;
                }
            }
        }
        return null;
    }

    public static int GPLPRo6go(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final boolean IytU16YUK(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
        fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
        fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
        fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
        fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
        float f32 = -f13;
        fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
        fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
        fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
        fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
        fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
        fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
        fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
        fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
        fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
        fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        return true;
    }

    public static final long J4Ux7ym32(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = ehZ1k9jWq.J4Ux7ym32;
        return floatToIntBits2;
    }

    public static QuZ1OlV57 MzoOEjc4X(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        QuZ1OlV57 quZ1OlV57;
        if (iMyQMM6Qj(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new QuZ1OlV57(null, null, typedValue.data);
            }
            try {
                quZ1OlV57 = QuZ1OlV57.q3BipwRCk(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                quZ1OlV57 = null;
            }
            if (quZ1OlV57 != null) {
                return quZ1OlV57;
            }
        }
        return new QuZ1OlV57(null, null, i2);
    }

    public static TypedArray NyWTwPF6V(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ColorStateList PSTqBLTET(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!iMyQMM6Qj(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 >= 28 && i2 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        } else {
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(i, 0);
            ThreadLocal threadLocal = Y2wL5J6bI.q3BipwRCk;
            try {
                return Y2wL5J6bI.q3BipwRCk(resources, resources.getXml(resourceId), theme);
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
    }

    public static boolean Puu3Rhg4F(File file, Resources resources, int i) {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean yWvV4ePLl = yWvV4ePLl(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return yWvV4ePLl;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static final long QNqj6nIzv(long j, long j2) {
        float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(j);
        long j3 = ehZ1k9jWq.q3BipwRCk;
        boolean z = true;
        if (j2 != j3) {
            float intBitsToFloat = kCA6Zs9sL * Float.intBitsToFloat((int) (j2 >> 32));
            float tGV7Q6urW = tbzY8QG6X.tGV7Q6urW(j);
            if (j2 == j3) {
                z = false;
            }
            if (z) {
                return gThLCaTO1.J4Ux7ym32(intBitsToFloat, tGV7Q6urW * Float.intBitsToFloat((int) (j2 & 4294967295L)));
            }
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static int RG6kpfv3v(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static final void V9LQMKGJe(or5nbo9ku or5nbo9ku, IqwHQ6O2l iqwHQ6O2l) {
        ogG45sslV iiGwOFFnr = or5nbo9ku.iiGwOFFnr();
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        K6PL0z3I0.q3BipwRCk(xP6F5SR9v.Bhmn1KIah(iiGwOFFnr, VSVuhz7Ow.Puu3Rhg4F));
        or5nbo9ku GPLPRo6go = or5nbo9ku.GPLPRo6go();
        if (GPLPRo6go != null && xP6F5SR9v.Bhmn1KIah(GPLPRo6go.iiGwOFFnr(), VSVuhz7Ow.iiGwOFFnr) != null) {
            SFCfKsDVJ sFCfKsDVJ = (SFCfKsDVJ) xP6F5SR9v.Bhmn1KIah(GPLPRo6go.iiGwOFFnr(), VSVuhz7Ow.GPLPRo6go);
            if (sFCfKsDVJ != null) {
                if (sFCfKsDVJ.q3BipwRCk < 0 || sFCfKsDVJ.J4Ux7ym32 < 0) {
                    return;
                }
            }
            if (or5nbo9ku.iiGwOFFnr().CBQ5d1kRq.containsKey(VSVuhz7Ow.sk5s77z6Q)) {
                ArrayList arrayList = new ArrayList();
                List yWvV4ePLl = GPLPRo6go.yWvV4ePLl();
                int size = yWvV4ePLl.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        or5nbo9ku or5nbo9ku2 = (or5nbo9ku) yWvV4ePLl.get(i);
                        ogG45sslV iiGwOFFnr2 = or5nbo9ku2.iiGwOFFnr();
                        VSVuhz7Ow vSVuhz7Ow2 = VSVuhz7Ow.q3BipwRCk;
                        if (iiGwOFFnr2.CBQ5d1kRq.containsKey(VSVuhz7Ow.sk5s77z6Q)) {
                            arrayList.add(or5nbo9ku2);
                        }
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean dIocxURUo = dIocxURUo(arrayList);
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            or5nbo9ku or5nbo9ku3 = (or5nbo9ku) arrayList.get(i3);
                            if (or5nbo9ku3.iiGwOFFnr == or5nbo9ku.iiGwOFFnr) {
                                int i5 = dIocxURUo ? 0 : i3;
                                int i6 = dIocxURUo ? i3 : 0;
                                ogG45sslV iiGwOFFnr3 = or5nbo9ku3.iiGwOFFnr();
                                VSVuhz7Ow vSVuhz7Ow3 = VSVuhz7Ow.q3BipwRCk;
                                SHlGWJTIu sHlGWJTIu = VSVuhz7Ow.sk5s77z6Q;
                                VSocs6HGb vSocs6HGb = VSocs6HGb.AqaWJg0b4;
                                Object obj = iiGwOFFnr3.CBQ5d1kRq.get(sHlGWJTIu);
                                if (obj == null) {
                                    obj = vSocs6HGb.GPLPRo6go();
                                }
                                iqwHQ6O2l.q3BipwRCk.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) IqwHQ6O2l.aXI58Y1kr.q3BipwRCk(i5, 1, i6, 1, false, ((Boolean) obj).booleanValue()).q3BipwRCk);
                            }
                            if (i4 <= size2) {
                                i3 = i4;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public static String WaUP0CF08(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static final boolean cAwN510t2(or5nbo9ku or5nbo9ku) {
        ogG45sslV iiGwOFFnr = or5nbo9ku.iiGwOFFnr();
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        return (xP6F5SR9v.Bhmn1KIah(iiGwOFFnr, VSVuhz7Ow.GPLPRo6go) == null && xP6F5SR9v.Bhmn1KIah(or5nbo9ku.iiGwOFFnr(), VSVuhz7Ow.iiGwOFFnr) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [con.Dqz1pJHWH] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final boolean dIocxURUo(List list) {
        ?? r0;
        Object obj;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            r0 = Dqz1pJHWH.CBQ5d1kRq;
        } else {
            r0 = new ArrayList();
            Object obj2 = list.get(0);
            int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(list);
            if (CBQ5d1kRq > 0) {
                int i = 0;
                while (true) {
                    i++;
                    Object obj3 = list.get(i);
                    or5nbo9ku or5nbo9ku = (or5nbo9ku) obj3;
                    or5nbo9ku or5nbo9ku2 = (or5nbo9ku) obj2;
                    r0.add(new bRgfgYIQX(ODug2UCW1.dIocxURUo(Math.abs(bRgfgYIQX.tGV7Q6urW(or5nbo9ku2.dIocxURUo().q3BipwRCk()) - bRgfgYIQX.tGV7Q6urW(or5nbo9ku.dIocxURUo().q3BipwRCk())), Math.abs(bRgfgYIQX.dIocxURUo(or5nbo9ku2.dIocxURUo().q3BipwRCk()) - bRgfgYIQX.dIocxURUo(or5nbo9ku.dIocxURUo().q3BipwRCk())))));
                    if (i >= CBQ5d1kRq) {
                        break;
                    }
                    obj2 = obj3;
                }
            }
        }
        if (r0.size() == 1) {
            obj = wkFJfVmcv.o4LF8RkoQ(r0);
        } else if (!r0.isEmpty()) {
            obj = wkFJfVmcv.o4LF8RkoQ(r0);
            int CBQ5d1kRq2 = idpM54xlp.CBQ5d1kRq(r0);
            if (1 <= CBQ5d1kRq2) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    obj = new bRgfgYIQX(bRgfgYIQX.iiGwOFFnr(((bRgfgYIQX) obj).q3BipwRCk, ((bRgfgYIQX) r0.get(i2)).q3BipwRCk));
                    if (i2 == CBQ5d1kRq2) {
                        break;
                    }
                    i2 = i3;
                }
            }
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        long j = ((bRgfgYIQX) obj).q3BipwRCk;
        return bRgfgYIQX.dIocxURUo(j) < bRgfgYIQX.tGV7Q6urW(j);
    }

    public static final mhjbbkjEL dXrmkklc8(pLYbCSTk0 plybcstk0) {
        for (qhaZGYFO8 qhazgyfo8 = plybcstk0.V9LQMKGJe.ilHKhw3Yw; qhazgyfo8 != null; qhazgyfo8 = qhazgyfo8.IG30YE5GU()) {
            if (qhazgyfo8 instanceof mhjbbkjEL) {
                return (mhjbbkjEL) qhazgyfo8;
            }
        }
        return null;
    }

    public static CharSequence[] dfpT1j18n(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static final jRWr6Yc4S i0Zug1mVk(pLYbCSTk0 plybcstk0) {
        jRWr6Yc4S jrwr6yc4s = plybcstk0.qVUwofr5s;
        if (jrwr6yc4s != null) {
            return jrwr6yc4s;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static File i8XZMQc6Z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(".font");
        q3BipwRCk.append(Process.myPid());
        q3BipwRCk.append("-");
        q3BipwRCk.append(Process.myTid());
        q3BipwRCk.append("-");
        String sb = q3BipwRCk.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, sb + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean iMyQMM6Qj(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean igRQEZxnW(k007RzV1x.RG2GI7LDp rG2GI7LDp, k007RzV1x.RG2GI7LDp rG2GI7LDp2, k007RzV1x.RG2GI7LDp rG2GI7LDp3, k007RzV1x.RG2GI7LDp rG2GI7LDp4) {
        k007RzV1x.RG2GI7LDp rG2GI7LDp5 = k007RzV1x.RG2GI7LDp.MATCH_PARENT;
        k007RzV1x.RG2GI7LDp rG2GI7LDp6 = k007RzV1x.RG2GI7LDp.WRAP_CONTENT;
        k007RzV1x.RG2GI7LDp rG2GI7LDp7 = k007RzV1x.RG2GI7LDp.FIXED;
        return (rG2GI7LDp3 == rG2GI7LDp7 || rG2GI7LDp3 == rG2GI7LDp6 || (rG2GI7LDp3 == rG2GI7LDp5 && rG2GI7LDp != rG2GI7LDp6)) || (rG2GI7LDp4 == rG2GI7LDp7 || rG2GI7LDp4 == rG2GI7LDp6 || (rG2GI7LDp4 == rG2GI7LDp5 && rG2GI7LDp2 != rG2GI7LDp6));
    }

    public static int iiGwOFFnr(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager tGV7Q6urW = A7WYoUKXR.tGV7Q6urW(context);
                i = A7WYoUKXR.q3BipwRCk(tGV7Q6urW, permissionToOp, Binder.getCallingUid(), packageName);
                if (i == 0) {
                    i = A7WYoUKXR.q3BipwRCk(tGV7Q6urW, permissionToOp, myUid, A7WYoUKXR.J4Ux7ym32(context));
                }
            } else {
                i = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static float ilHKhw3Yw(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !iMyQMM6Qj(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static final long ixWaw2akD(double d) {
        return vNtjxmzUM(4294967296L, (float) d);
    }

    public static final void kCA6Zs9sL(long j) {
        if (!(!CpG0imbht(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    public static int kmSgne1rO(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static ByteBuffer mUqPm6GBh(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final Object nlGCs0NZs(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final void o4LF8RkoQ(or5nbo9ku or5nbo9ku, IqwHQ6O2l iqwHQ6O2l) {
        ogG45sslV iiGwOFFnr = or5nbo9ku.iiGwOFFnr();
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        SFCfKsDVJ sFCfKsDVJ = (SFCfKsDVJ) xP6F5SR9v.Bhmn1KIah(iiGwOFFnr, VSVuhz7Ow.GPLPRo6go);
        if (sFCfKsDVJ != null) {
            iqwHQ6O2l.Bhmn1KIah(IqwHQ6O2l.mhl5lIdbQ.q3BipwRCk(sFCfKsDVJ.q3BipwRCk, sFCfKsDVJ.J4Ux7ym32, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (xP6F5SR9v.Bhmn1KIah(or5nbo9ku.iiGwOFFnr(), VSVuhz7Ow.iiGwOFFnr) != null) {
            List yWvV4ePLl = or5nbo9ku.yWvV4ePLl();
            int size = yWvV4ePLl.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    or5nbo9ku or5nbo9ku2 = (or5nbo9ku) yWvV4ePLl.get(i);
                    ogG45sslV iiGwOFFnr2 = or5nbo9ku2.iiGwOFFnr();
                    VSVuhz7Ow vSVuhz7Ow2 = VSVuhz7Ow.q3BipwRCk;
                    if (iiGwOFFnr2.CBQ5d1kRq.containsKey(VSVuhz7Ow.sk5s77z6Q)) {
                        arrayList.add(or5nbo9ku2);
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        int i3 = 1;
        if (!arrayList.isEmpty()) {
            boolean dIocxURUo = dIocxURUo(arrayList);
            int size2 = dIocxURUo ? 1 : arrayList.size();
            if (dIocxURUo) {
                i3 = arrayList.size();
            }
            iqwHQ6O2l.Bhmn1KIah(IqwHQ6O2l.mhl5lIdbQ.q3BipwRCk(size2, i3, false, 0));
        }
    }

    public static WQmeMGPEH oon79WMrY(k007RzV1x k007rzv1x, int i, ArrayList arrayList, WQmeMGPEH wQmeMGPEH) {
        h7j7Zcum2 h7j7zcum2;
        int i2;
        int i3 = i == 0 ? k007rzv1x.oesmsHQJU : k007rzv1x.YmNRDyka4;
        int i4 = 0;
        if (i3 != -1 && (wQmeMGPEH == null || i3 != wQmeMGPEH.J4Ux7ym32)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                WQmeMGPEH wQmeMGPEH2 = (WQmeMGPEH) arrayList.get(i5);
                if (wQmeMGPEH2.J4Ux7ym32 == i3) {
                    if (wQmeMGPEH != null) {
                        wQmeMGPEH.dIocxURUo(i, wQmeMGPEH2);
                        arrayList.remove(wQmeMGPEH);
                    }
                    wQmeMGPEH = wQmeMGPEH2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return wQmeMGPEH;
        }
        if (wQmeMGPEH == null) {
            if (k007rzv1x instanceof INrKfCE8Y) {
                INrKfCE8Y iNrKfCE8Y = (INrKfCE8Y) k007rzv1x;
                int i6 = 0;
                while (true) {
                    if (i6 >= iNrKfCE8Y.Ihm5o4uLx) {
                        i2 = -1;
                        break;
                    }
                    k007RzV1x k007rzv1x2 = iNrKfCE8Y.ShSN9wbzk[i6];
                    if ((i == 0 && (i2 = k007rzv1x2.oesmsHQJU) != -1) || (i == 1 && (i2 = k007rzv1x2.YmNRDyka4) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i2 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        WQmeMGPEH wQmeMGPEH3 = (WQmeMGPEH) arrayList.get(i7);
                        if (wQmeMGPEH3.J4Ux7ym32 == i2) {
                            wQmeMGPEH = wQmeMGPEH3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (wQmeMGPEH == null) {
                wQmeMGPEH = new WQmeMGPEH(i);
            }
            arrayList.add(wQmeMGPEH);
        }
        if (wQmeMGPEH.q3BipwRCk(k007rzv1x)) {
            if (k007rzv1x instanceof SlV7nGkeq) {
                SlV7nGkeq slV7nGkeq = (SlV7nGkeq) k007rzv1x;
                h7j7Zcum2 h7j7zcum22 = slV7nGkeq.uSBmk4hFZ;
                if (slV7nGkeq.a8N8UmDyD == 0) {
                    i4 = 1;
                }
                h7j7zcum22.J4Ux7ym32(i4, arrayList, wQmeMGPEH);
            }
            if (i == 0) {
                k007rzv1x.oesmsHQJU = wQmeMGPEH.J4Ux7ym32;
                k007rzv1x.i0Zug1mVk.J4Ux7ym32(i, arrayList, wQmeMGPEH);
                h7j7zcum2 = k007rzv1x.V9LQMKGJe;
            } else {
                k007rzv1x.YmNRDyka4 = wQmeMGPEH.J4Ux7ym32;
                k007rzv1x.o4LF8RkoQ.J4Ux7ym32(i, arrayList, wQmeMGPEH);
                k007rzv1x.igRQEZxnW.J4Ux7ym32(i, arrayList, wQmeMGPEH);
                h7j7zcum2 = k007rzv1x.QNqj6nIzv;
            }
            h7j7zcum2.J4Ux7ym32(i, arrayList, wQmeMGPEH);
            k007rzv1x.juJ6pnCpu.J4Ux7ym32(i, arrayList, wQmeMGPEH);
        }
        return wQmeMGPEH;
    }

    public static final AU29aHa4X q3BipwRCk(Context context) {
        return new DtU31vERS(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static final float qFBXIgpia(float f, float f2, float f3) {
        return (f3 * f2) + ((((float) 1) - f3) * f);
    }

    public static int qVUwofr5s(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !iMyQMM6Qj(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static final long sk5s77z6Q(int i) {
        return vNtjxmzUM(4294967296L, (float) i);
    }

    public static final pLYbCSTk0 tGV7Q6urW(pLYbCSTk0 plybcstk0, PmanMZxiM pmanMZxiM) {
        do {
            plybcstk0 = plybcstk0.oon79WMrY();
            if (plybcstk0 == null) {
                return null;
            }
        } while (!((Boolean) pmanMZxiM.IytU16YUK(plybcstk0)).booleanValue());
        return plybcstk0;
    }

    public static final long vNtjxmzUM(long j, float f) {
        long floatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
        return floatToIntBits;
    }

    public static WQmeMGPEH vPSbyrYWX(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WQmeMGPEH wQmeMGPEH = (WQmeMGPEH) arrayList.get(i2);
            if (i == wQmeMGPEH.J4Ux7ym32) {
                return wQmeMGPEH;
            }
        }
        return null;
    }

    public static boolean yWvV4ePLl(File file, InputStream inputStream) {
        Throwable th;
        IOException e;
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }
}
