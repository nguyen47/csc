package csc.model;
public class Sender
{
    private String senderName;
    private String email;
    private String contactNumber;
    private String courierNumber;
    private String sendDate;
    private String typeOfItem;
    private String courierCharge;


    public Sender()
    {
    }

    public Sender(String senderName)
    {
        this.senderName=senderName;
    }

    public void setSenderName(String senderName)
    {
        this.senderName=senderName;
    }

    public String getSenderName()
    {
        return senderName;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setCourierNumber(String courierNumber)
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

    public void setSendDate(String sendDate)
    {
        this.sendDate=sendDate;
    }

    public String getSendDate()
    {
        return sendDate;
    }

    public void setTypeOfItem(String typeOfItem)
    {
        this.typeOfItem=typeOfItem;
    }

    public String getTypeOfItem()
    {
        return typeOfItem;
    }

    public void setCourierCharge(String courierCharge)
    {
        this.courierCharge=courierCharge;
    }

    public String getCourierCharge()
    {
        return courierCharge;
    }

    public String toString()
    {
	   String s; 		// should use StringBuffer
	   s = "Sender[";
	   s = s+"senderName="+senderName+", ";
       s = s+"email="+email+", ";
       s = s+"sendDate="+sendDate+", ";
       s = s+"typeOfItem="+typeOfItem+", ";
       s = s+"courierCharge="+courierCharge+", ";
	   s = s+"contactNumber="+contactNumber+", ";
	   s = s+"courierNumber="+courierNumber+"]";
       return s;
    }

}
