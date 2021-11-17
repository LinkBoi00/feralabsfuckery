package con;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class LSrfLcuPd {
    public final rwhamSOu2 J4Ux7ym32;
    public final rwhamSOu2 q3BipwRCk;
    public final rwhamSOu2 tGV7Q6urW;

    public LSrfLcuPd(rwhamSOu2 rwhamsou2, rwhamSOu2 rwhamsou22, rwhamSOu2 rwhamsou23) {
        this.q3BipwRCk = rwhamsou2;
        this.J4Ux7ym32 = rwhamsou22;
        this.tGV7Q6urW = rwhamsou23;
    }

    public void Bhmn1KIah(Parcelable parcelable, int i) {
        CBQ5d1kRq(i);
        ((vaMyoIs7w) this).kCA6Zs9sL.writeParcelable(parcelable, 0);
    }

    public abstract void CBQ5d1kRq(int i);

    public CharSequence GPLPRo6go(CharSequence charSequence, int i) {
        return !Puu3Rhg4F(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((vaMyoIs7w) this).kCA6Zs9sL);
    }

    public abstract LSrfLcuPd J4Ux7ym32();

    public void PSTqBLTET(ZYfyy7xWN zYfyy7xWN) {
        if (zYfyy7xWN == null) {
            ((vaMyoIs7w) this).kCA6Zs9sL.writeString(null);
            return;
        }
        try {
            ((vaMyoIs7w) this).kCA6Zs9sL.writeString(tGV7Q6urW(zYfyy7xWN.getClass()).getName());
            LSrfLcuPd J4Ux7ym32 = J4Ux7ym32();
            try {
                kCA6Zs9sL(zYfyy7xWN.getClass()).invoke(null, zYfyy7xWN, J4Ux7ym32);
                J4Ux7ym32.q3BipwRCk();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(zYfyy7xWN.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    public abstract boolean Puu3Rhg4F(int i);

    public final Method dIocxURUo(String str) {
        Method method = (Method) this.q3BipwRCk.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, LSrfLcuPd.class.getClassLoader()).getDeclaredMethod("read", LSrfLcuPd.class);
        this.q3BipwRCk.put(str, declaredMethod);
        return declaredMethod;
    }

    public boolean iiGwOFFnr(boolean z, int i) {
        if (!Puu3Rhg4F(i)) {
            return z;
        }
        return ((vaMyoIs7w) this).kCA6Zs9sL.readInt() != 0;
    }

    public final Method kCA6Zs9sL(Class cls) {
        Method method = (Method) this.J4Ux7ym32.getOrDefault(cls.getName(), null);
        if (method != null) {
            return method;
        }
        Class tGV7Q6urW = tGV7Q6urW(cls);
        System.currentTimeMillis();
        Method declaredMethod = tGV7Q6urW.getDeclaredMethod("write", cls, LSrfLcuPd.class);
        this.J4Ux7ym32.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public void kmSgne1rO(int i, int i2) {
        CBQ5d1kRq(i2);
        ((vaMyoIs7w) this).kCA6Zs9sL.writeInt(i);
    }

    public Parcelable oon79WMrY(Parcelable parcelable, int i) {
        return !Puu3Rhg4F(i) ? parcelable : ((vaMyoIs7w) this).kCA6Zs9sL.readParcelable(vaMyoIs7w.class.getClassLoader());
    }

    public abstract void q3BipwRCk();

    public final Class tGV7Q6urW(Class cls) {
        Class cls2 = (Class) this.tGV7Q6urW.getOrDefault(cls.getName(), null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.tGV7Q6urW.put(cls.getName(), cls3);
        return cls3;
    }

    public ZYfyy7xWN vPSbyrYWX() {
        String readString = ((vaMyoIs7w) this).kCA6Zs9sL.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (ZYfyy7xWN) dIocxURUo(readString).invoke(null, J4Ux7ym32());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public int yWvV4ePLl(int i, int i2) {
        return !Puu3Rhg4F(i2) ? i : ((vaMyoIs7w) this).kCA6Zs9sL.readInt();
    }
}
