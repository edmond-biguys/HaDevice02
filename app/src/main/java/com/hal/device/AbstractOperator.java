package com.hal.device;

import java.util.Map;

/**
 * Created by cjj on 16/10/21.
 */
public abstract class AbstractOperator {


    public abstract void startConfig();
    public abstract void stopConfig();
//    public abstract void sendCommand(Map<String, Object> command, String idd, String idf, String type);

    public abstract void operate();
}
