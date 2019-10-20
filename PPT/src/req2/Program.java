package req2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) throws NumberFormatException, ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the PPT:");
		String name=sc.nextLine();
		PPT p1=new PPT(name,new ArrayList<Slide>());
		int ch=0;
		do {
			System.out.println("1.Add Slide \n2.Delete Slide \n3.Display Slides \n4.Exit \nEnter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch (ch)
			{
			case 1:
			{
				String de=sc.nextLine();
				p1.AddSlideToPPT(Slide.CreateSlide(de));
				System.out.println("Slide successfully added");
				break;
			}
			case 2:
			{
				System.out.println("Enter the slide's number to be deleted:");
				int n=Integer.parseInt(sc.nextLine());
				if (p1.RemoveSlide(n)) 
				{
					System.out.println("Slide successfully deleted");
				} 
				else 
				{
					System.out.println("Slide not found in PPT");
				}
				break;
			}
			case 3:
			{
				p1.DisplaySlides();
				break;
			}
			case 4:
			{
				System.exit(0);
			}
				
			}
		} while (ch<5);
	}
}
