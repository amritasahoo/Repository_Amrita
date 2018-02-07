import java.util.*;

/**
 * TestEquals class is created to input, display the objects of student3 class
 * a List has been created to store info of students
 * @author Amrita.Sahoo
 *
 */
public class TestEquals {

		public static void main(String[] args) {
		
			Student3 student1 = new Student3(123,"Amrita",520);
			Student3 student2 = new Student3(124,"Ajay",520);
			Student3 student3 = new Student3(125,"Amrita",420);
			Student3 student4 = new Student3(125,"Ajay",250);

			List<Student3> studentList = new ArrayList<Student3>();
			studentList.add(student1);
			studentList.add(student2);
			studentList.add(student3);
			studentList.add(student4);
			
			Iterator<Student3> list =  studentList.iterator();
			
			while(list.hasNext())
			{
				try {
					list.next().validationInfo();
					
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
		}
	
		System.out.println("   ");

		
		Boolean b1 = student1.equals(student3);
		Boolean b2 = student2.equals(student3);
		Boolean b3 = student3.equals(student4);
		
		Student3.display(student1);
		Student3.display(student2);
		Student3.display(student3);
		Student3.display(student4);
		
		System.out.println("student1.equals(student3) : " + b1);
		System.out.println("student2.equals(student3) : " +b2);
		System.out.println("student3.equals(student4) : " + b3);
		

		}
		
	}

