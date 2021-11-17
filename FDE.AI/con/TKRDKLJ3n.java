package con;
/* loaded from: classes.dex */
public abstract class TKRDKLJ3n extends LBkrQilnp {
    public final wjjWl3mHt q3BipwRCk;

    public TKRDKLJ3n(wjjWl3mHt wjjwl3mht, dnBSj5uJN dnbsj5ujn) {
        super(null);
        this.q3BipwRCk = wjjwl3mht;
    }

    @Override // con.LBkrQilnp
    public final void GPLPRo6go(C8ZZcTzJg c8ZZcTzJg, Object obj, int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        } else if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                Puu3Rhg4F(c8ZZcTzJg, i3 + i, obj, false);
                if (i4 < i2) {
                    i3 = i4;
                } else {
                    return;
                }
            }
        }
    }

    @Override // con.LBkrQilnp
    public void Puu3Rhg4F(C8ZZcTzJg c8ZZcTzJg, int i, Object obj, boolean z) {
        vPSbyrYWX(obj, i, c8ZZcTzJg.cAwN510t2(q3BipwRCk(), i, this.q3BipwRCk, null));
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public abstract W39e6bnPN q3BipwRCk();

    public abstract void vPSbyrYWX(Object obj, int i, Object obj2);
}
