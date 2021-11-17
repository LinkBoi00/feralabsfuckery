package con;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.feravolt.preload.R;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class d3ICzDunv extends BaseAdapter {
    public final int Bhmn1KIah;
    public final Calendar CBQ5d1kRq;
    public final int kmSgne1rO;

    public d3ICzDunv() {
        Calendar kCA6Zs9sL = AepEH275c.kCA6Zs9sL();
        this.CBQ5d1kRq = kCA6Zs9sL;
        this.kmSgne1rO = kCA6Zs9sL.getMaximum(7);
        this.Bhmn1KIah = kCA6Zs9sL.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.kmSgne1rO;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.kmSgne1rO;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.Bhmn1KIah;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.CBQ5d1kRq;
        int i2 = i + this.Bhmn1KIah;
        int i3 = this.kmSgne1rO;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.CBQ5d1kRq.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.CBQ5d1kRq.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
