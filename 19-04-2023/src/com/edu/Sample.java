package com.edu;

class Student{
	String name;
	int score;
	String card;
	public Student(String name,int score){
		this.name = name;
		this.score = score;
	}
}
class Classroom{
	public String registerStudent(Student student) {
		String sname = student.name.toUpperCase();
		if(student.name.equals(sname))
		{
			 if(student.score>=0 && student.score<=100) {
				return "Registered";
			 }
			 else
				 return "Invalid Score";
			 }
		else
			return "Block letters needed";		
	}
	public String studentcard(String card) {
		boolean val = true;
		for(int i =0;i<card.length();i++) {
			if(!Character.isDigit(card.charAt(i))) {
				val = false;
				break;
			}
		}
		if(val==true)
			return "valid card";
		else
			return "invalid card";
		
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("A",6);
		Classroom cm = new Classroom();
		String result = cm.registerStudent(s1);
		String cresult = cm.studentcard("123nidh56");
		System.out.println(result);
		System.out.println(cresult);
	}

}
