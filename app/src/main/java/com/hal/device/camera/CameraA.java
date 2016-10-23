package com.hal.device.camera;

import android.util.Log;


import com.hal.device.AbstractDevice;
import com.hal.device.AbstractOperator;
import com.hal.device.IDeviceCallback;
import com.hal.device.IDeviceStreamCallback;

import java.util.Map;

/**
 * Created by cjj on 16/10/21.
 */
public class CameraA extends AbstractDevice implements IDeviceCallback, IDeviceStreamCallback {


    @Override
    public void operator() {
        Log.d("", "CameraA: 4");
        mOperator.operate();
    }

    @Override
    public void startConfi() {
        mOperator.stopConfig();
    }

    @Override
    public void stopConfig() {
        mOperator.stopConfig();
    }

    public CameraA(String deviceId, int functionId, Map<String, Object> command, String type, OnCameraAOperateListener listener) {


        super(deviceId, functionId, command, type);

        Log.d("", "CameraA: 3");
        this.listener = listener;
    }


    /**
     * 设置配置模式
     * @param configType
     */
    @Override
    public void setConfigMode(String configType) {
        this.configType = configType;
    }



    OnCameraAOperateListener listener;
    public interface OnCameraAOperateListener{
        void onReceiveData(String content);
        void onReceiveStreamData(byte[] buf);
    }



    @Override
    public void onReceiveData(String content) {

        //数据返回，给页面显示用
        listener.onReceiveData(content);

    }

    @Override
    public void onReceiveStreamData(byte[] buf) {

        //流数据返回
        listener.onReceiveStreamData(buf);

    }
}
