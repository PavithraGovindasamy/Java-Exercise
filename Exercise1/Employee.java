package packing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author pavithra Employee class which creates object for result class and get
 *         the variables
 *
 */
public class Employee {
	public static void main(String[] args) throws IOException {
		Result res = new Result();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		res.name = in.readLine();
		System.out.println("Enter rollno");
		res.rollno = Integer.parseInt(in.readLine());
		System.out.println("Enter marks for each subject");
      	res.sub1 = Integer.parseInt(in.readLine());
		res.sub2 = Integer.parseInt(in.readLine());
		res.sub3 = Integer.parseInt(in.readLine());
		System.out.println("Total marks" + res.result());

	}
}

/**
 * 
 * @author pavithra Student Class which get basic details of student and
 *         implements a method
 *
 */
class Student {
	String name;
	int rollno;
	static int sub1 = 50;

	public void Examwrite() {
		System.out.println("Exam starts");
	}

}

/**
 * 
 * @author pavithra Exam which get marks for three subject
 *
 */
class Exam extends Student {

	static int sub1 = 12;
	int sub2;
	int sub3;

	public void method() {
		Student stud = new Student();
		stud.Examwrite();
		System.out.println("Getting marks");

	}
}

/**
 * 
 * @author pavithra Result class which return the total
 *
 */
class Result extends Exam {
	public String total;

	public int result() {
		int total = sub1 + sub2 + sub3;
		Exam Exam1 = new Exam();
		System.out.println(sub1);
		System.out.println(Exam1.sub1);
		System.out.println(Exam.sub1);
		System.out.println(super.sub1);
		Exam1.method();
		return total;

	}
}
