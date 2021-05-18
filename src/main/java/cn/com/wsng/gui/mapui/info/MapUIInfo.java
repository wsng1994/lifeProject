package cn.com.wsng.gui.mapui.info;

import cn.com.wsng.gui.mapui.ui.MapGUI;

public interface MapUIInfo {
    //定义可移动范围
    //穿越边界范围
    //获取当前地图信息
    public MapGUI getMapInfo(String mapName) throws ClassNotFoundException;
}
