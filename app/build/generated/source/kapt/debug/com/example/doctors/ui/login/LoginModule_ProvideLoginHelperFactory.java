// Generated by Dagger (https://google.github.io/dagger).
package com.example.doctors.ui.login;

import com.example.doctors.MyApplication;
import com.example.doctors.network.ITokenDownloaderService;
import com.example.doctors.ui.login.helper.LoginHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class LoginModule_ProvideLoginHelperFactory implements Factory<LoginHelper> {
  private final LoginModule module;

  private final Provider<ITokenDownloaderService> downloaderProvider;

  private final Provider<MyApplication> applicationProvider;

  public LoginModule_ProvideLoginHelperFactory(
      LoginModule module,
      Provider<ITokenDownloaderService> downloaderProvider,
      Provider<MyApplication> applicationProvider) {
    this.module = module;
    this.downloaderProvider = downloaderProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LoginHelper get() {
    return Preconditions.checkNotNull(
        module.provideLoginHelper(downloaderProvider.get(), applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static LoginModule_ProvideLoginHelperFactory create(
      LoginModule module,
      Provider<ITokenDownloaderService> downloaderProvider,
      Provider<MyApplication> applicationProvider) {
    return new LoginModule_ProvideLoginHelperFactory(
        module, downloaderProvider, applicationProvider);
  }

  public static LoginHelper proxyProvideLoginHelper(
      LoginModule instance, ITokenDownloaderService downloader, MyApplication application) {
    return Preconditions.checkNotNull(
        instance.provideLoginHelper(downloader, application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}