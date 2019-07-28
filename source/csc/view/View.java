package csc.view;

import csc.model.Model;
import csc.controller.Controller;
import java.util.Observer;
import java.awt.Font;
import javax.swing.*;

public class View extends JPanel implements Observer {

    private Model model;
    private Controller controller;
    private JFrame frame;

    public static Font generalFont = new Font("Courier New", Font.BOLD, 24);
    public static Font buttonFont = new Font("Courier New", Font.ITALIC|Font.BOLD, 24);
    public static Font labelFont = new Font("Courier New", Font.BOLD, 24);
  	public static Font fieldFont = new Font("Arial", Font.PLAIN, 24);

    public Model getModel()
    {
  	   return model;
    }

    public JFrame getFrame()
	{
	  	   return frame;
    }

	public void  setFrame(JFrame frame)
	{
	   this.frame=frame;
	}



    public Controller getController()
    {
  	   return controller;
    }

    public View(Model model, Controller controller)
    {
        this.model = model;
        model.addObserver(this);
        this.controller = controller;
        controller.setView(this);
    }

  	public void update(java.util.Observable o, Object arg)
  	{

    }
}
