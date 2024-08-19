//program to find the frequency of character in a string
//PUNNYA S NAIR
//Roll no:50
import java.util.*;
class frequency
{
	public static void main(String args[])
		{  
		   int count=0;
			Scanner S=new Scanner(System.in);
			System.out.println("Enter String");
			String s1;
			s1=S.nextLine();
			s1.toLowerCase();
			System.out.println("Enter the character to check");
		   char c= S.next().charAt(0);
		   int n=s1.length();
		   for(int i=0;i<n;i++)
		   {
		   	if(s1.charAt(i)== c)
		   	{
		   	 
		   	
		   		count++;
		   	
		   	}
		   }
		   System.out.println("The frequency is"+count);
		   S.close();
		   }
}
