package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.RG2GI7LDp;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class Wk3MSe8QO {
    public float J4Ux7ym32;
    public float dIocxURUo;
    public int kCA6Zs9sL;
    public float q3BipwRCk;
    public float tGV7Q6urW;

    public Wk3MSe8QO(Context context, XmlPullParser xmlPullParser) {
        this.q3BipwRCk = Float.NaN;
        this.J4Ux7ym32 = Float.NaN;
        this.tGV7Q6urW = Float.NaN;
        this.dIocxURUo = Float.NaN;
        this.kCA6Zs9sL = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), EssXmp5ks.oon79WMrY);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.kCA6Zs9sL = obtainStyledAttributes.getResourceId(index, this.kCA6Zs9sL);
                String resourceTypeName = context.getResources().getResourceTypeName(this.kCA6Zs9sL);
                context.getResources().getResourceName(this.kCA6Zs9sL);
                if ("layout".equals(resourceTypeName)) {
                    new RG2GI7LDp().J4Ux7ym32((ConstraintLayout) LayoutInflater.from(context).inflate(this.kCA6Zs9sL, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.dIocxURUo = obtainStyledAttributes.getDimension(index, this.dIocxURUo);
            } else if (index == 2) {
                this.J4Ux7ym32 = obtainStyledAttributes.getDimension(index, this.J4Ux7ym32);
            } else if (index == 3) {
                this.tGV7Q6urW = obtainStyledAttributes.getDimension(index, this.tGV7Q6urW);
            } else if (index == 4) {
                this.q3BipwRCk = obtainStyledAttributes.getDimension(index, this.q3BipwRCk);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
