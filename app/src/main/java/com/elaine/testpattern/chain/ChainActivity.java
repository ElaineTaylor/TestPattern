package com.elaine.testpattern.chain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.elaine.testpattern.R;

public class ChainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain);
        use();
    }

    private void use() {
        EntryLevelStaff entryLevelStaff = new EntryLevelStaff();
        entryLevelStaff.setHoliday(4);

        Leader leader = getLeader();
        leader.handleHoliday(entryLevelStaff);
    }

    /**
     * 获取到最低的领导
     *
     * @return 组长
     */
    private Leader getLeader() {
        GroupLeader groupLeader = new GroupLeader();
        groupLeader.setApproveDay(1);

        DirectorLeader directorLeader = new DirectorLeader();
        directorLeader.setApproveDay(3);

        ManagerLeader managerLeader = new ManagerLeader();
        managerLeader.setApproveDay(5);

        BossLeader bossLeader = new BossLeader();
        bossLeader.setApproveDay(7);

        //设置每个领导上面更高的领导
        groupLeader.setNextLeader(directorLeader);
        directorLeader.setNextLeader(managerLeader);
        managerLeader.setNextLeader(bossLeader);

        return groupLeader;
    }
}