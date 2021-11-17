package con;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public class y0dYoMLsd extends CheckedTextView {
    public static final int[] kmSgne1rO = {16843016};
    public final mZIyARhC1 CBQ5d1kRq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0dYoMLsd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        GV6EZRqr3.q3BipwRCk(context);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        mZIyARhC1 mziyarhc1 = new mZIyARhC1(this);
        this.CBQ5d1kRq = mziyarhc1;
        mziyarhc1.kCA6Zs9sL(attributeSet, 16843720);
        mziyarhc1.J4Ux7ym32();
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(getContext(), attributeSet, kmSgne1rO, 16843720, 0);
        setCheckMarkDrawable(mUqPm6GBh.dXrmkklc8(0));
        mUqPm6GBh.NyWTwPF6V();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        mZIyARhC1 mziyarhc1 = this.CBQ5d1kRq;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        WAflFGuGp.oon79WMrY(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D3DEikrvb.iMyQMM6Qj(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        mZIyARhC1 mziyarhc1 = this.CBQ5d1kRq;
        if (mziyarhc1 != null) {
            mziyarhc1.iiGwOFFnr(context, i);
        }
    }
}
