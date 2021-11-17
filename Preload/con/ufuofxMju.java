package con;

import android.view.ContentInfo;
import android.view.View;
/* loaded from: classes.dex */
public abstract class ufuofxMju {
    public static rZsVaMPDT J4Ux7ym32(View view, rZsVaMPDT rzsvampdt) {
        ContentInfo Puu3Rhg4F = rzsvampdt.q3BipwRCk.Puu3Rhg4F();
        ContentInfo performReceiveContent = view.performReceiveContent(Puu3Rhg4F);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == Puu3Rhg4F) {
            return rzsvampdt;
        }
        return new rZsVaMPDT(new iFKnyAZAM(performReceiveContent));
    }

    public static String[] q3BipwRCk(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static void tGV7Q6urW(View view, String[] strArr, NwQnhQfAW nwQnhQfAW) {
        if (nwQnhQfAW == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new JIKDHRcto(nwQnhQfAW));
        }
    }
}
