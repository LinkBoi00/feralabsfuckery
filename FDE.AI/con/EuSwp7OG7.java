package con;
/* loaded from: classes.dex */
public final class EuSwp7OG7 {
    public int q3BipwRCk;

    public EuSwp7OG7(int i) {
        this.q3BipwRCk = i;
    }

    public final int J4Ux7ym32(W3r8jsmHE w3r8jsmHE) {
        if (!(!w3r8jsmHE.ilHKhw3Yw)) {
            G7WvUK4mQ.tGV7Q6urW("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        } else if (q3BipwRCk()) {
            return this.q3BipwRCk;
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    public final boolean q3BipwRCk() {
        return this.q3BipwRCk != Integer.MIN_VALUE;
    }
}
