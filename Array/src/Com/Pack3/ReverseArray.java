package Com.Pack3;

public class ReverseArray {
	public void Array(int a[] )
	{
		
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+" ");
		}
	}
	public void meth(String s)
	{
		String st="";
		for(int i=s.length()-1;i>=0;i--)
		{
			st=st+s.charAt(i);
			
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		ReverseArray obj=new ReverseArray();
		int arr[]= {10,20,30,40,50,60};
		obj.Array(arr);
		obj.meth("Java");
				
	}

}
