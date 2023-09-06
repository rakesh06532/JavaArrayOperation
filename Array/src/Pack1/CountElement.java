package Pack1;

public class CountElement {
	public int meth()
	{
		int t=0;
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			t=t+a[i];
		}
		return t;
	}
	void meth2()
	{
		System.out.println("Method2() called : ");
		System.out.println("\tFor shorting element ");
		int a[]= {99,50,100,32,74};
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;	
			}
			System.out.println("==============================");
			for(int x:a)
			{
			System.out.print(x+" ");
			}
			System.out.println();
			}
			
		}
		System.out.println("Smallest element is : "+a[0]);
		System.out.println("Largest element is : "+a[a.length-1]);
		
	}
	public static void main(String[] args) {
		CountElement obj=new CountElement();
		int result=obj.meth();
		System.out.println("Count of element is : "+result);
		obj.meth2();
		
	}

}
