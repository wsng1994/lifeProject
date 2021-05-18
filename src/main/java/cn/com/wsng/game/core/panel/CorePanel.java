package cn.com.wsng.game.core.panel;

import cn.com.wsng.game.action.AreaRule;
import cn.com.wsng.game.core.mapchange.M2mInfo;
import cn.com.wsng.game.core.source.Resource;
import cn.com.wsng.game.frame.fight.FightJFrame;
import cn.com.wsng.game.roler.RoleState;
import cn.com.wsng.gui.WolfMoveUI;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import java.util.Map;

/**
 *
 * Control all move action and map change
 *
 *
 */

public class CorePanel extends JPanel implements KeyListener {

    /**
     * 坐标属性
     */
    public RoleState roleState;
    /**
     * 方向属性
     * 用于改变角色运动图片
     */
    private String direct,vector = "";
    /**
     * 获取界面宽高属性
     */
    private int windowsWidth,windowsHeight;
    /**
     * 获取角色静态属性
     */
    private int l = WolfMoveUI.HEIGHT;
    /**
     * 角色坐标属性
     */
    int x=0,y=0;
    /**
     * 默认角色图片信息
     */
    private String[] moveActionArray = WolfMoveUI.WOLF_DOWN_ARRAY;
    /**
     * 地图切换时
     * 当前地图信息，人物坐标信息
     */
    private M2mInfo m2mInfo;
    /**
     * 当前地图信息
     */
    private MapGUI currentMap;
    /**
     * 当前地图样式（用作beanName）
     */
    private String currentMapName;
    /**
     * 定义角色图片
     */
    private Image role ;
    /**
     * 定义背景图片
     */
    private Image im;
    /**
     * a new JFrame
     */
    private FightJFrame jFrame;
    public CorePanel(String currentMapName){
        // 定义初始地图
        this.currentMapName = currentMapName;
        // 计算窗体新宽度
        this.windowsWidth = 320;
        // 计算窗体新宽度
        this.windowsHeight = 320;
        this.im = new ImageIcon("src/main/resources/static/img/background/background.png").getImage();

    }

    /**
     * 地图画板
     * @param g
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(this.im,0,0,this.getWidth(),this.getHeight(),this);
        //根据角色移动方向及坐标展示不同的角色图片
        if(("vertical".equals(direct)&&y%2==0)||("horizon".equals(direct)&&x%2==0)){
            role=new ImageIcon(moveActionArray[0]).getImage();
        }else{
            role=new ImageIcon(moveActionArray[1]).getImage();
        }
        //设置角色展示图片
        g.drawImage(role,x,y,null);



    }


    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

        String mapName = Resource.RULE_PACKAGE_PATH+currentMapName+"Rule";
        Class ruleClazz = null;
        Method m = null;
        try {
            ruleClazz = Class.forName(mapName);
            m = ruleClazz.getMethod("couldNotMove",int.class,int.class);
            boolean flag = (Boolean)m.invoke(ruleClazz.newInstance(),x,y);
            switch (e.getKeyCode()){
                case 40:
                    this.moveActionArray = WolfMoveUI.WOLF_DOWN_ARRAY;
                    this.direct = "vertical";
                    this.vector="down";
                    if(y<=windowsHeight-10-l-l/2){
                        if(!flag){
                            y+=5;
                        }else{
                            y-=5;
                        }

                    }
                    break;
                case 37:
                    this.moveActionArray = WolfMoveUI.WOLF_LEFT_ARRAY;
                    this.direct = "horizon";
                    this.vector="left";
                    if(x>=5){
                        if(!flag){
                            x-=5;
                        }else{
                            x+=5;
                        }
                    }
                    break;
                case 38:
                    this.moveActionArray = WolfMoveUI.WOLF_UP_ARRAY;
                    this.direct = "vertical";
                    this.vector="up";
                    if(y>=5){
                        if(!flag){
                            y-=5;
                        }else{
                            y+=5;
                        }
                    }
                    break;
                case 39:
                    this.moveActionArray = WolfMoveUI.WOLF_RIGHT_ARRAY;
                    this.direct = "horizon";
                    this.vector="right";
                    if(x<=windowsWidth-l){
                        if(!flag){
                            x+=5;
                        }else{
                            x-=5;
                        }
                    }
                    break;
                default:
                    break;

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //记录坐标
        roleState = new RoleState(x,y,vector);
        // get all properties of panel
        AreaRule areaRule = new AreaRule(roleState,currentMapName);

        m2mInfo = areaRule.storeM2mInfo();
        if(m2mInfo!=null){
            Map allInfo = m2mInfo.getParams();
            this.currentMap = (MapGUI) allInfo.get("currentMap");
            roleState = (RoleState) allInfo.get("roleState");
            this.x = roleState.getX();
            this.y = roleState.getY();
        }
        if(currentMap != null){
            this.im = currentMap.getMapBg();
        }
        if( x>=50 && jFrame == null ){
            jFrame = new FightJFrame();
        }
        this.repaint();

    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

}
