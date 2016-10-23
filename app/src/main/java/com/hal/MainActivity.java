package com.hal;

import android.app.Activity;
import android.os.Bundle;

import com.hal.constant.ConstConnection;
import com.hal.device.Aircleaner.AirCleaner;
import com.hal.device.camera.CameraA;

import java.util.Map;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String deviceId = null;
        int idf =0;
        Map<String , Object> command = null;

        //不同设备对应的 配置，控制
        CameraA cameraA = new CameraA(deviceId, idf, command, ConstConnection.BLUE_TOOTH, new CameraA.OnCameraAOperateListener() {
            @Override
            public void onReceiveData(String content) {
                //TODO ui更新
            }

            @Override
            public void onReceiveStreamData(byte[] buf) {
                //TODO ui更新
            }
        });
        cameraA.operator();//对设备进行控制等操作
        cameraA.startConfi();//配置
        cameraA.stopConfig();//停止配置


        //不同设备对应的 配置，控制
        AirCleaner airCleaner = new AirCleaner(deviceId, idf, command, ConstConnection.HTTP_CONNECTION, new AirCleaner.OnAirCleanerOperateListener() {
            @Override
            public void onReceiveData(String content) {
                //TODO ui更新
            }
        });
        airCleaner.operator();//对设备进行控制等操作
        airCleaner.startConfi();//配置
        airCleaner.stopConfig();//停止配置

    }
}
