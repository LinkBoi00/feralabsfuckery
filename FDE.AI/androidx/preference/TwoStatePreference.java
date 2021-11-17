package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean IytU16YUK;
    public boolean cAwN510t2;
    public CharSequence dfpT1j18n;
    public boolean i8XZMQc6Z;
    public CharSequence iMyQMM6Qj;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public Object dIocxURUo(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public void iiGwOFFnr(boolean z) {
        boolean z2 = this.i8XZMQc6Z != z;
        if (z2 || !this.cAwN510t2) {
            this.i8XZMQc6Z = z;
            this.cAwN510t2 = true;
            if (z2) {
                kCA6Zs9sL();
            }
        }
    }

    @Override // androidx.preference.Preference
    public boolean kCA6Zs9sL() {
        return (this.IytU16YUK ? this.i8XZMQc6Z : !this.i8XZMQc6Z) || super.kCA6Zs9sL();
    }
}
