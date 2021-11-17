package con;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import java.util.Objects;
/* loaded from: classes.dex */
public class MDLhPd9k8 extends Filter {
    public hHINWnUAQ q3BipwRCk;

    public MDLhPd9k8(hHINWnUAQ hhinwnuaq) {
        this.q3BipwRCk = hhinwnuaq;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((Y8Y0XSE4A) this.q3BipwRCk).tGV7Q6urW((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // android.widget.Filter
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        Y8Y0XSE4A y8y0xse4a = (Y8Y0XSE4A) this.q3BipwRCk;
        Objects.requireNonNull(y8y0xse4a);
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (y8y0xse4a.sk5s77z6Q.getVisibility() == 0 && y8y0xse4a.sk5s77z6Q.getWindowVisibility() == 0) {
            try {
                cursor = y8y0xse4a.GPLPRo6go(y8y0xse4a.WaUP0CF08, charSequence2, 50);
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        hHINWnUAQ hhinwnuaq = this.q3BipwRCk;
        Cursor cursor = ((IkIPSLCvr) hhinwnuaq).Bhmn1KIah;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((Y8Y0XSE4A) hhinwnuaq).J4Ux7ym32((Cursor) obj);
        }
    }
}
