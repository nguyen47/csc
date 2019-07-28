package csc.model;
import java.util.*;


public class SenderList extends Model
{
    private List<Sender> receivers = new ArrayList<Sender>();

    public void add(Sender p)
    {
        senders.add(p);
        changed();
    }

    public List<Sender> getAll()
    {
        return senders;
    }

    public int getCount()
    {
		return senders.size();
	}

    public boolean invariant(){
        return senders != null;
    }
}
