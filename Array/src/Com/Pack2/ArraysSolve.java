package Com.Pack2;

public class ArraysSolve {
	public void getResult(int arr[])
	{
		int arr1=2*arr.length;
		int arr2[]=new int [arr1-2];
		for(int res:arr2)
		{
			
			System.out.println(res);
		}
		System.out.println(arr[arr.length-2]+"\n"+arr[arr.length-1]);
	}
	public static void main(String R[] ) {
		ArraysSolve obj=new ArraysSolve();
		int arr[]= {1,2,5,3,2};
		
		obj.getResult(arr);
	}

}
