package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.jJtQlby2Y;
import con.pEF9IkFnQ;
import con.s7MlVynBG;
import con.vk4vXxjbi;
/* loaded from: classes.dex */
public class CheckableImageButton extends jJtQlby2Y implements Checkable {
    public static final int[] ilHKhw3Yw = {16842912};
    public boolean Bhmn1KIah;
    public boolean PSTqBLTET = true;
    public boolean MzoOEjc4X = true;

    /* loaded from: classes.dex */
    public static class RG2GI7LDp extends s7MlVynBG {
        public static final Parcelable.Creator<RG2GI7LDp> CREATOR = new vk4vXxjbi(2);
        public boolean Bhmn1KIah;

        public RG2GI7LDp(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Bhmn1KIah = parcel.readInt() != 1 ? false : true;
        }

        public RG2GI7LDp(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            parcel.writeInt(this.Bhmn1KIah ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        IuQbWntsc.MzoOEjc4X(this, new pEF9IkFnQ(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.Bhmn1KIah;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.Bhmn1KIah) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = ilHKhw3Yw;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RG2GI7LDp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) parcelable;
        super.onRestoreInstanceState(rG2GI7LDp.CBQ5d1kRq);
        setChecked(rG2GI7LDp.Bhmn1KIah);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(super.onSaveInstanceState());
        rG2GI7LDp.Bhmn1KIah = this.Bhmn1KIah;
        return rG2GI7LDp;
    }

    public void setCheckable(boolean z) {
        if (this.PSTqBLTET != z) {
            this.PSTqBLTET = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.PSTqBLTET && this.Bhmn1KIah != z) {
            this.Bhmn1KIah = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.MzoOEjc4X = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.MzoOEjc4X) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.Bhmn1KIah);
    }
}
