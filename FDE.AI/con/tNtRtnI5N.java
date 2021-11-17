package con;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class tNtRtnI5N extends MenuInflater {
    public static final Class[] iiGwOFFnr;
    public static final Class[] kCA6Zs9sL;
    public final Object[] J4Ux7ym32;
    public Object dIocxURUo;
    public final Object[] q3BipwRCk;
    public Context tGV7Q6urW;

    static {
        Class[] clsArr = {Context.class};
        kCA6Zs9sL = clsArr;
        iiGwOFFnr = clsArr;
    }

    public tNtRtnI5N(Context context) {
        super(context);
        this.tGV7Q6urW = context;
        Object[] objArr = {context};
        this.q3BipwRCk = objArr;
        this.J4Ux7ym32 = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J4Ux7ym32(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c;
        char c2;
        iMp2wcpT4 imp2wcpt4;
        ColorStateList colorStateList;
        m4pplfiJF m4pplfijf = new m4pplfiJF(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(UexvVay3o.q3BipwRCk("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                z = z;
                z = z;
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                            z = z;
                            z2 = z2;
                        } else if (name2.equals("group")) {
                            m4pplfijf.J4Ux7ym32 = 0;
                            m4pplfijf.tGV7Q6urW = 0;
                            m4pplfijf.dIocxURUo = 0;
                            m4pplfijf.kCA6Zs9sL = 0;
                            m4pplfijf.iiGwOFFnr = true;
                            m4pplfijf.GPLPRo6go = true;
                            z = z;
                        } else if (name2.equals("item")) {
                            z = z;
                            if (!m4pplfijf.Puu3Rhg4F) {
                                iMp2wcpT4 imp2wcpt42 = m4pplfijf.dfpT1j18n;
                                if (imp2wcpt42 == null || !imp2wcpt42.J4Ux7ym32.hasSubMenu()) {
                                    m4pplfijf.Puu3Rhg4F = true;
                                    m4pplfijf.tGV7Q6urW(m4pplfijf.q3BipwRCk.add(m4pplfijf.J4Ux7ym32, m4pplfijf.yWvV4ePLl, m4pplfijf.oon79WMrY, m4pplfijf.vPSbyrYWX));
                                    z = z;
                                } else {
                                    m4pplfijf.q3BipwRCk();
                                    z = z;
                                }
                            }
                        } else {
                            z = z;
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        }
                    }
                    eventType = xmlPullParser.next();
                    z = z;
                    z2 = z2;
                } else {
                    if (!z2) {
                        String name3 = xmlPullParser.getName();
                        if (name3.equals("group")) {
                            TypedArray obtainStyledAttributes = m4pplfijf.qFBXIgpia.tGV7Q6urW.obtainStyledAttributes(attributeSet, ZolH67hOx.PSTqBLTET);
                            m4pplfijf.J4Ux7ym32 = obtainStyledAttributes.getResourceId(1, 0);
                            m4pplfijf.tGV7Q6urW = obtainStyledAttributes.getInt(3, 0);
                            m4pplfijf.dIocxURUo = obtainStyledAttributes.getInt(4, 0);
                            m4pplfijf.kCA6Zs9sL = obtainStyledAttributes.getInt(5, 0);
                            m4pplfijf.iiGwOFFnr = obtainStyledAttributes.getBoolean(2, true);
                            m4pplfijf.GPLPRo6go = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                            z = z;
                        } else if (name3.equals("item")) {
                            j6XJY7rz4 AqaWJg0b4 = j6XJY7rz4.AqaWJg0b4(m4pplfijf.qFBXIgpia.tGV7Q6urW, attributeSet, ZolH67hOx.MzoOEjc4X);
                            m4pplfijf.yWvV4ePLl = AqaWJg0b4.iMyQMM6Qj(2, 0);
                            m4pplfijf.oon79WMrY = (AqaWJg0b4.i8XZMQc6Z(5, m4pplfijf.tGV7Q6urW) & -65536) | (AqaWJg0b4.i8XZMQc6Z(6, m4pplfijf.dIocxURUo) & 65535);
                            m4pplfijf.vPSbyrYWX = AqaWJg0b4.IytU16YUK(7);
                            m4pplfijf.CBQ5d1kRq = AqaWJg0b4.IytU16YUK(8);
                            m4pplfijf.kmSgne1rO = AqaWJg0b4.iMyQMM6Qj(0, 0);
                            String cAwN510t2 = AqaWJg0b4.cAwN510t2(9);
                            if (cAwN510t2 == null) {
                                c = 0;
                            } else {
                                c = cAwN510t2.charAt(0);
                            }
                            m4pplfijf.Bhmn1KIah = c;
                            m4pplfijf.PSTqBLTET = AqaWJg0b4.i8XZMQc6Z(16, 4096);
                            String cAwN510t22 = AqaWJg0b4.cAwN510t2(10);
                            if (cAwN510t22 == null) {
                                c2 = 0;
                            } else {
                                c2 = cAwN510t22.charAt(0);
                            }
                            m4pplfijf.MzoOEjc4X = c2;
                            m4pplfijf.ilHKhw3Yw = AqaWJg0b4.i8XZMQc6Z(20, 4096);
                            m4pplfijf.qVUwofr5s = AqaWJg0b4.CpG0imbht(11) ? AqaWJg0b4.vPSbyrYWX(11, false) : m4pplfijf.kCA6Zs9sL ? 1 : 0;
                            m4pplfijf.Eeka1udhb = AqaWJg0b4.vPSbyrYWX(3, false);
                            m4pplfijf.dXrmkklc8 = AqaWJg0b4.vPSbyrYWX(4, m4pplfijf.iiGwOFFnr);
                            m4pplfijf.RG6kpfv3v = AqaWJg0b4.vPSbyrYWX(1, m4pplfijf.GPLPRo6go);
                            m4pplfijf.ixWaw2akD = AqaWJg0b4.i8XZMQc6Z(21, -1);
                            m4pplfijf.i8XZMQc6Z = AqaWJg0b4.cAwN510t2(12);
                            m4pplfijf.sk5s77z6Q = AqaWJg0b4.iMyQMM6Qj(13, 0);
                            m4pplfijf.WaUP0CF08 = AqaWJg0b4.cAwN510t2(15);
                            String cAwN510t23 = AqaWJg0b4.cAwN510t2(14);
                            boolean z3 = cAwN510t23 != null;
                            if (z3 && m4pplfijf.sk5s77z6Q == 0 && m4pplfijf.WaUP0CF08 == null) {
                                imp2wcpt4 = (iMp2wcpT4) m4pplfijf.J4Ux7ym32(cAwN510t23, iiGwOFFnr, m4pplfijf.qFBXIgpia.J4Ux7ym32);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                imp2wcpt4 = null;
                            }
                            m4pplfijf.dfpT1j18n = imp2wcpt4;
                            m4pplfijf.iMyQMM6Qj = AqaWJg0b4.IytU16YUK(17);
                            m4pplfijf.cAwN510t2 = AqaWJg0b4.IytU16YUK(22);
                            if (AqaWJg0b4.CpG0imbht(19)) {
                                m4pplfijf.CpG0imbht = Y4wRqkFOh.tGV7Q6urW(AqaWJg0b4.i8XZMQc6Z(19, -1), m4pplfijf.CpG0imbht);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                m4pplfijf.CpG0imbht = null;
                            }
                            if (AqaWJg0b4.CpG0imbht(18)) {
                                colorStateList = AqaWJg0b4.Bhmn1KIah(18);
                            }
                            m4pplfijf.IytU16YUK = colorStateList;
                            AqaWJg0b4.NyWTwPF6V();
                            m4pplfijf.Puu3Rhg4F = false;
                            z = z;
                        } else {
                            if (name3.equals("menu")) {
                                J4Ux7ym32(xmlPullParser, attributeSet, m4pplfijf.q3BipwRCk());
                            } else {
                                str = name3;
                                z2 = true;
                            }
                            eventType = xmlPullParser.next();
                            z = z;
                            z2 = z2;
                        }
                    }
                    eventType = xmlPullParser.next();
                    z = z;
                    z2 = z2;
                }
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser] */
    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        XmlResourceParser xmlResourceParser = menu instanceof sn3fLZljc;
        if (xmlResourceParser == 0) {
            super.inflate(i, menu);
            return;
        }
        try {
            xmlResourceParser = 0;
            try {
                try {
                    xmlResourceParser = this.tGV7Q6urW.getResources().getLayout(i);
                    J4Ux7ym32(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public final Object q3BipwRCk(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? q3BipwRCk(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
