package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import con.abGBwSu8x;
import con.dtGksSk0f;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class RG2GI7LDp {
    public Bundle J4Ux7ym32;
    public Recreator.RG2GI7LDp dIocxURUo;
    public boolean tGV7Q6urW;
    public dtGksSk0f q3BipwRCk = new dtGksSk0f();
    public boolean kCA6Zs9sL = true;

    /* renamed from: androidx.savedstate.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public interface AbstractC0008RG2GI7LDp {
    }

    /* loaded from: classes.dex */
    public interface mhl5lIdbQ {
        Bundle q3BipwRCk();
    }

    public void J4Ux7ym32(String str, mhl5lIdbQ mhl5lidbq) {
        if (((mhl5lIdbQ) this.q3BipwRCk.GPLPRo6go(str, mhl5lidbq)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public Bundle q3BipwRCk(String str) {
        if (this.tGV7Q6urW) {
            Bundle bundle = this.J4Ux7ym32;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.J4Ux7ym32.remove(str);
            if (this.J4Ux7ym32.isEmpty()) {
                this.J4Ux7ym32 = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void tGV7Q6urW(Class cls) {
        if (this.kCA6Zs9sL) {
            if (this.dIocxURUo == null) {
                this.dIocxURUo = new Recreator.RG2GI7LDp(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.RG2GI7LDp rG2GI7LDp = this.dIocxURUo;
                rG2GI7LDp.q3BipwRCk.add(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Class");
                q3BipwRCk.append(cls.getSimpleName());
                q3BipwRCk.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(q3BipwRCk.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
