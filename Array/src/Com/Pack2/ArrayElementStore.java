package Com.Pack2;

import java.util.Scanner;
public class ArrayElementStore {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many elements u want to store : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter "+n+" elements : "); 
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		System.out.print("Arrays elements are : ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();
		
	}

}
