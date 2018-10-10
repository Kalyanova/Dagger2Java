package by.paranoidandroid.dagger2java.module;

import android.content.Context;

public class RxUtilsAbs {
    private String value;

    RxUtilsAbs(Context context) {}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
