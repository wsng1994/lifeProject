package cn.com.wsng.gui;

import cn.com.wsng.game.core.panel.CorePanel;
import cn.com.wsng.gui.mapui.style.BeginUI;
import cn.com.wsng.gui.mapui.ui.MapGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class InitGameWindow extends JFrame{
    private static final long serialVersionUID = 8256394807443698879L;
    private JPanel contentPane;

    //    JLabel label = new JLabel("姓名");
    JTextField textField = new JTextField(16);
//    JButton button = new JButton("确定");
    public InitGameWindow(){
        this.creatWindow();
    }

    public void creatWindow() {
        //添加窗口监听事件
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                do_this_windowOpened(e);
            }
        });
        //设置默认关闭操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建画板对象
        //设置初始地图数据
//        MapGUI currentMap = new BeginUI();

        contentPane = new CorePanel(BeginUI.NAME);
        //添加控件 暂时用不到
//        contentPane.add(label);
//        contentPane.add(textField);
//        contentPane.add(button);
        setContentPane(contentPane);
        //加入监听事件
        this.addKeyListener((KeyListener) contentPane);
    }

    /**
     * 窗口监听事件，后面可将窗口自适应展示
     * 测试环境，大小写死
     * @param e
     */
    protected void do_this_windowOpened(WindowEvent e) {
        // 获得窗体工具包
        Toolkit toolkit = getToolkit();
        // 获取屏幕大小
        Dimension screenSize = toolkit.getScreenSize();
        // 计算窗体新宽度
        int width = (int) (screenSize.width * 0.5);
        // 计算窗体新宽度
        int height = (int) (screenSize.height * 0.5);
        // 设置窗体大小
        this.setSize(320, 320);
        //设置窗体初始位置，NULL表示默认居中
        this.setLocationRelativeTo(null);
    }


    /**
     *
     * 监听按钮事件
     */
    private void onButtonOk() {
        String str = textField.getText();//获取输入内容
        //判断是否输入了
        if(str.equals("")){
            //自定义弹出事件
            TestDialogImpl ti = new TestDialogImpl();
            ti.showDialog("hello,world!");
        }else{
            //弹出输入提示
            JOptionPane.showMessageDialog(this,"您输入了：" + str);
        }
    }

}
