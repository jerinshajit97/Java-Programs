package req5;

import java.util.Comparator;

public class CreatedTimeComparer implements Comparator<Slide>
{

	@Override
	public int compare(Slide o1, Slide o2)
	{
		// TODO Auto-generated method stub
		if(o1.getCeratedTime().equals(o2.getCeratedTime()))
		{
			return 0;
		}
		else if(o1.getCeratedTime().after(o2.getCeratedTime()))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
