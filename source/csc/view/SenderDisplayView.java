package csc.view;

import csc.view.View;
import csc.model.Sender;
import csc.model.SenderList;
import csc.controller.SenderController;
import javax.swing.*;
import java.awt.*;

public class SenderDisplayView  extends View {
	private JPanel contents;
    private final static int SIZE=20;
    private JLabel senderNameLabel = new JLabel("Sender Name");
    private JLabel emailLabel = new JLabel("Sender Email");
    private JLabel contactNumberLabel = new JLabel("Contact Number");
    private JLabel courierNumberLabel = new JLabel("Courier Number");
    private JLabel sendDateLabel = new JLabel("Send Date");
    private JLabel typeOfItemLabel = new JLabel("Type Of Item");
    private JLabel courierChargeLabel = new JLabel("Courier Charge");
    private JLabel countLabel = new JLabel("Count");
    private JTextField countTextField = new JTextField(SIZE);

    public SenderDisplayView(SenderList model, SenderController controller)
    {
        super (model, controller);
		senderNameLabel.setFont(View.labelFont);
		emailLabel.setFont(View.labelFont);
		contactNumberLabel.setFont(View.labelFont);
        courierNumberLabel.setFont(View.labelFont);
        sendDateLabel.setFont(View.labelFont);
        typeOfItemLabel.setFont(View.labelFont);
        courierChargeLabel.setFont(View.labelFont);
		countLabel.setFont(View.labelFont);
		countTextField.setFont(View.fieldFont);

        setLayout(new BorderLayout());
        displayContents();
        add(countLabel, BorderLayout.WEST);
        add(countTextField, BorderLayout.EAST);
        displayCount();
	}

	public void displayContents()
	{
		SenderList model = (SenderList)getModel();
		contents = new JPanel();
		contents.setLayout(new GridLayout(0,4));
		contents.add(senderNameLabel);
		contents.add(emailLabel);
		contents.add(contactNumberLabel);
        contents.add(courierNumberLabel);
        contents.add(sendDateLabel);
        contents.add(typeOfItemLabel);
        contents.add(courierChargeLabel);
		JTextField tf;

		for (Sender s:  model.getAll())
		{

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getSenderName());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getEmail());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getContactNumber());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getCourierNumber());
            contents.add(tf);
            
            tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getSendDate());
            contents.add(tf);
            
            tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getTypeOfItem());
            contents.add(tf);
            
            tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(s.getCourierCharge());
			contents.add(tf);
       	}
       	add(contents, BorderLayout.NORTH);
    }

    public void displayCount()
    {
		countTextField.setText(""+getModel().getCount());
	}

	public void update(java.util.Observable o, Object arg)
  	{
		remove(contents);
		displayContents();
		displayCount();
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.pack();
        topFrame.repaint();
    }
}
