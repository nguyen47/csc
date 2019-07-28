package csc.view;

import csc.view.View;
import csc.model.Sender;
import csc.model.SenderList;
import csc.controller.SenderController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SenderAddView extends View {
    private final static int SIZE = 20;
    private JTextField senderNameField = new JTextField("Sender Name", SIZE);
    private JTextField emailField = new JTextField("Sender Email", SIZE);
    private JTextField contactNumberField = new JTextField("Contact Number", SIZE);
    private JTextField courierNumberField = new JTextField("Courier Number", SIZE);
    private JTextField sendDateField = new JTextField("Send Date", SIZE);
    private JTextField typeOfItemField = new JTextField("Type Of Item", SIZE);
    private JTextField courierChargeField = new JTextField("Courier Charge", SIZE);

    private JLabel senderNameLabel = new JLabel("Sender Name");
    private JLabel emailLabel = new JLabel("Sender Address");
    private JLabel contactNumberLabel = new JLabel("Contact Number");
    private JLabel courierNumberLabel = new JLabel("Courier Number");
    private JLabel sendDateLabel = new JLabel("Send Date");
    private JLabel typeOfItemLabel = new JLabel("Type Of Item");
    private JLabel courierChargeLabel = new JLabel("Courier Charge");

    private JButton addButton = new JButton("Add Sender");
    private JButton resetButton = new JButton("Reset Sender");


    public SenderAddView(SenderList model, SenderController controller) {
        super(model, controller);

        senderNameLabel.setFont(View.labelFont);
        emailLabel.setFont(View.labelFont);
        contactNumberLabel.setFont(View.labelFont);
        courierNumberLabel.setFont(View.labelFont);
        sendDateLabel.setFont(View.labelFont);
        typeOfItemLabel.setFont(View.labelFont);
        courierChargeLabel.setFont(View.labelFont);
        addButton.setFont(View.buttonFont);
        resetButton.setFont(View.buttonFont);
        senderNameField.setFont(View.fieldFont);
        emailField.setFont(View.fieldFont);
        contactNumberField.setFont(View.fieldFont);
        courierNumberField.setFont(View.fieldFont);
        sendDateField.setFont(View.fieldFont);
        typeOfItemField.setFont(View.fieldFont);
        courierChargeField.setFont(View.fieldFont);

        setLayout(new GridLayout(0, 2));
        add(senderNameLabel);
        add(senderNameField);
        add(emailLabel);
        add(emailField);
        add(contactNumberLabel);
        add(contactNumberField);
        add(courierNumberLabel);
        add(courierNumberField);
        add(sendDateLabel);
        add(sendDateField);
        add(typeOfItemLabel);
        add(typeOfItemField);
        add(courierChargeLabel);
        add(courierChargeField);
        add(addButton);
        add(resetButton);
        resetButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    senderNameField.setText("");
                    emailField.setText("");
                    contactNumberField.setText("");
                    courierNumberField.setText("");
                    sendDateField.setText("");
                    typeOfItemField.setText("");
                    courierChargeField.setText("");
                }
            }
        );
        addButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String senderName = senderNameField.getText();
                    String email = emailField.getText();
                    String contactNumber = contactNumberField.getText();
                    String courierNumber = courierNumberField.getText();
                    String sendDate = sendDateField.getText();
                    String typeOfItem = typeOfItemField.getText();
                    String courierCharge = courierChargeField.getText();
                    Sender s = new Sender();
                    s.setSenderName(SenderName);
                    s.setEmail(email);
                    s.setContactNumber(contactNumber);
                    s.setCourierNumber(courierNumber);
                    s.setsendDate(sendDate);
                    s.settypeOfItem(typeOfItem);
                    s.setcourierCharge(courierCharge);
                    SenderController controller = (SenderController) getController();
                    controller.addSender(s);
                    senderNameField.setText("Sender Name");
                    emailField.setText("Sender Email");
                    contactNumberField.setText("Contact Number");
                    courierNumberField.setText("Courier Number");
                    sendDateField.setText("Send Date");
                    typeOfItemField.setText("Type Of Item");
                    courierChargeField.setText("Courier Charge");
                }
            }
        );
    }
}