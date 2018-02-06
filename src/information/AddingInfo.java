package information;

import java.util.HashMap;
import java.util.Map;

public class AddingInfo {
	
	public static Map<StudentInfo, StudentInfo> getMapOfStudents() 
	{
        Map<StudentInfo, StudentInfo> studentMap = new HashMap<StudentInfo, StudentInfo>();
        
        StudentInfo student1 = new StudentInfo();
        student1.setStudentName("AmritaSahoo");
        student1.setStudentAge(25);
        student1.setStudentSection("A");
        
        StudentInfo student2 = new StudentInfo();
        student2.setStudentName("Akanksha Sarkar");
        student2.setStudentAge(25);
        student2.setStudentSection("C");
        
        StudentInfo student3 = new StudentInfo();
        student3.setStudentName("Sumit Boro");
        student3.setStudentAge(26);
        student3.setStudentSection("C");
        
        StudentInfo student4 = new StudentInfo();
        student4.setStudentName("Vinay Aggarwal");
        student4.setStudentAge(26);
        student4.setStudentSection("A");

        StudentInfo student5 = new StudentInfo();
        student5.setStudentName("Vineet Aggarwal");
        student5.setStudentAge(24);
        student5.setStudentSection("B");
        
        StudentInfo student6 = new StudentInfo();
        student6.setStudentName("Abhishek Rastogi");
        student6.setStudentAge(26);
        student6.setStudentSection("C");

        StudentInfo student7 = new StudentInfo();
        student7.setStudentName("Karan Kapoor");
        student7.setStudentAge(26);
        student7.setStudentSection("B");
        
        StudentInfo student8 = new StudentInfo();
        student8.setStudentName("Niketh Dahiya");
        student8.setStudentAge(26);
        student8.setStudentSection("B");
        
        StudentInfo student9 = new StudentInfo();
        student9.setStudentName("Ankit Verma");
        student9.setStudentAge(26);
        student9.setStudentSection("C");

        StudentInfo student10 = new StudentInfo();
        student10.setStudentName("Arpit Kaushik");
        student10.setStudentAge(24);
        student10.setStudentSection("A");
        
        StudentInfo student11 = new StudentInfo();
        student11.setStudentName("Asif Ikball");
        student11.setStudentAge(24);
        student11.setStudentSection("A");
        
        StudentInfo student12 = new StudentInfo();
        student12.setStudentName("DivyaNair");
        student12.setStudentAge(24);
        student12.setStudentSection("C");
        
        StudentInfo student13 = new StudentInfo();
        student13.setStudentName("TwinkleMallik");
        student13.setStudentAge(25);
        student13.setStudentSection("A");
        
        StudentInfo student14 = new StudentInfo();
        student14.setStudentName("Amit Bishnoi");
        student14.setStudentAge(25);
        student14.setStudentSection("B");
        
        StudentInfo student15 = new StudentInfo();
        student15.setStudentName("Gurvinder Singh");
        student15.setStudentAge(25);
        student15.setStudentSection("B");
        
        studentMap.put(student1, student1);
        studentMap.put(student2, student2);
        studentMap.put(student3, student3);
        studentMap.put(student4, student4);
        studentMap.put(student5, student5);
        studentMap.put(student6, student6);
        studentMap.put(student7, student7);
        studentMap.put(student8, student8);
        studentMap.put(student9, student9);
        studentMap.put(student10, student10);
        studentMap.put(student11, student11);
        studentMap.put(student12, student12);
        studentMap.put(student13, student13);
        studentMap.put(student14, student14);
        studentMap.put(student15, student15);
        
        return studentMap;
        
	}

	
	public static Map<TeacherInfo, TeacherInfo> getMapOfTeachers() 
	{
        Map<TeacherInfo, TeacherInfo> teacherMap = new HashMap<TeacherInfo, TeacherInfo>();
        
        TeacherInfo teacher1 = new TeacherInfo();
        teacher1.setTeacherName("Siddharth Roy");
        teacher1.setTeacherSection("A");
        
        TeacherInfo teacher2 = new TeacherInfo();
        teacher2.setTeacherName("Asha Khan");
        teacher2.setTeacherSection("B");
                       
        TeacherInfo teacher3 = new TeacherInfo();
        teacher3.setTeacherName("Shubham Khatri");
        teacher3.setTeacherSection("C");
        
        teacherMap.put(teacher1, teacher1);
        teacherMap.put(teacher2, teacher2);
        teacherMap.put(teacher3, teacher3);
        
        return teacherMap;
        
	}
	
