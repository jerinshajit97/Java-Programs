package req6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		Map<String, Integer>m2=Slide.CalculateLayoutCount(sl);
		System.out.format("%-20s %-10s\n", "Layout type","Count");
		for (Entry<String, Integer> e : m2.entrySet())
		{
			System.out.format("%-20s %-10s\n", e.getKey(),e.getValue());
		}
		
	}
}
