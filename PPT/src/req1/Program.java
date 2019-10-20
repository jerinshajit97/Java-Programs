package req1;

import java.util.List;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) throws NumberFormatException, ParseException 
	{
		Scanner sc=new Scanner(System.in);
		List<Slide> sl=new ArrayList<Slide>();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		for (int i = 0; i < 2; i++)
		{
			System.out.println("Enter slide "+(i+1)+" details");
			String de=sc.nextLine();
			Slide s1=new Slide(Integer.parseInt(de.split(",")[0]),
					de.split(",")[1],
					de.split(",")[2],
					de.split(",")[3],
		            df.parse(de.split(",")[4]));
			sl.add(s1);
		}
		int i=1;
		for(Slide s:sl)
		{
			System.out.println("Slide "+1+":");
			System.out.println(s.toString());
			i++;
		}
		if (sl.get(0).equals(sl.get(1)))
		{
			System.out.println("Slide 1 is same as Slide 2");
		}
		else
		{
			System.out.println("Slide 1 and Slide 2 are different");
		}
	}
}
