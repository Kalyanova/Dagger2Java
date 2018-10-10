package by.paranoidandroid.dagger2java.module;

import android.content.Context;

import by.paranoidandroid.dagger2java.R;

class RxUtils extends RxUtilsAbs {

    RxUtils(Context context) {
        super(context);
        setValue(context.getString(R.string.msg_initializing));
    }
}
