// Generated code from Butter Knife. Do not modify!
package com.example.doctors.util.general;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.doctors.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class CustomDialog_ViewBinding implements Unbinder {
  private CustomDialog target;

  @UiThread
  public CustomDialog_ViewBinding(CustomDialog target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CustomDialog_ViewBinding(CustomDialog target, View source) {
    this.target = target;

    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", TextView.class);
    target.message = Utils.findRequiredViewAsType(source, R.id.message, "field 'message'", TextView.class);
    target.message2 = Utils.findRequiredViewAsType(source, R.id.message2, "field 'message2'", TextView.class);
    target.message3 = Utils.findRequiredViewAsType(source, R.id.message3, "field 'message3'", TextView.class);
    target.dialog_buttons_container = Utils.findRequiredViewAsType(source, R.id.dialog_buttons_container, "field 'dialog_buttons_container'", RelativeLayout.class);
    target.ok = Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", TextView.class);
  }

  @Override
  public void unbind() {
    CustomDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
    target.message = null;
    target.message2 = null;
    target.message3 = null;
    target.dialog_buttons_container = null;
    target.ok = null;
  }
}
