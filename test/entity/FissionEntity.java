package entity;

import com.gaozl.sqlite.annotation.AutoIncrement;
import com.gaozl.sqlite.annotation.PrimaryKey;

/**
 * @author gaozl Create by 2017/12/19
 */
public class FissionEntity {

    @AutoIncrement
    @PrimaryKey
    private Integer id;
    /**
     * 群名称
     */
    private String groupNickName;
    /**
     * 邀请人
     */
    private String inviteNickName;
    /**
     * 被邀请人
     */
    private String beInvitedNickName;
    /**
     * 是否退群,1:没有退群，2：退群
     */
    private Integer isExitGroup;
    /**
     * 入群时间
     */
    private Long joinGroupTime;
    /**
     * 退群时间
     */
    private Long exitGroupTime;
    /**
     * 修改时间
     */
    private Long updateTime;

    public static final int EXIT_GROUP = 2; // 退群
    public static final int NOT_EXIT_GROUP = 1; // 没有退群

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIsExitGroup(Integer isExitGroup) {
        this.isExitGroup = isExitGroup;
    }

    public String getGroupNickName() {
        return groupNickName;
    }

    public void setGroupNickName(String groupNickName) {
        this.groupNickName = groupNickName;
    }

    public String getInviteNickName() {
        return inviteNickName;
    }

    public void setInviteNickName(String inviteNickName) {
        this.inviteNickName = inviteNickName;
    }

    public String getBeInvitedNickName() {
        return beInvitedNickName;
    }

    public void setBeInvitedNickName(String beInvitedNickName) {
        this.beInvitedNickName = beInvitedNickName;
    }

    public int getIsExitGroup() {
        return isExitGroup;
    }

    public void setIsExitGroup(int isExitGroup) {
        this.isExitGroup = isExitGroup;
    }

    public Long getJoinGroupTime() {
        return joinGroupTime;
    }

    public void setJoinGroupTime(Long joinGroupTime) {
        this.joinGroupTime = joinGroupTime;
    }

    public Long getExitGroupTime() {
        return exitGroupTime;
    }

    public void setExitGroupTime(Long exitGroupTime) {
        this.exitGroupTime = exitGroupTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

}
