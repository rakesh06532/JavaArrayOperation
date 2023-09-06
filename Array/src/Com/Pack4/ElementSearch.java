package Com.Pack4;

import java.util.Scanner;

public class ElementSearch {
	public void Element(int arr[])
	{
		System.out.println("which element u want to search ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				System.out.println("Fount element is "+arr[i]+" in "+i+" index");
			flag=1;
			}

		}
		if(flag==0)
			System.out.println("Element not found ");
		sc.close();
		
	}
	public static void main(String[] args) {
		ElementSearch obj=new ElementSearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much elements u want ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		obj.Element(arr);
		sc.close();
	}

}
