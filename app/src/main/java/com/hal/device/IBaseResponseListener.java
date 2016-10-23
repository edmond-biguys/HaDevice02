package com.hal.device;

/**
 * Created by cjj on 16/10/23.
 */
public interface IBaseResponseListener {

    public void onFailed(String errMsg, int errCode);
    public void onSuccess(String content);

}
