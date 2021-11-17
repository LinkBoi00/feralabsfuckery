package con;

import android.text.StaticLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public class NWQpHtsVn extends W8LGsXe1j {
    @Override // con.ShAKJI1p8
    public boolean J4Ux7ym32(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // con.W8LGsXe1j, con.ShAKJI1p8
    public void q3BipwRCk(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
