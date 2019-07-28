package csc.view;
import csc.view.View;
import csc.view.SenderAddView;
import csc.view.SenderDisplayView;
import csc.model.SenderList;
import csc.controller.SenderController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SenderView extends View {
    private JButton addButton = new JButton("Add");
    private JButton displayButton = new JButton("Display");
    private SenderAddView addView;
    private SenderDisplayView displayView;

    private JPanel cards = new JPanel(new CardLayout());
    private JPanel buttons = new JPanel();
    private static final String ADD = "ADD";
    private static final String DISPLAY = "DISPLAY";

    public SenderView(SenderList model, SenderController controller) {
        super(model, controller);
        addView = new SenderAddView(model, controller);
        displayView = new SenderDisplayView(model, controller);

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
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    showAddView();
                }
            }
        );

        displayButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    showDisplayView();
                }
            }
        );
    }

    private void showAddView() {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, ADD);
    }

    private void showDisplayView() {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, DISPLAY);
    }
}