package simplestellar;

import java.util.Scanner;

public class Day1_pro1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
//		String s1=sc.next();
//		System.out.println(s+" and "+s1);
//		
//		int a=sc.nextInt();
//		System.out.println(a);
		
//		float f=sc.nextFloat();
//		System.out.printf("%.2f",f);
		
//		int a=sc.nextInt();
//		System.out.println((float)a);
		
//		char ch=sc.next().charAt(0);
//		System.out.println((int)ch);
//		
		
//		String s=sc.nextLine();
//		System.out.println("Hello "+s+" ! Welcome to Examly Mangement System ");

		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		double d=sc.nextDouble();
//		d=(double)d+a+b;
//		System.out.println(d);
		
//		String n=sc.nextLine();
//		String t=sc.nextLine();
//		int c=sc.nextInt();
//		char ch=sc.next().charAt(0);
//		double d=sc.nextDouble();
//		System.out.println("Event Name : "+n);
//		System.out.println("Event Type : "+t);
//		System.out.println("Expected Count : "+c);
//		System.out.println("paid : "+ch);
//		System.out.println("Event expance :"+d);
//		
		
//		String n=sc.nextLine();
//		int a=sc.nextInt();
//		System.out.println(n+" age is "+a);
		
//		int m=sc.nextInt();
//		int n=sc.nextInt();
//		int m1=sc.nextInt();
//	
//		int n1=sc.nextInt();
//		
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		int m2=m1+m;
//		int n2=n1+n;
//		int totalapple=m+m2;
//		int totalorange=n+n1;
//		int remapple=totalapple-x;
//		int remorange=totalorange-y;
//		System.out.println(remapple);
//		System.out.println(remorange);
		
//		int weekday=80;
//		int weekend=50;
//		
//		int amount=sc.nextInt();
//		
//		int amount1=amount-(80*10);
//		int a=amount1/(weekday+weekend);
//		System.out.println(a);
//		System.out.println(a+10);
//	
		
		
//		int s=sc.nextInt();
//	   double area=((Math.sqrt(3)/4)*s*s);
//	   System.out.printf("%.2f",area);
//		
		
		
//		
//		double s=end-start;
//		double start=13505.2;
//		double end=13810.6;
//		System.out.println(String.format("%.2f",s));
//		System.out.println((int)(s*25));
//				
		
		
		int cash=sc.nextInt();
		int sum=0;
		
		sum=cash/100;
		cash=cash%100;
		
		sum+=cash/50;
		cash=cash%50;
		
		sum+=cash/10;
		cash=cash%10;
		
		sum+=cash/5;
		cash=cash%5;
		
		sum+=cash/2;
		cash=cash%2;
		
		sum+=cash/1;
		cash=cash%1;
		
		System.out.println(sum);
			
		
	}

}