package kotlinx.coroutines.android;

import android.os.Looper;
import con.B5Lo9xvrs;
import con.VWNUggT0w;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public VWNUggT0w createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new VWNUggT0w(B5Lo9xvrs.q3BipwRCk(Looper.getMainLooper(), true), null, false);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
