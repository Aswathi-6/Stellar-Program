package day3_program;

import java.util.Scanner;

public class Day3_Prog {

	public static void main(String[] args) {
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		for(int i=0;i<5;i++) {
//			System.out.print(a[i]+" ");//a[0],1,2,3,4
//		}

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();//n-size of the array
//		System.out.println("Enetr the size of the array");
//		int a[]=new int[n];
//		System.out.println("Enter the value of the array");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]+" ");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int  a[]=new int[n];
//		int sum=0;
//		System.out.println("Enter the value of the array");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//			sum=sum+a[i];
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Sum of the array: ");

		//minimum//maximum
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		int max=0;
//		int min=0;
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		max=arr[0];
//		min=arr[0];
//		for(int i=0;i>n;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			
//		}
//		for(int i=0;i<n;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println("Maximum value of an array: "+max);
//		System.out.println("minimum "+min);
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			 arr[i]=sc.nextInt();
//		}
//		boolean visited[]=new boolean[n];
//		for(int i=0;i<n;i++) {
//			if(visited[i]==true) {
//				continue;
//			}
//			int count=1;
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					visited[j]=true;
//					count++;
//				}
//			}
//			System.out.println(arr[i]+" "+count);
//		}
				

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		boolean visited[]=new boolean[n];
//		for(int i=0;i<n;i++) {
//			for(j=i+1;j<n;j++) {
//			if(visited[i]==true) {
//				continue;
//			}
//			int count=1;
//			 
//				if(arr[i]==arr[j]) {
//					visited[j]=true;
//					count++;
//				
//			}
//		}
		
		
		//2d array
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				arr[i][j]=sc.nextInt();
//				if(i==j) {
//					sum=i+j;
//				}
//				
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(sum+" ");
//			}
//			System.out.println(" ");
//		}
//		
			
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				arr[i][j]=sc.nextInt();
//				
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i<=j)//lowest and upper triangle 
//				{
//					sum=sum+arr[i][j];
//				}
//			}
//		}
//		
//				System.out.print(sum+" ");
			
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				arr[i][j]=sc.nextInt();
//				
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				sum=sum+(arr[i][j]*arr[i][j]);
//			}
//		}
//		int a=(int)Math.sqrt(sum);
//		System.out.print(a);
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int c=0;
//		int arr[][]=new int[n][n];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j) {
//				if(arr[i][j]>=18&&arr[i][j]<=60) {
//				c++;	
//				}
//			}
//			}
//		}
//		System.out.print(c);
	}

}
