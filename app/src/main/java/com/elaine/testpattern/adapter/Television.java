package com.elaine.testpattern.adapter;

/**
 * 普通电视
 * author: elaine
 * date: 2021/4/25
 */
public interface Television {
    /**
     * 数字电视
     *
     * @param signalType 电视信号类型
     */
    void showDigital(String signalType);
}
