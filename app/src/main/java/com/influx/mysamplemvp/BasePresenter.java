package com.influx.mysamplemvp;

import android.content.Context;

/**
 * Created by Selva Ganesh on 04-01-2017.
 */

public class BasePresenter<T extends MVPView> implements Presenter<T> {

    public Context context;
    public T mMVPView;
    private MyProgressDialog myProgressDialog;

    @Override
    public void attachview(T MVPView) {
        mMVPView = MVPView;
    }

    @Override
    public void detachview() {
        mMVPView = null;
    }

    public boolean isviewAttached(){
        return mMVPView!=null;
    }

    public void checkviewAttached(){
        if(!isviewAttached()) throw new MVPNotAttachedException();
    }

    public static class MVPNotAttachedException extends RuntimeException {
        public MVPNotAttachedException() {super( "Presenter" );}
    }

    public T getmMVPView(){
        return  mMVPView;
    }
}
