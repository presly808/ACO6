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
public class CompareFileContentFrame extends JFrame {


    private JTextField pathTextField1;
    private JTextField pathTextField2;
    private JTextArea contentTextArea1;
    private JTextArea contentTextArea2;
    private JTextField searchKeyTextField;
    private JButton findButton;
    private JButton loadButton;
    private JButton saveButton;
    private JButton checkButton;

    public CompareFileContentFrame(){
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);

    }

    private void init() {
        // north panel init
        JPanel northPathsPanel = new JPanel(new GridLayout(1,2));

        pathTextField1 = new JTextField();
        pathTextField2 = new JTextField();

        northPathsPanel.add(pathTextField1);
        northPathsPanel.add(pathTextField2);


        // centre panel init
        JPanel centreAreasPanel = new JPanel(new GridLayout(1,2));
        contentTextArea1 = new JTextArea();

        contentTextArea1.setBorder(BorderFactory.createLineBorder(Color.black));

        contentTextArea2 = new JTextArea();
        contentTextArea2.setBorder(BorderFactory.createLineBorder(Color.black));
        centreAreasPanel.add(contentTextArea1);
        centreAreasPanel.add(contentTextArea2);


        // inti south panel
        JPanel mainSouthPanel = new JPanel(new GridLayout(2,1));

        JPanel searchPanel = new JPanel(new GridLayout(1,2));

        searchKeyTextField = new JTextField();
        findButton = new JButton("FIND");
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        searchPanel.add(searchKeyTextField);
        searchPanel.add(findButton);

        JPanel actionsPanel = new JPanel(new GridLayout(1,3));
        loadButton = new JButton("Load");
        loadButton.addActionListener(new LoadButtonListener());

        saveButton = new JButton("Save");
        checkButton = new JButton("Check");

        actionsPanel.add(loadButton);
        actionsPanel.add(saveButton);
        actionsPanel.add(checkButton);

        mainSouthPanel.add(searchPanel);
        mainSouthPanel.add(actionsPanel);


        // add to main frame content
        getContentPane().add(northPathsPanel, BorderLayout.NORTH);
        getContentPane().add(centreAreasPanel, BorderLayout.CENTER);
        getContentPane().add(mainSouthPanel, BorderLayout.SOUTH);


    }

    /*private String highLighFoundText(String text, String key){
        String res = "";
        String[] parts = text.split(key);
        for(int i = 0; i < parts.length - 1; i++){
            res += parts[i] + addHtmlStyle(key);
        }

        res += parts[parts.length-1];

        return res;
    }

    private String addHtmlStyle(String word){
        return String.format("<html><b>%s</b></html>", word);
    }
*/


    private class LoadButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String text1 = FileUtils.getFileContent(pathTextField1.getText());
                contentTextArea1.setText(text1);
                String text2 = FileUtils.getFileContent(pathTextField2.getText());
                contentTextArea2.setText(text2);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }
}
