package com.hal.device.Aircleaner;

import android.util.Log;

import com.hal.device.AbstractDevice;
import com.hal.device.AbstractOperator;
import com.hal.device.IDeviceCallback;
import com.hal.device.IDeviceStreamCallback;

import java.util.Map;

/**
 * Created by cjj on 16/10/23.
 */
public class AirCleaner extends AbstractDevice implements IDeviceCallback, IDeviceStreamCallback {



    public AirCleaner(String deviceId, int functionId, Map<String, Object> command, String type, OnAirCleanerOperateListener listener) {


        super(deviceId, functionId, command, type);

        Log.d("", "CameraA: 3");
        this.listener = listener;
    }

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

    @Override
    public void setConfigMode(String configType) {
        this.configType = configType;
    }

    OnAirCleanerOperateListener listener;
    public interface OnAirCleanerOperateListener{
        void onReceiveData(String content);
    }

    @Override
    public void onReceiveData(String content) {

    }

    @Override
    public void onReceiveStreamData(byte[] buf) {

    }
}
