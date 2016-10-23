package com.hal.device;

import android.text.TextUtils;
import android.util.Log;

import com.hal.config.BaseConfig;
import com.hal.connection.BaseConnection;
import com.hal.constant.ConstConfig;

import java.util.Map;

/**
 * Created by cjj on 16/10/21.
 */
public abstract class AbstractDevice {

    public String deviceId;//设备Id
    public int functionId;//设备功能点id


    public String connectionType;//连接方式

    public String configType;//配网方式

    public Map<String, Object> command;//执行命令


    public AbstractOperator mOperator;

    public abstract void operator();
    public abstract void startConfi();
    public abstract void stopConfig();

    public abstract void setConfigMode(String configType);

    public AbstractDevice() {

    }


    /**
     * 指定连接方式
     * @param deviceId
     * @param functionId
     * @param command
     * @param type 连接方式
     */
    public AbstractDevice(String deviceId, int functionId, Map<String, Object> command, String type) {

        Log.d("", "CameraA: 2");
        this.deviceId = deviceId;
        this.functionId = functionId;
        this.command = command;
        this.connectionType = type;//连接方式

        mOperator = new AbstractOperator() {
            @Override
            public void startConfig() {
                getConfigration().startConfig();

            }

            @Override
            public void stopConfig() {
                getConfigration().stopConfig();

            }

            @Override
            public void operate() {

                Log.d("", "CameraA: 5");
                getConnection().connect();

            }
        };


    }

    //ssid 密码等信息
    public AbstractDevice(String configType) {
        this.configType = configType;
    }




    /**
     * 获取连接方式
     * @return
     */
    public BaseConnection getConnection() {


        Log.d("", "CameraA: 6");
        BaseConnection baseRequest =null;
        try {
            baseRequest = (BaseConnection) Class.forName(connectionType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("", "CameraA: 7.5");
            return null;
        }

        Log.d("", "CameraA: 7");
        return baseRequest;
    }

    /**
     * 配置方式
     * @return
     */
    public BaseConfig getConfigration() {
        BaseConfig baseConfig = null;
        try {
            if (TextUtils.isEmpty(configType)) {
                configType = ConstConfig.SMART_CONFIG;//默认配置方式
            }
            baseConfig = (BaseConfig) Class.forName(configType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return baseConfig;
    }


}
