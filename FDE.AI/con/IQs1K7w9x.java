package con;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import java.util.ArrayList;
import me.rosuh.filepicker.FilePickerActivity;
/* loaded from: classes.dex */
public final class IQs1K7w9x extends i88cgiFhL {
    public final FilePickerActivity dIocxURUo;
    public final ArrayList kCA6Zs9sL = new ArrayList(3);

    public IQs1K7w9x(FilePickerActivity filePickerActivity) {
        this.dIocxURUo = filePickerActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public RecyclerView.cywn6086a GPLPRo6go(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) viewGroup;
        }
        return new OQsFBQ4lw(this, this.dIocxURUo.getLayoutInflater(), viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public void kCA6Zs9sL(RecyclerView.cywn6086a cywn6086a, int i) {
        xZLHWtbav xzlhwtbav = (xZLHWtbav) this.kCA6Zs9sL.get(i);
        TextView textView = (TextView) ((OQsFBQ4lw) cywn6086a).q3BipwRCk.findViewById(R.id.tv_btn_nav_file_picker);
        if (textView != null) {
            textView.setText(xzlhwtbav.q3BipwRCk);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public int q3BipwRCk() {
        return this.kCA6Zs9sL.size();
    }

    /* renamed from: yWvV4ePLl */
    public xZLHWtbav Puu3Rhg4F(int i) {
        if (i < 0 || i >= this.kCA6Zs9sL.size()) {
            return null;
        }
        return (xZLHWtbav) this.kCA6Zs9sL.get(i);
    }
}
