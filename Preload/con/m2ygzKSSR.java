package con;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me.rosuh.filepicker.FilePickerActivity;
/* loaded from: classes.dex */
public final class m2ygzKSSR extends i88cgiFhL {
    public mBzZm787K GPLPRo6go;
    public final FilePickerActivity dIocxURUo;
    public final ArrayList kCA6Zs9sL = new ArrayList(10);
    public int iiGwOFFnr = -1;
    public final llWJsfBCK Puu3Rhg4F = anXlDk6fV.ixWaw2akD(ZKEa6x2aW.IytU16YUK);

    public m2ygzKSSR(FilePickerActivity filePickerActivity, boolean z) {
        this.dIocxURUo = filePickerActivity;
    }

    public final void CBQ5d1kRq(int i) {
        mSiW1fbBz vPSbyrYWX = Puu3Rhg4F(i);
        if (vPSbyrYWX != null) {
            vPSbyrYWX.tGV7Q6urW = false;
            this.q3BipwRCk.tGV7Q6urW(i, 1, Boolean.FALSE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public RecyclerView.cywn6086a GPLPRo6go(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) viewGroup;
        }
        return new aPuKVn61T(this, LayoutInflater.from(this.dIocxURUo).inflate(R.layout.item_list_file_picker, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public void iiGwOFFnr(RecyclerView.cywn6086a cywn6086a, int i, List list) {
        if (list.isEmpty()) {
            kCA6Zs9sL(cywn6086a, i);
            return;
        }
        aPuKVn61T apukvn61t = (aPuKVn61T) cywn6086a;
        mSiW1fbBz vPSbyrYWX = Puu3Rhg4F(i);
        boolean z = vPSbyrYWX == null ? false : vPSbyrYWX.tGV7Q6urW;
        HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
        Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
        apukvn61t.sk5s77z6Q.setChecked(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
        if (r9 == null) goto L_0x00ff;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
        if (r9 != null) goto L_0x00fb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
        r2 = r9.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ff, code lost:
        r8.setImageResource(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void kCA6Zs9sL(RecyclerView.cywn6086a cywn6086a, int i) {
        int i2;
        int i3;
        ImageView imageView;
        Integer num;
        aPuKVn61T apukvn61t = (aPuKVn61T) cywn6086a;
        mSiW1fbBz msiw1fbbz = (mSiW1fbBz) this.kCA6Zs9sL.get(i);
        apukvn61t.ixWaw2akD.setText(msiw1fbbz.q3BipwRCk);
        CheckBox checkBox = apukvn61t.sk5s77z6Q;
        checkBox.setTag(msiw1fbbz);
        boolean z = false;
        if (!apukvn61t.RG6kpfv3v || !msiw1fbbz.kCA6Zs9sL) {
            HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
            Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
            i2 = 0;
        } else {
            i2 = 8;
        }
        checkBox.setVisibility(i2);
        checkBox.setOnCheckedChangeListener(new fajPrLrSQ(checkBox, msiw1fbbz, apukvn61t, i));
        checkBox.setChecked(msiw1fbbz.tGV7Q6urW);
        RadioButton radioButton = apukvn61t.i8XZMQc6Z;
        radioButton.setTag(msiw1fbbz);
        if (!apukvn61t.RG6kpfv3v || !msiw1fbbz.kCA6Zs9sL) {
            HZDtN0XJv hZDtN0XJv2 = HZDtN0XJv.q3BipwRCk;
            Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
        }
        radioButton.setVisibility(8);
        radioButton.setOnCheckedChangeListener(new fajPrLrSQ(radioButton, msiw1fbbz, apukvn61t, i));
        radioButton.setChecked(msiw1fbbz.tGV7Q6urW);
        if (msiw1fbbz.kCA6Zs9sL) {
            imageView = apukvn61t.WaUP0CF08;
            i3 = R.drawable.ic_folder_file_picker;
        } else {
            xkFni34F4 xkfni34f4 = msiw1fbbz.dIocxURUo;
            FProNd3NJ fProNd3NJ = null;
            if (xkfni34f4 == null) {
                num = null;
            } else {
                num = Integer.valueOf(xkfni34f4.q3BipwRCk());
            }
            int i4 = R.drawable.ic_unknown_file_picker;
            i3 = num == null ? R.drawable.ic_unknown_file_picker : num.intValue();
            xkFni34F4 xkfni34f42 = msiw1fbbz.dIocxURUo;
            if (xkfni34f42 instanceof L7CzPv7JL ? true : xkfni34f42 instanceof QcsmVOjjR) {
                IY2qRSx7X iY2qRSx7X = IY2qRSx7X.q3BipwRCk;
                FilePickerActivity filePickerActivity = apukvn61t.dfpT1j18n.dIocxURUo;
                ImageView imageView2 = apukvn61t.WaUP0CF08;
                String str = msiw1fbbz.J4Ux7ym32;
                Integer valueOf = Integer.valueOf(i3);
                if (IY2qRSx7X.dIocxURUo == null) {
                    HZDtN0XJv hZDtN0XJv3 = HZDtN0XJv.q3BipwRCk;
                    Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                    if (((Boolean) ((Ka0YY9gOW) IY2qRSx7X.J4Ux7ym32).getValue()).booleanValue()) {
                        fProNd3NJ = new t88cbG83c();
                    } else if (((Boolean) ((Ka0YY9gOW) IY2qRSx7X.tGV7Q6urW).getValue()).booleanValue()) {
                        fProNd3NJ = new KGIEv8RD5();
                    }
                    IY2qRSx7X.dIocxURUo = fProNd3NJ;
                    if (fProNd3NJ != null) {
                        z = true;
                    }
                    if (!z) {
                    }
                }
                try {
                    FProNd3NJ fProNd3NJ2 = IY2qRSx7X.dIocxURUo;
                    if (fProNd3NJ2 != null) {
                        fProNd3NJ2.q3BipwRCk(filePickerActivity, imageView2, str, valueOf == null ? R.drawable.ic_unknown_file_picker : valueOf.intValue());
                        return;
                    }
                    return;
                } catch (NoSuchMethodError unused) {
                    Log.d("ImageLoadController", "AndroidFilePicker throw NoSuchMethodError which means current Glide version was not supported. \nWe recommend using 4.9+ or you should implements your own ImageEngine.\nRef:https://github.com/rosuH/AndroidFilePicker/issues/76");
                }
            } else {
                imageView = apukvn61t.WaUP0CF08;
            }
        }
        imageView.setImageResource(i3);
    }

    public final qIxSZWcre oon79WMrY() {
        return (qIxSZWcre) this.Puu3Rhg4F.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public int q3BipwRCk() {
        return this.kCA6Zs9sL.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public int tGV7Q6urW(int i) {
        return 10001;
    }

    /* renamed from: vPSbyrYWX */
    public mSiW1fbBz Puu3Rhg4F(int i) {
        if (i < 0 || i >= this.kCA6Zs9sL.size()) {
            return null;
        }
        return (mSiW1fbBz) this.kCA6Zs9sL.get(i);
    }

    public final int yWvV4ePLl() {
        return oon79WMrY().size();
    }
}
