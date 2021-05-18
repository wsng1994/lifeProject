package cn.com.wsng.game.action;

import cn.com.wsng.game.core.mapchange.M2mInfo;
import cn.com.wsng.game.core.source.Resource;
import cn.com.wsng.game.roler.RoleState;
import cn.com.wsng.gui.mapui.info.CurrentMapInfo;
import cn.com.wsng.gui.mapui.info.MapUIInfo;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreaRule {
    //角色状态信息
    private RoleState roleState;
    //地图变化信息
    private M2mInfo m2mInfo;
    //当前地图样式
    private String currentMapName;

    public AreaRule(RoleState state, String currentMapName){
        this.roleState = state;
        this.currentMapName = currentMapName;
    }

    /**
     *   这里处理主要作用
     *   规范角色移动范围、越界定义、背景定义
     *   处理数据 M2mInfo 清除数据，重新定义
     *   包括：坐标数据 角色数据 背景图片数据
     * @return
     */
    public M2mInfo storeM2mInfo()  {

        currentMapName = Resource.RULE_PACKAGE_PATH+currentMapName+Resource.CLASS_RULE_SUFFIX;

        Class ruleMapClazz = null;

        Method m = null;

        try {
            ruleMapClazz = Class.forName(currentMapName);

            m = ruleMapClazz.getMethod("getWholeInfo",RoleState.class);

            Map map = (Map)m.invoke(ruleMapClazz.newInstance(),roleState);

            if(map.isEmpty()){
                return null;
            }
            m2mInfo = new M2mInfo(map);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return m2mInfo;
    }




}
