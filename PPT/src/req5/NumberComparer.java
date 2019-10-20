package req5;

import java.util.Comparator;

public class NumberComparer implements Comparator<Slide>
{

	@Override
	public int compare(Slide arg0, Slide arg1) 
	{
		if (arg0.getNumber()==arg1.getNumber())
		{
			return 0;
		}
		else if(arg0.getNumber()>arg1.getNumber())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
