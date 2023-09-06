package Pack1;

public class EvenAndOdd {
	public void meth()
	{
		int a[]= {10,20,45,52,51};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]+" Even number ");
			else System.out.println(a[i]+" Odd number ");
		}
	
	}
	void meth2()
	{
		int a[]= {12,52,46,85,4,8,1,42,424,2,5};
		System.out.print("Even elements : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(+a[i]+" ");
		}
		System.out.println();
		System.out.print("Odd elements : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
				System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		EvenAndOdd obj=new EvenAndOdd();
		obj.meth();
		obj.meth2();
	}

}
