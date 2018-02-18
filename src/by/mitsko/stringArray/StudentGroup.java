package by.mitsko.stringArray;

import java.util.Arrays;

public class StudentGroup {
	private Student[] students; // unlimited number of students
	private int studentsCount;
	private int i;
	private int j;
	int age;
	int sumAge = 0;
	int avgAge = 0;
	int count2015 = 0;
	int countYear = 0;

	public StudentGroup() {
	}


	public void addStudent(Student student) {
		if (this.students != null) {
			if (studentsCount < students.length) {
				students[studentsCount] = student;
				studentsCount++;
			} else {
				Student[] students = new Student[this.students.length + 1];
				for (i = 0; i < this.students.length; i++) {
					students[i] = this.students[i];
				}
				this.students = students;
				this.students[studentsCount] = student;
				studentsCount++;
			}
		} else {
			this.students = new Student[5];
			this.students[studentsCount] = student;
			studentsCount++;
		}
	}

	public void show() {
		System.out.println("==========StudentGroup========");
		for (i = 0; i < this.students.length; i++) {
			System.out.print(students[i].name + " " + students[i].surname + ", " + students[i].age + ", " + students[i].year);
			System.out.println();
		}
	}

	public void showAvgAge() {
		for (i = 0; i < this.students.length; i++) {
			sumAge = sumAge + students[i].age;
		}
		avgAge = sumAge / studentsCount;
		System.out.println("The avarege age of students in the group: "	+ avgAge);
	}

	public void count2015() {
		for (i = 0; i < this.students.length; i++) {
			if (students[i].year == 2015) {
				count2015++;
			}
		}
		System.out.println("The count of students that entered in the University in 2015: " + count2015);
	}

	
	
	public void  maxYear (){
		int count2013 = 0;
		int count2014 = 0;
		int count2015 = 0;
		int maxCount = 0;
		int maxYear = 0;
		for (i = 0; i < this.students.length; i++) {
			if (students[i].year == 2013){
				count2013++;
			}
			if (students[i].year == 2014){
				count2014++;
			}
			if (students[i].year == 2015){
				count2015++;
		}
			
		}
	    System.out.println("The count of new students in 2013: " + count2013);
	    System.out.println("The count of new students in 2014: " + count2014);
	    System.out.println("The count of new students in 2015: " + count2015);
        
       
	}
	
	public void selectionSort() {
			for (int i = 0; i < this.students.length; i++) {
			int min = students[i].age;
			int min_i = i;
			for (int j = i + 1; j < this.students.length; j++){
				if (students[j].age < min) {
				  min = students[j].age;
				  min_i = j;
			      if (i != min_i) {
				     Student tmp = students[i];
				     students[i] = students[min_i];
				     students[min_i] = tmp;
						}
	}
}
}
	}
	public void bubbleSort (){
		for (int i =  this.students.length-1; i > 0; i--) {
			for (int j = 0; j<i; j++) { 
				if (students[j].age > students[j+1].age){
					Student tmp = students[j];
					students[j] = students[j+1];
					students[j+1] = tmp;
				}
			
			}
			
		}
}
public void insertSort (){
		
		for (int i = 0; i < this.students.length-1; i++){
			if (students[i].age > students[i+1].age){
				Student tmp = students[i+1];
				students[i+1] = students[i];
				j=i;
				while (j > 0 &&  tmp.age < students[j-1].age) {
				students[j] = students[j-1];
				j--;
				}
			students[j] = tmp;	
			}
		}
	}
	
	public  void quickSort (){
		int startI = 0;
		int endI = this.students.length-1;
		doSort (startI, endI);
	}
	private  void doSort(int start, int end){
		if (start >= end)
			return;
			int i = start, j = end;
			int cur = i - (i - j)/2;
			while (i < j) {
			  while (i < cur && students[i].age <= students[cur].age) {
				  i++;
			  }
			  while (j >cur && students[cur].age <= students[j].age) {
				  j--;
			  }
			 if (i<j){
				 Student tmp = students[i];
				 students[i] = students[j];
				 students[j] = tmp;
				 if (i == cur)
					 cur = j; 
				 else if (j == cur) 
						 cur = i;
					 }
			 }
				 doSort (start, cur);
				 doSort (cur+1, end);
			 }
	}

	
	

