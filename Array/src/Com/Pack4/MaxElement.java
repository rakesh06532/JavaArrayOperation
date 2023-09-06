package Com.Pack4;

import java.util.Scanner;

public class MaxElement {
	public void meth1(int array[])
	{
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(max<array[i])
				max=array[i];
		}
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
				min=array[i];
		}
		System.out.print("minimum element "+min);
		System.out.println();
		System.out.print("Maximun element "+max);
		System.out.println();
		System.out.print("Difference of maximum and minimum element is : "+(max-min));
		System.out.println();
	}
	public void meth2(int array[])
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
			if(array[i]<min)
				min=array[i];
		}
		System.out.print("Maximum elements is : "+max);
		System.out.println();
		System.out.print("Minimum elements is : "+min);
		System.out.println();
		System.out.print("Difference of maximum and minimum is : "+(max-min));
	}
	public static void main(String[] args) {
		MaxElement obj=new MaxElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much element you want ");
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		obj.meth1(arr);
		obj.meth2(arr);
		sc.close();
	}

}
