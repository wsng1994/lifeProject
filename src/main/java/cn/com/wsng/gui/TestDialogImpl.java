package cn.com.wsng.gui;

import javax.swing.*;

public class TestDialogImpl extends JFrame implements TestDialog {



    @Override
    public void showDialog(String dialog) {
            Object[] options = { "OK ", "CANCEL " };
            JOptionPane.showOptionDialog(null, "您还没有输入 ", "提示", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,null, options, options[0]);
    }

    @Override
    public void showDialog() {

    }
}
