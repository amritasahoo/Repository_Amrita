package information;

import java.util.Comparator;

public class ComparingAverage implements Comparator<Integer>{
		 
	    @Override
	    public int compare(Integer averageMarks1, Integer averageMarks2)
	    {
	        if(averageMarks2 > averageMarks1)
	        {
	            return 1;
	        } 
	        else 
	        {
	            return -1;
	        }
	    }
	}


