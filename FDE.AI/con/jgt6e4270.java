package con;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class jgt6e4270 implements InputConnection {
    public final boolean J4Ux7ym32;
    public eTxfvEx3L dIocxURUo;
    public boolean iiGwOFFnr;
    public int kCA6Zs9sL;
    public final JNGbWh4Q8 q3BipwRCk;
    public int tGV7Q6urW;
    public final List GPLPRo6go = new ArrayList();
    public boolean Puu3Rhg4F = true;

    public jgt6e4270(eTxfvEx3L etxfvex3l, JNGbWh4Q8 jNGbWh4Q8, boolean z) {
        this.q3BipwRCk = jNGbWh4Q8;
        this.J4Ux7ym32 = z;
        this.dIocxURUo = etxfvex3l;
    }

    public final boolean J4Ux7ym32() {
        int i = this.tGV7Q6urW - 1;
        this.tGV7Q6urW = i;
        if (i == 0 && (!this.GPLPRo6go.isEmpty())) {
            this.q3BipwRCk.q3BipwRCk.dIocxURUo.IytU16YUK(new ArrayList(this.GPLPRo6go));
            this.GPLPRo6go.clear();
        }
        if (this.tGV7Q6urW > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        this.tGV7Q6urW++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.GPLPRo6go.clear();
        this.tGV7Q6urW = 0;
        this.Puu3Rhg4F = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.Puu3Rhg4F;
        return z ? this.J4Ux7ym32 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            q3BipwRCk(new qWIUjul81(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        q3BipwRCk(new RLPskO21n(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        q3BipwRCk(new LsXjuMQ0I(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return J4Ux7ym32();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        q3BipwRCk(new mLzXPvuIJ());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        eTxfvEx3L etxfvex3l = this.dIocxURUo;
        return TextUtils.getCapsMode(etxfvex3l.q3BipwRCk.CBQ5d1kRq, czCYotiRn.GPLPRo6go(etxfvex3l.J4Ux7ym32), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.iiGwOFFnr = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.kCA6Zs9sL = i2;
        }
        return D3DEikrvb.WaUP0CF08(this.dIocxURUo);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (czCYotiRn.tGV7Q6urW(this.dIocxURUo.J4Ux7ym32)) {
            return null;
        }
        return dnBSj5uJN.RG6kpfv3v(this.dIocxURUo).CBQ5d1kRq;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return dnBSj5uJN.ixWaw2akD(this.dIocxURUo, i).CBQ5d1kRq;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return dnBSj5uJN.sk5s77z6Q(this.dIocxURUo, i).CBQ5d1kRq;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "performContextMenuAction is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.Puu3Rhg4F;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", anXlDk6fV.iMyQMM6Qj("IME sends unsupported Editor Action: ", Integer.valueOf(i)));
                        break;
                }
                this.q3BipwRCk.q3BipwRCk.kCA6Zs9sL.IytU16YUK(new exvFNe8oO(i2));
            }
            i2 = 1;
            this.q3BipwRCk.q3BipwRCk.kCA6Zs9sL.IytU16YUK(new exvFNe8oO(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            return true;
        }
        return z;
    }

    public final void q3BipwRCk(wX7bxQPFb wx7bxqpfb) {
        this.tGV7Q6urW++;
        try {
            this.GPLPRo6go.add(wx7bxqpfb);
        } finally {
            J4Ux7ym32();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) this.q3BipwRCk.q3BipwRCk.yWvV4ePLl.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            q3BipwRCk(new qtBXPTlxW(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.Puu3Rhg4F;
        if (z) {
            q3BipwRCk(new PKE9FAfwu(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.Puu3Rhg4F;
        if (!z) {
            return z;
        }
        q3BipwRCk(new JbJAh2tYt(i, i2));
        return true;
    }
}
