package csc;
import csc.view.*;
import csc.model.*;
import csc.controller.*;
import javax.swing.*;
import java.awt.Font;

public class CSCApp extends JFrame
{
    private ReceiverList receiverList;
    private ReceiverController receiverController;
	private View receiverView;
	
	private SenderList senderList;
    private SenderController senderController;
    private View senderView;

    public CSCApp ()
    {
		super("Courier Service Company(CSC) System");
		this.setFont(View.generalFont);

		receiverList = new ReceiverList();
    	receiverController = new ReceiverController();
    	receiverController.setModel(receiverList);
    	receiverView = new ReceiverView(receiverList, receiverController);
   		JTabbedPane tabbedPane = new JTabbedPane();
   		tabbedPane.setFont(View.generalFont);
  	    tabbedPane.addTab("Receiver Management System", null, receiverView,"");
  	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	    getContentPane().add(tabbedPane);
  	    pack();
		setVisible(true);
		  
    	senderList = new senderList();
    	senderController = new SenderController();
    	senderController.setModel(senderList);
    	senderView = new SenderView(senderList, senderController);
   		JTabbedPane tabbedPane = new JTabbedPane();
   		tabbedPane.setFont(View.generalFont);
  	    tabbedPane.addTab("Sender Management System", null, senderView,"");
  	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	    getContentPane().add(tabbedPane);
  	    pack();
  	    setVisible(true);
    }

    public static void main (String[] args)
    {
    	new CSCApp();
    }
}
