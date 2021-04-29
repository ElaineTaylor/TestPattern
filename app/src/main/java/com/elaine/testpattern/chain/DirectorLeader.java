package com.elaine.testpattern.chain;

import android.util.Log;

/**
 * 总监
 * author: elaine
 * date: 2021/4/29
 */
public class DirectorLeader extends Leader {
    @Override
    public void setApproveDay(int day) {
        super.approveDay = day;
    }

    @Override
    public void handle(Staff staff) {
        staff.submitHoliday();
        Log.e("我是总监", "我同意你休" + staff.holiday + "天假期");
    }

    @Override
    public void setNextLeader(Leader nextLeader) {
        super.nextLeader = nextLeader;
    }
}