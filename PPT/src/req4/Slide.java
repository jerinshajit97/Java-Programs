package req4;

import java.util.Date;
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
	{
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Slide s1=new Slide(Integer.parseInt(detail.split(",")[0]),
				detail.split(",")[1],
				detail.split(",")[2],
				detail.split(",")[3],
	            df.parse(detail.split(",")[4]));
		return s1;
	}	
}
