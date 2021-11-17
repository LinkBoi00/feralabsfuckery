package con;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class fnUv4KsJz extends ContextWrapper {
    public Resources.Theme J4Ux7ym32;
    public Configuration dIocxURUo;
    public Resources kCA6Zs9sL;
    public int q3BipwRCk;
    public LayoutInflater tGV7Q6urW;

    public fnUv4KsJz(Context context, int i) {
        super(context);
        this.q3BipwRCk = i;
    }

    public final void J4Ux7ym32() {
        if (this.J4Ux7ym32 == null) {
            this.J4Ux7ym32 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.J4Ux7ym32.setTo(theme);
            }
        }
        this.J4Ux7ym32.applyStyle(this.q3BipwRCk, true);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.kCA6Zs9sL == null) {
            Configuration configuration = this.dIocxURUo;
            this.kCA6Zs9sL = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.kCA6Zs9sL;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.tGV7Q6urW == null) {
            this.tGV7Q6urW = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.tGV7Q6urW;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.J4Ux7ym32;
        if (theme != null) {
            return theme;
        }
        if (this.q3BipwRCk == 0) {
            this.q3BipwRCk = 2131821091;
        }
        J4Ux7ym32();
        return this.J4Ux7ym32;
    }

    public void q3BipwRCk(Configuration configuration) {
        if (this.kCA6Zs9sL != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.dIocxURUo == null) {
            this.dIocxURUo = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.q3BipwRCk != i) {
            this.q3BipwRCk = i;
            J4Ux7ym32();
        }
    }
}
