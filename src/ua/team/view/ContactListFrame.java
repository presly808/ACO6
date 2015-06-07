package ua.team.view;

import javafx.scene.layout.BorderRepeat;
import ua.team.controller.IContactController;
import ua.team.model.Contact;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by serhii on 07.06.15.
 */
public class ContactListFrame extends JFrame {

    private IContactController contactController;
    private DefaultListModel<Contact> listModel;
    private JList<Contact> contactJList;

    public ContactListFrame(IContactController contactController){
        this.contactController = contactController;
        setTitle("Contact List");
        setSize(600,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init() {
        listModel = new DefaultListModel<>();
        contactJList = new JList<>(listModel);


        JPanel southButtonsPanel = new JPanel(new GridLayout(1,4));
        JButton addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditContactFrame(contactController, null);
            }
        });

        JButton delButton = new JButton("DELETE");
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contact selectedValue = contactJList.getSelectedValue();
                contactController.remove(selectedValue.getPhone());
                listModel.removeElement(selectedValue);
            }
        });
        JButton updateButton = new JButton("UPDATE");//
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditContactFrame(contactController,  contactJList.getSelectedValue());
            }
        });

        JButton updateContacListButton = new JButton("Update list");
        updateContacListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                renderContactList();
            }
        });

        southButtonsPanel.add(addButton);
        southButtonsPanel.add(delButton);
        southButtonsPanel.add(updateButton);
        southButtonsPanel.add(updateContacListButton);


        getContentPane().add(contactJList, BorderLayout.CENTER);
        getContentPane().add(southButtonsPanel, BorderLayout.SOUTH);


    }

    private void renderContactList(){
        listModel.clear();
        ArrayList<Contact> contacts = contactController.getAll();
        for (Contact contact : contacts) {
            listModel.addElement(contact);
        }
    }




}
