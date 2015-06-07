package ua.team.view;

import ua.team.controller.IContactController;
import ua.team.model.Contact;
import ua.team.model.Sex;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditContactFrame extends JFrame {

    private IContactController contactController;
    private JTextField nameTextField;
    private JTextField ageTextField;
    private ButtonGroup sexButtonsGroup;
    private Contact currentContact;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField phoneTextField;
    private JTextField addressTextField;


    public EditContactFrame(IContactController contactController, Contact currentContact){
        this.contactController = contactController;
        this.currentContact = currentContact;
        setTitle("Edit Contact");
        setSize(600,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init() {

        JPanel infoPanel = new JPanel(new GridLayout(5,2));

        JLabel nameLabel = new JLabel("name");
        nameTextField = new JTextField();
        infoPanel.add(nameLabel);
        infoPanel.add(nameTextField);

        JLabel ageLabel = new JLabel("age");
        ageTextField = new JTextField();
        infoPanel.add(ageLabel);
        infoPanel.add(ageTextField);


        JLabel sexLabel = new JLabel("sex");
        infoPanel.add(sexLabel);

        maleRadioButton = new JRadioButton("Male",true);
        femaleRadioButton = new JRadioButton("Female");
        // grouping radios
        sexButtonsGroup = new ButtonGroup();
        sexButtonsGroup.add(maleRadioButton);
        sexButtonsGroup.add(femaleRadioButton);

        // add panle to radios
        JPanel sexRadioPanel = new JPanel(new GridLayout(1,2));
        sexRadioPanel.add(maleRadioButton);
        sexRadioPanel.add(femaleRadioButton);
        infoPanel.add(sexRadioPanel);

        JLabel phoneLabel = new JLabel("phone");
        phoneTextField = new JTextField();
        infoPanel.add(phoneLabel);
        infoPanel.add(phoneTextField);

        JLabel addressLabel = new JLabel("address");
        addressTextField = new JTextField();
        infoPanel.add(addressLabel);
        infoPanel.add(addressTextField);



        JButton saveButton = new JButton("SAVE");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // prepare data, validation
                String name = nameTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());
                Sex sex = maleRadioButton.isSelected() ? Sex.MALE : Sex.FEMALE;
                String address = addressTextField.getText();
                String phone = phoneTextField.getText();
                // wrapp into Contact
                Contact contact = new Contact(name, age, sex, phone, address);

                // call controller method
                contactController.addNew(contact);

                // close frame
                EditContactFrame.this.dispose();
            }
        });

        getContentPane().add(infoPanel, BorderLayout.CENTER);
        getContentPane().add(saveButton, BorderLayout.SOUTH);


        renderIfEditing();


    }

    private void renderIfEditing(){
        if(currentContact != null){
            nameTextField.setText(currentContact.getName());
            ageTextField.setText(currentContact.getAge() + "");

            if(currentContact.getSex() == Sex.MALE){
                maleRadioButton.setSelected(true);
            } else {
                femaleRadioButton.setSelected(true);
            }

            phoneTextField.setText(currentContact.getPhone());

            addressTextField.setText(currentContact.getAddress());

        }
    }



}