	public static Map<ScoreCard, ScoreCard> getMapOfScoreCard() 
	{
        Map<ScoreCard, ScoreCard> scoreCardMap = new HashMap<ScoreCard, ScoreCard>();
        
        ScoreCard scoreDetails1 = new ScoreCard();
        scoreDetails1.setMarksOfSubject1(89);
        scoreDetails1.setMarksOfSubject2(90);
        scoreDetails1.setMarksOfSubject3(90);
        scoreDetails1.setAverageMarks(89,90,90);
        scoreDetails1.setStudentName("Amrita Sahoo");
        
        ScoreCard scoreDetails2 = new ScoreCard();
        scoreDetails2.setMarksOfSubject1(82);
        scoreDetails2.setMarksOfSubject2(85);
        scoreDetails2.setMarksOfSubject3(86);
        scoreDetails2.setAverageMarks(82,85,86);
        scoreDetails2.setStudentName("Akanksha Sarkar");
        
        ScoreCard scoreDetails3 = new ScoreCard();
        scoreDetails3.setMarksOfSubject1(80);
        scoreDetails3.setMarksOfSubject2(80);
        scoreDetails3.setMarksOfSubject3(82); 
        scoreDetails3.setAverageMarks(80,80,82);
        scoreDetails3.setStudentName("Sumit Boro");
        
        ScoreCard scoreDetails4 = new ScoreCard();
        scoreDetails4.setMarksOfSubject1(80);
        scoreDetails4.setMarksOfSubject2(83);
        scoreDetails4.setMarksOfSubject3(84);
        scoreDetails4.setAverageMarks(80,83,84);
        scoreDetails4.setStudentName("Vinay Aggarwal");
        
        ScoreCard scoreDetails5 = new ScoreCard();
        scoreDetails5.setMarksOfSubject1(82);
        scoreDetails5.setMarksOfSubject2(84);
        scoreDetails5.setMarksOfSubject3(86);
        scoreDetails5.setAverageMarks(82,84,86);
        scoreDetails5.setStudentName("Vineet Aggarwal");
        
        ScoreCard scoreDetails6 = new ScoreCard();
        scoreDetails6.setMarksOfSubject1(82);
        scoreDetails6.setMarksOfSubject2(86);
        scoreDetails6.setMarksOfSubject3(89);
        scoreDetails6.setAverageMarks(82,86,89);
        scoreDetails6.setStudentName("Abhishek Rastogi");
        
        ScoreCard scoreDetails7 = new ScoreCard();
        scoreDetails7.setMarksOfSubject1(89);
        scoreDetails7.setMarksOfSubject2(82);
        scoreDetails7.setMarksOfSubject3(90);
        scoreDetails7.setAverageMarks(80,82,86);
        scoreDetails7.setStudentName("Karan Kapoor");
        
        ScoreCard scoreDetails8 = new ScoreCard();
        scoreDetails8.setMarksOfSubject1(85);
        scoreDetails8.setMarksOfSubject2(83);
        scoreDetails8.setMarksOfSubject3(82);
        scoreDetails8.setAverageMarks(85,83,82);
        scoreDetails8.setStudentName("Niketh Dahiya");
        
        ScoreCard scoreDetails9 = new ScoreCard();
        scoreDetails9.setMarksOfSubject1(80);
        scoreDetails9.setMarksOfSubject2(80);
        scoreDetails9.setMarksOfSubject3(85);
        scoreDetails9.setAverageMarks(80,80,85);
        scoreDetails9.setStudentName("Ankit Verma");
        
        ScoreCard scoreDetails10 = new ScoreCard();
        scoreDetails10.setMarksOfSubject1(92);
        scoreDetails10.setMarksOfSubject2(89);
        scoreDetails10.setMarksOfSubject3(91);
        scoreDetails10.setAverageMarks(92,89,91);
        scoreDetails10.setStudentName("Arpit Kaushik");
        
        ScoreCard scoreDetails11 = new ScoreCard();
        scoreDetails11.setMarksOfSubject1(89);
        scoreDetails11.setMarksOfSubject2(85);
        scoreDetails11.setMarksOfSubject3(92);
        scoreDetails11.setAverageMarks(89,85,92);
        scoreDetails11.setStudentName("Asif Ikball");
        
        ScoreCard scoreDetails12 = new ScoreCard();
        scoreDetails12.setMarksOfSubject1(82);
        scoreDetails12.setMarksOfSubject2(82);
        scoreDetails12.setMarksOfSubject3(87);
        scoreDetails12.setAverageMarks(82,82,87);
        scoreDetails12.setStudentName("DivyaNair");
        
        ScoreCard scoreDetails13 = new ScoreCard();
        scoreDetails13.setMarksOfSubject1(85);
        scoreDetails13.setMarksOfSubject2(90);
        scoreDetails13.setMarksOfSubject3(85);
        scoreDetails13.setAverageMarks(85,90,85);
        scoreDetails13.setStudentName("Twinkle Mallik");
        
        ScoreCard scoreDetails14 = new ScoreCard();
        scoreDetails14.setMarksOfSubject1(86);
        scoreDetails14.setMarksOfSubject2(88);
        scoreDetails14.setMarksOfSubject3(87);
        scoreDetails14.setAverageMarks(86,88,87);
        scoreDetails14.setStudentName("Amit Bishnoi");
       
        ScoreCard scoreDetails15 = new ScoreCard();
        scoreDetails15.setMarksOfSubject1(86);
        scoreDetails15.setMarksOfSubject2(88);
        scoreDetails15.setMarksOfSubject3(87);
        scoreDetails15.setAverageMarks(86,88,87);
        scoreDetails15.setStudentName("Gurvinder Singh");
       
        scoreCardMap.put(scoreDetails1, scoreDetails1);
        scoreCardMap.put(scoreDetails2, scoreDetails2);
        scoreCardMap.put(scoreDetails3, scoreDetails3);
        scoreCardMap.put(scoreDetails4, scoreDetails4);
        scoreCardMap.put(scoreDetails5, scoreDetails5);
        scoreCardMap.put(scoreDetails6, scoreDetails6);
        scoreCardMap.put(scoreDetails7, scoreDetails7);
        scoreCardMap.put(scoreDetails8, scoreDetails8);
        scoreCardMap.put(scoreDetails9, scoreDetails9);
        scoreCardMap.put(scoreDetails10, scoreDetails10);
        scoreCardMap.put(scoreDetails11, scoreDetails11);
        scoreCardMap.put(scoreDetails12, scoreDetails12);
        scoreCardMap.put(scoreDetails13, scoreDetails13);
        scoreCardMap.put(scoreDetails14, scoreDetails14);
        scoreCardMap.put(scoreDetails15, scoreDetails15);
        
        return scoreCardMap;
        
	}
}
