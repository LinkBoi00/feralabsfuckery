package kotlinx.coroutines.internal;

import con.zkUmn2JpE;
import java.util.List;
/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    zkUmn2JpE createDispatcher(List list);

    int getLoadPriority();

    String hintOnError();
}
