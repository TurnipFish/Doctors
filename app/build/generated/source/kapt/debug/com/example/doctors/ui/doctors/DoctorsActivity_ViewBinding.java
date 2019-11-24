// Generated code from Butter Knife. Do not modify!
package com.example.doctors.ui.doctors;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.doctors.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class DoctorsActivity_ViewBinding implements Unbinder {
  private DoctorsActivity target;

  @UiThread
  public DoctorsActivity_ViewBinding(DoctorsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DoctorsActivity_ViewBinding(DoctorsActivity target, View source) {
    this.target = target;

    target.swipeRefresh = Utils.findRequiredViewAsType(source, R.id.swipeToRefresh_recyclerview, "field 'swipeRefresh'", SwipeRefreshLayout.class);
    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", TextView.class);
    target.doctors_recycler_view = Utils.findRequiredViewAsType(source, R.id.doctors_recycler_view, "field 'doctors_recycler_view'", RecyclerView.class);
    target.search_text = Utils.findRequiredViewAsType(source, R.id.search_text, "field 'search_text'", EditText.class);
    target.search = Utils.findRequiredViewAsType(source, R.id.search, "field 'search'", Button.class);
  }

  @Override
  public void unbind() {
    DoctorsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefresh = null;
    target.header = null;
    target.doctors_recycler_view = null;
    target.search_text = null;
    target.search = null;
  }
}
