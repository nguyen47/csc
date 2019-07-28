package csc.view;

import csc.view.View;
import csc.model.Receiver;
import csc.model.ReceiverList;
import csc.controller.ReceiverController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReceiverAddView  extends View {
    private final static int SIZE=20;
    private JTextField receiverNameField = new JTextField("Receiver Name", SIZE);
    private JTextField addressField = new JTextField("Receiver Address", SIZE);
    private JTextField contactNumberField = new JTextField("Contact Number", SIZE);
    private JTextField courierNumberField = new JTextField("Courier Number", SIZE);

    private JLabel receiverNameLabel = new JLabel("Receiver Name");
    private JLabel addressLabel = new JLabel("Receiver Address");
    private JLabel contactNumberLabel = new JLabel("Contact Number");
    private JLabel courierNumberLabel = new JLabel("Courier Number");
    private JButton addButton = new JButton ("Add Receiver");
    private JButton resetButton = new JButton ("Reset Receiver");


    public ReceiverAddView(ReceiverList model, ReceiverController controller)
    {
        super (model, controller);

		receiverNameLabel.setFont(View.labelFont);
		addressLabel.setFont(View.labelFont);
		contactNumberLabel.setFont(View.labelFont);
		courierNumberLabel.setFont(View.labelFont);
		addButton.setFont(View.buttonFont);
		resetButton.setFont(View.buttonFont);
		receiverNameField.setFont(View.fieldFont);
		addressField.setFont(View.fieldFont);
		contactNumberField.setFont(View.fieldFont);
		courierNumberField.setFont(View.fieldFont);

        setLayout(new GridLayout(0,2));
        add(receiverNameLabel); add(receiverNameField);
        add(addressLabel); add(addressField);
        add(contactNumberLabel); add(contactNumberField);
        add(courierNumberLabel); add(courierNumberField);
        add(addButton); add(resetButton);
        resetButton.addActionListener (
					new ActionListener ()
					{
						public void actionPerformed (ActionEvent e)
						{
							receiverNameField.setText("");
							addressField.setText("");
							contactNumberField.setText("");
							courierNumberField.setText("");
						}
					}
				);
		addButton.addActionListener (
					new ActionListener ()
					{
						public void actionPerformed (ActionEvent e)
						{
							String receiverName = receiverNameField.getText();
							String address = addressField.getText();
							String contactNumber = contactNumberField.getText();
							String courierNumber = courierNumberField.getText();
							Receiver p = new Receiver();
							p.setReceiverName(receiverName);
							p.setAddress(address);
							p.setContactNumber(contactNumber);
							p.setCourierNumber(courierNumber);
							ReceiverController controller = (ReceiverController) getController();
							controller.addReceiver(p);
							receiverNameField.setText("Receiver Name");
							addressField.setText("Receiver Address");
							contactNumberField.setText("Contact Number");
							courierNumberField.setText("Courier Number");
						}
					}
				);
    }
}
