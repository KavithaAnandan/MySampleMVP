package com.influx.mysamplemvp;

import android.content.Context;

/**
 * Created by Selva Ganesh on 04-01-2017.
 */

public class LoginPresenter extends BasePresenter<LoginView> {


    public LoginPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void attachview(LoginView MVPView) {
        super.attachview(MVPView);
    }

    @Override
    public void detachview() {
        super.detachview();
    }

    public void submitform(String edt_name, String edt_email, String edt_phone, String edt_message) {

        if(!edt_name.equalsIgnoreCase("") && !edt_email.equalsIgnoreCase("") && !edt_message.equalsIgnoreCase("") && !edt_phone.equalsIgnoreCase("") ){
            getmMVPView().submitbtn();
        }else{
            getmMVPView().showAlert();
        }



    }
}
