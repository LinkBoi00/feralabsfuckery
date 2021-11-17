package con;
/* loaded from: classes.dex */
public final class bLkdmTGfs {
    public static final uEb6wTQlg J4Ux7ym32 = new uEb6wTQlg(0);
    public static final bLkdmTGfs tGV7Q6urW = new bLkdmTGfs();
    public final pnuAOe8oh q3BipwRCk = new pnuAOe8oh(new O51H8WtkN[16], 0);

    public final void q3BipwRCk() {
        if (this.q3BipwRCk.oon79WMrY()) {
            pnuAOe8oh pnuaoe8oh = this.q3BipwRCk;
            int i = pnuaoe8oh.Bhmn1KIah;
            if (i > 0) {
                Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
                int i2 = 0;
                do {
                    O51H8WtkN o51H8WtkN = (O51H8WtkN) objArr[i2];
                    KB2jjcOAK IzM1cD9ly = o51H8WtkN.IzM1cD9ly(false);
                    if (IzM1cD9ly == null) {
                        IzM1cD9ly = xpuSUT7Gh.Dr7UqlxEV(o51H8WtkN.MzoOEjc4X, (r4 & 1) != 0 ? new pnuAOe8oh(new pLYbCSTk0[16], 0) : null, false);
                    }
                    if (IzM1cD9ly != null) {
                        p62TZmTyO.AqaWJg0b4(IzM1cD9ly, false);
                    }
                    i2++;
                } while (i2 < i);
                return;
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
