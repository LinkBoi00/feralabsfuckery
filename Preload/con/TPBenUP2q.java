package con;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class TPBenUP2q {
    public static final byte[] q3BipwRCk = {112, 114, 111, 0};

    public static fzKoojKuv[] GPLPRo6go(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new fzKoojKuv[0];
        }
        fzKoojKuv[] fzkoojkuvArr = new fzKoojKuv[i];
        for (int i2 = 0; i2 < i; i2++) {
            int Eeka1udhb = pA5wCkne4.Eeka1udhb(inputStream);
            int Eeka1udhb2 = pA5wCkne4.Eeka1udhb(inputStream);
            fzkoojkuvArr[i2] = new fzKoojKuv(str, new String(pA5wCkne4.PSTqBLTET(inputStream, Eeka1udhb), StandardCharsets.UTF_8), pA5wCkne4.dXrmkklc8(inputStream), Eeka1udhb2, (int) pA5wCkne4.dXrmkklc8(inputStream), (int) pA5wCkne4.dXrmkklc8(inputStream), new int[Eeka1udhb2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            fzKoojKuv fzkoojkuv = fzkoojkuvArr[i3];
            int available = inputStream.available() - fzkoojkuv.kCA6Zs9sL;
            int i4 = 0;
            while (inputStream.available() > available) {
                i4 += pA5wCkne4.Eeka1udhb(inputStream);
                fzkoojkuv.Puu3Rhg4F.put(Integer.valueOf(i4), 1);
                for (int Eeka1udhb3 = pA5wCkne4.Eeka1udhb(inputStream); Eeka1udhb3 > 0; Eeka1udhb3--) {
                    pA5wCkne4.Eeka1udhb(inputStream);
                    int RG6kpfv3v = pA5wCkne4.RG6kpfv3v(inputStream);
                    if (!(RG6kpfv3v == 6 || RG6kpfv3v == 7)) {
                        while (RG6kpfv3v > 0) {
                            pA5wCkne4.RG6kpfv3v(inputStream);
                            for (int RG6kpfv3v2 = pA5wCkne4.RG6kpfv3v(inputStream); RG6kpfv3v2 > 0; RG6kpfv3v2--) {
                                pA5wCkne4.Eeka1udhb(inputStream);
                            }
                            RG6kpfv3v--;
                        }
                    }
                }
            }
            if (inputStream.available() == available) {
                dIocxURUo(inputStream, fzkoojkuv);
                BitSet valueOf = BitSet.valueOf(pA5wCkne4.PSTqBLTET(inputStream, ((((fzkoojkuv.iiGwOFFnr * 2) + 8) - 1) & -8) / 8));
                int i5 = 0;
                while (true) {
                    int i6 = fzkoojkuv.iiGwOFFnr;
                    if (i5 < i6) {
                        int i7 = valueOf.get(tGV7Q6urW(2, i5, i6)) ? 2 : 0;
                        if (valueOf.get(tGV7Q6urW(4, i5, i6))) {
                            i7 |= 4;
                        }
                        if (i7 != 0) {
                            Integer num = (Integer) fzkoojkuv.Puu3Rhg4F.get(Integer.valueOf(i5));
                            if (num == null) {
                                num = 0;
                            }
                            fzkoojkuv.Puu3Rhg4F.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() | i7));
                        }
                        i5++;
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return fzkoojkuvArr;
    }

    public static String J4Ux7ym32(String str, String str2, byte[] bArr) {
        if (str2.equals("classes.dex")) {
            return str;
        }
        StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk(str);
        String str3 = ":";
        if (!Arrays.equals(bArr, oN2zCBlPe.dIocxURUo) && !Arrays.equals(bArr, oN2zCBlPe.tGV7Q6urW)) {
            str3 = "!";
        }
        return my9FFKbZi.q3BipwRCk(q3BipwRCk2, str3, str2);
    }

    public static void Puu3Rhg4F(byte[] bArr, int i, int i2, fzKoojKuv fzkoojkuv) {
        int tGV7Q6urW = tGV7Q6urW(i, i2, fzkoojkuv.iiGwOFFnr);
        int i3 = tGV7Q6urW / 8;
        bArr[i3] = (byte) ((1 << (tGV7Q6urW % 8)) | bArr[i3]);
    }

    public static void dIocxURUo(InputStream inputStream, fzKoojKuv fzkoojkuv) {
        int i = 0;
        for (int i2 = 0; i2 < fzkoojkuv.dIocxURUo; i2++) {
            i += pA5wCkne4.Eeka1udhb(inputStream);
            fzkoojkuv.GPLPRo6go[i2] = i;
        }
    }

    public static fzKoojKuv[] iiGwOFFnr(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, oN2zCBlPe.q3BipwRCk)) {
            int RG6kpfv3v = pA5wCkne4.RG6kpfv3v(inputStream);
            byte[] ilHKhw3Yw = pA5wCkne4.ilHKhw3Yw(inputStream, (int) pA5wCkne4.dXrmkklc8(inputStream), (int) pA5wCkne4.dXrmkklc8(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ilHKhw3Yw);
                try {
                    fzKoojKuv[] GPLPRo6go = GPLPRo6go(byteArrayInputStream, str, RG6kpfv3v);
                    byteArrayInputStream.close();
                    return GPLPRo6go;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
    }

    public static byte[] kCA6Zs9sL(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, pA5wCkne4.PSTqBLTET(inputStream, bArr.length))) {
            return pA5wCkne4.PSTqBLTET(inputStream, oN2zCBlPe.q3BipwRCk.length);
        }
        throw new IllegalStateException("Invalid magic");
    }

    public static void oon79WMrY(OutputStream outputStream, fzKoojKuv fzkoojkuv) {
        int i = 0;
        for (Map.Entry entry : fzkoojkuv.Puu3Rhg4F.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                pA5wCkne4.mUqPm6GBh(outputStream, intValue - i);
                pA5wCkne4.mUqPm6GBh(outputStream, 0);
                i = intValue;
            }
        }
        int i2 = 0;
        for (int i3 : fzkoojkuv.GPLPRo6go) {
            Integer valueOf = Integer.valueOf(i3);
            pA5wCkne4.mUqPm6GBh(outputStream, valueOf.intValue() - i2);
            i2 = valueOf.intValue();
        }
        byte[] bArr = new byte[((((fzkoojkuv.iiGwOFFnr * 2) + 8) - 1) & -8) / 8];
        for (Map.Entry entry2 : fzkoojkuv.Puu3Rhg4F.entrySet()) {
            int intValue2 = ((Integer) entry2.getKey()).intValue();
            int intValue3 = ((Integer) entry2.getValue()).intValue();
            if ((intValue3 & 2) != 0) {
                Puu3Rhg4F(bArr, 2, intValue2, fzkoojkuv);
            }
            if ((intValue3 & 4) != 0) {
                Puu3Rhg4F(bArr, 4, intValue2, fzkoojkuv);
            }
        }
        outputStream.write(bArr);
    }

    public static byte[] q3BipwRCk(fzKoojKuv[] fzkoojkuvArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (fzKoojKuv fzkoojkuv : fzkoojkuvArr) {
            i2 += (((((fzkoojkuv.iiGwOFFnr * 2) + 8) - 1) & -8) / 8) + (fzkoojkuv.dIocxURUo * 2) + pA5wCkne4.CpG0imbht(J4Ux7ym32(fzkoojkuv.q3BipwRCk, fzkoojkuv.J4Ux7ym32, bArr)) + 16 + fzkoojkuv.kCA6Zs9sL;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, oN2zCBlPe.J4Ux7ym32)) {
            int length = fzkoojkuvArr.length;
            while (i < length) {
                fzKoojKuv fzkoojkuv2 = fzkoojkuvArr[i];
                vPSbyrYWX(byteArrayOutputStream, fzkoojkuv2, J4Ux7ym32(fzkoojkuv2.q3BipwRCk, fzkoojkuv2.J4Ux7ym32, bArr));
                oon79WMrY(byteArrayOutputStream, fzkoojkuv2);
                i++;
            }
        } else {
            for (fzKoojKuv fzkoojkuv3 : fzkoojkuvArr) {
                vPSbyrYWX(byteArrayOutputStream, fzkoojkuv3, J4Ux7ym32(fzkoojkuv3.q3BipwRCk, fzkoojkuv3.J4Ux7ym32, bArr));
            }
            int length2 = fzkoojkuvArr.length;
            while (i < length2) {
                oon79WMrY(byteArrayOutputStream, fzkoojkuvArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("The bytes saved do not match expectation. actual=");
        q3BipwRCk2.append(byteArrayOutputStream.size());
        q3BipwRCk2.append(" expected=");
        q3BipwRCk2.append(i2);
        throw new IllegalStateException(q3BipwRCk2.toString());
    }

    public static int tGV7Q6urW(int i, int i2, int i3) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw new IllegalStateException("Unexpected flag: " + i);
        }
    }

    public static void vPSbyrYWX(OutputStream outputStream, fzKoojKuv fzkoojkuv, String str) {
        pA5wCkne4.mUqPm6GBh(outputStream, pA5wCkne4.CpG0imbht(str));
        pA5wCkne4.mUqPm6GBh(outputStream, fzkoojkuv.dIocxURUo);
        pA5wCkne4.AqaWJg0b4(outputStream, (long) fzkoojkuv.kCA6Zs9sL, 4);
        pA5wCkne4.AqaWJg0b4(outputStream, fzkoojkuv.tGV7Q6urW, 4);
        pA5wCkne4.AqaWJg0b4(outputStream, (long) fzkoojkuv.iiGwOFFnr, 4);
        pA5wCkne4.nlGCs0NZs(outputStream, str);
    }

    public static boolean yWvV4ePLl(OutputStream outputStream, byte[] bArr, fzKoojKuv[] fzkoojkuvArr) {
        byte[] bArr2 = oN2zCBlPe.q3BipwRCk;
        if (Arrays.equals(bArr, bArr2)) {
            byte[] q3BipwRCk2 = q3BipwRCk(fzkoojkuvArr, bArr2);
            pA5wCkne4.NyWTwPF6V(outputStream, fzkoojkuvArr.length);
            pA5wCkne4.qFBXIgpia(outputStream, q3BipwRCk2);
            return true;
        } else if (Arrays.equals(bArr, oN2zCBlPe.tGV7Q6urW)) {
            pA5wCkne4.NyWTwPF6V(outputStream, fzkoojkuvArr.length);
            for (fzKoojKuv fzkoojkuv : fzkoojkuvArr) {
                String J4Ux7ym32 = J4Ux7ym32(fzkoojkuv.q3BipwRCk, fzkoojkuv.J4Ux7ym32, oN2zCBlPe.tGV7Q6urW);
                pA5wCkne4.mUqPm6GBh(outputStream, pA5wCkne4.CpG0imbht(J4Ux7ym32));
                pA5wCkne4.mUqPm6GBh(outputStream, fzkoojkuv.GPLPRo6go.length);
                pA5wCkne4.AqaWJg0b4(outputStream, (long) (fzkoojkuv.Puu3Rhg4F.size() * 4), 4);
                pA5wCkne4.AqaWJg0b4(outputStream, fzkoojkuv.tGV7Q6urW, 4);
                pA5wCkne4.nlGCs0NZs(outputStream, J4Ux7ym32);
                for (Integer num : fzkoojkuv.Puu3Rhg4F.keySet()) {
                    pA5wCkne4.mUqPm6GBh(outputStream, num.intValue());
                    pA5wCkne4.mUqPm6GBh(outputStream, 0);
                }
                for (int i : fzkoojkuv.GPLPRo6go) {
                    pA5wCkne4.mUqPm6GBh(outputStream, i);
                }
            }
            return true;
        } else {
            byte[] bArr3 = oN2zCBlPe.J4Ux7ym32;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] q3BipwRCk3 = q3BipwRCk(fzkoojkuvArr, bArr3);
                pA5wCkne4.NyWTwPF6V(outputStream, fzkoojkuvArr.length);
                pA5wCkne4.qFBXIgpia(outputStream, q3BipwRCk3);
                return true;
            } else if (!Arrays.equals(bArr, oN2zCBlPe.dIocxURUo)) {
                return false;
            } else {
                pA5wCkne4.mUqPm6GBh(outputStream, fzkoojkuvArr.length);
                for (fzKoojKuv fzkoojkuv2 : fzkoojkuvArr) {
                    String J4Ux7ym322 = J4Ux7ym32(fzkoojkuv2.q3BipwRCk, fzkoojkuv2.J4Ux7ym32, oN2zCBlPe.dIocxURUo);
                    pA5wCkne4.mUqPm6GBh(outputStream, pA5wCkne4.CpG0imbht(J4Ux7ym322));
                    pA5wCkne4.mUqPm6GBh(outputStream, fzkoojkuv2.Puu3Rhg4F.size());
                    pA5wCkne4.mUqPm6GBh(outputStream, fzkoojkuv2.GPLPRo6go.length);
                    pA5wCkne4.AqaWJg0b4(outputStream, fzkoojkuv2.tGV7Q6urW, 4);
                    pA5wCkne4.nlGCs0NZs(outputStream, J4Ux7ym322);
                    for (Integer num2 : fzkoojkuv2.Puu3Rhg4F.keySet()) {
                        pA5wCkne4.mUqPm6GBh(outputStream, num2.intValue());
                    }
                    for (int i2 : fzkoojkuv2.GPLPRo6go) {
                        pA5wCkne4.mUqPm6GBh(outputStream, i2);
                    }
                }
                return true;
            }
        }
    }
}
