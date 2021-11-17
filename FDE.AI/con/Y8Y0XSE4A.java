package con;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.feravolt.preload.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Y8Y0XSE4A extends IkIPSLCvr implements View.OnClickListener {
    public static final /* synthetic */ int vNtjxmzUM = 0;
    public ColorStateList IytU16YUK;
    public int RG6kpfv3v;
    public final SearchableInfo WaUP0CF08;
    public int dXrmkklc8;
    public final WeakHashMap dfpT1j18n;
    public final Context i8XZMQc6Z;
    public final int iMyQMM6Qj;
    public LayoutInflater ixWaw2akD;
    public final SearchView sk5s77z6Q;
    public int cAwN510t2 = 1;
    public int CpG0imbht = -1;
    public int qFBXIgpia = -1;
    public int nlGCs0NZs = -1;
    public int AqaWJg0b4 = -1;
    public int mUqPm6GBh = -1;
    public int NyWTwPF6V = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8Y0XSE4A(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, null, true);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.RG6kpfv3v = suggestionRowLayout;
        this.dXrmkklc8 = suggestionRowLayout;
        this.ixWaw2akD = (LayoutInflater) context.getSystemService("layout_inflater");
        this.sk5s77z6Q = searchView;
        this.WaUP0CF08 = searchableInfo;
        this.iMyQMM6Qj = searchView.getSuggestionCommitIconResId();
        this.i8XZMQc6Z = context;
        this.dfpT1j18n = weakHashMap;
    }

    public static String Puu3Rhg4F(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public Cursor GPLPRo6go(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.i8XZMQc6Z.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // con.IkIPSLCvr
    public void J4Ux7ym32(Cursor cursor) {
        try {
            super.J4Ux7ym32(cursor);
            if (cursor != null) {
                this.CpG0imbht = cursor.getColumnIndex("suggest_text_1");
                this.qFBXIgpia = cursor.getColumnIndex("suggest_text_2");
                this.nlGCs0NZs = cursor.getColumnIndex("suggest_text_2_url");
                this.AqaWJg0b4 = cursor.getColumnIndex("suggest_icon_1");
                this.mUqPm6GBh = cursor.getColumnIndex("suggest_icon_2");
                this.NyWTwPF6V = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // con.IkIPSLCvr
    public View dIocxURUo(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.ixWaw2akD.inflate(this.dXrmkklc8, viewGroup, false);
        inflate.setTag(new B3ifTyjZi(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.iMyQMM6Qj);
        return inflate;
    }

    @Override // con.IkIPSLCvr, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.ixWaw2akD.inflate(this.RG6kpfv3v, viewGroup, false);
            if (inflate != null) {
                ((B3ifTyjZi) inflate.getTag()).q3BipwRCk.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // con.IkIPSLCvr, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View dIocxURUo = dIocxURUo(this.i8XZMQc6Z, this.Bhmn1KIah, viewGroup);
            ((B3ifTyjZi) dIocxURUo.getTag()).q3BipwRCk.setText(e.toString());
            return dIocxURUo;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.graphics.drawable.Drawable iiGwOFFnr(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Y8Y0XSE4A.iiGwOFFnr(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Drawable kCA6Zs9sL(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.i8XZMQc6Z.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.Bhmn1KIah;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.Bhmn1KIah;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.sk5s77z6Q.Eeka1udhb((CharSequence) tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    @Override // con.IkIPSLCvr
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void q3BipwRCk(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Y8Y0XSE4A.q3BipwRCk(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // con.IkIPSLCvr
    public CharSequence tGV7Q6urW(Cursor cursor) {
        String Puu3Rhg4F;
        String Puu3Rhg4F2;
        if (cursor == null) {
            return null;
        }
        String Puu3Rhg4F3 = Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (Puu3Rhg4F3 != null) {
            return Puu3Rhg4F3;
        }
        if (this.WaUP0CF08.shouldRewriteQueryFromData() && (Puu3Rhg4F2 = Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return Puu3Rhg4F2;
        }
        if (!this.WaUP0CF08.shouldRewriteQueryFromText() || (Puu3Rhg4F = Puu3Rhg4F(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return Puu3Rhg4F;
    }
}
