package by.paranoidandroid.dagger2java.component;

import javax.inject.Singleton;

import by.paranoidandroid.dagger2java.module.AppModule;
import by.paranoidandroid.dagger2java.module.UtilsModule;
import by.paranoidandroid.dagger2java.view.MainActivity;
import dagger.Component;

@Component(modules = {AppModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity activity);
}
