package cn.com.wsng.gui.mapui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUI implements MapUIFactory {

    /**
     *
     * defined 1000X1000 map
     */
    public static final int MODUL_PART_WIDTH = 32;

    public static final int MAP_WIDTH = 320;
    public static final int MAP_HEIGHT = 320;

//    public static final int MODUL_PART_HEIGHT = 32;

    @Override
    public boolean couldCross() {
        return false;
    }

    /**
     *  生成 400个
     *
     */
    public static List<Map<Integer,Integer>> mapUI(){
        int x = 320;
//        int y = 320;
        List<Map<Integer,Integer>> mapIndex = new ArrayList<Map<Integer,Integer>>();

        for(int i = 0;i<x;){
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            map.put(i,i);
            mapIndex.add(map);
            i+=MODUL_PART_WIDTH;
//            System.out.println(i);
        }
       return mapIndex;

    }

    public static void main(String[] args) {
        MapUI.mapUI();
    }



}
