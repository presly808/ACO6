package ua.artcode.week7.swing;

import ua.artcode.io.FileUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * Created by serhii on 06.06.15.
 */
public class MyFirstFrame extends JFrame {

    private JTextArea area;
    private JTextField field;

    public MyFirstFrame() {
        setTitle("FIRST FRAME");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        init();
        setVisible(true);
    }

    private void init() {
        JButton button = new JButton("PRESS ME!");
        getContentPane().add(button, BorderLayout.SOUTH);

        area = new JTextArea();

        JScrollPane jScrollPane = new JScrollPane(area);
        getContentPane().add(jScrollPane, BorderLayout.CENTER);


        button.addActionListener(new MyButtonListener());

        field = new JTextField();
        getContentPane().add(field, BorderLayout.NORTH);


    }

    private class MyButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String content = FileUtils.getFileContent(field.getText());
                area.setText(content);
            } catch (FileNotFoundException e1) {
                JOptionPane.showMessageDialog(MyFirstFrame.this, e1.getMessage());
            }
        }
    }


}
