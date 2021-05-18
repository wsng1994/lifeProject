package cn.com.wsng.gui.mapui.style;

import cn.com.wsng.gui.mapui.ui.MapGUI;

import javax.swing.*;
import java.awt.*;

public class FirstUI implements MapGUI {

    public static final String NAME = "lady";

    //背景
    public static final Image IMAGE =
            new ImageIcon("src/main/resources/static/img/background/bg.png").getImage();

    @Override
    public String getMapStyle() {
        return NAME;
    }

    @Override
    public Image getMapBg() {
        return IMAGE;
    }
}
