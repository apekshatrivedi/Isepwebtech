package isep.lab1.bean;

public class Person implements java.io.Serializable{

	
	private String firstname  ;
	private String lastname ;
	private String bday;
	private String gender;
	  

	   
	   public void setfirstname(String value)
	   {
		   
	     firstname=value;
	   }
	   
	   
	   public void setlastname(String value)
	   {
	     lastname=value;
	   }
	   
	   public void setbday(String value)
	   {
	     bday=value;
	   }
	   
	   public void setgender(String value)
	   {
	     gender=value;
	   }
	  
	   public String getfirstname() { return firstname;}
	   
	   public String getlastname() { return lastname;}
	   
	   public String getbday() { return bday;}
	   
	   public String getgender() { return gender;}
	   
}
