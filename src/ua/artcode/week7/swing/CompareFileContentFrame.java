package ua.artcode.week7.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by serhii on 06.06.15.
 */
public class CompareFileContentFrame extends JFrame {


    public CompareFileContentFrame(){
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);

    }

    private void init() {
        // north panel init
        JPanel northPathsPanel = new JPanel(new GridLayout(1,2));

        JTextField pathTextField1 = new JTextField();
        JTextField pathTextField2 = new JTextField();

        northPathsPanel.add(pathTextField1);
        northPathsPanel.add(pathTextField2);


        // centre panel init
        JPanel centreAreasPanel = new JPanel(new GridLayout(1,2));
        JTextArea contentTextArea1 = new JTextArea();
        contentTextArea1.setBorder(BorderFactory.createLineBorder(Color.black));

        JTextArea contentTextArea2 = new JTextArea();
        contentTextArea2.setBorder(BorderFactory.createLineBorder(Color.black));
        centreAreasPanel.add(contentTextArea1);
        centreAreasPanel.add(contentTextArea2);


        // inti south panel
        JPanel mainSouthPanel = new JPanel(new GridLayout(2,1));

        JPanel searchPanel = new JPanel(new GridLayout(1,2));

        JTextField searchKeyTextField = new JTextField();
        JButton findButton = new JButton("FIND");

        searchPanel.add(searchKeyTextField);
        searchPanel.add(findButton);

        JPanel actionsPanel = new JPanel(new GridLayout(1,3));
        JButton loadButton = new JButton("Load");
        JButton saveButton = new JButton("Save");
        JButton checkButton = new JButton("Check");

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
}
