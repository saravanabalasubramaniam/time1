import java.io.*;
import java.util.*;
class Time
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the minutes:");
	long min1=input.nextInt();
	long hr1=min1/60;
	long minute1=min1%60; 
	System.out.println("the time in hours is:"+hr1+" "+minute1+"hrs");
        System.out.println("enter the minutes:");
        long min2=input.nextInt();
	long hr2=min2/60;
	long minute2=min2%60;
	System.out.println("the time in hours is:"+hr2+" "+minute2+"hrs");
	long hr=hr1-hr2;
	long minute=minute1-minute2;
	System.out.println("the time in hours is:"+hr+" "+minute+"hrs"); 
	}
}
