package Com.Pack4;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Method to find the maximum for each and every contiguous subarray of size K.

public class SubarrayUptoKSize {
	public void findMax(int arr[],int n,int k)
	{
		for(int i=0;i<=n-k;i++)
		{
			int max=arr[i];
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
					max=arr[j];	
			}
	    	System.out.print(max+" ");
		}
	}
	public void prime(int num)
	{
		int flag=0;
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
				flag=1;	
		}
		if(flag==1)
			System.out.println("Not prime");
		else
		System.out.println("prime");
	}
	public void prime2(int num)
	{
		int count;
		for(int i=3;i<=num;i++)
		{
			count=0;
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
	}
	public void meth(String st)
	{
		
		char arr[]=st.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>=97)&&(arr[i]<=122))
				System.out.print(arr[i]);
		}
	}
	public void meth2(String st[])
	{
		for(String str:st)
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)>='a' && str.charAt(i)<='z')
					System.out.print(str.charAt(i));
			}
			System.out.print(" ");
		}
//		String st=Arrays.toString(str);
//		
//		for(int i=0;i<st.length();i++)
//		{
//			if(st.charAt(i)>=97 && st.charAt(i)<=122)
//				System.out.println(st.charAt(i));
//		}
		
	}
	public void meth3(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
             System.out.println(str.charAt(i));
		}
	}
	public void meth4()
	{
		List<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println(al.add(sc.nextInt()));
		}
		System.out.println(al);
		sc.close();
	}
	public void meth5(String st)
	{
		for(int i=0;i<st.length();i++)
		{
			if(!((st.charAt(i)>='A' && st.charAt(i)<='Z') || (st.charAt(i)>='a' && st.charAt(i)<='z')))
				System.out.println(st.charAt(i));
		}
	}
	public void meth6(String st)
	{
		String []str=st.split(" ");
		for(String str1:str)
		System.out.print(str1);
	}
	public static void main(String[] args) {
		SubarrayUptoKSize obj=new SubarrayUptoKSize();
		int arr[]= {10,2,3,4,5,6,7,8,9,10};
		int k=4;
		obj.findMax(arr,arr.length,k);
		//System.out.println();
		//obj.prime(17);
		//obj.prime2(25);
		//String st="fHraTREWO524fhf58z4BGjgYcVD";
		//obj.meth(st);
		//String str[]=new String[] {"ab54cPR","e45LUfg","78FLhij"};
		//obj.meth2(str);
		//obj.meth3("urieIUP54UieDS;");
		//obj.meth4();
		//obj.meth5("inhud4'lk./,KL=-");
		//obj.meth6("Remove space from string");
	}

}
