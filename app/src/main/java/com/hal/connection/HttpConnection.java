package com.hal.connection;

import com.hal.device.IBaseResponseListener;
import com.hal.util.Logger;

/**
 * Created by cjj on 16/10/21.
 */
public class HttpConnection extends BaseConnection implements IBaseResponseListener {

    private HttpConnection() {
    }


    @Override
    public void connect() {

        super.connect();

        //TODO 使用相关参数(通过deviceId，functionId，command来控制设备) 连接逻辑
        Logger.log_d("HttpConnection", "HttpConnection connect");


    }

    @Override
    public IBaseResponseListener getResponseListener() {
        return null;
    }

    @Override
    public void registerResponse(IBaseResponseListener listener) {

    }


    @Override
    public void onFailed(String errMsg, int errCode) {

    }

    @Override
    public void onSuccess(String content) {

    }
}
