package com.elaine.testpattern.decorator;

/**
 * 用处装饰器
 *
 * author: elaine
 * date: 2021/4/23
 */
public abstract class UseDecorator implements PhoneUse {
    PhoneUse phoneUse;

    public UseDecorator(PhoneUse phoneUse) {
        this.phoneUse = phoneUse;
    }
}
