package con;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public abstract class Edd3IMDyn extends ZNRZ3lc8t {
    public static boolean kCA6Zs9sL = true;

    public Edd3IMDyn() {
        super(1);
    }

    @Override // con.ZNRZ3lc8t
    @SuppressLint({"NewApi"})
    public void GPLPRo6go(View view, float f) {
        if (kCA6Zs9sL) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                kCA6Zs9sL = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // con.ZNRZ3lc8t
    @SuppressLint({"NewApi"})
    public float dIocxURUo(View view) {
        if (kCA6Zs9sL) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                kCA6Zs9sL = false;
            }
        }
        return view.getAlpha();
    }

    @Override // con.ZNRZ3lc8t
    public void kCA6Zs9sL(View view) {
    }

    @Override // con.ZNRZ3lc8t
    public void q3BipwRCk(View view) {
    }
}
