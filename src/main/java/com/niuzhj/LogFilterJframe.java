/*
 * Created by JFormDesigner on Sat Dec 01 16:23:05 CST 2018
 */

package com.niuzhj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author niuzhj
 */
public class LogFilterJframe extends JFrame {
    public static void main(String[] args) {
        LogFilterJframe frame = new LogFilterJframe();

        frame.setTitle("日志过滤小工具");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public LogFilterJframe() {
        initComponents();
    }

    private void okButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        String fileReader = textField1.getText().trim();
        String fileWriter = textField2.getText().trim();
        String keyWords = textField3.getText().trim();

        ReadAndWrite.raw(fileReader, fileWriter, keyWords);

        System.out.println("日志过滤已完成");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("\u8f93\u5165\u8def\u5f84");
                contentPanel.add(label1, "cell 1 1");
                contentPanel.add(textField1, "cell 1 2 9 1,dock center");

                //---- label2 ----
                label2.setText("\u8f93\u51fa\u8def\u5f84");
                contentPanel.add(label2, "cell 1 4");
                contentPanel.add(textField2, "cell 1 5 9 1,dock center");

                //---- label3 ----
                label3.setText("\u5173\u952e\u5b57\uff08\u591a\u4e2a\u5173\u952e\u5b57\u4ee5\u82f1\u6587,\u9694\u5f00\uff09");
                contentPanel.add(label3, "cell 1 7");
                contentPanel.add(textField3, "cell 1 8 9 1,dock center");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("\u5f00\u59cb\u8fc7\u6ee4");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        okButtonActionPerformed(e);
                    }
                });
                buttonBar.add(okButton, "cell 0 0 13 1,dock center");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
