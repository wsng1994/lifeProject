package cn.com.wsng;

import cn.com.wsng.gui.InitGameWindow;

import javax.swing.*;

public class GameBegin {

    protected static void creat(){

        JFrame frame = new InitGameWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        // 显示窗口
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        // 显示应用 GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                creat();
            }
        });
    }

}
