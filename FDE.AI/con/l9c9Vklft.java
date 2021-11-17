package con;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
/* loaded from: classes.dex */
public final class l9c9Vklft extends Wk9bO57s4 implements gdEmqfwpT {
    public final /* synthetic */ CharSequence Bhmn1KIah;
    public final /* synthetic */ TextPaint PSTqBLTET;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9c9Vklft(int i, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.kmSgne1rO = i;
        this.Bhmn1KIah = charSequence;
        this.PSTqBLTET = textPaint;
    }

    @Override // con.gdEmqfwpT
    public Object GPLPRo6go() {
        TextDirectionHeuristic Bhmn1KIah = D3DEikrvb.Bhmn1KIah(this.kmSgne1rO);
        CharSequence charSequence = this.Bhmn1KIah;
        TextPaint textPaint = this.PSTqBLTET;
        if (!Bhmn1KIah.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, null);
        }
        return null;
    }
}
