package con;

import android.content.Context;
import android.widget.ArrayAdapter;
/* loaded from: classes.dex */
public class guXA4nqtH extends ArrayAdapter {
    public guXA4nqtH(Context context, int i, int i2, CharSequence[] charSequenceArr) {
        super(context, i, i2, (Object[]) null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter, android.widget.BaseAdapter
    public boolean hasStableIds() {
        return true;
    }
}
