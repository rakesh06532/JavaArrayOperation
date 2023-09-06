package Com.Pack2;



public class SortElement {
	public int[] Element(int a[])
	{
		System.out.println("Original Data : ");
		
		for(int array:a)
		System.out.print(array+" ");
		System.out.println();
		System.out.println("====================================");
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
				
			}
			System.out.print((i+1)+" Sorted data : ");
			for(int x:a)
				System.out.print(x+" ");
			System.out.println();
		}
		return a;
	}
	public static void main(String[] args) {
		SortElement obj=new SortElement();
		int a[]= {10,5,4,6,4,8};
		int arr[]=obj.Element(a);
		System.out.println("\tFinaly Sorted Data  ");
		for(int res:arr)
		System.out.print(res+" ");
	}

}
