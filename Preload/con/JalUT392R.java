package con;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import java.util.Objects;
/* loaded from: classes.dex */
public class JalUT392R extends EditText implements YJr8dt1YN {
    public final SfQ6fqrlg CBQ5d1kRq;
    public final mZIyARhC1 kmSgne1rO;
    public final PlegqbMSA Bhmn1KIah = new PlegqbMSA(this);
    public final R6XB2icpf PSTqBLTET = new R6XB2icpf();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JalUT392R(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GV6EZRqr3.q3BipwRCk(context);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        SfQ6fqrlg sfQ6fqrlg = new SfQ6fqrlg(this);
        this.CBQ5d1kRq = sfQ6fqrlg;
        sfQ6fqrlg.iiGwOFFnr(attributeSet, i);
        mZIyARhC1 mziyarhc1 = new mZIyARhC1(this);
        this.kmSgne1rO = mziyarhc1;
        mziyarhc1.kCA6Zs9sL(attributeSet, i);
        mziyarhc1.J4Ux7ym32();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.q3BipwRCk();
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.dIocxURUo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.kCA6Zs9sL();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        PlegqbMSA plegqbMSA;
        return (Build.VERSION.SDK_INT >= 28 || (plegqbMSA = this.Bhmn1KIah) == null) ? super.getTextClassifier() : plegqbMSA.iiGwOFFnr();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.kmSgne1rO);
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            mF8HEm3Oj.J4Ux7ym32(editorInfo, getText());
        }
        WAflFGuGp.oon79WMrY(onCreateInputConnection, editorInfo, this);
        String[] yWvV4ePLl = IuQbWntsc.yWvV4ePLl(this);
        if (onCreateInputConnection == null || yWvV4ePLl == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = yWvV4ePLl;
        return new pOdzVLjBD(onCreateInputConnection, false, new G9VdDqs1M(this), 0);
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (dragEvent.getLocalState() == null && IuQbWntsc.yWvV4ePLl(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    IuQbWntsc.CBQ5d1kRq(this, (Build.VERSION.SDK_INT >= 31 ? new iFKnyAZAM(clipData, 3, 12) : new tXvnR1bb6(clipData, 3)).dIocxURUo());
                    endBatchEdit();
                    z = true;
                } catch (Throwable th) {
                    endBatchEdit();
                    throw th;
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        int i2 = 0;
        if ((i == 16908322 || i == 16908337) && IuQbWntsc.yWvV4ePLl(this) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                baMQ0cfN8 ifknyazam = Build.VERSION.SDK_INT >= 31 ? new iFKnyAZAM(primaryClip, 1, 12) : new tXvnR1bb6(primaryClip, 1);
                if (i != 16908322) {
                    i2 = 1;
                }
                ifknyazam.ilHKhw3Yw(i2);
                IuQbWntsc.CBQ5d1kRq(this, ifknyazam.dIocxURUo());
            }
            i2 = 1;
        }
        if (i2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // con.YJr8dt1YN
    public rZsVaMPDT q3BipwRCk(rZsVaMPDT rzsvampdt) {
        return this.PSTqBLTET.q3BipwRCk(this, rzsvampdt);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.GPLPRo6go();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.Puu3Rhg4F(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D3DEikrvb.iMyQMM6Qj(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.oon79WMrY(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.vPSbyrYWX(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.iiGwOFFnr(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        PlegqbMSA plegqbMSA;
        if (Build.VERSION.SDK_INT >= 28 || (plegqbMSA = this.Bhmn1KIah) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            plegqbMSA.kmSgne1rO = textClassifier;
        }
    }
}
