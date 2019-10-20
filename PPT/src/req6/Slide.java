package req6;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Slide
{
	SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	private int number;
	private String name;
	private String content;
	private String layotuType;
	private Date ceratedTime;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLayotuType() {
		return layotuType;
	}
	public void setLayotuType(String layotuType) {
		this.layotuType = layotuType;
	}
	public Date getCeratedTime() {
		return ceratedTime;
	}
	public void setCeratedTime(Date ceratedTime) {
		this.ceratedTime = ceratedTime;
	}
	public Slide() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Slide(int number, String name, String content, String layotuType, Date ceratedTime) 
	{
		super();
		this.number = number;
		this.name = name;
		this.content = content;
		this.layotuType = layotuType;
		this.ceratedTime = ceratedTime;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-15s %-30s %-20s %-10s\n", number ,name ,content ,layotuType ,df.format(ceratedTime) );
	}
	
	public static Slide CreateSlide(String detail) throws NumberFormatException, ParseException
	{//This method accepts a String. The slide detail separated by commas is passed as the argument. Split the details and create a slide object and return it.
		
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Slide s1=new Slide(Integer.parseInt(detail.split(",")[0]),
				detail.split(",")[1],
				detail.split(",")[2],
				detail.split(",")[3],
	            df.parse(detail.split(",")[4]));
		return s1;
	}
	static Map<String, Integer> CalculateLayoutCount(List<Slide> list)
	{
		Map<String, Integer> m1=new TreeMap<String, Integer>();
		for (Slide slide : list) 
		{
			String s=slide.getLayotuType();
				if(m1.containsKey(s))
					{
						m1.put(s, m1.get(s)+1);
					}
				else
					{
						m1.put(s, 1);
					}
		}
		return m1;
	}
	
}
/*
8,Survey,Literature survey for papers,Blank,05-05-2017 12:00:00
14,References,website links,Blank,07-02-2018 11:50:30 
4,Conclusion,Inferences obtained,Title and content,01-01-2018 15:00:00
7,Requirement,Hardware and softwarereq,Comparison,20-03-2018 18:00:30
11,Progress,Progress Gnantt chart,Title and content,06-01-2018 12:12:00*/