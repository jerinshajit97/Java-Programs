package req4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) throws NumberFormatException, ParseException
	{
		Scanner sc=new Scanner(System.in);
		SlideBO sb=new SlideBO();
		List<Slide> sl=new ArrayList<Slide>();
		System.out.println("Enter the number of slides:");
		int n=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) 
		{
			String de=sc.nextLine();
			sl.add(Slide.CreateSlide(de));
		}
		System.out.println("Enter a search type:\n1.By Layout Type\n2.By Created Time");
		int ch=Integer.parseInt(sc.nextLine());
		switch (ch) 
		{
		case 1:
		{
			System.out.println("Enter the Layout Type:");
			String t=sc.nextLine();
			List<Slide> s=sb.FindSlide(sl, t);
			System.out.format("%-10s %-15s %-30s %-20s %-10s\n", "Number" ,"Name" ,"Content" ,"Layotu type" ,"Cerated time" );
			for (Slide slide : s) 
			{
				System.out.println(slide.toString());
			}
			break;
		}
		case 2:
		{
			SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			System.out.println("Enter the Created Time:");
			Date d=df.parse(sc.nextLine());
			List<Slide> s=sb.FindSlide(sl, d);
			System.out.format("%-10s %-15s %-30s %-20s %-10s\n", "Number" ,"Name" ,"Content" ,"Layotu type" ,"Cerated time" );
			for (Slide slide : s) 
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
