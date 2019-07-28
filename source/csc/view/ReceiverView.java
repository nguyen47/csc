package csc.view;
import csc.view.View;
import csc.view.ReceiverAddView;
import csc.view.ReceiverDisplayView;
import csc.model.ReceiverList;
import csc.controller.ReceiverController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReceiverView  extends View
{
    private JButton addButton = new JButton ("Add");
    private JButton displayButton = new JButton ("Display");
    private ReceiverAddView addView;
    private ReceiverDisplayView displayView;

    private JPanel cards = new JPanel(new CardLayout());
    private JPanel buttons = new JPanel();
    private static final String ADD = "ADD";
    private static final String DISPLAY = "DISPLAY";

    public ReceiverView(ReceiverList model, ReceiverController controller)
    {
		super (model, controller);
		addView=new ReceiverAddView(model,controller);
		displayView=new ReceiverDisplayView(model,controller);

		addButton.setFont(View.buttonFont);
		displayButton.setFont(View.buttonFont);

		buttons.add(addButton);
		buttons.add(displayButton);

        setLayout(new BorderLayout());

        add(buttons, BorderLayout.NORTH);
		add(new JLabel(""), BorderLayout.CENTER);
		cards.add(displayView, DISPLAY);
		cards.add(addView, ADD);
		add(cards, BorderLayout.SOUTH);

		showAddView();

        addButton.addActionListener(
					new ActionListener ()
	 				{
						public void actionPerformed (ActionEvent e)
						{
							showAddView();
						}
					}
		);

       	displayButton.addActionListener(
					new ActionListener ()
	 				{
						public void actionPerformed (ActionEvent e)
						{
							showDisplayView();
						}
					}
		);
	}

	private void showAddView()
	{
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, ADD);
	}

	private void showDisplayView()
	{
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, DISPLAY);
	}
}
