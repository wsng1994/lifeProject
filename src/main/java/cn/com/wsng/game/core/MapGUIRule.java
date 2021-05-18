package cn.com.wsng.game.core;

import cn.com.wsng.game.roler.RoleState;

import java.util.Map;

public interface MapGUIRule {
    /**
     * 是否为特殊边界
     * @param x
     * @param y
     * @return
     */
    public boolean isSpecificBoundary(int x,int y);

    /**
     * 是否为普通边界
     * @param x
     * @param y
     * @return
     */
    public boolean isBoundary(int x,int y);

    /**
     * 是否可以移动
     * @param x
     * @param y
     * @return
     */
    public boolean couldNotMove(int x,int y);

    /**
     * 重新定义角色坐标（暂时未用到）
     * @param roleState
     * @return
     */
    public RoleState reSetRoleIndex(RoleState roleState);

    /**
     * 获取
     * @return
     */
    public Map getWholeInfo(RoleState roleState);
}
