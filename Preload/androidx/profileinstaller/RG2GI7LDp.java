package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import con.Q4TFMtvSV;
import con.TPBenUP2q;
import con.fzKoojKuv;
import con.kcMDrQwcE;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class RG2GI7LDp {
    public static final AbstractC0006RG2GI7LDp q3BipwRCk = new Q4TFMtvSV(11);

    /* renamed from: androidx.profileinstaller.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public interface AbstractC0006RG2GI7LDp {
        void q3BipwRCk(int i, Object obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [con.fzKoojKuv[], java.lang.Object, byte[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void q3BipwRCk(Context context, Executor executor, AbstractC0006RG2GI7LDp rG2GI7LDp, boolean z) {
        boolean z2;
        fzKoojKuv[] fzkoojkuvArr;
        ?? r5;
        byte[] bArr;
        FileNotFoundException e;
        IOException e2;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        Throwable th2;
        byte[] bArr2;
        fzKoojKuv[] fzkoojkuvArr2;
        String str;
        AbstractC0006RG2GI7LDp rG2GI7LDp2;
        Object e3;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th3;
        int i;
        AbstractC0006RG2GI7LDp rG2GI7LDp3;
        Object e4;
        Integer num;
        int i2;
        boolean z3;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        long readLong = dataInputStream.readLong();
                        dataInputStream.close();
                        z3 = readLong == packageInfo.lastUpdateTime;
                        if (z3) {
                            rG2GI7LDp.q3BipwRCk(2, null);
                        }
                    } catch (IOException unused) {
                    }
                    if (z3) {
                        return;
                    }
                }
                z3 = false;
                if (z3) {
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            String str2 = name;
            String str3 = "dexopt/baseline.prof";
            String str4 = 1;
            kcMDrQwcE kcmdrqwce = new kcMDrQwcE(assets, executor, rG2GI7LDp, str2, str3, "dexopt/baseline.profm", file2);
            if (kcmdrqwce.dIocxURUo == null) {
                i2 = 3;
                num = Integer.valueOf(i3);
            } else if (!file2.canWrite()) {
                i2 = 4;
                num = null;
            } else {
                kcmdrqwce.GPLPRo6go = true;
                z2 = true;
                if (!z2) {
                    kcmdrqwce.q3BipwRCk();
                    int i4 = 8;
                    if (kcmdrqwce.dIocxURUo != null) {
                        try {
                            AssetFileDescriptor openFd = assets.openFd("dexopt/baseline.prof");
                            try {
                                FileInputStream createInputStream = openFd.createInputStream();
                                kcmdrqwce.Puu3Rhg4F = TPBenUP2q.iiGwOFFnr(createInputStream, TPBenUP2q.kCA6Zs9sL(createInputStream, TPBenUP2q.q3BipwRCk), name);
                                createInputStream.close();
                                openFd.close();
                            } catch (Throwable th4) {
                                if (openFd != null) {
                                    try {
                                        openFd.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (FileNotFoundException e5) {
                            e4 = e5;
                            rG2GI7LDp3 = kcmdrqwce.tGV7Q6urW;
                            i = 6;
                            rG2GI7LDp3.q3BipwRCk(i, e4);
                            fzkoojkuvArr = kcmdrqwce.Puu3Rhg4F;
                            byte[] bArr3 = kcmdrqwce.dIocxURUo;
                            if (fzkoojkuvArr != null) {
                            }
                            r5 = 0;
                            bArr = kcmdrqwce.yWvV4ePLl;
                            if (bArr != null) {
                            }
                            str4 = str3;
                            if (str4 != null) {
                            }
                        } catch (IOException e6) {
                            e4 = e6;
                            rG2GI7LDp3 = kcmdrqwce.tGV7Q6urW;
                            i = 7;
                            rG2GI7LDp3.q3BipwRCk(i, e4);
                            fzkoojkuvArr = kcmdrqwce.Puu3Rhg4F;
                            byte[] bArr32 = kcmdrqwce.dIocxURUo;
                            if (fzkoojkuvArr != null) {
                            }
                            r5 = 0;
                            bArr = kcmdrqwce.yWvV4ePLl;
                            if (bArr != null) {
                            }
                            str4 = str3;
                            if (str4 != null) {
                            }
                        } catch (IllegalStateException e7) {
                            e4 = e7;
                            rG2GI7LDp3 = kcmdrqwce.tGV7Q6urW;
                            i = 8;
                            rG2GI7LDp3.q3BipwRCk(i, e4);
                            fzkoojkuvArr = kcmdrqwce.Puu3Rhg4F;
                            byte[] bArr322 = kcmdrqwce.dIocxURUo;
                            if (fzkoojkuvArr != null) {
                            }
                            r5 = 0;
                            bArr = kcmdrqwce.yWvV4ePLl;
                            if (bArr != null) {
                            }
                            str4 = str3;
                            if (str4 != null) {
                            }
                        }
                    }
                    fzkoojkuvArr = kcmdrqwce.Puu3Rhg4F;
                    byte[] bArr3222 = kcmdrqwce.dIocxURUo;
                    if (fzkoojkuvArr != null || bArr3222 == null) {
                        r5 = 0;
                    } else {
                        kcmdrqwce.q3BipwRCk();
                        try {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(TPBenUP2q.q3BipwRCk);
                                    byteArrayOutputStream.write(bArr3222);
                                    try {
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th7) {
                                            th3.addSuppressed(th7);
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th8) {
                                    th3 = th8;
                                }
                            } catch (IOException e8) {
                                e3 = e8;
                                str2 = null;
                                rG2GI7LDp2 = kcmdrqwce.tGV7Q6urW;
                                i4 = 7;
                                str = str2;
                                rG2GI7LDp2.q3BipwRCk(i4, e3);
                                fzkoojkuvArr2 = str;
                                kcmdrqwce.Puu3Rhg4F = fzkoojkuvArr2;
                                r5 = fzkoojkuvArr2;
                                bArr = kcmdrqwce.yWvV4ePLl;
                                if (bArr != null) {
                                }
                                str4 = str3;
                                if (str4 != null) {
                                }
                            } catch (IllegalStateException e9) {
                                e3 = e9;
                                str2 = null;
                                rG2GI7LDp2 = kcmdrqwce.tGV7Q6urW;
                                str = str2;
                                rG2GI7LDp2.q3BipwRCk(i4, e3);
                                fzkoojkuvArr2 = str;
                                kcmdrqwce.Puu3Rhg4F = fzkoojkuvArr2;
                                r5 = fzkoojkuvArr2;
                                bArr = kcmdrqwce.yWvV4ePLl;
                                if (bArr != null) {
                                }
                                str4 = str3;
                                if (str4 != null) {
                                }
                            }
                        } catch (IOException e10) {
                            e3 = e10;
                            rG2GI7LDp2 = kcmdrqwce.tGV7Q6urW;
                            i4 = 7;
                            str = str2;
                            rG2GI7LDp2.q3BipwRCk(i4, e3);
                            fzkoojkuvArr2 = str;
                            kcmdrqwce.Puu3Rhg4F = fzkoojkuvArr2;
                            r5 = fzkoojkuvArr2;
                            bArr = kcmdrqwce.yWvV4ePLl;
                            if (bArr != null) {
                            }
                            str4 = str3;
                            if (str4 != null) {
                            }
                        } catch (IllegalStateException e11) {
                            e3 = e11;
                            rG2GI7LDp2 = kcmdrqwce.tGV7Q6urW;
                            str = str2;
                            rG2GI7LDp2.q3BipwRCk(i4, e3);
                            fzkoojkuvArr2 = str;
                            kcmdrqwce.Puu3Rhg4F = fzkoojkuvArr2;
                            r5 = fzkoojkuvArr2;
                            bArr = kcmdrqwce.yWvV4ePLl;
                            if (bArr != null) {
                            }
                            str4 = str3;
                            if (str4 != null) {
                            }
                        }
                        if (!TPBenUP2q.yWvV4ePLl(byteArrayOutputStream, bArr3222, fzkoojkuvArr)) {
                            AbstractC0006RG2GI7LDp rG2GI7LDp4 = kcmdrqwce.tGV7Q6urW;
                            r5 = 0;
                            rG2GI7LDp4.q3BipwRCk(5, null);
                            kcmdrqwce.Puu3Rhg4F = null;
                            byteArrayOutputStream.close();
                        } else {
                            fzkoojkuvArr2 = 0;
                            kcmdrqwce.yWvV4ePLl = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            kcmdrqwce.Puu3Rhg4F = fzkoojkuvArr2;
                            r5 = fzkoojkuvArr2;
                        }
                    }
                    bArr = kcmdrqwce.yWvV4ePLl;
                    if (bArr != null) {
                        str3 = null;
                    } else {
                        try {
                            kcmdrqwce.q3BipwRCk();
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                                } catch (FileNotFoundException e12) {
                                    e = e12;
                                    kcmdrqwce.J4Ux7ym32(6, e);
                                    str4 = str3;
                                    if (str4 != null) {
                                    }
                                } catch (IOException e13) {
                                    e2 = e13;
                                    kcmdrqwce.J4Ux7ym32(7, e2);
                                    str4 = str3;
                                    if (str4 != null) {
                                    }
                                }
                            } catch (FileNotFoundException e14) {
                                e = e14;
                                str3 = null;
                                kcmdrqwce.J4Ux7ym32(6, e);
                                str4 = str3;
                                if (str4 != null) {
                                }
                            } catch (IOException e15) {
                                e2 = e15;
                                str3 = null;
                                kcmdrqwce.J4Ux7ym32(7, e2);
                                str4 = str3;
                                if (str4 != null) {
                                }
                            }
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(kcmdrqwce.kCA6Zs9sL);
                                try {
                                    try {
                                        bArr2 = new byte[512];
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                    }
                                    while (true) {
                                        int read = byteArrayInputStream.read(bArr2);
                                        if (read <= 0) {
                                            break;
                                        }
                                        try {
                                            fileOutputStream.write(bArr2, 0, read);
                                        } catch (Throwable th10) {
                                            th2 = th10;
                                        }
                                        th2 = th10;
                                        fileOutputStream.close();
                                        throw th2;
                                    }
                                    kcmdrqwce.J4Ux7ym32(1, r5);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    if (str4 != null) {
                                        try {
                                            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
                                            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                                            dataOutputStream.close();
                                            return;
                                        } catch (IOException unused2) {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Throwable th12) {
                                        th.addSuppressed(th12);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                            }
                        } finally {
                            kcmdrqwce.yWvV4ePLl = r5;
                            kcmdrqwce.Puu3Rhg4F = r5;
                        }
                    }
                    str4 = str3;
                    if (str4 != null) {
                    }
                } else {
                    return;
                }
            }
            kcmdrqwce.J4Ux7ym32(i2, num);
            z2 = false;
            if (!z2) {
            }
        } catch (PackageManager.NameNotFoundException e16) {
            rG2GI7LDp.q3BipwRCk(7, e16);
        }
    }
}
