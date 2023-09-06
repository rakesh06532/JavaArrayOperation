package Com.Pack2;

import java.util.Scanner;

public class SearchElement {
	public void ElementSearch()
	{
		int found=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How much element u want to store : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Please enter elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Please enter which element u want to search : ");
		int search=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element "+search+" found at "+i+" Index ");
				found=1;
			}
		}
		if(found==0)
			System.out.println("Element not found");
		sc.close();
	}
	public static void main(String[] args) {
		SearchElement a=new SearchElement();
		
		a.ElementSearch();
		
	}

}
