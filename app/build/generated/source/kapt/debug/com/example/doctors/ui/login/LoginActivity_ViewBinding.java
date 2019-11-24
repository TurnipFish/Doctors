// Generated code from Butter Knife. Do not modify!
package com.example.doctors.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatEditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.doctors.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", TextView.class);
    target.login = Utils.findRequiredViewAsType(source, R.id.login, "field 'login'", Button.class);
    target.email = Utils.findRequiredViewAsType(source, R.id.email, "field 'email'", AppCompatEditText.class);
    target.password = Utils.findRequiredViewAsType(source, R.id.password, "field 'password'", AppCompatEditText.class);
  }

  @Override
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
    target.login = null;
    target.email = null;
    target.password = null;
  }
}
