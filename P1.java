package day5;

import java.util.Scanner;
         //INHERITANCE
class Person{
		String name;
		int age;
		Person(String Pname,int Page){
			this.name=Pname;
			this.age=Page;
		}
	void show() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	}
	class Student extends Person{
		String subject;
		Student(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
		}
		void show() {
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
//		void display() {
//		System.out.println("Name:"+name);
//		System.out.println("Age:"+age);
//		System.out.println("Subject:"+subject);
//	}
	}
   public class P1{
	   public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   String nam=sc.nextLine();
		   int ag=sc.nextInt();
		   sc.nextLine();
		   String sub=sc.nextLine();
		   Student stu=new Student(nam,ag,sub);
//		   stu.display();
		   stu.show();
	   }
   }
	
