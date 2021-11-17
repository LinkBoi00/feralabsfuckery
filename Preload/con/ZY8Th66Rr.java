package con;

import android.os.Build;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ZY8Th66Rr {
    public final Object J4Ux7ym32;
    public long q3BipwRCk;
    public final List tGV7Q6urW;

    public ZY8Th66Rr() {
        this.J4Ux7ym32 = new SparseLongArray();
        this.tGV7Q6urW = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0170 A[EDGE_INSN: B:103:0x0170->B:71:0x0170 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131 A[LOOP:1: B:66:0x012f->B:67:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166 A[LOOP:0: B:35:0x008d->B:70:0x0166, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public ZY8Th66Rr q3BipwRCk(MotionEvent motionEvent, vk135kjc7 vk135kjc7) {
        int size;
        boolean z;
        boolean z2;
        long j;
        long j2;
        long j3;
        int toolType;
        int i;
        int historySize;
        int i2;
        long j4;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            ((SparseLongArray) this.J4Ux7ym32).clear();
            return null;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j5 = 1;
        boolean z3 = false;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (((SparseLongArray) this.J4Ux7ym32).indexOfKey(pointerId) < 0 || motionEvent.getToolType(actionIndex) != 3) {
                long j6 = this.q3BipwRCk;
                this.q3BipwRCk = 1 + j6;
                ((SparseLongArray) this.J4Ux7ym32).put(pointerId, j6);
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (((SparseLongArray) this.J4Ux7ym32).indexOfKey(pointerId2) < 0) {
                long j7 = this.q3BipwRCk;
                this.q3BipwRCk = j7 + 1;
                ((SparseLongArray) this.J4Ux7ym32).put(pointerId2, j7);
            }
        }
        boolean z4 = true;
        boolean z5 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        int actionIndex2 = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.tGV7Q6urW.clear();
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                List list = this.tGV7Q6urW;
                boolean z6 = (z5 || i3 == actionIndex2) ? z3 : z4;
                int pointerId3 = motionEvent.getPointerId(i3);
                int indexOfKey = ((SparseLongArray) this.J4Ux7ym32).indexOfKey(pointerId3);
                if (indexOfKey >= 0) {
                    j = ((SparseLongArray) this.J4Ux7ym32).valueAt(indexOfKey);
                    z2 = z5;
                } else {
                    z2 = z5;
                    long j8 = this.q3BipwRCk;
                    this.q3BipwRCk = j8 + j5;
                    ((SparseLongArray) this.J4Ux7ym32).put(pointerId3, j8);
                    j = j8;
                }
                long dIocxURUo = ODug2UCW1.dIocxURUo(motionEvent.getX(i3), motionEvent.getY(i3));
                if (i3 == 0) {
                    j4 = ODug2UCW1.dIocxURUo(motionEvent.getRawX(), motionEvent.getRawY());
                } else if (Build.VERSION.SDK_INT >= 29) {
                    j4 = HoslCoXQl.q3BipwRCk.q3BipwRCk(motionEvent, i3);
                } else {
                    j3 = ((AndroidComposeView) vk135kjc7).oon79WMrY(dIocxURUo);
                    j2 = dIocxURUo;
                    toolType = motionEvent.getToolType(i3);
                    if (toolType != 0) {
                        if (toolType == 1) {
                            i = 1;
                        } else if (toolType == 2) {
                            i = 3;
                        } else if (toolType == 3) {
                            i = 2;
                        } else if (toolType == 4) {
                            i = 4;
                        }
                        ArrayList arrayList = new ArrayList();
                        historySize = motionEvent.getHistorySize();
                        for (i2 = 0; i2 < historySize; i2++) {
                            arrayList.add(new AZFnwmUeD(motionEvent.getHistoricalEventTime(i2), ODug2UCW1.dIocxURUo(motionEvent.getHistoricalX(i3, i2), motionEvent.getHistoricalY(i3, i2)), null));
                        }
                        list.add(new YMgMenQKq(j, motionEvent.getEventTime(), j3, j2, z6, i, arrayList, null));
                        if (i4 >= pointerCount) {
                            break;
                        }
                        i3 = i4;
                        z5 = z2;
                        j5 = 1;
                        z3 = false;
                        z4 = true;
                    }
                    i = 0;
                    ArrayList arrayList2 = new ArrayList();
                    historySize = motionEvent.getHistorySize();
                    while (i2 < historySize) {
                    }
                    list.add(new YMgMenQKq(j, motionEvent.getEventTime(), j3, j2, z6, i, arrayList2, null));
                    if (i4 >= pointerCount) {
                    }
                }
                j2 = ((AndroidComposeView) vk135kjc7).dXrmkklc8(j4);
                j3 = j4;
                toolType = motionEvent.getToolType(i3);
                if (toolType != 0) {
                }
                i = 0;
                ArrayList arrayList22 = new ArrayList();
                historySize = motionEvent.getHistorySize();
                while (i2 < historySize) {
                }
                list.add(new YMgMenQKq(j, motionEvent.getEventTime(), j3, j2, z6, i, arrayList22, null));
                if (i4 >= pointerCount) {
                }
            }
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int actionIndex3 = motionEvent.getActionIndex();
            if (motionEvent.getToolType(actionIndex3) != 3) {
                int pointerId4 = motionEvent.getPointerId(actionIndex3);
                int indexOfKey2 = ((SparseLongArray) this.J4Ux7ym32).indexOfKey(pointerId4);
                if (indexOfKey2 >= 0) {
                    ((SparseLongArray) this.J4Ux7ym32).removeAt(indexOfKey2);
                } else {
                    throw new IllegalStateException(("Trying to remove pointer ID " + pointerId4 + " that doesn't exist").toString());
                }
            }
        }
        if (((SparseLongArray) this.J4Ux7ym32).size() > motionEvent.getPointerCount() && (size = ((SparseLongArray) this.J4Ux7ym32).size() - 1) >= 0) {
            while (true) {
                int i5 = size - 1;
                int keyAt = ((SparseLongArray) this.J4Ux7ym32).keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                if (pointerCount2 > 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        if (motionEvent.getPointerId(i6) == keyAt) {
                            z = true;
                            break;
                        } else if (i7 >= pointerCount2) {
                            break;
                        } else {
                            i6 = i7;
                        }
                    }
                }
                z = false;
                if (!z) {
                    ((SparseLongArray) this.J4Ux7ym32).removeAt(size);
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return new ZY8Th66Rr(motionEvent.getEventTime(), this.tGV7Q6urW, motionEvent);
    }

    public ZY8Th66Rr(long j, List list, MotionEvent motionEvent) {
        this.q3BipwRCk = j;
        this.tGV7Q6urW = list;
        this.J4Ux7ym32 = motionEvent;
    }
}
