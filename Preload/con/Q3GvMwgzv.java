package con;

import android.os.Message;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class Q3GvMwgzv implements View.OnClickListener {
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public final /* synthetic */ Object kmSgne1rO;

    public Q3GvMwgzv(AlertController alertController) {
        this.kmSgne1rO = alertController;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Message message;
        PasswordTransformationMethod passwordTransformationMethod = null;
        r1 = null;
        Message message2 = null;
        switch (this.CBQ5d1kRq) {
            case 0:
                AlertController alertController = (AlertController) this.kmSgne1rO;
                if ((view == alertController.PSTqBLTET && (message = alertController.ilHKhw3Yw) != null) || ((view == alertController.Eeka1udhb && (message = alertController.RG6kpfv3v) != null) || (view == alertController.sk5s77z6Q && (message = alertController.i8XZMQc6Z) != null))) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                AlertController alertController2 = (AlertController) this.kmSgne1rO;
                alertController2.TyB1UUd72.obtainMessage(1, alertController2.J4Ux7ym32).sendToTarget();
                return;
            case 1:
                WQpIMzWun wQpIMzWun = ((ErB1wWwOl) this.kmSgne1rO).kCA6Zs9sL;
                if (wQpIMzWun != null) {
                    wQpIMzWun.dismiss();
                    return;
                }
                return;
            case 2:
                Editable text = ((vC6Qh7mvD) this.kmSgne1rO).q3BipwRCk.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                ((vC6Qh7mvD) this.kmSgne1rO).q3BipwRCk.ilHKhw3Yw();
                return;
            case 3:
                rf3cOyxnl.GPLPRo6go((rf3cOyxnl) this.kmSgne1rO, (AutoCompleteTextView) ((rf3cOyxnl) this.kmSgne1rO).q3BipwRCk.getEditText());
                return;
            default:
                EditText editText = ((eV9inabdD) this.kmSgne1rO).q3BipwRCk.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (!eV9inabdD.dIocxURUo((eV9inabdD) this.kmSgne1rO)) {
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                    ((eV9inabdD) this.kmSgne1rO).q3BipwRCk.ilHKhw3Yw();
                    return;
                }
                return;
        }
    }

    public Q3GvMwgzv(ErB1wWwOl erB1wWwOl) {
        this.kmSgne1rO = erB1wWwOl;
    }

    public Q3GvMwgzv(vC6Qh7mvD vc6qh7mvd) {
        this.kmSgne1rO = vc6qh7mvd;
    }

    public Q3GvMwgzv(rf3cOyxnl rf3coyxnl) {
        this.kmSgne1rO = rf3coyxnl;
    }

    public Q3GvMwgzv(eV9inabdD ev9inabdd) {
        this.kmSgne1rO = ev9inabdd;
    }
}
