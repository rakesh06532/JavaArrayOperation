package Com.Pack2;

public class MaxAndMin {
	public int [] Element(int a[])
	{
		System.out.print("Original Element is : ");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		int min=Integer.MAX_VALUE ;
		System.out.println("Int max Range is : "+min);
		int max=Integer.MIN_VALUE;
		System.out.println("Int min Range is : "+max);
		for(int i=0;i<a.length;i++)
		{
		   if(a[i]>max)max=a[i];
		  
		   if(a[i]<min)min=a[i];
		}
		
		System.out.println("Largest Element is : "+max);
		System.out.println("Smallest Element is : "+min);
		System.out.println("Difference of max and min Element is : "+(max-min));
		return a;
	}
	public static void main(String[] args) {
		MaxAndMin obj=new MaxAndMin();
		int a[]= {5,8,6,1,9,600,7,3,1,8,90};
		obj.Element(a);
		
		
	}

}
