package con;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.RG2GI7LDp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
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
    public final void q3BipwRCk(Context context, XmlPullParser xmlPullParser) {
        int eventType;
        RG2GI7LDp.C0003RG2GI7LDp rG2GI7LDp;
        RG2GI7LDp.C0003RG2GI7LDp rG2GI7LDp2;
        boolean z;
        RG2GI7LDp rG2GI7LDp3 = new RG2GI7LDp();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlPullParser.getEventType();
                    rG2GI7LDp = null;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c = 3;
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    rG2GI7LDp2 = rG2GI7LDp3.dIocxURUo(context, Xml.asAttributeSet(xmlPullParser), false);
                                    rG2GI7LDp = rG2GI7LDp2;
                                    break;
                                case 1:
                                    rG2GI7LDp2 = rG2GI7LDp3.dIocxURUo(context, Xml.asAttributeSet(xmlPullParser), true);
                                    rG2GI7LDp = rG2GI7LDp2;
                                    break;
                                case 2:
                                    rG2GI7LDp2 = rG2GI7LDp3.dIocxURUo(context, Xml.asAttributeSet(xmlPullParser), false);
                                    RG2GI7LDp.mhl5lIdbQ mhl5lidbq = rG2GI7LDp2.dIocxURUo;
                                    mhl5lidbq.q3BipwRCk = true;
                                    mhl5lidbq.J4Ux7ym32 = true;
                                    rG2GI7LDp = rG2GI7LDp2;
                                    break;
                                case 3:
                                    rG2GI7LDp2 = rG2GI7LDp3.dIocxURUo(context, Xml.asAttributeSet(xmlPullParser), false);
                                    rG2GI7LDp2.dIocxURUo.SuKhTJIQc = 1;
                                    rG2GI7LDp = rG2GI7LDp2;
                                    break;
                                case 4:
                                    if (rG2GI7LDp != null) {
                                        rG2GI7LDp.J4Ux7ym32.q3BipwRCk(context, Xml.asAttributeSet(xmlPullParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                case 5:
                                    if (rG2GI7LDp != null) {
                                        rG2GI7LDp.kCA6Zs9sL.q3BipwRCk(context, Xml.asAttributeSet(xmlPullParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                case 6:
                                    if (rG2GI7LDp != null) {
                                        rG2GI7LDp.dIocxURUo.q3BipwRCk(context, Xml.asAttributeSet(xmlPullParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                case 7:
                                    if (rG2GI7LDp != null) {
                                        rG2GI7LDp.tGV7Q6urW.q3BipwRCk(context, Xml.asAttributeSet(xmlPullParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                case '\b':
                                case '\t':
                                    if (rG2GI7LDp != null) {
                                        meB98lbAo.q3BipwRCk(context, xmlPullParser, rG2GI7LDp.iiGwOFFnr);
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        z = false;
                                        break;
                                    }
                                    z = true;
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                            if (!z) {
                                this.J4Ux7ym32.put(identifier, rG2GI7LDp3);
                                return;
                            } else if (z || z || z) {
                                rG2GI7LDp3.tGV7Q6urW.put(Integer.valueOf(rG2GI7LDp.q3BipwRCk), rG2GI7LDp);
                                rG2GI7LDp = null;
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
                }
                this.J4Ux7ym32.put(identifier, rG2GI7LDp3);
                return;
            }
        }
    }
}
