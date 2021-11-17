package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.feravolt.preload.R;
import con.GsWcrrhpK;
import con.IkIPSLCvr;
import con.VCCyeOu6I;
import con.Y8Y0XSE4A;
import con.ZolH67hOx;
import con.abGBwSu8x;
import con.j6XJY7rz4;
import con.qyCamnJnJ;
import con.vk4vXxjbi;
import con.yHOWpR3Sc;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends RG2GI7LDp implements GsWcrrhpK {
    public static final dgsh68zH8 Ta2zrwkcM;
    public final ImageView AqaWJg0b4;
    public boolean BL4OzhZBd;
    public final View CpG0imbht;
    public CharSequence Dr7UqlxEV;
    public IkIPSLCvr DuuXfa7LE;
    public final Drawable EBQXiIPmm;
    public int IG30YE5GU;
    public boolean INnK5Rew6;
    public TextWatcher Ihm5o4uLx;
    public final View IytU16YUK;
    public LULQkQlc9 IzM1cD9ly;
    public boolean KBYw84i3W;
    public Bundle KlYagMRWx;
    public final CharSequence L4EwGfXiQ;
    public CharSequence M66hQ219i;
    public final View NyWTwPF6V;
    public boolean OpLJtmvFM;
    public int[] QNqj6nIzv;
    public final Intent QSbMsHU5X;
    public boolean R2hkbNqWf;
    public View.OnKeyListener ShSN9wbzk;
    public int SuKhTJIQc;
    public final int TyB1UUd72;
    public int[] V9LQMKGJe;
    public boolean XYT7vJqNO;
    public final WeakHashMap YmNRDyka4;
    public SearchableInfo buPcffgdD;
    public final View cAwN510t2;
    public Rect i0Zug1mVk;
    public final SearchAutoComplete iMyQMM6Qj;
    public final ImageView igRQEZxnW;
    public final Intent j22ftfeNI;
    public final int juJ6pnCpu;
    public CharSequence kktL0P5MG;
    public boolean ln3nf7LH3;
    public final Runnable lqFHPHdW3;
    public final ImageView mUqPm6GBh;
    public View.OnClickListener n4UIOvAko;
    public final ImageView nlGCs0NZs;
    public Rect o4LF8RkoQ;
    public Runnable oesmsHQJU;
    public final ImageView qFBXIgpia;
    public LBkrQilnp vNtjxmzUM;
    public View.OnFocusChangeListener wIZEdYHUn;
    public DrTf1eLw4 zHl31GGXU;
    public Q6hF6Z6Ad ziwPzaoF3;

    /* loaded from: classes.dex */
    public interface DrTf1eLw4 {
        boolean J4Ux7ym32(String str);

        boolean q3BipwRCk(String str);
    }

    /* loaded from: classes.dex */
    public static class LBkrQilnp extends TouchDelegate {
        public boolean iiGwOFFnr;
        public final int kCA6Zs9sL;
        public final View q3BipwRCk;
        public final Rect J4Ux7ym32 = new Rect();
        public final Rect dIocxURUo = new Rect();
        public final Rect tGV7Q6urW = new Rect();

        public LBkrQilnp(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.kCA6Zs9sL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            q3BipwRCk(rect, rect2);
            this.q3BipwRCk = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int i;
            float f;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.iiGwOFFnr;
                    if (z2 && !this.dIocxURUo.contains(x, y)) {
                        z2 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.iiGwOFFnr;
                        this.iiGwOFFnr = false;
                    }
                    z = true;
                    z2 = false;
                }
                z = true;
            } else {
                if (this.J4Ux7ym32.contains(x, y)) {
                    this.iiGwOFFnr = true;
                    z = true;
                }
                z = true;
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            if (!z || this.tGV7Q6urW.contains(x, y)) {
                Rect rect = this.tGV7Q6urW;
                f = (float) (x - rect.left);
                i = y - rect.top;
            } else {
                f = (float) (this.q3BipwRCk.getWidth() / 2);
                i = this.q3BipwRCk.getHeight() / 2;
            }
            motionEvent.setLocation(f, (float) i);
            return this.q3BipwRCk.dispatchTouchEvent(motionEvent);
        }

        public void q3BipwRCk(Rect rect, Rect rect2) {
            this.J4Ux7ym32.set(rect);
            this.dIocxURUo.set(rect);
            Rect rect3 = this.dIocxURUo;
            int i = this.kCA6Zs9sL;
            rect3.inset(-i, -i);
            this.tGV7Q6urW.set(rect2);
        }
    }

    /* loaded from: classes.dex */
    public interface LULQkQlc9 {
        boolean J4Ux7ym32(int i);

        boolean q3BipwRCk(int i);
    }

    /* loaded from: classes.dex */
    public static class Og6dYSoy7 extends con.s7MlVynBG {
        public static final Parcelable.Creator<Og6dYSoy7> CREATOR = new vk4vXxjbi(0);
        public boolean Bhmn1KIah;

        public Og6dYSoy7(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Bhmn1KIah = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public Og6dYSoy7(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SearchView.SavedState{");
            q3BipwRCk.append(Integer.toHexString(System.identityHashCode(this)));
            q3BipwRCk.append(" isIconified=");
            q3BipwRCk.append(this.Bhmn1KIah);
            q3BipwRCk.append("}");
            return q3BipwRCk.toString();
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            parcel.writeValue(Boolean.valueOf(this.Bhmn1KIah));
        }
    }

    /* loaded from: classes.dex */
    public class PMYI4lLJM implements TextView.OnEditorActionListener {
        public PMYI4lLJM() {
            SearchView.this = r1;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.RG6kpfv3v();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface Q6hF6Z6Ad {
        boolean q3BipwRCk();
    }

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements TextWatcher {
        public RG2GI7LDp() {
            SearchView.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.iMyQMM6Qj.getText();
            searchView.M66hQ219i = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.dfpT1j18n(z);
            searchView.cAwN510t2(!z);
            searchView.ixWaw2akD();
            searchView.i8XZMQc6Z();
            if (searchView.zHl31GGXU != null && !TextUtils.equals(charSequence, searchView.Dr7UqlxEV)) {
                searchView.zHl31GGXU.q3BipwRCk(charSequence.toString());
            }
            searchView.Dr7UqlxEV = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class Rma6SHcSH implements AdapterView.OnItemClickListener {
        public Rma6SHcSH() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.ilHKhw3Yw(i);
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends yHOWpR3Sc {
        public SearchView MzoOEjc4X;
        public boolean ilHKhw3Yw;
        public final Runnable qVUwofr5s = new RG2GI7LDp();
        public int PSTqBLTET = getThreshold();

        /* loaded from: classes.dex */
        public class RG2GI7LDp implements Runnable {
            public RG2GI7LDp() {
                SearchAutoComplete.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.ilHKhw3Yw) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.ilHKhw3Yw = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.PSTqBLTET <= 0 || super.enoughToFilter();
        }

        @Override // con.yHOWpR3Sc, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.ilHKhw3Yw) {
                removeCallbacks(this.qVUwofr5s);
                post(this.qVUwofr5s);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.MzoOEjc4X;
            searchView.iMyQMM6Qj(searchView.BL4OzhZBd);
            searchView.post(searchView.lqFHPHdW3);
            if (searchView.iMyQMM6Qj.hasFocus()) {
                searchView.Bhmn1KIah();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.MzoOEjc4X.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.MzoOEjc4X.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.ilHKhw3Yw = true;
                Context context = getContext();
                dgsh68zH8 dgsh68zh8 = SearchView.Ta2zrwkcM;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    q3BipwRCk();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        public void q3BipwRCk() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            dgsh68zH8 dgsh68zh8 = SearchView.Ta2zrwkcM;
            Objects.requireNonNull(dgsh68zh8);
            dgsh68zH8.q3BipwRCk();
            Method method = dgsh68zh8.tGV7Q6urW;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.ilHKhw3Yw = false;
                removeCallbacks(this.qVUwofr5s);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.ilHKhw3Yw = false;
                removeCallbacks(this.qVUwofr5s);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.ilHKhw3Yw = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.MzoOEjc4X = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.PSTqBLTET = i;
        }
    }

    /* loaded from: classes.dex */
    public class WfopS3efW implements View.OnKeyListener {
        public WfopS3efW() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.buPcffgdD == null) {
                return false;
            }
            if (!searchView.iMyQMM6Qj.isPopupShowing() || SearchView.this.iMyQMM6Qj.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.iMyQMM6Qj.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.PSTqBLTET(0, null, searchView2.iMyQMM6Qj.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.buPcffgdD == null || searchView3.DuuXfa7LE == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.ilHKhw3Yw(searchView3.iMyQMM6Qj.getListSelection());
            }
            if (i == 21 || i == 22) {
                searchView3.iMyQMM6Qj.setSelection(i == 21 ? 0 : searchView3.iMyQMM6Qj.length());
                searchView3.iMyQMM6Qj.setListSelection(0);
                searchView3.iMyQMM6Qj.clearListSelection();
                searchView3.iMyQMM6Qj.q3BipwRCk();
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchView3.iMyQMM6Qj.getListSelection();
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements Runnable {
        public aXI58Y1kr() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IkIPSLCvr ikIPSLCvr = SearchView.this.DuuXfa7LE;
            if (ikIPSLCvr instanceof Y8Y0XSE4A) {
                ikIPSLCvr.J4Ux7ym32(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class dNif5KqqH implements View.OnClickListener {
        public dNif5KqqH() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.qFBXIgpia) {
                searchView.dXrmkklc8();
            } else if (view == searchView.AqaWJg0b4) {
                searchView.MzoOEjc4X();
            } else if (view == searchView.nlGCs0NZs) {
                searchView.RG6kpfv3v();
            } else if (view == searchView.mUqPm6GBh) {
                SearchableInfo searchableInfo = searchView.buPcffgdD;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.j22ftfeNI);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.kmSgne1rO(searchView.QSbMsHU5X, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.iMyQMM6Qj) {
                searchView.Bhmn1KIah();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class dgsh68zH8 {
        public Method J4Ux7ym32;
        public Method q3BipwRCk;
        public Method tGV7Q6urW;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public dgsh68zH8() {
            this.q3BipwRCk = null;
            this.J4Ux7ym32 = null;
            this.tGV7Q6urW = null;
            q3BipwRCk();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.q3BipwRCk = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.J4Ux7ym32 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.tGV7Q6urW = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void q3BipwRCk() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class lamBDew8Z implements AdapterView.OnItemSelectedListener {
        public lamBDew8Z() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.qVUwofr5s(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements Runnable {
        public mhl5lIdbQ() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.sk5s77z6Q();
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements View.OnFocusChangeListener {
        public qhPEQQaQ4() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.wIZEdYHUn;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class s7MlVynBG implements View.OnLayoutChangeListener {
        public s7MlVynBG() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.NyWTwPF6V.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.IytU16YUK.getPaddingLeft();
                Rect rect = new Rect();
                boolean J4Ux7ym32 = qyCamnJnJ.J4Ux7ym32(searchView);
                int dimensionPixelSize = searchView.OpLJtmvFM ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.iMyQMM6Qj.getDropDownBackground().getPadding(rect);
                searchView.iMyQMM6Qj.setDropDownHorizontalOffset(J4Ux7ym32 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.iMyQMM6Qj.setDropDownWidth((((searchView.NyWTwPF6V.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    static {
        Ta2zrwkcM = Build.VERSION.SDK_INT < 29 ? new dgsh68zH8() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i0Zug1mVk = new Rect();
        this.o4LF8RkoQ = new Rect();
        this.V9LQMKGJe = new int[2];
        this.QNqj6nIzv = new int[2];
        this.lqFHPHdW3 = new mhl5lIdbQ();
        this.oesmsHQJU = new aXI58Y1kr();
        this.YmNRDyka4 = new WeakHashMap();
        dNif5KqqH dnif5kqqh = new dNif5KqqH();
        this.ShSN9wbzk = new WfopS3efW();
        PMYI4lLJM pMYI4lLJM = new PMYI4lLJM();
        Rma6SHcSH rma6SHcSH = new Rma6SHcSH();
        lamBDew8Z lambdew8z = new lamBDew8Z();
        this.Ihm5o4uLx = new RG2GI7LDp();
        j6XJY7rz4 j6xjy7rz4 = new j6XJY7rz4(context, context.obtainStyledAttributes(attributeSet, ZolH67hOx.dXrmkklc8, i, 0));
        LayoutInflater.from(context).inflate(j6xjy7rz4.iMyQMM6Qj(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.iMyQMM6Qj = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.cAwN510t2 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.IytU16YUK = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.CpG0imbht = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.qFBXIgpia = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.nlGCs0NZs = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.AqaWJg0b4 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.mUqPm6GBh = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.igRQEZxnW = imageView5;
        VCCyeOu6I.ilHKhw3Yw(findViewById, j6xjy7rz4.dXrmkklc8(10));
        VCCyeOu6I.ilHKhw3Yw(findViewById2, j6xjy7rz4.dXrmkklc8(14));
        imageView.setImageDrawable(j6xjy7rz4.dXrmkklc8(13));
        imageView2.setImageDrawable(j6xjy7rz4.dXrmkklc8(7));
        imageView3.setImageDrawable(j6xjy7rz4.dXrmkklc8(4));
        imageView4.setImageDrawable(j6xjy7rz4.dXrmkklc8(16));
        imageView5.setImageDrawable(j6xjy7rz4.dXrmkklc8(13));
        this.EBQXiIPmm = j6xjy7rz4.dXrmkklc8(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.TyB1UUd72 = j6xjy7rz4.iMyQMM6Qj(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.juJ6pnCpu = j6xjy7rz4.iMyQMM6Qj(5, 0);
        imageView.setOnClickListener(dnif5kqqh);
        imageView3.setOnClickListener(dnif5kqqh);
        imageView2.setOnClickListener(dnif5kqqh);
        imageView4.setOnClickListener(dnif5kqqh);
        searchAutoComplete.setOnClickListener(dnif5kqqh);
        searchAutoComplete.addTextChangedListener(this.Ihm5o4uLx);
        searchAutoComplete.setOnEditorActionListener(pMYI4lLJM);
        searchAutoComplete.setOnItemClickListener(rma6SHcSH);
        searchAutoComplete.setOnItemSelectedListener(lambdew8z);
        searchAutoComplete.setOnKeyListener(this.ShSN9wbzk);
        searchAutoComplete.setOnFocusChangeListener(new qhPEQQaQ4());
        setIconifiedByDefault(j6xjy7rz4.vPSbyrYWX(8, true));
        int Eeka1udhb = j6xjy7rz4.Eeka1udhb(1, -1);
        if (Eeka1udhb != -1) {
            setMaxWidth(Eeka1udhb);
        }
        this.L4EwGfXiQ = j6xjy7rz4.IytU16YUK(6);
        this.kktL0P5MG = j6xjy7rz4.IytU16YUK(11);
        int i8XZMQc6Z = j6xjy7rz4.i8XZMQc6Z(3, -1);
        if (i8XZMQc6Z != -1) {
            setImeOptions(i8XZMQc6Z);
        }
        int i8XZMQc6Z2 = j6xjy7rz4.i8XZMQc6Z(2, -1);
        if (i8XZMQc6Z2 != -1) {
            setInputType(i8XZMQc6Z2);
        }
        setFocusable(j6xjy7rz4.vPSbyrYWX(0, true));
        j6xjy7rz4.NyWTwPF6V();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.j22ftfeNI = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.QSbMsHU5X = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.NyWTwPF6V = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new s7MlVynBG());
        }
        iMyQMM6Qj(this.OpLJtmvFM);
        WaUP0CF08();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.iMyQMM6Qj.setText(charSequence);
        this.iMyQMM6Qj.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void Bhmn1KIah() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.iMyQMM6Qj.refreshAutoCompleteResults();
            return;
        }
        dgsh68zH8 dgsh68zh8 = Ta2zrwkcM;
        SearchAutoComplete searchAutoComplete = this.iMyQMM6Qj;
        Objects.requireNonNull(dgsh68zh8);
        dgsh68zH8.q3BipwRCk();
        Method method = dgsh68zh8.q3BipwRCk;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        dgsh68zH8 dgsh68zh82 = Ta2zrwkcM;
        SearchAutoComplete searchAutoComplete2 = this.iMyQMM6Qj;
        Objects.requireNonNull(dgsh68zh82);
        dgsh68zH8.q3BipwRCk();
        Method method2 = dgsh68zh82.J4Ux7ym32;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final Intent CBQ5d1kRq(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.M66hQ219i);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.KlYagMRWx;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.buPcffgdD.getSearchActivity());
        return intent;
    }

    public void Eeka1udhb(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void MzoOEjc4X() {
        if (!TextUtils.isEmpty(this.iMyQMM6Qj.getText())) {
            this.iMyQMM6Qj.setText("");
            this.iMyQMM6Qj.requestFocus();
            this.iMyQMM6Qj.setImeVisibility(true);
        } else if (this.OpLJtmvFM) {
            Q6hF6Z6Ad q6hF6Z6Ad = this.ziwPzaoF3;
            if (q6hF6Z6Ad == null || !q6hF6Z6Ad.q3BipwRCk()) {
                clearFocus();
                iMyQMM6Qj(true);
            }
        }
    }

    public void PSTqBLTET(int i, String str, String str2) {
        getContext().startActivity(CBQ5d1kRq("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    public void RG6kpfv3v() {
        Editable text = this.iMyQMM6Qj.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            DrTf1eLw4 drTf1eLw4 = this.zHl31GGXU;
            if (drTf1eLw4 == null || !drTf1eLw4.J4Ux7ym32(text.toString())) {
                if (this.buPcffgdD != null) {
                    PSTqBLTET(0, null, text.toString());
                }
                this.iMyQMM6Qj.setImeVisibility(false);
                this.iMyQMM6Qj.dismissDropDown();
            }
        }
    }

    public final void WaUP0CF08() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.iMyQMM6Qj;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.OpLJtmvFM && this.EBQXiIPmm != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.EBQXiIPmm.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.EBQXiIPmm), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void cAwN510t2(boolean z) {
        int i = 8;
        if (this.ln3nf7LH3 && !this.BL4OzhZBd && z) {
            this.nlGCs0NZs.setVisibility(8);
            i = 0;
        }
        this.mUqPm6GBh.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.INnK5Rew6 = true;
        super.clearFocus();
        this.iMyQMM6Qj.clearFocus();
        this.iMyQMM6Qj.setImeVisibility(false);
        this.INnK5Rew6 = false;
    }

    @Override // con.GsWcrrhpK
    public void dIocxURUo() {
        if (!this.R2hkbNqWf) {
            this.R2hkbNqWf = true;
            int imeOptions = this.iMyQMM6Qj.getImeOptions();
            this.IG30YE5GU = imeOptions;
            this.iMyQMM6Qj.setImeOptions(imeOptions | 33554432);
            this.iMyQMM6Qj.setText("");
            setIconified(false);
        }
    }

    public void dXrmkklc8() {
        iMyQMM6Qj(false);
        this.iMyQMM6Qj.requestFocus();
        this.iMyQMM6Qj.setImeVisibility(true);
        View.OnClickListener onClickListener = this.n4UIOvAko;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.ln3nf7LH3 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void dfpT1j18n(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.XYT7vJqNO
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.ln3nf7LH3
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.BL4OzhZBd
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.ln3nf7LH3
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.nlGCs0NZs
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.dfpT1j18n(boolean):void");
    }

    public int getImeOptions() {
        return this.iMyQMM6Qj.getImeOptions();
    }

    public int getInputType() {
        return this.iMyQMM6Qj.getInputType();
    }

    public int getMaxWidth() {
        return this.SuKhTJIQc;
    }

    public CharSequence getQuery() {
        return this.iMyQMM6Qj.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.kktL0P5MG;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.buPcffgdD;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.L4EwGfXiQ : getContext().getText(this.buPcffgdD.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.juJ6pnCpu;
    }

    public int getSuggestionRowLayout() {
        return this.TyB1UUd72;
    }

    public IkIPSLCvr getSuggestionsAdapter() {
        return this.DuuXfa7LE;
    }

    public final void i8XZMQc6Z() {
        int i = 0;
        if (!((this.XYT7vJqNO || this.ln3nf7LH3) && !this.BL4OzhZBd) || !(this.nlGCs0NZs.getVisibility() == 0 || this.mUqPm6GBh.getVisibility() == 0)) {
            i = 8;
        }
        this.CpG0imbht.setVisibility(i);
    }

    public final void iMyQMM6Qj(boolean z) {
        this.BL4OzhZBd = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.iMyQMM6Qj.getText());
        this.qFBXIgpia.setVisibility(i2);
        dfpT1j18n(z2);
        this.cAwN510t2.setVisibility(z ? 8 : 0);
        if (this.igRQEZxnW.getDrawable() == null || this.OpLJtmvFM) {
            i = 8;
        }
        this.igRQEZxnW.setVisibility(i);
        ixWaw2akD();
        cAwN510t2(!z2);
        i8XZMQc6Z();
    }

    public boolean ilHKhw3Yw(int i) {
        int i2;
        String Puu3Rhg4F;
        LULQkQlc9 lULQkQlc9 = this.IzM1cD9ly;
        if (lULQkQlc9 != null && lULQkQlc9.J4Ux7ym32(i)) {
            return false;
        }
        Cursor cursor = this.DuuXfa7LE.Bhmn1KIah;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = Y8Y0XSE4A.vNtjxmzUM;
                String Puu3Rhg4F2 = Y8Y0XSE4A.Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (Puu3Rhg4F2 == null) {
                    Puu3Rhg4F2 = this.buPcffgdD.getSuggestIntentAction();
                }
                if (Puu3Rhg4F2 == null) {
                    Puu3Rhg4F2 = "android.intent.action.SEARCH";
                }
                String Puu3Rhg4F3 = Y8Y0XSE4A.Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (Puu3Rhg4F3 == null) {
                    Puu3Rhg4F3 = this.buPcffgdD.getSuggestIntentData();
                }
                if (!(Puu3Rhg4F3 == null || (Puu3Rhg4F = Y8Y0XSE4A.Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    Puu3Rhg4F3 = Puu3Rhg4F3 + "/" + Uri.encode(Puu3Rhg4F);
                }
                intent = CBQ5d1kRq(Puu3Rhg4F2, Puu3Rhg4F3 == null ? null : Uri.parse(Puu3Rhg4F3), Y8Y0XSE4A.Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), Y8Y0XSE4A.Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        this.iMyQMM6Qj.setImeVisibility(false);
        this.iMyQMM6Qj.dismissDropDown();
        return true;
    }

    public final void ixWaw2akD() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.iMyQMM6Qj.getText());
        int i = 0;
        if (!z2 && (!this.OpLJtmvFM || this.R2hkbNqWf)) {
            z = false;
        }
        ImageView imageView = this.AqaWJg0b4;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.AqaWJg0b4.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // con.GsWcrrhpK
    public void kCA6Zs9sL() {
        this.iMyQMM6Qj.setText("");
        SearchAutoComplete searchAutoComplete = this.iMyQMM6Qj;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.M66hQ219i = "";
        clearFocus();
        iMyQMM6Qj(true);
        this.iMyQMM6Qj.setImeOptions(this.IG30YE5GU);
        this.R2hkbNqWf = false;
    }

    public final Intent kmSgne1rO(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.KlYagMRWx;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.lqFHPHdW3);
        post(this.oesmsHQJU);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.iMyQMM6Qj;
            Rect rect = this.i0Zug1mVk;
            searchAutoComplete.getLocationInWindow(this.V9LQMKGJe);
            getLocationInWindow(this.QNqj6nIzv);
            int[] iArr = this.V9LQMKGJe;
            int i5 = iArr[1];
            int[] iArr2 = this.QNqj6nIzv;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.o4LF8RkoQ;
            Rect rect3 = this.i0Zug1mVk;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            LBkrQilnp lBkrQilnp = this.vNtjxmzUM;
            if (lBkrQilnp == null) {
                LBkrQilnp lBkrQilnp2 = new LBkrQilnp(this.o4LF8RkoQ, this.i0Zug1mVk, this.iMyQMM6Qj);
                this.vNtjxmzUM = lBkrQilnp2;
                setTouchDelegate(lBkrQilnp2);
                return;
            }
            lBkrQilnp.q3BipwRCk(this.o4LF8RkoQ, this.i0Zug1mVk);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.BL4OzhZBd
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.SuKhTJIQc
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.SuKhTJIQc
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.SuKhTJIQc
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Og6dYSoy7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Og6dYSoy7 og6dYSoy7 = (Og6dYSoy7) parcelable;
        super.onRestoreInstanceState(og6dYSoy7.CBQ5d1kRq);
        iMyQMM6Qj(og6dYSoy7.Bhmn1KIah);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Og6dYSoy7 og6dYSoy7 = new Og6dYSoy7(super.onSaveInstanceState());
        og6dYSoy7.Bhmn1KIah = this.BL4OzhZBd;
        return og6dYSoy7;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.lqFHPHdW3);
    }

    public boolean qVUwofr5s(int i) {
        CharSequence tGV7Q6urW;
        LULQkQlc9 lULQkQlc9 = this.IzM1cD9ly;
        if (lULQkQlc9 != null && lULQkQlc9.q3BipwRCk(i)) {
            return false;
        }
        Editable text = this.iMyQMM6Qj.getText();
        Cursor cursor = this.DuuXfa7LE.Bhmn1KIah;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (tGV7Q6urW = this.DuuXfa7LE.tGV7Q6urW(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(tGV7Q6urW);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.INnK5Rew6 || !isFocusable()) {
            return false;
        }
        if (this.BL4OzhZBd) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.iMyQMM6Qj.requestFocus(i, rect);
        if (requestFocus) {
            iMyQMM6Qj(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.KlYagMRWx = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            MzoOEjc4X();
        } else {
            dXrmkklc8();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.OpLJtmvFM != z) {
            this.OpLJtmvFM = z;
            iMyQMM6Qj(z);
            WaUP0CF08();
        }
    }

    public void setImeOptions(int i) {
        this.iMyQMM6Qj.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.iMyQMM6Qj.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.SuKhTJIQc = i;
        requestLayout();
    }

    public void setOnCloseListener(Q6hF6Z6Ad q6hF6Z6Ad) {
        this.ziwPzaoF3 = q6hF6Z6Ad;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.wIZEdYHUn = onFocusChangeListener;
    }

    public void setOnQueryTextListener(DrTf1eLw4 drTf1eLw4) {
        this.zHl31GGXU = drTf1eLw4;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.n4UIOvAko = onClickListener;
    }

    public void setOnSuggestionListener(LULQkQlc9 lULQkQlc9) {
        this.IzM1cD9ly = lULQkQlc9;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.kktL0P5MG = charSequence;
        WaUP0CF08();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.KBYw84i3W = z;
        IkIPSLCvr ikIPSLCvr = this.DuuXfa7LE;
        if (ikIPSLCvr instanceof Y8Y0XSE4A) {
            ((Y8Y0XSE4A) ikIPSLCvr).cAwN510t2 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.buPcffgdD = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.iMyQMM6Qj
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.iMyQMM6Qj
            android.app.SearchableInfo r3 = r6.buPcffgdD
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.buPcffgdD
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.buPcffgdD
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.iMyQMM6Qj
            r3.setInputType(r7)
            con.IkIPSLCvr r7 = r6.DuuXfa7LE
            if (r7 == 0) goto L_0x0042
            r7.J4Ux7ym32(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.buPcffgdD
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            con.Y8Y0XSE4A r7 = new con.Y8Y0XSE4A
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.buPcffgdD
            java.util.WeakHashMap r5 = r6.YmNRDyka4
            r7.<init>(r3, r6, r4, r5)
            r6.DuuXfa7LE = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.iMyQMM6Qj
            r3.setAdapter(r7)
            con.IkIPSLCvr r7 = r6.DuuXfa7LE
            con.Y8Y0XSE4A r7 = (con.Y8Y0XSE4A) r7
            boolean r3 = r6.KBYw84i3W
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.cAwN510t2 = r3
        L_0x006b:
            r6.WaUP0CF08()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.buPcffgdD
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.buPcffgdD
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.j22ftfeNI
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.buPcffgdD
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.QSbMsHU5X
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.ln3nf7LH3 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.iMyQMM6Qj
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.BL4OzhZBd
            r6.iMyQMM6Qj(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.XYT7vJqNO = z;
        iMyQMM6Qj(this.BL4OzhZBd);
    }

    public void setSuggestionsAdapter(IkIPSLCvr ikIPSLCvr) {
        this.DuuXfa7LE = ikIPSLCvr;
        this.iMyQMM6Qj.setAdapter(ikIPSLCvr);
    }

    public void sk5s77z6Q() {
        int[] iArr = this.iMyQMM6Qj.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.IytU16YUK.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.CpG0imbht.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }
}
