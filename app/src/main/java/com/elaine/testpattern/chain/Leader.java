package com.elaine.testpattern.chain;

/**
 * 领导
 * author: elaine
 * date: 2021/4/29
 */
public abstract class Leader {
    //可以批的假期天数
    int approveDay;
    //更高级别的领导
    Leader nextLeader;

    /**
     * 设置可以批的假期天数
     *
     * @param day 天数
     */
    public abstract void setApproveDay(int day);

    /**
     * 处理员工的假期
     *
     * @param staff 员工
     */
    public abstract void handle(Staff staff);

    /**
     * 设置更高级别的老板
     *
     * @param nextLeader 更高级别的领导
     */
    public abstract void setNextLeader(Leader nextLeader);

    /**
     * 链式处理假期天数
     *
     * @param staff 员工
     */
    public void handleHoliday(Staff staff) {
        //如果当前的申请天数<=当前领导能批的天数，则直接该领导处理，否则交给更高级别的老板
        if (staff.holiday <= approveDay) {
            handle(staff);
        } else {
            nextLeader.handleHoliday(staff);
        }
    }
}
