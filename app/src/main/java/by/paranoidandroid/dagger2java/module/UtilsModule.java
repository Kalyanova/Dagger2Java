package by.paranoidandroid.dagger2java.module;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilsModule {

    @Provides
    @NonNull
    @Singleton
    RxUtilsAbs provideRxUtils(Context context) {
        return new RxUtils(context);
    }
}
