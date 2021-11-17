package con;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class c0dtGNCXO {
    public SparseArray q3BipwRCk = new SparseArray();
    public SparseArray J4Ux7ym32 = new SparseArray();

    public c0dtGNCXO(Context context, ConstraintLayout constraintLayout, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            W5Ka8JOwI w5Ka8JOwI = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        c = 65535;
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    break;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        if (c == 2) {
                            W5Ka8JOwI w5Ka8JOwI2 = new W5Ka8JOwI(context, xml);
                            this.q3BipwRCk.put(w5Ka8JOwI2.tGV7Q6urW, w5Ka8JOwI2);
                            w5Ka8JOwI = w5Ka8JOwI2;
                        } else if (c == 3) {
                            Wk3MSe8QO wk3MSe8QO = new Wk3MSe8QO(context, xml);
                            if (w5Ka8JOwI != null) {
                                ((ArrayList) w5Ka8JOwI.q3BipwRCk).add(wk3MSe8QO);
                            }
                        } else if (c == 4) {
                            q3BipwRCk(context, xml);
                        }
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0229, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void q3BipwRCk(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
        // Method dump skipped, instructions count: 664
        */
        throw new UnsupportedOperationException("Method not decompiled: con.c0dtGNCXO.q3BipwRCk(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
