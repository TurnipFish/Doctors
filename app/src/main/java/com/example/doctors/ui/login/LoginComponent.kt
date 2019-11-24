package  com.example.doctors.ui.login

import com.example.doctors.root.ApplicationComponent
import dagger.Component

@Component(dependencies = arrayOf(ApplicationComponent::class),
           modules = arrayOf(LoginModule::class))
@LoginScope
interface LoginComponent {

    fun inject(target : LoginActivity)


}