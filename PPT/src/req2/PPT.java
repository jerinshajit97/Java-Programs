package req2;

import java.util.List;

public class PPT 
{
	private String name;
	private List<Slide> sl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Slide> getSl() {
		return sl;
	}
	public void setSl(List<Slide> sl) {
		this.sl = sl;
	}
	public PPT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PPT(String name, List<Slide> sl) {
		super();
		this.name = name;
		this.sl = sl;
	}
	
	public void AddSlideToPPT(Slide slide)
	{
	  this.sl.add(slide);	
	}
	
	public boolean RemoveSlide(int number) 
	{
		for(Slide s:this.sl)//loop each slide from slide list
		{
			if (s.getNumber()==number) 
			{
				return this.sl.remove(s);
			}
		}
		return false;
	}
	
	public void DisplaySlides()
	{
		if (this.sl.isEmpty())//when no slides in list
		{
			System.out.println("No slides to show");
		}
		else
		{
			System.out.format("%-10s %-15s %-30s %-20s %-10s\n", "Number" ,"Name" ,"Content" ,"Layotu type" ,"Cerated time" );
			for(Slide s:this.sl)//print all slide in list
			{
				System.out.println(s.toString());
			}
		}
	}
}
