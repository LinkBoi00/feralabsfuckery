package me.rosuh.filepicker.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class PosLinearLayoutManager extends LinearLayoutManager {
    public int qFBXIgpia = -1;
    public int nlGCs0NZs = -1;

    public PosLinearLayoutManager(Context context) {
        super(1, false);
    }

    public PosLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void IG30YE5GU(Parcelable parcelable) {
        this.qFBXIgpia = -1;
        this.nlGCs0NZs = -1;
        if (parcelable instanceof LinearLayoutManager.qhPEQQaQ4) {
            LinearLayoutManager.qhPEQQaQ4 qhpeqqaq4 = (LinearLayoutManager.qhPEQQaQ4) parcelable;
            this.dfpT1j18n = qhpeqqaq4;
            if (this.WaUP0CF08 != -1) {
                qhpeqqaq4.CBQ5d1kRq = -1;
            }
            uSBmk4hFZ();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void M66hQ219i(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (this.qFBXIgpia != -1) {
            if ((kvfwrysux == null ? 0 : kvfwrysux.J4Ux7ym32()) > 0) {
                int i = this.qFBXIgpia;
                int i2 = this.nlGCs0NZs;
                this.WaUP0CF08 = i;
                this.i8XZMQc6Z = i2;
                LinearLayoutManager.qhPEQQaQ4 qhpeqqaq4 = this.dfpT1j18n;
                if (qhpeqqaq4 != null) {
                    qhpeqqaq4.CBQ5d1kRq = -1;
                }
                uSBmk4hFZ();
                this.nlGCs0NZs = -1;
                this.qFBXIgpia = -1;
            }
        }
        super.M66hQ219i(v1xq9aVRv, kvfwrysux);
    }
}
