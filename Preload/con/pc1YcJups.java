package con;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.mhl5lIdbQ;
/* loaded from: classes.dex */
public abstract class pc1YcJups extends Activity implements BgHiMFrEI, PXqoNfOJ8 {
    public N0a4Shkkl CBQ5d1kRq = new N0a4Shkkl(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !qXUxYxCuO.q3BipwRCk(decorView, keyEvent)) {
            return qXUxYxCuO.J4Ux7ym32(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !qXUxYxCuO.q3BipwRCk(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B0ROL5sm5.tGV7Q6urW(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        N0a4Shkkl n0a4Shkkl = this.CBQ5d1kRq;
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq = mhl5lIdbQ.EnumC0005mhl5lIdbQ.CREATED;
        n0a4Shkkl.dIocxURUo("markState");
        n0a4Shkkl.dIocxURUo("setCurrentState");
        n0a4Shkkl.GPLPRo6go(mhl5lidbq);
        super.onSaveInstanceState(bundle);
    }

    @Override // con.PXqoNfOJ8
    public boolean tGV7Q6urW(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
