package  com.example.doctors.ui.doctors

import com.example.doctors.root.ApplicationComponent
import dagger.Component

@Component(dependencies = arrayOf(ApplicationComponent::class),
           modules = arrayOf(DoctorsModule::class))
@DoctorsScope
interface DoctorsComponent {

    fun inject(target : DoctorsActivity)


}