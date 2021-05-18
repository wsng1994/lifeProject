package cn.com.wsng.game.frame.fight;

import cn.com.wsng.game.core.panel.fight.FightPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FightJFrame extends JFrame implements ActionListener {

    private JPanel contentPane;

    JButton jb = new JButton();

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public FightJFrame() throws HeadlessException {
        this.setTitle("MySwing");
        contentPane = new FightPanel();
//        contentPane.setBackground(Color.darkGray);
        setContentPane(contentPane);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jb.setText("确定");
        this.add(jb);
//        this.setBounds(200, 300, 250, 300);
        this.setSize(320, 320);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //弹出新窗口
        jb.addActionListener(this);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
       for (;;){
           System.out.println(0);
       }

    }

}
