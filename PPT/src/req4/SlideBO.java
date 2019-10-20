package req4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SlideBO 
{
	public List<Slide> FindSlide(List<Slide> slideList,String type)
	{//This method accepts a list of slides and type as arguments and returns a list of slides that match with given type.
		List<Slide> sl=new ArrayList<Slide>();
		for (Slide slide : slideList) 
		{
			if(slide.getLayotuType().equals(type))
			{
				sl.add(slide);
			}
		}
		return sl;
	}
	
	public List<Slide> FindSlide(List<Slide> slideList,Date createdTime)
	{//This method accepts a list of slides and date arguments and returns a list of slides that match with given .
		List<Slide> sl=new ArrayList<Slide>();
		for (Slide slide : slideList) 
		{
			if(slide.getCeratedTime().equals(createdTime))
			{
				sl.add(slide);
			}
		}
		return sl;
	}
}
