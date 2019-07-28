package csc.controller;

import csc.model.Sender;
import csc.model.SenderList;

public class SenderController extends Controller
{
    public SenderController ()
    {
    }

    public void addSender(Sender sender)
    {
        SenderList model = (SenderList)getModel();
        model.add(sender);
    }
}
