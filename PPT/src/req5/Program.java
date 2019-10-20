package req5;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) throws NumberFormatException, ParseException
	{
		Scanner sc=new Scanner(System.in);
		List<Slide>sl=new ArrayList<Slide>();
		System.out.println("Enter the number of the slides:");
		int n=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++)
		{
			String de=sc.nextLine();
			sl.add(Slide.CreateSlide(de));
		}
		System.out.println("Enter a type to sort:\n1.Sort by name\n" + 
				"2.Sort by number\n" + 
				"3.Sort by created time");
		int ch=Integer.parseInt(sc.nextLine());
		switch (ch)
		{
		case 1:
		{
			Collections.sort(sl);
			System.out.format("%-10s %-15s %-30s %-20s %-10s\n", "Number" ,"Name" ,"Content" ,"Layotu type" ,"Cerated time" );
			for (Slide slide : sl) 
			{
				System.out.println(slide.toString());
			}
			break;
		}
		case 2:
		{
			Collections.sort(sl, new NumberComparer());
			System.out.format("%-10s %-15s %-30s %-20s %-10s\n", "Number" ,"Name" ,"Content" ,"Layotu type" ,"Cerated time" );
			for (Slide slide : sl) 
			{
				System.out.println(slide.toString());
			}
			break;
		}
		case 3:
		{
			Collections.sort(sl, new CreatedTimeComparer());
			System.out.format("%-10s %-15s %-30s %-20s %-10s\n", "Number" ,"Name" ,"Content" ,"Layotu type" ,"Cerated time" );
			for (Slide slide : sl) 
			{
				System.out.println(slide.toString());
			}
			break;
		}
		
		default:
		{
			System.out.println("Invalid choice");
			break;
		}
		}
	}
}
