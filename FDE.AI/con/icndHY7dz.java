package con;
/* loaded from: classes.dex */
public abstract class icndHY7dz {
    public static final BgIsSUB3d J4Ux7ym32;
    public static final float q3BipwRCk = (float) 30;
    public static final BgIsSUB3d tGV7Q6urW;

    static {
        int i = BgIsSUB3d.Puu3Rhg4F;
        H11ySchUh h11ySchUh = H11ySchUh.CBQ5d1kRq;
        J4Ux7ym32 = gThLCaTO1.yWvV4ePLl(h11ySchUh, new cL1tMaQbr());
        tGV7Q6urW = gThLCaTO1.yWvV4ePLl(h11ySchUh, new pGzrEnqEh(0));
    }

    public static final void q3BipwRCk(long j, boolean z) {
        boolean z2 = true;
        if (z) {
            if (K5PjwoFCN.Puu3Rhg4F(j) == Integer.MAX_VALUE) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Nesting scrollable in the same direction layouts like LazyColumn and Column(Modifier.verticalScroll()) is not allowed. If you want to add a header before the list of items please take a look on LazyColumn component which has a DSL api which allows to first add a header via item() function and then the list of items via items().".toString());
            }
            return;
        }
        if (K5PjwoFCN.yWvV4ePLl(j) == Integer.MAX_VALUE) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Nesting scrollable in the same direction layouts like LazyRow and Row(Modifier.horizontalScroll() is not allowed. If you want to add a header before the list of items please take a look on LazyRow component which has a DSL api which allows to first add a fixed element via item() function and then the list of items via items().".toString());
        }
    }
}
