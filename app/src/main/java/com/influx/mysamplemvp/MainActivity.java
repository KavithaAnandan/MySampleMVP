package com.influx.mysamplemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements LoginView, View.OnClickListener {


    EditText edt_name, edt_email, edt_phone, edt_message;
    Button btn_submit;
    LoginPresenter loginPresenter;


    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void initview() {

        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_email = (EditText) findViewById(R.id.edt_email);
        edt_phone = (EditText) findViewById(R.id.edt_phone);
        edt_message = (EditText) findViewById(R.id.edt_message);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(this);
    }

    @Override
    public void initdata() {

        loginPresenter = new LoginPresenter(this);
        loginPresenter.attachview(this);

    }

    @Override
    public void submitbtn() {
        Toast.makeText(MainActivity.this, "Btn Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAlert() {
        Toast.makeText(MainActivity.this, "Btn Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        loginPresenter.submitform(edt_name.getText().toString().trim(),
                edt_email.getText().toString().trim(),
                edt_message.getText().toString().trim(),
                edt_phone.getText().toString().trim());
    }
}
