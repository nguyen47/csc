package csc.model;
public class Receiver
{
    private String receiverName;
    private String address;
    private String contactNumber;
    private String courierNumber;


    public Receiver()
    {
    }

    public Receiver(String receiverName)
    {
        this.receiverName=receiverName;
    }

    public void setReceiverName(String receiverName)
    {
        this.receiverName=receiverName;
    }

    public String getReceiverName()
    {
        return receiverName;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getAddress()
    {
        return address;
    }

    public void setCourierNumber(
 				String courierNumber)
    {
        this.courierNumber=courierNumber;
    }

    public String getCourierNumber()
    {
        return courierNumber;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber=contactNumber;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public String toString()
    {
	   String s; 		// should use StringBuffer
	   s = "Receiver[";
	   s = s+"receiverName="+receiverName+", ";
	   s = s+"address="+address+", ";
	   s = s+"contactNumber="+contactNumber+", ";
	   s = s+"courierNumber="+courierNumber+"]";
       return s;
    }

}
