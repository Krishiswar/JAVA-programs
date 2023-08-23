
import java.io.*;
class leap
 {  
    public static void LeapYear(int year)
    {
       
        boolean leap_year = false;
  
        if (year % 4 == 0)
	 {
            leap_year = true;
        if (year % 100 == 0) 
	 {
         if (year % 400 == 0)
            leap_year = true;
         else
            leap_year = false;
         }
        }
	 else
  
           leap_year = false;
  
        if (!leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
  
   
    public static void main(String[] args)
    {
       
        LeapYear(2000);
  
        
        LeapYear(2002);
    }
}