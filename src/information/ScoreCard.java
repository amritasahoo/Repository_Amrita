package information;
/**
 * ScoreCard class is used to store the mark details of three subjects of the students
 * @author Amrita.Sahoo
 *
 */
public class ScoreCard {
	
	private String studentName;
	private int marksOfSubject1;
	private int marksOfSubject2;
	private int marksOfSubject3;
	private int averageMarks;
	
	public ScoreCard() {}
	
	public String getStudentName() 
	{
    return studentName;
	}
	
	public void setStudentName(String studentName) 
	{
    this.studentName = studentName;
	}
    
	public void setMarksOfSubject1(int marksOfSubject1)
	{
		this.marksOfSubject1 = marksOfSubject1;	
	}
	
	public int getMarksOfSubject1()
	{
		return marksOfSubject1;
	}
	
	public void setMarksOfSubject2(int marksOfSubject2)
	{
		this.marksOfSubject2 = marksOfSubject2;
		
	}
	
	public int getMarksOfSubject2()
	{
		return marksOfSubject2;
	}
	
	public void setMarksOfSubject3(int marksOfSubject3)
	{
		this.marksOfSubject3 = marksOfSubject3;
		
	}
	public int getMarksOfSubject3()
	{
		return marksOfSubject3;
	}
	
	public void setAverageMarks(int marksOfSubject1, int marksOfSubject2, int marksOfSubject3)
	{
		this.averageMarks = (marksOfSubject1 + marksOfSubject2 + marksOfSubject3)/3 ;
		
	}
	public int getAverageMarks()
	{
		return averageMarks;
	}
	
      
  }
