package Com.Pack2;

public class SumEvenAndSumOdd {
	public void SumEven()
	{
		int Sum=0,Sum2=0,count=0,count2=0;
		int a[]= {10,20,21,33,22,3};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				
				System.out.print(a[i]+" ");
				Sum=Sum+a[i];
				count++;
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.print(a[i]+" ");
				Sum2=Sum2+a[i];
				count2++;
			}
			
		}
		System.out.println();
		System.out.println("Sum of Even : "+Sum+" and "+count+" even element");
		System.out.println("Sum of Odd : "+Sum2+" and "+count2+" odd element");
	}
	public static void main(String[] args) {
		SumEvenAndSumOdd obj=new SumEvenAndSumOdd();
		obj.SumEven();
	}

}
