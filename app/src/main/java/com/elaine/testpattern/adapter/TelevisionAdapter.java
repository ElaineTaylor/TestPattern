package com.elaine.testpattern.adapter;

/**
 * 电视适配器
 * 拓展了接收网络信号，然后播放网络电视
 * author: elaine
 * date: 2021/4/25
 */
public class TelevisionAdapter implements Television {
    private AdvancedTelevision advancedTelevision;

    public TelevisionAdapter(String signalType) {
        if (signalType.equalsIgnoreCase("online")) {
            advancedTelevision = new OnlineTelevision();
        }
    }

    @Override
    public void showDigital(String signalType) {
        if (signalType.equalsIgnoreCase("online")) {
            advancedTelevision.showOnline(signalType);
        }
    }
}
