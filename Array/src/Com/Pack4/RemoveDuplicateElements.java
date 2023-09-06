package Com.Pack4;

import java.util.Scanner;
public class RemoveDuplicateElements {
	
	public void meth(int arr[])
	{
		int i,j,n;
		n=arr.length;
		for( i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]='@';
				}
			}
			
		}
	for(i=0;i<n;i++)
	{
		if(arr[i]!='@')
			System.out.println(arr[i]+" ");
	}
			
	}
	public static void main(String[] args) {
		RemoveDuplicateElements obj=new RemoveDuplicateElements();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much elements u want ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.meth(arr);
		sc.close();
	}

}
