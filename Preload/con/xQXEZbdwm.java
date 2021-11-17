package con;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.RG2GI7LDp;
/* loaded from: classes.dex */
public class xQXEZbdwm extends iMp2wcpT4 implements ActionProvider.VisibilityListener {
    public iFKnyAZAM dIocxURUo;

    public xQXEZbdwm(wV2TMeIik wv2tmeiik, Context context, ActionProvider actionProvider) {
        super(wv2tmeiik, context, actionProvider);
    }

    @Override // con.iMp2wcpT4
    public View J4Ux7ym32(MenuItem menuItem) {
        return this.J4Ux7ym32.onCreateActionView(menuItem);
    }

    @Override // con.iMp2wcpT4
    public void dIocxURUo(iFKnyAZAM ifknyazam) {
        this.dIocxURUo = ifknyazam;
        this.J4Ux7ym32.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        iFKnyAZAM ifknyazam = this.dIocxURUo;
        if (ifknyazam != null) {
            RG2GI7LDp rG2GI7LDp = ((tDC1iJlG1) ifknyazam.kmSgne1rO).Bhmn1KIah;
            rG2GI7LDp.Puu3Rhg4F = true;
            rG2GI7LDp.MzoOEjc4X(true);
        }
    }

    @Override // con.iMp2wcpT4
    public boolean q3BipwRCk() {
        return this.J4Ux7ym32.isVisible();
    }

    @Override // con.iMp2wcpT4
    public boolean tGV7Q6urW() {
        return this.J4Ux7ym32.overridesItemVisibility();
    }
}
