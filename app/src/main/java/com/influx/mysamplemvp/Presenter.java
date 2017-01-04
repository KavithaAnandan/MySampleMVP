package com.influx.mysamplemvp;

/**
 * Created by Selva Ganesh on 04-01-2017.
 */

public interface Presenter <V extends MVPView> {

    void attachview(V MVPView);

    void detachview();

}
