package con;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final /* synthetic */ class YIbr4kVj6 implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable CBQ5d1kRq;

    public /* synthetic */ YIbr4kVj6(Runnable runnable) {
        this.CBQ5d1kRq = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.CBQ5d1kRq.run();
    }
}
