package req3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ppt name:");
		String name=sc.nextLine();
		if(Program.isValid(name))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	
	public static boolean isValid(String name)
	{
		return Pattern.matches("[A-Z][a-zA-Z]{1,4}\\s{1}[a-zA-Z\\s]{10,}",name); //([A-Z][a-zA-Z]{1,3}\\s{1})&&([a-zA-Z\\s]{15,})
		
	}
}
