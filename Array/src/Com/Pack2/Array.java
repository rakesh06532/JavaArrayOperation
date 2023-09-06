package Com.Pack2;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
	public void m1()
	{
	int a[]= {12,45,52,36};
	int b[]= {10,52,22,55};
	int c=a.length+b.length;
	int d[]=new int [c];
	for(int i=0;i<a.length;i++)
	{
		d[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		d[i+b.length]=b[i];
	}
	//for(int x:d)
		
	System.out.print(Arrays.toString(d));
}
	public void m2()
	{
		System.out.println("Enter how many element you want to store : ");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int arr[]=new int [length];
		System.out.println("The length of array is : "+arr.length);
		System.out.println("please enter "+length+" elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Data entered");
	
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.println(arr[i-1]);
		}
		sc.close();
	}
		 void m3()
		{
			int array[]=new int ['a'];
			
			System.out.println("Size of array is : "+array.length);
		
	    }
		 int [] m4(int input[])
		 {
			 for(int x:input)
			 System.out.print(x+" ");
			 return input;
		 }
		 void m5()
		 {
			 int a[]= {1,2,5,8};int sum=0;
			 for(int i=0;i<a.length;i++)
			 {
				 sum=sum+a[i];
			 }
			 System.out.println(sum);
		 }
		 int [] m6()
		 {
			 int a[]= {45,25,85,36,12};
			 System.out.print("Original data is : ");
			 System.out.println();
			 for(int o:a)
				System.out.print(o+" ");
			 System.out.println();
			 System.out.println("===============================");
			 for(int i=0;i<a.length;i++) {
				 int tmp=0;
				 
				 for(int j=i+1;j<a.length;j++)
				 {
					 if(a[i]>a[j]) 
					 {
						 tmp=a[i];
					 a[i]=a[j];
					 a[j]=tmp;
					 }//if
				 }//inner for loop
				 System.out.println((i+1)+" Step shorted data");
				 for(int x:a)
					 System.out.print(x+" ");
				 System.out.println();
			 }//outer for loop
			 
			 return a;
		 }
		 
	public static void main(String[] args) {
		Array a=new Array();
		//a.m1();
		//a.m2();
		//a.m3();
//		int input[]= {10,20,30};
//		int res[]=a.m4(input);
//		for(int x:res)
//			System.out.println(x);
		//a.m5();
		int res[]=a.m6();
		System.out.println("=================================");
		System.out.println("After shorting data ");
		for(int x:res)
		System.out.print(x+" ");
		System.out.println();
		System.out.println("==================================");
		System.out.println("smallest element is : "+res[0]);
		System.out.println("Largest element is : "+res[res.length-1]);
		
	}

}
