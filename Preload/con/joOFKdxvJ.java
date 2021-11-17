package con;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import androidx.profileinstaller.RG2GI7LDp;
import com.feravolt.preload.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class joOFKdxvJ implements RG2GI7LDp.AbstractC0006RG2GI7LDp {
    public joOFKdxvJ(int i) {
    }

    public ArrayList GPLPRo6go(ArrayList arrayList, String str, Context context) {
        String str2;
        boolean z = false;
        if (arrayList.isEmpty()) {
            HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
            ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
            Objects.requireNonNull(ey4vf0eiu);
            String str3 = ey4vf0eiu.kCA6Zs9sL;
            if (!(str3 == null || str3.length() == 0)) {
                ey4Vf0Eiu ey4vf0eiu2 = HZDtN0XJv.tGV7Q6urW;
                Objects.requireNonNull(ey4vf0eiu2);
                str2 = ey4vf0eiu2.kCA6Zs9sL;
            } else {
                ey4Vf0Eiu ey4vf0eiu3 = HZDtN0XJv.tGV7Q6urW;
                Objects.requireNonNull(ey4vf0eiu3);
                if (ey4vf0eiu3.GPLPRo6go.length() == 0) {
                    z = true;
                }
                if (!z) {
                    ey4Vf0Eiu ey4vf0eiu4 = HZDtN0XJv.tGV7Q6urW;
                    Objects.requireNonNull(ey4vf0eiu4);
                    str2 = ey4vf0eiu4.GPLPRo6go;
                } else {
                    str2 = context.getString(R.string.file_picker_tv_sd_card);
                }
            }
            arrayList.add(new xZLHWtbav(str2, str));
            return arrayList;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xZLHWtbav xzlhwtbav = (xZLHWtbav) it.next();
            if (anXlDk6fV.tGV7Q6urW(str, ((xZLHWtbav) wkFJfVmcv.o4LF8RkoQ(arrayList)).J4Ux7ym32)) {
                return new ArrayList(arrayList.subList(0, 1));
            }
            if (anXlDk6fV.tGV7Q6urW(str, ((xZLHWtbav) arrayList.get(arrayList.size() - 1)).J4Ux7ym32)) {
                return arrayList;
            }
            if (anXlDk6fV.tGV7Q6urW(str, xzlhwtbav.J4Ux7ym32)) {
                return new ArrayList(arrayList.subList(0, arrayList.indexOf(xzlhwtbav) + 1));
            }
        }
        arrayList.add(new xZLHWtbav(str.substring(r6NbD4wnj.juJ6pnCpu(str, "/", 0, false, 6) + 1), str));
        return arrayList;
    }

    public int J4Ux7ym32(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    public long dIocxURUo(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            return tGV7Q6urW(i, i, i2, i2);
        }
        throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public ArrayList iiGwOFFnr(File file) {
        boolean z;
        boolean z2;
        mSiW1fbBz msiw1fbbz;
        ArrayList arrayList = new ArrayList();
        File kCA6Zs9sL = kCA6Zs9sL();
        if (file.list() == null) {
            HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
            ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
            Objects.requireNonNull(ey4vf0eiu);
            if (!ey4vf0eiu.tGV7Q6urW && anXlDk6fV.tGV7Q6urW(file.getPath(), kCA6Zs9sL.getParentFile().getPath())) {
                z = true;
                if (!z) {
                    arrayList.add(new mSiW1fbBz(kCA6Zs9sL.getName(), kCA6Zs9sL.getPath(), false, null, true, false));
                    HZDtN0XJv hZDtN0XJv2 = HZDtN0XJv.q3BipwRCk;
                    Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                    return arrayList;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (!(listFiles.length == 0)) {
                        z2 = false;
                        if (!z2) {
                            return arrayList;
                        }
                        File[] listFiles2 = file.listFiles();
                        int length = listFiles2.length;
                        int i = 0;
                        while (i < length) {
                            File file2 = listFiles2[i];
                            i++;
                            boolean wIZEdYHUn = r6NbD4wnj.wIZEdYHUn(file2.getName(), ".", false, 2);
                            HZDtN0XJv hZDtN0XJv3 = HZDtN0XJv.q3BipwRCk;
                            ey4Vf0Eiu ey4vf0eiu2 = HZDtN0XJv.tGV7Q6urW;
                            Objects.requireNonNull(ey4vf0eiu2);
                            if (ey4vf0eiu2.J4Ux7ym32 || !wIZEdYHUn) {
                                if (file2.isDirectory()) {
                                    msiw1fbbz = new mSiW1fbBz(file2.getName(), file2.getPath(), false, null, true, wIZEdYHUn);
                                } else {
                                    msiw1fbbz = new mSiW1fbBz(file2.getName(), file2.getPath(), false, null, false, wIZEdYHUn);
                                    Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                                    ey4Vf0Eiu ey4vf0eiu3 = HZDtN0XJv.tGV7Q6urW;
                                    Objects.requireNonNull(ey4vf0eiu3);
                                    ey4vf0eiu3.J4Ux7ym32().GPLPRo6go(msiw1fbbz);
                                    ey4Vf0Eiu ey4vf0eiu4 = HZDtN0XJv.tGV7Q6urW;
                                    Objects.requireNonNull(ey4vf0eiu4);
                                    Objects.requireNonNull(ey4vf0eiu4.J4Ux7ym32());
                                }
                                arrayList.add(msiw1fbbz);
                            }
                        }
                        FSq6CQ0dR.AqaWJg0b4(arrayList, new PSEid1kjm(new PmanMZxiM[]{AdUPdUuqH.EBQXiIPmm, GQN3dSqKV.QNqj6nIzv}));
                        HZDtN0XJv hZDtN0XJv4 = HZDtN0XJv.q3BipwRCk;
                        Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                        return arrayList;
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    public File kCA6Zs9sL() {
        HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
        ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
        Objects.requireNonNull(ey4vf0eiu);
        String str = ey4vf0eiu.iiGwOFFnr;
        if (anXlDk6fV.tGV7Q6urW(str, "STORAGE_EXTERNAL_STORAGE")) {
            return new File(Environment.getExternalStorageDirectory().getAbsoluteFile().toURI());
        }
        if (!anXlDk6fV.tGV7Q6urW(str, "STORAGE_CUSTOM_ROOT_PATH")) {
            return new File(Environment.getExternalStorageDirectory().getAbsoluteFile().toURI());
        }
        ey4Vf0Eiu ey4vf0eiu2 = HZDtN0XJv.tGV7Q6urW;
        Objects.requireNonNull(ey4vf0eiu2);
        if (ey4vf0eiu2.GPLPRo6go.length() == 0) {
            return new File(Environment.getExternalStorageDirectory().getAbsoluteFile().toURI());
        }
        ey4Vf0Eiu ey4vf0eiu3 = HZDtN0XJv.tGV7Q6urW;
        Objects.requireNonNull(ey4vf0eiu3);
        return new File(ey4vf0eiu3.GPLPRo6go);
    }

    @Override // androidx.profileinstaller.RG2GI7LDp.AbstractC0006RG2GI7LDp
    public void q3BipwRCk(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            default:
                str = "";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public long tGV7Q6urW(int i, int i2, int i3, int i4) {
        long j;
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int J4Ux7ym32 = J4Ux7ym32(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int J4Ux7ym322 = J4Ux7ym32(i6);
        if (J4Ux7ym32 + J4Ux7ym322 <= 31) {
            if (J4Ux7ym322 == 13) {
                j = 3;
            } else if (J4Ux7ym322 == 18) {
                j = 1;
            } else if (J4Ux7ym322 == 15) {
                j = 2;
            } else if (J4Ux7ym322 == 16) {
                j = 0;
            } else {
                throw new IllegalStateException("Should only have the provided constants.");
            }
            int i7 = 0;
            int i8 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            if (i4 != Integer.MAX_VALUE) {
                i7 = i4 + 1;
            }
            int i9 = K5PjwoFCN.tGV7Q6urW[(int) j];
            return (((long) i8) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i7) << (i9 + 31));
        }
        throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
    }
}
