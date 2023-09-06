package Com.Pack2;


public class EvenAndOdd {
	public void meth()
	{
		int a[]= {12,45,85,74,96,85,7};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			
				System.out.print(a[i]+" ");	
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
			if(a[i]%2==1)
				System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		EvenAndOdd obj=new EvenAndOdd();
		obj.meth();;
	}

}
