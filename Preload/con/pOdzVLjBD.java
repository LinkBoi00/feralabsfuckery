package con;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public class pOdzVLjBD extends InputConnectionWrapper {
    public final /* synthetic */ G9VdDqs1M J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pOdzVLjBD(InputConnection inputConnection, boolean z, G9VdDqs1M g9VdDqs1M, int i) {
        super(inputConnection, z);
        this.q3BipwRCk = i;
        if (i != 1) {
            this.J4Ux7ym32 = g9VdDqs1M;
            return;
        }
        this.J4Ux7ym32 = g9VdDqs1M;
        super(inputConnection, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        iFKnyAZAM ifknyazam;
        switch (this.q3BipwRCk) {
            case 0:
                G9VdDqs1M g9VdDqs1M = this.J4Ux7ym32;
                if (inputContentInfo == null) {
                    ifknyazam = null;
                } else {
                    ifknyazam = new iFKnyAZAM((TJkYEZky4) new iFKnyAZAM(inputContentInfo));
                }
                if (g9VdDqs1M.q3BipwRCk(ifknyazam, i, bundle)) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            default:
                return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        Object[] objArr;
        Throwable th;
        ResultReceiver resultReceiver;
        switch (this.q3BipwRCk) {
            case 1:
                G9VdDqs1M g9VdDqs1M = this.J4Ux7ym32;
                boolean z = false;
                z = false;
                z = false;
                z = false;
                if (bundle != null) {
                    if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                        objArr = null;
                    } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                        objArr = 1;
                    }
                    try {
                        resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != null ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                        try {
                            Uri uri = (Uri) bundle.getParcelable(objArr != null ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != null ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                            Uri uri2 = (Uri) bundle.getParcelable(objArr != null ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                            int i = bundle.getInt(objArr != null ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                            Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != null ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                            if (!(uri == null || clipDescription == null)) {
                                z = g9VdDqs1M.q3BipwRCk(new iFKnyAZAM(uri, clipDescription, uri2, 17), i, bundle2);
                            }
                            if (resultReceiver != null) {
                                int i2 = z ? 1 : 0;
                                int i3 = z ? 1 : 0;
                                int i4 = z ? 1 : 0;
                                int i5 = z ? 1 : 0;
                                int i6 = z ? 1 : 0;
                                int i7 = z ? 1 : 0;
                                resultReceiver.send(i2, null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (resultReceiver != null) {
                                resultReceiver.send(0, null);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        resultReceiver = null;
                    }
                }
                if (z) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            default:
                return super.performPrivateCommand(str, bundle);
        }
    }
}
