package Pack1;

public class count {
	
	public boolean meth1(int []arr)
	{
		
			if(arr[0] != 2 && arr[0] != 3 && arr[1] !=2 && arr[1] !=3)
				 return true;
			     return false;
		
	}
	public static void main(String[] args) {
		count aobj=new count();
		int arr[]= {2,30};
		boolean result=aobj.meth1(arr);
		System.out.println(result);
		
	}

}
