package con;
/* loaded from: classes.dex */
public enum ftmnXRQmW implements Mf8l3AEb0 {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    public boolean q3BipwRCk() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                throw new dnCerKhAM();
            }
        }
        return false;
    }
}
