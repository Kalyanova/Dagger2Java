package by.paranoidandroid.dagger2java.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import by.paranoidandroid.dagger2java.App;
import by.paranoidandroid.dagger2java.R;
import by.paranoidandroid.dagger2java.module.RxUtilsAbs;

public class MainActivity extends Activity {
    @Inject Context appContext;
    @Inject RxUtilsAbs rxUtilsAbs;
    @BindView(R.id.label_msg) TextView tvMsg;
    @BindView(R.id.btn_change_text) Button btnChangeText;
    @BindString(R.string.msg_new_value) String newValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().inject(this);
        ButterKnife.bind(this);

        tvMsg.setText(getString(R.string.label_msg, rxUtilsAbs.getValue()));
        btnChangeText.setOnClickListener(view -> {
            rxUtilsAbs.setValue(newValue);
            tvMsg.setText(rxUtilsAbs.getValue());
        });
    }


}
