package creationpatterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button {

    JPanel mJPanel = new JPanel();
    JFrame mJFrame = new JFrame();
    JButton mJButton;

    @Override
    public void onClick() {
        mJButton = new JButton("Exit");
        mJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mJFrame.setVisible(false);
                System.exit(0);
            }
        });
    }

    @Override
    public void draw() {
        mJFrame.setDefaultCloseOperation(mJFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Factory Method Creational Pattern");
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        mJPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mJFrame.getContentPane().add(mJPanel);
        mJPanel.add(label);
        onClick();
        mJPanel.add(mJButton);
        mJFrame.setSize(600, 400);
        mJFrame.setVisible(true);
        onClick();
    }
}
