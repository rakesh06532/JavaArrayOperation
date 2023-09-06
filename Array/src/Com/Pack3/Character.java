package Com.Pack3;

import java.util.Arrays;

 class Character {
	void meth(){
		int arr[]= {1,2,3,4,5,6,7};
		int a=9 ;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=1;j<=arr.length-1;j++)
		   {
				int h=arr[i]+arr[j];
				if(a==h)
			{
				System.out.println(i+ " "+j);
				System.out.println(h);		
			}
		   }
		}
		
	}
	 String meth2(int arr[],int target)
	{
		String result="";
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length-1;j++)
			{
				int k=arr[i]+arr[j];
				if(k==target)
				{	
				result=(i+" "+(j));	
				//System.out.println(Arrays.asList(result));
				
				}
			}
		}
		if(result=="")
			System.out.println("Not found");
		return result;
	}
	 void Arrays()
	{
		
		int a[]= {1,2,3,4,2};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count==2)
				System.out.println(a[i]);
		}
	}
	static void getLargestElement()
	{
		int arr[]= {44,6,8,45,20,10};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(max);
		System.out.println(min);
	}
	 static void getHCF()
	{
		int num1=12,num2=36;
		int hcf=1;
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
				hcf=i;
			
		}
		System.out.println(hcf);
	}
	static void getSecondSmallestElement()
	{
		int arr[]= {20,12,10,85,30,3,80};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		int sec_smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=smallest && arr[i]<sec_smallest)
				sec_smallest=arr[i];
		}
		System.out.println("Second smallest element is : "+sec_smallest);
	}
	static void getSecondElement()
	{
		int arr[]= {20,12,10,85,30,3,80};
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-2]);
		
	}
	 void halfAscending()
	{
		int arr[]= {12,20,10,85,30,3,80,15};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length/2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int j=arr.length/2;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	 void sort()
	{
		int arr[]= {12,20,10,85,30,3,80,15};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	 static void getFrequency()
	{
		int mc=0,c,majority=0;
		int arr[]= {1,2,1,5,4,6,2,1,3};
		for(int i=0;i<arr.length;i++)
		{
			c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					c++;
			}
			if(c>mc)
			{
				mc=c;
				majority=arr[i];
			}
		}
		System.out.println("Majority elements are : "+majority+" got "+mc+" times ");
	}
	 void getByFrequency()
	{
		int c,temp;
		int arr[]= {1,2,1,5,5,5,5,5,4,66,2,1,3,3,2,1,4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	for(int i=0;i<arr.length;i=i+c)
	{
		c=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				c++;
			}
		}
		System.out.println(arr[i]+" ==> "+c);
	}
		
	}
	 static void isaPalindrom(int num)
	{
		
		int temp=num,rem,sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(num==sum)
			System.out.println("Palindrom");
	}
	 static boolean isPalindrom(int num)
	{
		int temp=num,rem,sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(num==sum)
		return true;
		else return false;
	}
	 static void largestPalindrom()
	{
		int max=-1;
		int arr[]= {121,4582,45454,5246};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max && isPalindrom(arr[i]))
				max=arr[i];
		}
		System.out.println(max);
	}
	 static void repeatElement()
	 {
		 int arr[]= {3,4,2,1,7,6,2,4,5};
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
					arr[i]='@';
			 }
			 if(arr[i]!='@')
				 System.out.print(arr[i]+" "); 
		 }
		 
	 }
	 static void merge()
	 {
		 int arr1[]= {5,3,5,2,6,1};
		 int arr2[]= {4,54,3,55,2};
		 int arr[]= new int [arr1.length+arr2.length];
		 for(int i=0;i<arr1.length;i++)
		 {
			 arr[i]=arr1[i];
		 }
		 for(int i=0;i<arr2.length;i++)
		 {
			 arr[i+6]=arr2[i];
		 }
		 for(int x:arr)
		 System.out.print(x+" ");
	 }
	 static void duplicateElement()
	 {
		 
		 int arr[]= {3,4,2,1,7,6,2,4,5};
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 
					System.out.println(arr[i]); 
			 }
			 
		 }
	 }
	 static void nonRepeating()
	 {
	    int c;
		 int arr[]= {1,2,3,4,5,2,3};
		 for(int i=0;i<arr.length;i++)
		 {
	         c=0;
			 for(int j=0;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 c++;		
			 }
			 if(c==2) 
				 System.out.println(arr[i]);
			 
		 }
	 }
	public static void main(String[] args) {
		//new Character().meth();
	    //int arr[]=new int [] {1,2,3,4,5,6,6,4,5,9};
		//int number=9;
		//Character obj=new Character();
		//String result=obj.meth2(arr, number);
		//System.out.println(Arrays.asList(result));
		//new Character().Arrays();
		//getLargestElement();
		//getHCF();
		//getSecondSmallestElement();
		//getSecondElement();
		//obj.halfAscending();
		//obj.sort();
		//getFrequency();
		//obj.getByFrequency();
		//int num=45454;
		//isaPalindrom(num);
		//largestPalindrom();
		//repeatElement();
		//merge();
		//duplicateElement();
		nonRepeating();
	}
	

}
