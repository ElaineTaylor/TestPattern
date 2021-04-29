package com.elaine.testpattern.chain;

import android.util.Log;

/**
 * 员工
 * author: elaine
 * date: 2021/4/29
 */
public abstract class Staff {
    //想要申请的假期天数
    int holiday;

    /**
     * 设置想要申请的假期天数
     *
     * @param holiday 天数
     */
    public abstract void setHoliday(int holiday);

    /**
     * 提交申请审批时的打印
     */
    public void submitHoliday() {
        Log.e("我是员工", "我想要申请" + holiday + "天");
    }
}
