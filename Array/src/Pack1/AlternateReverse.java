package Pack1;

import java.util.Arrays;

public class AlternateReverse {
	public void meth()
	{
		int i,temp;
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for( i=0;i<arr.length/2;i++)
		{
		
			 temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;

		}
//		for(int x:arr)
//		{
//		System.out.println(x);
//		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void meth2()
	{
		System.out.println();
		int arr[]= {1,2,3,4,5,6,7,1,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					arr[i]='@';
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!='@')
				System.out.print(arr[i]+" ");
		}
	}
	public void meth3()
	{
		String st="Java";
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}
	}
	public static void main(String[] args) {
		AlternateReverse obj=new AlternateReverse();
		obj.meth();
		//obj.meth2();
		//obj.meth3();
	}

}
