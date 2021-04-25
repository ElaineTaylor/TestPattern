package com.elaine.testpattern.adapter;

/**
 * 新款电视
 * author: elaine
 * date: 2021/4/25
 */
public interface AdvancedTelevision {
    /**
     * 网络电视
     *
     * @param signalType 电视信号类型
     */
    void showOnline(String signalType);
}
