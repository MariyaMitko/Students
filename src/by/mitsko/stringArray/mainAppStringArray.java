package by.mitsko.stringArray;



public class mainAppStringArray {

	public static void main(String[] args) {
		
		Student st1 = new Student("Ivan", "Petrov", 22, 2013);
		Student st2 = new Student("Inna", "Gromova", 21, 2014);
		Student st3 = new Student("Oleg", "Belov", 23, 2013);
		Student st4 = new Student("Anna", "Ivanova", 25, 2013);
		Student st5 = new Student("Olga", "Orlova", 22, 2015);
		Student st6 = new Student("Irina", "Romanova", 20, 2015);
		StudentGroup stG = new StudentGroup();
		
		
		stG.addStudent (st1);
		stG.addStudent (st2);
		stG.addStudent (st3);
		stG.addStudent (st4);
		stG.addStudent (st5);
		stG.addStudent (st6);
		stG.show();
		stG.showAvgAge();
		stG.count2015();
		
		
		//stG.selectionSort();
				
	    //stG.bubbleSort();
	   		
		//stG.insertSort();
		
		//stG.quickSort(); 
		
     	//stG.show();
	
		//stG.maxYear();
		
		
		 
		
		
}
}