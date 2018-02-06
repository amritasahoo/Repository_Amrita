package information;

import java.util.*;
import java.util.Map.Entry;
/**
 * RecordsComparison class is created to provide the list of students selected out of 15 students as per the eligibility criteria
 * @author Amrita.Sahoo
 *
 */
public class RecordsComparison {
	/**
	 * main method to start the execution
	 * @param args not used  
	 */
	public static void main(String[] args){
				
		Map<TeacherInfo,TeacherInfo> teacherInfo = AddingInfo.getMapOfTeachers();
		Map<StudentInfo,StudentInfo> studentInfo = AddingInfo.getMapOfStudents();
		Map<ScoreCard, ScoreCard> scoreCardInfo= AddingInfo.getMapOfScoreCard();
		
		
		//assigning the scoreCard details to respective students
		StudentInfo.assigningScoreCard(studentInfo, scoreCardInfo );
		StudentInfo.assigningTeacherName(studentInfo,teacherInfo);
						
		// new MAp created to store average marks as keys and student details
		Map<Integer,List<StudentInfo>> studentDetailsMap = new HashMap<Integer,List<StudentInfo>>();
		
		//List<StudentInfo> studentInfoValues = new ArrayList<StudentInfo>(studentInfoTreeMap.values());
		
		// storing unique average marks in a HashSet
		Set<Integer> studentAverageMarksSet = new HashSet<Integer>();
		
		//adding unique average marks to the set
		for(Map.Entry<StudentInfo, StudentInfo> studentInfoMap : studentInfo.entrySet())
		{
			StudentInfo studentInfoMapKey = studentInfoMap.getKey();
			studentAverageMarksSet.add(studentInfoMapKey.averageMarks);
			
		}
						
		//creating a map with key as average marks(in a Set) and value as StudentInfo details
		for(Integer averageMarksSet : studentAverageMarksSet)
		{
			List<StudentInfo> studentFinalList = new ArrayList<StudentInfo>();

			for(Map.Entry<StudentInfo, StudentInfo> studentInfoMap : studentInfo.entrySet())
				{
					StudentInfo StudentInfoKey = studentInfoMap.getKey();
			
					if(StudentInfoKey.averageMarks == (averageMarksSet ))
					{
					studentFinalList.add(StudentInfoKey);
					}
					
				}
			    studentDetailsMap.put(averageMarksSet, studentFinalList);
			
		  }
		/**
		 * sortedStudentTreeMap TreeMap holds the details of students sorted based on decreasing order order of average Marks
		 */
		Map<Integer,List<StudentInfo>> sortedStudentTreeMap = new TreeMap<Integer,List<StudentInfo>>(new ComparingAverage());
		sortedStudentTreeMap.putAll(studentDetailsMap);
			
		RecordsComparison.displayingStudentFinalList(sortedStudentTreeMap);	
			
	}

	/**
	 * displayingStudentFinalList is a method used to display the final selected list of students and their respective information
	 * @param studentDetailsMap is of Map type
	 */
	public static void displayingStudentFinalList(Map<Integer, List<StudentInfo>> studentDetailsMap)	
	{

		int count = 1;
		System.out.println("Details of Selected Students  :"+"\n"+"*****************************" );
		for(Map.Entry<Integer, List<StudentInfo>> studentInfoMap : studentDetailsMap.entrySet())
		 {
			if (count <6)
			{
				int key = studentInfoMap.getKey();
				List<StudentInfo> value = studentInfoMap.getValue();
				for(StudentInfo studentValue : value)
				{
					String studentNameAfterSplit = studentValue.getStudentName().replaceAll(" ", "");
					for(int index = 1; index < studentNameAfterSplit.length(); index++) 
					{
						if(Character.isUpperCase(studentNameAfterSplit.charAt(index)))
						{
							studentNameAfterSplit = studentNameAfterSplit.substring(0, index) + " " +
			                      studentNameAfterSplit.substring(index, studentNameAfterSplit.length());
							break;
						}
					}				
					System.out.println("Name :" +studentNameAfterSplit );
					System.out.println("Age  :" +studentValue.getStudentAge() );
					System.out.println("Section :" +studentValue.getStudentSection());
					System.out.println("Teacher Name : " + studentValue.teacherName);	
					System.out.println("Average Marks : " + key);
					System.out.println("Rank : " + count);
					System.out.println("============================");
			
				}
				
			}
			count++;
	  }	
	
	}
}
	
	


		 
