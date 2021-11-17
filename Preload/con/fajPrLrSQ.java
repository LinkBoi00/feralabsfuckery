package con;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
/* loaded from: classes.dex */
public final /* synthetic */ class fajPrLrSQ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ aPuKVn61T dIocxURUo;
    public final /* synthetic */ int q3BipwRCk = 0;
    public final /* synthetic */ mSiW1fbBz tGV7Q6urW;

    public /* synthetic */ fajPrLrSQ(CheckBox checkBox, mSiW1fbBz msiw1fbbz, aPuKVn61T apukvn61t, int i) {
        this.J4Ux7ym32 = checkBox;
        this.tGV7Q6urW = msiw1fbbz;
        this.dIocxURUo = apukvn61t;
    }

    public /* synthetic */ fajPrLrSQ(RadioButton radioButton, mSiW1fbBz msiw1fbbz, aPuKVn61T apukvn61t, int i) {
        this.J4Ux7ym32 = radioButton;
        this.tGV7Q6urW = msiw1fbbz;
        this.dIocxURUo = apukvn61t;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.q3BipwRCk) {
            case 0:
                mSiW1fbBz msiw1fbbz = this.tGV7Q6urW;
                aPuKVn61T apukvn61t = this.dIocxURUo;
                if (anXlDk6fV.tGV7Q6urW(((CheckBox) this.J4Ux7ym32).getTag(), msiw1fbbz)) {
                    apukvn61t.ixWaw2akD(msiw1fbbz, z);
                    return;
                }
                return;
            default:
                mSiW1fbBz msiw1fbbz2 = this.tGV7Q6urW;
                aPuKVn61T apukvn61t2 = this.dIocxURUo;
                if (anXlDk6fV.tGV7Q6urW(((RadioButton) this.J4Ux7ym32).getTag(), msiw1fbbz2)) {
                    apukvn61t2.ixWaw2akD(msiw1fbbz2, z);
                    return;
                }
                return;
        }
    }
}
