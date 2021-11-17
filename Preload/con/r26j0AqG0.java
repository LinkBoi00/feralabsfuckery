package con;
/* loaded from: classes.dex */
public final class r26j0AqG0 implements wjjWl3mHt {
    public final llWJsfBCK J4Ux7ym32 = anXlDk6fV.RG6kpfv3v(2, new nwvyEZJPU(this));
    public final WwFGbLVWX q3BipwRCk;

    public r26j0AqG0(WwFGbLVWX wwFGbLVWX) {
        this.q3BipwRCk = wwFGbLVWX;
    }

    @Override // con.NWqEIvIkR
    public final Object J4Ux7ym32(voBnBA4S1 vobnba4s1) {
        C8ZZcTzJg kmSgne1rO = vobnba4s1.kmSgne1rO(q3BipwRCk());
        try {
            if (!kmSgne1rO.sk5s77z6Q()) {
                String str = null;
                while (true) {
                    int oon79WMrY = kmSgne1rO.oon79WMrY(q3BipwRCk());
                    if (oon79WMrY == -1) {
                        throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Polymorphic value has not been read for class ", str).toString());
                    } else if (oon79WMrY == 0) {
                        str = kmSgne1rO.qVUwofr5s(q3BipwRCk(), oon79WMrY);
                    } else if (oon79WMrY != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(oon79WMrY);
                        throw new oPOFYJ4Sr(sb.toString());
                    } else if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    } else {
                        cOutqbkMD.kCA6Zs9sL(this, kmSgne1rO, str);
                        throw null;
                    }
                }
            } else {
                tGV7Q6urW(kmSgne1rO);
                throw null;
            }
        } finally {
            throw th;
        }
    }

    @Override // con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return (W39e6bnPN) this.J4Ux7ym32.getValue();
    }

    public final Object tGV7Q6urW(C8ZZcTzJg c8ZZcTzJg) {
        cOutqbkMD.kCA6Zs9sL(this, c8ZZcTzJg, c8ZZcTzJg.qVUwofr5s(q3BipwRCk(), 0));
        throw null;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
