package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.feravolt.preload.R;
import con.BaB9IKBYw;
import con.G7WvUK4mQ;
import con.KApR71V3i;
import con.THYOsJ36N;
import con.Wk9bO57s4;
import con.f7VKpcPHS;
import con.gLDxq5bwv;
import con.jfyoqFWxp;
import con.kkcQgCx5G;
import con.qih4lW99W;
import con.rJ0s9PfCL;
import con.u51fgFYkV;
import con.wpXpbWG1J;
import con.xpuSUT7Gh;
import java.util.Set;
/* loaded from: classes.dex */
public final class qhPEQQaQ4 extends Wk9bO57s4 implements kkcQgCx5G {
    public final /* synthetic */ WrappedComposition Bhmn1KIah;
    public final /* synthetic */ kkcQgCx5G PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhPEQQaQ4(WrappedComposition wrappedComposition, kkcQgCx5G kkcqgcx5g, int i) {
        super(2);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = wrappedComposition;
            this.PSTqBLTET = kkcqgcx5g;
            return;
        }
        this.Bhmn1KIah = wrappedComposition;
        this.PSTqBLTET = kkcqgcx5g;
        super(2);
    }

    @Override // con.kkcQgCx5G
    public /* bridge */ /* synthetic */ Object WaUP0CF08(Object obj, Object obj2) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk((rJ0s9PfCL) obj, ((Number) obj2).intValue());
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk((rJ0s9PfCL) obj, ((Number) obj2).intValue());
                return qih4lW99W.q3BipwRCk;
        }
    }

    public final void q3BipwRCk(rJ0s9PfCL rj0s9pfcl, int i) {
        switch (this.kmSgne1rO) {
            case 0:
                Object obj = G7WvUK4mQ.q3BipwRCk;
                if (((i & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j.i8XZMQc6Z()) {
                        wpxpbwg1j.igRQEZxnW();
                        return;
                    }
                }
                KApR71V3i.q3BipwRCk(this.Bhmn1KIah.CBQ5d1kRq, this.PSTqBLTET, rj0s9pfcl, 8);
                return;
            default:
                Object obj2 = G7WvUK4mQ.q3BipwRCk;
                if (((i & 11) ^ 2) == 0) {
                    wpXpbWG1J wpxpbwg1j2 = (wpXpbWG1J) rj0s9pfcl;
                    if (wpxpbwg1j2.i8XZMQc6Z()) {
                        wpxpbwg1j2.igRQEZxnW();
                        return;
                    }
                }
                Object tag = this.Bhmn1KIah.CBQ5d1kRq.getTag(R.id.inspection_slot_table_set);
                Set set = (tag instanceof Set) && (!(tag instanceof f7VKpcPHS) || (tag instanceof jfyoqFWxp)) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.Bhmn1KIah.CBQ5d1kRq.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view == null ? null : view.getTag(R.id.inspection_slot_table_set);
                    set = (tag2 instanceof Set) && (!(tag2 instanceof f7VKpcPHS) || (tag2 instanceof jfyoqFWxp)) ? (Set) tag2 : null;
                }
                if (set != null) {
                    wpXpbWG1J wpxpbwg1j3 = (wpXpbWG1J) rj0s9pfcl;
                    set.add(wpxpbwg1j3.dIocxURUo);
                    wpxpbwg1j3.MzoOEjc4X = true;
                }
                WrappedComposition wrappedComposition = this.Bhmn1KIah;
                gLDxq5bwv.J4Ux7ym32(wrappedComposition.CBQ5d1kRq, new mhl5lIdbQ(wrappedComposition, null), rj0s9pfcl);
                WrappedComposition wrappedComposition2 = this.Bhmn1KIah;
                gLDxq5bwv.J4Ux7ym32(wrappedComposition2.CBQ5d1kRq, new aXI58Y1kr(wrappedComposition2, null), rj0s9pfcl);
                u51fgFYkV.q3BipwRCk(new BaB9IKBYw[]{THYOsJ36N.q3BipwRCk.J4Ux7ym32(set)}, xpuSUT7Gh.qFBXIgpia(rj0s9pfcl, -819888631, true, new qhPEQQaQ4(this.Bhmn1KIah, this.PSTqBLTET, 0)), rj0s9pfcl, 56);
                return;
        }
    }
}
