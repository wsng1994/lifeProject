package cn.com.wsng.gui.mapui.style;

import cn.com.wsng.gui.mapui.MapUI;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CityMoonUI implements MapGUI {

    //地区名称
    public static final String NAME = "CityMoonUI";

    private int boundaryX = MapUI.MAP_WIDTH;
    private int boundaryY = MapUI.MAP_HEIGHT;

    //背景
    public static final Image IMAGE =
            new ImageIcon("src/main/resources/static/img/background/bg.jpg").getImage();
    //地图属性
    public Map cityMoonUI ;

    public int xx;
    public int yy;

    public String vector;

    public static Map<String,MapGUI> relativeMap;

    //定义相邻地图
    static {
        relativeMap = new HashMap<>();
        relativeMap.put("up",new BeginUI());
    }

    //边界越界条件

    //特殊越界条件


    public CityMoonUI(){
        if (cityMoonUI==null){
            cityMoonUI = new HashMap<>();
        }
        cityMoonUI.put("name",NAME);
        cityMoonUI.put("img",IMAGE);
    }
    /**
     *  get style of map
     * @return style's name
     */
    @Override
    public String getMapStyle() {
        return NAME;
    }

    @Override
    public Image getMapBg() {
        return IMAGE;
    }

    public Map getCityMoonUI() {
        return cityMoonUI;
    }

    public void setCityMoonUI(Map cityMoonUI) {
        this.cityMoonUI = cityMoonUI;
    }
}
