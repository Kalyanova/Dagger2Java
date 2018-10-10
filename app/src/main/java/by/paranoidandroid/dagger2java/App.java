package by.paranoidandroid.dagger2java;

import android.app.Application;

import by.paranoidandroid.dagger2java.component.AppComponent;
import by.paranoidandroid.dagger2java.component.DaggerAppComponent;
import by.paranoidandroid.dagger2java.module.AppModule;

public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
