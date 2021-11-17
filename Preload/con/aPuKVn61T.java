package con;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import java.util.Objects;
/* loaded from: classes.dex */
public final class aPuKVn61T extends RecyclerView.cywn6086a {
    public final boolean RG6kpfv3v;
    public final ImageView WaUP0CF08;
    public final /* synthetic */ m2ygzKSSR dfpT1j18n;
    public final RadioButton i8XZMQc6Z;
    public final TextView ixWaw2akD;
    public final CheckBox sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aPuKVn61T(m2ygzKSSR m2ygzkssr, View view) {
        super(view);
        this.dfpT1j18n = m2ygzkssr;
        HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
        ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
        Objects.requireNonNull(ey4vf0eiu);
        this.RG6kpfv3v = ey4vf0eiu.tGV7Q6urW;
        this.ixWaw2akD = (TextView) view.findViewById(R.id.tv_list_file_picker);
        this.sk5s77z6Q = (CheckBox) view.findViewById(R.id.cb_list_file_picker);
        this.WaUP0CF08 = (ImageView) view.findViewById(R.id.iv_icon_list_file_picker);
        this.i8XZMQc6Z = (RadioButton) view.findViewById(R.id.rb_list_file_picker);
    }

    public final void ixWaw2akD(mSiW1fbBz msiw1fbbz, boolean z) {
        m2ygzKSSR m2ygzkssr = this.dfpT1j18n;
        if (z) {
            m2ygzkssr.oon79WMrY().add(msiw1fbbz);
        } else {
            m2ygzkssr.oon79WMrY().remove(msiw1fbbz);
        }
        msiw1fbbz.tGV7Q6urW = z;
        m2ygzKSSR m2ygzkssr2 = this.dfpT1j18n;
        mBzZm787K mbzzm787k = m2ygzkssr2.GPLPRo6go;
        if (mbzzm787k != null) {
            mbzzm787k.q3BipwRCk(m2ygzkssr2.yWvV4ePLl());
        }
    }
}
