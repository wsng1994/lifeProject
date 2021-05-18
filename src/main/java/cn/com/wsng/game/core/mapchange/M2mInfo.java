package cn.com.wsng.game.core.mapchange;

import cn.com.wsng.gui.mapui.ui.MapGUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 目标
 * 这个得用单例模式
 * 后面扩展
 */
public class M2mInfo {

    /**
     * 定义返回地图信息
     */
    public Map params;


    public M2mInfo(Map map){
        this.params = map;
    }


    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }
}
