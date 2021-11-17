package con;

import android.graphics.PathMeasure;
/* loaded from: classes.dex */
public final class f34QVUq2J {
    public final PathMeasure q3BipwRCk;

    public f34QVUq2J(PathMeasure pathMeasure) {
        this.q3BipwRCk = pathMeasure;
    }

    public boolean q3BipwRCk(float f, float f2, A128gLXzp a128gLXzp, boolean z) {
        PathMeasure pathMeasure = this.q3BipwRCk;
        if (a128gLXzp instanceof Q3Qxqu4re) {
            return pathMeasure.getSegment(f, f2, ((Q3Qxqu4re) a128gLXzp).q3BipwRCk, z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
