package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.RG2GI7LDp;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class W5Ka8JOwI {
    public Object J4Ux7ym32;
    public int dIocxURUo;
    public Object q3BipwRCk = new ArrayList();
    public int tGV7Q6urW;

    public W5Ka8JOwI(Context context, XmlPullParser xmlPullParser) {
        this.dIocxURUo = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), EssXmp5ks.Puu3Rhg4F);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.tGV7Q6urW = obtainStyledAttributes.getResourceId(index, this.tGV7Q6urW);
            } else if (index == 1) {
                this.dIocxURUo = obtainStyledAttributes.getResourceId(index, this.dIocxURUo);
                String resourceTypeName = context.getResources().getResourceTypeName(this.dIocxURUo);
                context.getResources().getResourceName(this.dIocxURUo);
                if ("layout".equals(resourceTypeName)) {
                    RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
                    this.J4Ux7ym32 = rG2GI7LDp;
                    rG2GI7LDp.J4Ux7ym32((ConstraintLayout) LayoutInflater.from(context).inflate(this.dIocxURUo, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
