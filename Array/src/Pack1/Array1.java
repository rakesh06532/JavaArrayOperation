package Pack1;
import java.util.Scanner;
public class Array1 {
	public void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you want to store ");
		int data=sc.nextInt();
		int arr[]=new int[data];
		System.out.println("Length of array is "+arr.length);
		System.out.println("Please enter "+arr.length + " element");
		for(int i=0;i<arr.length;i++)
			
			arr[i]=sc.nextInt();
		System.out.println("Data entered ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("----------------------");
		System.out.println("Reverse order ");
		for(int i=arr.length-2;i>=1;i--)
		System.out.println(arr[i]);
		System.out.println("------------ For each --------------");
		for(int x:arr)
			System.out.println(x);
		sc.close();
	}
	public static void main(String []args)
	{
		Array1 obj=new Array1();
		obj.meth1();
	}

}
