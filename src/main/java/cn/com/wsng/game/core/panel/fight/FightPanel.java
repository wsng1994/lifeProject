package cn.com.wsng.game.core.panel.fight;

import cn.com.wsng.game.frame.fight.FightJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FightPanel extends JPanel implements KeyListener {

    /**
     * 设置背景图片
     */
    private Image im;
    /**
     * 设置角色图片
     */
    private Image role;
    /**
     * 设置敌人图片
     */
    private Image enemy;


    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public FightPanel() {
        // 定义初始地图
//        this.currentMapName = currentMapName;
        this.im = new ImageIcon("src/main/resources/static/img/background/dark_grey.png").getImage();
        this.role = new ImageIcon("src/main/resources/static/img/wolf_right_2.png").getImage();
    }

    /**
     * 地图画板
     * @param g
     */
    public void paint(Graphics g) {
        //设置背景
        g.drawImage(this.im,0,0,this.getWidth(),this.getHeight(),this);
        //设置细节
        g.drawImage(role,0,this.getHeight()/2-50,null);
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
