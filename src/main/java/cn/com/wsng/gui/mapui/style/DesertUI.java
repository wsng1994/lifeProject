package cn.com.wsng.gui.mapui.style;

import cn.com.wsng.gui.mapui.MapUI;
import cn.com.wsng.gui.mapui.ui.UIDefined;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.List;
import java.util.Map;

public  class DesertUI extends JPanel {
    public Graphics graphics;

    public DesertUI(UIDefined ui){
        graphics = ui.getGraphics();
        graphics.drawImage(ui.getImageBg(),0,0,ui.getWidth(),ui.getHeight(),ui.getImageObserver());



//        super.paint(graphics);
    }

    public void paint(Graphics g) {
//            Image role1 = new ImageIcon("src/main/resources/static/img/wolf_down_1.png").getImage();
//            List<Map<Integer, Integer>> list = MapUI.mapUI();
//            super.paint(g);
//            for (Map<Integer, Integer> map : list) {
//                map.forEach((k, v) -> {
//                    g.drawImage(role1, k, 0, null);
//                });
//
//        }
    }
}
