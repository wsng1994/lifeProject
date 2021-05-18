package cn.com.wsng.game.rule;

import cn.com.wsng.game.core.MapGUIRule;
import cn.com.wsng.game.roler.RoleState;
import cn.com.wsng.gui.mapui.MapUI;
import cn.com.wsng.gui.mapui.style.BeginUI;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import java.util.HashMap;
import java.util.Map;

public class BeginUIRule implements MapGUIRule {

    private int boundaryX = MapUI.MAP_WIDTH;

    private int boundaryY = MapUI.MAP_HEIGHT;

    private int xx;

    private int yy;

    public BeginUIRule(){
    }


    /**
     * 是否为特殊边界
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean isSpecificBoundary(int x, int y) {
        return x>70 && x<150 && y>50 && y<120;
    }

    /**
     * 是否为普通边界
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean isBoundary(int x,int y) {
        System.out.printf("isBoundary======%s====%s \n",x,y);
        return x>=0 && x<boundaryX && y>=0 && y<265;
    }

    /**
     * 是否可以移动
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public  boolean couldNotMove(int x,int y) {
        return (x>=150 && x<=200) && y>=100;
    }

    /**
     * 重新定义角色坐标
     * 暂时未用到
     * @param roleState
     * @return
     */
    @Override
    public RoleState reSetRoleIndex(RoleState roleState) {
        // 获取角色信息
        String vector = roleState.getVector();

        int x = roleState.getX();

        int y = roleState.getY();

        if(isBoundary(x,y)){
            MapGUI nextMap = BeginUI.relativeMap.get(vector);
        }
        return roleState;
    }

    /**
     * 获取
     *
     * @return
     */
    @Override
    public Map getWholeInfo(RoleState roleState) {

        int x = roleState.getX();
        int y = roleState.getY();
        String vector = roleState.getVector();
        Map resultMap = new HashMap();
        if(isBoundary(x,y)){
            if(isSpecificBoundary(x,y)){
                //特殊边界暂不处理
            }
        }else{
            MapGUI currentMap = BeginUI.relativeMap.get(vector);
            reSetIndex(x,y,vector);
            roleState = new RoleState(xx,yy,vector);
            resultMap.put("roleState",roleState);
            resultMap.put("currentMap",currentMap);
        }
        return resultMap;
    }

    /**
     * 越界后坐标处理
     * @param x
     * @param y
     * @param vector
     */
    private void reSetIndex(int x,int y,String vector){
        if ("up".equals(vector)){
            this.xx = x;
            this.yy = boundaryY;
        } else if("down".equals(vector)){
            this.xx = x;
            this.yy = 0;
        } else if("left".equals(vector)){
            this.xx = boundaryX;
            this.yy = y;
        } else if("right".equals(vector)){
            this.xx = 0;
            this.yy = y;
        }
    }



}
