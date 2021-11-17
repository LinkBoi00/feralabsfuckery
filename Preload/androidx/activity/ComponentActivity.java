package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.RG2GI7LDp;
import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.mhl5lIdbQ;
import com.feravolt.preload.R;
import con.B0ROL5sm5;
import con.BgHiMFrEI;
import con.JQrRVvEid;
import con.LiMUeynem;
import con.MOVjTUs5I;
import con.N0a4Shkkl;
import con.Pf46TvDcc;
import con.QWJmHBGHJ;
import con.TTqseSZOY;
import con.UoUKJhr5d;
import con.WGohiwKSS;
import con.XHpudBVT5;
import con.emw2Oo1fE;
import con.go0qReAcx;
import con.j6XJY7rz4;
import con.mCbHTCUdc;
import con.pc1YcJups;
import con.qSrQJuSSl;
import con.siyf8EdFd;
import con.ueHOpDHaX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class ComponentActivity extends pc1YcJups implements LiMUeynem, XHpudBVT5, ueHOpDHaX, TTqseSZOY {
    public final mhl5lIdbQ MzoOEjc4X;
    public final N0a4Shkkl PSTqBLTET;
    public emw2Oo1fE ilHKhw3Yw;
    public final JQrRVvEid kmSgne1rO = new JQrRVvEid();
    public final j6XJY7rz4 Bhmn1KIah = new j6XJY7rz4(new UoUKJhr5d(this));
    public final OnBackPressedDispatcher qVUwofr5s = new OnBackPressedDispatcher(new go0qReAcx(this));
    public final RG2GI7LDp Eeka1udhb = new MOVjTUs5I(this);

    public ComponentActivity() {
        N0a4Shkkl n0a4Shkkl = new N0a4Shkkl(this);
        this.PSTqBLTET = n0a4Shkkl;
        mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ(this);
        this.MzoOEjc4X = mhl5lidbq;
        new AtomicInteger();
        n0a4Shkkl.q3BipwRCk(new WGohiwKSS() { // from class: androidx.activity.ComponentActivity.3
            @Override // con.WGohiwKSS
            public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
                if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        n0a4Shkkl.q3BipwRCk(new WGohiwKSS() { // from class: androidx.activity.ComponentActivity.4
            @Override // con.WGohiwKSS
            public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
                if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_DESTROY) {
                    ComponentActivity.this.kmSgne1rO.J4Ux7ym32 = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.kCA6Zs9sL().q3BipwRCk();
                    }
                }
            }
        });
        n0a4Shkkl.q3BipwRCk(new WGohiwKSS() { // from class: androidx.activity.ComponentActivity.5
            @Override // con.WGohiwKSS
            public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
                ComponentActivity.this.oon79WMrY();
                N0a4Shkkl n0a4Shkkl2 = ComponentActivity.this.PSTqBLTET;
                n0a4Shkkl2.dIocxURUo("removeObserver");
                n0a4Shkkl2.J4Ux7ym32.Puu3Rhg4F(this);
            }
        });
        mhl5lidbq.J4Ux7ym32.J4Ux7ym32("android:support:activity-result", new Pf46TvDcc(this));
        yWvV4ePLl(new mCbHTCUdc() { // from class: con.NARTqt9im
            @Override // con.mCbHTCUdc
            public final void q3BipwRCk(Context context) {
                ComponentActivity componentActivity = ComponentActivity.this;
                Bundle q3BipwRCk = componentActivity.MzoOEjc4X.J4Ux7ym32.q3BipwRCk("android:support:activity-result");
                if (q3BipwRCk != null) {
                    RG2GI7LDp rG2GI7LDp = componentActivity.Eeka1udhb;
                    Objects.requireNonNull(rG2GI7LDp);
                    ArrayList<Integer> integerArrayList = q3BipwRCk.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = q3BipwRCk.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (!(stringArrayList == null || integerArrayList == null)) {
                        rG2GI7LDp.kCA6Zs9sL = q3BipwRCk.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        rG2GI7LDp.q3BipwRCk = (Random) q3BipwRCk.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        rG2GI7LDp.Puu3Rhg4F.putAll(q3BipwRCk.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            if (rG2GI7LDp.tGV7Q6urW.containsKey(str)) {
                                Integer num = (Integer) rG2GI7LDp.tGV7Q6urW.remove(str);
                                if (!rG2GI7LDp.Puu3Rhg4F.containsKey(str)) {
                                    rG2GI7LDp.J4Ux7ym32.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            rG2GI7LDp.J4Ux7ym32.put(Integer.valueOf(intValue), str2);
                            rG2GI7LDp.tGV7Q6urW.put(str2, Integer.valueOf(intValue));
                        }
                    }
                }
            }
        });
    }

    @Override // con.BgHiMFrEI
    public androidx.lifecycle.mhl5lIdbQ GPLPRo6go() {
        return this.PSTqBLTET;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        vPSbyrYWX();
        super.addContentView(view, layoutParams);
    }

    @Override // con.LiMUeynem
    public emw2Oo1fE kCA6Zs9sL() {
        if (getApplication() != null) {
            oon79WMrY();
            return this.ilHKhw3Yw;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.Eeka1udhb.q3BipwRCk(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.qVUwofr5s.J4Ux7ym32();
    }

    @Override // con.pc1YcJups, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.MzoOEjc4X.q3BipwRCk(bundle);
        JQrRVvEid jQrRVvEid = this.kmSgne1rO;
        jQrRVvEid.J4Ux7ym32 = this;
        for (mCbHTCUdc mcbhtcudc : jQrRVvEid.q3BipwRCk) {
            mcbhtcudc.q3BipwRCk(this);
        }
        super.onCreate(bundle);
        B0ROL5sm5.tGV7Q6urW(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        j6XJY7rz4 j6xjy7rz4 = this.Bhmn1KIah;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) j6xjy7rz4.Bhmn1KIah).iterator();
        while (it.hasNext()) {
            ((qSrQJuSSl) it.next()).q3BipwRCk(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        Iterator it = ((CopyOnWriteArrayList) this.Bhmn1KIah.Bhmn1KIah).iterator();
        while (it.hasNext()) {
            if (((qSrQJuSSl) it.next()).J4Ux7ym32(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.Eeka1udhb.q3BipwRCk(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        siyf8EdFd siyf8edfd;
        emw2Oo1fE emw2oo1fe = this.ilHKhw3Yw;
        if (emw2oo1fe == null && (siyf8edfd = (siyf8EdFd) getLastNonConfigurationInstance()) != null) {
            emw2oo1fe = siyf8edfd.q3BipwRCk;
        }
        if (emw2oo1fe == null) {
            return null;
        }
        siyf8EdFd siyf8edfd2 = new siyf8EdFd();
        siyf8edfd2.q3BipwRCk = emw2oo1fe;
        return siyf8edfd2;
    }

    @Override // con.pc1YcJups, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        N0a4Shkkl n0a4Shkkl = this.PSTqBLTET;
        if (n0a4Shkkl instanceof N0a4Shkkl) {
            mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq = mhl5lIdbQ.EnumC0005mhl5lIdbQ.CREATED;
            n0a4Shkkl.dIocxURUo("setCurrentState");
            n0a4Shkkl.GPLPRo6go(mhl5lidbq);
        }
        super.onSaveInstanceState(bundle);
        this.MzoOEjc4X.J4Ux7ym32(bundle);
    }

    public void oon79WMrY() {
        if (this.ilHKhw3Yw == null) {
            siyf8EdFd siyf8edfd = (siyf8EdFd) getLastNonConfigurationInstance();
            if (siyf8edfd != null) {
                this.ilHKhw3Yw = siyf8edfd.q3BipwRCk;
            }
            if (this.ilHKhw3Yw == null) {
                this.ilHKhw3Yw = new emw2Oo1fE();
            }
        }
    }

    @Override // con.XHpudBVT5
    public final androidx.savedstate.RG2GI7LDp q3BipwRCk() {
        return this.MzoOEjc4X.J4Ux7ym32;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (QWJmHBGHJ.q3BipwRCk()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        vPSbyrYWX();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        vPSbyrYWX();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        vPSbyrYWX();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void vPSbyrYWX() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void yWvV4ePLl(mCbHTCUdc mcbhtcudc) {
        JQrRVvEid jQrRVvEid = this.kmSgne1rO;
        if (jQrRVvEid.J4Ux7ym32 != null) {
            mcbhtcudc.q3BipwRCk(jQrRVvEid.J4Ux7ym32);
        }
        jQrRVvEid.q3BipwRCk.add(mcbhtcudc);
    }
}
