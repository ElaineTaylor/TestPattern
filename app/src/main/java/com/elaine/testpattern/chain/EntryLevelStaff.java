package com.elaine.testpattern.chain;

/**
 * 底层员工
 * author: elaine
 * date: 2021/4/29
 */
public class EntryLevelStaff extends Staff {
    @Override
    public void setHoliday(int holiday) {
        super.holiday = holiday;
    }
}
