// Generated by Dagger (https://google.github.io/dagger).
package com.example.doctors.root;

import com.example.doctors.MyApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideContextFactory implements Factory<MyApplication> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideContextFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public MyApplication get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvideContextFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideContextFactory(module);
  }

  public static MyApplication proxyProvideContext(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}