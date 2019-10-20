package req1;

import java.util.Date;
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
		return "Number:" + number + "\nName:" + name + "\nContent:" + content + "\nLayotuType:" + layotuType
				+"\nCeratedTime:" + df.format(ceratedTime)+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slide other = (Slide) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	
}
