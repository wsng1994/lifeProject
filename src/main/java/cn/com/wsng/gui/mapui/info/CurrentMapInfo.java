package cn.com.wsng.gui.mapui.info;

import cn.com.wsng.gui.mapui.style.BeginUI;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Map;

public class CurrentMapInfo implements MapUIInfo {

    private static String PACKAGE_PATH = "cn.com.wsng.gui.mapui.style.";
    @Override
    public MapGUI getMapInfo(String className) throws ClassNotFoundException {
        try {
            //拼接类名
            String clazzName = PACKAGE_PATH+className;
            //获取类
            Class attrObjClass = Class.forName(clazzName);
            //获取地图方法
            Method m = attrObjClass.getMethod("get"+className);
            //反射地图信息
//            Map map = (Map)m.invoke(attrObjClass.newInstance());
            return (MapGUI)attrObjClass.newInstance();
        }catch (Exception e){
            System.out.println("class not found error!");
            e.getMessage();
        }

        return null;
    }

}
