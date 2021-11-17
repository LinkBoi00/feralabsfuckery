package con;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public final class qFajNU5jN extends wnbPPCp4x {
    public final RNEcgN6dQ Eeka1udhb;
    public boolean dXrmkklc8;

    public qFajNU5jN(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, (i2 & 4) != 0 ? 0 : i);
        this.Eeka1udhb = u51fgFYkV.dIocxURUo(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return qFajNU5jN.class.getName();
    }

    @Override // con.wnbPPCp4x
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.dXrmkklc8;
    }

    @Override // con.wnbPPCp4x
    public void q3BipwRCk(rJ0s9PfCL rj0s9pfcl, int i) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(2083049676);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        kkcQgCx5G kkcqgcx5g = (kkcQgCx5G) ((prCJwNx2x) this.Eeka1udhb).getValue();
        if (kkcqgcx5g != null) {
            kkcqgcx5g.WaUP0CF08(wpxpbwg1j, 0);
        }
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new t7rSdVMuj(this, i);
        }
    }

    public final void setContent(kkcQgCx5G kkcqgcx5g) {
        boolean z = true;
        this.dXrmkklc8 = true;
        ((prCJwNx2x) this.Eeka1udhb).CBQ5d1kRq(kkcqgcx5g);
        if (isAttachedToWindow()) {
            if (this.PSTqBLTET == null && !isAttachedToWindow()) {
                z = false;
            }
            if (z) {
                dIocxURUo();
                return;
            }
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
    }
}
