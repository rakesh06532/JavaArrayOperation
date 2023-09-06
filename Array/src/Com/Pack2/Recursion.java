package Com.Pack2;

public class Recursion {
	
	public void meth(int a)
	{
		
		if(a<=0)
		{
			return;
		}
		else
		{
			meth(a-1);
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		Recursion obj=new Recursion();
		obj.meth(10);
		long arr[]=new long [9];
		long l=arr.length;
		System.out.println(l);
	}

}
