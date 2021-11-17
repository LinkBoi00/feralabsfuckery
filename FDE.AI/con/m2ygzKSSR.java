package con;

import android.view.LayoutInflater;
import android.view.ViewGroup;
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
    public void kCA6Zs9sL(androidx.recyclerview.widget.RecyclerView.cywn6086a r8, int r9) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: con.m2ygzKSSR.kCA6Zs9sL(androidx.recyclerview.widget.RecyclerView$cywn6086a, int):void");
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
