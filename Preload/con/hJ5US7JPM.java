package con;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class hJ5US7JPM {
    public static final Comparator q3BipwRCk = new wmwYnQyeP();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[LOOP:1: B:14:0x0053->B:27:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009c A[EDGE_INSN: B:76:0x009c->B:29:0x009c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static ffMwHtM6b q3BipwRCk(Context context, SfQ6fqrlg sfQ6fqrlg, CancellationSignal cancellationSignal) {
        Cursor cursor;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) sfQ6fqrlg.J4Ux7ym32;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(UexvVay3o.q3BipwRCk("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals((String) sfQ6fqrlg.tGV7Q6urW)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, q3BipwRCk);
            List list = (List) sfQ6fqrlg.iiGwOFFnr;
            if (list == null) {
                list = pA5wCkne4.MzoOEjc4X(resources, sfQ6fqrlg.dIocxURUo);
            }
            int i = 0;
            while (true) {
                cursor = null;
                if (i >= list.size()) {
                    resolveContentProvider = null;
                    break;
                }
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, q3BipwRCk);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        }
                    }
                    z = true;
                    if (!z) {
                        break;
                    }
                    i++;
                }
                z = false;
                if (!z) {
                }
            }
            if (resolveContentProvider == null) {
                return new ffMwHtM6b(1, null);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) sfQ6fqrlg.kCA6Zs9sL}, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        arrayList3.add(new k9x1izWJn(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                    }
                }
                return new ffMwHtM6b(0, (k9x1izWJn[]) arrayList3.toArray(new k9x1izWJn[0]));
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } else {
            StringBuilder q3BipwRCk2 = eEPBBadYl.q3BipwRCk("Found content provider ", str, ", but package was not ");
            q3BipwRCk2.append((String) sfQ6fqrlg.tGV7Q6urW);
            throw new PackageManager.NameNotFoundException(q3BipwRCk2.toString());
        }
    }
}
