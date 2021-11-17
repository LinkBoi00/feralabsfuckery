package con;

import me.rosuh.filepicker.FilePickerActivity;
/* loaded from: classes.dex */
public final class qXjHvgYVH extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ FilePickerActivity Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qXjHvgYVH(FilePickerActivity filePickerActivity, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = filePickerActivity;
            return;
        }
        this.Bhmn1KIah = filePickerActivity;
        super(1);
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                ((Number) obj).intValue();
                FilePickerActivity filePickerActivity = this.Bhmn1KIah;
                int i = FilePickerActivity.j22ftfeNI;
                filePickerActivity.iMyQMM6Qj();
                return qih4lW99W.q3BipwRCk;
            default:
                ((mBzZm787K) obj).q3BipwRCk = new qXjHvgYVH(this.Bhmn1KIah, 0);
                return qih4lW99W.q3BipwRCk;
        }
    }
}
