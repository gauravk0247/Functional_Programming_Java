package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {
	List<Integer> listOfMark = new ArrayList();
	listOfMark.add(90);
	listOfMark.add(30);
	listOfMark.add(60);
	listOfMark.add(50);
	listOfMark.add(32);
	// 1st way --
//	Consumer<Integer> con = (marks)->{
//		System.out.println(marks);
//	};
//	listOfMark.forEach(con);
	
	// 2nd way --> optimized way
//	listOfMark.forEach(m->System.out.println(m));
	
	
	// --> Converting list into stream
//	Stream<Integer> s = listOfMark.stream();
//	s.forEach(marks->System.out.println("Marks is "+":"+" "+marks));
	
	// Q. print all the marks of student who got >=35
	/*Predicate<Integer> pred = (m)->{
		if(m>=35) {
			return true;
		}
		return false;
	};
//	listOfMark.stream().filter(pred).forEach(marks->System.out.println(marks));
	
	listOfMark.stream().filter(m->m>=35).forEach(m1->System.out.println(m1));*/
	
	
	// Q.i want to count number passed student and fail student.
	/*int passStudents = (int) listOfMark.stream().filter(marks->marks>=35).count();
	System.out.println("The number of passStudent "+" "+passStudents);
	int failStudent = (int) listOfMark.stream().filter(marks->marks<35).count();
	System.out.println("The number of failStudent "+" "+failStudent);*/
	
	
	// Q. I want sort the marks in Asc and Desc
	/*Comparator<Integer> cmp = (p1, p2)->{
		if(p1>p2) {
			return 1;
		}
		return -1;
	};
	listOfMark.stream().sorted(cmp).forEach(m->System.out.println(m));*/
	
	// Q. How many even numbers and how many odd numbers are there
	/*Predicate<Integer> pred = (m)->{
		if(m%2==0) {
			return true;
		}
		return false;
	};
	int evenCount=(int) listOfMark.stream().filter(pred).count();
	int oddCount=(int) listOfMark.stream().filter(n ->n%2==1).count();
	System.out.println(evenCount+" "+oddCount);*/
	
	
	// Q. i want to findout student who got highest marks & lowest marks.
	/*Comparator<Integer> cmp = (mark1, mark2)->{
		if(mark1>mark2) {
			return 1;
		}
		return -1;
	};
	int maxMarks = listOfMark.stream().max(cmp).get();
	System.out.println(maxMarks);*/
	
	// Q. i want to findout student who got lowest marks & lowest marks.
	/*Comparator<Integer> cmp = (mark1, mark2)->{
		if(mark1>mark2) {
			return 1;
		}
		return -1;
	};
	int minMark = listOfMark.stream().min(cmp).get();
	System.out.println(minMark);*/
	
	// Operation - 5 I want to count total marks
	/*System.out.println("Calculating total marks");
	int sum = 0;
	for(int i=0;i<listOfMark.size();i++) {
		int marks = listOfMark.get(i);
		sum = sum+marks;
	}
	System.out.println(sum);*/
	
	
	// Using Stream we want to calculate
	/*int total = listOfMark.stream().reduce(0, (num, m) -> num+m);
	System.out.println("Total marks is "+" "+total);*/
	
	
	// Operation-6 . I want to filter those student who get marks >=30 and i will give 5 grace marks for those students.
	// Traditional Approach
	/*List<Integer> listOfGrace = new ArrayList();
	for(int i=0;i<listOfGrace.size();i++) {
		int marks = listOfMark.get(i);
		if(marks>=30 && marks<35) {
			int res = marks+5;
			listOfGrace.add(res);
		}
	}
	System.out.println(listOfGrace);*/
	/*
	System.out.println("Calculating grace marks using stream api");
	listOfMark.stream().filter(mr->mr>=30 && mr<35).map(m->m+5).forEach(m->System.out.println(m));*/
	
	listOfMark.stream().filter(mr->mr>=30 && mr<35).map(m->{
		int graceMarks = m+5;
		String msg = "Grace marks for "+m+" is "+graceMarks;
		return msg;
	}).forEach(m->System.out.println(m));
	}
}