package csc.controller;

import csc.model.Receiver;
import csc.model.ReceiverList;

public class ReceiverController extends Controller
{
    public ReceiverController ()
    {
    }

    public void addReceiver(Receiver receiver)
    {
        ReceiverList model = (ReceiverList)getModel();
        model.add(receiver);
    }
}
