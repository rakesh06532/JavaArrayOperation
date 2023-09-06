package Com.Pack4;

public class Merge {
	public void meth(int a[],int b[])
	{
		int arr3[]=new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			arr3[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			arr3[i+5]=b[i];
		}
		for(int i=0;i<arr3.length;i++)
			
		{
			System.out.print(arr3[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Merge obj=new Merge();
		int arr1[]=new int[]{10,20,30,40,50};
		int arr2[]=new int [] {60,70,80,90,100};
		 
		obj.meth(arr1, arr2);
	}

}
