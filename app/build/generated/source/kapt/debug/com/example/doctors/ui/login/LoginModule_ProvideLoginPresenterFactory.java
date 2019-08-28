// Generated by Dagger (https://google.github.io/dagger).
package com.example.doctors.ui.login;

import com.example.doctors.ui.login.helper.LoginHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class LoginModule_ProvideLoginPresenterFactory implements Factory<LoginPresenter> {
  private final LoginModule module;

  private final Provider<LoginModel> loginModelProvider;

  private final Provider<LoginHelper> loginHelperProvider;

  public LoginModule_ProvideLoginPresenterFactory(
      LoginModule module,
      Provider<LoginModel> loginModelProvider,
      Provider<LoginHelper> loginHelperProvider) {
    this.module = module;
    this.loginModelProvider = loginModelProvider;
    this.loginHelperProvider = loginHelperProvider;
  }

  @Override
  public LoginPresenter get() {
    return Preconditions.checkNotNull(
        module.provideLoginPresenter(loginModelProvider.get(), loginHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static LoginModule_ProvideLoginPresenterFactory create(
      LoginModule module,
      Provider<LoginModel> loginModelProvider,
      Provider<LoginHelper> loginHelperProvider) {
    return new LoginModule_ProvideLoginPresenterFactory(
        module, loginModelProvider, loginHelperProvider);
  }

  public static LoginPresenter proxyProvideLoginPresenter(
      LoginModule instance, LoginModel loginModel, LoginHelper loginHelper) {
    return Preconditions.checkNotNull(
        instance.provideLoginPresenter(loginModel, loginHelper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
