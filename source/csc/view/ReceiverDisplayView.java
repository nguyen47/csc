package csc.view;

import csc.view.View;
import csc.model.Receiver;
import csc.model.ReceiverList;
import csc.controller.ReceiverController;
import javax.swing.*;
import java.awt.*;

public class ReceiverDisplayView  extends View {
	private JPanel contents;
    private final static int SIZE=20;
    private JLabel receiverNameLabel = new JLabel("Receiver Name");
    private JLabel addressLabel = new JLabel("Receiver Address");
    private JLabel contactNumberLabel = new JLabel("Contact Number");
    private JLabel courierNumberLabel = new JLabel("Courier Number");
    private JLabel countLabel = new JLabel("Count");
    private JTextField countTextField = new JTextField(SIZE);

    public ReceiverDisplayView(ReceiverList model, ReceiverController controller)
    {
        super (model, controller);
		receiverNameLabel.setFont(View.labelFont);
		addressLabel.setFont(View.labelFont);
		contactNumberLabel.setFont(View.labelFont);
		courierNumberLabel.setFont(View.labelFont);
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
		ReceiverList model = (ReceiverList)getModel();
		contents = new JPanel();
		contents.setLayout(new GridLayout(0,4));
		contents.add(receiverNameLabel);
		contents.add(addressLabel);
		contents.add(contactNumberLabel);
		contents.add(courierNumberLabel);
		JTextField tf;

		for (Receiver p:  model.getAll())
		{

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(p.getReceiverName());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(p.getAddress());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(p.getContactNumber());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setFont(View.fieldFont);
			tf.setText(p.getCourierNumber());
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
