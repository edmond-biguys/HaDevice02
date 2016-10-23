package com.hal.connection;

import android.util.Log;

import com.hal.device.IBaseResponseListener;


/**
 * Created by cjj on 16/10/21.
 */
public class BlueToothConnection extends BaseConnection implements IBaseResponseListener{


    @Override
    public void connect() {
        Log.d("", "CameraA: 8");

        //TODO 使用相关参数(通过deviceId，functionId，command来控制设备) 连接逻辑

    }

    @Override
    public void registerResponse(IBaseResponseListener listener) {

    }


    @Override
    public IBaseResponseListener getResponseListener() {
        return this;
    }


    @Override
    public void onFailed(String errMsg, int errCode) {

    }

    @Override
    public void onSuccess(String content) {

    }
}
