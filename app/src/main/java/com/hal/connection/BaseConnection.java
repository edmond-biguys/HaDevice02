package com.hal.connection;


import com.hal.device.IBaseResponseListener;

/**
 * Created by cjj on 16/10/21.
 */
public abstract class BaseConnection {

    public void connect(){
        registerResponse(getResponseListener());
    }

    public abstract void registerResponse(IBaseResponseListener listener);



    public abstract IBaseResponseListener getResponseListener();


}
