package csc.model;
import java.util.*;


public class ReceiverList extends Model
{
    private List<Receiver> receivers = new ArrayList<Receiver>();

    public void add(Receiver p)
    {
        receivers.add(p);
        changed();
    }

    public List<Receiver> getAll()
    {
        return receivers;
    }

    public int getCount()
    {
		return receivers.size();
	}

    public boolean invariant(){
        return receivers != null;
    }
}
