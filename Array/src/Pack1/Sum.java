package Pack1;

public class Sum {
	public int meth1()
	{
		int arr[]= {30,20,40};
		if(arr.length==0)
			return 0;
		else if(arr.length==1)
			return arr[0];
		else return arr[1]+arr[2];
	}
	public boolean meth2()
	{
		int arr2[]= {6,6,2,5};
		if((arr2[0]==6) || (arr2[arr2.length-1]==6))
		return true;
		return false;
	}
	public static void main(String[] args) {
		Sum obj=new Sum();
		int result=obj.meth1();
		boolean result2=obj.meth2();
		System.out.println("Sum of second and third index is = : "+result);
		System.out.println("Is the first or last index present 6 : "+result2);
	}

}
