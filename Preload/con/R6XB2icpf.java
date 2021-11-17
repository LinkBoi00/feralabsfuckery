package con;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class R6XB2icpf implements NwQnhQfAW {
    public rZsVaMPDT q3BipwRCk(View view, rZsVaMPDT rzsvampdt) {
        CharSequence charSequence;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + rzsvampdt);
        }
        if (rzsvampdt.q3BipwRCk.CBQ5d1kRq() == 2) {
            return rzsvampdt;
        }
        ClipData tGV7Q6urW = rzsvampdt.q3BipwRCk.tGV7Q6urW();
        int GPLPRo6go = rzsvampdt.q3BipwRCk.GPLPRo6go();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < tGV7Q6urW.getItemCount(); i++) {
            ClipData.Item itemAt = tGV7Q6urW.getItemAt(i);
            if ((GPLPRo6go & 1) != 0) {
                charSequence = itemAt.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence = charSequence.toString();
                }
            } else {
                charSequence = itemAt.coerceToStyledText(context);
            }
            if (charSequence != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, charSequence);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequence);
                }
            }
        }
        return null;
    }
}
