package lab.mvc.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
public class Person {

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
	
	   public boolean validate()
	   {
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 		LocalDate formatDate = LocalDate.parse(bday,formatter);
		   if(formatDate.getYear()>1990)
		   {
			   return true;
		   }else
		   {
			   return false;
		   }
	   }
	
	
}
