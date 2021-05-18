package cn.com.wsng.gui.mapui.style;

import cn.com.wsng.gui.mapui.MapUI;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BeginUI implements MapGUI {

    //地区名称
    public static final String NAME = "BeginUI";

    private int boundaryX = MapUI.MAP_WIDTH;
    private int boundaryY = MapUI.MAP_HEIGHT;

    //背景
    public static final Image IMAGE =
            new ImageIcon("src/main/resources/static/img/background/background.png").getImage();
    //地图属性
    public Map beginUI ;

    public int xx;
    public int yy;

    public String vector;

    public static Map<String,MapGUI> relativeMap;

    //定义相邻地图
    static {
        relativeMap = new HashMap<>();
        relativeMap.put("down",new CityMoonUI());
    }

    //边界越界条件

    //特殊越界条件


    public BeginUI(){
        if (beginUI==null){
            beginUI = new HashMap<>();
        }
        beginUI.put("name",NAME);
        beginUI.put("img",IMAGE);
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

    public Map getBeginUI() {
        return beginUI;
    }

    public void setBeginUI(Map beginUI) {
        this.beginUI = beginUI;
    }

    //定义特殊边界坐标
    public boolean isSpecificBoundary(int x,int y){
        return x>70 && x<150 && y>50 && y<120;
    }

    //定义普通边界
//    public boolean isBoundary(int x,int y){
//        return x>=0 && x<=boundaryX && y>0 && y<boundaryY;
//    }

    //定义不可移动区域
//    public boolean couldMove(int x,int y){
//        return x>=0 && x<=boundaryX && y>0 && y<boundaryY;
//    }

    //



    //后续定义不可移动范围


}
