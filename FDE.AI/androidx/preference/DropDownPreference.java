package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter CpG0imbht;
    public final Context IytU16YUK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.IytU16YUK = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.CpG0imbht = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.i8XZMQc6Z;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.CpG0imbht.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void tGV7Q6urW() {
        ArrayAdapter arrayAdapter = this.CpG0imbht;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
