package con;

import android.util.Property;
import android.view.ViewGroup;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class JS43R0qiH extends Property {
    public static final Property q3BipwRCk = new JS43R0qiH("childrenAlpha");

    public JS43R0qiH(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
