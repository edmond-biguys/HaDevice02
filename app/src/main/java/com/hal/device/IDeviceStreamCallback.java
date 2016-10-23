package com.hal.device;

/**
 * Created by cjj on 16/10/21.
 */
public interface IDeviceStreamCallback {

    void onReceiveStreamData(byte[] buf);

}
