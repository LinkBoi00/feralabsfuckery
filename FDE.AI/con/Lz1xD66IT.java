package con;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* loaded from: classes.dex */
public class Lz1xD66IT extends Handler {
    public Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public Lz1xD66IT(DialogInterface dialogInterface) {
        this.J4Ux7ym32 = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.q3BipwRCk) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.J4Ux7ym32).get(), message.what);
                    return;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                } else {
                    return;
                }
            default:
                int i2 = message.what;
                if (i2 == 1) {
                    K6PL0z3I0.q3BipwRCk(this.J4Ux7ym32);
                    throw null;
                } else if (i2 == 2) {
                    K6PL0z3I0.q3BipwRCk(this.J4Ux7ym32);
                    Objects.requireNonNull(null);
                    throw null;
                } else if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                } else {
                    K6PL0z3I0.q3BipwRCk(this.J4Ux7ym32);
                    throw null;
                }
        }
    }
}
