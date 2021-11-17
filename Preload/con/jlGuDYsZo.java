package con;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class jlGuDYsZo extends RecyclerView.s7MlVynBG {
    public final gBRio1gPW dIocxURUo;

    public jlGuDYsZo(gBRio1gPW gbrio1gpw) {
        this.dIocxURUo = gbrio1gpw;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public RecyclerView.cywn6086a GPLPRo6go(ViewGroup viewGroup, int i) {
        return new GgBCNmZ7l((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int Puu3Rhg4F(int i) {
        return i - this.dIocxURUo.INnK5Rew6.CBQ5d1kRq.Bhmn1KIah;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public void kCA6Zs9sL(RecyclerView.cywn6086a cywn6086a, int i) {
        GgBCNmZ7l ggBCNmZ7l = (GgBCNmZ7l) cywn6086a;
        int i2 = this.dIocxURUo.INnK5Rew6.CBQ5d1kRq.Bhmn1KIah + i;
        String string = ggBCNmZ7l.RG6kpfv3v.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        ggBCNmZ7l.RG6kpfv3v.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        ggBCNmZ7l.RG6kpfv3v.setContentDescription(String.format(string, Integer.valueOf(i2)));
        GB7SBlGiG gB7SBlGiG = this.dIocxURUo.Dr7UqlxEV;
        Calendar dIocxURUo = AepEH275c.dIocxURUo();
        SfQ6fqrlg sfQ6fqrlg = dIocxURUo.get(1) == i2 ? gB7SBlGiG.iiGwOFFnr : gB7SBlGiG.dIocxURUo;
        for (Long l : this.dIocxURUo.KBYw84i3W.oon79WMrY()) {
            dIocxURUo.setTimeInMillis(l.longValue());
            if (dIocxURUo.get(1) == i2) {
                sfQ6fqrlg = gB7SBlGiG.kCA6Zs9sL;
            }
        }
        sfQ6fqrlg.CBQ5d1kRq(ggBCNmZ7l.RG6kpfv3v);
        ggBCNmZ7l.RG6kpfv3v.setOnClickListener(new IGEYjIoNM(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public int q3BipwRCk() {
        return this.dIocxURUo.INnK5Rew6.MzoOEjc4X;
    }
}
