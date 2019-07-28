package csc.model;
import java.util.Observable;

public abstract class Model extends Observable
{
    public void changed()
    {
        setChanged();
        notifyObservers();
    }

    public abstract int getCount();

    public Model()
    {
    }
}
