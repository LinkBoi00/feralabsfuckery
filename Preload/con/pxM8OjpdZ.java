package con;

import java.util.HashMap;
/* loaded from: classes.dex */
public class pxM8OjpdZ extends dtGksSk0f {
    public HashMap MzoOEjc4X = new HashMap();

    @Override // con.dtGksSk0f
    public Object GPLPRo6go(Object obj, Object obj2) {
        VbWI3BZ7c vbWI3BZ7c = (VbWI3BZ7c) this.MzoOEjc4X.get(obj);
        if (vbWI3BZ7c != null) {
            return vbWI3BZ7c.kmSgne1rO;
        }
        this.MzoOEjc4X.put(obj, iiGwOFFnr(obj, obj2));
        return null;
    }

    @Override // con.dtGksSk0f
    public VbWI3BZ7c J4Ux7ym32(Object obj) {
        return (VbWI3BZ7c) this.MzoOEjc4X.get(obj);
    }

    @Override // con.dtGksSk0f
    public Object Puu3Rhg4F(Object obj) {
        Object Puu3Rhg4F = super.Puu3Rhg4F(obj);
        this.MzoOEjc4X.remove(obj);
        return Puu3Rhg4F;
    }

    public boolean contains(Object obj) {
        return this.MzoOEjc4X.containsKey(obj);
    }
}
