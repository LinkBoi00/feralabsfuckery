package con;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class SdmiF4e4J {
    public static final /* synthetic */ AtomicReferenceFieldUpdater J4Ux7ym32 = AtomicReferenceFieldUpdater.newUpdater(SdmiF4e4J.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater tGV7Q6urW = AtomicIntegerFieldUpdater.newUpdater(SdmiF4e4J.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater dIocxURUo = AtomicIntegerFieldUpdater.newUpdater(SdmiF4e4J.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater kCA6Zs9sL = AtomicIntegerFieldUpdater.newUpdater(SdmiF4e4J.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray q3BipwRCk = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final long GPLPRo6go(SdmiF4e4J sdmiF4e4J) {
        int i = sdmiF4e4J.consumerIndex;
        int i2 = sdmiF4e4J.producerIndex;
        AtomicReferenceArray atomicReferenceArray = sdmiF4e4J.q3BipwRCk;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (sdmiF4e4J.blockingTasksInBuffer == 0) {
                break;
            }
            P3AfVviyS p3AfVviyS = (P3AfVviyS) atomicReferenceArray.get(i3);
            if (p3AfVviyS != null) {
                if (p3AfVviyS.kmSgne1rO.kCA6Zs9sL() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, p3AfVviyS, null)) {
                    kCA6Zs9sL.decrementAndGet(sdmiF4e4J);
                    q3BipwRCk(p3AfVviyS, false);
                    return -1;
                }
            }
            i++;
        }
        return Puu3Rhg4F(sdmiF4e4J, true);
    }

    public final P3AfVviyS J4Ux7ym32(P3AfVviyS p3AfVviyS) {
        boolean z = true;
        if (p3AfVviyS.kmSgne1rO.kCA6Zs9sL() != 1) {
            z = false;
        }
        if (z) {
            kCA6Zs9sL.incrementAndGet(this);
        }
        if (tGV7Q6urW() == 127) {
            return p3AfVviyS;
        }
        int i = this.producerIndex & 127;
        while (this.q3BipwRCk.get(i) != null) {
            Thread.yield();
        }
        this.q3BipwRCk.lazySet(i, p3AfVviyS);
        tGV7Q6urW.incrementAndGet(this);
        return null;
    }

    public final long Puu3Rhg4F(SdmiF4e4J sdmiF4e4J, boolean z) {
        P3AfVviyS p3AfVviyS;
        do {
            p3AfVviyS = (P3AfVviyS) sdmiF4e4J.lastScheduledTask;
            if (p3AfVviyS == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (p3AfVviyS.kmSgne1rO.kCA6Zs9sL() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            Objects.requireNonNull((NjBZSsY6P) wq9HUSqWV.kCA6Zs9sL);
            long nanoTime = System.nanoTime() - p3AfVviyS.CBQ5d1kRq;
            long j = wq9HUSqWV.q3BipwRCk;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!J4Ux7ym32.compareAndSet(sdmiF4e4J, p3AfVviyS, null));
        q3BipwRCk(p3AfVviyS, false);
        return -1;
    }

    public final int dIocxURUo() {
        return this.lastScheduledTask != null ? tGV7Q6urW() + 1 : tGV7Q6urW();
    }

    public final P3AfVviyS iiGwOFFnr() {
        P3AfVviyS p3AfVviyS;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (dIocxURUo.compareAndSet(this, i, i + 1) && (p3AfVviyS = (P3AfVviyS) this.q3BipwRCk.getAndSet(i2, null)) != null) {
                boolean z = true;
                if (p3AfVviyS.kmSgne1rO.kCA6Zs9sL() != 1) {
                    z = false;
                }
                if (z) {
                    kCA6Zs9sL.decrementAndGet(this);
                }
                return p3AfVviyS;
            }
        }
    }

    public final P3AfVviyS kCA6Zs9sL() {
        P3AfVviyS p3AfVviyS = (P3AfVviyS) J4Ux7ym32.getAndSet(this, null);
        return p3AfVviyS == null ? iiGwOFFnr() : p3AfVviyS;
    }

    public final P3AfVviyS q3BipwRCk(P3AfVviyS p3AfVviyS, boolean z) {
        if (z) {
            return J4Ux7ym32(p3AfVviyS);
        }
        P3AfVviyS p3AfVviyS2 = (P3AfVviyS) J4Ux7ym32.getAndSet(this, p3AfVviyS);
        if (p3AfVviyS2 == null) {
            return null;
        }
        return J4Ux7ym32(p3AfVviyS2);
    }

    public final int tGV7Q6urW() {
        return this.producerIndex - this.consumerIndex;
    }
}
