// Generated by Dagger (https://google.github.io/dagger).
package com.example.doctors.ui.doctors;

import com.example.doctors.MyApplication;
import com.example.doctors.network.IContentDownloaderService;
import com.example.doctors.root.ApplicationComponent;
import com.example.doctors.ui.doctors.helper.DoctorsHelper;
import com.squareup.picasso.Picasso;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerDoctorsComponent implements DoctorsComponent {
  private Provider<DoctorsModel> provideDoctorsModelProvider;

  private Provider<DoctorsPresenter> provideDoctorsPresenterProvider;

  private com_example_doctors_root_ApplicationComponent_application applicationProvider;

  private com_example_doctors_root_ApplicationComponent_contentDownloaderService
      contentDownloaderServiceProvider;

  private Provider<DoctorsHelper> provideDoctorsHelperProvider;

  private Provider<Picasso> providePicassoProvider;

  private DaggerDoctorsComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideDoctorsModelProvider =
        DoubleCheck.provider(
            DoctorsModule_ProvideDoctorsModelFactory.create(builder.doctorsModule));
    this.provideDoctorsPresenterProvider =
        DoubleCheck.provider(
            DoctorsModule_ProvideDoctorsPresenterFactory.create(
                builder.doctorsModule, provideDoctorsModelProvider));
    this.applicationProvider =
        new com_example_doctors_root_ApplicationComponent_application(builder.applicationComponent);
    this.contentDownloaderServiceProvider =
        new com_example_doctors_root_ApplicationComponent_contentDownloaderService(
            builder.applicationComponent);
    this.provideDoctorsHelperProvider =
        DoubleCheck.provider(
            DoctorsModule_ProvideDoctorsHelperFactory.create(
                builder.doctorsModule, applicationProvider, contentDownloaderServiceProvider));
    this.providePicassoProvider =
        DoubleCheck.provider(DoctorsModule_ProvidePicassoFactory.create(builder.doctorsModule));
  }

  @Override
  public void inject(DoctorsActivity target) {
    injectDoctorsActivity(target);
  }

  private DoctorsActivity injectDoctorsActivity(DoctorsActivity instance) {
    DoctorsActivity_MembersInjector.injectDoctorsPresenter(
        instance, provideDoctorsPresenterProvider.get());
    DoctorsActivity_MembersInjector.injectDoctorsHelper(
        instance, provideDoctorsHelperProvider.get());
    DoctorsActivity_MembersInjector.injectPicasso(instance, providePicassoProvider.get());
    return instance;
  }

  public static final class Builder {
    private DoctorsModule doctorsModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public DoctorsComponent build() {
      if (doctorsModule == null) {
        throw new IllegalStateException(DoctorsModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerDoctorsComponent(this);
    }

    public Builder doctorsModule(DoctorsModule doctorsModule) {
      this.doctorsModule = Preconditions.checkNotNull(doctorsModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }

  private static class com_example_doctors_root_ApplicationComponent_application
      implements Provider<MyApplication> {
    private final ApplicationComponent applicationComponent;

    com_example_doctors_root_ApplicationComponent_application(
        ApplicationComponent applicationComponent) {
      this.applicationComponent = applicationComponent;
    }

    @Override
    public MyApplication get() {
      return Preconditions.checkNotNull(
          applicationComponent.application(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_example_doctors_root_ApplicationComponent_contentDownloaderService
      implements Provider<IContentDownloaderService> {
    private final ApplicationComponent applicationComponent;

    com_example_doctors_root_ApplicationComponent_contentDownloaderService(
        ApplicationComponent applicationComponent) {
      this.applicationComponent = applicationComponent;
    }

    @Override
    public IContentDownloaderService get() {
      return Preconditions.checkNotNull(
          applicationComponent.contentDownloaderService(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}
